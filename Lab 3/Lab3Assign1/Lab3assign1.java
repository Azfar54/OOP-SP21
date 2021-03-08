package lab3assign1;

public class Lab3assign1 {
    public int physics;
    public int maths;
    public int computerscience;
    
public Lab3assign1(){
    physics=80;
    maths=74;
    computerscience=75;
}

public Lab3assign1(int physics, int maths, int computerscience){
    this.physics=physics;
    this.maths=maths;
    this.computerscience=computerscience;
}
public int CalculateSum(){
    int sum=physics+maths+computerscience;
    return sum;
}
}
