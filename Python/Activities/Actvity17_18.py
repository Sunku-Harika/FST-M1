import pandas as pd

data ={

    "Usernames": ["admin", "Charles", "Deku"],
   "Passwords": ["password", "Charl13", "AllMight"]
}


#convert dataset to dataframe
df=pd.DataFrame(data)

	
print(df)

#write dataframe to csv file
df.to_csv("./activities/data.csv",index=False)

print("===================================")

input_data=pd.read_csv("./activities/data.csv")

	
# Print the values in the Usernames column only
print(input_data["Usernames"])

	
# Print the username and password of the second row

print("===================================")

print(input_data["Usernames"][1],input_data["Passwords"][1])

#Sort the Usernames column in ascending order
print("===================================")
print(input_data.sort_values("Usernames"))

	
#Sort the Passwords column in descending order
print("===================================")

print(input_data.sort_values("Passwords",ascending=False))