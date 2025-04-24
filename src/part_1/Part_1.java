
package part_1;

/**
 *Student Name: Qhama Hobongwana
 * Student Number:ST10465226
 * Assignment Part 1
 * 
 */
public class Part_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registration registration = new Registration();
         Login login = new Login(registration);
        login.setVisible(true);
                
    }
    
}
