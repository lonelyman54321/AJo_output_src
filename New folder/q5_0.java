/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Q5
 */
public final class q5_0
extends Fragment
implements View.OnClickListener,
d0_0,
wg2_1,
OnNavigationClickListener,
iI0,
k0,
mq3_0 {
    public static final Q5$a Companion;
    public double a;
    public j3_0 b;
    public fo3 c;
    public vh3_2 d;
    public wc_1 e;
    public final hh3_2 f;
    public final ArrayList g;
    public m0 h;
    public RecyclerView i;
    public View j;
    public CustomToolbarViewMerger k;
    public View l;
    public ShimmerFrameLayout m;
    public int n;
    public int o;
    public float p;
    public float q;
    public final NewEEcommerceEventsRevamp r;
    public final NewCustomEventsRevamp s;
    public final String t;
    public final String u;

    static {
        Q5$a q5$a;
        Companion = q5$a = new Object();
    }

    public q5_0() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        int n3;
        Object object = new l5_0(this, 0);
        this.f = object = yr1_2.b((Function0)object);
        object = new ArrayList();
        this.g = object;
        this.n = n3 = -1;
        this.o = n3;
        object = AnalyticsManager.Companion;
        this.r = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.s = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.t = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.u = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void H9(AjioGiftCardModel object) {
        double d2;
        double d5 = ((AjioGiftCardModel)object).getAmount();
        double d7 = d5 - (d2 = 0.0);
        Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            this.a = d5 = ((AjioGiftCardModel)object).getAmount();
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioWalletVM");
                object = null;
            }
            ((wc_1)object).b();
        }
    }

    public final void Oa(int n3, Object iterator) {
        q5_0 q5_02 = this;
        int n4 = n3;
        Object object = iterator;
        ArrayList arrayList = this.g;
        int n7 = 2;
        int n8 = 1;
        int n10 = 3;
        String string2 = "ajioWalletAdapter";
        int n14 = 8;
        int n15 = 5;
        Object object2 = null;
        if (n3 != n8) {
            if (n3 != n7) {
                n7 = 4;
                if (n3 == n7 && (n4 = iterator instanceof ReferralFAQTransform) != 0) {
                    Object object3 = iterator;
                    object3 = (ReferralFAQTransform)((Object)iterator);
                    object = ((ReferralFAQTransform)object3).getFaqList();
                    int n16 = ((ArrayList)object).size();
                    if (n16 > 0) {
                        int n18 = arrayList.size();
                        n8 = n18 + 1;
                        Integer n17 = mz3_0.d(n14);
                        n0 n03 = new n0(n15, n17);
                        arrayList.add(n18, n03);
                        n14 = n18 + 2;
                        n0 n04 = new n0(n10, null);
                        arrayList.add(n8, n04);
                        object3 = ((ReferralFAQTransform)object3).getFaqList().iterator();
                        while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                            ReferralFAQInfo referralFAQInfo = (ReferralFAQInfo)object3.next();
                            n10 = n14 + 1;
                            n04 = new n0(n7, referralFAQInfo);
                            arrayList.add(n14, n04);
                            n14 = n10;
                        }
                        object3 = q5_02.h;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            object2 = object3;
                        }
                        ((RecyclerView$f)object2).notifyItemRangeInserted(n18, n14 -= n18);
                    }
                }
            } else {
                n4 = this.o;
                n8 = -1;
                if (n4 > n8 && n4 < (n8 = arrayList.size())) {
                    n4 = this.o;
                    Object object4 = arrayList.get(n4);
                    String string3 = "get(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, string3);
                    object4 = (n0)object4;
                    n8 = ((n0)object4).a;
                    if (n8 == n7) {
                        n7 = this.o;
                        arrayList.remove(n7);
                        ((n0)object4).b = iterator;
                        int n21 = this.o;
                        arrayList.add(n21, object4);
                        object4 = this.h;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            object2 = object4;
                        }
                        n4 = q5_02.o;
                        ((RecyclerView$f)object2).notifyItemChanged(n4);
                    }
                }
            }
        } else {
            Object object3;
            Object object4;
            int n18;
            Object object5;
            int n19;
            Object object6;
            arrayList.clear();
            double d2 = this.a;
            double d5 = 0.0;
            n4 = 0;
            Object object9 = null;
            double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (d7 > 0) {
                object6 = d2;
                n19 = 7;
                object5 = new n0(n19, object6);
                arrayList.add(0, object5);
                n18 = mz3_0.d(n14);
                object6 = n18;
                object9 = new n0(n15, object6);
                arrayList.add(n8, object9);
                n4 = 1;
            } else {
                n19 = mz3_0.d(17);
                object4 = n19;
                object6 = new n0(n15, object4);
                arrayList.add(0, object6);
            }
            n18 = n4 + 1;
            object4 = new n0(n8, object);
            arrayList.add(n18, object4);
            object = cp_1.Companion;
            object.getClass();
            boolean bl2 = cp$a.t();
            if (bl2) {
                object = q5_02.e;
                object3 = "ajioWalletVM";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    boolean bl3 = false;
                    object = null;
                }
                if ((object = ((wc_1)object).j) != null) {
                    object = ((AjioWalletTransform)object).isGiftCardLive();
                } else {
                    boolean bl4 = false;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                boolean bl5 = (Boolean)object;
                if (bl5) {
                    int n20 = n4 + 2;
                    n19 = mz3_0.d(12);
                    object4 = n19;
                    object6 = new n0(n15, object4);
                    arrayList.add(n20, object6);
                    n18 = n4 + 3;
                    object = q5_02.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        boolean bl6 = false;
                        object = null;
                    }
                    if ((object = ((wc_1)object).j) != null) {
                        object = ((AjioWalletTransform)object).getWalletType();
                    } else {
                        boolean bl7 = false;
                        object = null;
                    }
                    n8 = 6;
                    object9 = new n0(n8, object);
                    arrayList.add(n18, object9);
                }
            }
            if ((n4 = (int)(this.Sa() ? 1 : 0)) != 0) {
                n4 = n18 + 1;
                n8 = mz3_0.d(n14);
                object3 = n8;
                object = new n0(n15, object3);
                arrayList.add(n4, object);
                boolean bl8 = false;
                object = Float.valueOf(0.0f);
                object9 = new n0(n7, object);
                arrayList.add(n18 += n7, object9);
                q5_02.o = n18;
                object4 = q5_02.s;
                object5 = ((NewCustomEventsRevamp)object4).getEC_WIDGET_INTERACTION();
                String string4 = "widget view";
                String string5 = "referral widget";
                String string6 = "widget_view";
                String string7 = "ajio wallet screen";
                String string8 = "wallet screen";
                object9 = q5_02.t;
                object = q5_02.u;
                int n21 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, string4, string5, string6, string7, string8, (String)object9, null, (String)object, false, null, n21, null);
            }
            if ((object9 = q5_02.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object9;
            }
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
    }

    public final void Pa() {
        Object object = this.e;
        int n3 = 0;
        Object object2 = null;
        Object object3 = "ajioWalletVM";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        if ((object = ((wc_1)object).l) == null) {
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = object;
            }
            object = ((wc_1)object2).h;
            object = ((wc_1)object2).b.b((zr1_1)object, "ajioWallet");
            object3 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object3);
            object3 = ti_2.a();
            object = ((g53_0)object).e((Scheduler)object3);
            object3 = new Object();
            nc_0 nc_02 = new nc_0(0, (Function1)object3);
            object3 = new oc_2(0);
            pc_0 pc_02 = new pc_0(0, (Function1)object3);
            object = ((g53_0)object).f(nc_02, pc_02);
            object2 = ((wc_1)object2).c;
            ((t30_0)object2).b((yr0_2)object);
        } else {
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object = null;
            }
            object = ((wc_1)object).l;
            wc_1 wc_12 = this.e;
            if (wc_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = wc_12;
            }
            ((wc_1)object2).l = object;
            n3 = 4;
            this.Oa(n3, object);
        }
    }

    public final void Q3() {
        float f5;
        float f6;
        q5_0 q5_02 = this;
        tj2_0.e(AnalyticsManager.Companion, "AJIOWallet", "Go to Points", "ajio wallet screen");
        Object object = this.s;
        Object object2 = ((NewCustomEventsRevamp)object).getEC_WALLET_INTERACTION();
        String string2 = "ajio points";
        String string3 = "";
        String string4 = "ajio_wallet_points";
        String string5 = "wallet overview screen";
        String string6 = "wallet screen";
        String string7 = this.t;
        String string8 = this.u;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, string2, string3, string4, string5, string6, string7, null, string8, false, null, n3, null);
        Object object3 = w2_0.Companion;
        Object object4 = this.e;
        Object object5 = "ajioWalletVM";
        Object object6 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object4 = null;
            f6 = 0.0f;
        }
        if ((object4 = ((wc_1)object4).j) != null) {
            f6 = ((AjioWalletTransform)object4).getActivePoints();
            object4 = Float.valueOf(f6);
        } else {
            object4 = null;
            f6 = 0.0f;
        }
        object = q5_02.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object = null;
            f5 = 0.0f;
        }
        if ((object = ((wc_1)object).j) != null) {
            f5 = ((AjioWalletTransform)object).getPendingPoints();
            object = Float.valueOf(f5);
        } else {
            object = null;
            f5 = 0.0f;
        }
        object2 = q5_02.e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object2 = null;
        }
        object5 = (object5 = ((wc_1)object2).j) != null ? ((AjioWalletTransform)object5).getTncURL() : null;
        object3.getClass();
        object3 = new w2_0();
        object2 = new Bundle();
        float f7 = 0.0f;
        string2 = null;
        if (object4 != null) {
            f6 = ((Float)object4).floatValue();
        } else {
            f6 = 0.0f;
            object4 = null;
        }
        string3 = "ACTIVE_POINTS";
        object2.putFloat(string3, f6);
        if (object != null) {
            f7 = ((Float)object).floatValue();
        }
        object2.putFloat("PENDING_POINTS", f7);
        object2.putString("TnC", (String)object5);
        ((Fragment)object3).setArguments((Bundle)object2);
        object4 = q5_02.b;
        object5 = "activityFragmentListener";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object4 = null;
            f6 = 0.0f;
        }
        if ((object = q5_02.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object6 = object;
        }
        object5 = object6.y();
        j3$a.a((j3_0)object4, (Fragment)object5, (Fragment)object3, true, "ActivePointsFragment");
    }

    public final void Qa() {
        View view;
        Object object = this.m;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
            object = null;
        }
        if ((view = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerParent");
            view = null;
        }
        hv3_0.r0(object, view);
        object = this.e;
        if (object == null) {
            object = "ajioWalletVM";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ((wc_1)object2).b();
    }

    public final void R3() {
        q5_0 q5_02 = this;
        Object object = AnalyticsManager.Companion;
        Object object2 = "referral widget";
        tj2_0.e((AnalyticsManager$Companion)object, "referral card clicked", (String)object2, "ajio wallet screen");
        NewCustomEventsRevamp newCustomEventsRevamp = this.s;
        String string2 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION();
        String string3 = "referral widget";
        String string4 = "invite now";
        String string5 = "widget_interaction_referral_widget";
        String string6 = "wallet overview screen";
        String string7 = "wallet screen";
        String string8 = this.t;
        String string9 = this.u;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        object = this.b;
        Object object3 = null;
        Object object4 = "activityFragmentListener";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object = null;
        }
        if ((object2 = q5_02.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object2;
        }
        object3 = object3.y();
        object4 = gg2_1.Companion;
        float f5 = q5_02.p;
        float f6 = q5_02.q;
        object4.getClass();
        object4 = GG2$a.a(f5, f6);
        j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object4, true, "ReferralFragment");
    }

    public final void R7(int n3) {
        int n4;
        Object object;
        int n7 = this.n;
        int n8 = -1;
        if (n7 > n8 && n7 != n3 && (n8 = ((ArrayList)(object = this.g)).size()) > (n4 = this.n)) {
            Object object2 = (n0)((ArrayList)object).get(n4);
            n4 = 4;
            n8 = ((n0)object2).a;
            if (n4 == n8) {
                n8 = this.n;
                object = ((ArrayList)object).get(n8);
                object2 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object = ((n0)object).b;
                n8 = object instanceof ReferralFAQInfo;
                if (n8 != 0) {
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.referral.transform.ReferralFAQInfo");
                    object = (ReferralFAQInfo)object;
                    n8 = 0;
                    object2 = null;
                    ((ReferralFAQInfo)object).setExpanded(false);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ajioWalletAdapter");
                        n7 = 0;
                        object = null;
                    }
                    n8 = this.n;
                    ((RecyclerView$f)object).notifyItemChanged(n8);
                }
            }
        }
        this.n = n3;
    }

    public final void Ra(ReferralConfigCash object) {
        float f5;
        float f6;
        Object object2;
        int n3;
        wc_1 wc_12 = this.e;
        Float f7 = null;
        if (wc_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioWalletVM");
            n3 = 0;
            wc_12 = null;
        }
        wc_12.k = object;
        n3 = 0;
        wc_12 = null;
        if (object != null && (object2 = ((ReferralConfigCash)object).getReferee()) != null && (object2 = ((ReferrerCashData)object2).getTotalBonus()) != null) {
            f6 = ((Float)object2).floatValue();
        } else {
            f6 = 0.0f;
            object2 = null;
        }
        this.p = f6;
        if (object != null && (object2 = ((ReferralConfigCash)object).getReferrer()) != null && (object2 = ((ReferrerCashData)object2).getTotalBonus()) != null) {
            f6 = ((Float)object2).floatValue();
        } else {
            f6 = 0.0f;
            object2 = null;
        }
        this.q = f6;
        if (object != null && (object2 = ((ReferralConfigCash)object).getReferrer()) != null && (object2 = ((ReferrerCashData)object2).getTotalBonus()) != null) {
            f6 = ((Float)object2).floatValue();
        } else {
            f6 = 0.0f;
            object2 = null;
        }
        n3 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            if (object != null && (object = ((ReferralConfigCash)object).getReferrer()) != null) {
                f7 = ((ReferrerCashData)object).getTotalBonus();
            }
            int n4 = 2;
            this.Oa(n4, f7);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean Sa() {
        Object object = z40_0.Companion;
        Application application = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        object.getClass();
        object = z40$a.a((Context)application).a;
        String string3 = "referral_feature_enable";
        boolean bl2 = ((ao0_0)object).a(string3);
        if (!bl2) return false;
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = z40$a.a((Context)object).a;
        String string4 = "referrer_enable";
        bl2 = ((ao0_0)object).a(string4);
        if (!bl2) return false;
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = z40$a.a((Context)object).a;
        String string5 = "referral_widget_wallet_enable";
        bl2 = ((ao0_0)object).a(string5);
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final void Ta() {
        block14: {
            var1_1 = this.e;
            var2_2 = "ajioWalletVM";
            var3_3 = null;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var1_1 = null;
            }
            if ((var1_1 = var1_1.j) == null) {
                return;
            }
            var1_1 = new Bundle();
            var4_4 = z40_0.Companion;
            var4_4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var4_4).a;
            var5_5 = "non_transferable_cash_enable";
            var6_6 = var4_4.a(var5_5);
            if (!var6_6) ** GOTO lbl30
            var4_4 = this.e;
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                var6_6 = false;
                var4_4 = null;
                var7_7 = 0.0f;
            }
            if ((var4_4 = var4_4.j) != null) {
                var7_7 = var4_4.getTotalCash();
                var4_4 = Float.valueOf(var7_7);
            } else {
                while (true) {
                    var6_6 = false;
                    var4_4 = null;
                    var7_7 = 0.0f;
                    break block14;
                    break;
                }
lbl30:
                // 1 sources

                var4_4 = this.e;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                    var6_6 = false;
                    var4_4 = null;
                    var7_7 = 0.0f;
                }
                if ((var4_4 = var4_4.j) == null) ** continue;
                var7_7 = var4_4.getTransferableCash();
                var4_4 = Float.valueOf(var7_7);
            }
        }
        if (var4_4 != null) {
            var7_7 = var4_4.floatValue();
            var5_5 = "ajio_cash_balance";
            var4_4 = String.valueOf(var7_7);
            var1_1.putString(var5_5, (String)var4_4);
        }
        if ((var4_4 = this.e) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
            var6_6 = false;
            var4_4 = null;
            var7_7 = 0.0f;
        }
        if ((var4_4 = var4_4.j) != null) {
            var7_7 = var4_4.getActivePoints();
            var5_5 = "ajio_points_balance";
            var4_4 = String.valueOf(var7_7);
            var1_1.putString(var5_5, (String)var4_4);
        }
        if ((var4_4 = this.e) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
            var6_6 = false;
            var4_4 = null;
            var7_7 = 0.0f;
        }
        if ((var4_4 = var4_4.j) != null) {
            var7_7 = var4_4.getTopExpiringPointAmount();
            var5_5 = "points_expiry";
            var4_4 = String.valueOf(var7_7);
            var1_1.putString(var5_5, (String)var4_4);
        }
        if ((var4_4 = this.e) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
            var6_6 = false;
            var4_4 = null;
            var7_7 = 0.0f;
        }
        if ((var2_2 = var4_4.j) != null) {
            var3_3 = var2_2.getTopExpiringPointDate();
        }
        var1_1.putString("points_expiry_date", var3_3);
        vb0_0.a(AnalyticsManager.Companion, "ajio wallet screen", (Bundle)var1_1);
    }

    public final void Ua() {
        Object object = z40_0.Companion;
        Object object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        object.getClass();
        object = z40$a.a((Context)object2).a;
        boolean bl2 = ((ao0_0)object).a("non_transferable_cash_enable");
        object2 = "";
        String string2 = "customToolbarViewMerger";
        float f5 = 0.0f;
        Object object3 = null;
        Object object4 = "ajioWalletVM";
        Object object5 = null;
        if (bl2) {
            float f6;
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl2 = false;
                object = null;
                f6 = 0.0f;
            }
            if ((object = ((wc_1)object).j) != null) {
                f5 = ((AjioWalletTransform)object).getTotalWalletBalance();
            }
            if ((object = qz2_0.x(Float.valueOf(f5))) != null) {
                object2 = object;
            }
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
                f6 = 0.0f;
            }
            ((CustomToolbarViewMerger)object).setTitleText((String)object2);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object5 = object;
            }
            object = ((CustomToolbarViewMerger)object5).getFloatTitleTv();
            if (object != null) {
                int n3 = R$string.total_wallet_balance;
                string2 = hv3_0.K(n3);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(" ");
                ((StringBuilder)object3).append(string2);
                object2 = ((StringBuilder)object3).toString();
                object.setContentDescription((CharSequence)object2);
            }
        } else {
            float f7;
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl2 = false;
                object = null;
                f7 = 0.0f;
            }
            if ((object = ((wc_1)object).j) != null) {
                f7 = ((AjioWalletTransform)object).getTransferableCash();
            } else {
                bl2 = false;
                f7 = 0.0f;
                object = null;
            }
            wc_1 wc_12 = this.e;
            if (wc_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                wc_12 = null;
            }
            if ((object4 = wc_12.j) != null) {
                f5 = ((AjioWalletTransform)object4).getTotalPoints();
            }
            f7 += f5;
            object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object5 = object3;
            }
            object = qz2_0.x(Float.valueOf(f7));
            if (object != null) {
                object2 = object;
            }
            ((CustomToolbarViewMerger)object5).setTitleText((String)object2);
        }
    }

    public final void V6(String string2, boolean bl2) {
        q5_0 q5_02 = this;
        String string3 = string2;
        Object object = "eventLabel";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string6 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getEC_WALLET_INTERACTION();
        int n3 = 1536;
        String string7 = "gift_card_clicks";
        String string8 = "wallet screen";
        String string9 = "wallet screen";
        object = object2;
        object2 = string6;
        string6 = "gift card clicks";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, string6, string2, string7, string8, string9, string4, null, string5, false, null, n3, null);
        object = new sz_2();
        ((sz_2)object).c = bl2;
        object2 = "wallet screen";
        Intrinsics.checkNotNullParameter(object2, "calledFrom");
        ((sz_2)object).d = object2;
        object2 = this.e;
        string6 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioWalletVM");
            object2 = null;
        }
        if ((object2 = ((wc_1)object2).j) != null) {
            string6 = ((AjioWalletTransform)object2).getWalletType();
        }
        if (string6 == null) {
            string6 = "AJIO Wallet";
        }
        ((sz_2)object).r = string6;
        Intrinsics.checkNotNullParameter(q5_02, "ajioGiftCardListener");
        Intrinsics.checkNotNullParameter(q5_02, "<set-?>");
        ((sz_2)object).o = q5_02;
        object2 = this.requireActivity().getSupportFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, string3);
    }

    public final void l2() {
        q5_0 q5_02 = this;
        tj2_0.e(AnalyticsManager.Companion, "AJIOWallet", "Go to Cash", "ajio wallet screen");
        Object object = this.s;
        String string2 = ((NewCustomEventsRevamp)object).getEC_WALLET_INTERACTION();
        String string3 = "ajio cash";
        String string4 = "";
        String string5 = "ajio_wallet_cash";
        String string6 = "wallet overview screen";
        String string7 = "wallet screen";
        String string8 = this.t;
        String string9 = this.u;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n3, null);
        k5_0.Companion.getClass();
        k5_0 k5_02 = new k5_0();
        j3_0 j3_02 = this.b;
        Object object2 = null;
        String string10 = "activityFragmentListener";
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string10);
            j3_02 = null;
        }
        if ((object = q5_02.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string10);
        } else {
            object2 = object;
        }
        object2 = object2.y();
        j3$a.a(j3_02, (Fragment)object2, k5_02, true, "AjioCashDetailFragmentRefresh");
    }

    public final void onActivityCreated(Bundle object) {
        boolean bl2;
        super.onActivityCreated((Bundle)object);
        object = this.e;
        Object object2 = "ajioWalletVM";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((wc_1)object).e;
        Object object4 = this.getViewLifecycleOwner();
        Object object5 = new m5_0(this, 0);
        Q5$b q5$b = new Q5$b((Function1)object5);
        ((LiveData)object).e((mu1_1)object4, q5$b);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((wc_1)object).g;
        object4 = this.getViewLifecycleOwner();
        object5 = new n5_0(this, 0);
        q5$b = new Q5$b((Function1)object5);
        ((LiveData)object).e((mu1_1)object4, q5$b);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((wc_1)object).i;
        object4 = this.getViewLifecycleOwner();
        object5 = new o5_0(this);
        q5$b = new Q5$b((Function1)object5);
        ((LiveData)object).e((mu1_1)object4, q5$b);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object = ((wc_1)object).j) == null) {
            this.Qa();
        } else {
            this.Ua();
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            object = ((wc_1)object).j;
            int n3 = 1;
            this.Oa(n3, object);
            bl2 = this.Sa();
            if (bl2) {
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                if ((object = ((wc_1)object).k) == null) {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    object = ((wc_1)object3).f;
                    object = ((wc_1)object3).b.c((zr1_1)object);
                    object2 = qt2_2.c;
                    object = ((g53_0)object).h((Scheduler)object2);
                    object2 = ti_2.a();
                    object = ((g53_0)object).e((Scheduler)object2);
                    n3 = 0;
                    object2 = new qc_2(0);
                    object4 = new rc_0(0, (Function1)object2);
                    object2 = new sc_2(0);
                    object5 = new tc_0((sc_2)object2);
                    object = ((g53_0)object).f((o60_0)object4, (o60_0)object5);
                    object2 = ((wc_1)object3).c;
                    ((t30_0)object2).b((yr0_2)object);
                } else {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    object = ((wc_1)object3).k;
                    this.Ra((ReferralConfigCash)object);
                    this.Pa();
                }
            } else {
                this.Pa();
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        int n7 = 64;
        if (n3 == n7) {
            n3 = -1;
            if (n4 == n3) {
                Object object2;
                String string2;
                n3 = 0;
                Object object3 = null;
                if (object != null) {
                    n7 = 0;
                    string2 = null;
                    n4 = (int)(object.getBooleanExtra("IS_WALLET_TRANSFER_INITIATED", false) ? 1 : 0);
                    object2 = n4 != 0;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object = Boolean.TRUE;
                n4 = (int)(Intrinsics.areEqual(object2, object) ? 1 : 0);
                if (n4 != 0) {
                    Object object4;
                    k5_0.Companion.getClass();
                    object2 = new k5_0();
                    object = this.b;
                    string2 = "activityFragmentListener";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object = null;
                    }
                    if ((object4 = this.b) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object4;
                    }
                    object3 = object3.y();
                    n7 = 1;
                    object4 = "AjioCashDetailFragmentRefresh";
                    j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, n7 != 0, (String)object4);
                }
            }
        } else {
            super.onActivityResult(n3, n4, (Intent)object);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.b = object2 = (j3_0)object;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                this.c = object2 = (fo3)object;
            }
            if (bl2 = object instanceof vh3_2) {
                object = (vh3_2)object;
                this.d = object;
            }
            return;
        }
        object = pn_2.b(object, "must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        q5_0 q5_02 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.wallet_spends_container;
        if (n3 == n4) {
            tj2_0.e(AnalyticsManager.Companion, "AJIOWallet", "Go to spend history", "ajio wallet screen");
            Object object3 = this.s;
            String string2 = ((NewCustomEventsRevamp)object3).getEC_WALLET_INTERACTION();
            String string3 = "view history";
            String string4 = "";
            String string5 = "view_history";
            String string6 = "wallet overview screen";
            String string7 = "wallet screen";
            String string8 = this.t;
            String string9 = this.u;
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n7, null);
            object = new na3_2();
            object2 = this.b;
            Object object4 = null;
            String string10 = "activityFragmentListener";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n4 = 0;
                object2 = null;
            }
            if ((object3 = q5_02.b) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
            } else {
                object4 = object3;
            }
            object4 = object4.y();
            boolean bl2 = true;
            object3 = "SpendHistoryFragmentRefresh";
            j3$a.a((j3_0)object2, (Fragment)object4, (Fragment)object, bl2, (String)object3);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = (jo_2)this.f.getValue();
        boolean bl2 = true;
        ((sw_0)object).putPreference("MYACCOUNT_AJIO_CASH_EXPLORE_BTN", bl2);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = wc_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = Reflection.getOrCreateKotlinClass((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.e = object = (wc_1)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ajio_cash_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this);
        this.k = object;
        Intrinsics.checkNotNull(layoutInflater);
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
    }

    public final void onDestroy() {
        double d2;
        super.onDestroy();
        this.a = d2 = 0.0;
        j3_0 j3_02 = this.b;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.stopLoader();
    }

    public final void onNavigationClick() {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing()) && (fragmentActivity = this.getActivity()) != null) {
            fragmentActivity.onBackPressed();
        }
    }

    public final void onResume() {
        super.onResume();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.r;
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = newEEcommerceEventsRevamp.getPrevScreenType();
        this.s.newPushCustomScreenView("wallet overview screen", "wallet screen", string2, null, string3);
        this.Ta();
    }

    public final void onStop() {
        this.r.setPreviousScreenData("wallet overview screen", "wallet screen");
        super.onStop();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        int n3;
        Object object5;
        float f5;
        int n4;
        Object object6;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n7 = object2 instanceof AppCompatActivity;
        Object object7 = null;
        Object object8 = "customToolbarViewMerger";
        if (n7 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object6 = this.k;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n4 = 0;
                object6 = null;
                f5 = 0.0f;
            }
            object6 = ((CustomToolbarViewMerger)object6).getToolbar();
            object2.setSupportActionBar((Toolbar)object6);
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        object2.setNavigationClick();
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        n4 = R$drawable.ic_back_white_refresh;
        object6 = hv3_0.r(n4);
        int n8 = 2;
        CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object2, (Drawable)object6, null, n8, null);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_11);
        object2.setTitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_11);
        object2.setSubTitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        n4 = R$string.total_wallet_balance_refresh;
        object6 = hv3_0.K(n4);
        object2.setSubTitleText((String)object6);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        object2 = object2.getHeaderSubTitleTv();
        object6 = " ";
        if (object2 != null) {
            n8 = R$string.header_text;
            object5 = hv3_0.K(n8);
            n3 = R$string.total_wallet_balance_refresh;
            object4 = hv3_0.K(n3);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object5);
            ((StringBuilder)object3).append((String)object6);
            ((StringBuilder)object3).append((String)object4);
            object5 = ((StringBuilder)object3).toString();
            object2.setContentDescription((CharSequence)object5);
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        if ((object2 = object2.getFloatSubtitleTv()) != null) {
            n8 = R$string.title_text;
            object5 = hv3_0.K(n8);
            n3 = R$string.total_wallet_balance_refresh;
            object4 = hv3_0.K(n3);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object5);
            ((StringBuilder)object3).append((String)object6);
            ((StringBuilder)object3).append((String)object4);
            object6 = ((StringBuilder)object3).toString();
            object2.setContentDescription((CharSequence)object6);
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        n4 = 1102053376;
        f5 = 22.0f;
        object2.setFloatViewTitleTextSize(f5);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n7 = 0;
            object2 = null;
        }
        int bl2 = 0x41400000;
        float f6 = 12.0f;
        object2.setFloatViewSubtitleTextSize(f6);
        n7 = R$id.app_bar_layout;
        object2 = (AppBarLayout)object.findViewById(n7);
        if (object2 != null) {
            boolean bl3 = true;
            f6 = Float.MIN_VALUE;
            object2.setExpanded(bl3);
        }
        if (object2 != null) {
            int n10 = R$string.acc_page_header_wallet;
            object8 = hv3_0.K(n10);
            object2.setContentDescription((CharSequence)object8);
        }
        object6 = Looper.getMainLooper();
        object8 = new Handler((Looper)object6);
        n8 = 0;
        object5 = null;
        object6 = new P5(object2, 0);
        long l2 = 500L;
        object8.postDelayed((Runnable)object6, l2);
        object2 = this.d;
        if (object2 != null) {
            boolean bl4 = false;
            f6 = 0.0f;
            object8 = null;
            object2.showTabLayout(false);
        }
        n7 = R$id.ac_shimmer_view_parent;
        object2 = object.findViewById(n7);
        this.l = object2;
        n7 = R$id.ac_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n7);
        this.m = object2;
        n7 = R$id.wallet_spends_container;
        object2 = object.findViewById(n7);
        this.j = object2;
        n7 = R$id.aw_lp_rv;
        this.i = object = (RecyclerView)object.findViewById(n7);
        object6 = this.g;
        object8 = object;
        object5 = this;
        object4 = this;
        object3 = this;
        this.h = object = new m0((ArrayList)object6, this, this, this, this);
        object = this.i;
        object2 = "walletRV";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object6 = this.getContext();
        object8 = new WrapperLinearLayoutManager((Context)object6);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object8);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        if ((object2 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioWalletAdapter");
            n7 = 0;
            object2 = null;
        }
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.j;
        if (object == null) {
            object = "walletSpend";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object7 = object;
        }
        object7.setOnClickListener((View.OnClickListener)this);
    }

    public final void r2(float f5) {
        AnalyticsManager.Companion.getInstance().getGtmEvents().setScreenName("ajio wallet screen");
        ye3_0.a(f5);
        FragmentActivity fragmentActivity = this.getActivity();
        Intent intent = new Intent((Context)fragmentActivity, ReturnImpsActivity.class);
        fragmentActivity = new Bundle();
        fragmentActivity.putFloat("IMPS_AMOUNT", f5);
        fragmentActivity.putBoolean("TRANSFER_TO_BANK_FLOW", true);
        intent.putExtras((Bundle)fragmentActivity);
        this.startActivityForResult(intent, 64);
    }

    public final void z6() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "gift_card_t_and_c_url";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = ((ao0_0)object).b(string2)));
        if (bl2) {
            return;
        }
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        string2 = new Intent((Context)aJIOApplication, TermsAndConditionActivity.class);
        aJIOApplication = new Bundle();
        aJIOApplication.putString("url", (String)object);
        string2.putExtras((Bundle)aJIOApplication);
        this.startActivity((Intent)string2);
    }
}

