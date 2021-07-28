package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JdbcTemplateMemberRepository implements MemberRepository{

    private final JdbcTemplate jdbcTemplate;/*얘는 인젝션을 받을 수 있는게 아님. 데이터소스를 인젝션 받아라*/

    /*@Autowired*/
    public JdbcTemplateMemberRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource); /*생성자가 하나만 있으면 @Autowired를 생략할 수 있다*/
    }

    @Override/*저장?*/
    public Member save(Member member) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate); /*SimpleJdbcInsert는 그냥 tablename과 keycolumn만 넣으면 쿼리를 짤 필요가 없다*/
        jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id"); /*이걸로 insert문 만들 수 있잖아*/

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", member.getName());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters)); /*executeAndReturnKey로 key를 받고*/
        member.setId(key.longValue()); /*setId로 key.longValue()를 넣어준다*/
        return member;
    }

    @Override/*id조회*/
    public Optional<Member> findById(Long id) {
        List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(),id);
        return result.stream().findAny();

    }

    @Override/*이름 조회*/
    public Optional<Member> findByName(String name) {
        List<Member> result = jdbcTemplate.query("select * from member where name=?", memberRowMapper(),name);
        return result.stream().findAny();
    }

    @Override/*싹다 조회*/
    public List<Member> findAll() {
        return jdbcTemplate.query("select * from member", memberRowMapper());

    }

    private RowMapper<Member> memberRowMapper(){
        return (rs, rowNum) -> {
            Member member= new Member();
            member.setId(rs.getLong("id"));/*result대신 여기로 넘어온다*/
            member.setName(rs.getString("name"));
            return member;
        };
    }
}
