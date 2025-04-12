/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yL
 */
public final class yl_0 {
    public final /* synthetic */ et0 a;

    public yl_0(et0 et02) {
        this.a = et02;
    }

    public final void a(gn2 gn22, int n3) {
        this.a.a().o(gn22, n3);
    }

    public final void b(float f5, float f6, float f7, float f8, int n3) {
        this.a.a().f(f5, f6, f7, f8, n3);
    }

    public final void c(float f5, float f6, float f7, float f8) {
        float f11;
        et0 et02 = this.a;
        iL iL2 = et02.a();
        long l2 = et02.l();
        float f12 = C63.d(l2);
        f12 -= (f7 += f5);
        long l3 = et02.l();
        f7 = C63.b(l3);
        long l4 = bo1_1.a(f12, f7 -= (f8 += f6));
        float f14 = (f12 = C63.d(l4)) - 0.0f;
        Object object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = (f11 = (f12 = C63.b(l4)) - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) >= 0) {
            et02.b(l4);
            iL2.g(f5, f6);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Width and height must be greater than or equal to zero");
        throw illegalArgumentException;
    }

    public final void d(long l2, float f5) {
        iL iL2 = this.a.a();
        float f6 = e72.d(l2);
        float f7 = e72.e(l2);
        iL2.g(f6, f7);
        iL2.n(f5);
        f5 = -e72.d(l2);
        float f8 = -e72.e(l2);
        iL2.g(f5, f8);
    }

    public final void e(float f5, float f6, long l2) {
        iL iL2 = this.a.a();
        float f7 = e72.d(l2);
        float f8 = e72.e(l2);
        iL2.g(f7, f8);
        iL2.a(f5, f6);
        f5 = -e72.d(l2);
        f6 = -e72.e(l2);
        iL2.g(f5, f6);
    }

    public final void f(float[] fArray) {
        this.a.a().r(fArray);
    }

    public final void g(float f5, float f6) {
        this.a.a().g(f5, f6);
    }
}

