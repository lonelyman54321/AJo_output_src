/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class CH$s {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        int n3;
        this.b = n3 = this.b + 1000;
    }

    public final String toString() {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.a.iterator();
        while ((c2 = iterator.hasNext()) != '\u0000') {
            CH$t cH$t = (CH$t)iterator.next();
            stringBuilder.append(cH$t);
            c2 = ' ';
            stringBuilder.append(c2);
        }
        stringBuilder.append('[');
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ']');
    }
}

