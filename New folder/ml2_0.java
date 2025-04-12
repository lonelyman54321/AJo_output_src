/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from ml2
 */
public final class ml2_0
implements zr1 {
    public final /* synthetic */ Cl2 a;

    public ml2_0(Cl2 cl2) {
        this.a = cl2;
    }

    public final int a() {
        return ((Mk2)CollectionsKt.S(this.a.l().h())).getIndex();
    }

    public final void b(int n3, int n4) {
        float f5 = n4;
        Cl2 cl2 = this.a;
        int n7 = cl2.o();
        float f6 = n7;
        yl2 yl22 = cl2.c;
        yl22.b.e(n3);
        is1_0 is1_02 = yl22.f;
        is1_02.d(n3);
        yl22.c.k(f5 /= f6);
        n3 = 0;
        yl22.e = null;
        hi2_0 hi2_02 = (hi2_0)cl2.w.getValue();
        if (hi2_02 != null) {
            hi2_02.f();
        }
    }

    public final float c(int n3) {
        float f5;
        Mk2 mk2;
        int n4;
        Cl2 cl2;
        block4: {
            cl2 = this.a;
            List list = cl2.l().h();
            n4 = list.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Mk2 mk22 = mk2 = (Mk2)list.get(i3);
                mk22 = mk2;
                int n7 = mk22.getIndex();
                if (n7 != n3) {
                    continue;
                }
                break block4;
            }
            mk2 = null;
        }
        mk2 = mk2;
        if (mk2 == null) {
            int n8 = cl2.j();
            f5 = n3 -= n8;
            n8 = cl2.n();
            vl2 vl22 = (vl2)cl2.o.getValue();
            n4 = vl22.c + n8;
            float f6 = n4;
            f5 *= f6;
            f6 = cl2.k();
            int n10 = cl2.o();
            float f7 = n10;
            f5 -= (f6 *= f7);
        } else {
            n3 = mk2.getOffset();
            f5 = n3;
        }
        return f5;
    }

    public final int d() {
        return this.a.e;
    }

    public final int e() {
        return this.a.d;
    }

    public final int getItemCount() {
        return this.a.m();
    }
}

