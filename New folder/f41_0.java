/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f41
 */
public final class f41_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Function0 function0, boolean bl2, b30_0 b30_02, int n3, int n4) {
        float f5;
        int n7;
        int n8;
        int n10;
        int n14;
        float f6;
        int n15;
        int n16;
        Object object;
        Object object2;
        int n17;
        int n18;
        Function0 function02;
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            function02 = function0;
                            n18 = n3;
                            n17 = n4;
                            Intrinsics.checkNotNullParameter(function0, "onAllReviewsClicked");
                            int n19 = -499523454;
                            object2 = b30_02;
                            object = b30_02.g(n19);
                            n16 = n3 & 0xE;
                            n15 = 4;
                            if (n16 == 0) {
                                n16 = (int)(((j30_0)object).x(function0) ? 1 : 0);
                                if (n16 != 0) {
                                    n16 = 4;
                                    f6 = 5.6E-45f;
                                } else {
                                    n16 = 2;
                                    f6 = 2.8E-45f;
                                }
                                n16 |= n18;
                            } else {
                                n16 = n3;
                            }
                            n14 = n17 & 2;
                            n10 = 16;
                            if (n14 == 0) break block15;
                            n16 |= 0x30;
                            break block16;
                        }
                        n8 = n18 & 0x70;
                        if (n8 != 0) break block16;
                        n8 = (int)(bl2 ? 1 : 0);
                        n7 = ((j30_0)object).a(bl2);
                        if (n7 == 0) break block17;
                        n7 = 32;
                        f5 = 4.5E-44f;
                        break block18;
                    }
                    n8 = (int)(bl2 ? 1 : 0);
                    break block19;
                }
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n16 |= n7;
        }
        int n20 = n16;
        n7 = 18;
        f5 = 2.5E-44f;
        if ((n16 &= 0x5B) == n7 && (n16 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            boolean bl3 = false;
            int n21 = n14 != 0 ? 0 : n8;
            vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
            object2 = (Context)((j30_0)object).j(vc3_12);
            LP1$a lP1$a = LP1$a.b;
            n14 = 1065353216;
            LP1 lP1 = j.c(lP1$a, 1.0f);
            float f7 = n10;
            float f8 = 0.0f;
            int n22 = 0;
            int n24 = 10;
            float f11 = 1.4E-44f;
            Object object3 = h.i(lP1, f7, 0.0f, f7, 0.0f, n24);
            Object object4 = HA.e(Nc$a.a, false);
            n8 = ((j30_0)object).P;
            Object object5 = ((j30_0)object).P();
            object3 = a30_0.c((b30_0)object, (LP1)object3);
            N20.W.getClass();
            Object object6 = N20$a.b;
            mp mp2 = ((j30_0)object).a;
            int n25 = mp2 instanceof mp;
            int n26 = 0;
            Object object7 = null;
            if (n25 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object).A();
            n25 = ((j30_0)object).O;
            if (n25 != 0) {
                ((j30_0)object).C((Function0)object6);
            } else {
                ((j30_0)object).n();
            }
            object6 = N20$a.e;
            Ow3.a((b30_0)object, object4, (Function2)object6);
            object4 = N20$a.d;
            Ow3.a((b30_0)object, object5, (Function2)object4);
            object4 = N20$a.f;
            n7 = (int)(((j30_0)object).O ? 1 : 0);
            if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object).v(), object6 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                rk_0.a(n8, (j30_0)object, n8, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object, object3, (Function2)object4);
            object6 = d.a;
            if (n21 != 0) {
                object2 = object2.getResources();
                n14 = R$string.top_reviews;
                object2 = object2.getString(n14);
            } else {
                object2 = object2.getResources();
                n14 = R$string.reviews;
                object2 = object2.getString(n14);
            }
            object3 = object2;
            Intrinsics.checkNotNull(object2);
            long l2 = xx_1.e;
            int n27 = 14;
            long l3 = Em3.f(n27);
            n25 = 7;
            f6 = n25;
            f5 = 8;
            n24 = 12;
            lP1 = lP1$a;
            f8 = f5;
            object2 = h.i(lP1$a, f6, f5, 0.0f, 0.0f, n24);
            long l4 = 0L;
            f8 = 0.0f;
            int n28 = 24966;
            n22 = 104;
            f11 = f5;
            n7 = 0;
            object5 = null;
            f5 = 0.0f;
            long l7 = l3;
            n26 = 0;
            object7 = null;
            long l8 = l4;
            n15 = n28;
            mm3_0.a((LP1)object2, (String)object3, l2, null, l3, null, l4, (b30_0)object, n28, n22);
            n16 = 1896818151;
            f6 = 7.0883484E29f;
            ((j30_0)object).K(n16);
            n15 = 1;
            if (n21 != 0) {
                object2 = vc3_12;
                object2 = ((Context)((j30_0)object).j(vc3_12)).getResources();
                n14 = R$string.view_all_reviews;
                object3 = object2.getString(n14);
                Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
                l2 = xx_1.h;
                l7 = Em3.f(12);
                object2 = Nc$a.c;
                object7 = object6;
                object5 = lP1$a;
                lP1 = ((d)object6).a(lP1$a, (Nc)object2);
                n28 = 0;
                n22 = 0;
                n16 = 13;
                f6 = 1.8E-44f;
                f8 = f11;
                n24 = n16;
                f11 = f6;
                object2 = h.i(lP1, 0.0f, f8, 0.0f, 0.0f, n16);
                f5 = 7.09688E29f;
                ((j30_0)object).K(1896829442);
                n7 = n20 & 0xE;
                n26 = 4;
                bl3 = n7 == n26;
                object5 = ((j30_0)object).v();
                if (bl3 || object5 == (object7 = b30$a.a)) {
                    n26 = 0;
                    object7 = null;
                    object5 = new d41_0(function02, 0);
                    ((j30_0)object).o(object5);
                }
                object5 = (Function0)object5;
                bl3 = false;
                ((j30_0)object).T(false);
                int n29 = 7;
                object2 = androidx.compose.foundation.d.b((LP1)object2, false, null, (Function0)object5, n29);
                n26 = 0;
                object7 = null;
                l8 = 0L;
                n7 = 0;
                f5 = 0.0f;
                object5 = null;
                n20 = 104;
                n15 = 24960;
                mm3_0.a((LP1)object2, (String)object3, l2, null, l7, null, l8, (b30_0)object, n15, n20);
            }
            object2 = null;
            ((j30_0)object).T(false);
            n16 = 1;
            f6 = Float.MIN_VALUE;
            ((j30_0)object).T(n16 != 0);
            n8 = n21;
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new e41_0(function02, n8 != 0, n18, n17);
        }
    }
}

