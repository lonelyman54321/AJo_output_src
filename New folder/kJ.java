/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public class kJ
implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public kJ(String string2, long l2, long l3, long l4, File file) {
        boolean bl2;
        this.a = string2;
        this.b = l2;
        this.c = l3;
        if (file != null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        this.d = bl2;
        this.e = file;
        this.f = l4;
    }

    public final int a(kJ object) {
        String string2 = this.a;
        String string3 = ((kJ)object).a;
        boolean bl2 = string2.equals(string3);
        if (!bl2) {
            object = ((kJ)object).a;
            return string2.compareTo((String)object);
        }
        long l2 = this.b;
        long l3 = ((kJ)object).b;
        long l4 = (l2 -= l3) - (l3 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            object2 = 0;
            object = null;
        } else {
            object2 = object2 < 0 ? (Object)-1 : (Object)1;
        }
        return (int)object2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        l2 = this.c;
        return jl0_0.b(stringBuilder, l2, "]");
    }
}

