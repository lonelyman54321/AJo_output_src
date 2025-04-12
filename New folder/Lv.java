/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class Lv
extends F41 {
    public boolean A0 = true;
    public int B0 = 0;
    public boolean C0 = false;
    public int z0 = 0;

    public final boolean F() {
        return this.C0;
    }

    public final boolean G() {
        return this.C0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a0() {
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        int n10 = 1;
        int n14 = 0;
        int n15 = 0;
        Object object2 = null;
        int n16 = 1;
        while (true) {
            n8 = this.y0;
            n7 = 3;
            n4 = 2;
            if (n15 >= n8) break;
            object = this.x0[n15];
            n3 = this.A0;
            if (!(n3 == 0 && (n3 = ((Y50)object).g()) == 0 || ((n3 = this.z0) != 0 && n3 != n10 || (n3 = (int)(((Y50)object).F() ? 1 : 0)) != 0) && ((n3 = this.z0) != n4 && n3 != n7 || (n8 = (int)(((Y50)object).G() ? 1 : 0)) != 0))) {
                n16 = 0;
            }
            ++n15;
        }
        if (n16 != 0 && n8 > 0) {
            n15 = 0;
            object2 = null;
            n16 = 0;
        } else {
            return false;
        }
        while (n14 < (n8 = this.y0)) {
            object = this.x0[n14];
            n3 = (int)(this.A0 ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(((Y50)object).g() ? 1 : 0)) != 0) {
                v50$a v50$a;
                if (n16 == 0) {
                    n16 = this.z0;
                    if (n16 == 0) {
                        object2 = v50$a.LEFT;
                        object2 = ((Y50)object).n((v50$a)((Object)object2));
                        n15 = ((v50_0)object2).d();
                    } else if (n16 == n10) {
                        object2 = v50$a.RIGHT;
                        object2 = ((Y50)object).n((v50$a)((Object)object2));
                        n15 = ((v50_0)object2).d();
                    } else if (n16 == n4) {
                        object2 = v50$a.TOP;
                        object2 = ((Y50)object).n((v50$a)((Object)object2));
                        n15 = ((v50_0)object2).d();
                    } else if (n16 == n7) {
                        object2 = v50$a.BOTTOM;
                        object2 = ((Y50)object).n((v50$a)((Object)object2));
                        n15 = ((v50_0)object2).d();
                    }
                    n16 = 1;
                }
                if ((n3 = this.z0) == 0) {
                    v50$a = v50$a.LEFT;
                    object = ((Y50)object).n(v50$a);
                    n8 = ((v50_0)object).d();
                    n15 = Math.min(n15, n8);
                } else if (n3 == n10) {
                    v50$a = v50$a.RIGHT;
                    object = ((Y50)object).n(v50$a);
                    n8 = ((v50_0)object).d();
                    n15 = Math.max(n15, n8);
                } else if (n3 == n4) {
                    v50$a = v50$a.TOP;
                    object = ((Y50)object).n(v50$a);
                    n8 = ((v50_0)object).d();
                    n15 = Math.min(n15, n8);
                } else if (n3 == n7) {
                    v50$a = v50$a.BOTTOM;
                    object = ((Y50)object).n(v50$a);
                    n8 = ((v50_0)object).d();
                    n15 = Math.max(n15, n8);
                }
            }
            ++n14;
        }
        n14 = this.B0;
        n15 += n14;
        n14 = this.z0;
        if (n14 != 0 && n14 != n10) {
            this.Q(n15, n15);
        } else {
            this.P(n15, n15);
        }
        this.C0 = n10;
        return n10 != 0;
    }

    public final int b0() {
        int n3;
        int n4 = this.z0;
        if (n4 != 0 && n4 != (n3 = 1)) {
            int n7 = 2;
            if (n4 != n7 && n4 != (n7 = 3)) {
                return -1;
            }
            return n3;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(Eu1 eu1, boolean bl2) {
        int n3;
        int n4;
        v50_0 v50_02;
        Object object;
        int n7;
        int n8;
        int n10;
        v50_0 v50_03;
        int n14;
        v50_0 v50_04;
        int n15;
        Object object2;
        Object object3;
        Eu1 eu12;
        Lv lv;
        block20: {
            lv = this;
            eu12 = eu1;
            v50_0[] v50_0Array = this.T;
            object3 = this.L;
            v50_0Array[0] = object3;
            object2 = this.M;
            n15 = 2;
            v50_0Array[n15] = object2;
            v50_04 = this.N;
            n14 = 1;
            v50_0Array[n14] = v50_04;
            v50_03 = this.O;
            n10 = 3;
            v50_0Array[n10] = v50_03;
            for (n8 = 0; n8 < (n7 = v50_0Array.length); ++n8) {
                v50_0 v50_05 = v50_0Array[n8];
                object = eu12.k(v50_05);
                v50_05.i = object;
            }
            n8 = lv.z0;
            if (n8 < 0) return;
            n7 = 4;
            if (n8 >= n7) return;
            v50_02 = v50_0Array[n8];
            n8 = (int)(lv.C0 ? 1 : 0);
            if (n8 == 0) {
                this.a0();
            }
            if ((n8 = (int)(lv.C0 ? 1 : 0)) != 0) {
                lv.C0 = false;
                int n16 = lv.z0;
                if (n16 != 0 && n16 != n14) {
                    if (n16 != n15) {
                        if (n16 != n10) return;
                    }
                    k93_0 k93_02 = ((v50_0)object2).i;
                    int n17 = lv.d0;
                    eu12.d(k93_02, n17);
                    k93_0 k93_03 = v50_03.i;
                    n17 = lv.d0;
                    eu12.d(k93_03, n17);
                    return;
                }
                k93_0 k93_04 = ((v50_0)object3).i;
                int n18 = lv.c0;
                eu12.d(k93_04, n18);
                k93_0 k93_05 = v50_04.i;
                n18 = lv.c0;
                eu12.d(k93_05, n18);
                return;
            }
            for (n8 = 0; n8 < (n4 = lv.y0); ++n8) {
                v50_0 v50_06;
                v50_0 v50_07;
                Y50$b y50$b;
                Y50$b y50$b2;
                v50_0 v50_08;
                v50_0 v50_09;
                Y50$b y50$b3;
                Y50$b y50$b4;
                object = lv.x0[n8];
                n3 = lv.A0;
                if (!(n3 == 0 && (n3 = ((Y50)object).g()) == 0 || ((n3 = lv.z0) != 0 && n3 != n14 || (y50$b4 = ((Y50)object).W[0]) != (y50$b3 = Y50$b.MATCH_CONSTRAINT) || (v50_09 = ((Y50)object).L.f) == null || (v50_08 = ((Y50)object).N.f) == null) && (n3 != n15 && n3 != n10 || (y50$b2 = ((Y50)object).W[n14]) != (y50$b = Y50$b.MATCH_CONSTRAINT) || (v50_07 = ((Y50)object).M.f) == null || (v50_06 = ((Y50)object).O.f) == null))) {
                    n8 = 1;
                    break block20;
                }
                n7 = 4;
            }
            n8 = 0;
        }
        n7 = (int)(((v50_0)object3).g() ? 1 : 0);
        if (n7 == 0 && (n7 = (int)(v50_04.g() ? 1 : 0)) == 0) {
            n7 = 0;
            Object var15_41 = null;
        } else {
            n7 = 1;
        }
        n4 = (int)(((v50_0)object2).g() ? 1 : 0);
        if (n4 == 0 && (n4 = (int)(v50_03.g() ? 1 : 0)) == 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = 1;
        }
        n8 = n8 == 0 && ((n8 = lv.z0) == 0 && n7 != 0 || n8 == n15 && n4 != 0 || n8 == n14 && n7 != 0 || n8 == n10 && n4 != 0) ? 5 : 4;
        Object var15_43 = null;
        for (n7 = 0; n7 < (n4 = lv.y0); ++n7) {
            object = lv.x0[n7];
            n3 = (int)(lv.A0 ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(((Y50)object).g() ? 1 : 0)) != 0) {
                Object object4;
                v50_0[] v50_0Array = ((Y50)object).T;
                int n19 = lv.z0;
                v50_0 v50_010 = v50_0Array[n19];
                k93_0 k93_06 = eu12.k(v50_010);
                n19 = lv.z0;
                object = ((Y50)object).T[n19];
                ((v50_0)object).i = k93_06;
                Object object5 = ((v50_0)object).f;
                if (object5 != null && (object5 = ((v50_0)object5).d) == lv) {
                    n10 = ((v50_0)object).g;
                } else {
                    n10 = 0;
                    object5 = null;
                }
                if (n19 != 0 && n19 != n15) {
                    object = v50_02.i;
                    n19 = lv.B0 + n10;
                    object4 = eu1.l();
                    k93_0 k93_07 = eu1.m();
                    k93_07.d = 0;
                    ((mp_0)object4).c((k93_0)object, k93_06, k93_07, n19);
                    eu12.c((mp_0)object4);
                } else {
                    object4 = v50_02.i;
                    n14 = lv.B0 - n10;
                    object = eu1.l();
                    k93_0 k93_08 = eu1.m();
                    k93_08.d = 0;
                    ((mp_0)object).d((k93_0)object4, k93_06, k93_08, n14);
                    eu12.c((mp_0)object);
                }
                object4 = v50_02.i;
                n14 = lv.B0 + n10;
                eu12.e((k93_0)object4, k93_06, n14, n8);
            }
            n15 = 2;
            n14 = 1;
            n10 = 3;
        }
        int n20 = lv.z0;
        n15 = 8;
        if (n20 == 0) {
            k93_0 k93_09 = v50_04.i;
            object2 = ((v50_0)object3).i;
            eu12.e(k93_09, (k93_0)object2, 0, n15);
            k93_0 k93_010 = ((v50_0)object3).i;
            object2 = lv.X.N.i;
            n15 = 4;
            eu12.e(k93_010, (k93_0)object2, 0, n15);
            k93_0 k93_011 = ((v50_0)object3).i;
            object3 = lv.X.L.i;
            eu12.e(k93_011, (k93_0)object3, 0, 0);
            return;
        }
        n14 = 1;
        if (n20 == n14) {
            k93_0 k93_012 = ((v50_0)object3).i;
            object2 = v50_04.i;
            eu12.e(k93_012, (k93_0)object2, 0, n15);
            k93_0 k93_013 = ((v50_0)object3).i;
            object2 = lv.X.L.i;
            n15 = 4;
            eu12.e(k93_013, (k93_0)object2, 0, n15);
            k93_0 k93_014 = ((v50_0)object3).i;
            object3 = lv.X.N.i;
            eu12.e(k93_014, (k93_0)object3, 0, 0);
            return;
        }
        int n21 = 2;
        if (n20 == n21) {
            k93_0 k93_015 = v50_03.i;
            object3 = ((v50_0)object2).i;
            eu12.e(k93_015, (k93_0)object3, 0, n15);
            k93_0 k93_016 = ((v50_0)object2).i;
            object3 = lv.X.O.i;
            n15 = 4;
            eu12.e(k93_016, (k93_0)object3, 0, n15);
            k93_0 k93_017 = ((v50_0)object2).i;
            object3 = lv.X.M.i;
            eu12.e(k93_017, (k93_0)object3, 0, 0);
            return;
        }
        n21 = 3;
        if (n20 != n21) return;
        k93_0 k93_018 = ((v50_0)object2).i;
        object3 = v50_03.i;
        eu12.e(k93_018, (k93_0)object3, 0, n15);
        k93_0 k93_019 = ((v50_0)object2).i;
        object3 = lv.X.M.i;
        n15 = 4;
        eu12.e(k93_019, (k93_0)object3, 0, n15);
        k93_0 k93_020 = ((v50_0)object2).i;
        object3 = lv.X.O.i;
        eu12.e(k93_020, (k93_0)object3, 0, 0);
    }

    public final boolean g() {
        return true;
    }

    public final void k(Y50 y50, HashMap hashMap) {
        int n3;
        int n4;
        super.k(y50, hashMap);
        y50 = (Lv)y50;
        this.z0 = n4 = ((Lv)y50).z0;
        n4 = (int)(((Lv)y50).A0 ? 1 : 0);
        this.A0 = n4;
        this.B0 = n3 = ((Lv)y50).B0;
    }

    public final String toString() {
        int n3;
        CharSequence charSequence = new StringBuilder("[Barrier] ");
        String string2 = this.m0;
        Object object = " {";
        charSequence = h30_0.a((StringBuilder)charSequence, string2, (String)object);
        string2 = null;
        for (int i3 = 0; i3 < (n3 = this.y0); ++i3) {
            object = this.x0[i3];
            if (i3 > 0) {
                String string3 = ", ";
                charSequence = Ft2.a((String)charSequence, string3);
            }
            charSequence = Ex0.a((String)charSequence);
            object = ((Y50)object).m0;
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return Ft2.a((String)charSequence, "}");
    }
}

