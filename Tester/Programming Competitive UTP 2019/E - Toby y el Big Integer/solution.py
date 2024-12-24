if __name__=='__main__':
    n, q = input().split()
    q = int(q)
    print(n, end="")
    for i in range(q):
        x, y = input().split()
        x = int(x)
        y = int(y)
        print((x-1)*'0', end="")
        print(y, end="")
    print()
