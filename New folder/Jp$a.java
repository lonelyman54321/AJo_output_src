/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;

public final class Jp$a
extends AbstractSet {
    public final /* synthetic */ Jp a;

    public Jp$a(Jp jp) {
        this.a = jp;
    }

    public final Iterator iterator() {
        Jp jp = this.a;
        Jp$d jp$d = new Jp$d(jp);
        return jp$d;
    }

    public final int size() {
        return this.a.c;
    }
}

