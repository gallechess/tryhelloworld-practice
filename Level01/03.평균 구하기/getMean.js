function average(array) {
    var sum = 0;  
    for (var idx in array) {
        sum += array[idx];
    }
    return sum / array.length;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
var testArray = [5,3,4] 
console.log("평균값 : " + average(testArray));