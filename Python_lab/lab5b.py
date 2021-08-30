Airlineobject=[]
class ARS:

    def __init__ (self, name, source, destination, travel_date):

        self.pass_name=name 
        self.pass_source=source

        self.pass_destination=destination

        self.pass_travel_date=travel_date 
    def display_pass_details(self):

        print("\n", self.pass_name, "\t",self.pass_source, "\t",self.pass_destination, "\t",self.pass_travel_date)

Airlineobject.append(ARS("Ashok","bangalore","USA","1/oct/2020"))

Airlineobject.append(ARS("Shree", "bangalore","London","2/oct/2020"))

Airlineobject.append(ARS( "Roja", "bangalore", "China","3/oct/2020")) 
Airlineobject.append(ARS("Dheeran", "bangalore","London","5/oct/2020" ))

Airlineobject.append(ARS("Eeshwar","USA","China","10/Feb/2020" ))

for i in Airlineobject:

    i.display_pass_details()

print( '\nTravelled b/w Bengalore and, London')

print('\n Passenger Name\tSource\tDestination\tTravel Data') 
n=len('Airlineobject')

for i in range(n):

    if ((Airlineobject[i].pass_source=="bangalore") and (Airlineobject[i].pass_destination=="London")):

        Airlineobject[i].display_pass_details()

print("\n Travelled b/w USA and China")
print('\n Passenger Name \t source\tDestination\tTravel date')
for i in range (0,n):
    if ((Airlineobject[i].pass_source=="USA") and (Airlineobject[i].pass_destinatio=="China" and Airlineobject.pass_travel_date=="10/Feb/2020")):
        Airlineobject[i].display_pass_details()