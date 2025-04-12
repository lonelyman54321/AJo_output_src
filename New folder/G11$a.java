/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class G11$a
implements G11 {
    public final int a;

    public G11$a(int n3) {
        this.a = n3;
        if (n3 > 0) {
            return;
        }
        String string2 = Gj0.b(n3, "Provided count ", " should be larger than zero");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final ArrayList a(int n3, int n4) {
        int n7 = this.a;
        int n8 = (n7 + -1) * n4;
        n4 = (n3 -= n8) / n7;
        n3 %= n7;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n7);
        for (int i3 = 0; i3 < n7; ++i3) {
            Integer n10;
            int n14;
            if (i3 < n3) {
                n14 = 1;
            } else {
                n14 = 0;
                n10 = null;
            }
            n10 = n14 += n4;
            arrayList.add(n10);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof G11$a;
        if (n3 == 0) return 0 != 0;
        object = (G11$a)object;
        n3 = this.a;
        int n4 = ((G11$a)object).a;
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        return -this.a;
    }
}

