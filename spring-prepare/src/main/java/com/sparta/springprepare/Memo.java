package com.sparta.springprepare;

import lombok.*;

@Getter
//@NoArgsConstructor 기본 생성자 정의 어노테이션
//@AllArgsConstructor 모든 필드를 파라미터로 가지는 생성자 정의 어노테이션
@RequiredArgsConstructor //final 필드를 파라미터로 가지는 생성자 어노테이션, final 필드를 제외한 필드는 생성자에 포함되지 않는다.
public class Memo {
    private final String username;
    private String contents;
}
