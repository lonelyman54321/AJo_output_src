/*
 * Decompiled with CFR 0.152.
 */
public final class f72
implements mp {
    public final mp a;
    public final int b;
    public int c;

    public f72(mp mp2, int n3) {
        this.a = mp2;
        this.b = n3;
    }

    public final Object a() {
        return this.a.a();
    }

    public final void b(int n3, int n4, int n7) {
        int n8 = this.c;
        n8 = n8 == 0 ? this.b : 0;
        this.a.b(n3 += n8, n4 += n8, n7);
    }

    public final void c(int n3, int n4) {
        int n7 = this.c;
        n7 = n7 == 0 ? this.b : 0;
        this.a.c(n3 += n7, n4);
    }

    public final void clear() {
        p30_0.c("Clear is not valid on OffsetApplier");
        throw null;
    }

    public final void d(int n3, Object object) {
        int n4 = this.c;
        n4 = n4 == 0 ? this.b : 0;
        this.a.d(n3 += n4, object);
    }

    public final /* synthetic */ void e() {
    }

    public final void f(int n3, Object object) {
        int n4 = this.c;
        n4 = n4 == 0 ? this.b : 0;
        this.a.f(n3 += n4, object);
    }

    public final void g(Object object) {
        int n3;
        this.c = n3 = this.c + 1;
        this.a.g(object);
    }

    public final void h() {
        int n3 = this.c;
        boolean bl2 = n3 > 0;
        if (bl2) {
            this.c = n3 += -1;
            this.a.h();
            return;
        }
        p30_0.c("OffsetApplier up called with no corresponding down");
        throw null;
    }
}

