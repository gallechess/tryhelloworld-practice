def rm_small(mylist):
    if len(mylist) <= 1:
        return []
    else:
        sortedlist = sorted(mylist)
        mylist.remove(sortedlist[0])
        return mylist

# 아래는 테스트로 출력해 보기 위한 코드입니다.
my_list = [4, 3, 2, 1]
print("결과 {} ".format(rm_small(my_list)))
