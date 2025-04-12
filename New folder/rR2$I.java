/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public abstract class rR2$I
extends rr2$k_0
implements rR2$G {
    public Set i;
    public String j;
    public Set k;
    public Set l;
    public Set m;

    public final Set a() {
        return this.k;
    }

    public final String c() {
        return this.j;
    }

    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    public final void f(HashSet hashSet) {
        this.k = hashSet;
    }

    public final Set getRequiredFeatures() {
        return this.i;
    }

    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    public final void i(String string2) {
        this.j = string2;
    }

    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    public final Set l() {
        return this.l;
    }

    public final Set m() {
        return this.m;
    }
}

