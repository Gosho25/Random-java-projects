class User{
    public String username;
    public String email;
    private String location = "unset";

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void info(){
        System.out.println("Username " + this.username);
        System.out.println("Email " + this.email);
        System.out.println("Location "+ this.location);
    }
}