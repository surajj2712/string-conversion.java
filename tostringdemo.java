class point{
    int x, y;
    point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String tostring() {
        return "point["+x+","+y+"]";
    }
}
class tostringdemo {
    public static void main(string args[]){
        point p = new point(10, 20);
        System.out.println("p =" + p);
    }
}