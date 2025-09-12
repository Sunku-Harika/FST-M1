import pandas as pd
from pandas import ExcelWriter

data ={
    'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]

}

df=pd.DataFrame(data)


# Print the dataframe
print(df)

	
# Write the dataframe to a Excel file

writer=ExcelWriter("./activities/data.xlsx")
df.to_excel(writer,'data',index=False)

writer.close()

