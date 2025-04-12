/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.lifecycle.i$a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.google.common.collect.Comparators;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

public final class ov3 {
    public static final float A(ft1_2 object, Js1 js1) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(js1, "info");
        Number number = 0;
        int n3 = ((ft1_2)object).j().f();
        int n4 = js1.getOffset();
        Integer n7 = n3 - n4;
        n7 = (Integer)Comparators.max(number, n7);
        n4 = js1.getOffset();
        int n8 = js1.getSize() + n4;
        int n10 = ((ft1_2)object).j().d();
        object = n8 - n10;
        object = (Integer)Comparators.max(number, (Comparable)object);
        number = Float.valueOf(0.0f);
        n3 = n7;
        Intrinsics.checkNotNull(object);
        float f5 = (Integer)object + n3;
        float f6 = 100.0f;
        f5 *= f6;
        float f7 = js1.getSize();
        object = Float.valueOf(f6 - (f5 /= f7));
        object = Comparators.max(number, (Comparable)object);
        Intrinsics.checkNotNullExpressionValue(object, "max(...)");
        return ((Number)object).floatValue();
    }

    public static final void a(LP1 object, BannerData bannerData, g71_0 g71_02, Function1 function1, int n3, b30_0 object2, int n4) {
        Object object3;
        Intrinsics.checkNotNullParameter(bannerData, "bannerBuilderData");
        Intrinsics.checkNotNullParameter(function1, "onBannerClick");
        int n7 = -1918148190;
        object = object2.g(n7);
        object2 = LP1$a.b;
        float f5 = uq0_0.e;
        Object object4 = SP2.a(f5);
        object4 = QV.a((LP1)object2, (i13)object4);
        long l2 = nz_1.f;
        Object object5 = fg2_1.a;
        object4 = a.b((LP1)object4, l2, (i13)object5);
        ((j30_0)object).K(-328540066);
        int n8 = n4 & 0x1C00 ^ 0xC00;
        int n10 = 2048;
        int n14 = 1;
        if (n8 > n10 && (n8 = (int)(((j30_0)object).J(function1) ? 1 : 0)) != 0 || (n8 = n4 & 0xC00) == n10) {
            n8 = 1;
        } else {
            n8 = 0;
            object3 = null;
        }
        n10 = 0xE000 & n4 ^ 0x6000;
        int n15 = 16384;
        if ((n10 <= n15 || (n10 = (int)(((j30_0)object).c(n3) ? 1 : 0)) == 0) && (n10 = n4 & 0x6000) != n15) {
            n14 = 0;
        }
        object5 = ((j30_0)object).v();
        if ((n8 |= n14) != 0 || object5 == (object3 = b30$a.a)) {
            object5 = new uu3_0(n3, function1);
            ((j30_0)object).o(object5);
        }
        object5 = (Function0)object5;
        ((j30_0)object).T(false);
        object3 = x20_0.d((LP1)object4, (Function0)object5);
        object4 = new Bu3(g71_02, bannerData);
        n15 = 4;
        n14 = 0;
        object5 = object;
        b.a((Function1)object4, (LP1)object3, null, (b30_0)object, 0, n15);
        object = ((j30_0)object).X();
        if (object != null) {
            ju3_0 ju3_02;
            object4 = ju3_02;
            object3 = object2;
            object5 = g71_02;
            n15 = n3;
            ju3_02 = new ju3_0((LP1)object2, bannerData, g71_02, function1, n3, n4);
            ((CF2)object).d = ju3_02;
        }
    }

    public static final void b(LP1 lP1, mj0_2 mj0_22, u10 u102, u10 u103, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        float f5;
        Object object5 = mj0_22;
        u10 u104 = u102;
        u10 u105 = u103;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(mj0_22, "onRefresh");
        Intrinsics.checkNotNullParameter(u102, "content");
        Object object6 = "indicatorRefresh";
        Intrinsics.checkNotNullParameter(u103, (String)object6);
        float f6 = -9.691397E-16f;
        Object object7 = b30_02;
        j30_0 j30_02 = b30_02.g(-1500796174);
        int n7 = n3 | 6;
        int n8 = n3 & 0x70;
        MB2 mB2 = null;
        if (n8 == 0) {
            n8 = (int)(j30_02.a(false) ? 1 : 0);
            if (n8 != 0) {
                n8 = 32;
                f5 = 4.5E-44f;
            } else {
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n7 |= n8;
        }
        if ((n8 = n4 & 0x380) == 0) {
            n8 = (int)(j30_02.x(object5) ? 1 : 0);
            if (n8 != 0) {
                n8 = 256;
                f5 = 3.59E-43f;
            } else {
                n8 = 128;
                f5 = 1.8E-43f;
            }
            n7 |= n8;
        }
        if ((n8 = n4 & 0x1C00) == 0) {
            n8 = (int)(j30_02.x(u104) ? 1 : 0);
            if (n8 != 0) {
                n8 = 2048;
                f5 = 2.87E-42f;
            } else {
                n8 = 1024;
                f5 = 1.435E-42f;
            }
            n7 |= n8;
        }
        f5 = 8.0356E-41f;
        n8 = 0xE000 & n4;
        if (n8 == 0) {
            n8 = (int)(j30_02.x(u105) ? 1 : 0);
            if (n8 != 0) {
                n8 = 16384;
                f5 = 2.2959E-41f;
            } else {
                n8 = 8192;
                f5 = 1.148E-41f;
            }
            n7 |= n8;
        }
        f5 = 6.5596E-41f;
        n8 = 0xB6DB & n7;
        int n10 = 9362;
        float f7 = 1.3119E-41f;
        if (n8 == n10 && (n8 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object7 = lP1;
        } else {
            LP1$a lP1$a = LP1$a.b;
            n7 = n7 >> 3 & 0xE;
            SwipeRefreshState swipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(false, j30_02, n7);
            n7 = 12502365;
            f6 = 1.7519545E-38f;
            j30_02.K(n7);
            object6 = j30_02.v();
            Object object8 = b30$a.a;
            if (object6 == object8) {
                object6 = J83.g(0);
                j30_02.o(object6);
            }
            Object object9 = object6;
            object9 = (tr1_0)object6;
            j30_02.T(false);
            n7 = ((Number)object9.getValue()).intValue();
            n8 = 1137180672;
            f5 = 400.0f;
            object4 = Hl.b(f5, 5, null);
            object7 = jk_1.a;
            object7 = n7;
            object6 = IntCompanionObject.INSTANCE;
            object3 = ya3_0.b;
            object2 = null;
            n7 = 24960;
            f6 = 3.4976E-41f;
            float f8 = 0.0f;
            Object object10 = "";
            int n14 = 8;
            object = j30_02;
            object6 = object8;
            ib3_0 ib3_02 = jk_1.c(object7, (Vs3)object3, (Gl)object4, null, (String)object10, null, j30_02, n7, n14);
            object7 = O30.f;
            object7 = (Vo0)j30_02.j((H30)object7);
            n10 = 12510224;
            f7 = 1.7530558E-38f;
            j30_02.K(n10);
            object3 = j30_02.v();
            if (object3 == object8) {
                f7 = uq0_0.C;
                object4 = new xs0_0(f7);
                j30_02.o(object4);
                object3 = object4;
            }
            float f11 = ((xs0_0)object3).a;
            n10 = 12511468;
            f7 = 1.7532301E-38f;
            object3 = wg2_2.a(j30_02, false, n10);
            if (object3 == object6) {
                f6 = object7.J0(f11);
                object3 = Float.valueOf(f6);
                j30_02.o(object3);
            }
            f8 = ((Number)object3).floatValue();
            j30_02.T(false);
            mB2 = Og2.a.c(null);
            object6 = object8;
            object7 = swipeRefreshState;
            object3 = mj0_22;
            object10 = object9;
            object2 = u103;
            object = lP1$a;
            object5 = object8;
            object8 = u102;
            ((ev3)object6)(swipeRefreshState, mj0_22, f11, f8, (tr1_0)object9, u103, lP1$a, ib3_02, u102);
            n7 = -1557676494;
            f6 = -9.0933636E-18f;
            object6 = v10.c(n7, (fx0_2)object6, j30_02);
            n8 = 56;
            f5 = 7.8E-44f;
            L30.a(mB2, (Function2)object6, j30_02, n8);
            object7 = lP1$a;
        }
        object2 = j30_02.X();
        if (object2 != null) {
            object6 = object;
            object3 = mj0_22;
            object4 = u102;
            object = new Zu3((LP1)object7, mj0_22, u102, u103, n3);
            ((CF2)object2).d = object;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(LP1 lP1, tv0_0 tv0_02, String string2, long l2, long l3, int n3, xm3 xm32, b30_0 b30_02, int n4, int n7) {
        CF2 cF2;
        j30_0 j30_02;
        int n8;
        int n10;
        Object object;
        int n14;
        int n15;
        Object object2;
        int n16;
        int n17;
        int n18;
        j30_0 j30_03;
        Object object3;
        Object object4;
        int n19;
        Object object5;
        Object object6;
        block22: {
            block18: {
                block21: {
                    block20: {
                        block19: {
                            int n20;
                            block17: {
                                object6 = lP1;
                                object5 = string2;
                                n19 = n4;
                                Intrinsics.checkNotNullParameter(lP1, "modifier");
                                object4 = "title";
                                Intrinsics.checkNotNullParameter(string2, (String)object4);
                                object3 = b30_02;
                                j30_03 = b30_02.g(-1697754177);
                                n18 = n4 & 0xE;
                                if (n18 == 0) {
                                    n18 = (int)(j30_03.J(lP1) ? 1 : 0);
                                    n18 = n18 != 0 ? 4 : 2;
                                    n18 |= n19;
                                } else {
                                    n18 = n4;
                                }
                                n17 = n7 & 2;
                                if (n17 != 0) {
                                    n18 |= 0x30;
                                } else {
                                    n16 = n19 & 0x70;
                                    if (n16 == 0) {
                                        object2 = tv0_02;
                                        n20 = (int)(j30_03.J(tv0_02) ? 1 : 0);
                                        n20 = n20 != 0 ? 32 : 16;
                                    }
                                }
                                object2 = tv0_02;
                                break block17;
                                n18 |= n20;
                            }
                            n20 = n19 & 0x380;
                            if (n20 == 0) {
                                n20 = (int)(j30_03.J(object5) ? 1 : 0);
                                n20 = n20 != 0 ? 256 : 128;
                                n18 |= n20;
                            }
                            if ((n20 = n19 & 0x1C00) == 0) {
                                n20 = (int)(j30_03.d(l2) ? 1 : 0);
                                n20 = n20 != 0 ? 2048 : 1024;
                                n18 |= n20;
                            }
                            if ((n20 = 0xE000 & n19) == 0) {
                                n20 = (int)(j30_03.d(l3) ? 1 : 0);
                                n20 = n20 != 0 ? 16384 : 8192;
                                n18 |= n20;
                            }
                            if ((n15 = n19 & (n20 = 458752)) == 0) {
                                n15 = 65536;
                                n18 |= n15;
                            }
                            if ((n14 = n19 & (n15 = 0x380000)) != 0) break block18;
                            n14 = n7 & 0x40;
                            if (n14 != 0) break block19;
                            object = xm32;
                            n10 = (int)(j30_03.J(xm32) ? 1 : 0);
                            if (n10 == 0) break block20;
                            n10 = 0x100000;
                            break block21;
                        }
                        object = xm32;
                    }
                    n10 = 524288;
                }
                n18 |= n10;
                break block22;
            }
            object = xm32;
        }
        n10 = 0x2DB6DB & n18;
        int n21 = 599186;
        if (n10 == n21 && (n10 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            n8 = n3;
            j30_02 = j30_03;
        } else {
            Object object7;
            Object object8;
            j30_03.r0();
            n10 = n19 & 1;
            n21 = -4128769;
            int n22 = -458753;
            if (n10 != 0 && (n10 = (int)(j30_03.c0() ? 1 : 0)) == 0) {
                j30_03.D();
                n17 = n18 & n22;
                n10 = n7 & 0x40;
                if (n10 != 0) {
                    n17 = n18 & n21;
                }
                object8 = object2;
                object7 = object;
                n16 = n3;
            } else {
                object3 = n17 != 0 ? tv0_0.m : object2;
                n16 = n18 & n22;
                n10 = n7 & 0x40;
                n22 = 0;
                if (n10 != 0) {
                    object2 = Ll3.a;
                    object2 = (xm3)j30_03.j((H30)object2);
                    object8 = object3;
                    object7 = object2;
                    n16 = 0;
                    object2 = null;
                    n17 = n18 &= n21;
                } else {
                    object8 = object3;
                    n17 = n16;
                    object7 = object;
                    n16 = 0;
                    object2 = null;
                }
            }
            j30_03.U();
            Object object9 = y20_0.a;
            object4 = new nV0(n16);
            n14 = n17 >> 6;
            n10 = n14 & 0xE | 0x180000;
            n21 = n17 << 3 & 0x70;
            n14 = n14 & 0x380 | (n10 |= n21);
            n10 = n17 & 0x1C00;
            n14 |= n10;
            n10 = n17 << 12;
            int n24 = n14 | (n20 &= n10);
            int n25 = n17 & n15 | 0x30;
            long l4 = 0L;
            n17 = 0;
            cF2 = null;
            long l7 = 0L;
            n21 = 2;
            n22 = 0;
            int n26 = 63360;
            Object object10 = object4;
            object4 = string2;
            object3 = lP1;
            j30_02 = j30_03;
            Object object11 = object10;
            object5 = object8;
            object6 = object9;
            object9 = object7;
            object10 = j30_03;
            Ll3.b(string2, lP1, l3, l2, (nV0)object11, (tv0_0)object8, (RU0)object6, l4, null, null, l7, n21, false, 0, 0, null, (xm3)object7, j30_03, n24, n25, n26);
            object2 = object8;
            object = object7;
            n8 = n16;
        }
        cF2 = j30_02.X();
        if (cF2 != null) {
            xu3_0 xu3_02;
            object4 = xu3_02;
            object3 = lP1;
            n10 = n4;
            xu3_02 = new xu3_0(lP1, (tv0_0)object2, string2, l2, l3, n8, (xm3)object, n4, n7);
            cF2.d = xu3_02;
        }
    }

    public static final void d(LP1 lP1, tv0_0 tv0_02, Function0 function0, b30_0 b30_02, int n3) {
        j30_0 j30_02;
        Object object;
        float f5;
        int n4;
        LP1 lP12 = lP1;
        Function0 function02 = function0;
        int n7 = n3;
        int n8 = 1;
        Object object2 = "Following";
        Intrinsics.checkNotNullParameter(object2, "buttonText");
        Object object3 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(function0, (String)object3);
        j30_0 j30_03 = b30_02.g(-1617902710);
        int n10 = n3 & 0xE;
        if (n10 == 0) {
            n10 = (int)(j30_03.J(lP1) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x380;
        if (n14 == 0) {
            n4 = j30_03.J(object2);
            if (n4 != 0) {
                n4 = 256;
                f5 = 3.59E-43f;
            } else {
                n4 = 128;
                f5 = 1.8E-43f;
            }
            n10 |= n4;
        }
        n4 = n7 & 0x1C00;
        int n15 = 2048;
        if (n4 == 0) {
            n4 = (int)(j30_03.x(function02) ? 1 : 0);
            if (n4 != 0) {
                n4 = 2048;
                f5 = 2.87E-42f;
            } else {
                n4 = 1024;
                f5 = 1.435E-42f;
            }
            n10 |= n4;
        }
        if ((n4 = n10 & 0x168B) == (n14 = 1154) && (n4 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            object = tv0_02;
            j30_02 = j30_03;
        } else {
            tv0_0 tv0_03 = tv0_0.m;
            f5 = n8;
            long l2 = nz_1.c;
            Object object4 = oz_0.a(l2, f5);
            object2 = GE.a;
            long l3 = OX.b;
            int n16 = 4;
            Object object5 = j30_03;
            object5 = GE.b(l3, l2, j30_03, n16);
            f5 = -4.8751286E24f;
            j30_03.K(-394196184);
            n4 = n10 & 0x1C00;
            n14 = 0;
            if (n4 == n15) {
                n4 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            Object object6 = j30_03.v();
            if (n4 != 0 || object6 == (object2 = b30$a.a)) {
                object6 = new fb0_1(function02, n8);
                j30_03.o(object6);
            }
            object = object6;
            object = (Function0)object6;
            j30_03.T(false);
            object2 = new fv3();
            u10 u102 = v10.c(-769228390, (fx0_2)object2, j30_03);
            n10 = n10 << 3 & 0x70;
            int n17 = n10 | 0x30000180;
            n16 = 0;
            n4 = 1;
            f5 = Float.MIN_VALUE;
            n14 = 0;
            object6 = null;
            int n18 = 312;
            object3 = lP1;
            nz nz4 = object4;
            object4 = j30_03;
            j30_02 = j30_03;
            ME.a((Function0)object, lP1, n4 != 0, null, null, null, nz4, (ol0)object5, null, u102, j30_03, n17, n18);
            object = tv0_03;
        }
        object3 = j30_02.X();
        if (object3 != null) {
            ((CF2)object3).d = object2 = new su3_0(lP12, (tv0_0)object, function02, n7);
        }
    }

    public static final void e(LP1 lP1, String string2, boolean bl2, float f5, String string3, boolean bl3, long l2, float f6, long l3, long l4, b30_0 object, int n3, int n4) {
        long l7;
        Object object2 = string2;
        String string4 = string3;
        int n7 = n4;
        Intrinsics.checkNotNullParameter(string2, "imageModel");
        Intrinsics.checkNotNullParameter(string3, "contentDescription");
        int n8 = 183366919;
        Object object3 = object;
        Object object4 = object.g(n8);
        int n10 = n4 & 1;
        object3 = n10 != 0 ? LP1$a.b : lP1;
        int bl4 = n7 & 0x40;
        long l8 = bl4 != 0 ? (l7 = nz_1.g) : l2;
        float f7 = uq0_0.c;
        int n14 = n7 & 0x100;
        long l12 = n14 != 0 ? (l7 = nz_1.g) : l3;
        long l14 = OX.b;
        LP1 lP12 = j.h((LP1)object3, f5);
        Object object5 = i70$a.a;
        int n15 = 121;
        Object object6 = new he1_2(null, string4, (i70_0)object5, n15);
        Vu3 vu3 = new Vu3((String)object2);
        boolean bl5 = true;
        boolean bl6 = true;
        object5 = new iv3_0((LP1)object3, f5, bl6, f7, l12, bl5, l14);
        n7 = -36565379;
        object5 = v10.c(n7, (fx0_2)object5, (b30_0)object4);
        boolean bl7 = true;
        object = string3;
        Object object7 = new kv3((LP1)object3, f5, bl7, f7, l8, bl5, string3);
        int n16 = 1077619234;
        object2 = v10.c(n16, (fx0_2)object7, (b30_0)object4);
        bl6 = true;
        object7 = new nv3((LP1)object3, f5, bl6, f7, l12, bl5, l14);
        int n17 = 1760836966;
        u10 u102 = v10.c(n17, (fx0_2)object7, (b30_0)object4);
        int n18 = 0x36000000;
        bl6 = false;
        int n19 = 6;
        int n20 = 220;
        vw_1.b(vu3, lP12, null, null, null, (he1_2)object6, null, null, (hx0_2)object5, (ix0_2)object2, u102, (b30_0)object4, n18, n19, n20);
        object7 = ((j30_0)object4).X();
        if (object7 != null) {
            object4 = object6;
            object2 = string2;
            boolean bl8 = bl5;
            string4 = string3;
            boolean bl9 = true;
            n7 = n4;
            object3 = object6 = new Wu3((LP1)object3, string2, bl5, f5, string3, bl9, l8, f7, l12, l14, n3, n4);
            object4 = object7;
            ((CF2)object7).d = object6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void f(boolean bl2, String string2, float f5, float f6, LP1 lP1, tv0_0 tv0_02, float f7, ol0 ol02, Function0 function0, boolean bl3, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        float f8;
        float f11;
        Object object4;
        int n7;
        int n8;
        int n10;
        float f12;
        int n14;
        int n15;
        float f14;
        int n16;
        float f15;
        int n17;
        int n18;
        j30_0 j30_02;
        Object object5;
        float f16;
        int n19;
        int n20;
        int n21;
        Function0 function02;
        Object object6;
        Object object7;
        Object object8;
        block47: {
            block46: {
                object8 = string2;
                object7 = lP1;
                object6 = tv0_02;
                function02 = function0;
                n21 = n3;
                n20 = n4;
                n19 = 8;
                f16 = 5.6E-45f;
                Intrinsics.checkNotNullParameter(string2, "buttonText");
                Intrinsics.checkNotNullParameter(lP1, "boxModifier");
                Intrinsics.checkNotNullParameter(function0, "onButtonClicked");
                int n22 = -1934092501;
                object5 = b30_02;
                j30_02 = b30_02.g(n22);
                n18 = n3 | 6;
                n17 = n3 & 0x70;
                if (n17 == 0) {
                    n17 = (int)(j30_02.J(string2) ? 1 : 0);
                    if (n17 != 0) {
                        n17 = 32;
                        f15 = 4.5E-44f;
                    } else {
                        n17 = 16;
                        f15 = 2.2E-44f;
                    }
                    n18 |= n17;
                }
                if ((n17 = n20 & 4) != 0) {
                    n18 |= 0x180;
                } else {
                    n16 = n21 & 0x380;
                    if (n16 == 0) {
                        f14 = f5;
                        n15 = (int)(j30_02.b(f5) ? 1 : 0);
                        n15 = n15 != 0 ? 256 : 128;
                    }
                }
                f14 = f5;
                break block46;
                n18 |= n15;
            }
            n15 = n20 & 8;
            if (n15 != 0) {
                n18 |= 0xC00;
            } else {
                n14 = n21 & 0x1C00;
                if (n14 == 0) {
                    f12 = f6;
                    n10 = (int)(j30_02.b(f6) ? 1 : 0);
                    n10 = n10 != 0 ? 2048 : 1024;
                }
            }
            f12 = f6;
            break block47;
            n18 |= n10;
        }
        n10 = n21 & 0xE000;
        if (n10 == 0) {
            n10 = (int)(j30_02.J(object7) ? 1 : 0);
            n10 = n10 != 0 ? 16384 : 8192;
            n18 |= n10;
        }
        if ((n10 = n21 & 0x70000) == 0) {
            n10 = (int)(j30_02.J(object6) ? 1 : 0);
            n10 = n10 != 0 ? 131072 : 65536;
            n18 |= n10;
        }
        if ((n10 = n20 & 0x40) != 0) {
            n8 = 0x180000;
            n18 |= n8;
            f16 = f7;
        } else {
            n8 = n21 & 0x380000;
            f16 = f7;
            if (n8 == 0) {
                n8 = (int)(j30_02.b(f7) ? 1 : 0);
                n8 = n8 != 0 ? 0x100000 : 524288;
                n18 |= n8;
            }
        }
        n8 = n21 & 0x1C00000;
        if (n8 == 0) {
            n8 = 0x400000;
            n18 |= n8;
        }
        if ((n8 = n21 & (n7 = 0xE000000)) == 0) {
            n8 = (int)(j30_02.x(function02) ? 1 : 0);
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n18 |= n8;
        }
        int n24 = n20 & 0x200;
        int n25 = 0x30000000;
        if (n24 != 0) {
            n18 |= n25;
            n19 = (int)(bl3 ? 1 : 0);
        } else {
            n8 = n21 & 0x70000000;
            n19 = (int)(bl3 ? 1 : 0);
            if (n8 == 0) {
                n8 = (int)(j30_02.a(bl3) ? 1 : 0);
                n8 = n8 != 0 ? 0x20000000 : 0x10000000;
                n18 |= n8;
            }
        }
        n8 = 1533916891;
        int n26 = n18 & n8;
        n19 = 306783378;
        if (n26 == n19 && (n19 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            n19 = (int)(bl2 ? 1 : 0);
            object4 = ol02;
            n21 = (int)(bl3 ? 1 : 0);
            f11 = f16;
            f16 = f14;
            f8 = f12;
        } else {
            boolean bl4;
            Object object9;
            int n27;
            rp2_0 rp2_02;
            j30_02.r0();
            n26 = n21 & 1;
            n19 = 0;
            Object object10 = null;
            int n28 = -29360129;
            if (n26 != 0 && (n26 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
                n24 = n18 & n28;
                object5 = ol02;
                f8 = f14;
                f15 = f12;
                n14 = (int)(bl3 ? 1 : 0);
                n16 = n24;
                n24 = (int)(bl2 ? 1 : 0);
            } else {
                f8 = n17 != 0 ? 0.0f : f14;
                f15 = n15 != 0 ? 0.0f : f12;
                if (n10 != 0) {
                    f16 = uq0_0.h;
                }
                object3 = GE.a;
                long l2 = nz_1.c;
                n14 = 0x3F000000;
                f12 = 0.5f;
                long l3 = OX.b(l2, f12);
                rp2_02 = null;
                n27 = 10;
                object3 = GE.a(l2, l3, j30_02, 0, n27);
                n18 &= n28;
                if (n24 != 0) {
                    n24 = 1;
                    n14 = 0;
                    f12 = 0.0f;
                    object9 = null;
                } else {
                    n14 = (int)(bl3 ? 1 : 0);
                    n24 = 1;
                }
                n16 = n18;
                object5 = object3;
            }
            j30_02.U();
            object2 = O30.f;
            object2 = (Vo0)j30_02.j((H30)object2);
            n19 = -1430038816;
            j30_02.K(n19);
            object10 = j30_02.v();
            b30$a$a b30$a$a = b30$a.a;
            if (object10 == b30$a$a) {
                object10 = new xs0_0(f8);
                object10 = J83.g(object10);
                j30_02.o(object10);
            }
            object10 = (tr1_0)object10;
            n20 = -1430036287;
            Object object11 = object5;
            n18 = 0;
            f11 = 0.0f;
            object5 = null;
            Object object12 = wg2_2.a(j30_02, false, n20);
            if (object12 == b30$a$a) {
                object12 = new xs0_0(f15);
                object12 = J83.g(object12);
                j30_02.o(object12);
            }
            object12 = (tr1_0)object12;
            j30_02.T(false);
            int n29 = n24;
            object = HA.e(Nc$a.a, false);
            n18 = j30_02.P;
            object8 = j30_02.P();
            object6 = a30_0.c(j30_02, (LP1)object7);
            N20$a n20$a = N20.W;
            n20$a.getClass();
            object7 = N20$a.b;
            n10 = n14;
            object9 = j30_02.a;
            n14 = object9 instanceof mp;
            if (n14 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n14 = (int)(j30_02.O ? 1 : 0);
            if (n14 != 0) {
                j30_02.C((Function0)object7);
            } else {
                j30_02.n();
            }
            object7 = N20$a.e;
            Ow3.a(j30_02, object, (Function2)object7);
            object = N20$a.d;
            Ow3.a(j30_02, object8, (Function2)object);
            object = N20$a.f;
            boolean bl5 = j30_02.O;
            if (bl5 || !(bl4 = Intrinsics.areEqual(object8 = j30_02.v(), object7 = Integer.valueOf(n18)))) {
                rk_0.a(n18, j30_02, n18, (N20$a$a)object);
            }
            object = N20$a.c;
            Ow3.a(j30_02, object6, (Function2)object);
            object = LP1$a.b;
            int n30 = 8;
            float f17 = n30;
            int n32 = 13;
            Object object13 = object;
            object8 = h.i((LP1)object, 0.0f, f17, 0.0f, 0.0f, n32);
            float f18 = 0.0f;
            object7 = null;
            float f19 = 0.0f;
            int n34 = xs0_0.a(f15, f19);
            n18 = 1573505417;
            f11 = 1.817538E18f;
            j30_02.K(n18);
            object5 = j30_02.v();
            if (object5 == b30$a$a) {
                n14 = 1;
                f12 = Float.MIN_VALUE;
                object5 = new cu_0(object12, n14);
                j30_02.o(object5);
            }
            object5 = (Function1)object5;
            n14 = 1573507777;
            f12 = 1.8178623E18f;
            int n35 = 0;
            function02 = null;
            object9 = wg2_2.a(j30_02, false, n14);
            if (object9 == b30$a$a) {
                n35 = 2;
                object9 = new jf_1(object12, n35);
                j30_02.o(object9);
            }
            object9 = (Function1)object9;
            n35 = 0;
            function02 = null;
            j30_02.T(false);
            object8 = x20_0.a((LP1)object8, n34 != 0, (Function1)object5, (Function1)object9);
            f18 = ((xs0_0)object10.getValue()).a;
            object13 = j.k((LP1)object8, f18);
            int n36 = 4;
            f17 = n36;
            n32 = 10;
            object8 = h.i((LP1)object13, f17, 0.0f, f17, 0.0f, n32);
            f11 = 1.0f;
            long l4 = OX.f;
            object9 = SP2.a(f16);
            object8 = gz.a((LP1)object8, f11, l4, (i13)object9);
            f18 = 0.0f;
            object7 = null;
            HA.a((LP1)object8, j30_02, 0);
            rp2_02 = SP2.a(f16);
            f17 = f19;
            n34 = xs0_0.a(f8, f19) ^ 1;
            f19 = 1.8198766E18f;
            j30_02.K(1573522433);
            int n37 = n16 & 0x380;
            n18 = 256;
            f11 = 3.59E-43f;
            if (n37 == n18) {
                n37 = 1;
                f19 = Float.MIN_VALUE;
            } else {
                n37 = 0;
                f19 = 0.0f;
                object6 = null;
            }
            object5 = j30_02.v();
            if (n37 != 0 || object5 == b30$a$a) {
                object5 = new Ku3(f8);
                j30_02.o(object5);
            }
            object5 = (Function1)object5;
            j30_02.T(false);
            object6 = null;
            object = x20_0.a((LP1)object, n34 != 0, (Function1)object5, null);
            boolean bl6 = xs0_0.a(f15, f17) ^ true;
            f18 = 1.8202727E18f;
            j30_02.K(1573525315);
            n34 = n16 & 0x1C00;
            n37 = 2048;
            f19 = 2.87E-42f;
            if (n34 == n37) {
                n34 = 1;
                f18 = Float.MIN_VALUE;
            } else {
                n34 = 0;
                f18 = 0.0f;
                object7 = null;
            }
            object6 = j30_02.v();
            if (n34 != 0 || object6 == b30$a$a) {
                object6 = new Lu3(f15);
                j30_02.o(object6);
            }
            object6 = (Function1)object6;
            j30_02.T(false);
            n34 = 0;
            f18 = 0.0f;
            object = x20_0.a((LP1)object, bl6, (Function1)object6, null);
            f17 = 1.8206527E18f;
            j30_02.K(1573528080);
            boolean bl7 = j30_02.J(object2);
            object7 = j30_02.v();
            if (bl7 || object7 == b30$a$a) {
                object7 = new Mu3((Vo0)object2, (tr1_0)object10, (tr1_0)object12);
                j30_02.o(object7);
            }
            object7 = (Function1)object7;
            object10 = null;
            j30_02.T(false);
            object2 = c.a((LP1)object, (Function1)object7);
            j30_02.K(1573548036);
            n24 = n16 & n7;
            n19 = 0x4000000;
            if (n24 == n19) {
                n19 = 1;
            } else {
                n19 = 0;
                object10 = null;
            }
            object = j30_02.v();
            if (n19 == 0 && object != b30$a$a) {
                function02 = function0;
            } else {
                function02 = function0;
                n19 = 2;
                object = new s22(function0, n19);
                j30_02.o(object);
            }
            object = (Function0)object;
            j30_02.T(false);
            object8 = string2;
            object6 = tv0_02;
            n34 = n10;
            object10 = new ov3$a(n10 != 0, string2, tv0_02);
            n18 = 1205789813;
            u10 u102 = v10.c(n18, (fx0_2)object10, j30_02);
            int n38 = n16 << 6 & 0x380 | n25;
            n27 = 0;
            n10 = 0;
            n20$a = null;
            n8 = 0;
            n25 = 344;
            object3 = object;
            n19 = n34;
            n14 = n29;
            ME.a((Function0)object, (LP1)object2, n29 != 0, null, null, rp2_02, null, (ol0)object11, null, u102, j30_02, n38, n25);
            n24 = 1;
            j30_02.T(n24 != 0);
            n21 = n34;
            f11 = f16;
            f16 = f8;
            f8 = f15;
            object4 = object11;
            n19 = n29;
        }
        object3 = j30_02.X();
        if (object3 != null) {
            object = object2;
            object8 = string2;
            object7 = lP1;
            object6 = tv0_02;
            object5 = object4;
            function02 = function0;
            n17 = n21;
            n21 = n3;
            n20 = n4;
            ((CF2)object3).d = object2 = new Nu3(n19 != 0, string2, f16, f8, lP1, tv0_02, f11, (ol0)object4, function0, n17 != 0, n3, n4);
        }
    }

    public static final void g(LP1 lP1, float f5, long l2, long l3, Function0 function0, b30_0 b30_02, int n3) {
        block19: {
            Object object;
            Object object2;
            long l4;
            long l7;
            float f6;
            Object object3;
            Function0 function02;
            LP1 lP12;
            block18: {
                float f7;
                int n4;
                float f8;
                int n7;
                int n8;
                Object object4;
                block17: {
                    lP12 = lP1;
                    function02 = function0;
                    Intrinsics.checkNotNullParameter(lP1, "modifier");
                    Intrinsics.checkNotNullParameter(function0, "onBackClicked");
                    int n10 = 79042994;
                    object4 = b30_02;
                    object3 = b30_02.g(n10);
                    n8 = n3 & 0xE;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 4;
                            f6 = 5.6E-45f;
                        } else {
                            n8 = 2;
                            f6 = 2.8E-45f;
                        }
                        n8 = n3 | n8;
                    } else {
                        n8 = n3;
                    }
                    n8 |= 0xDB0;
                    n7 = 57344;
                    int n14 = n3 & n7;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object3).x(function02) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 16384;
                            f8 = 2.2959E-41f;
                        } else {
                            n14 = 8192;
                            f8 = 1.148E-41f;
                        }
                        n8 |= n14;
                    }
                    f8 = 6.5596E-41f;
                    n14 = 0xB6DB & n8;
                    n4 = 9362;
                    f7 = 1.3119E-41f;
                    if (n14 != n4 || (n14 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block17;
                    ((j30_0)object3).D();
                    f6 = f5;
                    l7 = l2;
                    l4 = l3;
                    break block18;
                }
                f8 = uq0_0.b;
                long l8 = OX.f;
                n4 = 1045220557;
                f7 = 0.2f;
                long l12 = OX.b(l8, f7);
                long l14 = nz_1.k;
                Object object5 = SP2.a;
                object5 = gz.a(QV.a(lP12, (i13)object5), f8, l12, (i13)object5);
                float f11 = 0.6f;
                l8 = OX.b(l14, f11);
                object2 = fg2_1.a;
                object5 = a.b((LP1)object5, l8, (i13)object2);
                Object object6 = HA.e(Nc$a.a, false);
                int n15 = ((j30_0)object3).P;
                rq2_1 rq2_12 = ((j30_0)object3).P();
                object5 = a30_0.c((b30_0)object3, (LP1)object5);
                N20$a n20$a = N20.W;
                n20$a.getClass();
                Object object7 = N20$a.b;
                Object object8 = ((j30_0)object3).a;
                n7 = object8 instanceof mp;
                object = null;
                if (n7 == 0) break block19;
                ((j30_0)object3).A();
                n7 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n7 != 0) {
                    ((j30_0)object3).C((Function0)object7);
                } else {
                    ((j30_0)object3).n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object3, object6, (Function2)object8);
                object8 = N20$a.d;
                Ow3.a((b30_0)object3, rq2_12, (Function2)object8);
                object8 = N20$a.f;
                int n16 = ((j30_0)object3).O;
                if (n16 != 0 || (n16 = Intrinsics.areEqual(object7 = ((j30_0)object3).v(), object6 = Integer.valueOf(n15))) == 0) {
                    rk_0.a(n15, (j30_0)object3, n15, (N20$a$a)object8);
                }
                object8 = N20$a.c;
                Ow3.a((b30_0)object3, object5, (Function2)object8);
                object8 = androidx.compose.foundation.layout.d.a;
                object6 = km2.a(R$drawable.back_arrow_fleek, (b30_0)object3, 0);
                n16 = R$string.acc_back_icon;
                object7 = hv3_0.K(n16);
                object5 = LP1$a.b;
                object2 = Nc$a.e;
                object8 = ((androidx.compose.foundation.layout.d)object8).a((LP1)object5, (Nc)object2);
                ((j30_0)object3).K(459794975);
                n4 = 1;
                f7 = Float.MIN_VALUE;
                n15 = 16384;
                if ((n8 &= 0xE000) == n15) {
                    n8 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n8 = 0;
                    f6 = 0.0f;
                    object4 = null;
                }
                object2 = ((j30_0)object3).v();
                if (n8 != 0 || object2 == (object4 = b30$a.a)) {
                    n8 = 1;
                    f6 = Float.MIN_VALUE;
                    object2 = new lq0_1(function02, n8);
                    ((j30_0)object3).o(object2);
                }
                object2 = (Function0)object2;
                ((j30_0)object3).T(false);
                object2 = d.b((LP1)object8, false, null, (Function0)object2, 7);
                n8 = 0;
                object4 = null;
                n7 = 0;
                object8 = null;
                rq2_12 = null;
                n20$a = null;
                int n17 = 120;
                object = object7;
                int n18 = 8;
                Pd1.a((im2)object6, (String)object7, (LP1)object2, null, null, 0.0f, null, (b30_0)object3, n18, n17);
                ((j30_0)object3).T(n4 != 0);
                f6 = f8;
                l4 = l14;
                l7 = l12;
            }
            object = ((j30_0)object3).X();
            if (object != null) {
                object3 = object2;
                lP12 = lP1;
                function02 = function0;
                ((CF2)object).d = object2 = new au3_0(lP1, f6, l7, l4, function0, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void h(LP1 lP1, float f5, long l2, long l3, Function0 function0, b30_0 b30_02, int n3) {
        block19: {
            Object object;
            Object object2;
            long l4;
            long l7;
            float f6;
            Object object3;
            Function0 function02;
            LP1 lP12;
            block18: {
                float f7;
                int n4;
                float f8;
                int n7;
                int n8;
                Object object4;
                block17: {
                    lP12 = lP1;
                    function02 = function0;
                    Intrinsics.checkNotNullParameter(lP1, "modifier");
                    Intrinsics.checkNotNullParameter(function0, "onShareClicked");
                    int n10 = -1203111170;
                    object4 = b30_02;
                    object3 = b30_02.g(n10);
                    n8 = n3 & 0xE;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 4;
                            f6 = 5.6E-45f;
                        } else {
                            n8 = 2;
                            f6 = 2.8E-45f;
                        }
                        n8 = n3 | n8;
                    } else {
                        n8 = n3;
                    }
                    n8 |= 0xDB0;
                    n7 = 57344;
                    int n14 = n3 & n7;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object3).x(function02) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 16384;
                            f8 = 2.2959E-41f;
                        } else {
                            n14 = 8192;
                            f8 = 1.148E-41f;
                        }
                        n8 |= n14;
                    }
                    f8 = 6.5596E-41f;
                    n14 = 0xB6DB & n8;
                    n4 = 9362;
                    f7 = 1.3119E-41f;
                    if (n14 != n4 || (n14 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block17;
                    ((j30_0)object3).D();
                    f6 = f5;
                    l7 = l2;
                    l4 = l3;
                    break block18;
                }
                f8 = uq0_0.b;
                long l8 = OX.f;
                n4 = 1045220557;
                f7 = 0.2f;
                long l12 = OX.b(l8, f7);
                long l14 = nz_1.k;
                Object object5 = SP2.a;
                object5 = gz.a(QV.a(lP12, (i13)object5), f8, l12, (i13)object5);
                float f11 = 0.6f;
                l8 = OX.b(l14, f11);
                object2 = fg2_1.a;
                object5 = a.b((LP1)object5, l8, (i13)object2);
                Object object6 = HA.e(Nc$a.a, false);
                int n15 = ((j30_0)object3).P;
                rq2_1 rq2_12 = ((j30_0)object3).P();
                object5 = a30_0.c((b30_0)object3, (LP1)object5);
                N20$a n20$a = N20.W;
                n20$a.getClass();
                Object object7 = N20$a.b;
                Object object8 = ((j30_0)object3).a;
                n7 = object8 instanceof mp;
                object = null;
                if (n7 == 0) break block19;
                ((j30_0)object3).A();
                n7 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n7 != 0) {
                    ((j30_0)object3).C((Function0)object7);
                } else {
                    ((j30_0)object3).n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object3, object6, (Function2)object8);
                object8 = N20$a.d;
                Ow3.a((b30_0)object3, rq2_12, (Function2)object8);
                object8 = N20$a.f;
                int n16 = ((j30_0)object3).O;
                if (n16 != 0 || (n16 = Intrinsics.areEqual(object7 = ((j30_0)object3).v(), object6 = Integer.valueOf(n15))) == 0) {
                    rk_0.a(n15, (j30_0)object3, n15, (N20$a$a)object8);
                }
                object8 = N20$a.c;
                Ow3.a((b30_0)object3, object5, (Function2)object8);
                object8 = androidx.compose.foundation.layout.d.a;
                object6 = km2.a(R$drawable.ic_share_fleek, (b30_0)object3, 0);
                object7 = LP1$a.b;
                object5 = Nc$a.e;
                object8 = ((androidx.compose.foundation.layout.d)object8).a((LP1)object7, (Nc)object5);
                ((j30_0)object3).K(1934459078);
                n4 = 1;
                f7 = Float.MIN_VALUE;
                n16 = 16384;
                if ((n8 &= 0xE000) == n16) {
                    n8 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n8 = 0;
                    f6 = 0.0f;
                    object4 = null;
                }
                object7 = ((j30_0)object3).v();
                if (n8 != 0 || object7 == (object4 = b30$a.a)) {
                    n8 = 1;
                    f6 = Float.MIN_VALUE;
                    object7 = new bf2_1(function02, n8);
                    ((j30_0)object3).o(object7);
                }
                object7 = (Function0)object7;
                ((j30_0)object3).T(false);
                n15 = 7;
                object2 = d.b((LP1)object8, false, null, (Function0)object7, n15);
                n8 = 0;
                object4 = null;
                n7 = 0;
                object8 = null;
                object = "fleek circular share";
                rq2_12 = null;
                n16 = 0;
                object7 = null;
                int n17 = 56;
                int n18 = 120;
                Pd1.a((im2)object6, (String)object, (LP1)object2, null, null, 0.0f, null, (b30_0)object3, n17, n18);
                ((j30_0)object3).T(n4 != 0);
                f6 = f8;
                l4 = l14;
                l7 = l12;
            }
            object = ((j30_0)object3).X();
            if (object != null) {
                object3 = object2;
                lP12 = lP1;
                function02 = function0;
                ((CF2)object).d = object2 = new yu3_0(lP1, f6, l7, l4, function0, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void i(LP1 lP1, String string2, String string3, float f5, b30_0 b30_02, int n3, int n4) {
        String string4 = string2;
        Intrinsics.checkNotNullParameter(string2, "imageModel");
        int n7 = -1493831489;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        int n8 = n4 & 4;
        Object object3 = n8 != 0 ? (object = "") : string3;
        n8 = n4 & 8;
        float f6 = n8 != 0 ? uq0_0.a : f5;
        Object object4 = SP2.a(f6);
        LP1 lP12 = QV.a(lP1, (i13)object4);
        object4 = new we1_1(string4, 1);
        u10 u102 = q20_0.a;
        pv3_0 pv3_02 = new pv3_0(f6);
        u10 u103 = v10.c(-1035563042, pv3_02, (b30_0)object2);
        pv3_02 = null;
        wu3_0 wu3_02 = null;
        int n10 = 764;
        int n14 = 0x6000000;
        int n15 = 6;
        vw_1.b((Function0)object4, lP12, null, null, null, null, null, null, u102, null, u103, (b30_0)object2, n14, n15, n10);
        CF2 cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object2 = wu3_02;
            object = lP1;
            string4 = string2;
            object4 = object3;
            wu3_02 = new wu3_0(lP1, string2, (String)object3, f6, n3, n4);
            cF2.d = wu3_02;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void j(LP1 lP1, String string2, long l2, long l3, tv0_0 tv0_02, RU0 rU0, int n3, Jj3 jj3, b30_0 b30_02, int n4, int n7) {
        Object object;
        Object object2;
        j30_0 j30_02;
        int n8;
        Object object3;
        int n10;
        RU0 rU02;
        int n14;
        int n15;
        Object object4;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        Object object5;
        Object object6;
        Object object7;
        int n22;
        int n24;
        Object object8;
        block30: {
            object8 = string2;
            n24 = n4;
            n22 = n7;
            object7 = "text";
            Intrinsics.checkNotNullParameter(string2, (String)object7);
            object6 = b30_02;
            object5 = b30_02.g(-1289303614);
            n21 = n7 & 1;
            if (n21 != 0) {
                n19 = n20 = n4 | 6;
                object6 = lP1;
            } else {
                n20 = n4 & 0xE;
                if (n20 == 0) {
                    object6 = lP1;
                    n19 = (int)(((j30_0)object5).J(lP1) ? 1 : 0);
                    n19 = n19 != 0 ? 4 : 2;
                    n19 |= n24;
                } else {
                    object6 = lP1;
                    n19 = n4;
                }
            }
            n18 = n24 & 0x70;
            if (n18 == 0) {
                n18 = (int)(((j30_0)object5).J(object8) ? 1 : 0);
                n18 = n18 != 0 ? 32 : 16;
                n19 |= n18;
            }
            if ((n18 = n24 & 0x380) == 0) {
                n18 = (int)(((j30_0)object5).d(l2) ? 1 : 0);
                n18 = n18 != 0 ? 256 : 128;
                n19 |= n18;
            }
            if ((n18 = n24 & 0x1C00) == 0) {
                n18 = (int)(((j30_0)object5).d(l3) ? 1 : 0);
                n18 = n18 != 0 ? 2048 : 1024;
                n19 |= n18;
            }
            n18 = n22 & 0x10;
            n17 = 57344;
            if (n18 != 0) {
                n19 |= 0x6000;
            } else {
                n16 = n24 & n17;
                if (n16 == 0) {
                    object4 = tv0_02;
                    n15 = (int)(((j30_0)object5).J(tv0_02) ? 1 : 0);
                    n15 = n15 != 0 ? 16384 : 8192;
                }
            }
            object4 = tv0_02;
            break block30;
            n19 |= n15;
        }
        n15 = n22 & 0x20;
        int n25 = 458752;
        if (n15 != 0) {
            n14 = 196608;
            n19 |= n14;
            rU02 = rU0;
        } else {
            n14 = n24 & n25;
            rU02 = rU0;
            if (n14 == 0) {
                n14 = (int)(((j30_0)object5).J(rU0) ? 1 : 0);
                n14 = n14 != 0 ? 131072 : 65536;
                n19 |= n14;
            }
        }
        n14 = 0x380000;
        int n26 = n24 & n14;
        if (n26 == 0) {
            n26 = n22 & 0x40;
            n17 = n3;
            n10 = n26 == 0 && (n10 = (int)(((j30_0)object5).c(n3) ? 1 : 0)) != 0 ? 0x100000 : 524288;
            n19 |= n10;
        } else {
            n17 = n3;
        }
        n20 = n22 & 0x80;
        if (n20 != 0) {
            n10 = 0xC00000;
            n19 |= n10;
            object3 = jj3;
        } else {
            n10 = n24 & 0x1C00000;
            object3 = jj3;
            if (n10 == 0) {
                n8 = ((j30_0)object5).J(jj3);
                n8 = n8 != 0 ? 0x800000 : 0x400000;
                n19 |= n8;
            }
        }
        n8 = 0x16DB6DB & n19;
        int n27 = 0x492492;
        if (n8 == n27 && (n27 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
            object6 = lP1;
            j30_02 = object5;
            object2 = object4;
            object = rU02;
            object4 = jj3;
        } else {
            nV0 nV02;
            Object object9;
            Object object10;
            Object object11;
            Object object12;
            ((j30_0)object5).r0();
            n27 = n24 & 1;
            n8 = -3670017;
            if (n27 != 0 && (n27 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                ((j30_0)object5).D();
                n21 = n22 & 0x40;
                if (n21 != 0) {
                    n19 &= n8;
                }
                object12 = lP1;
                object11 = jj3;
                n27 = n17;
                object10 = object4;
                object9 = rU02;
            } else {
                Object object13;
                object7 = n21 != 0 ? LP1$a.b : lP1;
                if (n18 != 0) {
                    n27 = 200;
                    object13 = new tv0_0(n27);
                } else {
                    object13 = object4;
                }
                object3 = n15 != 0 ? y20_0.a : rU02;
                n16 = n22 & 0x40;
                if (n16 != 0) {
                    n19 &= n8;
                    n8 = 0;
                    nV02 = null;
                } else {
                    n8 = n17;
                }
                if (n20 != 0) {
                    object6 = Jj3.b;
                    object12 = object7;
                    object11 = object6;
                } else {
                    object11 = jj3;
                    object12 = object7;
                }
                object10 = object13;
                object9 = object3;
                n27 = n8;
            }
            ((j30_0)object5).U();
            nV02 = new nV0(n27);
            n21 = n19 >> 3;
            n20 = n21 & 0xE;
            n18 = n19 << 3;
            n17 = n18 & 0x70;
            n21 = n21 & 0x380 | (n20 |= n17);
            n20 = n18 & 0x1C00;
            n21 |= n20;
            n20 = n19 >> 6;
            n19 = 57344;
            n21 |= (n20 &= n19);
            n20 = 0x70000 & n18;
            n21 |= n20;
            n20 = n18 & n14;
            n21 |= n20;
            n20 = 0xE000000 & n18;
            int n28 = n21 | n20;
            long l4 = 0L;
            n15 = 0;
            long l7 = 0L;
            n25 = 2;
            n14 = 0;
            n26 = 0;
            n10 = 0;
            int n29 = 48;
            int n30 = 128640;
            object7 = string2;
            object6 = object12;
            j30_02 = object5;
            object5 = nV02;
            object2 = object10;
            object = object9;
            object8 = object11;
            Ll3.b(string2, (LP1)object12, l3, l2, nV02, (tv0_0)object10, (RU0)object9, l4, (Jj3)object11, null, l7, n25, false, 0, 0, null, null, j30_02, n28, n29, n30);
            object4 = object11;
            n17 = n27;
        }
        CF2 cF2 = j30_02.X();
        if (cF2 != null) {
            tu3_0 tu3_02;
            object7 = tu3_02;
            n15 = n7;
            tu3_02 = new tu3_0((LP1)object6, string2, l2, l3, (tv0_0)object2, (RU0)object, n17, (Jj3)object4, n4, n7);
            cF2.d = tu3_02;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void k(boolean var0, String var1_1, String var2_2, String var3_3, boolean var4_4, Function0 var5_5, Function0 var6_6, b30_0 var7_7, int var8_8) {
        block32: {
            block33: {
                block31: {
                    block38: {
                        block37: {
                            block35: {
                                block36: {
                                    block34: {
                                        block30: {
                                            var9_9 = var0;
                                            var10_10 = var1_1;
                                            var11_11 = var2_2;
                                            var12_12 = var3_3;
                                            var13_13 = var4_4;
                                            var14_14 = var5_5;
                                            var15_15 = var6_6;
                                            var16_16 = var8_8;
                                            Intrinsics.checkNotNullParameter(var5_5, "onFollowButtonClicked");
                                            Intrinsics.checkNotNullParameter(var6_6, "onBrandClicked");
                                            var17_17 = -850516022;
                                            var18_18 = var7_7;
                                            var19_19 = var7_7.g(var17_17);
                                            var20_20 = var8_8 & 14;
                                            if (var20_20 == 0) {
                                                var20_20 = (int)var19_19.a(var0);
                                                if (var20_20 != 0) {
                                                    var20_20 = 4;
                                                    var21_21 = 5.6E-45f;
                                                } else {
                                                    var20_20 = 2;
                                                    var21_21 = 2.8E-45f;
                                                }
                                                var20_20 |= var16_16;
                                            } else {
                                                var20_20 = var8_8;
                                            }
                                            var22_22 = var16_16 & 112;
                                            if (var22_22 == 0) {
                                                var22_22 = (int)var19_19.J(var10_10);
                                                var22_22 = var22_22 != 0 ? 32 : 16;
                                                var20_20 |= var22_22;
                                            }
                                            if ((var22_22 = var16_16 & 896) == 0) {
                                                var22_22 = (int)var19_19.J(var11_11);
                                                var22_22 = var22_22 != 0 ? 256 : 128;
                                                var20_20 |= var22_22;
                                            }
                                            if ((var22_22 = var16_16 & 7168) == 0) {
                                                var22_22 = (int)var19_19.J(var12_12);
                                                var22_22 = var22_22 != 0 ? 2048 : 1024;
                                                var20_20 |= var22_22;
                                            }
                                            if ((var22_22 = 57344 & var16_16) == 0) {
                                                var22_22 = (int)var19_19.a(var13_13);
                                                var22_22 = var22_22 != 0 ? 16384 : 8192;
                                                var20_20 |= var22_22;
                                            }
                                            if ((var22_22 = var16_16 & (var23_23 = 458752)) == 0) {
                                                var22_22 = (int)var19_19.x(var14_14);
                                                var22_22 = var22_22 != 0 ? 131072 : 65536;
                                                var20_20 |= var22_22;
                                            }
                                            if ((var24_24 = var16_16 & (var22_22 = 0x380000)) == 0) {
                                                var24_24 = (int)var19_19.x(var15_15);
                                                var24_24 = var24_24 != 0 ? 0x100000 : 524288;
                                                var20_20 |= var24_24;
                                            }
                                            var25_25 = var20_20;
                                            var21_21 = 4.198194E-39f;
                                            var24_24 = 599186;
                                            if ((var20_20 &= 2995931) != var24_24 || (var20_20 = (int)var19_19.h()) == 0) break block30;
                                            var19_19.D();
                                            break block31;
                                        }
                                        var26_26 = LP1$a.b;
                                        var20_20 = 1065353216;
                                        var21_21 = 1.0f;
                                        var18_18 = j.c((LP1)var26_26, var21_21);
                                        var27_27 = Nc$a.k;
                                        var28_28 = iQ2.a(zp.f, (Gx$b)var27_27, (b30_0)var19_19, 54);
                                        var29_29 = var19_19.P;
                                        var30_30 = var19_19.P();
                                        var18_18 = a30_0.c((b30_0)var19_19, (LP1)var18_18);
                                        var31_31 = N20.W;
                                        var31_31.getClass();
                                        var32_32 = N20$a.b;
                                        var33_33 = var19_19.a;
                                        var34_34 = var27_27;
                                        var35_35 = var33_33 instanceof mp;
                                        if (!var35_35) break block32;
                                        var19_19.A();
                                        var35_35 = var19_19.O;
                                        if (var35_35) {
                                            var19_19.C((Function0)var32_32);
                                        } else {
                                            var19_19.n();
                                        }
                                        var27_27 = N20$a.e;
                                        Ow3.a((b30_0)var19_19, var28_28, (Function2)var27_27);
                                        var28_28 = N20$a.d;
                                        Ow3.a((b30_0)var19_19, var30_30, (Function2)var28_28);
                                        var30_30 = N20$a.f;
                                        var36_36 = var19_19.O;
                                        if (var36_36 || !(var9_9 = Intrinsics.areEqual(var12_12 = var19_19.v(), var37_37 = Integer.valueOf(var29_29)))) {
                                            rk_0.a(var29_29, (j30_0)var19_19, var29_29, (N20$a$a)var30_30);
                                        }
                                        var37_37 = N20$a.c;
                                        Ow3.a((b30_0)var19_19, var18_18, (Function2)var37_37);
                                        var12_12 = mq2_0.a;
                                        var20_20 = 1061997773;
                                        var21_21 = 0.8f;
                                        var18_18 = var12_12.a((LP1)var26_26, var21_21, true);
                                        var38_38 = zp.a;
                                        var39_39 = var26_26;
                                        var26_26 = Nc$a.j;
                                        var40_40 = 0;
                                        var41_41 = 0.0f;
                                        var26_26 = iQ2.a((zp$e)var38_38, (Gx$b)var26_26, (b30_0)var19_19, 0);
                                        var29_29 = var19_19.P;
                                        var14_14 = var19_19.P();
                                        var18_18 = a30_0.c((b30_0)var19_19, (LP1)var18_18);
                                        var16_16 = var33_33 instanceof mp;
                                        if (var16_16 == 0) break block33;
                                        var19_19.A();
                                        var16_16 = (int)var19_19.O;
                                        if (var16_16 != 0) {
                                            var19_19.C((Function0)var32_32);
                                        } else {
                                            var19_19.n();
                                        }
                                        Ow3.a((b30_0)var19_19, var26_26, (Function2)var27_27);
                                        Ow3.a((b30_0)var19_19, var14_14, (Function2)var28_28);
                                        var40_40 = var19_19.O;
                                        if (var40_40 != 0 || (var40_40 = Intrinsics.areEqual(var14_14 = var19_19.v(), var33_33 = Integer.valueOf(var29_29))) == 0) {
                                            rk_0.a(var29_29, (j30_0)var19_19, var29_29, (N20$a$a)var30_30);
                                        }
                                        Ow3.a((b30_0)var19_19, var18_18, (Function2)var37_37);
                                        var37_37 = "";
                                        var32_32 = var11_11 == null ? var37_37 : var11_11;
                                        var42_42 = uq0_0.y;
                                        var43_43 = nz_1.g;
                                        var14_14 = androidx.compose.ui.layout.a.b("brandImageComposable");
                                        var19_19.K(679860923);
                                        var16_16 = var25_25 & 0x380000;
                                        var45_44 = 0x100000;
                                        if (var16_16 == var45_44) {
                                            var20_20 = 1;
                                            var21_21 = 1.4E-45f;
                                        } else {
                                            var20_20 = 0;
                                            var21_21 = 0.0f;
                                            var18_18 = null;
                                        }
                                        var26_26 = var19_19.v();
                                        var38_38 = b30$a.a;
                                        if (var20_20 != 0 || var26_26 == var38_38) {
                                            var20_20 = 1;
                                            var21_21 = 1.4E-45f;
                                            var26_26 = new wc3_2(var15_15, var20_20);
                                            var19_19.o(var26_26);
                                        }
                                        var26_26 = (Function0)var26_26;
                                        var19_19.T(false);
                                        var18_18 = x20_0.d((LP1)var14_14, (Function0)var26_26);
                                        var46_45 = 0L;
                                        var48_46 = 0L;
                                        var24_24 = 0;
                                        var26_26 = null;
                                        var35_35 = false;
                                        var50_47 = 1600512;
                                        var51_48 = 932;
                                        var52_49 = var39_39;
                                        var28_28 = "Brand Image";
                                        var14_14 = var34_34;
                                        var53_50 = var38_38;
                                        var39_39 = var19_19;
                                        ov3.e((LP1)var18_18, (String)var32_32, false, var42_42, (String)var28_28, false, var43_43, 0.0f, var46_45, var48_46, (b30_0)var19_19, var50_47, var51_48);
                                        var27_27 = var52_49;
                                        var38_38 = var12_12.b(var52_49, var34_34);
                                        var40_40 = 10;
                                        var41_41 = var40_40;
                                        var54_51 = 0.0f;
                                        var55_52 = 0;
                                        var31_31 = null;
                                        var56_53 = 10;
                                        var57_54 = var41_41;
                                        var14_14 = h.i((LP1)var38_38, var41_41, 0.0f, var41_41, 0.0f, var56_53);
                                        var19_19.K(679869739);
                                        var20_20 = 0x100000;
                                        var21_21 = 1.469368E-39f;
                                        if (var16_16 == var20_20) {
                                            var29_29 = 1;
                                        } else {
                                            var29_29 = 0;
                                            var38_38 = null;
                                        }
                                        var33_33 = var19_19.v();
                                        if (var29_29 != 0) break block34;
                                        var38_38 = var53_50;
                                        if (var33_33 != var53_50) break block35;
                                        break block36;
                                    }
                                    var38_38 = var53_50;
                                }
                                var33_33 = new av3(var15_15);
                                var19_19.o(var33_33);
                            }
                            var33_33 = (Function0)var33_33;
                            var42_42 = 0.0f;
                            var30_30 = null;
                            var19_19.T(false);
                            var45_44 = 7;
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var18_18 = null;
                            var14_14 = d.b((LP1)var14_14, false, null, (Function0)var33_33, var45_44);
                            var26_26 = var10_10 == null ? var37_37 : var10_10;
                            var58_55 = nz_1.h;
                            var60_56 = oj3_2.f;
                            var33_33 = null;
                            var57_54 = 0.0f;
                            var22_22 = 0;
                            var32_32 = null;
                            var55_52 = 27648;
                            var56_53 = 98;
                            var18_18 = var14_14;
                            var40_40 = 7;
                            var41_41 = 9.8E-45f;
                            var62_57 = var60_56;
                            var14_14 = var27_27;
                            var64_58 = var38_38;
                            var54_51 = 0.0f;
                            ov3.c((LP1)var18_18, null, (String)var26_26, var60_56, var58_55, 0, null, (b30_0)var19_19, var55_52, var56_53);
                            var16_16 = 1;
                            var19_19.T((boolean)var16_16);
                            var20_20 = 1470633048;
                            var21_21 = 3.6961066E14f;
                            var19_19.K(var20_20);
                            if (!var13_13) break block37;
                            var12_12 = var12_12.a((LP1)var27_27, 0.2f, (boolean)var16_16);
                            var21_21 = 3.6973612E14f;
                            var19_19.K(1470636787);
                            var20_20 = var25_25 & var23_23;
                            var22_22 = 131072;
                            if (var20_20 == var22_22) {
                                var29_29 = 1;
                            } else {
                                var29_29 = 0;
                                var38_38 = null;
                            }
                            var18_18 = var19_19.v();
                            if (var29_29 != 0) ** GOTO lbl-1000
                            var32_32 = var64_58;
                            if (var18_18 != var64_58) {
                                var27_27 = var5_5;
                                var29_29 = 0;
                                var38_38 = null;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var27_27 = var5_5;
                                var29_29 = 0;
                                var38_38 = null;
                                var18_18 = new bv3(var5_5);
                                var19_19.o(var18_18);
                            }
                            var18_18 = (Function0)var18_18;
                            var19_19.T(false);
                            var22_22 = 0;
                            var32_32 = null;
                            var24_24 = 7;
                            var12_12 = d.b((LP1)var12_12, false, null, (Function0)var18_18, var24_24);
                            if (var0) {
                                var20_20 = 8;
                                var21_21 = 1.1E-44f;
lbl249:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var20_20 = 16;
                            var21_21 = 2.2E-44f;
                            ** while (true)
                            var21_21 = var20_20;
                            var22_22 = 0;
                            var32_32 = null;
                            var24_24 = 2;
                            var18_18 = g.d((LP1)var12_12, var21_21, 0.0f, var24_24);
                            if (var0) {
                                var12_12 = "Following";
lbl261:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var12_12 = "+ Follow";
                            ** while (true)
                            var26_26 = var12_12;
                            var60_56 = nz_1.c;
                            var62_57 = oj3_2.d;
                            var36_36 = false;
                            var12_12 = null;
                            var57_54 = 0.0f;
                            var22_22 = 0;
                            var32_32 = null;
                            var55_52 = 3072;
                            var56_53 = 98;
                            var16_16 = 0;
                            var33_33 = null;
                            var54_51 = 0.0f;
                            ov3.c((LP1)var18_18, null, (String)var26_26, var62_57, var60_56, 0, null, (b30_0)var19_19, var55_52, var56_53);
                            break block38;
                        }
                        var16_16 = 0;
                        var33_33 = null;
                    }
                    var19_19.T(false);
                    var36_36 = true;
                    var19_19.T(var36_36);
                    var26_26 = var3_3 == null ? var37_37 : var3_3;
                    var57_54 = uq0_0.q;
                    var54_51 = uq0_0.c;
                    var31_31 = null;
                    var34_34 = null;
                    var65_59 = 12;
                    var18_18 = h.i((LP1)var14_14, var54_51, var57_54, 0.0f, 0.0f, var65_59);
                    var62_57 = oj3_2.d;
                    var54_51 = 0.0f;
                    var22_22 = 0;
                    var32_32 = null;
                    var55_52 = 27648;
                    var56_53 = 98;
                    ov3.c((LP1)var18_18, null, (String)var26_26, var62_57, var58_55, 0, null, (b30_0)var19_19, var55_52, var56_53);
                }
                var18_18 = var19_19.X();
                if (var18_18 != null) {
                    var19_19 = var32_32;
                    var9_9 = var0;
                    var10_10 = var1_1;
                    var11_11 = var2_2;
                    var12_12 = var3_3;
                    var13_13 = var4_4;
                    var14_14 = var5_5;
                    var15_15 = var6_6;
                    var16_16 = var8_8;
                    var32_32 = new vu3_0(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var8_8);
                    var18_18.d = var32_32;
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void l(LP1 lP1, Object object, int n3, i70_0 i70_02, String string2, b30_0 b30_02, int n4, int n7) {
        Object object2;
        String string3;
        i70_0 i70_03;
        Object object3;
        LP1 lP12 = lP1;
        Object object4 = object;
        Object object5 = b30_02;
        Object object6 = b30_02.g(324919529);
        int n8 = n7 & 8;
        if (n8 != 0) {
            n8 = 0;
            object3 = null;
            i70_03 = null;
        } else {
            i70_03 = i70_02;
        }
        n8 = n7 & 0x10;
        if (n8 != 0) {
            object3 = "";
            string3 = object3;
        } else {
            string3 = string2;
        }
        object3 = AndroidCompositionLocals_androidKt.b;
        object3 = (Context)((j30_0)object6).j((H30)object3);
        object5 = new pe1$a_0((Context)object3);
        ((pe1$a_0)object5).c = object4;
        ((pe1$a_0)object5).b();
        Object object7 = B63.c;
        ((pe1$a_0)object5).d((B63)object7);
        object5 = ((pe1$a_0)object5).a();
        int n10 = 8;
        object5 = u63.a(object5, (b30_0)object6, n10);
        Object object8 = ((pq_0)object5).a();
        boolean bl2 = object8 instanceof pq$a$c;
        int n14 = 0;
        CF2 cF2 = null;
        int n15 = 57344;
        if ((bl2 || (bl2 = (object8 = ((pq_0)object5).a()) instanceof pq$a$b) || (bl2 = (object8 = ((pq_0)object5).a()) instanceof pq$a$a)) && object4 != null) {
            ((j30_0)object6).K(290251517);
            object5 = new pe1$a_0((Context)object3);
            ((pe1$a_0)object5).c = object3 = Integer.valueOf(n3);
            ((pe1$a_0)object5).b();
            ((pe1$a_0)object5).d((B63)object7);
            object3 = ((pe1$a_0)object5).a();
            object2 = u63.a(object3, (b30_0)object6, n10);
            n8 = 1;
            int n16 = 4;
            float f5 = 5.6E-45f;
            boolean bl3 = false;
            object7 = null;
            if (i70_03 == null) {
                n10 = 290507670;
                ((j30_0)object6).K(n10);
                f5 = n16;
                LP1 lP13 = h.g(lP12, 0.0f, f5, n8);
                n8 = n4 >> 9;
                int n17 = n8 & 0x70;
                int n18 = 120;
                Pd1.a((im2)object2, string3, lP13, null, null, 0.0f, null, (b30_0)object6, n17, n18);
                ((j30_0)object6).T(false);
            } else {
                n10 = 290685703;
                ((j30_0)object6).K(n10);
                f5 = n16;
                LP1 lP14 = h.g(lP12, 0.0f, f5, n8);
                n8 = n4 << 3 & n15;
                int n19 = n8 | 0x30;
                boolean bl4 = false;
                int n20 = 104;
                Pd1.a((im2)object2, null, lP14, null, i70_03, 0.0f, null, (b30_0)object6, n19, n20);
                ((j30_0)object6).T(false);
            }
            ((j30_0)object6).T(false);
            object2 = object6;
        } else {
            n8 = 290886614;
            ((j30_0)object6).K(n8);
            if (i70_03 == null) {
                ((j30_0)object6).K(290916963);
                n8 = n4 << 6 & 0x380;
                int n21 = n8 | 0x30;
                n15 = 0;
                boolean bl5 = false;
                n10 = 0;
                bl2 = false;
                object8 = null;
                int n22 = 120;
                object3 = object5;
                boolean bl6 = false;
                object5 = null;
                float f6 = 0.0f;
                object7 = lP1;
                Object var27_35 = null;
                n14 = n21;
                object2 = object6;
                int n24 = n22;
                Pd1.a((im2)object3, null, lP1, null, null, 0.0f, null, (b30_0)object6, n21, n22);
                ((j30_0)object6).T(false);
            } else {
                object2 = object6;
                Object var27_36 = null;
                ((j30_0)object6).K(291019046);
                n8 = n4 << 6 & 0x380 | 0x30;
                int n25 = n4 << 3 & n15;
                n14 = n8 | n25;
                n15 = 0;
                n25 = 0;
                n10 = 0;
                int n26 = 104;
                object3 = object5;
                boolean bl7 = false;
                object5 = null;
                float f7 = 0.0f;
                object7 = lP1;
                object8 = i70_03;
                Pd1.a((im2)object3, null, lP1, null, i70_03, 0.0f, null, (b30_0)object6, n14, n26);
                ((j30_0)object6).T(false);
            }
            ((j30_0)object2).T(false);
        }
        cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object3 = object6;
            object5 = lP1;
            object7 = object;
            n10 = n3;
            object8 = i70_03;
            cF2.d = object6 = new Hu3(lP1, object, n3, i70_03, string3, n4, n7);
        }
    }

    public static final void m(int n3, ft1_2 ft1_22, Function0 function0, b30_0 object, int n4) {
        int n7;
        Intrinsics.checkNotNullParameter(ft1_22, "lazyListState");
        Object object2 = "onItemViewed";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(738588793);
        int n8 = n4 & 0xE;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n4;
        }
        int n10 = n4 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).J(ft1_22) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        n10 = n4 & 0x380;
        int n14 = 256;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n10 = n8 & 0x2DB) == (n7 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            int n15;
            n10 = -1727980201;
            ((j30_0)object).K(n10);
            Object object3 = ((j30_0)object).v();
            b30$a$a b30$a$a = b30$a.a;
            if (object3 == b30$a$a) {
                n15 = 2;
                object3 = new Ca(ft1_22, n15);
                object3 = J83.e((Function0)object3);
                ((j30_0)object).o(object3);
            }
            object3 = (ib3_0)object3;
            n15 = 0;
            ((j30_0)object).T(false);
            object3 = (List)object3.getValue();
            Integer n16 = n3;
            n10 = (int)(object3.contains(n16) ? 1 : 0);
            if (n10 != 0) {
                object3 = Unit.a;
                int n17 = -1727975495;
                ((j30_0)object).K(n17);
                if ((n8 &= 0x380) == n14) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object2 = null;
                }
                Object object4 = ((j30_0)object).v();
                if (n8 != 0 || object4 == b30$a$a) {
                    n8 = 0;
                    object2 = null;
                    object4 = new ov3$b(function0, null);
                    ((j30_0)object).o(object4);
                }
                object4 = (Function2)object4;
                ((j30_0)object).T(false);
                ly0_0.d((b30_0)object, object3, (Function2)object4);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new cu3_0(n3, ft1_22, function0, n4);
        }
    }

    public static final void n(boolean bl2, String string2, Function0 function0, Function0 function02, b30_0 b30_02, int n3) {
        block19: {
            Object object;
            Object object2;
            Object object3;
            j30_0 j30_02;
            int n4;
            Object object4;
            Object object5;
            fx0_2 fx0_22;
            boolean bl3;
            block18: {
                boolean bl4;
                long l2;
                int n7;
                mp mp2;
                Object object6;
                Object object7;
                float f5;
                int n8;
                int n10;
                block21: {
                    Function0 function03;
                    block20: {
                        int n14;
                        int n15;
                        int n16;
                        j30_0 j30_03;
                        int n17;
                        block17: {
                            bl3 = bl2;
                            String string3 = string2;
                            function03 = function0;
                            fx0_22 = function02;
                            n17 = n3;
                            Intrinsics.checkNotNullParameter(string2, "title");
                            Intrinsics.checkNotNullParameter(function0, "onShareClicked");
                            object5 = "onLikeClicked";
                            Intrinsics.checkNotNullParameter(function02, (String)object5);
                            object4 = b30_02;
                            j30_03 = b30_02.g(-368043840);
                            n16 = n3 & 0xE;
                            if (n16 == 0) {
                                n16 = (int)(j30_03.a(bl2) ? 1 : 0);
                                n16 = n16 != 0 ? 4 : 2;
                                n16 |= n17;
                            } else {
                                n16 = n3;
                            }
                            n15 = n17 & 0x70;
                            if (n15 == 0) {
                                n15 = (int)(j30_03.J(string3) ? 1 : 0);
                                n15 = n15 != 0 ? 32 : 16;
                                n16 |= n15;
                            }
                            if ((n15 = n17 & 0x380) == 0) {
                                n15 = (int)(j30_03.x(function03) ? 1 : 0);
                                n15 = n15 != 0 ? 256 : 128;
                                n16 |= n15;
                            }
                            n15 = n17 & 0x1C00;
                            n14 = 2048;
                            if (n15 == 0) {
                                n15 = (int)(j30_03.x(fx0_22) ? 1 : 0);
                                n15 = n15 != 0 ? 2048 : 1024;
                                n16 |= n15;
                            }
                            if ((n15 = n16 & 0x16DB) != (n4 = 1170) || (n15 = (int)(j30_03.h() ? 1 : 0)) == 0) break block17;
                            j30_03.D();
                            j30_02 = j30_03;
                            break block18;
                        }
                        object4 = LP1$a.b;
                        n4 = 20;
                        float f6 = n4;
                        n10 = 0;
                        n8 = 0;
                        f5 = 0.0f;
                        object7 = object4;
                        object7 = h.i((LP1)object4, 0.0f, f6, 0.0f, 0.0f, 13);
                        object3 = Nc$a.k;
                        object2 = zp.a;
                        int n18 = 54;
                        object3 = iQ2.a((zp$e)object2, (Gx$b)object3, j30_03, n18);
                        int n19 = j30_03.P;
                        object6 = j30_03.P();
                        object7 = a30_0.c(j30_03, (LP1)object7);
                        N20.W.getClass();
                        Serializable serializable = N20$a.b;
                        mp2 = j30_03.a;
                        n7 = mp2 instanceof mp;
                        n17 = 0;
                        if (n7 == 0) break block19;
                        j30_03.A();
                        n7 = j30_03.O;
                        if (n7 != 0) {
                            j30_03.C((Function0)((Object)serializable));
                        } else {
                            j30_03.n();
                        }
                        serializable = N20$a.e;
                        Ow3.a(j30_03, object3, (Function2)((Object)serializable));
                        object3 = N20$a.d;
                        Ow3.a(j30_03, object6, (Function2)object3);
                        object3 = N20$a.f;
                        n18 = (int)(j30_03.O ? 1 : 0);
                        if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object6 = j30_03.v(), serializable = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                            rk_0.a(n19, j30_03, n19, (N20$a$a)object3);
                        }
                        object3 = N20$a.c;
                        Ow3.a(j30_03, object7, (Function2)object3);
                        n4 = bl3 ? R$drawable.ic_fleek_like_filed : R$drawable.ic_fleek_like_not_filled;
                        n7 = 0;
                        mp2 = null;
                        object7 = km2.a(n4, j30_03, 0);
                        l2 = nz_1.j;
                        f5 = -0.124340706f;
                        j30_03.K(-1107384745);
                        n8 = n16 & 0x1C00;
                        n10 = 1;
                        if (n8 == n14) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object = null;
                        }
                        object3 = j30_03.v();
                        object6 = b30$a.a;
                        if (n14 != 0 || object3 == object6) {
                            object3 = new qu3_0((Function0)fx0_22);
                            j30_03.o(object3);
                        }
                        object3 = (Function0)object3;
                        j30_03.T(false);
                        object3 = d.b((LP1)object4, false, null, (Function0)object3, 7);
                        Object object8 = object4;
                        object4 = object7;
                        object7 = object3;
                        Object object9 = object6;
                        object6 = j30_03;
                        n10 = 3128;
                        rc1_0.b((im2)object4, "like button", (LP1)object3, l2, j30_03, n10, 0);
                        f5 = uq0_0.f;
                        object7 = object8;
                        object4 = h.i((LP1)object8, f5, 0.0f, 0.0f, 0.0f, 14);
                        long l3 = oj3_2.c;
                        n7 = n16 << 3 & 0x380 | 0x6C06;
                        n14 = 0;
                        int n20 = 98;
                        n19 = n16;
                        object5 = object4;
                        object = string2;
                        int n21 = n16;
                        mp2 = null;
                        j30_02 = j30_03;
                        bl4 = false;
                        fx0_22 = null;
                        n17 = n20;
                        ov3.c((LP1)object4, null, string2, l3, l2, 0, null, j30_03, n7, n20);
                        n16 = R$drawable.ic_share_fleek;
                        n15 = 0;
                        object4 = null;
                        object5 = km2.a(n16, j30_03, 0);
                        f5 = uq0_0.o;
                        n18 = 0;
                        object6 = null;
                        n10 = 0;
                        serializable = null;
                        n19 = 0;
                        f6 = 0.0f;
                        object2 = null;
                        n7 = 14;
                        object = h.i((LP1)object8, f5, 0.0f, 0.0f, 0.0f, n7);
                        j30_03.K(-1107368600);
                        n4 = n21;
                        n4 = n21 & 0x380;
                        n8 = 256;
                        f5 = 3.59E-43f;
                        if (n4 == n8) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            mp2 = null;
                        }
                        object7 = j30_02.v();
                        if (n7 != 0) break block20;
                        object3 = object9;
                        if (object7 != object9) break block21;
                    }
                    object7 = new Xu3(function03);
                    j30_02.o(object7);
                }
                object7 = (Function0)object7;
                j30_02.T(false);
                n8 = 7;
                f5 = 9.8E-45f;
                object7 = d.b((LP1)object, false, null, (Function0)object7, n8);
                n7 = 0;
                mp2 = null;
                object = "share button";
                n10 = 3128;
                object4 = object5;
                object6 = j30_02;
                rc1_0.b((im2)object5, (String)object, (LP1)object7, l2, j30_02, n10, 0);
                bl4 = true;
                j30_02.T(bl4);
            }
            object3 = j30_02.X();
            if (object3 != null) {
                fx0_22 = object2;
                bl3 = bl2;
                object5 = string2;
                object4 = function0;
                object = function02;
                n4 = n3;
                ((CF2)object3).d = object2 = new Yu3(bl2, string2, function0, function02, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void o(int n3, LP1 lP1, dr0_0 dr0_02, i70_0 i70_02, b30_0 b30_02, int n4) {
        dr0_0 dr0_03 = dr0_02;
        int n7 = n4;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n8 = 1455688889;
        Object object = b30_02;
        Object object2 = b30_02.g(n8);
        i70$a$a i70$a$a = i70$a.a;
        object = new fC1$e(n3);
        object = sI2.c((fc1_0)object, (b30_0)object2, 0);
        Object object3 = (QB1)((ec1_0)object).getValue();
        int n10 = -1 >>> 1;
        int n14 = 956;
        object3 = nk_0.a((QB1)object3, true, 0.0f, n10, (b30_0)object2, n14);
        int n15 = 1113485842;
        ((j30_0)object2).K(n15);
        Object object4 = ((j30_0)object2).v();
        Object object5 = b30$a.a;
        if (object4 == object5) {
            n10 = 2;
            object4 = new kf_2(object3, n10);
            object4 = J83.e((Function0)object4);
            ((j30_0)object2).o(object4);
        }
        Object object6 = object4;
        object6 = (ib3_0)object4;
        ((j30_0)object2).T(false);
        object = (QB1)((ec1_0)object).getValue();
        ((j30_0)object2).K(1113492292);
        n15 = (int)(((j30_0)object2).J(object3) ? 1 : 0);
        Object object7 = ((j30_0)object2).v();
        if (n15 != 0 || object7 == object5) {
            n15 = 1;
            object7 = new g22_0(object3, n15);
            ((j30_0)object2).o(object7);
        }
        object4 = object7;
        object4 = (Function0)object7;
        ((j30_0)object2).T(false);
        int n16 = n7 & 0x380 | 8;
        int n17 = n7 >> 9;
        int n18 = n17 & 0x70;
        n10 = 0;
        object7 = null;
        n14 = 0;
        int n19 = 129016;
        object3 = object;
        object5 = lP1;
        HB1.b((QB1)object, (Function0)object4, lP1, false, false, false, false, null, false, null, null, i70$a$a, false, false, null, null, false, (b30_0)object2, n16, n18, n19);
        object = object6.getValue();
        n15 = 0;
        object4 = null;
        object3 = new qv3_0(null, dr0_03);
        ly0_0.d((b30_0)object2, object, (Function2)object3);
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = object4;
            dr0_03 = dr0_02;
            n7 = n4;
            ((CF2)object3).d = object4 = new Gu3(n3, lP1, dr0_02, i70$a$a, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void p(LP1 lP1, u10 u102, b30_0 object, int n3) {
        block18: {
            Object object2;
            block17: {
                void var9_18;
                int n7;
                int n8;
                int n10;
                Object object3;
                float f5;
                block16: {
                    boolean bl2;
                    int n4;
                    f5 = uq0_0.k;
                    object3 = "content";
                    Intrinsics.checkNotNullParameter(u102, (String)object3);
                    object = object.g(616771665);
                    n10 = n3 & 0xE;
                    if (n10 == 0) {
                        n10 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        n10 = n10 != 0 ? 4 : 2;
                        n10 |= n3;
                    } else {
                        n10 = n3;
                    }
                    n8 = n3 & 0x70;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).x(u102) ? 1 : 0);
                        n8 = n8 != 0 ? 32 : 16;
                        n10 |= n8;
                    }
                    n8 = n3 & 0x380;
                    n7 = 256;
                    if (n8 == 0) {
                        void var9_12;
                        boolean n42 = ((j30_0)object).b(f5);
                        if (n42) {
                            int n14 = 256;
                            f5 = 3.59E-43f;
                        } else {
                            int n15 = 128;
                            f5 = 1.8E-43f;
                        }
                        n10 |= var9_12;
                    }
                    if ((n4 = n10 & 0x2DB) != (n8 = 146) || !(bl2 = ((j30_0)object).h())) break block16;
                    ((j30_0)object).D();
                    break block17;
                }
                f5 = -8.1848643E36f;
                ((j30_0)object).K(-54195425);
                int n16 = n10 & 0x380;
                n8 = 0;
                Object object4 = null;
                boolean bl3 = true;
                if (n16 == n7) {
                    boolean bl4 = true;
                    f5 = Float.MIN_VALUE;
                } else {
                    boolean bl5 = false;
                    f5 = 0.0f;
                    object2 = null;
                }
                Object object5 = ((j30_0)object).v();
                if (var9_18 != false || object5 == (object2 = b30$a.a)) {
                    f5 = uq0_0.k;
                    object5 = new Object();
                    ((j30_0)object).o(object5);
                }
                object5 = (al1_1)object5;
                ((j30_0)object).T(false);
                int n17 = n10 >> 3 & 0xE;
                n10 = n10 << 3 & 0x70;
                int n18 = n17 | n10;
                n10 = ((j30_0)object).P;
                object4 = ((j30_0)object).P();
                LP1 lP12 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                int n19 = n18 << 6 & 0x380 | 6;
                mp mp2 = ((j30_0)object).a;
                boolean bl6 = mp2 instanceof mp;
                if (!bl6) break block18;
                ((j30_0)object).A();
                bl6 = ((j30_0)object).O;
                if (bl6) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                object4 = N20$a.f;
                n7 = (int)(((j30_0)object).O ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object).v(), serializable = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object4);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, lP12, (Function2)object3);
                int n20 = n19 >> 6 & 0xE;
                object2 = n20;
                u102.invoke(object, object2);
                ((j30_0)object).T(bl3);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                object2 = new zu3_0(lP1, u102, n3);
                ((CF2)object).d = object2;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void q(int n3, ft1_2 ft1_22, Function0 function0, b30_0 object, int n4) {
        int n7;
        float f5;
        Intrinsics.checkNotNullParameter(ft1_22, "lazyListState");
        Object object2 = "onItemViewed";
        Intrinsics.checkNotNullParameter(function0, (String)object2);
        object = object.g(506872380);
        int n8 = n4 & 0xE;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n4;
        }
        int n10 = n4 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).J(ft1_22) ? 1 : 0);
            if (n10 != 0) {
                n10 = 32;
                f5 = 4.5E-44f;
            } else {
                n10 = 16;
                f5 = 2.2E-44f;
            }
            n8 |= n10;
        }
        n10 = n4 & 0x380;
        int n14 = 256;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            if (n10 != 0) {
                n10 = 256;
                f5 = 3.59E-43f;
            } else {
                n10 = 128;
                f5 = 1.8E-43f;
            }
            n8 |= n10;
        }
        if ((n10 = n4 & 0x1C00) == 0) {
            f5 = 50.0f;
            n10 = (int)(((j30_0)object).b(f5) ? 1 : 0);
            if (n10 != 0) {
                n10 = 2048;
                f5 = 2.87E-42f;
            } else {
                n10 = 1024;
                f5 = 1.435E-42f;
            }
            n8 |= n10;
        }
        if ((n10 = n8 & 0x16DB) == (n7 = 1170) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n10 = 1764620160;
            f5 = 1.314456E25f;
            ((j30_0)object).K(n10);
            Object object3 = ((j30_0)object).v();
            b30$a$a b30$a$a = b30$a.a;
            if (object3 == b30$a$a) {
                object3 = new du3_0(ft1_22);
                object3 = J83.e((Function0)object3);
                ((j30_0)object).o(object3);
            }
            object3 = (ib3_0)object3;
            ((j30_0)object).T(false);
            object3 = (List)object3.getValue();
            Integer n15 = n3;
            n10 = (int)(object3.contains(n15) ? 1 : 0);
            if (n10 != 0) {
                object3 = Unit.a;
                int n16 = 1764625362;
                ((j30_0)object).K(n16);
                if ((n8 &= 0x380) == n14) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object2 = null;
                }
                Object object4 = ((j30_0)object).v();
                if (n8 != 0 || object4 == b30$a$a) {
                    n8 = 0;
                    object2 = null;
                    object4 = new tv3(function0, null);
                    ((j30_0)object).o(object4);
                }
                object4 = (Function2)object4;
                ((j30_0)object).T(false);
                ly0_0.d((b30_0)object, object3, (Function2)object4);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new Eu3(n3, ft1_22, function0, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void r(String string2, ud_2 ud_22, LP1 lP1, vd_2 vd_22, b30_0 object, int n3) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        float f5;
        Object object7 = string2;
        Object object8 = ud_22;
        Object object9 = lP1;
        Object object10 = vd_22;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(string2, "query");
        Intrinsics.checkNotNullParameter(ud_22, "onQueryChanged");
        Object object11 = "onSearchClicked";
        Intrinsics.checkNotNullParameter(vd_22, (String)object11);
        Object object12 = object;
        j30_0 j30_02 = object.g(-1337414349);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(j30_02.J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n8 = n4 & 0x70;
        if (n8 == 0) {
            n8 = (int)(j30_02.x(object8) ? 1 : 0);
            if (n8 != 0) {
                n8 = 32;
                f5 = 4.5E-44f;
            } else {
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n7 |= n8;
        }
        if ((n8 = n4 & 0x380) == 0) {
            n8 = (int)(j30_02.J(object9) ? 1 : 0);
            if (n8 != 0) {
                n8 = 256;
                f5 = 3.59E-43f;
            } else {
                n8 = 128;
                f5 = 1.8E-43f;
            }
            n7 |= n8;
        }
        if ((n8 = n4 & 0x1C00) == 0) {
            n8 = (int)(j30_02.x(object10) ? 1 : 0);
            if (n8 != 0) {
                n8 = 2048;
                f5 = 2.87E-42f;
            } else {
                n8 = 1024;
                f5 = 1.435E-42f;
            }
            n7 |= n8;
        }
        int n10 = n7;
        n8 = 1170;
        f5 = 1.64E-42f;
        if ((n7 &= 0x16DB) == n8 && (n7 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object11 = j30_02;
        } else {
            double d2;
            double d5;
            float f6;
            double d7;
            double d9;
            double d12;
            double d13;
            double d14;
            float f7;
            double d15;
            double d16;
            yo1_0 yo1_02;
            Object object13 = LP1$a.b;
            object11 = O30.g;
            Object object14 = object11 = j30_02.j((H30)object11);
            object14 = (YT0)object11;
            long l2 = nz_1.a;
            object6 = fg2_1.a;
            object11 = a.b((LP1)object9, l2, (i13)object6);
            object12 = Nc$a.a;
            int n14 = 0;
            float f8 = 0.0f;
            object12 = HA.e((Nc)object12, false);
            int n15 = j30_02.P;
            object5 = j30_02.P();
            object11 = a30_0.c(j30_02, (LP1)object11);
            N20$a n20$a = N20.W;
            n20$a.getClass();
            object4 = N20$a.b;
            object3 = j30_02.a;
            boolean bl2 = object3 instanceof mp;
            if (!bl2) {
                s20.a();
                throw null;
            }
            j30_02.A();
            bl2 = j30_02.O;
            if (bl2) {
                j30_02.C((Function0)object4);
            } else {
                j30_02.n();
            }
            object4 = N20$a.e;
            Ow3.a(j30_02, object12, (Function2)object4);
            object12 = N20$a.d;
            Ow3.a(j30_02, object5, (Function2)object12);
            object12 = N20$a.f;
            n14 = j30_02.O;
            if (n14 != 0 || (n14 = Intrinsics.areEqual(object5 = j30_02.v(), object4 = Integer.valueOf(n15))) == 0) {
                rk_0.a(n15, j30_02, n15, (N20$a$a)object12);
            }
            object12 = N20$a.c;
            Ow3.a(j30_02, object11, (Function2)object12);
            Object object15 = Boolean.TRUE;
            int n16 = 3;
            int n17 = 2;
            int n18 = 3;
            Object object16 = yo1_02;
            yo1_02 = new yo1_0(n16, (Boolean)object15, n17, n18, null, null);
            n8 = 1;
            f5 = Float.MIN_VALUE;
            object11 = object3;
            object2 = ud_22;
            object5 = string2;
            object9 = object6;
            object6 = vd_22;
            object3 = new yb0_1(n8, ud_22, string2, vd_22, object14);
            n7 = 47;
            object4 = new wo1_0((yb0_1)object3, n7);
            object11 = ck3.a;
            l2 = OX.f;
            long l3 = nz_1.s;
            long l4 = OX.k;
            object2 = w60_0.a;
            object5 = (OX)j30_02.j((H30)object2);
            long l7 = ((OX)object5).a;
            object14 = mz_0.a;
            object3 = (lZ)j30_02.j((H30)object14);
            bl2 = ((lZ)object3).i();
            if (bl2) {
                zx_0.h(l7);
            } else {
                zx_0.h(l7);
            }
            n14 = 1052938076;
            f8 = 0.38f;
            long l8 = OX.b(l2, f8);
            long l12 = ((lZ)j30_02.j((H30)object14)).c();
            long l14 = ((lZ)j30_02.j((H30)object14)).c();
            object6 = (OX)j30_02.j((H30)object2);
            l7 = ((OX)object6).a;
            object3 = (lZ)j30_02.j((H30)object14);
            bl2 = ((lZ)object3).i();
            if (bl2) {
                zx_0.h(l7);
            } else {
                zx_0.h(l7);
            }
            n14 = 1052938076;
            f8 = 0.38f;
            long l15 = OX.b(l2, f8);
            object5 = (OX)j30_02.j((H30)object2);
            l7 = ((OX)object5).a;
            object3 = (lZ)j30_02.j((H30)object14);
            bl2 = ((lZ)object3).i();
            if (bl2) {
                zx_0.h(l7);
            } else {
                zx_0.h(l7);
            }
            n14 = 1052938076;
            f8 = 0.38f;
            long l16 = OX.b(l2, f8);
            long l17 = ((lZ)j30_02.j((H30)object14)).c();
            object5 = (lZ)j30_02.j((H30)object14);
            l7 = ((lZ)object5).f();
            object3 = (OX)j30_02.j((H30)object2);
            object16 = object4;
            long l18 = ((OX)object3).a;
            Object object17 = (lZ)j30_02.j((H30)object14);
            n16 = (int)(((lZ)object17).i() ? 1 : 0);
            double d17 = 0.5;
            f7 = (n16 != 0 ? (n16 = (int)((d16 = (d15 = (double)(f7 = zx_0.h(l18))) - d17) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1))) > 0 : (n16 = (int)((d14 = (d15 = (double)(f7 = zx_0.h(l18))) - d17) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1))) < 0) ? 1.0f : 0.87f;
            long l19 = OX.b(l7, f7);
            object5 = (lZ)j30_02.j((H30)object14);
            l7 = ((lZ)object5).e();
            object4 = (OX)j30_02.j((H30)object2);
            l18 = ((OX)object4).a;
            object17 = (lZ)j30_02.j((H30)object14);
            n16 = (int)(((lZ)object17).i() ? 1 : 0);
            n18 = 1058642330;
            f7 = (n16 != 0 ? (n16 = (int)((d13 = (d15 = (double)(f7 = zx_0.h(l18))) - d17) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1))) > 0 : (n16 = (int)((d12 = (d15 = (double)(f7 = zx_0.h(l18))) - d17) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1))) < 0) ? 0.74f : 0.6f;
            l7 = OX.b(l7, f7);
            object4 = (OX)j30_02.j((H30)object2);
            l18 = ((OX)object4).a;
            object17 = (lZ)j30_02.j((H30)object14);
            n16 = (int)(((lZ)object17).i() ? 1 : 0);
            if (n16 != 0) {
                zx_0.h(l18);
            } else {
                zx_0.h(l18);
            }
            f7 = 0.38f;
            long l20 = OX.b(l7, f7);
            long l21 = ((lZ)j30_02.j((H30)object14)).c();
            object4 = (lZ)j30_02.j((H30)object14);
            l18 = ((lZ)object4).e();
            Object object18 = object17 = j30_02.j((H30)object2);
            long l22 = ((OX)object17).a;
            object18 = (lZ)j30_02.j((H30)object14);
            n4 = (int)(((lZ)object18).i() ? 1 : 0);
            if (n4 != 0 ? (n4 = (int)((d9 = (d7 = (double)(f6 = zx_0.h(l22))) - d17) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1))) > 0 : (n4 = (int)((d5 = (d2 = (double)(f6 = zx_0.h(l22))) - d17) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) < 0) {
                n4 = 1060991140;
                f6 = 0.74f;
            } else {
                n4 = 1058642330;
                f6 = 0.6f;
            }
            l18 = OX.b(l18, f6);
            l22 = ((OX)j30_02.j((H30)object2)).a;
            object2 = (lZ)j30_02.j((H30)object14);
            n15 = (int)(((lZ)object2).i() ? 1 : 0);
            if (n15 != 0) {
                zx_0.h(l22);
            } else {
                zx_0.h(l22);
            }
            n15 = 1052938076;
            float f11 = 0.38f;
            long l23 = OX.b(l18, f11);
            object17 = new ln0(l2, l8, l2, l12, l4, l4, l14, l4, l2, l15, l2, l2, l16, l17, l3, l19, l7, l20, l21, l18, l23);
            object11 = j.c((LP1)object13, 1.0f);
            f5 = uq0_0.k;
            f11 = uq0_0.g;
            f8 = uq0_0.a;
            object11 = h.h((LP1)object11, f5, f11, f5, f11);
            long l24 = zx_0.d(4279967523L);
            object11 = a.b((LP1)object11, l24, (i13)object9);
            f5 = uq0_0.b;
            long l25 = nz_1.u;
            float f12 = uq0_0.e;
            object6 = SP2.a(f12);
            object2 = gz.a((LP1)object11, f5, l25, (i13)object6);
            j30_02.K(-223166551);
            n7 = n10 & 0x70;
            n8 = 32;
            f5 = 4.5E-44f;
            if (n7 == n8) {
                n14 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n14 = 0;
                f8 = 0.0f;
                object5 = null;
            }
            object11 = j30_02.v();
            if (n14 != 0 || object11 == (object12 = b30$a.a)) {
                n8 = 2;
                f5 = 2.8E-45f;
                object11 = new db_1(object8, n8);
                j30_02.o(object11);
            }
            object12 = object11;
            object12 = (Function1)object11;
            j30_02.T(false);
            object3 = q20_0.b;
            object13 = q20_0.c;
            object10 = string2;
            object11 = new uv3(string2, (ud_2)object8);
            object11 = v10.c(835707818, (fx0_2)object11, j30_02);
            n14 = n10;
            Object object19 = object11;
            n17 = n10 & 0xE | 0x36C00000;
            n20$a = null;
            n14 = 0;
            f8 = 0.0f;
            object5 = null;
            f12 = 0.0f;
            object6 = null;
            object14 = null;
            f7 = 0.0f;
            object4 = null;
            object18 = j30_02;
            j30_02 = null;
            object = object18;
            n4 = 0;
            object18 = null;
            f6 = 0.0f;
            boolean bl3 = true;
            n7 = 0;
            object15 = object9;
            object9 = null;
            n18 = 100688256;
            object11 = string2;
            object8 = yo1_02;
            object7 = object16;
            object16 = object15;
            object15 = object;
            ov3.s(string2, (Function1)object12, (LP1)object2, false, false, null, null, (Function2)object3, (Function2)object13, (Function2)object19, false, null, yo1_02, (wo1_0)object7, bl3, 0, 0, null, (i13)object16, (ln0)object17, (b30_0)object, n17, n18);
            object11 = object;
            n8 = 1;
            f5 = Float.MIN_VALUE;
            ((j30_0)object).T(n8 != 0);
        }
        object4 = ((j30_0)object11).X();
        if (object4 != null) {
            object11 = object3;
            object12 = string2;
            object2 = ud_22;
            object5 = lP1;
            object6 = vd_22;
            object3 = new Ou3(string2, ud_22, lP1, vd_22, n3);
            ((CF2)object4).d = object3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void s(String string2, Function1 function1, LP1 lP1, boolean bl2, boolean bl3, xm3 xm32, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean n3, EE3 eE3, yo1_0 yo1_02, wo1_0 wo1_02, boolean n4, int n7, int n8, wr1_1 wr1_12, i13 i132, ln0 ln02, b30_0 b30_02, int n10, int n14) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n15;
        int n16;
        int n17;
        Object object5;
        int n18;
        Object object6 = string2;
        Object object7 = function1;
        Object object8 = lP1;
        boolean bl4 = n4;
        Object object9 = i132;
        Object object10 = ln02;
        int n19 = n10;
        int n20 = n14;
        Intrinsics.checkNotNullParameter(string2, "value");
        Object object11 = "onValueChange";
        Intrinsics.checkNotNullParameter(function1, (String)object11);
        Object object12 = b30_02;
        Object object13 = b30_02.g(110521266);
        int n21 = n10 & 0xE;
        if (n21 == 0) {
            n21 = (int)(((j30_0)object13).J(string2) ? 1 : 0);
            n21 = n21 != 0 ? 4 : 2;
            n21 |= n19;
        } else {
            n21 = n10;
        }
        int n22 = n19 & 0x70;
        if (n22 == 0) {
            n22 = (int)(((j30_0)object13).x(object7) ? 1 : 0);
            n22 = n22 != 0 ? 32 : 16;
            n21 |= n22;
        }
        n22 = n19 & 0x380;
        int n24 = 256;
        float f5 = 3.59E-43f;
        if (n22 == 0) {
            n22 = (int)(((j30_0)object13).J(object8) ? 1 : 0);
            n22 = n22 != 0 ? 256 : 128;
            n21 |= n22;
        }
        n22 = n21 | 0x6C00;
        int n25 = 458752;
        float f6 = 6.42848E-40f;
        int n26 = n19 & n25;
        if (n26 == 0) {
            n22 = 0x16C00 | n21;
        }
        n21 = 0x180000 | n22;
        int n27 = 0x1C00000;
        n22 = n19 & n27;
        Object object14 = function22;
        if (n22 == 0) {
            n22 = (int)(((j30_0)object13).x(function22) ? 1 : 0);
            n22 = n22 != 0 ? 0x800000 : 0x400000;
            n21 |= n22;
        }
        int n28 = 0xE000000;
        n22 = n19 & n28;
        n26 = 0x2000000;
        int n29 = 0x4000000;
        if (n22 == 0) {
            object12 = function23;
            n18 = (int)(((j30_0)object13).x(function23) ? 1 : 0);
            n18 = n18 != 0 ? 0x4000000 : 0x2000000;
            n21 |= n18;
        } else {
            object12 = function23;
        }
        n18 = 0x70000000;
        int n30 = n19 & n18;
        int n32 = 0x10000000;
        Object object15 = function24;
        if (n30 == 0) {
            n30 = (int)(((j30_0)object13).x(function24) ? 1 : 0);
            n30 = n30 != 0 ? 0x20000000 : 0x10000000;
            n21 |= n30;
        }
        n30 = n20 | 0x36;
        int n34 = n20 & 0x380;
        if (n34 == 0) {
            object5 = yo1_02;
            n17 = ((j30_0)object13).J(yo1_02);
            if (n17 == 0) {
                n24 = 128;
                f5 = 1.8E-43f;
            }
            n30 |= n24;
        } else {
            object5 = yo1_02;
        }
        n24 = n20 & 0x1C00;
        if (n24 == 0) {
            n16 = ((j30_0)object13).J(wo1_02);
            n16 = n16 != 0 ? 2048 : 1024;
            n30 |= n16;
        }
        if ((n16 = n20 & 0xE000) == 0) {
            n16 = (int)(((j30_0)object13).a(bl4) ? 1 : 0);
            n16 = n16 != 0 ? 16384 : 8192;
            n30 |= n16;
        }
        if ((n16 = n20 & 0x70000) == 0) {
            n16 = 65536;
            n30 |= n16;
        }
        n30 |= 0xD80000;
        n16 = n20 & n28;
        if (n16 == 0) {
            n16 = (int)(((j30_0)object13).J(object9) ? 1 : 0);
            if (n16 != 0) {
                n26 = 0x4000000;
            }
            n30 |= n26;
        }
        if ((n26 = n20 & n18) == 0) {
            n26 = (int)(((j30_0)object13).J(object10) ? 1 : 0);
            if (n26 != 0) {
                n32 = 0x20000000;
            }
            n30 |= n32;
        }
        if ((n22 = n21 & (n26 = 1533916891)) == (n34 = 306783378) && (n22 = n30 & n26) == n34 && (n22 = (int)(((j30_0)object13).h() ? 1 : 0)) != 0) {
            ((j30_0)object13).D();
            n25 = (int)(bl2 ? 1 : 0);
            n26 = (int)(bl3 ? 1 : 0);
            object14 = xm32;
            n15 = n3;
            object4 = eE3;
            n27 = n7;
            n28 = n8;
            object3 = wr1_12;
            object2 = object13;
            object13 = function2;
        } else {
            long l2;
            long l3;
            Object object16;
            Object object17;
            int n35;
            Object object18;
            Function2 function25;
            ((j30_0)object13).r0();
            n22 = n19 & 1;
            n29 = -458753;
            if (n22 != 0 && (n22 = (int)(((j30_0)object13).c0() ? 1 : 0)) == 0) {
                ((j30_0)object13).D();
                n21 &= n29;
                n22 = n30 & n29;
                n26 = (int)(bl2 ? 1 : 0);
                n32 = (int)(bl3 ? 1 : 0);
                object5 = xm32;
                function25 = function2;
                object18 = eE3;
                n17 = n7;
                n35 = n8;
                object17 = wr1_12;
                n29 = n21;
                n18 = n22;
                n22 = n3;
            } else {
                object12 = Ll3.a;
                object12 = (xm3)((j30_0)object13).j((H30)object12);
                n21 &= n29;
                object = EE3$a.a;
                n32 = bl4 ? 1 : -1 >>> 1;
                n29 = n30 & n29;
                n26 = -206962047;
                ((j30_0)object13).K(n26);
                object16 = ((j30_0)object13).v();
                object5 = b30$a.a;
                if (object16 == object5) {
                    object16 = new xr1_1();
                    ((j30_0)object13).o(object16);
                }
                object5 = object16;
                object5 = (wr1_1)object16;
                ((j30_0)object13).T(false);
                object16 = null;
                object17 = object5;
                function25 = null;
                object18 = object;
                n17 = n32;
                n26 = 1;
                n32 = 0;
                n35 = 1;
                object5 = object12;
                n18 = n29;
                n22 = 0;
                object12 = null;
                n29 = n21;
            }
            ((j30_0)object13).U();
            ((j30_0)object13).K(-206952652);
            long l4 = ((xm3)object5).b();
            long l7 = 16;
            n21 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
            if (n21 != 0) {
                l3 = l4;
            } else {
                object11 = (OX)((ln0)object10).g(n26 != 0, (b30_0)object13).getValue();
                l3 = l2 = ((OX)object11).a;
            }
            n21 = 0;
            object11 = null;
            ((j30_0)object13).T(false);
            long l8 = 0L;
            long l12 = 0L;
            long l14 = 0L;
            int n36 = 0xFFFFFE;
            Object object19 = object11;
            object11 = new xm3(l3, l12, null, null, l14, null, 0, l8, n36);
            object2 = ((xm3)object5).d((xm3)object11);
            if (function25 != null) {
                object11 = new Object();
                n24 = 1;
                f5 = Float.MIN_VALUE;
                object11 = CY2.b((LP1)object8, n24 != 0, (Function1)object11);
            } else {
                object11 = object8;
            }
            l2 = ((OX)((ln0)object10).a((b30_0)object13).getValue()).a;
            object11 = a.b((LP1)object11, l2, (i13)object9);
            f5 = ck3.b;
            f6 = uq0_0.m;
            object19 = j.a((LP1)object11, f5, f6);
            object11 = (OX)((ln0)object10).b(n22 != 0, (b30_0)object13).getValue();
            n24 = n22;
            long l15 = ((OX)object11).a;
            object15 = new i93_0(l15);
            object11 = object12;
            int n37 = n22;
            object12 = string2;
            Object object20 = object5;
            n34 = n26;
            object7 = object11;
            n24 = n4;
            Object object21 = object15;
            object15 = object18;
            int n38 = n26;
            object16 = object17;
            object6 = object13;
            object13 = function25;
            object10 = function24;
            object9 = ln02;
            object4 = i132;
            object11 = new wv3(string2, n26 != 0, n4 != 0, (EE3)object18, (wr1_1)object17, n22 != 0, function25, function22, function23, function24, ln02, i132);
            object8 = v10.c(2032717999, (fx0_2)object11, (b30_0)object6);
            n21 = n29 & 0xFC7E;
            n22 = n18 << 12;
            n34 = 0x380000 & n22;
            n21 |= n34;
            n34 = n22 & n27;
            n22 &= n28;
            n28 = (n21 |= n34) | n22;
            n21 = n18 >> 18 & 0xE | 0x30000;
            n22 = n18 & 0x70;
            n21 |= n22;
            n22 = n18 >> 12 & 0x1C00;
            n29 = n21 | n22;
            n18 = 4096;
            bl4 = false;
            object11 = string2;
            object12 = function1;
            object5 = object19;
            n24 = n26;
            n25 = n32;
            object16 = object2;
            object14 = yo1_02;
            object13 = wo1_02;
            n20 = n4;
            n19 = n17;
            object9 = object18;
            object7 = object17;
            object2 = object6;
            object6 = object21;
            cx_0.a(string2, function1, (LP1)object19, n26 != 0, n32 != 0, (xm3)object16, yo1_02, wo1_02, n4 != 0, n17, n35, (EE3)object18, null, (wr1_1)object17, (ZD)object21, (gx0_2)object8, (b30_0)object2, n28, n29, n18);
            n26 = n32;
            object13 = function25;
            object4 = object18;
            n27 = n17;
            n28 = n35;
            object3 = object17;
            n15 = n37;
            object14 = object20;
            n25 = n38;
        }
        object8 = ((j30_0)object2).X();
        if (object8 != null) {
            object11 = object6;
            object12 = string2;
            object5 = function1;
            object10 = function24;
            object7 = yo1_02;
            Object object22 = object6;
            object6 = wo1_02;
            object = i132;
            object2 = ln02;
            n32 = n10;
            object12 = object11 = new ru3_0(string2, function1, lP1, n25 != 0, n26 != 0, (xm3)object14, (Function2)object13, function22, function23, function24, n15 != 0, (EE3)object4, yo1_02, wo1_02, n4 != 0, n27, n28, (wr1_1)object3, i132, ln02, n10, n14);
            object11 = object8;
            ((CF2)object8).d = object22;
        }
    }

    public static final void t(LP1 lP1, String string2, float f5, long l2, float f6, long l3, long l4, b30_0 b30_02, int n3) {
        block18: {
            block22: {
                Object object;
                Object object2;
                long l7;
                long l8;
                float f7;
                Object object3;
                Object object4;
                int n4;
                Object object5;
                block17: {
                    Object object6;
                    float f8;
                    Object object7;
                    int n7;
                    Object object8;
                    boolean bl2;
                    long l12;
                    mp mp2;
                    Serializable serializable;
                    long l14;
                    int n8;
                    Object object9;
                    Object object10;
                    long l15;
                    float f11;
                    LP1$a lP1$a;
                    int n10;
                    Object object11;
                    int n14;
                    float f12;
                    int n15;
                    block20: {
                        block21: {
                            block19: {
                                block16: {
                                    object5 = lP1;
                                    n4 = n3;
                                    int n16 = 1102344882;
                                    object4 = b30_02;
                                    object3 = b30_02.g(n16);
                                    n15 = n3 & 0xE;
                                    if (n15 == 0) {
                                        n15 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
                                        if (n15 != 0) {
                                            n15 = 4;
                                            f12 = 5.6E-45f;
                                        } else {
                                            n15 = 2;
                                            f12 = 2.8E-45f;
                                        }
                                        n15 |= n4;
                                    } else {
                                        n15 = n3;
                                    }
                                    n14 = n4 & 0x70;
                                    object11 = string2;
                                    if (n14 == 0) {
                                        n14 = (int)(((j30_0)object3).J(string2) ? 1 : 0);
                                        n14 = n14 != 0 ? 32 : 16;
                                        n15 |= n14;
                                    }
                                    if ((n14 = n4 & 0x380) == 0) {
                                        n14 = (int)(((j30_0)object3).b(f5) ? 1 : 0);
                                        n14 = n14 != 0 ? 256 : 128;
                                        n15 |= n14;
                                    }
                                    if ((n14 = n4 & 0x1C00) == 0) {
                                        n14 = (int)(((j30_0)object3).d(l2) ? 1 : 0);
                                        n14 = n14 != 0 ? 2048 : 1024;
                                        n15 |= n14;
                                    }
                                    n10 = n15 | 0x1B6000;
                                    f12 = 4.198194E-39f;
                                    n15 = 0x2DB6DB & n10;
                                    n14 = 599186;
                                    if (n15 != n14 || (n15 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block16;
                                    ((j30_0)object3).D();
                                    f7 = f6;
                                    l8 = l3;
                                    l7 = l4;
                                    break block17;
                                }
                                lP1$a = LP1$a.b;
                                f11 = uq0_0.b;
                                l8 = nz_1.m;
                                l15 = nz_1.l;
                                object4 = SP2.a(f5);
                                object4 = QV.a((LP1)object5, (i13)object4);
                                object10 = SP2.a(f5);
                                object4 = gz.a((LP1)object4, f11, l8, (i13)object10);
                                object10 = fg2_1.a;
                                object4 = a.b((LP1)object4, l15, (i13)object10);
                                object10 = Nc$a.a;
                                object9 = null;
                                object10 = HA.e((Nc)object10, false);
                                n8 = ((j30_0)object3).P;
                                object5 = ((j30_0)object3).P();
                                object4 = a30_0.c((b30_0)object3, (LP1)object4);
                                N20$a n20$a = N20.W;
                                n20$a.getClass();
                                l14 = l15;
                                serializable = N20$a.b;
                                mp2 = ((j30_0)object3).a;
                                l12 = l8;
                                bl2 = mp2 instanceof mp;
                                if (!bl2) break block18;
                                ((j30_0)object3).A();
                                bl2 = ((j30_0)object3).O;
                                if (bl2) {
                                    ((j30_0)object3).C((Function0)((Object)serializable));
                                } else {
                                    ((j30_0)object3).n();
                                }
                                object8 = N20$a.e;
                                Ow3.a((b30_0)object3, object10, (Function2)object8);
                                object10 = N20$a.d;
                                Ow3.a((b30_0)object3, object5, (Function2)object10);
                                object5 = N20$a.f;
                                n7 = ((j30_0)object3).O;
                                if (n7 != 0) break block19;
                                object7 = ((j30_0)object3).v();
                                f8 = f11;
                                object6 = n8;
                                n7 = Intrinsics.areEqual(object7, object6);
                                if (n7 != 0) break block20;
                                break block21;
                            }
                            f8 = f11;
                        }
                        rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object5);
                    }
                    object9 = N20$a.c;
                    Ow3.a((b30_0)object3, object4, (Function2)object9);
                    object4 = j.c;
                    object7 = zp.a;
                    object6 = Nc$a.j;
                    object7 = iQ2.a((zp$e)object7, (Gx$b)object6, (b30_0)object3, 0);
                    int n17 = ((j30_0)object3).P;
                    object11 = ((j30_0)object3).P();
                    object4 = a30_0.c((b30_0)object3, (LP1)object4);
                    int n18 = mp2 instanceof mp;
                    if (n18 == 0) break block22;
                    ((j30_0)object3).A();
                    n18 = ((j30_0)object3).O;
                    if (n18 != 0) {
                        ((j30_0)object3).C((Function0)((Object)serializable));
                    } else {
                        ((j30_0)object3).n();
                    }
                    Ow3.a((b30_0)object3, object7, (Function2)object8);
                    Ow3.a((b30_0)object3, object11, (Function2)object10);
                    n14 = (int)(((j30_0)object3).O ? 1 : 0);
                    if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object10 = ((j30_0)object3).v(), serializable = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                        rk_0.a(n17, (j30_0)object3, n17, (N20$a$a)object5);
                    }
                    Ow3.a((b30_0)object3, object4, (Function2)object9);
                    object4 = km2.a(R$drawable.fleek_search, (b30_0)object3, 0);
                    l15 = nz_1.j;
                    int n19 = R$string.acc_search_icon;
                    object10 = hv3_0.K(n19);
                    float f14 = uq0_0.h;
                    bl2 = false;
                    object7 = null;
                    int n20 = 14;
                    object5 = h.i(lP1$a, f14, 0.0f, 0.0f, 0.0f, n20);
                    object11 = Nc$a.k;
                    object9 = new VerticalAlignElement((Gx$b)object11);
                    object9 = object5.then((LP1)object9);
                    n7 = 3080;
                    n17 = 0;
                    f11 = 0.0f;
                    object6 = null;
                    object8 = object3;
                    f14 = f8;
                    rc1_0.b((im2)object4, (String)object10, (LP1)object9, l15, (b30_0)object3, n7, 0);
                    f12 = uq0_0.i;
                    object9 = null;
                    serializable = null;
                    n20 = n18 = 14;
                    object4 = h.i(lP1$a, f12, 0.0f, 0.0f, 0.0f, n18);
                    object10 = new VerticalAlignElement((Gx$b)object11);
                    object4 = object4.then((LP1)object10);
                    long l16 = OX.f;
                    float f15 = 0.5f;
                    long l17 = OX.b(l16, f15);
                    n14 = n10 & 0x70 | 0xC00;
                    n8 = n10 >> 3 & 0x380;
                    int n21 = n14 | n8;
                    f8 = 0.0f;
                    int n22 = 240;
                    object2 = object4;
                    object = string2;
                    ov3.j((LP1)object4, string2, l2, l17, null, null, 0, null, (b30_0)object3, n21, n22);
                    n15 = 1;
                    f12 = Float.MIN_VALUE;
                    ((j30_0)object3).T(n15 != 0);
                    ((j30_0)object3).T(n15 != 0);
                    f7 = f14;
                    l7 = l14;
                    l8 = l12;
                }
                object2 = ((j30_0)object3).X();
                if (object2 != null) {
                    object3 = object;
                    object5 = lP1;
                    object4 = string2;
                    n4 = n3;
                    object = new Uu3(lP1, string2, f5, l2, f7, l8, l7, n3);
                    ((CF2)object2).d = object;
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final int u(RecyclerView object) {
        object = object != null ? ((RecyclerView)object).getLayoutManager() : null;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager)object).findFirstVisibleItemPosition();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final double v(String string2) {
        String string3 = "componentTemplate";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = string2.hashCode();
        int n4 = -1548197280;
        if (n3 != n4) {
            n4 = -579775755;
            if (n3 != n4) {
                n4 = 662407343;
                if (n3 != n4) return 1.0;
                string3 = "POST_MEDIA-WITH-RESOURCE_DEFAULT";
                boolean bl2 = string2.equals(string3);
                if (bl2) return 0.5625;
                return 1.0;
            } else {
                string3 = "INTERNAL_SCROLL-STORIES";
                boolean bl3 = string2.equals(string3);
                if (bl3) return 0.5625;
            }
            return 1.0;
        } else {
            string3 = "POST_RESOURCE-CAROUSEL";
            boolean bl4 = string2.equals(string3);
            if (bl4) return 0.8;
        }
        return 1.0;
    }

    public static final LP1 w(int n3) {
        LP1 lP1;
        LP1$a lP1$a = LP1$a.b;
        fG2$a fG2$a = fg2_1.a;
        if ((n3 %= 2) != 0) {
            n3 = 0x3F000000;
            float f5 = 0.5f;
            lP1 = j.c(lP1$a, f5);
            long l2 = OX.f;
            lP1 = a.b(lP1, l2, fG2$a);
        } else {
            n3 = 1065353216;
            float f6 = 1.0f;
            lP1 = j.c(lP1$a, f6);
            long l3 = OX.f;
            lP1 = a.b(lP1, l3, fG2$a);
        }
        return lP1;
    }

    public static final boolean x(List object) {
        object = object != null && (object = (Media)CollectionsKt.N(0, (List)object)) != null ? ((Media)object).getType() : null;
        return kotlin.text.b.i((String)object, "VIDEO", false);
    }

    public static final Component y(ft1_2 object, List list) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(list, "videos");
        ArrayList<Js1> arrayList = ((ft1_2)object).j().i();
        int n3 = arrayList.isEmpty();
        Object object2 = null;
        if (n3 == 0 && (n3 = list.isEmpty()) == 0) {
            Js1 js1;
            float f5;
            arrayList = ((ft1_2)object).j();
            Object object3 = arrayList.i();
            Js1 js12 = (Js1)CollectionsKt.S((List)object3);
            int n4 = ((ft1_2)object).h();
            int n7 = 0;
            float f6 = 0.0f;
            int n8 = 1;
            if (n4 == 0 && (n4 = ((ft1_2)object).i()) == 0) {
                n4 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n4 = 0;
                f5 = 0.0f;
                js1 = null;
            }
            int n10 = js12.getSize();
            int n14 = js12.getOffset();
            n3 = arrayList.d();
            int n15 = js12.getIndex();
            int n16 = list.size() - n8;
            if (n15 == n16 && (n3 -= n14) >= n10) {
                n7 = 1;
                f6 = Float.MIN_VALUE;
            }
            if (n4 != 0) {
                object2 = object = CollectionsKt.firstOrNull(list);
                object2 = (Component)object;
            } else if (n7 != 0) {
                object2 = object = CollectionsKt.T(list);
                object2 = (Component)object;
            } else {
                object3 = (Iterable)object3;
                arrayList = new ArrayList<Js1>();
                object3 = object3.iterator();
                while ((n15 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    js1 = js12 = object3.next();
                    js1 = js12;
                    f5 = ov3.A((ft1_2)object, js1);
                    n7 = 1112014848;
                    f6 = 50.0f;
                    float f7 = f5 - f6;
                    n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                    if (n4 <= 0) continue;
                    arrayList.add(js12);
                }
                object = (Js1)CollectionsKt.firstOrNull(arrayList);
                if (object != null) {
                    int n17 = object.getIndex();
                    object2 = object = CollectionsKt.N(n17, list);
                    object2 = (Component)object;
                }
            }
        }
        return object2;
    }

    public static final i$a z(b30_0 b30_02) {
        int n3 = -1131999809;
        b30_02.K(n3);
        Object object = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object = (mu1_1)b30_02.j((H30)object);
        int n4 = 1841219355;
        b30_02.K(n4);
        Object object2 = b30_02.v();
        Object object3 = b30$a.a;
        if (object2 == object3) {
            object2 = J83.g((Object)i$a.ON_ANY);
            b30_02.o(object2);
        }
        object2 = (tr1_0)object2;
        b30_02.E();
        object3 = new Fu3((mu1_1)object, (tr1_0)object2);
        ly0_0.b(object, (Function1)object3, b30_02);
        object = (i$a)((Object)object2.getValue());
        b30_02.E();
        return object;
    }
}

