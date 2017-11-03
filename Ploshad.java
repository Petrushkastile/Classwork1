import java.util.Scanner;

public class Ploshad {
   public static void main(String[] args) {
        Scanner koordinati = new Scanner(System.in);
        System.out.println ("Введите координаты вершины А треугольника: ");
        double xA = koordinati.nextDouble();
        double yA = koordinati.nextDouble();
        System.out.println ("Введите координаты вершины B треугольника: ");
        double xB = koordinati.nextDouble();
        double yB = koordinati.nextDouble();
        System.out.println ("Введите координаты вершины C треугольника: ");
        double xC = koordinati.nextDouble();
        double yC = koordinati.nextDouble();
        double dlinastoroniA = Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
        double dlinastoroniB = Math.sqrt((xA - xC) * (xA - xC) + (yA - yC) * (yA - yC));
        double dlinastoroniC = Math.sqrt((xB - xC) * (xB - xC) + (yB - yC) * (yB - yC));
        if (dlinastoroniA + dlinastoroniB <= dlinastoroniC || dlinastoroniA + dlinastoroniC <= dlinastoroniB || dlinastoroniA + dlinastoroniC <= dlinastoroniB)
            System.out.println("Это шляпа а не треугольник");
        else {
            double poluperimetr = (dlinastoroniA + dlinastoroniB + dlinastoroniC) / 2.0;
            double ploshad = Math.sqrt(poluperimetr * (poluperimetr - dlinastoroniA) * (poluperimetr - dlinastoroniB) * (poluperimetr - dlinastoroniC));
            System.out.println("Площадь треугольника: " + ploshad);
        }
    }
    }


