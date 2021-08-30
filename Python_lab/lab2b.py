dict1={"+":[100,200], "-":[50,40], "*":[30,78], "/":[10,2]}
x=str(input("enter an operator:"))

print("Operation Required:", x)

def add():
    a=dict1["+"]
    print (a)
    i=0
    for t in a:
        b=a[i]+a[i+1]
    print(b)

def sub():
    a=dict1["-"]
    print (a)
    i=0
    for t in a:
        b=a[i]-a[i+1]
    print(b)

def mul():
    a=dict1["*"]
    print (a)
    i=0
    for t in a:
        b=a[i]*a[i+1]
    print(b)

def div():
    a=dict1["/"]
    print (a)
    i=0
    for t in a:
        b=a[i]/a[i+1]
    print(b)

if x=="+":
    add()

elif x=="-":
    sub()

elif x=="*":
    mul()

elif x=="/":
    div()

else:
    print("Invalid operator")