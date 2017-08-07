function alpha_string46(s) {
    return (s.length == 4 || s.length == 6) && /^\d+$/.test(s);
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log(alpha_string46("a234"));
