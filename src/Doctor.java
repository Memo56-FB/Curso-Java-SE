public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    //Comportamientos
    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
