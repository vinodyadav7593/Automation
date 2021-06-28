Feature: As a system, I want to edit account details
Scenario Outline: Verify that application allows user to edit first name
Given user launch browser
When user enter url
And user click on signin link
And user enter emailaddress as "<emailAddress>"
And user click on create account button
And user enter firstname as "<firstName>"
And user enter lastname as "<lastName>"
And user enter password as "<password>"
And user enter address as "<address>"
And user enter city as "<city>"
And user select state as "<state>"
And user enter postalcode as "<postalCode>"
And user enter phonenumber as "<phoneNumber>"
And user enter alias as "<alias>"
And user click register button
Then verify new account created "<accountDetails>"
And user click on my perosnal information
And user edit firstname as "<editFirstName>"
And user enter current password as "<password>"
And user click on save button
Then user should see first name updated "<updatedAccountDetails>"
Examples:
|emailAddress            |firstName|lastName|password  |address|city|state|postalCode|phoneNumber|alias|accountDetails|editFirstName|updatedAccountDetails|
|prabha234@mailinator.com|Prabha   |Karri   |prabha@123|test   |test|5    |11111     |1234567891 |test |Prabha Karri  |Test         |Test Karri           |

Scenario Outline: Verify for placing order
Given user launch browser
When user enter url
And user click on signin link
And user enter username as "<userName>"
And user enter login password as "<password>"
And user click on login button
And user enter item "<item>" in the search box
And user click on search button
And user click on image
And user click on add to cart button
And user click on proceed to check out option in signin tab
And user click on proceed to check out option in address tab
And user click on terms of service check box
And user click on proceed to check out option in shipping tab
And user click on paybankwire option
And user click on confirm order option
Then user should see order placed succesfully
Examples:
|userName                |password  |item    |
|prabha234@mailinator.com|prabha@123|T shirt |


