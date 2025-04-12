/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vX2
 */
public final class vx2_2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public vx2_2 f;
    public vx2_2 g;

    public vx2_2() {
        byte[] byArray = new byte[8192];
        this.a = byArray;
        this.e = true;
        this.d = false;
    }

    public vx2_2(byte[] byArray, int n3, int n4, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(byArray, "data");
        this.a = byArray;
        this.b = n3;
        this.c = n4;
        this.d = bl2;
        this.e = bl3;
    }

    public final vx2_2 a() {
        vx2_2 vx2_22;
        vx2_2 vx2_23 = this.f;
        if (vx2_23 == this) {
            vx2_23 = null;
        }
        vx2_2 vx2_24 = this.g;
        Intrinsics.checkNotNull(vx2_24);
        vx2_24.f = vx2_22 = this.f;
        vx2_24 = this.f;
        Intrinsics.checkNotNull(vx2_24);
        vx2_24.g = vx2_22 = this.g;
        this.f = null;
        this.g = null;
        return vx2_23;
    }

    public final void b(vx2_2 vx2_22) {
        vx2_2 vx2_23;
        Intrinsics.checkNotNullParameter(vx2_22, "segment");
        vx2_22.g = this;
        vx2_22.f = vx2_23 = this.f;
        vx2_23 = this.f;
        Intrinsics.checkNotNull(vx2_23);
        vx2_23.g = vx2_22;
        this.f = vx2_22;
    }

    public final vx2_2 c() {
        this.d = true;
        int n3 = this.b;
        int n4 = this.c;
        byte[] byArray = this.a;
        vx2_2 vx2_22 = new vx2_2(byArray, n3, n4, true, false);
        return vx2_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(vx2_2 object, int n3) {
        int n4;
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        int n7 = ((vx2_2)object).e;
        if (n7 == 0) {
            String string3 = "only owner can write".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        n7 = ((vx2_2)object).c;
        int n8 = n7 + n3;
        byte[] byArray = ((vx2_2)object).a;
        int n10 = 8192;
        if (n8 > n10) {
            int n14 = ((vx2_2)object).d;
            if (n14 != 0) {
                object = new IllegalArgumentException();
                throw object;
            }
            n14 = ((vx2_2)object).b;
            if ((n8 -= n14) > n10) {
                object = new IllegalArgumentException();
                throw object;
            }
            n8 = 0;
            rp_1.g(byArray, 0, byArray, n14, n7);
            n7 = ((vx2_2)object).c;
            n10 = ((vx2_2)object).b;
            ((vx2_2)object).c = n7 -= n10;
            ((vx2_2)object).b = 0;
        }
        n7 = ((vx2_2)object).c;
        n8 = this.b;
        n10 = n8 + n3;
        rp_1.g(this.a, n7, byArray, n8, n10);
        ((vx2_2)object).c = n7 = ((vx2_2)object).c + n3;
        this.b = n4 = this.b + n3;
    }
}

