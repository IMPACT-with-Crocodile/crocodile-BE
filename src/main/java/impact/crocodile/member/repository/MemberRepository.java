package impact.crocodile.member.repository;

import impact.crocodile.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /**
     * JPA를 이용해서 함수를 만들어보세요. ex) member의 가입 ID로 해당 유저의 정보 가져오기.
     * 딱 1줄만 써도 된다는 놀라운 사실 !!
     */
}
