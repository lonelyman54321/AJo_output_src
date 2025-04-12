/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBanner;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.utility.UiUtils$calculateViewWidth$1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from TR2
 */
public final class tr2_2 {
    public static final tr2_2 a;
    public static final jo_2 b;
    public static qr2_1 c;
    public static final hh3_2 d;
    public static final hh3_2 e;

    static {
        Object object = new Object();
        a = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        b = object = new jo_2((Context)aJIOApplication);
        c = qr2_1.NO_SALE;
        object = new Object();
        d = yr1_2.b((Function0)object);
        object = new Object();
        e = yr1_2.b((Function0)object);
    }

    public static void A(View view, String string2, Float f5, String string3, String string4, boolean bl2, boolean bl3, ScreenType screenType, yt2_2 yt2_22, int n3) {
        Object object;
        TextView textView;
        TextView textView2;
        Object object2;
        View view2 = view;
        int n4 = n3;
        int n7 = n3 & 0x20;
        int n8 = 0;
        TextView textView3 = null;
        boolean bl4 = n7 != 0 ? false : bl2;
        n7 = n4 & 0x40;
        boolean bl5 = n7 != 0 ? false : bl3;
        Object object3 = (n4 &= 0x100) != 0 ? (object2 = yt2_2.UNKNOWN) : yt2_22;
        Intrinsics.checkNotNullParameter((Object)screenType, "screenType");
        object2 = "screenName";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = yt2_2.PLP;
        if (object3 == object2 || object3 == (object2 = yt2_2.PDP)) {
            n8 = 1;
        }
        n4 = 0;
        object2 = null;
        if (n8 != 0 && view2 != null) {
            n7 = R$id.salePriceTV_end;
            textView = textView2 = (TextView)view2.findViewById(n7);
        } else {
            textView = null;
        }
        if (view2 != null) {
            n7 = R$id.salePriceTextTV;
            textView2 = (TextView)view2.findViewById(n7);
        } else {
            n7 = 0;
            textView2 = null;
        }
        if (view2 != null) {
            n8 = R$id.salePriceTV;
            textView3 = (TextView)view2.findViewById(n8);
        } else {
            n8 = 0;
            textView3 = null;
        }
        if (view2 != null) {
            int n10 = R$id.saleDiscountTV;
            object = (TextView)view2.findViewById(n10);
        } else {
            boolean bl6 = false;
            object = null;
        }
        if (view2 != null) {
            n4 = R$id.saleIV;
            object2 = (AppCompatImageView)view2.findViewById(n4);
        }
        Object object4 = object2;
        view2 = view;
        object2 = textView2;
        textView2 = textView3;
        textView3 = object;
        object = object4;
        object4 = string2;
        tr2_2.z(view, (TextView)object2, textView2, textView3, (AppCompatImageView)((Object)object), string2, f5, string3, string4, bl4, bl5, false, textView, object3, screenType, 2048);
    }

