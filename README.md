# Scrollo-App 
This an app where the user can see News , Memes and Reels in a scrollable manner in one app.

# Feautres

-  Beautiful UI, Dark Theme
-  Parse complicated JSON.
-  News Home page
-  Live News
-  Different categories of news like world , science , busines , etc..
-  Find news with keyword
-  Uses Google News Api.
-  Display full news detail through in-app browser.
-  Quality Memes 
-  Unlimited Memes from reddit api.
-  Share News, Memes, Reels
-  Download Memes.
-  Swipeable Reels.
-  Switch from one data to another very easily using frame layout.

# Output 


<table style="border: 1px solid black;">
            <tr>
                <td  style="border: 1px solid black ;">
                    News
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295679-1c3ce8e2-b9a5-4864-a773-804742483932.jpg"   width="200">
                </td>
                <td  style="border: 1px solid black ;">
                    Memes
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295720-01b1a683-7a4d-4b52-aaaf-d935872c58c0.jpg"   width="200">
                </td>
                 <td  style="border: 1px solid black ;">
                    Reels
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170317420-bb010cb6-962e-462b-80bc-595f1749c50b.jpg"   width="200">
                </td>
            </tr>
            <tr>
                <td  style="border: 1px solid black ;">
                   In-App full News
                </td>
                <td  style="border: 1px solid black ;">
                    <img src = "https://user-images.githubusercontent.com/106223361/170317769-2783a0df-5061-4ed4-ab55-0e8f2aaf3289.jpg"   width="200">
                </td>
                <td  style="border: 1px solid black ;">
                     Category
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170318044-315af3a0-b4a2-41ce-b328-faaa274a5455.jpg"   width="200">
                </td>
               <td  style="border: 1px solid black ;">
                    Share
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295888-d3970b0d-162e-41b7-bca0-0aca35401d22.jpg"   width="200">
                </td>
            </tr>
        </table>
        

1. Write a script to find the greatest of three numbers (numbers passed as command line
parameters).

```
echo "Enter Num1"
read num1
echo "Enter Num2"
read num2
echo "Enter Num3"
read num3

if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]
then
    echo $num1
elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]
then
    echo $num2
else
    echo $num3
fi
```

2. Write a script to check whether the given no. is even/odd.

```
echo "Enter a number : "
read n
rem=$(( $n % 2 ))
if [ $rem -eq 0 ]
then
echo "$n is even number"
else
echo "$n is odd number"
fi
```

3. Write a script to calculate the average of n numbers.

```
echo "Enter Size(N)"
read N

i=1
s=0

echo "Enter Numbers"
while [ $i -le $N ]
do
  read num               #get number
  s=$((s + num))     #sum+=num
  i=$((i + 1))
done

avg=$(echo $s / $N | bc -l)

echo $avg
```

4. Write a script to check whether the given number is prime or not.

```
#!/bin/bash

read -p "Enter a number: " num

function is_prime {
  for ((i=2; i<=num/2; i++))
  do
    if [ $((num%i)) -eq 0 ]
    then
      echo "$num is not a prime number."
      exit
    fi
  done
  echo "$num is a prime number."
}

result=$(is_prime)

echo "$result"
```

5. Write a script to check whether the given input is a number or a string.

```
echo "Enter input"
read input

# check if input is a number
if [[ $input =~ ^[0-9]+$ ]]; then
  echo "$input is a number."
else
  echo "$input is a string."
fi
```

6. Write a script to compute no. of characters and words in each line of given file.

```
echo Enter the filename
read file
c=`cat $file | wc -c`
w=`cat $file | wc -w`
l=`grep -c "." $file`
echo Number of characters in $file is $c
echo Number of words in $file is $w
echo Number of lines in $file is $l
```

7. Write a script to print the Fibonacci series up to n terms.

```
echo "How many number of terms to be generated ?"
  read n
function fib
{
  x=0
  y=1
  i=2
  echo "Fibonacci Series up to $n terms :"
  echo "$x"
  echo "$y"
  while [ $i -lt $n ]
  do
      i=`expr $i + 1 `
      z=`expr $x + $y `
      echo "$z"
      x=$y
      y=$z
  done
}
r=`fib $n`
echo "$r"
```

8. Write a script to calculate the factorial of a given number.

```
echo "Enter a number"
read num

fact=1

for((i=2;i<=num;i++))
{
  fact=$((fact * i))  #fact = fact * i
}

echo $fact
```

9. Write a script to calculate the sum of digits of the given number.

```
echo "Enter a number"
read num

sum=0

while [ $num -gt 0 ]
do
    mod=$((num % 10))    #It will split each digits
    sum=$((sum + mod))   #Add each digit to sum
    num=$((num / 10))    #divide num by 10.
done

echo $sum
```

10. Write a script to check whether the given string is a palindrome.

```
echo "Enter a String"
read input
reverse=""

len=${#input}
for (( i=$len-1; i>=0; i-- ))
do 
    reverse="$reverse${input:$i:1}"
done
if [ $input == $reverse ]
then
    echo "$input is palindrome"
else
    echo "$input is not palindrome"
fi
```

11. Write a shell script that accepts a string from the terminal and echo a suitable message if it
doesn’t have at least 5 characters including the other symbols.

```
echo "Enter a string: "
read input_string

string_length=${#input_string}

if ((string_length < 5)); then
    echo "The string should have at least 5 characters including other symbols"
else
    echo "The input string is valid"
fi
```

12. Write a shell script to echo the string length of the given string as argument.

```
if [ -z "$1" ]; then
    echo "Please provide a string as an argument"
else
    string_length=${#1}
    echo "The length of the string '$1' is $string_length"
fi
```

13. Write a shell script that accepts two directory Names as arguments and deletes those files in
the first directory which are similarly Named in the second directly. Note: Contents should also
match inside the files.

