def printTriangle(num):
    s = ""
    for i in range(1, num + 1):
        s += "*" * i + "\n"
    return s

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print(printTriangle(3))
