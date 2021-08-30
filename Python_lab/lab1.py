ls=[]
def read():
    n = int (input("Enter the size:"))
    for i in range(n):
        elements=str(input("Enter SRNs:"))
        ls.append(elements)
    print("th list u hv entered is:", ls)
read()
f=input("You want to add more\ny/n:")
if f=="y":
    pos = int(input("Enter the position"))
    s = str(input ("Enter SRN"))
    ls.insert(pos,s)
else:
    pass
print(ls)
p = str(input("Enter element from the list to find the index"))
print("Index of element",p,"is",ls.index(p))
