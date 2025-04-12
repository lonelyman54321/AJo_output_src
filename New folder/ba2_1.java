/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContextWrapper
 */
import android.app.Activity;
import android.content.ContextWrapper;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BA2
 */
public final class ba2_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(UserReviewModel userReviewModel, b30_0 b30_02, int n3) {
        float f5;
        float f6;
        int n4;
        long l2;
        int n7;
        long l3;
        za2_1 za2_12;
        int n8;
        int n10;
        float f7;
        Object object;
        long l4;
        long l7;
        Object object2;
        Object object3;
        int n14;
        Xp1$a xp1$a;
        Object object4;
        int n15;
        float f8;
        int n16;
        int n17;
        boolean bl2;
        Object object5;
        boolean bl3;
        int n18;
        Object object6;
        Object object7;
        int n19;
        int n20;
        Object object8;
        ArrayList arrayList;
        Object object9;
        Object object10;
        Object object11;
        int n21;
        Object object12;
        Object object13;
        int n22;
        float f11;
        UserReviewModel userReviewModel2;
        block32: {
            Object object14;
            block34: {
                long l8;
                String string2;
                block35: {
                    block36: {
                        block33: {
                            block31: {
                                userReviewModel2 = userReviewModel;
                                int n24 = 1;
                                f11 = 0.0f;
                                object14 = null;
                                Intrinsics.checkNotNullParameter(userReviewModel, "userReviewModel");
                                n22 = -521248508;
                                b30_0 b30_03 = b30_02;
                                object13 = b30_02.g(n22);
                                object12 = ((j30_0)object13).v();
                                b30$a$a b30$a$a = b30$a.a;
                                if (object12 == b30$a$a) {
                                    object12 = Qx2.a(ly0_0.f(f.a, (b30_0)object13), (j30_0)object13);
                                }
                                object12 = ((Q30)object12).a;
                                n21 = 881000343;
                                ((j30_0)object13).K(n21);
                                object11 = ((j30_0)object13).v();
                                if (object11 == b30$a$a) {
                                    object11 = J83.g(Boolean.FALSE);
                                    ((j30_0)object13).o(object11);
                                }
                                object10 = object11;
                                object10 = (tr1_0)object11;
                                n21 = 881002227;
                                object11 = wg2_2.a((j30_0)object13, false, n21);
                                if (object11 == b30$a$a) {
                                    Integer n25 = 0;
                                    object11 = J83.g(n25);
                                    ((j30_0)object13).o(object11);
                                }
                                object9 = object11;
                                object9 = (tr1_0)object11;
                                ((j30_0)object13).T(false);
                                Object[] objectArray = new UserReviewModel[n24];
                                objectArray[0] = userReviewModel2;
                                arrayList = OD2.b(xx_2.j(objectArray));
                                ((j30_0)object13).K(881007209);
                                object11 = (Boolean)object10.getValue();
                                n21 = (int)(((Boolean)object11).booleanValue() ? 1 : 0);
                                if (n21 != 0) {
                                    object11 = Boolean.FALSE;
                                    object10.setValue(object11);
                                    object11 = AndroidCompositionLocals_androidKt.b;
                                    object8 = ((j30_0)object13).j((H30)object11);
                                    n20 = object8 instanceof Activity;
                                    if (n20 != 0) {
                                        object8 = (Activity)object8;
                                    } else {
                                        n19 = 0;
                                        object8 = null;
                                    }
                                    if (object8 == null && (n20 = (object7 = ((j30_0)object13).j((H30)object11)) instanceof ContextWrapper) != 0) {
                                        object11 = ((j30_0)object13).j((H30)object11);
                                        Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type android.content.ContextWrapper");
                                        object11 = (ContextWrapper)object11;
                                        object7 = object11.getBaseContext();
                                        n20 = object7 instanceof Activity;
                                        if (n20 != 0) {
                                            object8 = object11 = object11.getBaseContext();
                                            object8 = (Activity)object11;
                                        }
                                    }
                                    if (object8 != null) {
                                        Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
                                        object8 = (AjioHomeActivity)object8;
                                        object11 = ((AjioHomeActivity)object8).T0;
                                        if (object11 != null) {
                                            object11 = ((Fragment)object11).getChildFragmentManager();
                                        } else {
                                            n21 = 0;
                                            object11 = null;
                                        }
                                        if (object11 != null) {
                                            object8 = EO2.Companion;
                                            object7 = new UserReviewModel[n24];
                                            object7[0] = userReviewModel2;
                                            object7 = xx_2.d((Object[])object7);
                                            object6 = (Number)object9.getValue();
                                            n18 = ((Number)object6).intValue();
                                            bl3 = false;
                                            object5 = null;
                                            bl2 = false;
                                            Object var24_31 = null;
                                            n17 = 1;
                                            n16 = 1;
                                            f8 = Float.MIN_VALUE;
                                            n15 = 224;
                                            object8 = EO2$a.b((EO2$a)object8, (ArrayList)object7, n18, n17, n16, null, null, n15);
                                            object7 = "ShowReviewImage";
                                            ((DialogFragment)object8).show((FragmentManager)object11, (String)object7);
                                            object11 = Unit.a;
                                        }
                                    }
                                }
                                ((j30_0)object13).T(false);
                                object11 = LP1$a.b;
                                long l12 = OX.f;
                                object6 = fg2_1.a;
                                object8 = a.b((LP1)object11, l12, (i13)object6);
                                object7 = Nc$a.m;
                                object6 = zp.c;
                                n17 = 48;
                                object7 = oZ.a((zp$l)object6, (Gx$a)object7, (b30_0)object13, n17);
                                n18 = ((j30_0)object13).P;
                                object4 = ((j30_0)object13).P();
                                object8 = a30_0.c((b30_0)object13, (LP1)object8);
                                N20.W.getClass();
                                xp1$a = N20$a.b;
                                object5 = ((j30_0)object13).a;
                                bl2 = object5 instanceof mp;
                                if (!bl2) {
                                    s20.a();
                                    throw null;
                                }
                                ((j30_0)object13).A();
                                bl2 = ((j30_0)object13).O;
                                if (bl2) {
                                    ((j30_0)object13).C(xp1$a);
                                } else {
                                    ((j30_0)object13).n();
                                }
                                N20$a$b n20$a$b = N20$a.e;
                                Ow3.a((b30_0)object13, object7, n20$a$b);
                                object7 = N20$a.d;
                                Ow3.a((b30_0)object13, object4, (Function2)object7);
                                object4 = N20$a.f;
                                n14 = ((j30_0)object13).O;
                                if (n14 != 0 || (n14 = Intrinsics.areEqual(object3 = ((j30_0)object13).v(), object2 = Integer.valueOf(n18))) == 0) {
                                    rk_0.a(n18, (j30_0)object13, n18, (N20$a$a)object4);
                                }
                                object3 = N20$a.c;
                                Ow3.a((b30_0)object13, object8, (Function2)object3);
                                object2 = zp.a;
                                object8 = Nc$a.j;
                                object2 = iQ2.a((zp$e)object2, (Gx$b)object8, (b30_0)object13, 0);
                                n19 = ((j30_0)object13).P;
                                object6 = ((j30_0)object13).P();
                                object14 = a30_0.c((b30_0)object13, (LP1)object11);
                                bl3 = object5 instanceof mp;
                                if (!bl3) {
                                    s20.a();
                                    throw null;
                                }
                                ((j30_0)object13).A();
                                bl3 = ((j30_0)object13).O;
                                if (bl3) {
                                    ((j30_0)object13).C(xp1$a);
                                } else {
                                    ((j30_0)object13).n();
                                }
                                Ow3.a((b30_0)object13, object2, n20$a$b);
                                Ow3.a((b30_0)object13, object6, (Function2)object7);
                                n24 = (int)(((j30_0)object13).O ? 1 : 0);
                                if (n24 != 0 || (n24 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object13).v(), object7 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                                    rk_0.a(n19, (j30_0)object13, n19, (N20$a$a)object4);
                                }
                                Ow3.a((b30_0)object13, object14, (Function2)object3);
                                l7 = xx_1.C;
                                n24 = 12;
                                l4 = Em3.f(n24);
                                object = tv0_0.o;
                                f11 = 0.0f;
                                f7 = 8;
                                object7 = h.h((LP1)object11, f11, f11, f7, f11);
                                n19 = 5;
                                object3 = new Cj3(n19);
                                n10 = 200118;
                                object8 = "Review";
                                bl2 = false;
                                n8 = 0;
                                za2_12 = null;
                                l3 = 0L;
                                n7 = 0;
                                l2 = 0L;
                                n4 = 130512;
                                Ll3.b((String)object8, (LP1)object7, l7, l4, null, (tv0_0)object, null, l3, null, (Cj3)object3, l2, 0, false, 0, 0, null, null, (b30_0)object13, n10, 0, n4);
                                n14 = -855054153;
                                f7 = -1.4355954E8f;
                                ((j30_0)object13).K(n14);
                                object3 = userReviewModel.getReviewStatus();
                                string2 = "REJECTED";
                                if (object3 != null && (n14 = ((String)object3).length()) != 0 && (object3 = userReviewModel.getReviewStatus()) != null) break block31;
                                f6 = f11;
                                object2 = string2;
                                n14 = 0;
                                f7 = 0.0f;
                                object3 = null;
                                break block32;
                            }
                            object3 = OD2.a(userReviewModel);
                            n19 = -855048481;
                            ((j30_0)object13).K(n19);
                            if (object3 != null) break block33;
                            f6 = f11;
                            object2 = string2;
                            n14 = 0;
                            f7 = 0.0f;
                            object3 = null;
                            break block34;
                        }
                        object8 = "status";
                        Intrinsics.checkNotNullParameter(object3, (String)object8);
                        object7 = Locale.ROOT;
                        object6 = ((String)object3).toUpperCase((Locale)object7);
                        object4 = "toUpperCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
                        n16 = (int)(Intrinsics.areEqual(object6, string2) ? 1 : 0);
                        object5 = "APPROVED";
                        long l14 = n16 != 0 ? xx_1.R : ((n18 = (int)(Intrinsics.areEqual(object6, object5) ? 1 : 0)) != 0 ? xx_1.Q : xx_1.D);
                        f6 = f11;
                        l8 = l14;
                        Intrinsics.checkNotNullParameter(object3, (String)object8);
                        object3 = ((String)object3).toUpperCase((Locale)object7);
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                        n19 = ((String)object3).hashCode();
                        switch (n19) {
                            default: {
                                break;
                            }
                            case 1967871671: {
                                n14 = (int)(((String)object3).equals(object5) ? 1 : 0);
                                if (n14 == 0) break;
                                AJIOApplication.Companion.getClass();
                                object3 = AJIOApplication$a.a();
                                n19 = R$string.str_approved;
                                object3 = object3.getString(n19);
                                break block35;
                            }
                            case 1186757518: {
                                object8 = "UNDER MODERATION";
                                n14 = (int)(((String)object3).equals(object8) ? 1 : 0);
                                if (n14 == 0) break;
                                AJIOApplication.Companion.getClass();
                                object3 = AJIOApplication$a.a();
                                n19 = R$string.str_under_moderation;
                                object3 = object3.getString(n19);
                                break block35;
                            }
                            case 174130302: {
                                n14 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                if (n14 == 0) break;
                                AJIOApplication.Companion.getClass();
                                object3 = AJIOApplication$a.a();
                                n19 = R$string.str_rejected;
                                object3 = object3.getString(n19);
                                break block35;
                            }
                            case 83283945: {
                                object8 = "PARTIALLY APPROVED";
                                n14 = (int)(((String)object3).equals(object8) ? 1 : 0);
                                if (n14 != 0) break block36;
                            }
                        }
                        n14 = 0;
                        f7 = 0.0f;
                        object3 = null;
                        break block35;
                    }
                    AJIOApplication.Companion.getClass();
                    object3 = AJIOApplication$a.a();
                    n19 = R$string.str_partially_approved;
                    object3 = object3.getString(n19);
                }
                n19 = 830947519;
                ((j30_0)object13).K(n19);
                if (object3 == null) {
                    object2 = string2;
                } else {
                    object7 = SP2.a(2);
                    object8 = new BA2$a(l8, (String)object3);
                    n14 = 368945272;
                    f7 = 1.0245168E-25f;
                    object3 = v10.c(n14, (fx0_2)object8, (b30_0)object13);
                    l7 = 0L;
                    n16 = 0;
                    f8 = 0.0f;
                    xp1$a = null;
                    n19 = 0;
                    object8 = null;
                    n8 = 0x1B0000;
                    int n26 = 29;
                    object2 = string2;
                    Object object15 = object3;
                    object = object13;
                    JL.a(null, (i13)object7, l7, null, f6, (u10)object3, (b30_0)object13, n8, n26);
                    object3 = Unit.a;
                }
                n14 = 0;
                f7 = 0.0f;
                object3 = null;
                ((j30_0)object13).T(false);
                object14 = Unit.a;
            }
            ((j30_0)object13).T(false);
            object14 = Unit.a;
        }
        ((j30_0)object13).T(false);
        ((j30_0)object13).T(true);
        object8 = userReviewModel.getReviewText();
        ((j30_0)object13).K(1222263053);
        f11 = 1.0f;
        n14 = 16;
        f7 = 2.2E-44f;
        if (object8 == null) {
            f11 = f6;
        } else {
            l7 = xx_1.H;
            n20 = 12;
            l4 = Em3.f(n20);
            f5 = n14;
            object7 = j.c(h.h((LP1)object11, f6, f5, f6, f6), f11);
            n10 = 3504;
            n15 = 0;
            object = null;
            f11 = f6;
            bl2 = false;
            Object var24_37 = null;
            n8 = 0;
            za2_12 = null;
            l3 = 0L;
            n7 = 0;
            l2 = 0L;
            n4 = 131056;
            Ll3.b((String)object8, (LP1)object7, l7, l4, null, null, null, l3, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object13, n10, 0, n4);
            object8 = Unit.a;
        }
        n19 = 0;
        object8 = null;
        ((j30_0)object13).T(false);
        ft1_2 ft1_22 = jt1.a((b30_0)object13);
        f7 = n14;
        n20 = 0;
        f5 = 0.0f;
        object8 = object11;
        object8 = h.i((LP1)object11, 0.0f, f7, 0.0f, 0.0f, 13);
        object7 = object12;
        object7 = (c80)object12;
        object12 = za2_12;
        object5 = object11;
        object11 = userReviewModel;
        f8 = f7;
        object3 = object7;
        object7 = object10;
        object10 = object9;
        object4 = object13;
        object13 = object7;
        za2_12 = new za2_1(arrayList, userReviewModel, (c80)object3, (tr1_0)object9, (tr1_0)object7);
        n15 = 0;
        object = null;
        n18 = 0;
        object6 = null;
        int n27 = 0;
        Object var8_14 = null;
        n21 = 0;
        n14 = 0;
        f7 = 0.0f;
        object3 = null;
        int n28 = 6;
        n7 = 252;
        object7 = ft1_22;
        object10 = object4;
        n17 = 0;
        object4 = null;
        float f12 = f8;
        n16 = 0;
        xp1$a = null;
        f8 = 0.0f;
        object11 = object5;
        bl3 = false;
        object5 = null;
        bl2 = false;
        Object var24_39 = null;
        xq1_0.b((LP1)object8, (ft1_2)object7, null, false, null, null, null, false, za2_12, (b30_0)object10, n28, n7);
        ((j30_0)object10).K(1222364118);
        object12 = OD2.a(userReviewModel);
        n22 = (int)(Intrinsics.areEqual(object12, object2) ? 1 : 0);
        if (n22 != 0 && (object12 = userReviewModel.getTextStatusReason()) != null) {
            object3 = "Reject Reason : ";
            object8 = ((String)object3).concat((String)object12);
            l7 = xx_1.H;
            n22 = 12;
            l4 = Em3.f(n22);
            object12 = h.h((LP1)object11, f11, f12, f11, f11);
            n27 = 1065353216;
            f12 = 1.0f;
            object7 = j.c((LP1)object12, f12);
            n10 = 3504;
            bl2 = false;
            Object var24_40 = null;
            n15 = 0;
            object = null;
            n8 = 0;
            za2_12 = null;
            l3 = 0L;
            n7 = 0;
            l2 = 0L;
            n4 = 131056;
            Ll3.b((String)object8, (LP1)object7, l7, l4, null, null, null, l3, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object10, n10, 0, n4);
            object12 = Unit.a;
        }
        n22 = 0;
        n27 = 1;
        f12 = Float.MIN_VALUE;
        object12 = fn0_2.a((j30_0)object10, false, n27 != 0);
        if (object12 == null) return;
        n21 = n3;
        aa2_1 aa2_12 = new aa2_1(userReviewModel2, n3);
        ((CF2)object12).d = aa2_12;
    }
}

