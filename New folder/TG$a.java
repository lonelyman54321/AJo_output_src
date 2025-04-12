/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class TG$a
implements Iterator {
    public tg_1 a;
    public int b;

    public final boolean hasNext() {
        int n3 = this.b;
        ArrayList arrayList = this.a.e;
        int n4 = arrayList.size();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        Cloneable cloneable = this.a.e;
        int n3 = this.b;
        cloneable = (rg_1)cloneable.get(n3);
        this.b = n3 = this.b + 1;
        return cloneable;
    }
}

