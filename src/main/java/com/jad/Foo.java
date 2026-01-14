package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private IBaz Ibaz;
    private List<IBar> Ibars;
    private Qux qux;
    private ICorge Icorge;

    public Foo(IBaz Ibaz) {
        this.Ibaz = Ibaz;
        this.Ibars = new ArrayList<>();
        this.qux = qux;
        this.Icorge = Icorge;
    }

    public IBaz getIbaz() {
        return this.Ibaz;
    }

    public List<IBar> getIbars() {
        return this.Ibars;
    }

    public Qux getQux() {
        return this.qux;
    }

    public ICorge getIcorge() {
        return this.Icorge;
    }

    public void setIcorge(ICorge icorge) {
        this.Icorge = icorge;
    }

    public void addBar(IBar Ibar) {
        if (Ibar != null) {
            this.Ibars.add(Ibar);
        }
    }
}
