package com.mycompany.app.aufgabe4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyStringTest {
    private MyString myString;
    private Object anObject;
    private Boolean result;

    @Test
    public void uStrings() {
        //set up
        this.myString = new MyString("a");
        this.anObject = new MyString("b");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertFalse("selber Typ aber unterschiedlicher String: erwartet false", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void gObjekte() {
        //set up
        this.myString = new MyString("a");
        this.anObject = myString;
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertTrue("zwei gleiche Objekte: erwartet true", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void iObjekte() {
        //set up
        this.myString = new MyString("a");
        this.anObject = new MyString("a");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertTrue("zwei Objekte mit gleichem Inhalt: erwartet true", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void uObjekte() {
        //set up
        this.myString = new MyString("ba");
        this.anObject = new MyString("bb");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertFalse("zwei Objekte mit ungleichem Inhalt: erwartet false", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void kInstanz() {
        //set up
        this.myString = new MyString("abba");
        this.anObject = new String("cddc");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertFalse("anObject ist keine Instanz von MyString: erwartet false", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void uLaenge() {
        //set up
        this.myString = new MyString("abb");
        this.anObject = new MyString("abba");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertFalse("zwei Objekte mit ungleicher Länge: erwartet false", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }

    @Test
    public void lObjekte() {
        //set up
        this.myString = new MyString("");
        this.anObject = new MyString("");
        //execute
        this.result = myString.equals(anObject);
        //verify
        assertTrue("zwei leere Objekte: erwartet true", result);
        //tear down
        this.result = null;
        this.myString = null;
        this.anObject = null;
    }
}
