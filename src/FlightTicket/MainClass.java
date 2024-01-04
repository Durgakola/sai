package FlightTicket;

public class MainClass {
    public static void main(String[] args) {
        Booking b= new Booking();
        FlightTicket ticket=b.booking(5000,new PassPort("DileepChakravathi","Guntur",1970,23432123,"Kola.DileepChakravarthi"),new Customer1("kanakadurga",23,1234567890,"Taduvai"));
//        b.booking(new PassPort("DileepChakravathi","Guntur",1970,23432123,"Kola.DileepChakravarthi"),new Customer1("kanakadurga",23,1234567890,"Taduvai"));
//        PassPort passPort=new PassPort("DileepChakravathi","Guntur",1970,23432123,"Kola.DileepChakravarthi");
//        Customer1 customer1=new Customer1("kanakadurga",23,1234567890,"Taduvai");
        System.out.println(ticket);
    }

}
