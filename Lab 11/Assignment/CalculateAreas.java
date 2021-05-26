package lab.pkg11.assignment;

public class CalculateAreas {
    static double[] build_array(Shape[] shapes) {
        double[] areas = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                areas[i] = shapes[i].area();
        }
        return areas;
    }

}
