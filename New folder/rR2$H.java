/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class rR2$H
extends rr2$k_0
implements rR2$J,
rR2$G {
    public List i;
    public Set j;
    public String k;
    public Set l;
    public Set m;
    public Set n;

    public rR2$H() {
        ArrayList arrayList;
        this.i = arrayList = new ArrayList();
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
    }

    public final Set a() {
        return null;
    }

    public final List b() {
        return this.i;
    }

    public final String c() {
        return this.k;
    }

    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    public final void f(HashSet hashSet) {
    }

    public void g(rR2$N rR2$N) {
        this.i.add(rR2$N);
    }

    public final Set getRequiredFeatures() {
        return this.j;
    }

    public final void h(HashSet hashSet) {
        this.n = hashSet;
    }

    public final void i(String string2) {
        this.k = string2;
    }

    public final void j(HashSet hashSet) {
        this.m = hashSet;
    }

    public final Set l() {
        return this.m;
    }

    public final Set m() {
        return this.n;
    }
}

