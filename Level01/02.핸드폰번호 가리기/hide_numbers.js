function hide_numbers(s){
    return "*".repeat(s.length - 4) + s.slice(-4);
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log("결과 : " + hide_numbers('01033334444'));