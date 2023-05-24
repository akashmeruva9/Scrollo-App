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

        
