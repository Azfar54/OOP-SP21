package lab6_ha2;

public class NoOfObjects {
private static int objs=0;
private static int desCount=0;
private int a;

public NoOfObjects(){
    objs++;
}



public void finalize()
{
    desCount++;
}

public NoOfObjects(int a){
this.a=a;
objs++;
}

public static int getDestroyedCount()
{
    return desCount;
}

public static int getObjs (){
return objs;
}
}