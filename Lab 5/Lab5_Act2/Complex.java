package lab5_Act2;
public class Complex {
    private int real;
    private int img;
            
    public Complex()
    {
        real=0;
        img=0;
    }
    
    public Complex(int r,int i)
    {
        real=r;
        img=i;
    }
    
    public Complex Add(Complex B)
    {
        Complex R=new Complex(real+B.real,img+B.img);
        return R;
    }
    
    @Override
    public String toString()
    {
        return "("+this.real+" , "+this.img+"i )";
    }
    
    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    
    public void Show () 
{ 
    System.out.println(real+img);
}
    
}
