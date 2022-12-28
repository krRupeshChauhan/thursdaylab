//1.Write program to show method overriding using a Bank class as super class and create some sub class accordingly. Write at least common property (method) and change the implementation in subclass.
// Display the implementation of each subclass with object.
class Bank{ //this is parent class
    int getRAteOfInterest(){
        return(0);
    }
}
class SBI extends Bank{  //This is the child class inheriting and overriding parent class method with implementation
    int getRAteOfInterest(){
        return(5);
    }
}
class AXIS extends Bank{  //This is the child class inheriting and overriding parent class method with implementation
    int getRAteOfInterest(){
        return(7);
    }
}
class HDFC extends Bank{  //This is the child class inheriting and overriding parent class method with implementation
    int getRAteOfInterest(){
        return(9);
    }
}
public class BankClassUsingMethodOverriding {
    public static void main(String[]args){
        SBI obj1=new SBI();
        AXIS obj2=new AXIS();
        HDFC obj3= new HDFC();
        System.out.println("Get rate of interest for Sbi bank:"+obj1.getRAteOfInterest());
        System.out.println("Get rate of interest for Axis bank:"+obj2.getRAteOfInterest());
        System.out.println("Get rate of interest for Hdfc bank:"+obj3.getRAteOfInterest());
    }
}