```
if [ -z "$1" ] || [ -z "$2" ]; then
    echo "Please provide two directory names as arguments"
else
    for file1 in "$1"/*
    do
        if [ -f "$file1" ]; then
            filename1=$(basename "$file1")
            file2="$2/$filename1"
            if [ -f "$file2" ] && cmp -s "$file1" "$file2"; then
                echo "Deleting file: $file1"
                rm "$file1"
            fi
        fi
    done
fi
```

14. Write a shell script to display the processes running on the system for every 30 seconds, but
only for 3 times.

```
#!/bin/bash

count=0

while [ $count -lt 3 ]
do
    echo "Processes running on the system:"
    ps aux
    count=$((count+1))
    if [ $count -lt 3 ]; then
        sleep 30
    fi
done
```

15. Write a shell script that displays the last modification time of any file.

```
#!/bin/bash
# Usage: ./modtime.sh filename

if [ -z "$1" ]; then
  echo "Usage: ./modtime.sh filename"
  exit 1
fi

if [ ! -e "$1" ]; then
  echo "File not found: $1"
  exit 1
fi

modtime=$(stat -c %y "$1")
echo "Last modified: $modtime"
```

16. Write a shell script to check the spellings of any text document given as an argument.

```
#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Error: No arguments supplied. Please provide a file name."
  exit 1
fi

# Check if aspell is installed
if ! command -v aspell &> /dev/null; then
    echo "aspell could not be found. Please install it first."
    exit 1
fi

file=$1
if [ ! -f $file ]; then
  echo "Error: $file is not a valid file. Please provide a valid file name."
  exit 1
fi

# Run aspell to check spelling
aspell check $file
```

17. Write a shell script to encrypt any text file.

```
if [ $# -eq 0 ]
  then
    echo "No filename provided."
    exit 1
fi

# Check that the file exists
if [ ! -f "$1" ]
  then
    echo "File does not exist."
    exit 1
fi

# Encrypt the file
gpg --symmetric "$1"

# Remove the original file
rm "$1"
```

18. Combine the above commands in a shell script so that you have a small program for extracting
a wordlist.

```
#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Error: No arguments supplied. Please provide a file name."
  exit 1
fi

file=$1
if [ ! -f $file ]; then
  echo "Error: $file is not a valid file. Please provide a valid file name."
  exit 1
fi

# Extract words from the text file using tr and sort
tr -sc '[:alnum:]' '\n' < $file | sort -u > wordlist.txt

# Check the spelling of the wordlist using aspell
aspell check wordlist.txt

# Encrypt the wordlist using OpenSSL
read -s -p "Enter passphrase for encryption: " passphrase
salt=$(openssl rand -hex 8)
openssl enc -aes-256-cbc -pass "pass:$passphrase" -S "$salt" -in "wordlist.txt" -out "wordlist.enc"

echo "Wordlist extraction complete. The encrypted wordlist is wordlist.enc"
```

19. Write a shell script which reads the contents in a text file and removes all the blank spaces in
them and redirects the output to a file.

```
#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Error: No arguments supplied. Please provide a file name."
  exit 1
fi

file=$1
if [ ! -f $file ]; then
  echo "Error: $file is not a valid file. Please provide a valid file name."
  exit 1
fi

# Remove blank spaces from the text file and write the output to a new file
sed 's/ //g' "$file" > "${file}_no_spaces"

echo "Blank spaces removed. The output file is ${file}_no_spaces"
```

20. Write a shell script that changes the Name of the files passed as arguments to lowercase.

```
#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Error: No arguments supplied. Please provide one or more file names."
  exit 1
fi

for file in "$@"; do
  if [ ! -f "$file" ]; then
    echo "Error: $file is not a valid file. Skipping..."
    continue
  fi

  # Convert the filename to lowercase using tr and mv
  new_name=$(echo "$file" | tr '[:upper:]' '[:lower:]')
  mv "$file" "$new_name"

  echo "Renamed $file to $new_name"
done
```

21. Write a shell script to translate all the characters to lower case in a given text file.

```
#!/bin/bash

# Check if file name is provided
if [ $# -eq 0 ]
then
    echo "Please provide the name of the file to convert to lowercase."
    exit 1
fi

# Check if file exists
if [ ! -f "$1" ]
then
    echo "File not found!"
    exit 1
fi

# Convert all characters to lower case using tr command
tr '[:upper:]' '[:lower:]' < "$1" > "${1%.txt}_lowercase.txt"

echo "Conversion complete!"
```

22. Write a shell script to combine any three text files into a single file (append them in the order
as they appear in the arguments) and display the word count.

```
#!/bin/bash

# Check if three file names are provided
if [ $# -ne 3 ]
then
    echo "Please provide the names of three text files to combine."
    exit 1
fi

# Check if files exist
if [ ! -f "$1" ] || [ ! -f "$2" ] || [ ! -f "$3" ]
then
    echo "One or more files not found!"
    exit 1
fi

# Combine files into a single file
cat "$1" "$2" "$3" > combined.txt

# Count the number of words in the combined file
word_count=$(wc -w < combined.txt)

echo "Combination complete!"
echo "The total number of words in the combined file is: $word_count"
```

23. Write a shell script that, given a file Name as the argument will write the even numbered line
to a file with Name evenfile and odd numbered lines to a file called oddfile.

```
#!/bin/bash

# Check if file name is provided
if [ $# -eq 0 ]
then
    echo "Please provide the name of the file to separate."
    exit 1
fi

# Check if file exists
if [ ! -f "$1" ]
then
    echo "File not found!"
    exit 1
fi

# Separate even numbered lines
sed -n '1~2p' "$1" > evenfile

# Separate odd numbered lines
sed -n '2~2p' "$1" > oddfile

echo "Separation complete!"
```

24. Write a shell script which deletes all the even numbered lines in a text file.

