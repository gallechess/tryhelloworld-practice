def sum_digit(number):
    sum = 0
    for strDigit in str(number):
        sum += int(strDigit)
    return sum

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print("결과 : {}".format(sum_digit(123)));
