import java.sql.Time;
import java.util.*;
import java.lang.*;
import java.util.List;
import java.util.Scanner;
import MyPackage.login;

class Collection_java{
    public static void main(String args[]){
customer[] customers = new customer[4];
customers[0] = new customer(21, "Ashwin", "9900160224", 6970);
customers[1] = new customer(22, "Divya", "9800160224", 6971);
customers[2] = new customer(23, "Piu", "9900169224", 6972);
customers[3] = new customer(24, "Raj", "9900166224", 6973);
ArrayList<customer> list_customers=new ArrayList<customer>();//Creating arraylist  
Collections.addAll(list_customers, customers);//Adding object in arraylist

//Traversing list through Iterator  
Iterator<customer> arr=list_customers.iterator();//getting the Iterator  
while(arr.hasNext()){//check if iterator has the elements  
customer dr  = arr.next();
System.out.println("New customer: " + dr.cust_name);//printing the element and move to next  
}
System.out.println("Enter customer (index): ");
Scanner sc = new Scanner(System.in);
int random = sc.nextInt();
sc.close();
if(list_customers.get(random).cust_name == "Divya"){
    System.out.println("Found");
}

if(list_customers.contains(customers[1])){
    System.out.println("Available");
}

System.out.println("Number of customers:" + list_customers.size());


drug[] drugs = new drug[3];
drugs[0] = new drug(12, "avil", "cold", 4);
drugs[1] = new drug(13, "vittol", "vitamin", 2);
drugs[2] = new drug(18, "capsul-D", "calc-bone", 1);
drugs[3] = new drug(19, "Jamazil-k", "headache", 5);


   
System.out.println("\t\t-LINKED LIST-");

LinkedList<drug> list_drugs=new LinkedList<drug>();//Creating arraylist  
Collections.addAll(list_drugs, drugs);//Adding object in arraylist

//Traversing list through Iterator  
Iterator<drug> ptr=list_drugs.iterator();//getting the Iterator  
while(ptr.hasNext()){//check if iterator has the elements  
drug dr = ptr.next();
System.out.println("New drug added: " + dr.name);//printing the element and move to next  
}

System.out.println("Last drug is: " + list_drugs.removeLast().name);
        
list_drugs.add(20, drugs[2]);
Iterator<drug> ptr1=list_drugs.iterator();//getting the Iterator  
while(ptr1.hasNext()){//check if iterator has the elements  
    drug pat1 = ptr1.next();
    System.out.println("New drug added : " + pat1.name);//printing the element and move to next  
}
Company[] companys=new Company[3]; 
companys[0] = new Company("apollo","jayanagar");
companys[1] = new Company("medex","khushinagar");
companys[2] = new Company("Ymedicine","jagdishpur");

System.out.println("\t\t---------HASH SET----------");

        HashSet<Company> list_company=new HashSet<Company>();//Creating arraylist  
        Collections.addAll(list_company, companys);//Adding object in arraylist
        System.out.println("Hash set is empty? " + list_company.isEmpty());

        //Traversing list through Iterator  
        Iterator<company>  I =list_company.iterator();//getting the Iterator  
        while(I.hasNext()){//check if iterator has the elements  
        company c = I.next();
        System.out.println("New company: " + c.name);//printing the element and move to next  
        }
        
        System.out.println("HashCode: " + list_company.hashCode());   





       
    }
}


class drug extends Branches implements stock
{
    public int d_id;
    public String name;
    public String description;
    public int quantity;
    public float cost;
    public int drug_rating;

    static String drug_type1;
    static String drug_type2;
    static String drug_type3;

    static{
        drug_type1 = "minors";
        drug_type2 = "adults";
        drug_type3 = "seniors";
    }

    //constructor overloading and chaining
    public drug(int d_id, String name,String description,int quantity)
    {
        super();
        this.d_id=d_id;
        this.name=name;
        this.description=description;
        this.quantity=quantity;
    }
    public drug(int d_id, String name,String description,int quantity, float cost)
    {
        this(d_id, name, description, quantity);
        this.cost = cost;
    }
    public drug(drug obj)
    {
        this(obj.d_id, obj.name, obj.description, obj.quantity, obj.cost);
    }

