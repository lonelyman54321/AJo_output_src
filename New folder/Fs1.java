/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;

public final class Fs1
implements zr1 {
    public final ft1_2 a;

    public Fs1(ft1_2 ft1_22) {
        this.a = ft1_22;
    }

    public final int a() {
        int n3;
        Js1 js1 = (Js1)CollectionsKt.T(this.a.j().i());
        if (js1 != null) {
            n3 = js1.getIndex();
        } else {
            n3 = 0;
            js1 = null;
        }
        return n3;
    }

    public final void b(int n3, int n4) {
        this.a.l(n3, n4);
    }

    public final float c(int n3) {
        float f5;
        int n4;
        Object object;
        int n7;
        int n8;
        int n10;
        int n14;
        List list;
        Ts1 ts1;
        ft1_2 ft1_22;
        block6: {
            ft1_22 = this.a;
            ts1 = ft1_22.j();
            list = ts1.i();
            n14 = list.isEmpty();
            if (n14 != 0) {
                return 0.0f;
            }
            list = ts1.i();
            n10 = list.size();
            n8 = 0;
            for (n7 = 0; n7 < n10; ++n7) {
                Object object2 = object = list.get(n7);
                object2 = (Js1)object;
                int n15 = object2.getIndex();
                if (n15 != n3) {
                    continue;
                }
                break block6;
            }
            n4 = 0;
            object = null;
        }
        object = (Js1)object;
        if (object == null) {
            list = ts1.i();
            n10 = list.size();
            n7 = 0;
            while (n8 < n10) {
                object = (Js1)list.get(n8);
                n4 = object.getSize();
                n7 += n4;
                ++n8;
            }
            n14 = list.size();
            int n16 = ts1.h() + (n7 /= n14);
            n14 = ft1_22.h();
            n3 = (n3 - n14) * n16;
            f5 = n3;
            int n17 = ft1_22.i();
            float f6 = n17;
            f5 -= f6;
        } else {
            n3 = object.getOffset();
            f5 = n3;
        }
        return f5;
    }

    public final int d() {
        return this.a.i();
    }

    public final int e() {
        return this.a.h();
    }

    public final int getItemCount() {
        return this.a.j().g();
    }
}

