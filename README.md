Best Stock Price Calculator 
===================

Stock calculator is built using Kotlin 

Prerequisite 
============

- Java 8

Tests 
=====
  
    Run tests using: ./gradlew test
    
    Output: 
    
    In the console, you will be able to see response in following format:
    
     16:20:46.989 [main] INFO  MainFunction - ====================================================================
     16:20:46.992 [main] INFO  MainFunction - Best Stock Price for given input is: 10 (buying for $1 and selling for $11)
     16:20:46.992 [main] INFO  MainFunction - ====================================================================
    
How to run the game
===================

To run the app:

    Run app using: ./gradlew run
    or if using intellij, right click on Main.kt and click run. (Note: While running from IntelliJ make sure right version of Kotlin is installed)
    
    When you will run the app, it will ask for the input request data. User will need to pass comma separated values as part of it. Only integer values are accepted.


Constraints
-----------

- If the stock price is declining steadily the lowest price will be shown as the buying and selling with no profit. 
  E.g. If stock prices are 5, 4, 3, 2, 1. The buying and selling price will both be $1 and profit will be $0.
  
- If the stock price is not changed at all, the buying and selling price will both be same and profit will be $0. 