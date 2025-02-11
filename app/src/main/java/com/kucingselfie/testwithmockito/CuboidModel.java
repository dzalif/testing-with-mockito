package com.kucingselfie.testwithmockito;

class CuboidModel {
    double width;
    double length;
    double height;

    public CuboidModel() {
    }

    public void save(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double getVolume() {
        return width * length * height;
    }

    public double getSurfaceArea() {
        double wl = width * length;
        double wh = width * height;
        double lh = length * height;

        return  2 * (wl + wh + lh);
    }

    public double getCircumference() {
        return 4 * (width * length * height);
    }
}
