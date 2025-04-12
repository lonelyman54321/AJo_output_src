/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class X70 {
    public static final Mw2 a;
    public static final E70 b;

    static {
        Object object = new Mw2(true, 14);
        a = object;
        long l2 = OX.f;
        long l3 = OX.b;
        float f5 = 0.38f;
        long l4 = OX.b(l3, f5);
        long l7 = OX.b(l3, f5);
        b = object = new E70(l2, l3, l3, l4, l7);
    }

    public static final void a(E70 e70, LP1 lP1, u10 u102, b30_0 object, int n3) {
        block17: {
            Serializable serializable;
            block16: {
                Object object2;
                float f5;
                float f6;
                int n4;
                block15: {
                    object = object.g(-921259293);
                    n4 = n3 & 6;
                    if (n4 == 0) {
                        n4 = (int)(((j30_0)object).J(e70) ? 1 : 0);
                        n4 = n4 != 0 ? 4 : 2;
                        n4 |= n3;
                    } else {
                        n4 = n3;
                    }
                    int n7 = n3 & 0x30;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        if (n7 != 0) {
                            n7 = 32;
                            f6 = 4.5E-44f;
                        } else {
                            n7 = 16;
                            f6 = 2.2E-44f;
                        }
                        n4 |= n7;
                    }
                    if ((n7 = n3 & 0x180) == 0) {
                        n7 = (int)(((j30_0)object).x(u102) ? 1 : 0);
                        if (n7 != 0) {
                            n7 = 256;
                            f6 = 3.59E-43f;
                        } else {
                            n7 = 128;
                            f6 = 1.8E-43f;
                        }
                        n4 |= n7;
                    }
                    n7 = n4 & 0x93;
                    int n8 = 146;
                    f5 = 2.05E-43f;
                    if (n7 != n8 || (n7 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block15;
                    ((j30_0)object).D();
                    break block16;
                }
                float f7 = O70.d;
                f6 = O70.e;
                i13 i132 = SP2.a(f6);
                long l2 = 0L;
                long l3 = 0L;
                Object object3 = lP1;
                Object object4 = c13_0.c(lP1, f7, i132, l2, l3, 28);
                long l4 = e70.a;
                i132 = fg2_1.a;
                object4 = androidx.compose.foundation.a.b((LP1)object4, l4, i132);
                object3 = Tj1.Max;
                object4 = f.b((LP1)object4, (Tj1)((Object)object3));
                f5 = O70.i;
                f7 = 0.0f;
                boolean bl2 = true;
                object4 = h.g((LP1)object4, 0.0f, f5, (int)(bl2 ? 1 : 0));
                Object object5 = NT2.b((b30_0)object);
                object3 = ji1.a;
                boolean bl3 = true;
                boolean bl4 = true;
                Object object6 = object2;
                object2 = new g((st2_2)object5, false, null, bl3, bl4);
                object4 = a30_0.a((LP1)object4, (Function1)object3, (gx0_2)object2);
                n4 = n4 << 3 & 0x1C00;
                object3 = zp.c;
                object2 = Nc$a.m;
                boolean bl5 = false;
                object3 = oZ.a((zp$l)object3, (Gx$a)object2, (b30_0)object, 0);
                int n10 = ((j30_0)object).P;
                object6 = ((j30_0)object).P();
                object4 = a30_0.c((b30_0)object, (LP1)object4);
                N20.W.getClass();
                object5 = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl6 = mp2 instanceof mp;
                if (!bl6) break block17;
                ((j30_0)object).A();
                bl6 = ((j30_0)object).O;
                if (bl6) {
                    ((j30_0)object).C((Function0)object5);
                } else {
                    ((j30_0)object).n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)object5);
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object6, (Function2)object3);
                object3 = N20$a.f;
                bl5 = ((j30_0)object).O;
                if (bl5 || !(bl5 = Intrinsics.areEqual(object6 = ((j30_0)object).v(), object5 = Integer.valueOf(n10)))) {
                    rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object4, (Function2)object3);
                object4 = sz_0.a;
                n4 = n4 >> 6 & 0x70 | 6;
                serializable = Integer.valueOf(n4);
                u102.invoke(object4, object, serializable);
                ((j30_0)object).T(bl2);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                serializable = new Q70(e70, lP1, u102, n3);
                ((CF2)object).d = serializable;
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(String string2, boolean bl2, E70 e70, LP1 lP1, gx0_2 gx0_22, Function0 function0, b30_0 object, int n3) {
        Object object2;
        int n4;
        Object object3;
        Object object4;
        int n7;
        Object object5;
        Object object6;
        Object object7;
        Object object8 = string2;
        boolean bl3 = bl2;
        E70 e702 = e70;
        LP1 lP12 = lP1;
        gx0_2 gx0_23 = gx0_22;
        Object object9 = function0;
        int n8 = n3;
        Object object10 = object;
        Object object11 = object.g(791018367);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object11).J(string2) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n8;
        } else {
            n10 = n3;
        }
        int n14 = n8 & 0x30;
        int n15 = 32;
        float f5 = 4.5E-44f;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object11).a(bl3) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n8 & 0x180) == 0) {
            n14 = (int)(((j30_0)object11).J(e702) ? 1 : 0);
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n8 & 0xC00) == 0) {
            n14 = (int)(((j30_0)object11).J(lP12) ? 1 : 0);
            n14 = n14 != 0 ? 2048 : 1024;
            n10 |= n14;
        }
        if ((n14 = n8 & 0x6000) == 0) {
            n14 = (int)(((j30_0)object11).x(gx0_23) ? 1 : 0);
            n14 = n14 != 0 ? 16384 : 8192;
            n10 |= n14;
        }
        n14 = 0x30000 & n8;
        int n16 = 131072;
        float f6 = 1.83671E-40f;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object11).x(object9) ? 1 : 0);
            n14 = n14 != 0 ? 131072 : 65536;
            n10 |= n14;
        }
        n14 = 0x12493 & n10;
        int n17 = 74898;
        float f7 = 1.04954E-40f;
        if (n14 == n17 && (n14 = (int)(((j30_0)object11).h() ? 1 : 0)) != 0) {
            ((j30_0)object11).D();
            object7 = object11;
        } else {
            long l2;
            int n18;
            int n19;
            Object object12;
            LP1$a lP1$a = LP1$a.b;
            object6 = O70.f;
            object5 = zp.a;
            f7 = O70.h;
            Object object13 = zp.g(f7);
            n7 = n10 & 0x70;
            if (n7 == n15) {
                n7 = 1;
            } else {
                n7 = 0;
                object12 = null;
            }
            f5 = 6.42848E-40f;
            n15 = 0x70000 & n10;
            if (n15 == n16) {
                n15 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n15 = 0;
                f5 = 0.0f;
                object4 = null;
            }
            object4 = ((j30_0)object11).v();
            if ((n7 |= n15) || object4 == (object12 = b30$a.a)) {
                object4 = new r70_0((Function0)object9, bl3);
                ((j30_0)object11).o(object4);
            }
            object4 = (Function0)object4;
            object12 = j.c(d.b(lP12, bl3, (String)object8, (Function0)object4, 4), 1.0f);
            f6 = O70.a;
            f5 = O70.b;
            float f8 = O70.c;
            object10 = j.j((LP1)object12, f6, f8, f5, f8);
            n15 = 2;
            f5 = 2.8E-45f;
            object10 = h.g((LP1)object10, f7, 0.0f, n15);
            n7 = 54;
            object12 = iQ2.a((zp$e)object13, (Gx$b)object6, (b30_0)object11, n7);
            n14 = ((j30_0)object11).P;
            object4 = ((j30_0)object11).P();
            object10 = a30_0.c((b30_0)object11, (LP1)object10);
            N20.W.getClass();
            object3 = N20$a.b;
            object5 = ((j30_0)object11).a;
            n4 = object5 instanceof mp;
            if (n4 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object11).A();
            n4 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n4 != 0) {
                ((j30_0)object11).C((Function0)object3);
            } else {
                ((j30_0)object11).n();
            }
            object13 = N20$a.e;
            Ow3.a((b30_0)object11, object12, (Function2)object13);
            object12 = N20$a.d;
            Ow3.a((b30_0)object11, object4, (Function2)object12);
            object4 = N20$a.f;
            n8 = (int)(((j30_0)object11).O ? 1 : 0);
            if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object11).v(), object9 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                rk_0.a(n14, (j30_0)object11, n14, (N20$a$a)object4);
            }
            object6 = N20$a.c;
            Ow3.a((b30_0)object11, object10, (Function2)object6);
            if (gx0_23 == null) {
                ((j30_0)object11).K(554568909);
                n19 = 0;
                f8 = 0.0f;
                object10 = null;
            } else {
                n19 = 554568910;
                f8 = 4.812842E-19f;
                ((j30_0)object11).K(n19);
                float f11 = O70.j;
                int n20 = 2;
                object10 = j.g(lP1$a, f11, 0.0f, f11, f11, n20);
                object2 = Nc$a.a;
                object9 = null;
                object2 = HA.e((Nc)object2, false);
                n18 = ((j30_0)object11).P;
                object8 = ((j30_0)object11).P();
                object10 = a30_0.c((b30_0)object11, (LP1)object10);
                n17 = object5 instanceof mp;
                if (n17 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object11).A();
                n17 = (int)(((j30_0)object11).O ? 1 : 0);
                if (n17 != 0) {
                    ((j30_0)object11).C((Function0)object3);
                } else {
                    ((j30_0)object11).n();
                }
                Ow3.a((b30_0)object11, object2, (Function2)object13);
                Ow3.a((b30_0)object11, object8, (Function2)object12);
                n7 = (int)(((j30_0)object11).O ? 1 : 0);
                if (n7 || !(n7 = (int)(Intrinsics.areEqual(object12 = ((j30_0)object11).v(), object3 = Integer.valueOf(n18)) ? 1 : 0))) {
                    rk_0.a(n18, (j30_0)object11, n18, (N20$a$a)object4);
                }
                Ow3.a((b30_0)object11, object10, (Function2)object6);
                l2 = bl3 ? e702.c : e702.e;
                object6 = new OX(l2);
                n19 = 0;
                f8 = 0.0f;
                object10 = null;
                object12 = 0;
                gx0_23.invoke(object6, object11, object12);
                n7 = 1;
                ((j30_0)object11).T(n7 != 0);
            }
            ((j30_0)object11).T(false);
            l2 = bl3 ? e702.b : e702.d;
            long l3 = O70.k;
            tv0_0 tv0_02 = O70.l;
            long l4 = O70.n;
            int n21 = O70.g;
            long l7 = O70.m;
            int n22 = 16613240;
            object12 = new xm3(l2, l3, tv0_02, null, l4, null, n21, l7, n22);
            n19 = 1065353216;
            f8 = 1.0f;
            double d2 = f8;
            double d5 = 0.0;
            n4 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
            if (n4 <= 0) {
                object10 = "invalid weight 1.0; must be greater than zero".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object10);
                throw illegalArgumentException;
            }
            f8 = kotlin.ranges.f.c(f8, Float.MAX_VALUE);
            object6 = new LayoutWeightElement(f8, true);
            n19 = 0x180000;
            f8 = 2.204052E-39f;
            n18 = (n10 &= 0xE) | n19;
            n4 = 0;
            object13 = null;
            n8 = 0;
            object5 = null;
            object8 = null;
            int n24 = 1;
            float f12 = Float.MIN_VALUE;
            int n25 = 440;
            object7 = string2;
            object10 = object6;
            n14 = 0;
            object6 = null;
            n15 = 0;
            object4 = null;
            f5 = 0.0f;
            n16 = 0;
            object3 = null;
            f6 = 0.0f;
            boolean bl4 = true;
            n17 = n24;
            f7 = f12;
            object = object11;
            object11 = null;
            object2 = object;
            dx.b(string2, (LP1)object10, (xm3)object12, null, 0, false, n24, 0, null, (b30_0)object, n18, n25);
            object7 = object;
            ((j30_0)object).T(bl4);
        }
        object11 = ((j30_0)object7).X();
        if (object11 != null) {
            object7 = object2;
            object10 = string2;
            n7 = (int)(bl2 ? 1 : 0);
            object6 = e70;
            object4 = lP1;
            object3 = gx0_22;
            object5 = function0;
            n4 = n3;
            object2 = new S70(string2, bl2, e70, lP1, gx0_22, function0, n3);
            ((CF2)object11).d = object2;
        }
    }

    public static final void c(K70 k70, Function0 function0, LP1 lP1, E70 e70, Yk3 yk3, b30_0 object, int n3) {
        Object object2;
        w70_0 w70_02;
        int n4;
        Object object3;
        Object object4;
        int n7;
        object = object.g(1447189339);
        int n8 = n3 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).J(k70) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n3;
        } else {
            n8 = n3;
        }
        int n10 = n3 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n3 & 0x180) == 0) {
            n10 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n10 = n3 & 0xC00) == 0) {
            n10 = (int)(((j30_0)object).J(e70) ? 1 : 0);
            n10 = n10 != 0 ? 2048 : 1024;
            n8 |= n10;
        }
        if ((n10 = n3 & 0x6000) == 0) {
            n10 = (int)(((j30_0)object).x(yk3) ? 1 : 0);
            n10 = n10 != 0 ? 16384 : 8192;
            n8 |= n10;
        }
        if ((n10 = n8 & 0x2493) == (n7 = 9362) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object4 = new V70(e70, lP1, yk3);
            n7 = 795909757;
            object3 = v10.c(n7, (fx0_2)object4, (b30_0)object);
            n10 = n8 & 0xE | 0xD80;
            n4 = n10 | (n8 &= 0x70);
            w70_02 = null;
            object2 = a;
            object4 = k70;
            xi.a(k70, function0, (Mw2)object2, (u10)object3, (b30_0)object, n4, 0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            object4 = k70;
            object2 = lP1;
            object3 = e70;
            n4 = n3;
            w70_02 = new w70_0(k70, function0, lP1, e70, yk3, n3);
            ((CF2)object).d = w70_02;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void d(K70 k70, Function0 function0, LP1 lP1, Yk3 yk3, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14 = n3;
        int n15 = 712057293;
        Object object3 = b30_02.g(n15);
        int n16 = n3 & 6;
        if (n16 == 0) {
            n10 = (int)(((j30_0)object3).J(k70) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n14;
        } else {
            n10 = n3;
        }
        int n17 = n14 & 0x30;
        if (n17 == 0) {
            n8 = ((j30_0)object3).x(function0);
            n8 = n8 != 0 ? 32 : 16;
            n10 |= n8;
        }
        if ((n8 = n14 & 0x180) == 0) {
            n7 = ((j30_0)object3).J(lP1);
            n7 = n7 != 0 ? 256 : 128;
            n10 |= n7;
        }
        if ((n7 = n14 & 0xC00) == 0) {
            n7 = (int)(((j30_0)object3).x(yk3) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n10 |= n7;
        }
        if ((n7 = n10 & 0x493) == (n4 = 1170) && (n7 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            Object object4;
            int n18;
            object2 = AndroidCompositionLocals_androidKt.b;
            object2 = (Context)((j30_0)object3).j((H30)object2);
            object = AndroidCompositionLocals_androidKt.a;
            object = (Configuration)((j30_0)object3).j((H30)object);
            int n19 = ((j30_0)object3).J(object2);
            n4 = ((j30_0)object3).J(object) | n19;
            Object object5 = ((j30_0)object3).v();
            if (n4 != 0 || object5 == (object = b30$a.a)) {
                void var25_31;
                object = b;
                long l2 = ((E70)object).a;
                int n20 = 0x1010031;
                int[] nArray = new int[]{n20};
                TypedArray typedArray = object2.obtainStyledAttributes(16973958, nArray);
                int n21 = zx_0.i(l2);
                n18 = 0;
                Object var25_27 = null;
                int n22 = typedArray.getColor(0, n21);
                typedArray.recycle();
                if (n22 != n21) {
                    l2 = zx_0.c(n22);
                }
                long l3 = l2;
                n19 = 16842806;
                object5 = new int[]{n19};
                int n24 = 16973952;
                object2 = object2.obtainStyledAttributes(n24, (int[])object5);
                object5 = object2.getColorStateList(0);
                object2.recycle();
                long l4 = ((E70)object).b;
                n7 = zx_0.i(l4);
                n21 = 0;
                object4 = null;
                if (object5 != null) {
                    int[] nArray2 = new int[]{16842910};
                    n18 = object5.getColorForState(nArray2, n7);
                    Integer n25 = n18;
                } else {
                    n18 = 0;
                    Object var25_30 = null;
                }
                if (var25_31 != null && (n22 = var25_31.intValue()) != n7) {
                    n7 = var25_31.intValue();
                    l4 = zx_0.c(n7);
                }
                long l7 = l4;
                long l8 = ((E70)object).d;
                n24 = zx_0.i(l8);
                if (object5 != null) {
                    n20 = -16842910;
                    int[] nArray3 = new int[]{n20};
                    n19 = object5.getColorForState(nArray3, n24);
                    object4 = n19;
                }
                if (object4 != null && (n19 = ((Integer)object4).intValue()) != n24) {
                    n7 = (Integer)object4;
                    l8 = zx_0.c(n7);
                }
                object5 = new E70(l3, l7, l7, l8, l8);
                ((j30_0)object3).o(object5);
            }
            Object object6 = object5;
            object6 = (E70)object5;
            n7 = n10 & 0x3FE;
            n10 <<= 3;
            n4 = 57344;
            n18 = n7 | (n10 &= n4);
            object2 = k70;
            object = function0;
            object5 = lP1;
            Yk3 yk32 = yk3;
            object4 = object3;
            X70.c(k70, function0, lP1, (E70)object6, yk3, (b30_0)object3, n18);
        }
        object2 = ((j30_0)object3).X();
        if (object2 != null) {
            object3 = object;
            n14 = n3;
            ((CF2)object2).d = object = new t70_0(k70, function0, lP1, yk3, n3);
        }
    }
}

