package com.quiz.learningman.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class MemberDto {
    @NotBlank(message = "필수 입력 사항입니다.")
    private String name;

    @Email(message = "이메일 형식이 유효하지 않습니다.")
    @NotEmpty(message = "필수 입력 사항입니다.")
    private String email;

    @NotEmpty(message = "비밀번호 형식이 유효하지 않습니다.")
    @Length(min = 4, max = 16)
    private String password;
}
