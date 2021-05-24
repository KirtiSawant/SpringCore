package com.Spring.Callback;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle1 implements InitializingBean, DisposableBean {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point A=(" + getPointA().getX() + "," + getPointA().getY() + ")");
        System.out.println("Point B=(" + getPointA().getX() + "," + getPointB().getY() + ")");
        System.out.println("Point C=(" + getPointA().getX() + "," + getPointC().getY() + ")");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean init Method called for Triangle1");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" DisposableBean destroy Method called for Triangle1");
    }
}
