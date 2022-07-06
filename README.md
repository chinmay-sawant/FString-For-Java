
# FString-For-Java

Hello Everyone,

Below is the program created for implementing F String in Java.
(A pythononic way to call variables but in java)

This program was created by me while I was learning Java.

Program uses Java's reflection API while helps to resolve the variables.




## Features

- Pass the string



## Usage/Examples

### This is tested if the variable is public. Code is open for any improvements/suggestions.


```Java
import <path to fString>FString

FString fs = new FString(); // Create Instance For FString
YourClass I1=new  YourClass(); // Where the variables are declared 
example -
public int a = 10;
fs.fprint(YourClassInstance,"Your Message {yourPublicvariable}"); /
fs.fprint(I1,"Hello There {a}"); // This Prints the Output
output - Hello There 10

```


## Authors

- [@Chinmay Sawant](https://www.github.com/chinmay-sawant)

