/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class wJ2$a
implements Comparable {
    public final ArrayList a;
    public long b = -9223372036854775807L;

    public wJ2$a() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final int compareTo(Object object) {
        object = (wJ2$a)object;
        long l2 = this.b;
        long l3 = ((wJ2$a)object).b;
        return Long.compare(l2, l3);
    }
}

