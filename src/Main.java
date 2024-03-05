import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args){
        // showMenu();
        Doctor doctorMemo = new Doctor("Memo", "Dentista");
        Doctor doctorPedro = new Doctor("Pedro", "Plastico");
        System.out.println(doctorMemo.name + " " + doctorMemo.speciality);
        System.out.println(Doctor.id);
    }
    
}