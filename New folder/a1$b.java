/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class a1$b
extends o1_0 {
    public final /* synthetic */ a1_0 b;

    public a1$b(a1_0 a1_02) {
        this.b = a1_02;
    }

    public final int a() {
        return this.b.g();
    }

    public final boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    public final Iterator iterator() {
        Iterator iterator = ((cr2_0)this.b.e()).iterator();
        a1$b$a a1$b$a = new a1$b$a(iterator);
        return a1$b$a;
    }
}

