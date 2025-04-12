/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public final class zQ1$a
extends zq1_0 {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public zQ1$a(int n3, long l2) {
        super(n3);
        ArrayList arrayList;
        this.b = l2;
        this.c = arrayList = new ArrayList();
        this.d = arrayList = new ArrayList();
    }

    public final zQ1$a b(int n3) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            zQ1$a zQ1$a = (zQ1$a)arrayList.get(i3);
            int n7 = zQ1$a.a;
            if (n7 != n3) continue;
            return zQ1$a;
        }
        return null;
    }

    public final zQ1$b c(int n3) {
        ArrayList arrayList = this.c;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            zQ1$b zQ1$b = (zQ1$b)arrayList.get(i3);
            int n7 = zQ1$b.a;
            if (n7 != n3) continue;
            return zQ1$b;
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = zq1_0.a(this.a);
        stringBuilder.append(string2);
        stringBuilder.append(" leaves: ");
        string2 = Arrays.toString(this.c.toArray());
        stringBuilder.append(string2);
        stringBuilder.append(" containers: ");
        string2 = Arrays.toString(this.d.toArray());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

