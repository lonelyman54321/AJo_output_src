/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class a1$d
extends f0_0 {
    public final /* synthetic */ a1_0 a;

    public a1$d(a1_0 a1_02) {
        this.a = a1_02;
    }

    public final int a() {
        return this.a.g();
    }

    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    public final Iterator iterator() {
        Iterator iterator = ((cr2_0)this.a.e()).iterator();
        a1$d$a a1$d$a = new a1$d$a(iterator);
        return a1$d$a;
    }
}

