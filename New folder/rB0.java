/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class rB0 {
    public static final void a(Function0 function0, b30_0 object, int n3) {
        jb0_0 jb0_02 = null;
        Object object2 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(2011419738);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            String string2;
            Object object3;
            Object object4 = h40_0.a;
            object4 = h40_0.x();
            Object object5 = "";
            if (object4 == null || (object3 = ((FleekConfigs)object4).getApiFailurePrimaryText()) == null) {
                object3 = object5;
            }
            if (object4 == null || (string2 = ((FleekConfigs)object4).getApiFailureSecondaryText()) == null) {
                string2 = object5;
            }
            if (object4 != null && (object4 = ((FleekConfigs)object4).getApiFailureButtonText()) != null) {
                object5 = object4;
            }
            n7 = -679123103;
            ((j30_0)object).K(n7);
            if ((n4 &= 0xE) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            object4 = ((j30_0)object).v();
            if (n4 != 0 || object4 == (object2 = b30$a.a)) {
                object4 = new ib0_0(function0, 0);
                ((j30_0)object).o(object4);
            }
            object2 = object4;
            object2 = (Function0)object4;
            ((j30_0)object).T(false);
            int n14 = 16;
            jb0_02 = null;
            object4 = object3;
            String string3 = string2;
            object3 = object2;
            string2 = null;
            rB0.b((String)object4, string3, (String)object5, (Function0)object2, false, (b30_0)object, 0, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            jb0_02 = new jb0_0(function0, n3);
            ((CF2)object).d = jb0_02;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(String string2, String string3, String string4, Function0 function0, boolean bl2, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        int n7;
        int n8;
        int n10;
        Object object3;
        int n14;
        String string5;
        int n15;
        int n16;
        j30_0 j30_02;
        Object object4;
        Object object5;
        block23: {
            int n17;
            block22: {
                block21: {
                    String string6 = string3;
                    n17 = n3;
                    Intrinsics.checkNotNullParameter(string2, "primaryText");
                    object5 = "secondaryText";
                    Intrinsics.checkNotNullParameter(string3, (String)object5);
                    object4 = b30_02;
                    j30_02 = b30_02.g(-2080268361);
                    n16 = n3 & 0xE;
                    if (n16 == 0) {
                        n16 = (int)(j30_02.J(string2) ? 1 : 0);
                        n16 = n16 != 0 ? 4 : 2;
                        n16 |= n17;
                    } else {
                        n16 = n3;
                    }
                    n15 = n17 & 0x70;
                    if (n15 == 0) {
                        n15 = (int)(j30_02.J(string6) ? 1 : 0);
                        n15 = n15 != 0 ? 32 : 16;
                        n16 |= n15;
                    }
                    if ((n15 = n4 & 4) != 0) {
                        n16 |= 0x180;
                    } else {
                        int n18 = n17 & 0x380;
                        if (n18 == 0) {
                            string5 = string4;
                            n14 = (int)(j30_02.J(string4) ? 1 : 0);
                            n14 = n14 != 0 ? 256 : 128;
                        }
                    }
                    string5 = string4;
                    break block21;
                    n16 |= n14;
                }
                n14 = n4 & 8;
                if (n14 != 0) {
                    n16 |= 0xC00;
                } else {
                    int n19 = n17 & 0x1C00;
                    if (n19 == 0) {
                        object3 = function0;
                        n10 = (int)(j30_02.x(function0) ? 1 : 0);
                        n10 = n10 != 0 ? 2048 : 1024;
                    }
                }
                object3 = function0;
                break block22;
                n16 |= n10;
            }
            n10 = n4 & 0x10;
            if (n10 != 0) {
                n16 |= 0x6000;
            } else {
                n8 = 0xE000 & n17;
                if (n8 == 0) {
                    n8 = (int)(bl2 ? 1 : 0);
                    n7 = j30_02.a(bl2);
                    n7 = n7 != 0 ? 16384 : 8192;
                }
            }
            n8 = (int)(bl2 ? 1 : 0);
            break block23;
            n16 |= n7;
        }
        n7 = 9362;
        if ((n16 &= 0xB6DB) == n7 && (n16 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object2 = string5;
            n10 = n8;
            object4 = j30_02;
        } else {
            rB0$a rB0$a;
            int n20;
            Object object6;
            String string7;
            if (n15 != 0) {
                object5 = "";
                string7 = object5;
            } else {
                string7 = string5;
            }
            if (n14 != 0) {
                n15 = 0;
                object4 = null;
                object6 = object5 = new ob0_2(0);
            } else {
                object6 = object3;
            }
            if (n10 != 0) {
                n16 = 1;
                n20 = 1;
            } else {
                n20 = n8;
            }
            object5 = j.c;
            long l2 = nz_1.a;
            object2 = fg2_1.a;
            object = a.b((LP1)object5, l2, (i13)object2);
            object5 = rB0$a;
            object4 = string2;
            string5 = string3;
            n14 = n20;
            object3 = string7;
            rB0$a = new rB0$a(string2, string3, n20 != 0, string7, (Function0)object6);
            u10 u102 = v10.c(1643297, rB0$a, j30_02);
            n7 = 0;
            Object var30_30 = null;
            int n21 = 3078;
            n16 = 6;
            object4 = j30_02;
            OA.a((LP1)object, null, false, u102, j30_02, n21, n16);
            object2 = string7;
            object3 = object6;
            n10 = n20;
        }
        object = ((j30_0)object4).X();
        if (object != null) {
            pB0 pB02;
            object5 = pB02;
            object4 = string2;
            string5 = string3;
            pB02 = new pB0(string2, string3, (String)object2, (Function0)object3, n10 != 0, n3, n4);
            ((CF2)object).d = pB02;
        }
    }

    public static final void c(Function0 function0, b30_0 object, int n3) {
        Object object2 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(1696758536);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            String string2;
            Object object3;
            Object object4 = h40_0.a;
            object4 = h40_0.x();
            Object object5 = "";
            if (object4 == null || (object3 = ((FleekConfigs)object4).getNoInternetPrimaryText()) == null) {
                object3 = object5;
            }
            if (object4 == null || (string2 = ((FleekConfigs)object4).getNoInternetSecondaryText()) == null) {
                string2 = object5;
            }
            if (object4 != null && (object4 = ((FleekConfigs)object4).getNoInternetButtonText()) != null) {
                object5 = object4;
            }
            ((j30_0)object).K(-1202312397);
            n7 = 0;
            object4 = null;
            if ((n4 &= 0xE) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object6 = ((j30_0)object).v();
            if (n4 != 0 || object6 == (object2 = b30$a.a)) {
                object6 = new kb0_0(function0);
                ((j30_0)object).o(object6);
            }
            object2 = object6;
            object2 = (Function0)object6;
            ((j30_0)object).T(false);
            int n14 = 16;
            object4 = object3;
            object6 = string2;
            object3 = object2;
            string2 = null;
            rB0.b((String)object4, (String)object6, (String)object5, (Function0)object2, false, (b30_0)object, 0, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new lb0_1(function0, n3);
        }
    }

    public static final void d(b30_0 object, int n3) {
        Object object2;
        int n4 = 24999702;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object3;
            object2 = h40_0.a;
            object2 = h40_0.x();
            String string2 = "";
            if (object2 == null || (object3 = ((FleekConfigs)object2).getNonConfiguredRoutePrimaryText()) == null) {
                object3 = string2;
            }
            if (object2 == null || (object2 = ((FleekConfigs)object2).getNonConfiguredRouteSecondaryText()) == null) {
                object2 = string2;
            }
            int n7 = 24576;
            int n8 = 12;
            string2 = object3;
            object3 = object2;
            rB0.b(string2, (String)object2, null, null, false, (b30_0)object, n7, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new qb0_0(n3);
        }
    }

    public static final void e(Function0 function0, b30_0 object, int n3) {
        Object object2 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(855022245);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            String string2;
            Object object3;
            Object object4 = h40_0.a;
            object4 = h40_0.x();
            Object object5 = "";
            if (object4 == null || (object3 = ((FleekConfigs)object4).getPageUnavailablePrimaryText()) == null) {
                object3 = object5;
            }
            if (object4 == null || (string2 = ((FleekConfigs)object4).getPageUnavailableSecondaryText()) == null) {
                string2 = object5;
            }
            if (object4 != null && (object4 = ((FleekConfigs)object4).getPageUnavailableButtonText()) != null) {
                object5 = object4;
            }
            ((j30_0)object).K(-424219108);
            n7 = 0;
            object4 = null;
            if ((n4 &= 0xE) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object6 = ((j30_0)object).v();
            if (n4 != 0 || object6 == (object2 = b30$a.a)) {
                object6 = new mb0_1(function0);
                ((j30_0)object).o(object6);
            }
            object2 = object6;
            object2 = (Function0)object6;
            ((j30_0)object).T(false);
            int n14 = 16;
            object4 = object3;
            object6 = string2;
            object3 = object2;
            string2 = null;
            rB0.b((String)object4, (String)object6, (String)object5, (Function0)object2, false, (b30_0)object, 0, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new nb0_1(function0, n3);
        }
    }
}