    public static void B(Long object, Long l2) {
        qr2_1 qr2_12;
        c = qr2_12 = qr2_1.NO_SALE;
        boolean bl2 = tr2_2.r();
        if (bl2 && object != null && l2 != null) {
            long l3 = l2;
            String string2 = "SALE_END_TIME";
            jo_2 jo_22 = b;
            jo_22.putPreference(string2, l3);
            l3 = k7.q();
            long l4 = object;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 < 0) {
                object = qr2_1.PRE_SALE;
                c = object;
            } else {
                long l8 = l2;
                long l12 = l3 - l8;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 < 0) {
                    object = qr2_1.DURING_SALE;
                    c = object;
                }
            }
        }
    }

    public static String a() {
        Object object = tr2_2.b();
        object = object != null && (object = ((EarlyAccessBannerData)object).getEarlyAccessBanner()) != null ? ((EarlyAccessBanner)object).getBackGroundColor() : null;
        return String.valueOf(object);
    }

    public static EarlyAccessBannerData b() {
        return (EarlyAccessBannerData)e.getValue();
    }

    public static String c() {
        Object object = tr2_2.b();
        object = object != null ? ((EarlyAccessBannerData)object).getSalePDPImageUrl() : null;
        return String.valueOf(object);
    }

    public static kr2_2 d() {
        return (kr2_2)d.getValue();
    }

    public static String e() {
        boolean bl2 = tr2_2.n(og1_1.c());
        if (bl2) {
            Object object = tr2_2.b();
            if (object != null && (object = ((EarlyAccessBannerData)object).getEarlyAccessBanner()) != null) {
                object = ((EarlyAccessBanner)object).getSaleTitle();
            } else {
                bl2 = false;
                object = null;
            }
            return String.valueOf(object);
        }
        bl2 = tr2_2.o();
        String string2 = bl2 ? tr2_2.d().j : tr2_2.d().k;
        return string2;
    }

    public static String f(String object, Float object2, String object3, ScreenType object4) {
        int n3;
        int n4;
        qr2_1 qr2_12;
        Intrinsics.checkNotNullParameter(object4, "screenType");
        Object object5 = "rilfnl_v1";
        object4 = CustomerStoreType.a(object5, object4);
        boolean bl2 = tr2_2.i();
        String string2 = null;
        if (!(bl2 || (object5 = c) == (qr2_12 = qr2_1.PRE_SALE) && (n4 = mz3_0.y((String)object4)) != 0)) {
            boolean bl3 = tr2_2.o();
            if (bl3 && object2 != null) {
                object3 = b;
                bl3 = ((jo_2)object3).n();
                n4 = -1082130432;
                float f5 = -1.0f;
                if (bl3) {
                    boolean bl4 = Intrinsics.areEqual((Float)object2, f5);
                    if (bl4) {
                        object = tr2_2.d();
                        string2 = ((kr2_2)object).r;
                    } else {
                        string2 = qz2_0.m((Float)object2);
                    }
                } else {
                    bl3 = Intrinsics.areEqual((Float)object2, f5);
                    if (bl3) {
                        float f6 = mz3_0.J((String)object);
                        object = qz2_0.m(Float.valueOf(f6));
                    } else {
                        object = qz2_0.m((Float)object2);
                    }
                    if (object != null) {
                        object2 = "[0-9]";
                        object3 = "X";
                        string2 = oo1_1.a((String)object2, (String)object, (String)object3);
                    }
                }
            }
        } else if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            float f7 = mz3_0.J((String)object3);
            object = Float.valueOf(f7);
            string2 = qz2_0.m((Float)object);
        }
        return string2;
    }

    public static String g() {
        Object object;
        boolean bl2 = tr2_2.n(og1_1.c());
        if (bl2) {
            Object object2 = tr2_2.b();
            if (object2 != null && (object2 = ((EarlyAccessBannerData)object2).getEarlyAccessBanner()) != null) {
                object2 = ((EarlyAccessBanner)object2).getSaleSubTitle();
            } else {
                bl2 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            return object2;
        }
        bl2 = tr2_2.i();
        object = bl2 ? tr2_2.d().l : ((bl2 = ((jo_2)(object = b)).n()) ? tr2_2.d().n : tr2_2.d().m);
        return object;
    }

    public static void h(LottieAnimationView object) {
        if (object != null) {
            object.setVisibility(0);
            ((LottieAnimationView)((Object)object)).f();
            TR2$a tR2$a = new TR2$a((LottieAnimationView)((Object)object));
            object = ((LottieAnimationView)((Object)object)).e.b;
            ((nw)((Object)object)).addListener(tR2$a);
        }
    }

    public static boolean i() {
        qr2_1 qr2_12;
        qr2_1 qr2_13;
        boolean bl2 = tr2_2.r();
        if (bl2 && (qr2_13 = c) == (qr2_12 = qr2_1.DURING_SALE)) {
            bl2 = true;
        } else {
            bl2 = false;
            qr2_13 = null;
        }
        return bl2;
    }

    public static boolean j(boolean bl2) {
        bl2 = (bl2 = tr2_2.u(bl2)) && (bl2 = tr2_2.i());
        return bl2;
    }

    public static boolean l(ScreenType object) {
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "screenType");
        object = CustomerStoreType.a("rilfnl_v1", object);
        Object object3 = tr2_2.b();
        boolean bl3 = false;
        if (object3 != null) {
            object3 = ((EarlyAccessBannerData)object3).getEnableEarlyAccess();
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object2);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2 && (object3 = c) == (object2 = qr2_1.PRE_SALE)) {
            boolean bl4;
            object3 = tr2_2.b();
            if (object3 != null && (object3 = ((EarlyAccessBannerData)object3).getEarlyAccessBanner()) != null) {
                object3 = ((EarlyAccessBanner)object3).getEnableClosetBanner();
                object2 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object3, object2);
            } else {
                bl2 = false;
                object3 = null;
            }
            if (bl2 && (bl4 = mz3_0.y((String)object))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static boolean m() {
        boolean bl2;
        Object object;
        Object object2 = CustomerStoreType.a;
        Object object3 = ScreenType.SCREEN_PDP;
        object2 = CustomerStoreType.a("rilfnl_v1", (ScreenType)((Object)object3));
        object3 = tr2_2.b();
        boolean bl3 = false;
        if (object3 != null) {
            object3 = ((EarlyAccessBannerData)object3).getEnableEarlyAccess();
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2 && (object3 = c) == (object = qr2_1.PRE_SALE)) {
            boolean bl4;
            object3 = tr2_2.b();
            if (object3 != null && (object3 = ((EarlyAccessBannerData)object3).getEarlyAccessBanner()) != null) {
                object3 = ((EarlyAccessBanner)object3).getEnablePDPBanner();
                object = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object3, object);
            } else {
                bl2 = false;
                object3 = null;
            }
            if (bl2 && (bl4 = mz3_0.y((String)object2))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static boolean n(boolean bl2) {
        boolean bl3;
        boolean bl4;
        Object object;
        Object object2 = CustomerStoreType.a;
        Object object3 = ScreenType.SCREEN_PLP;
        object2 = CustomerStoreType.a("rilfnl_v1", object3);
        object3 = tr2_2.b();
        boolean bl5 = false;
        if (object3 != null) {
            object3 = ((EarlyAccessBannerData)object3).getEnableEarlyAccess();
            object = Boolean.TRUE;
            bl4 = Intrinsics.areEqual(object3, object);
        } else {
            bl4 = false;
            object3 = null;
        }
        if (bl4 && (object3 = c) == (object = qr2_1.PRE_SALE) && (bl3 = mz3_0.y((String)object2)) && !bl2) {
            bl5 = true;
        }
        return bl5;
    }

    public static boolean o() {
        qr2_1 qr2_12;
        qr2_1 qr2_13;
        boolean bl2 = tr2_2.r();
        if (bl2 && (qr2_13 = c) == (qr2_12 = qr2_1.PRE_SALE)) {
            bl2 = true;
        } else {
            bl2 = false;
            qr2_13 = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean p(boolean bl2) {
        boolean bl3 = tr2_2.w(bl2);
        if (!bl3) return false;
        bl3 = tr2_2.o();
        if (!bl3) return false;
        if (!bl2) return true;
        kr2_2 kr2_22 = tr2_2.d();
        bl2 = kr2_22.b;
        if (!bl2) return false;
        return true;
    }

    public static boolean q() {
        boolean bl2 = tr2_2.o();
        bl2 = bl2 || (bl2 = tr2_2.i());
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean r() {
        ld3_2 ld3_22;
        String string2;
        Object object = tr2_2.d();
        boolean bl2 = ((kr2_2)object).a;
        if (!bl2) return false;
        object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) != 0) return false;
        String string3 = od3_2.a();
        n3 = (int)(Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0);
        if (n3 != 0) return false;
        string3 = ld3_22.getStoreId();
        bl2 = Intrinsics.areEqual(object, string3);
        if (!bl2) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean s(boolean bl2) {
        boolean bl3 = tr2_2.r();
        if (!bl3) return false;
        kr2_2 kr2_22 = tr2_2.d();
        bl3 = kr2_22.t;
        if (!bl3) return false;
        if (bl2) {
            kr2_2 kr2_23 = tr2_2.d();
            bl2 = kr2_23.b;
            if (!bl2) return false;
        }
        if (!(bl2 = tr2_2.q())) return false;
        return true;
    }

    public static boolean t(boolean bl2) {
        bl2 = (bl2 = tr2_2.u(bl2)) && (bl2 = tr2_2.q());
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean u(boolean bl2) {
        boolean bl3 = tr2_2.r();
        if (!bl3) return false;
        kr2_2 kr2_22 = tr2_2.d();
        bl3 = kr2_22.d;
        if (!bl3) return false;
        if (!bl2) return true;
        kr2_2 kr2_23 = tr2_2.d();
        bl2 = kr2_23.b;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean v(boolean bl2) {
        boolean bl3 = tr2_2.w(bl2);
        if (!bl3) return false;
        bl3 = tr2_2.q();
        if (!bl3) return false;
        if (!bl2) return true;
        kr2_2 kr2_22 = tr2_2.d();
        bl2 = kr2_22.b;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean w(boolean bl2) {
        boolean bl3 = tr2_2.r();
        if (!bl3) return false;
        kr2_2 kr2_22 = tr2_2.d();
        bl3 = kr2_22.c;
        if (!bl3) return false;
        if (!bl2) return true;
        kr2_2 kr2_23 = tr2_2.d();
        bl2 = kr2_23.b;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean y(boolean bl2) {
        boolean bl3 = tr2_2.r();
        if (!bl3) return false;
        kr2_2 kr2_22 = tr2_2.d();
        bl3 = kr2_22.e;
        if (!bl3) return false;
        if (!bl2) return true;
        kr2_2 kr2_23 = tr2_2.d();
        bl2 = kr2_23.b;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void z(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView object, String object2, Float object3, String string2, String objectArray, boolean bl2, boolean bl3, boolean bl4, TextView textView4, yt2_2 yt2_22, ScreenType screenType, int n3) {
        block42: {
            float f5;
            int n4;
            int n7;
            boolean bl5;
            boolean bl6;
            Object object4;
            View view2;
            block51: {
                block43: {
                    block50: {
                        Object object5;
                        block49: {
                            block48: {
                                Object object6;
                                block41: {
                                    int n8;
                                    block40: {
                                        float f6;
                                        block47: {
                                            Object object7;
                                            block39: {
                                                NumberFormatException numberFormatException2;
                                                int n10;
                                                TextView textView5;
                                                block46: {
                                                    block45: {
                                                        String string3;
                                                        int n14;
                                                        Object object8;
                                                        Object object9;
                                                        Object object10;
                                                        TextView textView6;
                                                        int n15;
                                                        Object object11;
                                                        Object object12;
                                                        int n16;
                                                        Object object13;
                                                        int n17;
                                                        TextView textView7;
                                                        block44: {
                                                            view2 = view;
                                                            object4 = textView;
                                                            textView7 = textView2;
                                                            textView5 = textView3;
                                                            object7 = yt2_22;
                                                            object6 = screenType;
                                                            n17 = n3;
                                                            object13 = null;
                                                            n16 = n3 & 0x10;
                                                            object12 = n16 != 0 ? null : object;
                                                            n16 = n17 & 0x100;
                                                            if (n16 != 0) {
                                                                n16 = 0;
                                                                object11 = null;
                                                            } else {
                                                                object11 = objectArray;
                                                            }
                                                            n15 = n17 & 0x400;
                                                            bl6 = n15 != 0 ? false : bl3;
                                                            n15 = n17 & 0x800;
                                                            bl5 = n15 != 0 ? false : bl4;
                                                            textView6 = (n17 &= 0x1000) != 0 ? null : textView4;
                                                            object10 = "screenName";
                                                            Intrinsics.checkNotNullParameter(object7, (String)object10);
                                                            object9 = "screenType";
                                                            Intrinsics.checkNotNullParameter(object6, (String)object9);
                                                            if (view2 == null) break block42;
                                                            object9 = object2;
                                                            object8 = tr2_2.f((String)object2, (Float)object3, (String)object11, object6);
                                                            n14 = 8;
                                                            if (object8 == null) break block43;
                                                            view2.setVisibility(0);
                                                            object6 = tr2_2.d().r;
                                                            n8 = Intrinsics.areEqual(object8, object6);
                                                            object9 = "";
                                                            if (n8 == 0) break block44;
                                                            if (object4 != null) {
                                                                object7 = tr2_2.d().r;
                                                                object4.setText((CharSequence)object7);
                                                            }
                                                            if (object4 != null) {
                                                                object4.setContentDescription((CharSequence)object9);
                                                            }
                                                            if (object4 != null) {
                                                                n7 = 2;
                                                                f6 = 2.8E-45f;
                                                                object4.setMaxLines(n7);
                                                            }
                                                            if (object4 != null) {
                                                                object4.setSingleLine(false);
                                                            }
                                                            if (textView7 != null) {
                                                                textView7.setVisibility(n14);
                                                            }
                                                            if (textView5 != null) {
                                                                textView5.setVisibility(n14);
                                                            }
                                                            object5 = object12;
                                                            int n18 = 8;
                                                            break block39;
                                                        }
                                                        Intrinsics.checkNotNullParameter(object7, (String)object10);
                                                        object6 = yt2_2.PLP;
                                                        if (object7 != object6 && object7 != (object6 = yt2_2.PDP)) {
                                                            n7 = 0;
                                                            f6 = 0.0f;
                                                            object7 = null;
                                                        } else {
                                                            n7 = 1;
                                                            f6 = Float.MIN_VALUE;
                                                        }
                                                        object11 = "format(...)";
                                                        object10 = "getString(...)";
                                                        if (n7 != 0) {
                                                            if (object4 != null) {
                                                                Object object14;
                                                                object7 = hv3_0.a;
                                                                n8 = view2 instanceof ConstraintLayout;
                                                                if (n8 != 0) {
                                                                    object6 = view2;
                                                                    object6 = (ConstraintLayout)view2;
                                                                } else {
                                                                    n8 = 0;
                                                                    object6 = null;
                                                                }
                                                                object5 = tr2_2.d().s;
                                                                object7.getClass();
                                                                Intrinsics.checkNotNullParameter(object5, "labelText");
                                                                object7 = "priceText";
                                                                Intrinsics.checkNotNullParameter(object8, (String)object7);
                                                                if (object6 == null || object12 == null || textView7 == null || textView6 == null) {
                                                                    string3 = object10;
                                                                    object14 = object11;
                                                                    object13 = object9;
                                                                    object3 = object8;
                                                                    object5 = object12;
                                                                    n10 = 8;
                                                                } else {
                                                                    float f7;
                                                                    object4.setVisibility(0);
                                                                    textView6.setVisibility(0);
                                                                    textView7.setVisibility(n14);
                                                                    float f8 = textView.getPaint().measureText((String)object5);
                                                                    object7 = textView6.getPaint();
                                                                    if (object7 != null) {
                                                                        f7 = f6 = object7.measureText(object8);
                                                                    } else {
                                                                        n7 = 0;
                                                                        f6 = 0.0f;
                                                                        object7 = null;
                                                                        f7 = 0.0f;
                                                                    }
                                                                    object = object7;
                                                                    object2 = object6;
                                                                    object6 = object12;
                                                                    string3 = object10;
                                                                    object10 = object2;
                                                                    object14 = object11;
                                                                    object13 = object9;
                                                                    n10 = 8;
                                                                    textView7 = textView2;
                                                                    object3 = object8;
                                                                    object8 = object5;
                                                                    object5 = object12;
                                                                    object12 = object3;
                                                                    object7 = new bv3_0((AppCompatImageView)((Object)object6), (ConstraintLayout)((Object)object2), f8, f7, textView, textView6, textView2, (String)object8, (String)object3);
                                                                    object6 = object7;
                                                                    Intrinsics.checkNotNullParameter(object7, "callback");
                                                                    object7 = object2.getViewTreeObserver();
                                                                    if (object7 != null) {
                                                                        object11 = object2;
                                                                        object10 = new UiUtils$calculateViewWidth$1((View)object2, (Function1)object);
                                                                        object7.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object10);
                                                                    }
                                                                }
                                                                object4.setContentDescription((CharSequence)object13);
                                                                n7 = 0;
                                                                f6 = 0.0f;
                                                                object4.setVisibility(0);
                                                                object6 = StringCompanionObject.INSTANCE;
                                                                object6 = textView.getContext();
                                                                n17 = R$string.acc_plp_bbs_price;
                                                                object6 = object6.getString(n17);
                                                                Intrinsics.checkNotNullExpressionValue(object6, string3);
                                                                n17 = 1;
                                                                object11 = new Object[n17];
                                                                object9 = object3;
                                                                object11[0] = object3;
                                                                object7 = object14;
                                                                He1.a((Object[])object11, n17, (String)object6, (String)object14, (TextView)object4);
                                                            } else {
                                                                string3 = object10;
                                                                object7 = object11;
                                                                object5 = object12;
                                                                n10 = 8;
                                                                n17 = 1;
                                                            }
                                                        } else {
                                                            string3 = object10;
                                                            object7 = object11;
                                                            object13 = object9;
                                                            object9 = object8;
                                                            object5 = object12;
                                                            n10 = 8;
                                                            n17 = 1;
                                                            if (object4 != null) {
                                                                object6 = tr2_2.d().s;
                                                                object4.setText((CharSequence)object6);
                                                                object4.setContentDescription((CharSequence)object13);
                                                                object4.setMaxLines(n17);
                                                                object4.setSingleLine(n17 != 0);
                                                                n8 = 0;
                                                                object6 = null;
                                                                object4.setVisibility(0);
                                                            } else {
                                                                n8 = 0;
                                                                object6 = null;
                                                            }
                                                            if (textView7 != null) {
                                                                textView7.setText((CharSequence)object9);
                                                                object4 = StringCompanionObject.INSTANCE;
                                                                object4 = textView2.getContext();
                                                                n16 = R$string.acc_plp_bbs_price;
                                                                object4 = object4.getString(n16);
                                                                Intrinsics.checkNotNullExpressionValue(object4, string3);
                                                                object11 = new Object[n17];
                                                                object11[0] = object9;
                                                                He1.a((Object[])object11, n17, (String)object4, (String)object7, textView7);
                                                            }
                                                        }
                                                        try {
                                                            object4 = tr2_2.d();
                                                            n4 = (int)(((kr2_2)object4).f ? 1 : 0);
                                                            if (n4 == 0 || (n4 = (int)(tr2_2.o() ? 1 : 0)) == 0 || (n4 = (int)(((jo_2)(object4 = b)).n() ? 1 : 0)) == 0 || string2 == null || (n4 = string2.length()) == 0) break block39;
                                                        }
                                                        catch (NumberFormatException numberFormatException2) {}
                                                        f5 = Float.parseFloat(string2);
                                                        n4 = (int)f5;
                                                        if (n4 <= 0) break block45;
                                                        if (textView5 == null) break block39;
                                                        object6 = new StringBuilder();
                                                        ((StringBuilder)object6).append(n4);
                                                        object10 = "% OFF";
                                                        ((StringBuilder)object6).append((String)object10);
                                                        object6 = ((StringBuilder)object6).toString();
                                                        textView5.setText((CharSequence)object6);
                                                        n8 = 0;
                                                        object6 = null;
                                                        textView5.setVisibility(0);
                                                        object6 = StringCompanionObject.INSTANCE;
                                                        object6 = textView3.getContext();
                                                        n17 = R$string.acc_plp_bbs_discount;
                                                        object6 = object6.getString(n17);
                                                        Intrinsics.checkNotNullExpressionValue(object6, string3);
                                                        object4 = n4;
                                                        n17 = 1;
                                                        object11 = new Object[n17];
                                                        n15 = 0;
                                                        object9 = null;
                                                        object11[0] = object4;
                                                        object4 = Arrays.copyOf(object11, n17);
                                                        object4 = String.format((String)object6, (Object[])object4);
                                                        Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                                                        textView5.setContentDescription((CharSequence)object4);
                                                        break block39;
                                                        break block46;
                                                    }
                                                    if (textView5 != null) {
                                                        textView5.setVisibility(n10);
                                                    }
                                                    break block39;
                                                }
                                                if (textView5 != null) {
                                                    textView5.setVisibility(n10);
                                                }
                                                object7 = yn3_0.a;
                                                ((yn3$a)object7).e(numberFormatException2);
                                            }
                                            if (bl2) break block47;
                                            n7 = 0;
                                            f6 = 0.0f;
                                            object7 = null;
                                            try {
                                                n4 = (int)(tr2_2.n(false) ? 1 : 0);
                                                if (n4 != 0) {
                                                    object4 = tr2_2.a();
                                                } else {
                                                    object4 = tr2_2.d();
                                                    object4 = ((kr2_2)object4).i;
                                                }
                                                n4 = Color.parseColor((String)object4);
                                                n7 = 8;
                                                f6 = 1.1E-44f;
                                                view2 = view;
                                            }
                                            catch (Exception exception) {}
                                            try {
                                                view.setBackgroundColor(n4);
                                                break block40;
                                            }
                                            catch (Exception exception) {
                                                break block41;
                                            }
                                            n7 = 8;
                                            f6 = 1.1E-44f;
                                            view2 = view;
                                            break block41;
                                        }
                                        n7 = 8;
                                        f6 = 1.1E-44f;
                                        view2 = view;
                                    }
                                    if (object5 == null) break block48;
                                    object4 = new da$a();
                                    ((da$a)object4).k = n8 = 1;
                                    ((da$a)object4).b = n8 = R$drawable.ic_sale_default;
                                    ((da$a)object4).c = n8;
                                    object6 = tr2_2.d();
                                    object6 = ((kr2_2)object6).q;
                                    ((da$a)object4).n = object6;
                                    ((da$a)object4).u = object5;
                                    object5 = ((da$a)object4).a();
                                    break block49;
                                }
                                object6 = yn3_0.a;
                                ((yn3$a)object6).e((Throwable)object4);
                                object4 = Unit.a;
                                break block50;
                            }
                            object5 = null;
                        }
                        object4 = object5;
                    }
                    if (object4 != null) break block42;
                    break block51;
                }
                n7 = 8;
                float f11 = 1.1E-44f;
            }
            if (!bl5) {
                if (bl6) {
                    n4 = 4;
                    f5 = 5.6E-45f;
                    view2.setVisibility(n4);
                } else {
                    view2.setVisibility(n7);
                }
            }
            object4 = Unit.a;
        }
    }

    public final boolean k(String object, boolean bl2) {
        boolean bl3;
        block2: {
            block3: {
                boolean bl4;
                bl3 = false;
                boolean bl5 = tr2_2.y(false);
                if (!bl5 || !(bl5 = tr2_2.i())) break block2;
                Object object2 = tr2_2.d();
                bl5 = ((kr2_2)object2).b;
                boolean bl6 = true;
                if (!bl5 && (bl4 = kotlin.text.b.i((String)object, (String)(object2 = "luxe"), bl6))) break block2;
                if (!bl2) break block3;
                object = tr2_2.d();
                bl4 = ((kr2_2)object).b;
                if (!bl4) break block2;
            }
            bl3 = true;
        }
        return bl3;
    }

    public final boolean x(boolean bl2) {
        boolean bl3;
        block2: {
            block3: {
                bl3 = false;
                boolean bl4 = tr2_2.y(false);
                if (!bl4 || !(bl4 = tr2_2.q())) break block2;
                if (!bl2) break block3;
                kr2_2 kr2_22 = tr2_2.d();
                bl2 = kr2_22.b;
                if (!bl2) break block2;
            }
            bl3 = true;
        }
        return bl3;
    }
}

