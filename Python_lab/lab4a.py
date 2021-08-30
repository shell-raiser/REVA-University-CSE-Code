f=open ("std.txt", 'a+')

flag=input ("Do you want to update the file Yes/No: ")

if flag=="Yes":
    n=int (input ("Enter how many students:"))
    for i in range(n):
        srn, name, sem, sec, avgmark= input("Enter the SRN number, name, semester, section and average marks of the students\n").split()
        f.writelines (srn+" "+name+" "+sem+" "+sec+" "+avgmark+"\n")
f.close()
print("contents of student file is")
mylines=[]

with open ("std.txt", 'r+') as outfile:
    for myline in outfile:
        mylines.append(myline.split())
        for element in mylines:
            avgmark=int (element [-1])
            sec=str (element [-2])
            if avgmark >= 75 and sec=='A':
                print (element)
