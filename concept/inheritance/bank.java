// Parent Class: Bank
class Bank {
    String bankName;
    String branchName;
    String ifscCode;

    // Constructor
    Bank(String bankName, String branchName, String ifscCode) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    // Method to display bank details
    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
    }
}

// Subclass: Branch
class Branch extends Bank {
    String accHolderName;
    int accNumber;

    // Constructor
    Branch(String bankName, String branchName, String ifscCode, String accHolderName, int accNumber) {
        super(bankName, branchName, ifscCode);
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
    }

    // Method to display account holder details
    void displayAccHolderDetails() {
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Number: " + accNumber);
    }
}

// Service Class: Service to access properties
class Service {
    public static void main(String[] args) {
        // Object of Parent Class (Bank)
        Bank bank = new Bank("State Bank", "Main Branch", "SBIN0001234");
        bank.displayBankDetails();

        // Object of Sub Class (Branch)
        Branch branch = new Branch("State Bank", "Main Branch", "SBIN0001234", "John Doe", 123456789);
        branch.displayAccHolderDetails();

        // Accessing properties using the Service class
        Service service = new Service();
        service.accessBankProperties(bank);
        service.accessBranchProperties(branch);
    }

    void accessBankProperties(Bank bank) {
        System.out.println("\nAccessing through Service Class:");
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Branch Name: " + bank.branchName);
    }

    void accessBranchProperties(Branch branch) {
        System.out.println("Account Holder Name: " + branch.accHolderName);
    }
}
