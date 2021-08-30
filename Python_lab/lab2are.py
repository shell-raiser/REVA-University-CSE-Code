def operations ():
    set1={10,20, 30, 40}
    set2={30,40,50, 60}
    set3=set()
    choice=int (input ("Enter 1 for union, 2 for intersection:"))
    if choice==1:
        print("Union is performed: ")
        set3.update(set1,set2)
        print(set3)
    elif choice==2:
        print ("Intersection is performed: ")
        for i in set1:
            if i in set2:
                set3.add (i)
        print (set3)
    else:
        print ("Incorrect choice:")
operations ()
