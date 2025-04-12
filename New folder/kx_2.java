/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kX
 */
public final class kx_2 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(fb3_2 fb3_22, LP1 object, he1_2 he1_22, fb3_2 fb3_23, u10 u102, b30_0 b30_02, int n3, int n4) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        int n8;
        Object object7;
        int n10;
        int n14;
        int n15;
        int n16;
        Object object8;
        Object object9;
        int n17;
        fb3_2 fb3_24;
        he1_2 he1_23;
        fb3_2 fb3_25;
        block32: {
            fb3_25 = fb3_22;
            he1_23 = he1_22;
            fb3_24 = fb3_23;
            n17 = n3;
            int n18 = -965428519;
            object9 = b30_02;
            object8 = b30_02.g(n18);
            n16 = n3 & 6;
            if (n16 == 0) {
                n16 = (int)(((j30_0)object8).J(fb3_22) ? 1 : 0);
                n16 = n16 != 0 ? 4 : 2;
                n16 |= n17;
            } else {
                n16 = n3;
            }
            n15 = n4 & 2;
            n14 = 32;
            if (n15 != 0) {
                n16 |= 0x30;
            } else {
                n10 = n17 & 0x30;
                if (n10 == 0) {
                    object7 = object;
                    n8 = (int)(((j30_0)object8).J(object) ? 1 : 0);
                    n8 = n8 != 0 ? 32 : 16;
                }
            }
            object7 = object;
            break block32;
            n16 |= n8;
        }
        n8 = n17 & 0x180;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object8).J(he1_23) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n16 |= n8;
        }
        if ((n8 = n17 & 0xC00) == 0) {
            n8 = (int)(((j30_0)object8).J(fb3_24) ? 1 : 0);
            n8 = n8 != 0 ? 2048 : 1024;
            n16 |= n8;
        }
        if ((n8 = n17 & 0x6000) == 0) {
            n8 = (int)(((j30_0)object8).x(u102) ? 1 : 0);
            n8 = n8 != 0 ? 16384 : 8192;
            n16 |= n8;
        }
        if ((n8 = n16 & 0x2493) == (n7 = 9362) && (n8 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            object9 = object7;
        } else {
            void var22_24;
            int n19;
            ((j30_0)object8).r0();
            n8 = n17 & 1;
            if (n8 != 0 && (n8 = (int)(((j30_0)object8).c0() ? 1 : 0)) == 0) {
                ((j30_0)object8).D();
                Object object10 = object7;
            } else {
                object6 = n15 != 0 ? LP1$a.b : object7;
                Object object11 = object6;
            }
            ((j30_0)object8).U();
            object6 = AndroidCompositionLocals_androidKt.b;
            object6 = (Context)((j30_0)object8).j((H30)object6);
            Object object12 = object7 = fb3_25.a;
            object12 = (pe1_0)object7;
            int n20 = n16 >> 3;
            Intrinsics.checkNotNullParameter(object12, "request");
            object5 = "imageOptions";
            Intrinsics.checkNotNullParameter(he1_23, (String)object5);
            ((j30_0)object8).K(402689009);
            ((j30_0)object8).K(-416683114);
            int n21 = ((j30_0)object8).J(object12);
            int n22 = n20 & 0x70 ^ 0x30;
            int n24 = 1;
            if (n22 > n14 && (n22 = (int)(((j30_0)object8).J(he1_23) ? 1 : 0)) != 0 || (n22 = n20 & 0x30) == n14) {
                n22 = 1;
            } else {
                n22 = 0;
                object4 = null;
            }
            object5 = ((j30_0)object8).v();
            b30$a$a b30$a$a = b30$a.a;
            if ((n22 |= n21) == 0 && object5 != b30$a$a) {
                object = object6;
            } else {
                object4 = ((pe1_0)object12).L.b;
                if (object4 == null) {
                    long l2;
                    long l3 = he1_23.f;
                    object = object6;
                    long l4 = l3 >> n14;
                    n15 = (int)l4;
                    if (n15 > 0 && (n19 = (int)(l3 &= (l2 = 0xFFFFFFFFL))) > 0) {
                        object4 = new wq0$a(n15);
                        object6 = new wq0$a(n19);
                        object3 = new B63((wq0)object4, (wq0)object6);
                        object2 = new WE2((B63)object3);
                    } else {
                        object6 = he1_23.c;
                        object2 = i70$a.f;
                        n19 = (int)(Intrinsics.areEqual(object6, object2) ? 1 : 0);
                        if (n19 != 0) {
                            object2 = B63.c;
                            object2 = object6 = new WE2((B63)object2);
                        } else {
                            object2 = new i60_0();
                        }
                    }
                    object6 = pe1_0.a((pe1_0)object12);
                    ((pe1$a_0)object6).K = object2;
                    ((pe1$a_0)object6).c();
                    object12 = ((pe1$a_0)object6).a();
                } else {
                    object = object6;
                }
                ((j30_0)object8).o(object12);
                object5 = object12;
            }
            object5 = (pe1_0)object5;
            object2 = null;
            ((j30_0)object8).T(false);
            ((j30_0)object8).T(false);
            ((j30_0)object8).K(-1170483979);
            n19 = n16 & 0xE;
            n15 = 4;
            if (n19 == n15) {
                n19 = 1;
            } else {
                n19 = 0;
                object2 = null;
            }
            n15 = n16 & 0x380;
            n14 = 256;
            if (n15 == n14) {
                n15 = 1;
            } else {
                n15 = 0;
                object6 = null;
            }
            object6 = ((j30_0)object8).v();
            if ((n19 |= n15) != 0 || object6 == b30$a$a) {
                object2 = ((pe1_0)object5).B;
                n15 = object2 instanceof s50_0;
                if (n15 != 0) {
                    object6 = object2 = (s50_0)object2;
                } else {
                    n15 = 0;
                    object6 = null;
                }
                ((j30_0)object8).o(object6);
            }
            object12 = object6;
            object12 = (s50_0)object6;
            n19 = 0;
            ((j30_0)object8).T(false);
            object2 = object7;
            object2 = (pe1_0)object7;
            ((j30_0)object8).K(-1170477517);
            n15 = (int)(((j30_0)object8).x(object5) ? 1 : 0);
            object7 = object;
            n22 = (int)(((j30_0)object8).x(object) ? 1 : 0);
            n15 |= n22;
            n22 = n16 & 0x1C00 ^ 0xC00;
            n14 = 2048;
            if ((n22 <= n14 || (n22 = (int)(((j30_0)object8).J(fb3_24) ? 1 : 0)) == 0) && (n22 = n16 & 0xC00) != n14) {
                n24 = 0;
            }
            object3 = ((j30_0)object8).v();
            if ((n15 |= n24) != 0 || object3 == b30$a$a) {
                n15 = 0;
                object6 = null;
                object3 = new fx_2((pe1_0)object5, (Context)object7, fb3_24, null);
                ((j30_0)object8).o(object3);
            }
            object6 = object3;
            object6 = (Function1)object3;
            ((j30_0)object8).T(false);
            n14 = 466816;
            int n25 = (n16 <<= 3) & n14;
            object9 = object2;
            object2 = object6;
            object6 = var22_24;
            object3 = he1_22;
            object7 = object12;
            object12 = u102;
            object4 = object8;
            yd1_2.a(object9, (Function1)object2, (LP1)var22_24, he1_22, (s50_0)object7, u102, (b30_0)object8, n25);
            object9 = var22_24;
        }
        object4 = ((j30_0)object8).X();
        if (object4 != null) {
            object8 = object5;
            fb3_25 = fb3_22;
            object2 = he1_22;
            object6 = fb3_23;
            object3 = u102;
            n10 = n3;
            n8 = n4;
            ((CF2)object4).d = object5 = new ex_1(fb3_22, (LP1)object9, he1_22, fb3_23, u102, n3, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(long l2, fb3_2 fb3_22, he1_2 he1_22, fb3_2 fb3_23, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        boolean bl2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n84;
        he1_2 he1_23 = he1_22;
        int n102 = n3;
        int n14 = -1553524208;
        Object object3 = b30_02.g(n14);
        int n15 = n3 & 6;
        if (n15 == 0) {
            n84 = (int)(((j30_0)object3).d(l2) ? 1 : 0);
            n84 = n84 != 0 ? 4 : 2;
            n84 |= n102;
        } else {
            n84 = n3;
        }
        int n16 = n102 & 0x30;
        if (n16 == 0) {
            void var14_16;
            boolean n74 = ((j30_0)object3).J(fb3_22);
            if (n74) {
                int n17 = 32;
            } else {
                int n18 = 16;
            }
            n84 |= var14_16;
        }
        if ((n10 = n102 & 0x180) == 0) {
            void var14_21;
            boolean bl3 = ((j30_0)object3).J(he1_23);
            if (bl3) {
                int n19 = 256;
            } else {
                int n20 = 128;
            }
            n84 |= var14_21;
        }
        if ((n8 = n102 & 0xC00) == 0) {
            void var14_26;
            boolean bl4 = ((j30_0)object3).J(fb3_23);
            if (bl4) {
                int n21 = 2048;
            } else {
                int n22 = 1024;
            }
            n84 |= var14_26;
        }
        if ((n7 = n84 & 0x493) == (n4 = 1170) && (bl2 = ((j30_0)object3).h())) {
            ((j30_0)object3).D();
        } else {
            he1_2 he1_24;
            boolean bl5;
            ((j30_0)object3).r0();
            int n24 = n102 & 1;
            if (n24 != 0 && !(bl5 = ((j30_0)object3).c0())) {
                ((j30_0)object3).D();
            }
            ((j30_0)object3).U();
            object2 = he1_23.a;
            Intrinsics.checkNotNullParameter(object2, "alignment");
            Object object4 = he1_23.c;
            Intrinsics.checkNotNullParameter(object4, "contentScale");
            String string2 = he1_23.g;
            Intrinsics.checkNotNullParameter(string2, "tag");
            Object object5 = he1_23.b;
            Object object6 = he1_23.d;
            float f5 = he1_23.e;
            object = he1_24;
            he1_24 = new he1_2((Nc)object2, (String)object5, (i70_0)object4, (TX)object6, f5, l2, string2);
            object = new jx_2(he1_23);
            object6 = v10.c(1093242140, (fx0_2)object, (b30_0)object3);
            int n25 = n84 >> 3 & 0xE | 0x6000;
            int n26 = n25 | (n84 &= 0x1C00);
            int n27 = 2;
            n4 = 0;
            object2 = null;
            object = fb3_22;
            object5 = he1_24;
            object4 = fb3_23;
            kx_2.a(fb3_22, null, he1_24, fb3_23, (u10)object6, (b30_0)object3, n26, n27);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = object2;
            he1_23 = he1_22;
            n102 = n3;
            ((CF2)object).d = object2 = new dx_1(l2, fb3_22, he1_22, fb3_23, n3);
        }
    }
}

