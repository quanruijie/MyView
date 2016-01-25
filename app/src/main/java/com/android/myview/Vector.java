package com.android.myview;

/**
 * Vector
 *
 * @auther:dell
 * @time:2016/1/22 14:21
 */
public class Vector {

    private float x;
    private float y;

    public Vector() {
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Vector add(Vector v){
        x += v.x;
        y += v.y;
        return this;
    }
    //加法
    public static Vector add(Vector v1,Vector v2){
        return new Vector(v1.x + v2.x, v1.y + v2.y);
    }
    public Vector sub(Vector v){
        x  -= v.x;
        y  -= v.y;
        return this;
    }
    //减法
    public static Vector sub(Vector v1,Vector v2){
        return Vector(v1.x - v2.x, v1.y - v2.y);
    }
    public Vector mult(float n){
        x *= n;
        y *= n;
        return this;
    }
    //乘法
    public Vector div(float n){
        if (n!=0){
            x /= n;
            y /= n;
        }
        return this;
    }
    //除法
    public float mag(){
        return (float)Math.sqrt(x * x + y * y);
    }
    //求模
    public void limit(float max){
        if(max * max <= mag() * mag()){
            nomarlline();
            mult(max);
        }
    }
    //限制大小
    public Vector nomarlline(){
        div(mag());
    }
    //单位化
}