    public static void printDrugTypes()
    {
        System.out.println("Drug Type 1: "+drug_type1);
        System.out.println("Drug Type 2: "+drug_type2);
        System.out.println("Drug Type 3: "+drug_type3);
    }
    

    static class DrugCountry
    {
        void IndiaDrug()
        {
            System.out.println("Drug manufactured from India.");
        }
    }

    public void update_cost(){
        float new_price;
        Scanner sc=new Scanner(System.in);
        new_price = sc.nextFloat();
        this.cost=new_price;
        sc.close();
    }

    private float calculate_cost(int d_id){
        float total_cost;
        total_cost = this.cost * this.quantity;
        System.out.println("Amount paid: "+ this.cost);
        return total_cost;
    }

    public int update_quantity(int purchased){
        int new_quantity = this.quantity;
        new_quantity -= purchased;
        return new_quantity;
    }

    public void generate_bill(){
        float amount = this.calculate_cost(this.d_id);
        System.out.println("\n");
        System.out.println("Drug id: "+this.d_id);
        System.out.println("Drug name: "+this.name);
        System.out.println("Quantity purchased: "+this.quantity);
        System.out.println("Amount paid: "+ amount);
    }

    public void add_drug(){
        super.add_drug();
        System.out.println("enter drug id:");
        Scanner sc = new Scanner(System.in);
        int d_id = sc.nextInt();
        if( this.d_id == d_id && this.quantity < 5){
            System.out.println("This drug needs to be added" +d_id);
        
        }
    }

}

class customer extends Order{
    public int cust_id;
    public String cust_name;
    public String phone_no;
    public int presc_id;

    customer (){}

    public customer(int cust_id, String cust_name, String phone_no, int presc_id)
    {
        this.cust_id = cust_id;
        this.cust_name= cust_name;
        this.phone_no = phone_no;
        this.presc_id = presc_id;
    }