```
#!/bin/bash

# Check if file name is provided
if [ $# -eq 0 ]
then
    echo "Please provide the name of the file to process."
    exit 1
fi

# Check if file exists
if [ ! -f "$1" ]
then
    echo "File not found!"
    exit 1
fi

# Create temporary file
tmpfile=$(mktemp)

# Copy odd numbered lines to temporary file
sed -n '1~2!p' "$1" > "$tmpfile"

# Overwrite original file with temporary file
mv "$tmpfile" "$1"

echo "Deletion complete!
```

25. Write a script called hello which outputs the following: • your userName • the time and date •
who is logged on • also output a line of asterices (*********) after each section.

```
#!/bin/bash

# Output username and asterisks
echo "Your username is: $USER"
echo "*********"

# Output time and date and asterisks
echo "The current time and date is: $(date)"
echo "*********"

# Output currently logged-in users and asterisks
echo "Currently logged-in users:"
who
echo "*********"
```

26. Write a script that will count the number of files in each of your subdirectories.

```
#!/bin/bash

directory="/path/to/directory"

for subdir in "$directory"/*; do
    if [ -d "$subdir" ]; then
        file_count=$(find "$subdir" -type f | wc -l)
        subdir_name=$(basename "$subdir")
        echo "Subdirectory: $subdir_name"
        echo "File count: $file_count"
        echo
    fi
done
```

27. Write a shell script like a more command. It asks the user Name, the Name of the file on
command prompt and displays only the 15 lines of the file at a time on the screen. Further, next
15 lines will be displayed only when the user presses the enter key / any other key.

```
#!/bin/bash

read -p "Enter your name: " name
read -p "Enter the name of the file: " file_name

if [ ! -f "$file_name" ]; then
    echo "File not found."
    exit 1
fi

head -n 15 "$file_name"

line_number=16

while true; do
    read -rsn1 -p "Press Enter to continue or press any other key to exit..."

    if [ "$REPLY" == "" ]; then
        tail -n +$line_number "$file_name" | head -n 15
        line_number=$((line_number + 15))
    else
        echo
        echo "Exiting..."
        break
    fi

    if [ $line_number -gt $(wc -l < "$file_name") ]; then
        echo "End of file reached."
        break
    fi
done

echo "Thank you, $name!"
```

28. Write a shell script that counts English language articles (a, an, the) in a given text file.

```
#!/bin/bash

# Prompt the user for the file name
read -p "Enter the name of the text file: " file_name

# Check if the file exists
if [ ! -f "$file_name" ]; then
    echo "File not found."
    exit 1
fi

# Count the occurrences of articles
article_count=$(grep -owE 'a|an|the' "$file_name" | wc -l)

# Display the result
echo "Number of English articles in the file: $article_count"
```

29. Write the shell script which will replace each occurrence of character c with the characters chr
in a string s. It should also display the number of replacements.

```
#!/bin/bash

# Prompt the user for the string
read -p "Enter the string: " s

# Prompt the user for the character to replace
read -p "Enter the character to replace: " c

# Prompt the user for the replacement characters
read -p "Enter the replacement characters: " chr

# Perform the replacement
new_s="${s//$c/$chr}"

# Count the number of replacements
replacement_count=$(( (${#s} - ${#new_s}) / ${#c} ))

# Display the result
echo "Modified string: $new_s"
echo "Number of replacements: $replacement_count"
```

30. Write a shell program to concatenate to two strings given as input and display the resultant
string along with its string length. Write a shell program to simulate a simple calculator. 90)
Write a shell program to count the following in a text file. • Number of vowels in a given text
file. • Number of blank spaces. • Number of characters. • Number of symbols. • Number of
lines

```
#!/bin/bash

# Prompt the user for the first string
read -p "Enter the first string: " string1

# Prompt the user for the second string
read -p "Enter the second string: " string2

# Concatenate the strings
concatenated_string="$string1$string2"

# Display the concatenated string and its length
echo "Concatenated string: $concatenated_string"
echo "Length of the string: ${#concatenated_string}"


#!/bin/bash

# Prompt the user for the text file
read -p "Enter the name of the text file: " file_name

# Check if the file exists
if [ ! -f "$file_name" ]; then
    echo "File not found."
    exit 1
fi

# Count the number of vowels
vowel_count=$(grep -io '[aeiou]' "$file_name" | wc -l)

# Count the number of blank spaces
space_count=$(grep -o ' ' "$file_name" | wc -l)

# Count the number of characters (excluding newlines)
character_count=$(grep -o '.' "$file_name" | grep -vc $'\n')

# Count the number of symbols (non-alphanumeric characters)
symbol_count=$(grep -o '[^[:alnum:][:space:]]' "$file_name" | wc -l)

# Count the number of lines
line_count=$(wc -l < "$file_name")

# Display the results
echo "Number of vowels: $vowel_count"
echo "Number of blank spaces: $space_count"
echo "Number of characters: $character_count"
echo "Number of symbols: $symbol_count"
echo "Number of lines: $line_count"

```

Write a shell script to get the student details [Name,Email id] of section A from the given input file named "student_details.txt". Redirect the output into an output file named "output.txt".
Rename the shell script file as "Roll_student_details.sh" and upload it using below link

```

#!/bin/bash

# Use awk to filter the input file based on Semester-A, and save the results to output.txt
awk -F "," '$3 ~ /Semester-A/ {print $2 "," $4}' student_details.txt > output.txt

# Check if the output file was created successfully
if [ -s output.txt ]; then
  echo "Semester-A student details saved to output.txt"
else
  echo "No students found in Semester-A"
fi
```


Q1: Write a shell script to calculate the average marks of top 'n' students from the section 's'. Also print Roll number. Email id and Marks of those 'n' students. Give the input file containing student details, and values of 'n' and 's' as command line arguments. Name your shell script file as <apXXXXXXXXXXX_lab_exam.sh>. Here <XXXXXXXXXXX> represents your roll number. If your roll number is AP21110010081 then your shell script file name will be <AP21110010081_lab_exam.sh>

