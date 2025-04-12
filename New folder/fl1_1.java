/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fL1
 */
public final class fl1_1
implements Mk2 {
    public final int a;
    public final int b;
    public final List c;
    public final long d;
    public final Object e;
    public final Nc$b f;
    public final Nc$c g;
    public final bp1_0 h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int[] l;
    public int m;
    public int n;

    public fl1_1() {
        throw null;
    }

    public fl1_1(int n3, int n4, List list, long l2, Object object, pg2_0 pg2_02, Nc$c nc$c, bp1_0 bp1_02, boolean bl2) {
        Gx$a gx$a = Nc$a.n;
        this.a = n3;
        this.b = n4;
        this.c = list;
        this.d = l2;
        this.e = object;
        this.f = gx$a;
        this.g = nc$c;
        this.h = bp1_02;
        this.i = bl2;
        Object object2 = pg2_0.Vertical;
        n4 = 0;
        if (pg2_02 == object2) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.j = n3;
        n3 = list.size();
        int n7 = 0;
        while (n4 < n3) {
            Ns2 ns2 = (Ns2)list.get(n4);
            boolean bl3 = this.j;
            int n8 = !bl3 ? ns2.b : ns2.a;
            n7 = Math.max(n7, n8);
            ++n4;
        }
        this.k = n7;
        object2 = new int[this.c.size() * 2];
        this.l = (int[])object2;
        this.n = -1 << -1;
    }

    public final void a(int n3) {
        int n4;
        this.m = n4 = this.m + n3;
        int[] nArray = this.l;
        int n7 = nArray.length;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8;
            int n10;
            int n14 = this.j;
            if ((n14 == 0 || (n10 = i3 % 2) != (n8 = 1)) && (n14 != 0 || (n14 = i3 % 2) != 0)) continue;
            nArray[i3] = n14 = nArray[i3] + n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n3, int n4, int n7) {
        this.m = n3;
        boolean bl2 = this.j;
        int n8 = bl2 ? n7 : n4;
        this.n = n8;
        List list = this.c;
        int n10 = list.size();
        int n14 = 0;
        while (n14 < n10) {
            int n15;
            int n16;
            int n17;
            Object object;
            Ns2 ns2 = (Ns2)list.get(n14);
            int n18 = n14 * 2;
            int[] nArray = this.l;
            if (bl2) {
                object = this.f;
                if (object == null) {
                    String string2 = "null horizontalAlignment".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                n17 = ns2.a;
                bp1_0 bp1_02 = this.h;
                nArray[n18] = n16 = object.a(n17, n4, bp1_02);
                nArray[++n18] = n3;
                n15 = ns2.b;
            } else {
                nArray[n18] = n3;
                ++n18;
                object = this.g;
                if (object == null) {
                    String string3 = "null verticalAlignment".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                    throw illegalArgumentException;
                }
                n17 = ns2.b;
                nArray[n18] = n16 = object.a(n17, n7);
                n15 = ns2.a;
            }
            n3 += n15;
            ++n14;
        }
        return;
    }

    public final int getIndex() {
        return this.a;
    }

    public final int getOffset() {
        return this.m;
    }
}

