package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    private Bar bar = new Bar();

    private List<Baz> bazs = new ArrayList<>();

    private Qux qux = new Qux();

    private Corge corge = null;

    private List<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }

    public void addGrault(Grault grault){
        this.graults.add(grault);
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Bar getBar() {
        return this.bar;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

}
