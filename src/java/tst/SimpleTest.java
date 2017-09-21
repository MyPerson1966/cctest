/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PSEVO tochka
 */
@Named
@Stateless
public class SimpleTest {

    @PersistenceContext
    private EntityManager em;

    /**
     * Creates a new instance of SimpleTest
     */
    public SimpleTest() {
	superString = "" + ((int) (1000 * Math.random())) + "-" + ((int) (1000 * Math.random())) + "-" + ((int) (1000 * Math.random())) + "";
    }

    private String superString;

    /**
     * Get the value of superString
     *
     * @return the value of superString
     */
    public String getSuperString() {
	return superString;
    }

    private double b;

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public double getB() {
	return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(double b) {
	this.b = b;
    }

    /**
     * Set the value of superString
     *
     * @param superString new value of superString
     */
    public void setSuperString(String superString) {
	this.superString = superString;
    }

    private double a;

    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public double getA() {
	return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(double a) {
	this.a = a;
    }

    public void actIT() {
	System.out.println(superString + "   " + a);
    }

    public void actITT() {
	System.out.println(" ---------------  " + (a * b));
    }

    public void acctITT(Double f) {
	System.out.println(" ---------------  " + (f + a * b));
    }

}
