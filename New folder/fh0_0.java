/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.i$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.Layout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FH0
 */
public final class fh0_0 {
    public static final void a(GH0$d gH0$d, dr0_0 dr0_02, yT1 yT12, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4 = 1896893965;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n4);
        Intrinsics.checkNotNull(gH0$d, "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.explorebrands.ExploreBrandsViewState.SUCCESS");
        ExploreBrandsPageModel exploreBrandsPageModel = gH0$d.a;
        object3 = null;
        Object object5 = exploreBrandsPageModel != null && (object2 = exploreBrandsPageModel.getLayout()) != null ? (object2 = ((Layout)object2).getComponents()) : null;
        object2 = AndroidCompositionLocals_androidKt.b;
        object2 = zv0_2.b((Context)((j30_0)object4).j((H30)object2));
        boolean bl2 = object2 instanceof Activity;
        Object object6 = bl2 ? (object2 = (Activity)object2) : null;
        Object object7 = jt1.a((b30_0)object4);
        object3 = j.c;
        long l2 = nz_1.a;
        object2 = fg2_1.a;
        object3 = a.b((LP1)object3, l2, (i13)object2);
        object2 = object;
        object = new pg0_0((p83_0)object5, exploreBrandsPageModel, (ft1_2)object7, dr0_02, (Activity)object6, yT12);
        object6 = null;
        object5 = null;
        exploreBrandsPageModel = null;
        bl2 = false;
        int n7 = 6;
        int n8 = 252;
        object2 = object7;
        object7 = object;
        object = object4;
        xq1_0.a((LP1)object3, (ft1_2)object2, null, false, null, null, null, false, (Function1)object7, (b30_0)object4, n7, n8);
        object4 = ((j30_0)object4).X();
        if (object4 != null) {
            object2 = dr0_02;
            object5 = yT12;
            ((CF2)object4).d = object3 = new qg0_0(gH0$d, dr0_02, yT12, n3);
        }
    }

    public static final void b(int n3, b30_0 b30_02, dr0_0 dr0_02, yT1 yT12) {
        block13: {
            Object object;
            Object object2;
            block20: {
                int n4;
                boolean bl2;
                Object object3;
                yT1 yT13;
                block15: {
                    block18: {
                        block19: {
                            boolean bl3;
                            N20$a$b n20$a$b;
                            mp mp2;
                            Xp1$a xp1$a;
                            Object object4;
                            Object object5;
                            Object object6;
                            Object object7;
                            Object object8;
                            Integer n7;
                            boolean bl4;
                            Object object9;
                            block16: {
                                block17: {
                                    Object object10;
                                    boolean bl5;
                                    block14: {
                                        object2 = dr0_02;
                                        yT13 = yT12;
                                        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
                                        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
                                        int n8 = -1947937195;
                                        object3 = b30_02;
                                        object = b30_02.g(n8);
                                        AnalyticsManager.Companion.getInstance().getGtmEvents().setScreenName("explore brands screen");
                                        object3 = (gh0_0)dr0_02.F.getValue();
                                        object9 = ov3.z((b30_0)object);
                                        bl4 = false;
                                        n7 = null;
                                        object8 = new dh0_2((i$a)((Object)object9), dr0_02, null);
                                        ly0_0.d((b30_0)object, object9, (Function2)object8);
                                        object9 = LP1$a.b;
                                        object8 = j.c;
                                        long l2 = nz_1.a;
                                        object7 = fg2_1.a;
                                        object6 = a.b((LP1)object8, l2, (i13)object7);
                                        object5 = Nc$a.b;
                                        boolean bl6 = false;
                                        object7 = null;
                                        object5 = HA.e((Nc)object5, false);
                                        int bl22 = ((j30_0)object).P;
                                        object4 = ((j30_0)object).P();
                                        object6 = a30_0.c((b30_0)object, (LP1)object6);
                                        N20.W.getClass();
                                        xp1$a = N20$a.b;
                                        mp2 = ((j30_0)object).a;
                                        boolean bl7 = mp2 instanceof mp;
                                        if (!bl7) break block13;
                                        ((j30_0)object).A();
                                        bl7 = ((j30_0)object).O;
                                        if (bl7) {
                                            ((j30_0)object).C(xp1$a);
                                        } else {
                                            ((j30_0)object).n();
                                        }
                                        n20$a$b = N20$a.e;
                                        Ow3.a((b30_0)object, object5, n20$a$b);
                                        object5 = N20$a.d;
                                        Ow3.a((b30_0)object, object4, (Function2)object5);
                                        object4 = N20$a.f;
                                        bl5 = ((j30_0)object).O;
                                        if (bl5 || !(bl6 = Intrinsics.areEqual(object10 = ((j30_0)object).v(), object7 = Integer.valueOf(bl22)))) {
                                            rk_0.a(bl22, (j30_0)object, bl22, (N20$a$a)object4);
                                        }
                                        object7 = N20$a.c;
                                        Ow3.a((b30_0)object, object6, (Function2)object7);
                                        object6 = GH0$c.a;
                                        bl3 = Intrinsics.areEqual(object3, object6);
                                        bl2 = true;
                                        if (!bl3) break block14;
                                        int n14 = 2038980497;
                                        ((j30_0)object).K(n14);
                                        object3 = Unit.a;
                                        object9 = new eh0_2(null, (dr0_0)object2);
                                        ly0_0.d((b30_0)object, object3, (Function2)object9);
                                        bl3 = false;
                                        object6 = null;
                                        ((j30_0)object).T(false);
                                        break block15;
                                    }
                                    bl3 = false;
                                    object6 = null;
                                    object10 = GH0$b.a;
                                    bl5 = Intrinsics.areEqual(object3, object10);
                                    if (!bl5) break block16;
                                    int n16 = 2039235720;
                                    ((j30_0)object).K(n16);
                                    object3 = HA.e(Nc$a.a, false);
                                    n4 = ((j30_0)object).P;
                                    object6 = ((j30_0)object).P();
                                    object8 = a30_0.c((b30_0)object, (LP1)object8);
                                    boolean bl10 = mp2 instanceof mp;
                                    if (!bl10) break block17;
                                    ((j30_0)object).A();
                                    bl4 = ((j30_0)object).O;
                                    if (bl4) {
                                        ((j30_0)object).C(xp1$a);
                                    } else {
                                        ((j30_0)object).n();
                                    }
                                    Ow3.a((b30_0)object, object3, n20$a$b);
                                    Ow3.a((b30_0)object, object6, (Function2)object5);
                                    n16 = (int)(((j30_0)object).O ? 1 : 0);
                                    if (n16 != 0 || (n16 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object).v(), n7 = Integer.valueOf(n4)) ? 1 : 0)) == 0) {
                                        rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object4);
                                    }
                                    Ow3.a((b30_0)object, object8, (Function2)object7);
                                    boolean n15 = false;
                                    object8 = null;
                                    NG0.b((b30_0)object, 0);
                                    ((j30_0)object).T(bl2);
                                    ((j30_0)object).T(false);
                                    break block15;
                                }
                                s20.a();
                                throw null;
                            }
                            int n8 = 0;
                            object8 = null;
                            bl3 = object3 instanceof gh0_0.a;
                            if (!bl3) break block18;
                            int bl11 = 2039469212;
                            ((j30_0)object).K(bl11);
                            object3 = zp.c;
                            object6 = Nc$a.m;
                            object3 = oZ.a((zp$l)object3, (Gx$a)object6, (b30_0)object, 0);
                            n8 = ((j30_0)object).P;
                            object6 = ((j30_0)object).P();
                            object9 = a30_0.c((b30_0)object, (LP1)object9);
                            boolean bl8 = mp2 instanceof mp;
                            if (!bl8) break block19;
                            ((j30_0)object).A();
                            bl4 = ((j30_0)object).O;
                            if (bl4) {
                                ((j30_0)object).C(xp1$a);
                            } else {
                                ((j30_0)object).n();
                            }
                            Ow3.a((b30_0)object, object3, n20$a$b);
                            Ow3.a((b30_0)object, object6, (Function2)object5);
                            bl11 = (int)(((j30_0)object).O ? 1 : 0);
                            if (bl11 != 0 || (bl11 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object).v(), n7 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                                rk_0.a(n8, (j30_0)object, n8, (N20$a$a)object4);
                            }
                            Ow3.a((b30_0)object, object9, (Function2)object7);
                            object3 = new og0_0((dr0_0)object2);
                            n4 = 0;
                            object9 = null;
                            rB0.a((Function0)object3, (b30_0)object, 0);
                            ((j30_0)object).T(bl2);
                            ((j30_0)object).T(false);
                            break block15;
                        }
                        s20.a();
                        throw null;
                    }
                    n4 = object3 instanceof GH0$d;
                    if (n4 == 0) break block20;
                    ((j30_0)object).K(2039711911);
                    n4 = 584;
                    fh0_0.a((GH0$d)object3, (dr0_0)object2, yT13, (b30_0)object, n4);
                    boolean bl9 = false;
                    object3 = null;
                    ((j30_0)object).T(false);
                }
                ((j30_0)object).T(bl2);
                object = ((j30_0)object).X();
                if (object != null) {
                    n4 = n3;
                    ((CF2)object).d = object3 = new md_2(yT13, (dr0_0)object2, n3);
                }
                return;
            }
            ((j30_0)object).K(758508905);
            ((j30_0)object).T(false);
            object2 = new NoWhenBranchMatchedException();
            throw object2;
        }
        s20.a();
        throw null;
    }
}

