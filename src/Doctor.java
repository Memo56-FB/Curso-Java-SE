public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;
    //Comportamientos
    Doctor(String name, String speciality, String email) {
        id++;
        this.name = name;
        this.speciality = speciality;
        this.email = email;
    }
    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
