Welcome to APROiris, program with helps in analysing irises data set.
1. How to start?
   1. Run Main.java
   2. first of all you have to load data set with 'load' command
   3. print data set with 'print' command
   4. start analyzing data with commands from section 2
   5. to exit type 'exit'
2. Commands list
   1. 'load' - loading data set from Iris.csv
   2. 'print' - printing data to console
   3. 'exit' - exit the program
   4. 'average [number of column(1-4)]' - counts arithmetic average of elements in given column
   5. 'median [number of column(1-4)]' - counts median of elements in given column
   6. 'max [number of column(1-4)]' - returns the greatest element in given column
   7. 'min [number of column(1-4)]' - returns the smallest element in given column
   8. Example: 'average 1' should return 5.8433347
   9. 'averageOf [number of column(1-4)] [spacies name]' - counts arithmetic average of elements in given column for given species
   10. 'medianOf [number of column(1-4)] [spacies name]' - counts median of elements in given column for given species
   11. 'maxOf [number of column(1-4)] [spacies name]' - returns the greatest element in given column for given species
   12. 'minOf [number of column(1-4)] [spacies name]' - returns the smallest element in given column for given species
   13. Example: 'medianOf 2 Iris-virginica should return 3.25
   14. 'count [species name]' - return number of record where species name occurs
   15. 'save' - saving data to JSON file
3. Files
   1. Iris.csv- It is the file that contains data set. It is possible to edit this file and add new records as long as the format of data doesn't change.
   2. operations.txt- this file contains list of all operations and results done by program.
   3. Iris.json- it is possible to export data to this file using 'save' command