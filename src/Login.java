import java.util.Scanner;

class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User er kach theke input nowa
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter company domain (e.g. hamk.fi): ");
        String domain = scanner.nextLine();

        // Step 2: First name ba last name empty kina check kora
        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Error! First and/or last name is missing");
            scanner.close();
            return; // program ekhanei shesh
        }

        // Step 3: Duita method call kora
        GenerateEmail(firstName, lastName, domain);
        GenerateUsername(firstName, lastName);

        scanner.close();
    }

    // Email toiri kore: firstname.lastname@domain (sob lowercase)
    public static void GenerateEmail(String firstName, String lastName, String domain) {
        String email = firstName + "." + lastName + "@" + domain;
        System.out.println("Email: " + email.toLowerCase());
    }

    // Username toiri kore: first name er prothom 4 letter + last name er shesh 4 letter
    public static void GenerateUsername(String firstName, String lastName) {
        String firstPart = firstName.substring(0, 4);
        String lastPart = lastName.substring(lastName.length() - 4);
        String username = firstPart + lastPart;
        System.out.println("Username: " + username.toLowerCase());
    }
}