package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private IBaz Ibaz;
    private List<IBar> Ibars;
    private Qux qux;
    private ICorge Icorge;

    public Foo(IBaz Ibaz){
        this.Ibaz = Ibaz;
        this.Ibars = new ArrayList<>();
        this.qux = qux;
        this.Icorge = Icorge;
    }

    public void addBar(IBar Ibar) {
        if (Ibar != null) {
            this.Ibars.add(Ibar);
        }
    }
}
