import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static HOTEl_RESERVATIONSYS.hotelreservationsystem.*;


public class app {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// downloading the driver  that are important fo the data base
//             the exaption is class not found in the above
        } catch (ClassNotFoundException e) {
            System.out.println(" the  error is " + e.getLocalizedMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            // est the connection between the java nad sql  get into  the data base
            while (true) {
                System.out.println();
                System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.println("choice option");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        reserveRoom(connection, scanner);
                        break;
                    case 2:
                        viewReservations(connection);
                        break;
                    case 3:
                        getRoomNumber(connection, scanner);
                        break;
                    case 4:
                        updateReservation(connection, scanner);
                        break;
                    case 5:
                        deleteReservation(connection, scanner);
                        break;
                    case 0:
                        exit();
                        scanner.close();
                        return;
//                         exit fromthe loop
                    default:
                        System.out.println("Invalid choice. Try again.");
                        // if user does not choice fromthe defaut choice
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
