
package part_1;

/**
 *
 * 
 */
  public class User {
      private static User instance;
    private String username;
    private String password;
     private String firstName;

    public User() {
    }
    
      public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username != null && this.username.equals(username) && this.password != null && this.password.equals(password);
    }
    
      public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
          
        
}
