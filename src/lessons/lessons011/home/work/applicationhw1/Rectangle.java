package lessons.lessons011.home.work.applicationhw1;


class Rectangle {
    double width;
    double height;


    Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    Rectangle(double width, double height ) {
        this.width = width;
        this.height = height;

    }

    Rectangle(double ax, double ay, double bx, double by){
        width = ax - ay;
        height = bx - by;
    }

    double area(){

        return  width * height;
    }
    double perimeter(){
        return  ((width + height) * 2);
    }
    void print(){
        System.out.println("ширина" + width + " высота " + height + " Ширина " + area() + " Периметр " + perimeter());
    }
}
