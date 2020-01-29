import java.util.Scanner;

public class BusTicket {
    String name;
    int age,id;
    String Seat_no,address;

    public void process(){
        System.out.println("enter your name sir : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Enter your age : ");
        age = sc.nextInt();

        if (age < 18){
            System.out.println("Children not allowed !!!");
            process();
        }

        System.out.println("Enter your id sir : ");
        id = sc.nextInt();

        System.out.println("Enter your address : ");
        address = sc.next();

        if (id>1000){
            Seat_no = "A2";
        }
        else if (id > 10000){
            Seat_no = "B2";
        }
        else {
            Seat_no = "C1";
        }

                System.out.println("Your Name : "+name);
                System.out.println("Your Age : "+age);
                System.out.println("Your Id : "+id);
                System.out.println("Your Address : "+address);
                System.out.println("Your Seat no is : "+Seat_no);
        }
    }
