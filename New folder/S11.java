/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class S11 {
    public static VF3 a(Y50 object, int n3, ArrayList arrayList, VF3 vF3) {
        Object object2;
        int n4;
        VF3 vF32;
        int n7;
        Object object3;
        int n8;
        int n10 = n3 == 0 ? ((Y50)object).v0 : ((Y50)object).w0;
        int n14 = 0;
        int n15 = -1;
        if (n10 != n15 && (vF3 == null || n10 != (n8 = vF3.b))) {
            object3 = null;
            for (n8 = 0; n8 < (n7 = arrayList.size()); ++n8) {
                vF32 = (VF3)arrayList.get(n8);
                n4 = vF32.b;
                if (n4 != n10) continue;
                if (vF3 != null) {
                    vF3.c(n3, vF32);
                    arrayList.remove(vF3);
                }
                vF3 = vF32;
                break;
            }
        } else if (n10 != n15) {
            return vF3;
        }
        n10 = 1;
        if (vF3 == null) {
            n8 = object instanceof F41;
            if (n8 != 0) {
                int n16;
                block18: {
                    object3 = object;
                    object3 = (F41)object;
                    vF32 = null;
                    for (n7 = 0; n7 < (n4 = ((F41)object3).y0); ++n7) {
                        Y50 y50 = ((F41)object3).x0[n7];
                        if (!(n3 == 0 && (n16 = y50.v0) != n15 || n3 == n10 && (n16 = y50.w0) != n15)) {
                            continue;
                        }
                        break block18;
                    }
                    n16 = -1;
                }
                if (n16 != n15) {
                    object3 = null;
                    for (n8 = 0; n8 < (n7 = arrayList.size()); ++n8) {
                        vF32 = (VF3)arrayList.get(n8);
                        n4 = vF32.b;
                        if (n4 != n16) continue;
                        vF3 = vF32;
                        break;
                    }
                }
            }
            if (vF3 == null) {
                vF3 = new Object();
                object3 = new ArrayList();
                vF3.a = object3;
                object3 = null;
                vF3.d = null;
                vF3.e = n15;
                n15 = VF3.f;
                VF3.f = n8 = n15 + 1;
                vF3.b = n15;
                vF3.c = n3;
            }
            arrayList.add(vF3);
        }
        if ((n8 = (int)(((ArrayList)(object2 = vF3.a)).contains(object) ? 1 : 0)) == 0) {
            ((ArrayList)object2).add(object);
            n15 = object instanceof w11_0;
            if (n15 != 0) {
                object2 = object;
                object2 = (w11_0)object;
                object3 = ((w11_0)object2).A0;
                n15 = ((w11_0)object2).B0;
                if (n15 == 0) {
                    n14 = 1;
                }
                ((v50_0)object3).c(n14, vF3, arrayList);
            }
            n10 = vF3.b;
            if (n3 == 0) {
                ((Y50)object).v0 = n10;
                ((Y50)object).L.c(n3, vF3, arrayList);
                v50_0 v50_02 = ((Y50)object).N;
                v50_02.c(n3, vF3, arrayList);
            } else {
                ((Y50)object).w0 = n10;
                ((Y50)object).M.c(n3, vF3, arrayList);
                ((Y50)object).P.c(n3, vF3, arrayList);
                v50_0 v50_03 = ((Y50)object).O;
                v50_03.c(n3, vF3, arrayList);
            }
            object = ((Y50)object).S;
            ((v50_0)object).c(n3, vF3, arrayList);
        }
        return vF3;
    }

    public static boolean b(Y50$b y50$b, Y50$b y50$b2, Y50$b y50$b3, Y50$b y50$b4) {
        boolean bl2;
        boolean bl3;
        Y50$b y50$b5;
        Y50$b y50$b6;
        Y50$b y50$b7 = Y50$b.FIXED;
        boolean bl4 = true;
        if (y50$b3 != y50$b7 && y50$b3 != (y50$b6 = Y50$b.WRAP_CONTENT) && (y50$b3 != (y50$b5 = Y50$b.MATCH_PARENT) || y50$b == y50$b6)) {
            bl3 = false;
            y50$b = null;
        } else {
            bl3 = true;
        }
        if (y50$b4 != y50$b7 && y50$b4 != (y50$b3 = Y50$b.WRAP_CONTENT) && (y50$b4 != (y50$b7 = Y50$b.MATCH_PARENT) || y50$b2 == y50$b3)) {
            bl2 = false;
            y50$b2 = null;
        } else {
            bl2 = true;
        }
        if (!bl3 && !bl2) {
            return false;
        }
        return bl4;
    }
}

