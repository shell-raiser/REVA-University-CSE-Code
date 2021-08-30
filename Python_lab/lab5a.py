class Car:
    def __init__(self, year, make, speed,company,price):

        self.year= year 
        self.make = make 
        self.speed = speed 
        self.company=company 
        self.price=price 
    def display_car_details(self): 
        print(str(self.year),"\t",self.make,"\t",str(self.speed),"\t",self.company,"\t",str(self.price)) 
carobject= [] 
n=int(input("\n How many car details you want ")) 
for i in range(n): 
    year=input("\n Enter car Model") 
    make=input("\nEnter Car make") 
    speed=float(input("\nEnter the speed of Car")) 
    company=input("\nEnter company name") 
    price=float(input("\nEnter the price of car")) 
    carobject.append(Car(year,make,speed,company,price)) 
print("\n The Car model make speed-KMPL company price L/Crore\n") 
for obj in carobject: 
    obj.display_car_details()

