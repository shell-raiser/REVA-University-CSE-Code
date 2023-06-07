s = 'We promptly judged antique ivory buckles for the next prize'
alphs = [1]*26
for i in range(1,26):
    alphs[i] = i
for i in s:
    if(ord(i) == 32):
        continue
    elif ord(i) <= 90:
        alphs[ord(i)-65] = 0
    elif ord(i) >= 97:
        alphs[ord(i)-97] = 0
for i in alphs:
    if(i != 0):
        print('not pangram')
    
print('pangram')