public class House {
    double width;
    double depth;
    House(double w, double d) {
        width = w;
        depth = d;
    }
    double area() {
        return width * depth;
    }
}

class HouseDemo2 {
    public static void main(String args[]) {
        House myhouse1 = new House(20,25);
        House myhouse2 = new House(15,20);

        double area;

        area = myhouse1.area();
        System.out.println(+area);

        area = myhouse2.area();
        System.out.println(+area);
        }
        }