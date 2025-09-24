package lab1;
import javax.swing.JOptionPane;

public class task1 {
    public static void main(String[] args) {
        String distkmstr;
        double distkm;

        distkmstr = JOptionPane.showInputDialog("Input distance in kilometers");
        distkm = Double.parseDouble(distkmstr);
        System.out.println("Distance in km "+ distkm);

        double distsazhen = distkm * 469;
        System.out.println("Distance in sazhen "+ distsazhen);

        double distvershok= distkm * 22.490;
        System.out.println("Distance in vershok "+ distvershok);
    }
}

