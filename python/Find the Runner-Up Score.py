if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

score_set = set(arr)
print(sorted(score_set, reverse=True)[1])
