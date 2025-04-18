public class Shape {
    private String color="white";
    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*public void describe(int sideA, int sideB){
        System.out.println("sideA is"+ sideA
        +"sideB is"+ sideB);
    }
    public void describe(int sideA){
        System.out.println("sideA is"+ sideA);
    }
    public void describe(double sideA){
        System.out.println("Radius is"+ sideA);
    }
    */
    public void describe(){
        System.out.println(" this is shape and"+
                "it is color"+ color);
    }

}
