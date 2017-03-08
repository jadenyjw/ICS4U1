from sys import stdin
import math


def nC3(x):
    return x * (x-1) * (x-2) / 6
def nC2(x):
    return x * (x-1) / 2


n, k = list(map(int, stdin.readline().split()))

if k == 1:
  print(0)

elif k == 2:
  if n == 1:
    print(2)
  elif n == 2:
    print(0)
  elif n == 3:
    print(2)
  elif n == 4:
    print(2)
  elif n == 5:
    print(0)
  elif n == 6:
    print(0)
  elif n == 7:
    print(0)
  elif n == 8:
    print(2)

elif k >= 3:

  if n == 1:
    print(int(1572864 * nC3(k) - nC2(k)))
  elif n == 2:
    print(int(96 * nC3(k)))
  elif n == 3:
    print(int(24 * nC3(k) + 2 ))
  elif n == 4:
    print(int(24576 * nC3(k) + 2 ))
  elif n == 5:
    print(int(12 * nC3(k)))
  elif n == 6:
    print(int(6 * nC3(k)))
  elif n == 7:
    print(int(96 * nC3(k)))
  elif n == 8:
    print(int(1610612736 * nC3(k) + 2))
