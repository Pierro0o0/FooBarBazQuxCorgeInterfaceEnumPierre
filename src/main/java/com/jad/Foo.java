package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;
    private List<IBar> bars;
    private IQux qux;
    private ICorge corge;
    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        this.qux = new Qux();
    }

    public IQux getQux() {
        return this.qux;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public void addBar(Ibar bar) {
        this.bars.add(bar);
    }


}
