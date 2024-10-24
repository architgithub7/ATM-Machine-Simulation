# ATM-Machine-Simulation


### Problem Statement: 
You are tasked with developing a simple simulation of an ATM (Automated Teller Machine) that provides essential banking services such as checking account balance, withdrawing money, and depositing money. The system must ensure secure access by requiring users to enter a valid PIN before accessing any services. If the entered PIN is incorrect, the system will prompt the user to re-enter the correct PIN until the correct one is provided.

### Features:

1. *PIN Authentication:*
   - The user must enter a correct 4-digit PIN  to access the ATM services.
   - If an incorrect PIN is entered, the system displays an error message and prompts the user to re-enter the PIN until the correct PIN is provided.

2. *Menu Options:*
   - After successful PIN entry, the user is presented with a menu of services:
     - Check Account Balance
     - Withdraw Money
     - Deposit Money
     - Exit

3. *Check Account Balance:*
   - The system displays the current balance in the user's account.

4. *Withdraw Money:*
   - The user can withdraw money by entering the desired amount.
   - If the entered amount exceeds the account balance, the system displays an "Insufficient balance" message.
   - If the user attempts to withdraw the exact balance, the system prevents the transaction, as the account cannot have a zero balance.
   - The system updates the balance and displays the remaining balance after a successful transaction.

5. *Deposit Money:*
   - The user can deposit money into their account by entering the amount to be deposited.
   - The system updates the account balance and displays the new balance after the deposit.

6. *Exit:*
   - The user can choose to exit the ATM system.

### Requirements:

1. *PIN Validation:*
   - Ensure that only users who input the correct PIN  can access the ATM services.
   
2. *Balance Management:*
   - The system should maintain and update the user's balance after each deposit or withdrawal.

3. *Error Handling:*
   - Handle cases where users attempt to withdraw more than the available balance or withdraw the exact balance.

4. *User Interface:*
   - Display appropriate messages to guide users through the process and provide feedback for each action.

*Instructions:*

- Implement the functionality using Java.
- Make use of Scanner class for user input.
- Ensure the program loops back to the main menu after each transaction until the user chooses to exit.