Example:

Given input file: student_marks.txt
There are five columns <Roll, Name, Semester, Email, Marks> separated by comma.
2, Mohammad, Semester-B, mohammad@srmap.edu.in, 71
8, KUMAR, Semester-C, kumar@srmap.edu.in, 29
79, CHAGANTIPATI, Semester-B, aetesh@srmap.edu.in, 68 85, SAI, Semester-B, saiakash@srmap.edu.in, 76
25, KAPA, Semester-B, akhilsai@srmap.edu.in, 95 49, HAASITHA, Semester-A, haasitha@srmap.edu.in, 50
88, GOLLAPUDI, Semester-B, amish@srmap.edu.in, 90
18, JAMMULA, Semester-A, jammula@srmap.edu.in, 21
Output:
Input: <./shell_script.sh input_file.txt s n> ./AP21110018881_lab_exam.sh student_marks.txt B 3
Average: 87
25, akhilsai@srmap.edu.in, 95
88, amish@srmap.edu.in, 90
85, saiakash@srmap.edu.in, 76
	

```
#!/bin/bash

# Check if all required command line arguments are provided
if [ $# -ne 3 ]; then
  echo "Usage: $0 <input_file> <semester> <n>"
  exit 1
fi

# Assign command line arguments to variables
input_file=$1
semester=$2
n=$3

# Calculate the average marks of top n students from the given semester using awk
average_marks=$(awk -F, -v sem="$semester" '$3 ~ sem { total += $NF; count++ } END { if (count > 0) print total / count }' "$input_file")

# Print the average marks
echo "Average: $average_marks"

# Print the details of the bottom n students using awk and sort
echo "Bottom $n Students:"
awk -F, -v sem="$semester" -v n="$n" '$3 ~ sem { print $1 ", " $2 ","$4", " $NF }' "$input_file" | sort -t, -k 3 -n | head -n "$n"


```
AP21110011443,KURUVA AAKASH,B.Tech.-CSE III - U,sainikhila_gorja@srmap.edu.in,41
AP21110011434,VARDHANAPU ABHISHEK,B.Tech.-CSE III - U,sushma_kalam@srmap.edu.in,50
AP21110011465,TADIPATRI AHAMMAD,B.Tech.-CSE III - U,krishnakoushik_guduru@srmap.edu.in,37
AP21110010916,SHAIK AHMED ALI,B.Tech.-CSE III - O,thanvivarma_m@srmap.edu.in,29
AP21110011467,UYYALA AJAY,B.Tech.-CSE III - U,sameer_s@srmap.edu.in,15
AP21110010903,VEERAGANDHAM AJAY CHOWDARY,B.Tech.-CSE III - N,ajay_veeragandham@srmap.edu.in,18
AP21110011238,GONA AJAY KUMAR,B.Tech.-CSE III - N,arunkumar_perla@srmap.edu.in,21
AP21110010961,SHAIK ALTAFUL RAHAMAN,B.Tech.-CSE III - O,shanmukhnandan_m@srmap.edu.in,10
AP21110010948,MOHAMMAD AMEEN NAIMUDDIN,B.Tech.-CSE III - O,rohitbahadur_bista@srmap.edu.in,23
AP21110010975,PONNALA ANUHYA,B.Tech.-CSE III - O,manojjoyson_s@srmap.edu.in,19
AP21110010926,SHAIK ARSHAD,B.Tech.-CSE III - O,chakrapani_maale@srmap.edu.in,29
AP21110010972,CHENNU ARYAN KARTHIKEYA,B.Tech.-CSE III - O,meghana_bollam@srmap.edu.in,14
AP21110011239,PADALA ASISH MANOJ REDDY,B.Tech.-CSE III - N,ravindranath_k@srmap.edu.in,77
AP21110010886,MAHAMMAD ASRAAR AHAMAD K MOHIDDIN QUADRI,B.Tech.-CSE III - N,asraarahamad_m@srmap.edu.in,32
AP21110010878,YUGADHEER AYODHYA,B.Tech.-CSE III - N,ayodhya_yugadheer@srmap.edu.in,13
AP21110010941,ROHIT BAHADUR BISTA,B.Tech.-CSE III - O,chandan_shah@srmap.edu.in,46
AP21110011477,KALLURU BALAJI,B.Tech.-CSE III - U,gunasekhar_salapu@srmap.edu.in,64
AP21110010925,THOTA BHARGAV,B.Tech.-CSE III - O,arham_mohammed@srmap.edu.in,31
AP21110010881,GORANTLA BHARGAV SRI KRISHNA,B.Tech.-CSE III - N,bhargavsrikrishna_g@srmap.edu.in,35
AP21110011422,GADDAM CHAITANYA NATH,B.Tech.-CSE III - U,tejasaisiddharth_gandu@srmap.edu.in,56
AP21110011454,CHIKATI CHANAKYA,B.Tech.-CSE III - U,mohith_g@srmap.edu.in,42
AP21110011424,TUMAPALA CHANDANA MANI,B.Tech.-CSE III - U,rohithkumar_jupalle@srmap.edu.in,66
AP21110010908,VADLAPATLA CHANDRA KIRAN,B.Tech.-CSE III - N,chandrakiran_v@srmap.edu.in,28
AP21110011240,KATRAGADDA CHARANDEEP CHOWDARY,B.Tech.-CSE III - N,aryan_chennu@srmap.edu.in,10
AP21110010905,KALLEPALLI CHARISMANJALI,B.Tech.-CSE III - N,charismanjali_k@srmap.edu.in,32
AP21110011519,DEVESH CHAUDHARY,B.Tech.-CSE III - U,nagakethankumar_p@srmap.edu.in,17
AP21110010913,RISHABH CHAUHAN,B.Tech.-CSE III - O,asishmanoj_padala@srmap.edu.in,67
AP21110010858,GNANESH CHOWDARY TUMMALA,B.Tech.-CSE III - N,gnanesh_t@srmap.edu.in,57
AP21110011431,GORANTLA DAKSHAYANI,B.Tech.-CSE III - U,monika_a@srmap.edu.in,62
AP21110010924,VINAY DATTA ILAPURAM,B.Tech.-CSE III - O,ankit_rajput@srmap.edu.in,32
AP21110010930,GODAVARTHY DHAKSHAYANI,B.Tech.-CSE III - O,vrijeshwar_rsingh@srmap.edu.in,11
AP21110010849,PYLA DHANUSH,B.Tech.-CSE III - N,dhanush_pyla@srmap.edu.in,42
AP21110010935,PULIME DHEERAJ VENKATA SRIRAM,B.Tech.-CSE III - O,akash_kasula@srmap.edu.in,38
AP21110011456,KALLIVETTU DOLLY PRIYA,B.Tech.-CSE III - U,snehalatha_rotte@srmap.edu.in,44
AP21110010951,SRINADH DOPPALAPUDI,B.Tech.-CSE III - O,niharika_maddi@srmap.edu.in,30
AP21110010911,PEDDISETTY DURGA MAHESH,B.Tech.-CSE III - O,nikhil_kethavath@srmap.edu.in,53
AP21110010931,KOUTARAPU GANESH SESHA SAI AKHILK,B.Tech.-CSE III - O,nikhila_sornapudi@srmap.edu.in,23
AP21110010868,JAGMOHAN GAUTAM,B.Tech.-CSE III - N,jagmohan_g@srmap.edu.in,51
AP21110011246,MANDALAPU GEETHA SRI,B.Tech.-CSE III - O,niteeshkumar_gajjala@srmap.edu.in,13
AP21110010856,GURRAM GNANA DEEPIKA,B.Tech.-CSE III - N,gnanadeepika_g@srmap.edu.in,18
AP21110010896,JASTI GOPI HARSHAVARDHAN,B.Tech.-CSE III - N,gopiharshavardhan_j@srmap.edu.in,40
AP21110010907,GUNDAVARAPU GUNA SEKHAR,B.Tech.-CSE III - N,gunasekhar_g@srmap.edu.in,31
AP21110011476,SALAPU GUNA SEKHAR,B.Tech.-CSE III - U,niranjan_k@srmap.edu.in,40
AP21110011459,PILLA G VENKATA LAKSHMI KUNDANAA,B.Tech.-CSE III - U,mohankrishna_gunti@srmap.edu.in,30
AP21110011450,PASUPULA HARSHA,B.Tech.-CSE III - U,iliazkhan_pathan@srmap.edu.in,69
AP21110010906,KOLA HARSHA SAI,B.Tech.-CSE III - N,harshasai_kola@srmap.edu.in,16
AP21110011242,MEKA HARSHITH REDDY,B.Tech.-CSE III - O,anuhya_ponnala@srmap.edu.in,23
AP21110010866,GAJULA HASITH,B.Tech.-CSE III - N,hasith_gajula@srmap.edu.in,10
AP21110010875,NARLA HIMAVANTHA REDDY,B.Tech.-CSE III - N,himavanthareddy_n@srmap.edu.in,19
AP21110011482,CHERSHIL HYDE CHINTHALA,B.Tech.-CSE III - U,vinod_parasa@srmap.edu.in,44
AP21110010965,ATHOTA HYNDHAVI,B.Tech.-CSE III - O,naveen_nekkanti@srmap.edu.in,10
AP21110011449,PATHAN ILIAZKHAN,B.Tech.-CSE III - U,junneleswar_dutta@srmap.edu.in,27
AP21110010954,MEESALA JAI VARDHAN SAI,B.Tech.-CSE III - O,mohithsaikumar_m@srmap.edu.in,13
AP21110010921,GOLI JASHIT RAJIV,B.Tech.-CSE III - O,saiabhinav_uppaluri@srmap.edu.in,10
AP21110011480,JETTI JEEVAN ABHISHEK,B.Tech.-CSE III - U,mahendrateja_c@srmap.edu.in,33
AP21110010939,MADAMANCHI JHANSY,B.Tech.-CSE III - O,lohith_meka@srmap.edu.in,23
AP21110010890,PONDURU JITHIN,B.Tech.-CSE III - N,jithin_ponduru@srmap.edu.in,68
AP21110011470,BHUKYA JOHN MOSHE NAYAK,B.Tech.-CSE III - U,mahammadhasan_shaik@srmap.edu.in,30
AP21110011448,DUTTA JUNNEL ESWAR,B.Tech.-CSE III - U,saikartheek_gathram@srmap.edu.in,44
AP21110010967,MEDEPALLI KARTHIK,B.Tech.-CSE III - O,altaful_shaik@srmap.edu.in,15
AP21110011237,NIKHIL KETHAVATH,B.Tech.-CSE III - N,sanvitha_muddana@srmap.edu.in,72
AP21110011453,G K H MOHITH,B.Tech.-CSE III - U,mohamood_naguru@srmap.edu.in,57
AP21110010949,HEMANTH KODALI,B.Tech.-CSE III - O,saikumar_chunduru@srmap.edu.in,10
AP21110011464,GUDURU KRISHNA KOUSHIK,B.Tech.-CSE III - U,rohith_vaka@srmap.edu.in,49
AP21110010871,ROHIT KUMAR,B.Tech.-CSE III - N,rohit_kumar@srmap.edu.in,54
AP21110010860,UPDESH KUMAR,B.Tech.-CSE III - N,updesh_kumar@srmap.edu.in,47
AP21110010974,RAJ KUMAR CHAUDHARY,B.Tech.-CSE III - O,karthik_medepalli@srmap.edu.in,42
AP21110011490,GOWTHAM KUMAR GANESWARAM,B.Tech.-CSE III - U,tonybabu_y@srmap.edu.in,51
AP21110010938,ASHISH KUMAR GUPTA,B.Tech.-CSE III - O,saiakhilk_k@srmap.edu.in,28
AP21110011245,NITEESH KUMAR REDDY GAJJALA,B.Tech.-CSE III - O,saidheeraj_jammu@srmap.edu.in,33
AP21110010880,MOGASATI LAKSHMIGANESH VEDHAVYAS RAJU,B.Tech.-CSE III - N,ganesh_mogasati@srmap.edu.in,26
AP21110011478,GUNDAVARAPU LAKSHMI NARASIMHA,B.Tech.-CSE III - U,balaji_kalluru@srmap.edu.in,57
AP21110011457,PATHAGUNTA LAKSHMIPATHI,B.Tech.-CSE III - U,dollypriya_kallivettu@srmap.edu.in,37
AP21110010872,DEVIREDDY LAVANYA REDDY,B.Tech.-CSE III - N,lavanya_d@srmap.edu.in,10
AP21110010957,JUNGA LEELA MANOHAR,B.Tech.-CSE III - O,kodali_hemanth@srmap.edu.in,44
AP21110011451,BALLA LEKHYA VENKATA SAI DURGA VINAY,B.Tech.-CSE III - U,harsha_pasupula@srmap.edu.in,79
AP21110010963,ANU LIKITHA IMMADISETTY,B.Tech.-CSE III - O,manohar_junga@srmap.edu.in,10
AP21110010932,MEKA LOHITH REDDY,B.Tech.-CSE III - O,vinaydatta_ilapuram@srmap.edu.in,51
AP21110010956,TADIBOINA LOKESH,B.Tech.-CSE III - O,ameen_m@srmap.edu.in,33
AP21110010920,CHAKRAPANI MAALE,B.Tech.-CSE III - O,krishna_sharma@srmap.edu.in,42
AP21110010893,RAMANI MADHU SUDAN RAO,B.Tech.-CSE III - N,madhusudanrao_ramani@srmap.edu.in,39
AP21110010927,KASULA MADHU VENKATA AKASH,B.Tech.-CSE III - O,rajivjashit_goli@srmap.edu.in,38
AP21110011469,SHAIK MAHAMMAD HASAN,B.Tech.-CSE III - U,devendranaik_vadithe@srmap.edu.in,69
AP21110011479,CHITTIPOTHULA MAHENDRA TEJA,B.Tech.-CSE III - U,lakshminarasimha_g@srmap.edu.in,25
AP21110010968,SREERAM MANOJ JOYSON,B.Tech.-CSE III - O,saiamruth_d@srmap.edu.in,17
AP21110011472,MYLAPALLI MANOJ KUMAR,B.Tech.-CSE III - U,spoorthi_gudavalli@srmap.edu.in,66
AP21110010869,CHENNAKESAVULA MANUSREE,B.Tech.-CSE III - N,manusree_chennakesavula@srmap.edu.in,49
AP21110010966,BOLLAM MEGHANA REDDY,B.Tech.-CSE III - O,rahulvijay_singh@srmap.edu.in,32
AP21110011426,SHAIK MOHAMMAD FAYAZ,B.Tech.-CSE III - U,sharinideepthi_putla@srmap.edu.in,51
AP21110010919,SHAIK MOHAMMED ARHAM,B.Tech.-CSE III - O,rishabh_chauhan@srmap.edu.in,24
AP21110011452,NAGURU MOHAMOOD,B.Tech.-CSE III - U,durgavinay_balla@srmap.edu.in,54
AP21110011458,GUNTI MOHAN KRISHNA,B.Tech.-CSE III - U,lakshmipathi_pathagunta@srmap.edu.in,52
AP21110011473,PANDRANGI MOHAN SAI KUMAR,B.Tech.-CSE III - U,manojkumar_mylapalli@srmap.edu.in,35
AP21110010946,MADDU MOHITH SAI KUMAR,B.Tech.-CSE III - O,jhansy_madamanchi@srmap.edu.in,29
AP21110011430,ANNAMANENI MONIKA,B.Tech.-CSE III - U,nikhil_mavuru@srmap.edu.in,92
AP21110010917,MARTHU MOUKTHIKA,B.Tech.-CSE III - O,durgamahesh_p@srmap.edu.in,13
AP21110011487,KANTE NANDA KIRAN,B.Tech.-CSE III - U,saiphani_m@srmap.edu.in,76
AP21110010912,GOGINENI NANDINI,B.Tech.-CSE III - O,ajaykumar_gona@srmap.edu.in,20
AP21110010959,DURGA NAVEEN NEKKANTI,B.Tech.-CSE III - O,sankitha_vegesna@srmap.edu.in,49
AP21110010944,MADDI NIHARIKA,B.Tech.-CSE III - O,damini_tiwari@srmap.edu.in,37
AP21110010923,SORNAPUDI NIKHILA,B.Tech.-CSE III - O,moukthika_marthu@srmap.edu.in,19
AP21110011429,MAVURU NIKHIL,B.Tech.-CSE III - U,umarfarooq_shaik@srmap.edu.in,61
AP21110011475,KANDRAKOTA NIRANJAN,B.Tech.-CSE III - U,mohansaikumar_p@srmap.edu.in,40
AP21110010855,DEV PANDEY,B.Tech.-CSE III - N,dev_pandey@srmap.edu.in,56
AP21110010940,SHUBHAM PANDEY,B.Tech.-CSE III - O,venkatesh_komalli@srmap.edu.in,73
AP21110011481,VINOD PARASA,B.Tech.-CSE III - U,jeevanabhishek_j@srmap.edu.in,54
AP21110010850,VANDANAPU PAVAN KUMAR,B.Tech.-CSE III - N,pavankumar_v@srmap.edu.in,49
AP21110010891,ANSIKA PRASAD,B.Tech.-CSE III - N,ansika_prasad@srmap.edu.in,27
AP21110010852,ABHINAY PRATAP SINGH,B.Tech.-CSE III - N,abhinaypratap_s@srmap.edu.in,53
AP21110011483,CHODAGIRI PRIYANKA,B.Tech.-CSE III - U,chershilhyde_chinthala@srmap.edu.in,62
AP21110010909,KAMISETTY PUJITHA,B.Tech.-CSE III - N,pujitha_kamisetty@srmap.edu.in,41
AP21110011444,NAIDU RAJA SEKHAR,B.Tech.-CSE III - U,aakash_kuruva@srmap.edu.in,86
AP21110010964,MUVVA RAJASEKHAR REDDY,B.Tech.-CSE III - O,saivignesh_k@srmap.edu.in,17
AP21110010918,ANKIT RAJPUT,B.Tech.-CSE III - O,nandini_gogineni@srmap.edu.in,56
AP21110010854,CHAVALI RAMESH,B.Tech.-CSE III - N,ramesh_chavali@srmap.edu.in,31
AP21110010971,KOTAPATI RAVINDRANATH,B.Tech.-CSE III - O,hyndhavi_athota@srmap.edu.in,17
AP21110010882,DIVYESH REDDY E,B.Tech.-CSE III - N,divyesh_e@srmap.edu.in,58
AP21110010899,BANDARU REVANTH BALAJI,B.Tech.-CSE III - N,revanthbalaji_bandaru@srmap.edu.in,37
AP21110010863,KONATHAM ROHAN REDDY,B.Tech.-CSE III - N,rohan_konatham@srmap.edu.in,54
AP21110011423,JUPALLE ROHITH KUMAR,B.Tech.-CSE III - U,chaitanyanath_gaddam@srmap.edu.in,42
AP21110011463,VAKA ROHITH REDDY,B.Tech.-CSE III - U,sravyasri_kadiyala@srmap.edu.in,53
AP21110010864,KOTHAMASU ROOP SAI CHARAN,B.Tech.-CSE III - N,roopsaicharan_k@srmap.edu.in,47
AP21110010922,VRIJESHWAR R SINGH,B.Tech.-CSE III - O,shaikahmed_ali@srmap.edu.in,18
AP21110010945,PATNANA SAI AKASH,B.Tech.-CSE III - O,ashishkumar_gupta@srmap.edu.in,39
AP21110010962,DOGIPARTHY SAI AMRUTH,B.Tech.-CSE III - O,lokesh_tadiboina@srmap.edu.in,17
AP21110010859,VYSYARAJU SAI,B.Tech.-CSE III - N,vysyaraju_sai@srmap.edu.in,47
AP21110010910,DOPPALAPUDI SAI CHARAN,B.Tech.-CSE III - N,saicharan_d@srmap.edu.in,22
AP21110011244,JAMMU SAI DHEERAJ,B.Tech.-CSE III - O,harshith_meka@srmap.edu.in,37
AP21110011447,GATHRAM SAI KARTHEEK,B.Tech.-CSE III - U,sivacharankarthik_k@srmap.edu.in,42
AP21110010901,VALLURUPALLI SAI KEERTHANA,B.Tech.-CSE III - N,saikeerthana_v@srmap.edu.in,47
AP21110010892,GURRAM SAI KRISHNA,B.Tech.-CSE III - N,saikrishna_gurram@srmap.edu.in,39
AP21110011427,BOLE SAI MANI RAM,B.Tech.-CSE III - U,mohammadfayaz_shaik@srmap.edu.in,66
AP21110011485,MANDALAPU SAI PHANI,B.Tech.-CSE III - U,priyanka_chodagiri@srmap.edu.in,43
AP21110010867,HARSHITH SAI RAM JAKKAM,B.Tech.-CSE III - N,harshithsairam_j@srmap.edu.in,9
AP21110010857,CHILUKURI SAI SIDHARDHA,B.Tech.-CSE III - N,saisidhardha_chilukuri@srmap.edu.in,19
AP21110011432,YALLAPRAGADA SAI SRAVANI,B.Tech.-CSE III - U,dakshayani_gorantla@srmap.edu.in,49
AP21110011435,AMBATI SAI TEJA,B.Tech.-CSE III - U,abhishek_vardhanapu@srmap.edu.in,88
AP21110010879,NELLURU SAI THARUN,B.Tech.-CSE III - N,saitharun_nelluru@srmap.edu.in,12
AP21110010848,MADALA SAI VENKAT NAVEEN,B.Tech.-CSE III - N,saivenkatnaveen_m@srmap.edu.in,28
AP21110010958,KALLI SAI VIGNESH REDDY,B.Tech.-CSE III - O,srinadh_d@srmap.edu.in,12
AP21110011466,SHAIK SAMEER,B.Tech.-CSE III - U,ahammad_tadipatri@srmap.edu.in,46
AP21110011439,PUJALI SANDHYA SREE,B.Tech.-CSE III - U,srinadh_gonugunta@srmap.edu.in,14
AP21110010969,MUDDANA SANVITHA,B.Tech.-CSE III - O,anulikitha_i@srmap.edu.in,41
AP21110010952,VEGESNA SATYA SANKITHA VARMA,B.Tech.-CSE III - O,saiakash_patnana@srmap.edu.in,47
AP21110010934,CHANDAN SHAH,B.Tech.-CSE III - O,arshad_s@srmap.edu.in,21
AP21110010955,MITTAPALLY SHANMUKH NANDAN,B.Tech.-CSE III - O,subhash_n@srmap.edu.in,39
AP21110011440,MEKALA SHARAN CHIRANJEEVULU,B.Tech.-CSE III - U,sandhyasree_pujali@srmap.edu.in,81
AP21110011425,PUTLA SHARINI DEEPTHI,B.Tech.-CSE III - U,chandanamani_tumapala@srmap.edu.in,51
AP21110010914,KRISHNA SHARMA,B.Tech.-CSE III - O,charandeep_k@srmap.edu.in,43
AP21110010870,AYUSHMAN SINGH,B.Tech.-CSE III - N,ayushman_singh@srmap.edu.in,36
AP21110011446,KAMMAMPATI SIVA CHARAN KARTHIK,B.Tech.-CSE III - U,rajasekhar_naidu@srmap.edu.in,42
AP21110011241,NANDIGAMA SIVA NAGA MALLESWAR,B.Tech.-CSE III - N,rajkumar_chaudhary@srmap.edu.in,26
AP21110011455,ROTTE SNEHA LATHA,B.Tech.-CSE III - U,chanakya_chikati@srmap.edu.in,41
AP21110010853,Y SOURYACHANDRA,B.Tech.-CSE III - N,souryachandra_y@srmap.edu.in,29
AP21110011471,GUDAVALLI SPOORTHI,B.Tech.-CSE III - U,johnmoshenayak_bhukya@srmap.edu.in,43
AP21110011462,KADIYALA SRAVYA SRI,B.Tech.-CSE III - U,thirupathamma_darawathu@srmap.edu.in,86
AP21110011437,GONUGUNTA SRINADH,B.Tech.-CSE III - U,tejeswari_bhukya@srmap.edu.in,40
AP21110010885,N SRI PRANAV,B.Tech.-CSE III - N,pranav_n@srmap.edu.in,31
AP21110010947,NANNAPANENI SUBHASH,B.Tech.-CSE III - O,shubham_pandey@srmap.edu.in,19
AP21110010862,NASANA SUPRIYA,B.Tech.-CSE III - N,supriya_nasana@srmap.edu.in,45
AP21110011433,KALAM SUSHMA,B.Tech.-CSE III - U,saisravani_yallapragada@srmap.edu.in,59
AP21110011421,GANDU TEJA SAI SIDDHARTH,B.Tech.-CSE III - U,geethasri_mandalapu@srmap.edu.in,91
AP21110011436,BHUKYA TEJESWARI,B.Tech.-CSE III - U,ambatisai_teja@srmap.edu.in,19
AP21110011460,DARAWATHU THIRUPATHAMMA,B.Tech.-CSE III - U,lakshmikundanaa_pilla@srmap.edu.in,73
AP21110010887,MEGHANA THOTA,B.Tech.-CSE III - N,meghana_thota@srmap.edu.in,42
AP21110010936,DAMINI TIWARI,B.Tech.-CSE III - O,dhakshayani_g@srmap.edu.in,75
AP21110011488,YELAKAPATI TONY BABU,B.Tech.-CSE III - U,nandakiran_kante@srmap.edu.in,57
AP21110010894,MATSA TULASI RAM,B.Tech.-CSE III - N,tulasiram_matsa@srmap.edu.in,41
AP21110011428,SHAIK UMAR FAROOQ,B.Tech.-CSE III - U,saimaniram_bole@srmap.edu.in,47
AP21110010900,SURA UMESH CHANDRA,B.Tech.-CSE III - N,umeshchandra_sura@srmap.edu.in,45
AP21110010883,CHALLA VAISHNAVI,B.Tech.-CSE III - N,vaishnavi_challa@srmap.edu.in,27
AP21110010846,MUNNANGI VEERA VASANTHA REDDY,B.Tech.-CSE III - N,veeravasanthareddy_m@srmap.edu.in,36
AP21110010970,PERLA VENKATA ARUN KUMAR,B.Tech.-CSE III - O,rajasekhar_muvva@srmap.edu.in,51
AP21110010865,PONNAM VENKATA AVINASH CHOWDARI,B.Tech.-CSE III - N,avinash_ponnam@srmap.edu.in,22
AP21110011468,VADITHE VENKATA DEVENDRA NAIK,B.Tech.-CSE III - U,ajay_uyyala@srmap.edu.in,28
AP21110010915,UPPALURI VENKATA NAGA SAI ABHINAV,B.Tech.-CSE III - O,sivanagamalleswar_n@srmap.edu.in,29
AP21110010943,CHUNDURU VENKATA NAGA SAI KUMAR,B.Tech.-CSE III - O,dheeraj_pulime@srmap.edu.in,23
AP21110010874,CHAPPARAM VENKATA NAGA SAI SRIYA,B.Tech.-CSE III - N,nagasaisriya_chapparam@srmap.edu.in,18
AP21110010898,SANKURU VENKATA NAGA YASWANTH,B.Tech.-CSE III - N,yaswanth_sankuru@srmap.edu.in,26
AP21110010895,SINGOTHU VENKATA SAI KRISHNA MANIKANTA,B.Tech.-CSE III - N,krishnamanikanta_singothu@srmap.edu.in,31
AP21110011442,GORJA VENKATA SAI NIKHILA,B.Tech.-CSE III - U,sharanchiranjeevulu_m@srmap.edu.in,76
AP21110010884,PETETI VENKATA SUBRAHMANYA SASIDHAR,B.Tech.-CSE III - N,sasidhar_peteti@srmap.edu.in,17
AP21110010933,KOMALLI VENKATESH,B.Tech.-CSE III - O,bhargav_thota@srmap.edu.in,48
AP21110010960,RAHUL VIJAY SINGH,B.Tech.-CSE III - O,jaivardhansai_m@srmap.edu.in,62
AP21110010873,GURRAPUSALA VISHNU,B.Tech.-CSE III - N,vishnu_gurrapusala@srmap.edu.in,42
        
