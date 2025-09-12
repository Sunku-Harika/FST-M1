dict_fruits = {

"apple":220,
"Orange":100,
"Banana":40

}

check_fruit=input("Enter a fruit name to check in dict:").lower()

if check_fruit in dict_fruits:
    print(f"{check_fruit} is available in dict_fruits")
else:
    print(f"{check_fruit} is not available in dict_fruits")