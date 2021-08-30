def read():
    tuple1= ()
    tuple2= ()
    L1=list (tuple1)
    L2=list (tuple2)
    n=int (input ("Enter the number of elements which you want to insert: "))
    print ("enter elements of tuplel")
    for i in range(n):
        L1.append(float (input ("Enter the element:")))
    print ("enter elemets of tuple2")
    for i in range (n):
        L2.append(str (input ("Enter the element: ")))
    tuple1=tuple (L1)
    tuple2=tuple (L2)
    print (tuple1)
    print (tuple2)
    tuple3= (max (tuple1), max (tuple2))
    print("Max of tuplel and tuple2 is:", tuple3)

read()