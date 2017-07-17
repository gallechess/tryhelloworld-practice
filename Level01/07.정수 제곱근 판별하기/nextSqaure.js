function nextSqaure(n){
  var result = 0;
  var root = Math.sqrt(n);
  if (parseInt(root) === root) {
    return Math.pow(parseInt(root) + 1, 2);
  } else {
    return "no";
  }
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log("결과 : " + nextSqaure(121));
