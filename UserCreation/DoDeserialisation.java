public class DoDeserialisation {
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private int userStatus;

    public DoDeserialisation() {
        this.id = 1;
        this.username="john123";
        this.firstname="john";
        this.lastname="peter";
        this.email="john123@gmail.com";
        this.password="123224";
        this.phone="98754332";
        this.userStatus=10;
    }




    public void setId (int id){
        this.id= id;
    }


    public void setUsername (String username){
        this.username=username;
    }


    public void setFirstname (String firstname){
        this.firstname = firstname;
    }


    public void setLastname (String lastname){
        this.lastname = lastname;
    }


    public void setEmail (String email){
        this.email = email;
    }


    public void setPassword (String password){
        this.password = password;
    }


    public void setPhone (String phone){
        this.phone = phone;
    }


    public void setUserStatus (int userStatus){
        this.userStatus = userStatus;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public int getUserStatus() {
        return userStatus;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

}
