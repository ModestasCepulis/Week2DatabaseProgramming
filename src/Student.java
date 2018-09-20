public class Student {

    private int ID = 0;
    private String name = null;
    private String address = null;

    public Student()
    {
        setName("");
        setAddress("");
    }
    public Student(String name, String address, int ID)
    {
        setName(name);
        setAddress(address);
        setID(ID);

    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}
    public void setID(int ID) {this.ID = ID;}
    public int getID() {return ID;}



}
