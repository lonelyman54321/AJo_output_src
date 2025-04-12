/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.BorderModifierNodeElement;
import kotlin.jvm.functions.Function2;

public final class ck3 {
    public static final ck3 a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        ck3 ck32;
        a = ck32 = new Object();
        b = 280;
        c = 1.0f;
        d = 2;
    }

    public final void a(boolean bl2, boolean n3, wr1_1 wr1_12, ln0 ln02, i13 i132, float f5, float f6, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        float f7;
        float f8;
        float f11;
        boolean bl3 = bl2;
        wr1_1 wr1_13 = wr1_12;
        i13 i133 = i132;
        int n8 = n4;
        Object object6 = b30_02;
        j30_0 j30_02 = b30_02.g(943754022);
        int n10 = n4 & 6;
        if (n10 == 0) {
            n10 = (int)(j30_02.a(bl2) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n8;
        } else {
            n10 = n4;
        }
        int n14 = n8 & 0x30;
        if (n14 == 0) {
            n14 = (int)(j30_02.a(n3 != 0) ? 1 : 0);
            if (n14 != 0) {
                n14 = 32;
                f11 = 4.5E-44f;
            } else {
                n14 = 16;
                f11 = 2.2E-44f;
            }
            n10 |= n14;
        }
        if ((n14 = n8 & 0x180) == 0) {
            n14 = (int)(j30_02.J(wr1_13) ? 1 : 0);
            if (n14 != 0) {
                n14 = 256;
                f11 = 3.59E-43f;
            } else {
                n14 = 128;
                f11 = 1.8E-43f;
            }
            n10 |= n14;
        }
        if ((n14 = n8 & 0xC00) == 0) {
            n14 = (int)(j30_02.J(ln02) ? 1 : 0);
            if (n14 != 0) {
                n14 = 2048;
                f11 = 2.87E-42f;
            } else {
                n14 = 1024;
                f11 = 1.435E-42f;
            }
            n10 |= n14;
        }
        if ((n14 = n8 & 0x6000) == 0) {
            n14 = (int)(j30_02.J(i133) ? 1 : 0);
            if (n14 != 0) {
                n14 = 16384;
                f11 = 2.2959E-41f;
            } else {
                n14 = 8192;
                f11 = 1.148E-41f;
            }
            n10 |= n14;
        }
        f11 = 2.75506E-40f;
        n14 = 0x30000 & n8;
        if (n14 == 0) {
            n14 = 65536;
            f11 = 9.1835E-41f;
            n10 |= n14;
        }
        f11 = 2.204052E-39f;
        n14 = 0x180000 & n8;
        if (n14 == 0) {
            n14 = 524288;
            f11 = 7.34684E-40f;
            n10 |= n14;
        }
        f11 = 1.7632415E-38f;
        n14 = 0xC00000 & n8;
        Object object7 = this;
        if (n14 == 0) {
            n14 = (int)(j30_02.J(this) ? 1 : 0);
            if (n14 != 0) {
                n14 = 0x800000;
                f11 = Float.MIN_NORMAL;
            } else {
                n14 = 0x400000;
                f11 = 5.877472E-39f;
            }
            n10 |= n14;
        }
        f11 = 6.717112E-39f;
        n14 = 0x492493 & n10;
        int n15 = 0x492492;
        float f12 = 6.71711E-39f;
        if (n14 == n15 && (n14 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            f8 = f5;
            f7 = f6;
            object5 = j30_02;
        } else {
            float f14;
            float f15;
            j30_02.r0();
            n14 = n8 & 1;
            n15 = -4128769;
            f12 = 0.0f / 0.0f;
            if (n14 != 0 && (n14 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
                n10 &= n15;
                f8 = f5;
                f15 = f6;
            } else {
                n10 &= n15;
                f11 = d;
                f12 = c;
                f8 = f11;
                f15 = f12;
            }
            j30_02.U();
            n14 = n10 & 0x1FFE;
            int n16 = 6;
            f7 = 8.4E-45f;
            n14 = n14 >> n16 & 0xE;
            tr1_0 tr1_02 = UT0.a(wr1_13, j30_02, n14);
            int n17 = n10 & 0x1FFE;
            object4 = ln02;
            n14 = (int)(bl2 ? 1 : 0);
            n15 = n3;
            object5 = wr1_12;
            object3 = j30_02;
            object4 = ln02.c(bl2, n3 != 0, wr1_12, j30_02, n17);
            object6 = (Boolean)tr1_02.getValue();
            n14 = (int)(((Boolean)object6).booleanValue() ? 1 : 0);
            f11 = n14 != 0 ? f8 : f15;
            n15 = 0;
            f12 = 0.0f;
            if (bl3) {
                j30_02.K(772641254);
                n7 = 150;
                object5 = Hl.c(n7, 0, null, n16);
                int n18 = 12;
                f14 = 1.7E-44f;
                n17 = 0;
                object2 = null;
                int n19 = 48;
                f7 = f11;
                f11 = f15;
                object = object5;
                object7 = null;
                object5 = j30_02;
                object3 = jk_1.a(f7, (Qs3)object, null, j30_02, n19, n18);
                j30_02.T(false);
            } else {
                f11 = f15;
                object5 = j30_02;
                int n20 = 772737540;
                f14 = 3.252333E-11f;
                j30_02.K(n20);
                object3 = new xs0_0(f15);
                object3 = J83.j(object3, j30_02);
                j30_02.T(false);
            }
            object3 = (xs0_0)object3.getValue();
            f14 = ((xs0_0)object3).a;
            long l2 = ((OX)object4.getValue()).a;
            i93_0 i93_02 = new i93_0(l2);
            object2 = new nz(f14, i93_02);
            object4 = (nz)J83.j(object2, (b30_0)object5).getValue();
            f14 = ((nz)object4).a;
            object4 = ((nz)object4).b;
            object2 = new BorderModifierNodeElement(f14, (ZD)object4, i133);
            HA.a((LP1)object2, (b30_0)object5, 0);
            f7 = f11;
        }
        object = ((j30_0)object5).X();
        if (object != null) {
            object4 = object7;
            object6 = this;
            n15 = (int)(bl2 ? 1 : 0);
            n7 = n3;
            object3 = wr1_12;
            object2 = ln02;
            n8 = n4;
            ((CF2)object).d = object7 = new ak3_0(this, bl2, n3 != 0, wr1_12, ln02, i132, f8, f7, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void b(String string2, Function2 function2, boolean bl2, boolean bl3, EE3 eE3, wr1_1 wr1_12, boolean bl4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, i13 i132, ln0 ln02, mk2_0 mk2_02, Function2 function26, b30_0 b30_02, int n3, int n4) {
        Object object;
        int n7;
        Object object2;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object3;
        int n20 = n3;
        int n21 = n4;
        int n22 = -920823490;
        Object object4 = b30_02.g(n22);
        int n24 = n3 & 6;
        int n25 = 2;
        int n26 = 4;
        Object object5 = string2;
        if (n24 == 0) {
            n24 = (int)(((j30_0)object4).J(string2) ? 1 : 0);
            n24 = n24 != 0 ? 4 : 2;
            n24 |= n20;
        } else {
            n24 = n3;
        }
        int n27 = n20 & 0x30;
        if (n27 == 0) {
            void var29_32;
            object3 = function2;
            boolean n19 = ((j30_0)object4).x(function2);
            if (n19) {
                int n16 = 32;
            } else {
                int n17 = 16;
            }
            n24 |= var29_32;
        } else {
            object3 = function2;
        }
        int n18 = n20 & 0x180;
        if (n18 == 0) {
            void var30_39;
            boolean bl5 = bl2;
            boolean bl6 = ((j30_0)object4).a(bl2);
            if (bl6) {
                int n19 = 256;
            } else {
                int n28 = 128;
            }
            n24 |= var30_39;
        } else {
            boolean bl7 = bl2;
        }
        int n29 = n20 & 0xC00;
        if (n29 == 0) {
            void var31_46;
            boolean bl8 = bl3;
            boolean bl9 = ((j30_0)object4).a(bl3);
            if (bl9) {
                int n30 = 2048;
            } else {
                int n32 = 1024;
            }
            n24 |= var31_46;
        } else {
            boolean bl10 = bl3;
        }
        int n34 = n20 & 0x6000;
        int n35 = 8192;
        if (n34 == 0) {
            n15 = (int)(((j30_0)object4).J(eE3) ? 1 : 0);
            n15 = n15 != 0 ? 16384 : 8192;
            n24 |= n15;
        }
        n15 = 196608;
        int n36 = n20 & n15;
        int n37 = 65536;
        if (n36 == 0) {
            n36 = (int)(((j30_0)object4).J(wr1_12) ? 1 : 0);
            n36 = n36 != 0 ? 131072 : 65536;
            n24 |= n36;
        }
        if ((n36 = n20 & 0x180000) == 0) {
            void var36_55;
            boolean bl11 = ((j30_0)object4).a(bl4);
            if (bl11) {
                int n38 = 0x100000;
            } else {
                int n39 = 524288;
            }
            n24 |= var36_55;
        }
        if ((n14 = n20 & 0xC00000) == 0) {
            void var37_63;
            boolean bl12 = ((j30_0)object4).x(function22);
            if (bl12) {
                int n41 = 0x800000;
            } else {
                int n42 = 0x400000;
            }
            n24 |= var37_63;
        }
        if ((n10 = n20 & 0x6000000) == 0) {
            void var38_68;
            boolean bl13 = ((j30_0)object4).x(function23);
            if (bl13) {
                int n43 = 0x4000000;
            } else {
                int n44 = 0x2000000;
            }
            n24 |= var38_68;
        }
        int n45 = n20 & 0x30000000;
        Object object6 = function24;
        if (n45 == 0) {
            void var40_74;
            boolean bl14 = ((j30_0)object4).x(function24);
            if (bl14) {
                int n46 = 0x20000000;
            } else {
                int n47 = 0x10000000;
            }
            n24 |= var40_74;
        }
        if ((n8 = n21 & 6) == 0) {
            boolean bl15 = ((j30_0)object4).x(function25);
            if (bl15) {
                n25 = 4;
            }
            n25 |= n21;
        } else {
            n25 = n21;
        }
        n26 = n21 & 0x30;
        if (n26 == 0) {
            n25 |= 0x10;
        }
        if ((n26 = n21 & 0x180) == 0) {
            object2 = ln02;
            boolean bl16 = ((j30_0)object4).J(ln02);
            n36 = bl16 ? 256 : 128;
            n25 |= n36;
        } else {
            object2 = ln02;
        }
        n26 = n21 & 0xC00;
        if (n26 == 0) {
            void var36_59;
            object2 = mk2_02;
            n36 = (int)(((j30_0)object4).J(mk2_02) ? 1 : 0);
            if (n36 != 0) {
                int n48 = 2048;
            } else {
                int n49 = 1024;
            }
            n25 |= var36_59;
        } else {
            object2 = mk2_02;
        }
        n26 = n21 & 0x6000;
        if (n26 == 0) {
            object2 = function26;
            n36 = (int)(((j30_0)object4).x(function26) ? 1 : 0);
            if (n36 != 0) {
                n35 = 16384;
            }
            n25 |= n35;
        } else {
            object2 = function26;
        }
        n35 = n21 & n15;
        if (n35 == 0) {
            n35 = (int)(((j30_0)object4).J(this) ? 1 : 0);
            if (n35 != 0) {
                n37 = 131072;
            }
            n25 |= n37;
        }
        if ((n26 = n24 & (n35 = 306783379)) == (n7 = 306783378) && (n26 = 0x12493 & n25) == (n7 = 74898) && (n26 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object = i132;
        } else {
            ((j30_0)object4).r0();
            n26 = n20 & 1;
            if (n26 != 0 && (n26 = (int)(((j30_0)object4).c0() ? 1 : 0)) == 0) {
                ((j30_0)object4).D();
                n25 &= 0xFFFFFF8F;
                object2 = i132;
            } else {
                object2 = B13.a;
                object2 = ((A13)((j30_0)object4).j((H30)object2)).a;
                n25 &= 0xFFFFFF8F;
            }
            ((j30_0)object4).U();
            object = pl3.Outlined;
            n7 = n24 << 3;
            n15 = n7 & 0x70 | 6;
            n7 &= 0x380;
            n7 = n15 | n7;
            n27 = n24 >> 3 & 0x1C00;
            n7 |= n27;
            n27 = n24 >> 9;
            n15 = 57344;
            n36 = n27 & n15;
            n7 |= n36;
            n36 = 458752;
            n37 = n27 & n36;
            n7 |= n37;
            n7 |= (n27 &= 0x380000);
            n27 = n25 << 21 & 0x1C00000;
            n7 |= n27;
            n27 = n24 << 15 & 0xE000000;
            n7 |= n27;
            n27 = n24 << 21;
            n37 = 0x70000000;
            int n50 = n7 | (n27 &= n37);
            n7 = n24 >> 18 & 0xE;
            n24 = n24 >> 12 & 0x70 | n7;
            n7 = n25 >> 3 & 0x380;
            n24 |= n7;
            n7 = n25 << 6 & n15;
            n25 = n25 << 3 & n36;
            int n51 = (n24 |= n7) | n25;
            boolean bl17 = bl3;
            lk3_0.a((pl3)((Object)object), string2, function2, eE3, function22, function23, function24, function25, bl3, bl2, bl4, wr1_12, mk2_02, (i13)object2, ln02, function26, (b30_0)object4, n50, n51);
            object = object2;
        }
        object3 = ((j30_0)object4).X();
        if (object3 != null) {
            object4 = object5;
            object2 = function2;
            n7 = (int)(bl2 ? 1 : 0);
            n27 = (int)(bl3 ? 1 : 0);
            object6 = object;
            object = function26;
            n15 = n3;
            n36 = n4;
            object5 = new bk3_0(this, string2, function2, bl2, bl3, eE3, wr1_12, bl4, function22, function23, function24, function25, (i13)object6, ln02, mk2_02, function26, n3, n4);
            object4 = object3;
            ((CF2)object3).d = object5;
        }
    }
}

