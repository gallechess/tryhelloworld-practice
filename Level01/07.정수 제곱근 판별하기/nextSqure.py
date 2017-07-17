from math import sqrt

def nextSqure(n):
    root = sqrt(n)
    if int(root) == root:
        return (int(root) + 1) ** 2
    else:
        return "no"

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print("결과 : {}".format(nextSqure(121)));
