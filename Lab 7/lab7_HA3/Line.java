package lab7_ha3;
public class Line {
    private Point startpoint;
    private Point endpoint;
    
    public Line(Point startpoint, Point endpoint){
        this.startpoint=startpoint;
        this.endpoint=endpoint;
    }
    
    public Point getStartPoint(){
        return startpoint;
    }
    
    public void setStartPoint(Point startpoint){
        this.startpoint=startpoint;
    }
    
    public Point getEndPoint(){
        return endpoint;
    }
    
    public void setEndPoint(Point endpoint){
        this.endpoint=endpoint;
    }
    
    public double calculate(){
        double xdifference=endpoint.getX()-startpoint.getX();
        double ydifference=endpoint.getY()-startpoint.getY();
        return Math.sqrt(Math.pow(xdifference,2)+Math.pow(ydifference,2));
    }
}