    //function overloading
        public void search_drug(String c){
        //String Class
        String d = new String("Dolo"); 

        if(c == d){
            System.out.println("You searched for Dolo");
        }
        else{
            System.out.println("You searched for " + c);
        }

        d.concat(" ,its for pain");
        System.out.println("Your drug is still " + c);

      

        d = d.concat(" -500mg");
        System.out.println("Your drug is " + d);

        long startTime = System.currentTimeMillis();  

        //StringBuffer Class
        StringBuffer c2 = new StringBuffer("Citrazine");
        StringBuffer sb_c = new StringBuffer("Citrazine"); 

        if(c2 == sb_c){
            System.out.println("You searched for Citrazine");
        }
        else{
            System.out.println("You searched for " + c);
        }

        sb_c.append(" - it is StringBuffer  ");
        System.out.println("Your drug is now " + sb_c);

    

        sb_c = sb_c.append(" - General");
        System.out.println("Your drug is " + sb_c);

        for (int i=0; i<100000; i++){  
            sb_c.append("buffer");  
        }  
        System.out.println("Time by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  

        //StringBuilder Class
        startTime = System.currentTimeMillis();  
       
        StringBuilder category3 = new StringBuilder("Paracetamol");
        StringBuilder sbc_category = new StringBuilder("Paracetamol"); 

        if(category3 == sbc_category){
            System.out.println("You searched for Paracetamol");
        }
        else{
            System.out.println("You searched for " + c);
        }

        sbc_category.append(" - StringBuilder Will Update");
        System.out.println("Your drug is still " + sbc_category);


        sbc_category = sbc_category.append(" - General");
        System.out.println("Your drug is " + sbc_category);

        for (int i=0; i<100000; i++){  
            sbc_category.append("builder");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }

//datatype overloading
    public void search_drug(int drug_id)
    {
        drug d = new drug(2,"dolo","painkiller",2,90);
        if(d.d_id == drug_id){
            System.out.println("You searched for drug id: "+drug_id+". dose  = "+d.cost);
        }
        else{
            System.out.println("no drug with that name");
        }
    }

//number of arguments
    public void search_drug(int drug_id, String drug_name)
    {
        drug d = new drug(2,"dolo","painkiller",2,90);
        if(d.name == drug_name && d.d_id == drug_id){
            System.out.println("You searched for drug id: "+drug_id+" and drug name: "+drug_name+". dose  = "+d.cost);
        }
        else{
            System.out.println("no drug with that name");
        }
    }

    public void order_drug(int drug_id){
        drug d = new drug(2,"dolo","painkiller",2,90);
        d.generate_bill();
    }

    public void rate_drug(int d_id, int rating){
        drug drug1 = new drug(2,"dolo","painkiller",2,90);
        if(drug1.d_id == d_id){
            drug1.drug_rating = rating;
        }
        else{
            System.out.println("Drug id NOT FOUND");
        }
    }

    //public void emergengy(){
        //don't know how to implement this
    //}
}

class Branches extends Company  {
    public int b_id;
    public String name ;
    public String address;
    public int year = 10;
    public int times_visited;
    public double total_revenue;
    public double total_expense;


     public Branches(){}
    
    public Branches(int b_id, String name,int year,int times_visited, double  total_revenue, double total_expense)
    {
        this.b_id= b_id;
        this.name = name;
        this.year = year;

        this.times_visited = times_visited;
        this.total_revenue = total_revenue;
        this.total_expense = total_expense;
    }
   

    public void visited(int min)
    {
        if(this.times_visited > min)
        {
            System.out.println("The Branch is visited by Enough: "+name);
        }
        else
        {
            System.out.println("The Branch is not Visited much: "+name);
        }
    }

    private double yearly_profit(int b_id){
        double profit;
        profit = (total_revenue-total_expense);
        return profit;
    }

    public void generate_report(){
        double yearly_profit = this.yearly_profit(this.b_id);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter branch-id");
        this.b_id = sc.nextInt();
        System.out.println("Branch id: "+this.b_id);
        System.out.println("Enter branch-name");
        this.name = sc.next();
        System.out.println("Branch name: "+this.name);
        System.out.println("Enter year");
        this.year = sc.nextInt();
        System.out.println("Year: "+this.year);
        //super variable demonstration
         System.out.println("Company Year: "+super.years);
        System.out.println("The Yearly profit is: "+ yearly_profit);
       
    } 
    // final keyword demonstration
//    public void checking(){
//        System.out.println("go");
//    }
}

interface stock{
   
   public void generate_alert();
   default void add_drug(){
       System.out.println("add to stock"); 
   }
   public static void printDrugTypes(String drug_type)
    {
        if(drug_type == "type1")
        {
            System.out.println("Drug Type 1: minor");
        }
        else if(drug_type == "type2")
        {
            System.out.println("Drug Type 2: senior");
        }
        else if(drug_type == "type3")
        {
            System.out.println("Drug Type 3: others");
        }
        else
        {
            System.out.println("Drug type not found");
        }
    }


}
 class Company implements stock{
    public int comp_id;
    public String name;
    public String address;
    public int years = 5;
    public int sales;
    public double profit;
    

    

    public Company(){
        Scanner sc= new Scanner(System.in);
        this.comp_id = sc.nextInt();
    }

    public Company(String name,String address){
        this.name = name;
        this.address = address;
         System.out.println("Enter your sales:");
         this.sales = sales;
         Scanner sc = new Scanner(System.in);
        this.sales = sc.nextInt();
      
    }

   public void  generate_sales(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the company name");
       this.name = sc.next();
       System.out.println("Enter the address:");
      this.address = sc.next();
      System.out.println("company name: "+this.name);
       System.out.println("address: "+this.address);
        // System.out.println("CHECKING"); 
   }

        public void generate_alert(){
           System.out.println("The company id:"+this.comp_id);
            if(this.sales > 0 && this.sales < 30 ){
                // System.out.println("Enter your sales:");
                profit = ((this.sales/30.0)* 100);
                System.out.println("Profit monthly:"+profit);
               
            }
            
        } 

        final void checking(){
            System.out.println("hello there");
        }
 }

 abstract class Order{
     int o_id;
    int quantity;
    String status;

     abstract public void order_drug(int drug_id);

    public void show(){
        System.out.println("Abstraction can have method with definition");
    }

 }


class report implements A.user{
 public void most_sold(){
     System.out.println("NESTED INTERFACE");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int sales = sc.nextInt();
    if(sales > 10){
        System.out.println("Name:"+name);
    }

}
}

 class A{
    interface user{
        public void most_sold();
    }}
