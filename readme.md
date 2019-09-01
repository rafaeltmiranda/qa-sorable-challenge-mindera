QA Sortable Challenge
======================================
This repository is my solution for the Mindera's QA Sortable Challenge.


Pre-requisites
--------------

    Java
    Maven
    
    
How to work with this repository
--------------------------------

## Step 1

Install and run the selenium server locally on your computer.

    java -jar selenium-server-standalone-3.141.59.jar -role hub
    java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register

## Step 2

Make sure you are running the app that these tests refer to at http://localhost:3000.
You can get it in this repository https://bitbucket.org/mindera/qa-sortable-challenge.

## Step 3

Run the tests and enjoy :)