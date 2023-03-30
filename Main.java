import java.util.Scanner;
import java.util.ArrayList;

class LawnTeam{
	ArrayList<Appointment> schedule = new ArrayList<>();
	public void makeAppointment(String customer, String address, String date, String servicetype){
		schedule.add(new Appointment(customer, address, date, servicetype));
	}
	public void makeAppointment(String customer){
		schedule.add(new Appointment(customer));
	}
}
class Appointment{
	public String customer, address, date, servicetype;
	public Appointment(String customer){ this.customer = customer;}
	public Appointment(String customer, String address, String date, String servicetype){
		this.customer = customer;
		this.address = address;
		this.date = date;
    this.servicetype=servicetype;
	}
}
class Main {
  public static void main(String[] args) {
    ArrayList<Appointment> schedule = new ArrayList<>(); 
   boolean keep = true;
    System.out.println("[WELCOME TO THE APPLICATION.]\n\n");
    while (keep){ 
  Scanner ss = new Scanner(System.in);
             if(schedule.size() >= 40){
            System.out.println("[ERROR]: Reached customer limit capacity.\n\n");
            System.out.println("Remove the previous entry? [TYPE Y OR YES:]\n\n");
            String d=ss.nextLine();
            if(d.equals("y")||d.equals("Y")|| d.equals("yes")|| d.equals("Yes")|| d.equals("YES")){
              schedule.remove(1);
            } 
            keep = false;
          }
       System.out.println("[PLEASE ENTER THE CUSTOMER NAME. TYPE THE CUSTOMER'S NAME AND PRESS ENTER:] [TO EXIT, PLEASE TYPE IN EXIT AND PRESS ENTER.]\n\n");
    String customer = ss.nextLine();
       if(customer.equals("EXIT")||customer.equals("exit")){ 
        keep = false;
        } else { 
        System.out.println("\n\n[ENTER THE CUSTOMERS ADDRESS AND PRESS ENTER:]\n\n");
        String address=ss.nextLine();
        System.out.println("\n\n[ENTER THE DATE REQUESTED BY THE CUSTOMER:] \n\n");
        String date=ss.nextLine();
         System.out.println("\n\n[ENTER THE SERVICE TYPE REQUIRED BY CUSTOMER:] [i.e. lawn service, arborist, weed control, etc.\n\n");
           String servicetype=ss.nextLine();
        System.out.println("\n\n[PRESS ENTER TO ADD A NEW ENTRY, TYPE N OR NO TO EXIT.]\n\n");
         String c = ss.nextLine();
         if(c.equals("n")||c.equals("N")||c.equals("no")||c.equals("NO")){
           keep = false;
         }
         schedule.add(new Appointment(customer, address, date, servicetype));
        Appointment currentAppointment = new Appointment(customer, address, date, servicetype);
        }
      }
      System.out.println("[CUSTOMER NAME: \t\t" + "ADDRESS: \t\t" + "DATE: \t\t" + "SERVICE TYPE]\n\n");
        for(Appointment currentApp : schedule){ System.out.println(currentApp.customer+"\t\t"+"\t\t"+currentApp.address+"\t\t\t"+currentApp.date+"\t\t"+currentApp.servicetype);
    }
  }
}





