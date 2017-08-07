def water_melon(n):
    result = ""
    for i in range(1, n + 1):
        if i % 2:
            result += "수"
        else:
            result += "박"
    return result

# 실행을 위한 테스트코드입니다.
print("n이 3인 경우: " + water_melon(3))
print("n이 4인 경우: " + water_melon(4))
