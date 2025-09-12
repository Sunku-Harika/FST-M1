import pandas as pd

	
# Read data from Excel sheet
df=pd.read_excel("./activities/data.xlsx",sheet_name="data")

# Print the dataframe
print(df)

print("============================")

	
# Print the number of rows and columns
	
print("Number of rows and columns:", df.shape)


	
# Print the data in the emails column only
print("===========Emails =================")
print(df['Email'])



# Sort the data based on FirstName in ascending order and print the data
print("==========Sorted by FirstName ==================")
print(df.sort_values('FirstName'))
