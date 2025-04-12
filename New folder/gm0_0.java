/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from gm0
 */
public final class gm0_0
implements hr1 {
    public final int a;
    public int b;
    public final WR1 c;
    public boolean d;

    public gm0_0(int n3) {
        WR1 wR1;
        this.a = n3;
        this.b = -1;
        Object[] objectArray = new xs1$b[16];
        this.c = wR1 = new WR1(objectArray);
    }

    public final void a(mu1_0 mu1_02, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.a); ++i3) {
            n4 = n3 + i3;
            mu1_02.a(n4);
        }
    }

    public final void b(Zq1 object) {
        Object object2;
        int n3 = this.b;
        int n4 = -1;
        if (n3 != n4 && (n3 = (object2 = (Collection)object.i()).isEmpty() ^ 1) != 0) {
            int n7;
            pg2_0 pg2_02;
            n3 = (int)(this.d ? 1 : 0);
            if (n3 != 0) {
                object2 = (jq1_0)CollectionsKt.S(object.i());
                n7 = (object = object.a()) == (pg2_02 = pg2_0.Vertical) ? object2.e() : object2.g();
                ++n7;
            } else {
                object2 = (jq1_0)CollectionsKt.L(object.i());
                n7 = (object = object.a()) == (pg2_02 = pg2_0.Vertical) ? object2.e() : object2.g();
                n7 += -1;
            }
            n3 = this.b;
            if (n3 != n7) {
                this.b = n4;
                object = this.c;
                n3 = ((WR1)object).c;
                if (n3 > 0) {
                    Object[] objectArray = ((WR1)object).a;
                    int n8 = 0;
                    pg2_02 = null;
                    do {
                        xs1$b xs1$b = (xs1$b)objectArray[n8];
                        xs1$b.cancel();
                    } while (++n8 < n3);
                }
                ((WR1)object).g();
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c(gr1_0 object, float f5, Zq1 object2) {
        int n3;
        int n4;
        Object object3;
        void var5_14;
        int n7;
        Collection collection = object2.i();
        boolean bl3 = collection.isEmpty();
        bl3 = bl3 ^ (n7 = 1);
        if (!bl3) return;
        Object var4_5 = null;
        int n8 = 0;
        float f6 = f5 - 0.0f;
        Object object4 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object4 < 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            Object var4_6 = null;
        }
        if (var5_14 != false) {
            jq1_0 jq1_02 = (jq1_0)CollectionsKt.S(object2.i());
            pg2_0 pg2_02 = object2.a();
            n4 = pg2_02 == (object3 = pg2_0.Vertical) ? jq1_02.e() : jq1_02.g();
            n4 += n7;
            jq1_0 jq1_03 = (jq1_0)CollectionsKt.S(object2.i());
            n3 = jq1_03.getIndex() + n7;
        } else {
            jq1_0 jq1_04 = (jq1_0)CollectionsKt.L(object2.i());
            pg2_0 pg2_03 = object2.a();
            n4 = pg2_03 == (object3 = pg2_0.Vertical) ? jq1_04.e() : jq1_04.g();
            n4 += -1;
            jq1_0 jq1_05 = (jq1_0)CollectionsKt.L(object2.i());
            n3 = jq1_05.getIndex() - n7;
        }
        if (n3 < 0) return;
        int n10 = object2.g();
        if (n3 >= n10) return;
        n3 = this.b;
        object3 = this.c;
        if (n4 != n3 && n4 >= 0) {
            n3 = (int)(this.d ? 1 : 0);
            if (n3 != var5_14 && (n3 = ((WR1)object3).c) > 0) {
                Object[] objectArray = ((WR1)object3).a;
                int n14 = 0;
                do {
                    xs1$b xs1$b = (xs1$b)objectArray[n14];
                    xs1$b.cancel();
                } while ((n14 += n7) < n3);
            }
            this.d = var5_14;
            this.b = n4;
            ((WR1)object3).g();
            object = object.a(n4);
            n4 = ((WR1)object3).c;
            ((WR1)object3).d(n4, (List)object);
        }
        if (var5_14 != false) {
            long l2;
            pg2_0 pg2_04;
            object = (jq1_0)CollectionsKt.S(object2.i());
            pg2_0 pg2_05 = object2.a();
            if (pg2_05 == (pg2_04 = pg2_0.Vertical)) {
                l2 = object.a();
                long l3 = 0xFFFFFFFFL;
                l2 &= l3;
            } else {
                l2 = object.a();
                int n15 = 32;
                l2 >>= n15;
            }
            int n16 = (int)l2;
            n4 = object2.h();
            pg2_0 pg2_06 = object2.a();
            int n17 = nr1_0.b((jq1_0)object, pg2_06) + n16 + n4;
            int n18 = object2.d();
            float f7 = n17 - n18;
            f5 = -f5;
            n17 = (int)(f7 == f5 ? 0 : (f7 < f5 ? -1 : 1));
            if (n17 >= 0) return;
            n17 = ((WR1)object3).c;
            if (n17 <= 0) return;
            Object[] objectArray = ((WR1)object3).a;
            do {
                object2 = (xs1$b)objectArray[n8];
                object2.b();
            } while ((n8 += n7) < n17);
            return;
        }
        object = (jq1_0)CollectionsKt.L(object2.i());
        int n19 = object2.f();
        object2 = object2.a();
        int n20 = nr1_0.b((jq1_0)object, (pg2_0)((Object)object2));
        int n21 = n19 - n20;
        float f8 = n21;
        float f11 = f8 - f5;
        if ((n20 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1))) >= 0) return;
        n20 = ((WR1)object3).c;
        if (n20 <= 0) return;
        Object[] objectArray = ((WR1)object3).a;
        do {
            object2 = (xs1$b)objectArray[n8];
            object2.b();
        } while ((n8 += n7) < n20);
    }
}

