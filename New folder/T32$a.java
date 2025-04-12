/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class T32$a {
    public LP1$c a;
    public int b;
    public WR1 c;
    public WR1 d;
    public boolean e;
    public final /* synthetic */ T32 f;

    public T32$a(T32 t32, LP1$c lP1$c, int n3, WR1 wR1, WR1 wR12, boolean bl2) {
        this.f = t32;
        this.a = lP1$c;
        this.b = n3;
        this.c = wR1;
        this.d = wR12;
        this.e = bl2;
    }

    public final boolean a(int n3, int n4) {
        Object object = this.c;
        int n7 = this.b;
        LP1$b lP1$b = (LP1$b)((WR1)object).a[n3 += n7];
        object = this.d;
        LP1$b lP1$b2 = (LP1$b)((WR1)object).a[n7 += n4];
        object = U32.a;
        boolean bl2 = Intrinsics.areEqual(lP1$b, lP1$b2);
        if (bl2 || (n3 = (int)(U3.a(lP1$b, lP1$b2) ? 1 : 0)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            lP1$b = null;
        }
        return n3 != 0;
    }

    public final void b(int n3) {
        int n4 = this.b + n3;
        Object object = this.a;
        Object object2 = (LP1$b)this.d.a[n4];
        T32 t32 = this.f;
        t32.getClass();
        object = T32.b((LP1$b)object2, (LP1$c)object);
        this.a = object;
        n4 = this.e ? 1 : 0;
        if (n4 != 0) {
            object = ((LP1$c)object).f;
            Intrinsics.checkNotNull(object);
            object = ((LP1$c)object).h;
            Intrinsics.checkNotNull(object);
            object2 = go0.c(this.a);
            if (object2 != null) {
                xp1_0 xp1_02 = t32.a;
                sp1_1 sp1_12 = new sp1_1(xp1_02, (rp1_1)object2);
                this.a.q1(sp1_12);
                object2 = this.a;
                T32.a(t32, (LP1$c)object2, sp1_12);
                sp1_12.q = object2 = ((w32_0)object).q;
                sp1_12.p = object;
                ((w32_0)object).q = sp1_12;
            } else {
                object2 = this.a;
                ((LP1$c)object2).q1((w32_0)object);
            }
            this.a.h1();
            this.a.n1();
            object = this.a;
            c42_0.a((LP1$c)object);
        } else {
            n4 = 1;
            ((LP1$c)object).i = n4;
        }
    }

    public final void c() {
        LP1$c lP1$c = this.a.f;
        Intrinsics.checkNotNull(lP1$c);
        T32 t32 = this.f;
        t32.getClass();
        int n3 = lP1$c.c & 2;
        if (n3 != 0) {
            w32_0 w32_02 = lP1$c.h;
            Intrinsics.checkNotNull(w32_02);
            Object object = w32_02.q;
            w32_02 = w32_02.p;
            Intrinsics.checkNotNull(w32_02);
            if (object != null) {
                ((w32_0)object).p = w32_02;
            }
            w32_02.q = object;
            object = this.a;
            T32.a(t32, (LP1$c)object, w32_02);
        }
        this.a = lP1$c = T32.c(lP1$c);
    }

    public final void d(int n3, int n4) {
        Object object = this.a.f;
        Intrinsics.checkNotNull(object);
        this.a = object;
        object = this.c;
        int n7 = this.b;
        LP1$b lP1$b = (LP1$b)((WR1)object).a[n3 += n7];
        object = this.d;
        LP1$b lP1$b2 = (LP1$b)((WR1)object).a[n7 += n4];
        boolean bl2 = Intrinsics.areEqual(lP1$b, lP1$b2);
        T32 t32 = this.f;
        if (!bl2) {
            object = this.a;
            t32.getClass();
            T32.h(lP1$b, lP1$b2, (LP1$c)object);
        } else {
            t32.getClass();
        }
    }
}

