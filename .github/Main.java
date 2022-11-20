import java.util.ArrayList;
import java.util.Scanner;


class Inventory {
  public String name;
  public String serial;
  public int value;
  public int index;

   public Inventory(){
     
   }
  public Inventory(String name, String serial, int value){
    this.name = name;
    this.serial = serial;
    this.value = value;
    
  }
   @Override
	public String toString() {
		return name + "," + serial + "," + value;
	}
  public void print() {
        System.out.println(name + "," + serial + "," + value);
}
  public String getName() {
    return name;
  }
  public String getSerial() {
    return name;
  }
public void setName(String name) {
        this.name = name;
        
  
    }
  public void setValue(int value) {
        this.value = value;
  
  }
  
} 
class Main {
 




  
	public static void main(String[] args) {
    ArrayList<Inventory> array = new ArrayList<Inventory>();
    int select;
    Inventory x = new Inventory();
    
     
    Scanner sc = new Scanner(System.in);
    do{
      
    
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
       select = sc.nextInt();
      sc.nextLine();
      if(select == 1){
         
    System.out.println("Enter the name: ");
    String name = sc.nextLine();
      
        System.out.println("Enter the serial number:");
        String serial = sc.next();
        
        
   System.out.println("Enter the value in dollars (whole number):");
       int value = sc.nextInt();
        
     x = new Inventory(name, serial, value);
       
    array.add(x);
     
        
      }
       else if(select == 2){
        System.out.println("Enter the serial number of the item to delete:");
      
         String rSerial = sc.next();
        for(int s = 0;s < array.size(); s++){
          if(rSerial.equals(array.get(s).serial)){
            array.remove(s);
          }
        }
        
          }
        
            
            
         

      

         
                    
      
       
         
         
         
         
         
         
         
         
       
    
        
    
   
      
      else if(select == 3){
        System.out.println("Enter the serial number of the item to change:");
        String nSerial = sc.nextLine();
        System.out.println("Enter the new name:");
      String newName = sc.nextLine();
        System.out.println("Enter the new value in dollars (whole number):");
        int newValue = sc.nextInt();
        for(int s = 0;s < array.size(); s++){
          if(nSerial.equals(array.get(s).serial)){
            Inventory c = array.get(s);
            c.setName(newName);
            c.setValue(newValue);
          }
        
        }
      }
        
        
       
      
        //Inventory c = array.get(index);
      //c.setName(newName);
      //c.setValue(newValue);}
      else if(select == 4){
        for (Inventory inv : array)
	      { 		      
	           inv.print();		
	      }
    }

        
      } while(select != 5);
      
      
    sc.close();
   
    
	}

 }	


