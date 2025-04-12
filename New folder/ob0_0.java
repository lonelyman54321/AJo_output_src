/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ob0
 */
public final class ob0_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(String string2, int n3, String string3, String string4, String string5, String string6, Function0 function0, Function0 function02, Function0 function03, b30_0 b30_02, int n4, int n7) {
        Object object;
        Function0 function04;
        int n8;
        Object object2;
        int n10;
        String string7;
        int n14;
        int n15;
        int n16;
        Object object3;
        Object object4;
        int n17;
        Function0 function05;
        Function0 function06;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        block18: {
            block17: {
                object8 = string2;
                object7 = string3;
                object6 = string5;
                object5 = string6;
                function06 = function02;
                function05 = function03;
                n17 = n4;
                Intrinsics.checkNotNullParameter(string2, "title");
                Intrinsics.checkNotNullParameter(string3, "desc");
                Intrinsics.checkNotNullParameter(string5, "howDoesItWorkText");
                Intrinsics.checkNotNullParameter(string6, "tAndCText");
                Intrinsics.checkNotNullParameter(function02, "howDoesItWorkClick");
                object4 = "tAndCClick";
                Intrinsics.checkNotNullParameter(function03, (String)object4);
                object3 = b30_02.g(576899624);
                n16 = n4 & 0xE;
                if (n16 == 0) {
                    n16 = (int)(((j30_0)object3).J(string2) ? 1 : 0);
                    n16 = n16 != 0 ? 4 : 2;
                    n16 |= n17;
                } else {
                    n16 = n4;
                }
                n15 = n17 & 0x70;
                if (n15 == 0) {
                    n15 = (int)(((j30_0)object3).c(n3) ? 1 : 0);
                    n15 = n15 != 0 ? 32 : 16;
                    n16 |= n15;
                }
                if ((n15 = n17 & 0x380) == 0) {
                    n15 = (int)(((j30_0)object3).J(object7) ? 1 : 0);
                    n15 = n15 != 0 ? 256 : 128;
                    n16 |= n15;
                }
                if ((n15 = n7 & 8) != 0) {
                    n16 |= 0xC00;
                } else {
                    n14 = n17 & 0x1C00;
                    if (n14 == 0) {
                        string7 = string4;
                        n10 = (int)(((j30_0)object3).J(string4) ? 1 : 0);
                        n10 = n10 != 0 ? 2048 : 1024;
                    }
                }
                string7 = string4;
                break block17;
                n16 |= n10;
            }
            n10 = 0xE000 & n17;
            if (n10 == 0) {
                n10 = (int)(((j30_0)object3).J(object6) ? 1 : 0);
                n10 = n10 != 0 ? 16384 : 8192;
                n16 |= n10;
            }
            if ((n10 = 0x70000 & n17) == 0) {
                n10 = (int)(((j30_0)object3).J(object5) ? 1 : 0);
                n10 = n10 != 0 ? 131072 : 65536;
                n16 |= n10;
            }
            if ((n10 = n7 & 0x40) != 0) {
                int n18 = 0x180000;
                n16 |= n18;
            } else {
                int n19 = 0x380000 & n17;
                if (n19 == 0) {
                    object2 = function0;
                    n8 = ((j30_0)object3).x(function0);
                    n8 = n8 != 0 ? 0x100000 : 524288;
                }
            }
            object2 = function0;
            break block18;
            n16 |= n8;
        }
        n8 = 0x1C00000 & n17;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object3).x(function06) ? 1 : 0);
            n8 = n8 != 0 ? 0x800000 : 0x400000;
            n16 |= n8;
        }
        if ((n8 = 0xE000000 & n17) == 0) {
            n8 = (int)(((j30_0)object3).x(function05) ? 1 : 0);
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n16 |= n8;
        }
        if ((n16 &= 0xB6DB6DB) == (n8 = 0x2492492) && (n16 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
            function04 = object2;
            object7 = object3;
            object2 = string7;
        } else {
            n16 = 0;
            object4 = null;
            String string8 = n15 != 0 ? null : string7;
            Object object9 = n10 != 0 ? null : object2;
            object4 = object;
            n14 = n3;
            object2 = string8;
            object8 = object;
            object = string5;
            function04 = function02;
            object7 = object3;
            object3 = string6;
            ((ob0$a_0)object4)(string2, n3, string3, string8, (Function0)object9, string5, function02, string6, function03);
            n16 = -788683099;
            u10 u102 = v10.c(n16, (fx0_2)object4, (b30_0)object7);
            long l2 = 0L;
            int n20 = 0x180000;
            int n21 = 63;
            JL.a(null, null, l2, null, 0.0f, u102, (b30_0)object7, n20, n21);
            function04 = object9;
        }
        object7 = ((j30_0)object7).X();
        if (object7 != null) {
            object4 = object8;
            n14 = n3;
            object = string6;
            object3 = function02;
            object6 = object8;
            object5 = object7;
            ((CF2)object7).d = object8 = new jb0_1(string2, n3, string3, (String)object2, string5, string6, function04, function02, function03, n4, n7);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(String string2, Function0 function0, String string3, Function0 function02, String string4, Function0 function03, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        int n4;
        Object object4;
        Object object5;
        Function0 function04;
        String string5;
        Function0 function05;
        Object object6;
        block28: {
            boolean bl2;
            boolean bl3;
            Gx$b gx$b;
            Object object7;
            Object object8;
            N20$a$b n20$a$b;
            Gx$b gx$b2;
            zp$j zp$j;
            Object object9;
            int n7;
            Object object10;
            boolean bl4;
            Object object11;
            Object object12;
            int n8;
            float f5;
            float f6;
            Object object13;
            float f7;
            int n10;
            float f8;
            Object object14;
            float f11;
            int n14;
            int n15;
            block30: {
                block31: {
                    block29: {
                        block27: {
                            object6 = string2;
                            function05 = function0;
                            string5 = string3;
                            function04 = function02;
                            object5 = string4;
                            object4 = function03;
                            n4 = n3;
                            Intrinsics.checkNotNullParameter(string3, "howDoesItWorkText");
                            Intrinsics.checkNotNullParameter(function02, "howDoesItWorkClick");
                            Intrinsics.checkNotNullParameter(string4, "tAndCText");
                            Intrinsics.checkNotNullParameter(function03, "tAndCClick");
                            int n16 = 756432931;
                            object3 = b30_02;
                            object2 = b30_02.g(n16);
                            n15 = n3 & 0xE;
                            if (n15 == 0) {
                                n15 = (int)(((j30_0)object2).J(string2) ? 1 : 0);
                                n15 = n15 != 0 ? 4 : 2;
                                n15 |= n4;
                            } else {
                                n15 = n3;
                            }
                            int n17 = n4 & 0x70;
                            if (n17 == 0) {
                                n17 = (int)(((j30_0)object2).x(function05) ? 1 : 0);
                                n17 = n17 != 0 ? 32 : 16;
                                n15 |= n17;
                            }
                            if ((n17 = n4 & 0x380) == 0) {
                                n17 = (int)(((j30_0)object2).J(string5) ? 1 : 0);
                                n17 = n17 != 0 ? 256 : 128;
                                n15 |= n17;
                            }
                            if ((n17 = n4 & 0x1C00) == 0) {
                                n17 = (int)(((j30_0)object2).x(function04) ? 1 : 0);
                                n17 = n17 != 0 ? 2048 : 1024;
                                n15 |= n17;
                            }
                            if ((n17 = 0xE000 & n4) == 0) {
                                n17 = (int)(((j30_0)object2).J(object5) ? 1 : 0);
                                n17 = n17 != 0 ? 16384 : 8192;
                                n15 |= n17;
                            }
                            if ((n17 = 0x70000 & n4) == 0) {
                                n17 = (int)(((j30_0)object2).x(object4) ? 1 : 0);
                                n17 = n17 != 0 ? 131072 : 65536;
                                n15 |= n17;
                            }
                            if ((n17 = 0x5B6DB & n15) != (n14 = 74898) || (n17 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block27;
                            ((j30_0)object2).D();
                            break block28;
                        }
                        object = LP1$a.b;
                        n14 = 8;
                        f11 = n14;
                        object14 = null;
                        boolean bl5 = false;
                        f8 = 0.0f;
                        n10 = 7;
                        f7 = 9.8E-45f;
                        object13 = object;
                        f6 = f11;
                        f5 = f11;
                        n8 = n10;
                        f11 = f7;
                        object13 = h.i((LP1)object, 0.0f, 0.0f, 0.0f, f6, n10);
                        object12 = zp.a;
                        object11 = Nc$a.j;
                        bl4 = false;
                        object10 = iQ2.a((zp$e)object12, (Gx$b)object11, (b30_0)object2, 0);
                        n7 = ((j30_0)object2).P;
                        object9 = ((j30_0)object2).P();
                        object13 = a30_0.c((b30_0)object2, (LP1)object13);
                        N20.W.getClass();
                        zp$j = object12;
                        object12 = N20$a.b;
                        gx$b2 = object11;
                        object11 = ((j30_0)object2).a;
                        n4 = object11 instanceof mp;
                        if (n4 == 0) {
                            s20.a();
                            throw null;
                        }
                        ((j30_0)object2).A();
                        n4 = (int)(((j30_0)object2).O ? 1 : 0);
                        if (n4 != 0) {
                            ((j30_0)object2).C((Function0)object12);
                        } else {
                            ((j30_0)object2).n();
                        }
                        n20$a$b = N20$a.e;
                        Ow3.a((b30_0)object2, object10, n20$a$b);
                        object10 = N20$a.d;
                        Ow3.a((b30_0)object2, object9, (Function2)object10);
                        object9 = N20$a.f;
                        object8 = object10;
                        boolean bl6 = ((j30_0)object2).O;
                        if (bl6) break block29;
                        object10 = ((j30_0)object2).v();
                        object7 = object11;
                        object11 = n7;
                        boolean bl7 = Intrinsics.areEqual(object10, object11);
                        if (bl7) break block30;
                        break block31;
                    }
                    object7 = object11;
                }
                rk_0.a(n7, (j30_0)object2, n7, (N20$a$a)object9);
            }
            object11 = N20$a.c;
            Ow3.a((b30_0)object2, object13, (Function2)object11);
            n14 = 1072250895;
            ((j30_0)object2).K(n14);
            n7 = 1;
            if (function05 != null && object6 != null) {
                boolean bl8;
                int n18 = 10;
                float f12 = 1.4E-44f;
                object13 = object;
                Object object15 = object8;
                f8 = f5;
                object14 = null;
                Object object16 = object9;
                Object object17 = object11;
                gx$b = gx$b2;
                bl3 = false;
                f6 = 0.0f;
                object4 = object12;
                object5 = zp$j;
                n8 = n18;
                f11 = f12;
                object13 = h.i((LP1)object, f5, 0.0f, f5, 0.0f, n18);
                object10 = Nc$a.d;
                f11 = 0.0f;
                object12 = null;
                object10 = HA.e((Nc)object10, false);
                n7 = ((j30_0)object2).P;
                object9 = ((j30_0)object2).P();
                object13 = a30_0.c((b30_0)object2, (LP1)object13);
                object11 = object7;
                n8 = object7 instanceof mp;
                if (n8 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object2).A();
                n8 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n8 != 0) {
                    ((j30_0)object2).C((Function0)object4);
                } else {
                    ((j30_0)object2).n();
                }
                Ow3.a((b30_0)object2, object10, n20$a$b);
                object12 = object15;
                Ow3.a((b30_0)object2, object9, (Function2)object15);
                boolean bl9 = ((j30_0)object2).O;
                if (bl9 || !(bl8 = Intrinsics.areEqual(object10 = ((j30_0)object2).v(), object9 = Integer.valueOf(n7)))) {
                    object9 = object16;
                    rk_0.a(n7, (j30_0)object2, n7, (N20$a$a)object16);
                } else {
                    object9 = object16;
                }
                object14 = object17;
                Ow3.a((b30_0)object2, object13, (Function2)object17);
                n14 = n15 & 0x7E;
                ob0_0.e((String)object6, function05, (b30_0)object2, n14);
                boolean bl10 = true;
                f8 = Float.MIN_VALUE;
                ((j30_0)object2).T(bl10);
            } else {
                object14 = object11;
                object4 = object12;
                object5 = zp$j;
                gx$b = gx$b2;
                object12 = object8;
                object11 = object7;
                boolean bl11 = true;
                f8 = Float.MIN_VALUE;
            }
            n14 = 0;
            object13 = null;
            ((j30_0)object2).T(false);
            n10 = 0;
            f7 = 0.0f;
            zp$j = null;
            gx$b2 = null;
            int n19 = 10;
            float f14 = 1.4E-44f;
            object7 = null;
            object13 = object;
            f8 = f5;
            Object object18 = object14;
            object14 = null;
            Object object19 = object9;
            bl3 = false;
            f6 = 0.0f;
            Object object20 = object12;
            boolean bl12 = false;
            object6 = null;
            n8 = n19;
            f11 = f14;
            object13 = h.i((LP1)object, f5, 0.0f, f5, 0.0f, n19);
            int n20 = 1065353216;
            f8 = 1.0f;
            object13 = j.c((LP1)object13, f8);
            object10 = HA.e(Nc$a.f, false);
            n7 = ((j30_0)object2).P;
            object9 = ((j30_0)object2).P();
            object13 = a30_0.c((b30_0)object2, (LP1)object13);
            n8 = object11 instanceof mp;
            if (n8 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            n8 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n8 != 0) {
                ((j30_0)object2).C((Function0)object4);
            } else {
                ((j30_0)object2).n();
            }
            Ow3.a((b30_0)object2, object10, n20$a$b);
            object10 = object20;
            Ow3.a((b30_0)object2, object9, (Function2)object20);
            bl4 = ((j30_0)object2).O;
            if (bl4 || !(bl4 = Intrinsics.areEqual(object9 = ((j30_0)object2).v(), object12 = Integer.valueOf(n7)))) {
                object9 = object19;
                rk_0.a(n7, (j30_0)object2, n7, (N20$a$a)object19);
                object14 = object18;
            } else {
                object14 = object18;
                object9 = object19;
            }
            Ow3.a((b30_0)object2, object13, (Function2)object14);
            object13 = gx$b;
            object6 = iQ2.a((zp$e)object5, gx$b, (b30_0)object2, 0);
            int n21 = ((j30_0)object2).P;
            object13 = ((j30_0)object2).P();
            object = a30_0.c((b30_0)object2, (LP1)object);
            bl3 = object11 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C((Function0)object4);
            } else {
                ((j30_0)object2).n();
            }
            Ow3.a((b30_0)object2, object6, n20$a$b);
            Ow3.a((b30_0)object2, object13, (Function2)object10);
            boolean bl13 = ((j30_0)object2).O;
            if (bl13 || !(bl2 = Intrinsics.areEqual(object6 = ((j30_0)object2).v(), object4 = Integer.valueOf(n21)))) {
                rk_0.a(n21, (j30_0)object2, n21, (N20$a$a)object9);
            }
            Ow3.a((b30_0)object2, object, (Function2)object14);
            int n22 = n15 >> 6 & 0x7E;
            ob0_0.e(string5, function04, (b30_0)object2, n22);
            int n24 = n15 >> 12 & 0x7E;
            object5 = string4;
            object4 = function03;
            ob0_0.e(string4, function03, (b30_0)object2, n24);
            boolean bl14 = true;
            ((j30_0)object2).T(bl14);
            ((j30_0)object2).T(bl14);
            ((j30_0)object2).T(bl14);
        }
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = object;
            object6 = string2;
            function05 = function0;
            string5 = string3;
            function04 = function02;
            object5 = string4;
            object4 = function03;
            n4 = n3;
            ((CF2)object3).d = object = new nb0_2(string2, function0, string3, function02, string4, function03, n3);
        }
    }

    public static final void c(String string2, b30_0 b30_02, int n3) {
        Object object;
        int n4 = n3;
        Object object2 = "desc";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Object object3 = b30_02;
        Object object4 = b30_02.g(357577451);
        int n7 = n3 & 0xE;
        int n8 = 2;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object4).J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n10 = n7 & 0xB;
        if (n10 == n8 && (n8 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object = object4;
        } else {
            long l2 = xx_1.g;
            n8 = 12;
            long l3 = Em3.f(n8);
            object3 = j.c(LP1$a.b, 1.0f);
            n10 = 16;
            float f5 = n10;
            float f6 = 8;
            object3 = h.h((LP1)object3, f5, f6, f5, f6);
            n7 = n7 & 0xE | 0xD80;
            f6 = 0.0f;
            long l4 = 0L;
            long l7 = 0L;
            int n14 = 131056;
            object2 = string2;
            object = object4;
            Ll3.b(string2, (LP1)object3, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object4, n7, 0, n14);
        }
        object2 = ((j30_0)object).X();
        if (object2 != null) {
            object4 = string2;
            n10 = n3;
            ((CF2)object2).d = object3 = new kb0_1(string2, n3);
        }
    }

    public static final void d(String string2, int n3, b30_0 object, int n4) {
        block14: {
            int n7;
            Object object2;
            Object object3;
            Object object4;
            int n8;
            block13: {
                int n10;
                int n14;
                int n15;
                int n16;
                Object object5;
                block12: {
                    object5 = string2;
                    n8 = n3;
                    n16 = n4;
                    object4 = "title";
                    Intrinsics.checkNotNullParameter(string2, (String)object4);
                    object3 = object;
                    object2 = object.g(-747535659);
                    n15 = n4 & 0xE;
                    n14 = 4;
                    if (n15 == 0) {
                        n15 = (int)(((j30_0)object2).J(string2) ? 1 : 0);
                        n15 = n15 != 0 ? 4 : 2;
                        n15 |= n16;
                    } else {
                        n15 = n4;
                    }
                    n7 = n16 & 0x70;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object2).c(n8) ? 1 : 0);
                        n7 = n7 != 0 ? 32 : 16;
                        n15 |= n7;
                    }
                    if ((n7 = n15 & 0x5B) != (n10 = 18) || (n7 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object2).D();
                    object3 = object2;
                    break block13;
                }
                n7 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                if (n7 != 0) {
                    object4 = ((j30_0)object2).X();
                    if (object4 != null) {
                        ((CF2)object4).d = object3 = new lb0_2((String)object5, n8, n16);
                    }
                    return;
                }
                Object object6 = Nc$a.k;
                LP1$a lP1$a = LP1$a.b;
                int n17 = 8;
                float f5 = 1.1E-44f;
                float f6 = n17;
                Object object7 = h.e(lP1$a, f6);
                float f7 = 1.0f;
                object7 = j.c((LP1)object7, f7);
                Object object8 = zp.a;
                int n18 = 48;
                object6 = iQ2.a((zp$e)object8, (Gx$b)object6, (b30_0)object2, n18);
                int n19 = ((j30_0)object2).P;
                Object object9 = ((j30_0)object2).P();
                object7 = a30_0.c((b30_0)object2, (LP1)object7);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object2).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block14;
                ((j30_0)object2).A();
                bl2 = ((j30_0)object2).O;
                if (bl2) {
                    ((j30_0)object2).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object2).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object2, object6, (Function2)((Object)serializable));
                object6 = N20$a.d;
                Ow3.a((b30_0)object2, object9, (Function2)object6);
                object6 = N20$a.f;
                n18 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object9 = ((j30_0)object2).v(), serializable = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                    rk_0.a(n19, (j30_0)object2, n19, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object2, object7, (Function2)object6);
                n7 = n15 >> 3 & 0xE;
                object6 = km2.a(n8, (b30_0)object2, n7);
                float f8 = n14;
                object7 = lP1$a;
                f7 = f6;
                object3 = h.i(lP1$a, f6, 0.0f, f8, 0.0f, 10);
                f5 = 24;
                object9 = j.i((LP1)object3, f5, f5);
                object8 = "";
                object7 = object6;
                Pd1.a((im2)object6, (String)object8, (LP1)object9, null, null, 0.0f, null, (b30_0)object2, 440, 120);
                long l2 = xx_1.e;
                n18 = 0;
                object9 = null;
                int n20 = 10;
                object7 = lP1$a;
                f8 = f6;
                object3 = h.i(lP1$a, f6, 0.0f, f6, 0.0f, n20);
                long l3 = Em3.f(14);
                Object object10 = tv0_0.n;
                n7 = 200112;
                int n21 = n15 & 0xE | n7;
                n10 = 0;
                lP1$a = null;
                n17 = 0;
                f5 = 0.0f;
                object7 = null;
                long l4 = 0L;
                f8 = 0.0f;
                serializable = null;
                bl2 = false;
                mp2 = null;
                long l7 = 0L;
                f6 = 0.0f;
                int n22 = 131024;
                object4 = string2;
                object = object2;
                object5 = object10;
                object10 = object2;
                Ll3.b(string2, (LP1)object3, l2, l3, null, (tv0_0)object5, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n21, 0, n22);
                n15 = 1;
                object3 = object2;
                ((j30_0)object2).T(n15 != 0);
            }
            object4 = ((j30_0)object3).X();
            if (object4 != null) {
                object2 = string2;
                n7 = n3;
                n8 = n4;
                ((CF2)object4).d = object3 = new mb0_2(string2, n3, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void e(String string2, Function0 function0, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        Object object3 = string2;
        Function0 function02 = function0;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(string2, "title");
        Object object4 = "onClick";
        Intrinsics.checkNotNullParameter(function0, (String)object4);
        Object object5 = b30_02;
        Object object6 = b30_02.g(-1946669215);
        int n8 = n3 & 0xE;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object6).J(string2) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n7;
        } else {
            n8 = n3;
        }
        int n10 = n7 & 0x70;
        int n14 = 32;
        float f5 = 4.5E-44f;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object6).x(function02) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n8 & 0x5B) == (n4 = 18) && (n10 = (int)(((j30_0)object6).h() ? 1 : 0)) != 0) {
            ((j30_0)object6).D();
            object2 = object6;
        } else {
            long l2 = xx_1.h;
            n10 = 12;
            long l3 = Em3.f(n10);
            object5 = LP1$a.b;
            ((j30_0)object6).K(68450916);
            n4 = n8 & 0x70;
            if (n4 == n14) {
                n14 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n14 = 0;
                f5 = 0.0f;
                object = null;
            }
            Object object7 = ((j30_0)object6).v();
            if (n14 != 0 || object7 == (object = b30$a.a)) {
                object7 = new hb0_2(function02);
                ((j30_0)object6).o(object7);
            }
            object7 = (Function0)object7;
            ((j30_0)object6).T(false);
            object5 = d.b((LP1)object5, false, null, (Function0)object7, 7);
            f5 = 8;
            object5 = h.e((LP1)object5, f5);
            Object object8 = tv0_0.n;
            n14 = 200064;
            f5 = 2.8035E-40f;
            int n15 = (n8 &= 0xE) | n14;
            n4 = 0;
            object7 = null;
            long l4 = 0L;
            long l7 = 0L;
            int n16 = 131024;
            object4 = string2;
            object2 = object6;
            object3 = object8;
            object8 = object6;
            Ll3.b(string2, (LP1)object5, l2, l3, null, (tv0_0)object3, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object6, n15, 0, n16);
        }
        object4 = ((j30_0)object2).X();
        if (object4 != null) {
            object6 = string2;
            object = function0;
            ((CF2)object4).d = object5 = new ib0_1(string2, function0, n3);
        }
    }
}

