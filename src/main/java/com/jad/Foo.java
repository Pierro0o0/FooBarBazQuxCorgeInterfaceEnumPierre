package com.jad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;               // Aggregation
    private List<IBar> bars;        // Association (*)
    private IQux qux;               // Composition (1)
    private ICorge corge;           // Bidirectional Association (0..1)

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        // Composition: Foo manages the lifecycle of Qux
        this.qux = new Qux();
    }

    // Getters
    public IQux getQux() {
        return this.qux;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    // Multiplicity *: returning an unmodifiable list prevents external
    // classes from bypassing the addBar method.
    public List<IBar> getBars() {
        return Collections.unmodifiableList(this.bars);
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
        // Logic for bidirectional consistency (optional but helpful)
        if (corge != null && corge.getFoo() != this) {
            corge.setFoo(this);
        }
    }

    public void addBar(IBar bar) {
        if (bar != null) {
            this.bars.add(bar);
        }
    }
}