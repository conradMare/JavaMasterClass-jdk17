public class Wall {
    private double height;
    private double width;

    public Wall() {
        this.height = height;
        this.width = width;
    }

    public Wall(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public void setWidth(double number1) {
        this.width = number1;
    }

    public double getWidth() {
        if (this.width < 0) {
            return 0.0;
        }
        return this.width;
    }

    public void setHeight(double number2) {
        this.height = number2;
    }

    public double getHeight() {
        if (this.height < 0) {
            return 0.0;
        }
        return this.height;
    }

    public double getArea() {
        if (height < 0 || width < 0) {
            return 0;
        }
        return height * width;
    }
}
