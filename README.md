Welcome to APROiris, program with helps in analysing irises data set.
1. How to start?
   -Run Main.java	 
   -first of all you have to load data set with 'load' command
   -print data set with 'print' command
   -start analyzing data with commands from section 2
   -to exit type 'exit'
2. Commands list
   -'load' - loading data set from Iris.csv
   -'print' - printing data to console
   -'exit' - exit the program
   -'average [number of column(1-4)]' - counts arithmetic average of elements in given column
   -'median [number of column(1-4)]' - counts median of elements in given column
   -'max [number of column(1-4)]' - returns the greatest element in given column
   -'min [number of column(1-4)]' - returns the smallest element in given column
   Example: 'average 1' should return 5.8433347
   -'averageOf [number of column(1-4)] [spacies name]' - counts arithmetic average of elements in given column for given species
   -'medianOf [number of column(1-4)] [spacies name]' - counts median of elements in given column for given species
   -'maxOf [number of column(1-4)] [spacies name]' - returns the greatest element in given column for given species
   -'minOf [number of column(1-4)] [spacies name]' - returns the smallest element in given column for given species
   Example: 'medianOf 2 Iris-virginica should return 3.25
   -'count [spacies name]' - return number of record where spacies name occurs
   -'save' - saving data to JSON file
3. Files
   -Iris.csv- It is the file that contains data set. It is possible to edit this file and add new records as long as the format of data doesn't change.
   -operations.txt- this file contains list of all operations and results done by program.
   -Iris.json- it is possible to export data to this file using 'save' command