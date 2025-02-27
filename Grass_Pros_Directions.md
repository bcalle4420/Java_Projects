Insturctions for this Project:
Create a new Java program and call it GarysGrassPros.java
Add code to the program file GarysGrassPros.java and use several methods to facilitate pricing of jobs for his landscaping company. The methods should be coded as follows:

Method main(): has its usual method heading and its code will display the following messages and logic:

Welcome to GarysGrassPros... We will get your yard looking beautiful this spring!!
We have the best grass growing, lawn cutting, and mulching plans for you.
What are you interested in getting pricing for? Enter 'g' for grass growing, 'c' for lawn cutting, or 'm' for mulching:

This method should use an if-else-if or switch statement to call one of three methods: grassGrowing(), lawnCutting() or mulching() based on the user input. 
When it gets data back from a method, it should print an appropriate formatted message:
The pricing for your <plan> job is: $<value>

Method grassGrowing(): Takes in no data.
It asks the user to enter the size of their lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre). Based on the user input, it determines the price per fertilizer grass growing treatment 
and returns this value back as a double.
Pricing is as follows: quarterAcre yard = $50, halfAcre yard = $75, threeQuarterAcre yard = $110, and fullAcre yard = $120

Method lawnCutting(): Takes in no data.
It asks the user to enter the size of their lawn (1=quarterAcre, 2=halfAcre, 3=threeQuarterAcre, 4=fullAcre). 
Based on the user input, it determines the price per lawn cut and returns this value back as a double.
Pricing is as follows: quarterAcre yard = $30, halfAcre yard = $50, threeQuarterAcre yard = $75, and fullAcre = $90

Method mulching(): Takes in no data.
It asks the user to enter the square footage of the area they would like mulched (between 400-1800 sq ft). 
Based on the user input, it calculates the number of cubic yards of mulch needed to mulch the area, assume 1 cubic yard will mulch 150.0 sqft and round up/down because partial cubic yards cannot be ordered. 
Once the number of cubic yards is determined, this method should ask the user what type of mulch they want (1=hemlock, 2=bark, 3=pine). 
Based on the user input, it computes the price of the mulch order and returns this value back as a double.
Pricing is as follows: hemlock = $45/cubic yard, bark = $40/cubic yard, pine = $30 cubic yard

Use final constants as shown in class for all fixed values. 

Create three more methods to refactor the main() method, one for printing the two-line header in main(); another one for returning 'g', 'c' or 'm' based on user input, a third to calculate the final price.
