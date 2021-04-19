package com.jangjangyi.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        /*
         *  assertThat
         * - assertj라는 테스트 검증 라이브러리의 검증 메소드이다.
         * - 검증하고 싶은 대상을 메소드 인자로 받는다.
         * - 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 있다.
         *
         *  isEqualTo
         * - assertj의 동등 비교 메소드입니다.
         * - assertThat에 있는 값과 isEqualTo의 값을 비교해서 같은 때만 성공합니다.
         */
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}