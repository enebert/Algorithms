def quicksort(A,p,r):
    if p < r:
        q = partition(A,p,r)
        quicksort(A,p,q-1)
        quicksort(A,q+1,r)

def partition(A,p,r):
    print("Partition Called")
    pivot = A[r]
    i = p-1
    for j in range(p, r):
        if A[j] <= pivot:
            i += 1
            temp = A[i]
            A[i] = A[j]
            A[j] = temp
    temp = A[i+1]
    A[i+1] = A[r]
    A[r] = temp

    return i+1

if __name__ == "__main__":
    myList = [7,2,11,8,1,13,4,5]
    quicksort(myList, 0, len(myList)-1)
    print(myList)
