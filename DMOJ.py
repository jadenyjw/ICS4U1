from sys import stdin
n = int(stdin.readline())
r = int(stdin.readline())
c = int(stdin.readline())

floor = []
roomsizes = []
for i in range(r):
    floor.append([])
    floor[i].append(list(stdin.readline().rstrip()))
    print(floor[i])

for i in range(r):
    for j in range(c):

        if floor[i][0][j] == ".":
            maximum = 0
