package hello.hellospring.domain;

import javax.persistence.*;

@Entity //JPA가 관리하는 엔티티
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 자동 생성
    private Long id;
    
    //@Column(name="username")//DB의 username을 여기서 name과 매핑
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
