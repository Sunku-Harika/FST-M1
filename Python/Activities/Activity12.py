def calc_sum(num):
    if num:
        return num+calc_sum(num-1)
    else:
        return 0
    
result=calc_sum(10)

print(result)