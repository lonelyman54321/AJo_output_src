/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.j$b;

public final class Lm0$a {
    public final String a;
    public int b;
    public long c;
    public final j$b d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ Lm0 g;

    public Lm0$a(Lm0 lm0, String string2, int n3, j$b j$b) {
        boolean bl2;
        this.g = lm0;
        this.a = string2;
        this.b = n3;
        long l2 = j$b == null ? (long)-1 : j$b.d;
        this.c = l2;
        if (j$b != null && (bl2 = j$b.b())) {
            this.d = j$b;
        }
    }

    public final boolean a(oe$a object) {
        j$b j$b = ((oe$a)object).d;
        boolean bl2 = true;
        if (j$b == null) {
            int n3 = this.b;
            int n4 = ((oe$a)object).c;
            if (n3 == n4) {
                bl2 = false;
            }
            return bl2;
        }
        long l2 = this.c;
        long l3 = -1;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 == false) {
            return false;
        }
        l3 = j$b.d;
        long l8 = l3 - l2;
        l7 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (l7 > 0) {
            return bl2;
        }
        j$b j$b2 = this.d;
        if (j$b2 == null) {
            return false;
        }
        object = ((oe$a)object).b;
        Object object2 = j$b.a;
        int n7 = ((g)object).b(object2);
        Object object3 = j$b2.a;
        int n8 = ((g)object).b(object3);
        l3 = j$b.d;
        long l12 = j$b2.d;
        long l14 = l3 - l12;
        long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (l15 >= 0 && n7 >= n8) {
            if (n7 > n8) {
                return bl2;
            }
            n8 = j$b.b() ? 1 : 0;
            n7 = j$b2.b;
            if (n8 != 0) {
                int n10;
                n8 = j$b.b;
                if (n8 <= n7 && (n8 != n7 || (n10 = j$b.c) <= (n8 = j$b2.c))) {
                    bl2 = false;
                }
                return bl2;
            }
            int n14 = j$b.e;
            n8 = -1;
            if (n14 != n8 && n14 <= n7) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final boolean b(g object, g g3) {
        int n3;
        int n4;
        boolean bl2;
        int n7;
        block4: {
            block6: {
                int n8;
                block5: {
                    n7 = this.b;
                    int n10 = ((g)object).p();
                    bl2 = false;
                    n4 = -1;
                    if (n7 < n10) break block5;
                    n3 = g3.p();
                    if (n7 >= n3) break block6;
                    break block4;
                }
                Lm0 lm0 = this.g;
                g$c g$c = lm0.a;
                ((g)object).o(n7, g$c);
                g$c g$c2 = lm0.a;
                for (int i3 = g$c2.n; i3 <= (n8 = g$c2.o); ++i3) {
                    Object object2 = ((g)object).m(i3);
                    n8 = g3.b(object2);
                    if (n8 == n4) continue;
                    object = lm0.b;
                    object = g3.g(n8, (g$b)object, false);
                    n7 = ((g$b)object).c;
                    break block4;
                }
            }
            n7 = -1;
        }
        this.b = n7;
        if (n7 == n4) {
            return false;
        }
        object = this.d;
        n7 = 1;
        if (object == null) {
            return n7 != 0;
        }
        object = ((j$b)object).a;
        n3 = g3.b(object);
        if (n3 != n4) {
            bl2 = true;
        }
        return bl2;
    }
}

