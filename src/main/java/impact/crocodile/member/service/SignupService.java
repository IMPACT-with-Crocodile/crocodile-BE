package impact.crocodile.member.service;

import impact.crocodile.member.dto.ReqSignupDto;
import impact.crocodile.member.entity.Member;
import impact.crocodile.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class SignupService {

    /**
     * 채워넣으시오 !!
     * 패스워드 인코더란 ?
     */

    public Member memberSignup(ReqSignupDto reqSignupDto) {
                /**
                 * 채워넣으시오!!!
                 */
    }
}