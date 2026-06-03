##Ask the user for a temperature in Celsius. Print 'hot' if > 35, 'warm' if 20–35, 'cool' if 10–19, and 'cold' if below 10.

temperature_celsius = int(input("Enter the temperature in Celsius: "))

if(temperature_celsius > 35):
    print("hot")
elif(temperature_celsius >= 20 and temperature_celsius <= 35):
    print("warm")
elif(temperature_celsius >= 10 and temperature_celsius <= 19):
    print("cool")
else:
    print("cold")   