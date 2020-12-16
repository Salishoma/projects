package school.department;

public class Staffs{

    private final String name;
    private final String designation;

    public Staffs(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void park(){
        if(designation.toLowerCase().equals("teacher") || designation.toLowerCase().equals("principal")){
            System.out.println(name + ".parked()");
        } else {
            System.out.println("Parking space restricted");
        }
    }

    public void teach(String subject){
        if(designation.toLowerCase().equals("teacher")){
            System.out.println(getName() + " teaches " + subject);
        }else{
            System.out.println(getName() + " is not a teacher");
        }
    }
}
