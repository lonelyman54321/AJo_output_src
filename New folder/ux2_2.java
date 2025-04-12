/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uX2
 */
public final class ux2_2 {
    public final byte[] a;
    public int b;
    public int c;
    public tf_0 d;
    public boolean e;
    public ux2_2 f;
    public ux2_2 g;

    public ux2_2() {
        byte[] byArray = new byte[8192];
        this.a = byArray;
        this.e = true;
        this.d = null;
    }

    public ux2_2(byte[] byArray, int n3, int n4, tf_0 tf_02) {
        this.a = byArray;
        this.b = n3;
        this.c = n4;
        this.d = tf_02;
        this.e = false;
    }

    public final int a() {
        int n3 = this.a.length;
        int n4 = this.c;
        return n3 - n4;
    }

    public final int b() {
        int n3 = this.c;
        int n4 = this.b;
        return n3 - n4;
    }

    public final byte c(int n3) {
        int n4 = this.b + n3;
        return this.a[n4];
    }

    public final ux2_2 d() {
        ux2_2 ux2_22;
        ux2_2 ux2_23 = this.f;
        ux2_2 ux2_24 = this.g;
        if (ux2_24 != null) {
            Intrinsics.checkNotNull(ux2_24);
            ux2_24.f = ux2_22 = this.f;
        }
        if ((ux2_24 = this.f) != null) {
            Intrinsics.checkNotNull(ux2_24);
            ux2_24.g = ux2_22 = this.g;
        }
        this.f = null;
        this.g = null;
        return ux2_23;
    }

    public final void e(ux2_2 ux2_22) {
        ux2_2 ux2_23;
        Intrinsics.checkNotNullParameter(ux2_22, "segment");
        ux2_22.g = this;
        ux2_22.f = ux2_23 = this.f;
        ux2_23 = this.f;
        if (ux2_23 != null) {
            Intrinsics.checkNotNull(ux2_23);
            ux2_23.g = ux2_22;
        }
        this.f = ux2_22;
    }

    public final ux2_2 f() {
        Object object = this.d;
        if (object == null) {
            object = bx2_2.a;
            this.d = object = new ng2_2();
        }
        int n3 = this.b;
        int n4 = this.c;
        ((tf_0)object).a();
        Object object2 = Unit.a;
        byte[] byArray = this.a;
        object2 = new ux2_2(byArray, n3, n4, (tf_0)object);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(ux2_2 object, int n3) {
        int n4;
        int n7;
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n8 = ((ux2_2)object).e;
        if (n8 == 0) {
            String string2 = "only owner can write".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        n8 = ((ux2_2)object).c + n3;
        byte[] byArray = ((ux2_2)object).a;
        int n10 = 8192;
        if (n8 > n10) {
            object2 = ((ux2_2)object).d;
            n7 = 0;
            if (object2 != null) {
                n8 = (int)(((tf_0)object2).b() ? 1 : 0);
            } else {
                n8 = 0;
                object2 = null;
            }
            if (n8 != 0) {
                object = new IllegalArgumentException();
                throw object;
            }
            n8 = ((ux2_2)object).c;
            int n14 = n8 + n3;
            int n15 = ((ux2_2)object).b;
            if ((n14 -= n15) > n10) {
                object = new IllegalArgumentException();
                throw object;
            }
            rp_1.g(byArray, 0, byArray, n15, n8);
            n8 = ((ux2_2)object).c;
            n10 = ((ux2_2)object).b;
            ((ux2_2)object).c = n8 -= n10;
            ((ux2_2)object).b = 0;
        }
        n8 = ((ux2_2)object).c;
        n10 = this.b;
        n7 = n10 + n3;
        rp_1.g(this.a, n8, byArray, n10, n7);
        ((ux2_2)object).c = n8 = ((ux2_2)object).c + n3;
        this.b = n4 = this.b + n3;
    }
}

