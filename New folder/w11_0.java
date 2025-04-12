/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from W11
 */
public final class w11_0
extends Y50 {
    public v50_0 A0;
    public int B0;
    public boolean C0;
    public float x0 = -1.0f;
    public int y0;
    public int z0;

    public w11_0() {
        v50_0 v50_02;
        int n3;
        this.y0 = n3 = -1;
        this.z0 = n3;
        this.A0 = v50_02 = this.M;
        v50_02 = null;
        this.B0 = 0;
        this.U.clear();
        v50_0[] v50_0Array = this.U;
        v50_0[] v50_0Array2 = this.A0;
        v50_0Array.add(v50_0Array2);
        v50_0Array = this.T;
        int n4 = v50_0Array.length;
        for (n3 = 0; n3 < n4; ++n3) {
            v50_0 v50_03;
            v50_0Array2 = this.T;
            v50_0Array2[n3] = v50_03 = this.A0;
        }
    }

    public final boolean F() {
        return this.C0;
    }

    public final boolean G() {
        return this.C0;
    }

    public final void Y(Eu1 object, boolean bl2) {
        Object object2 = this.X;
        if (object2 == null) {
            return;
        }
        object2 = this.A0;
        object.getClass();
        int n3 = Eu1.n(object2);
        int n4 = this.B0;
        int n7 = 1;
        if (n4 == n7) {
            this.c0 = n3;
            this.d0 = 0;
            object = this.X;
            n3 = ((Y50)object).p();
            this.R(n3);
            this.W(0);
        } else {
            this.c0 = 0;
            this.d0 = n3;
            object = this.X;
            n3 = ((Y50)object).v();
            this.W(n3);
            this.R(0);
        }
    }

    public final void Z(int n3) {
        this.A0.l(n3);
        this.C0 = true;
    }

    public final void a0(int n3) {
        v50_0 v50_02;
        int n4 = this.B0;
        if (n4 == n3) {
            return;
        }
        this.B0 = n3;
        v50_0[] v50_0Array = this.U;
        v50_0Array.clear();
        n4 = this.B0;
        int n7 = 1;
        this.A0 = n4 == n7 ? (v50_02 = this.L) : (v50_02 = this.M);
        v50_02 = this.A0;
        v50_0Array.add(v50_02);
        v50_0Array = this.T;
        n4 = v50_0Array.length;
        for (n7 = 0; n7 < n4; ++n7) {
            v50_0 v50_03;
            v50_0Array[n7] = v50_03 = this.A0;
        }
    }

    public final void f(Eu1 eu1, boolean n3) {
        int n4;
        mp_0 mp_02;
        float f5;
        int n7;
        Y50$b y50$b;
        Object object = (Z50)this.X;
        if (object == null) {
            return;
        }
        Object object2 = v50$a.LEFT;
        object2 = ((Y50)object).n((v50$a)((Object)object2));
        Object object3 = v50$a.RIGHT;
        object3 = ((Y50)object).n((v50$a)((Object)object3));
        Object object4 = this.X;
        int n8 = 1;
        float f6 = Float.MIN_VALUE;
        Mp$a mp$a = null;
        if (object4 != null && (object4 = object4.W[0]) == (y50$b = Y50$b.WRAP_CONTENT)) {
            n7 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f5 = 0.0f;
            object4 = null;
        }
        int n10 = this.B0;
        if (n10 == 0) {
            object2 = v50$a.TOP;
            object2 = ((Y50)object).n((v50$a)((Object)object2));
            object3 = v50$a.BOTTOM;
            object3 = ((Y50)object).n((v50$a)((Object)object3));
            object = this.X;
            if (object == null || (object = ((Y50)object).W[n8]) != (object4 = Y50$b.WRAP_CONTENT)) {
                n8 = 0;
                f6 = 0.0f;
                mp_02 = null;
            }
            n7 = n8;
            f5 = f6;
        }
        n3 = this.C0;
        n8 = -1;
        f6 = 0.0f / 0.0f;
        n10 = 5;
        if (n3 != 0) {
            object = this.A0;
            n4 = (int)(((v50_0)object).c ? 1 : 0);
            if (n4 != 0) {
                object = eu1.k(object);
                v50_0 v50_02 = this.A0;
                n4 = v50_02.d();
                eu1.d((k93_0)object, n4);
                n4 = this.y0;
                if (n4 != n8) {
                    if (n7 != 0) {
                        object2 = eu1.k(object3);
                        eu1.f((k93_0)object2, (k93_0)object, 0, n10);
                    }
                } else {
                    n4 = this.z0;
                    if (n4 != n8 && n7 != 0) {
                        object3 = eu1.k(object3);
                        object2 = eu1.k(object2);
                        eu1.f((k93_0)object, (k93_0)object2, 0, n10);
                        eu1.f((k93_0)object3, (k93_0)object, 0, n10);
                    }
                }
                this.C0 = false;
                return;
            }
        }
        n3 = this.y0;
        n4 = 8;
        if (n3 != n8) {
            object = this.A0;
            object = eu1.k(object);
            object2 = eu1.k(object2);
            n8 = this.y0;
            eu1.e((k93_0)object, (k93_0)object2, n8, n4);
            if (n7 != 0) {
                object2 = eu1.k(object3);
                eu1.f((k93_0)object2, (k93_0)object, 0, n10);
            }
        } else {
            n3 = this.z0;
            if (n3 != n8) {
                object = this.A0;
                object = eu1.k(object);
                object3 = eu1.k(object3);
                n8 = -this.z0;
                eu1.e((k93_0)object, (k93_0)object3, n8, n4);
                if (n7 != 0) {
                    object2 = eu1.k(object2);
                    eu1.f((k93_0)object, (k93_0)object2, 0, n10);
                    eu1.f((k93_0)object3, (k93_0)object, 0, n10);
                }
            } else {
                float f7 = this.x0;
                float f8 = -1.0f;
                float f11 = f7 - f8;
                n3 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                if (n3 != 0) {
                    object = this.A0;
                    object = eu1.k(object);
                    object3 = eu1.k(object3);
                    f5 = this.x0;
                    mp_02 = eu1.l();
                    mp$a = mp_02.d;
                    mp$a.k((k93_0)object, f8);
                    object = mp_02.d;
                    object.k((k93_0)object3, f5);
                    eu1.c(mp_02);
                }
            }
        }
    }

    public final boolean g() {
        return true;
    }

    public final void k(Y50 y50, HashMap hashMap) {
        int n3;
        float f5;
        super.k(y50, hashMap);
        y50 = (w11_0)y50;
        this.x0 = f5 = ((w11_0)y50).x0;
        this.y0 = n3 = ((w11_0)y50).y0;
        this.z0 = n3 = ((w11_0)y50).z0;
        int n4 = ((w11_0)y50).B0;
        this.a0(n4);
    }

    public final v50_0 n(v50$a v50$a) {
        int n3;
        int[] nArray = W11$a.a;
        int n4 = v50$a.ordinal();
        int n7 = 1;
        if ((n4 = nArray[n4]) != n7 && n4 != (n3 = 2) ? (n4 == (n7 = 3) || n4 == (n7 = 4)) && (n4 = this.B0) == 0 : (n4 = this.B0) == n7) {
            return this.A0;
        }
        return null;
    }
}

