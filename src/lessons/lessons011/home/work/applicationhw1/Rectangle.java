package lessons.lessons011.home.work.applicationhw1;


class Rectangle {
    double width;
    double height;
    double ax;
    double ay;
    double bx;
    double by;
    double s;
    double p;

    Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    Rectangle(double width, double height ) {
        this.width = width;
        this.height = height;

    }

    Rectangle(double ax, double ay, double bx, double by){
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        width = ax - ay;
        height = bx - by;
    }

    double area(){

        return s = width * height;
    }
    double perimeter(){
        return p =  ((width + height) * 2);
    }
    void print(){
        System.out.println("ширина" + width + " высота " + height + " Ширина " + s + " Периметр " + p);
    }
}
