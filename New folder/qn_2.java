/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.AnonymousToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.Pancard;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseActivity$a;
import com.ril.ajio.view.BaseSplitActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from qN
 */
public final class qn_2
extends h51_0
implements BaseActivity$a,
View.OnClickListener,
FragmentTitlesInterface,
ik3_2,
pm_1 {
    public static final qn$a_0 Companion;
    public static final AjioCustomToolbar$DisplayMode t;
    public j3_0 f;
    public fo3 g;
    public nm_1 h;
    public ea2_1 i;
    public zo_0 j;
    public ex1_0 k;
    public String l;
    public FrameLayout m;
    public int n = -1;
    public Pancard o;
    public final hh3_2 p;
    public oa1_1 q;
    public final hh3_2 r;
    public final qN$b s;

    static {
        qn$a_0 qn$a_0;
        Companion = qn$a_0 = new Object();
        t = AjioCustomToolbar$DisplayMode.TITLE;
    }

    public qn_2() {
        qN$b qN$b;
        Object object = new in_2(this, 0);
        this.p = object = yr1_2.b((Function0)object);
        object = new jn_2(this);
        this.r = object = yr1_2.b((Function0)object);
        object = Looper.getMainLooper();
        this.s = qN$b = new qN$b(this, (Looper)object);
    }

    public final void F9(Pancard pancard) {
        this.o = pancard;
    }

    public final void H5(int n3) {
        this.Sa(n3);
    }

    public final void P6() {
        Object object = this.k;
        if (object != null) {
            boolean bl2;
            object = ((ex1_0)object).t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                object = null;
            }
            ((wx1_1)object).Z0 = bl2 = true;
        }
    }

    public final void Pa(Fragment object, String object2, boolean bl2) {
        boolean bl3 = true;
        if (object != null) {
            Object object3;
            Object object4 = this.m;
            if (object4 != null) {
                boolean bl4;
                boolean bl5;
                object4 = this.getChildFragmentManager();
                object4.getClass();
                a a2 = new a((FragmentManager)object4);
                object4 = "beginTransaction(...)";
                Intrinsics.checkNotNullExpressionValue(a2, (String)object4);
                if (bl2) {
                    int n3 = R$anim.activity_slide_up;
                    int n4 = R$anim.activity_slide_down;
                    a2.k(n3, n4, 0, 0);
                }
                if (!(bl5 = ((String)object2).equalsIgnoreCase((String)(object3 = "quickview"))) && !(bl4 = ((String)object2).equalsIgnoreCase((String)(object3 = "pan_card")))) {
                    int n7 = R$id.cart_container;
                    a2.j(n7, (Fragment)object, (String)object2);
                } else {
                    int n8 = R$id.cart_container;
                    a2.h(n8, (Fragment)object, (String)object2, (int)(bl3 ? 1 : 0));
                }
                a2.c((String)object2);
                a2.o(bl3, bl3);
            }
            int n10 = this.getChildFragmentManager().J();
            object2 = yn3_0.a;
            object = n10;
            object3 = new Object[bl3];
            object3[0] = object;
            ((yn3$a)object2).d("%s", object3);
            return;
        }
        object = new RuntimeException("Fragment is null");
        throw object;
    }

    public final void Qa() {
        boolean bl2;
        Object object = this.l;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
            boolean bl3;
            Object object2;
            int n3;
            Object object3;
            Object object4;
            block19: {
                object = new Ref$ObjectRef();
                object4 = new ArrayList();
                ((Ref$ObjectRef)object).element = object4;
                try {
                    object4 = this.l;
                }
                catch (Exception exception) {}
                object4 = Uri.parse((String)object4);
                object3 = "ids";
                object4 = object4.getQueryParameter((String)object3);
                if (object4 == null) break block19;
                int n4 = ((String)object4).length();
                if (n4 <= 0) break block19;
                object3 = ",";
                object3 = new String[]{object3};
                n3 = 6;
                object2 = null;
                object4 = StringsKt.a0((CharSequence)object4, object3, false, 0, n3);
                ((Ref$ObjectRef)object).element = object4;
            }
            if ((object4 = (Collection)((Ref$ObjectRef)object).element) != null && !(bl3 = object4.isEmpty())) {
                object4 = (hy3_0)this.p.getValue();
                bl3 = ((hy3_0)object4).p();
                object3 = "<set-?>";
                n3 = 3;
                object2 = null;
                int n7 = 1;
                String string2 = "getViewLifecycleOwner(...)";
                if (!bl3) {
                    object4 = AnonymousToken.getAccessToken();
                    bl3 = TextUtils.isEmpty((CharSequence)object4);
                    if (bl3) {
                        object = this.q;
                        if (object == null) {
                            object = "loginViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object2 = object;
                        }
                        ((oa1_1)object2).j("pdp screen");
                        return;
                    }
                    bl3 = ap_0.c();
                    if (bl3) {
                        object4 = this.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(object4, string2);
                        object4 = nu1_0.a((mu1_1)object4);
                        object3 = new rn_2(this, (Ref$ObjectRef)object, null);
                        Ae3.d((i90_0)object4, null, null, (Function2)object3, n3);
                    } else {
                        object = new Message();
                        ((Message)object).arg1 = n7;
                        object4 = this.Ra();
                        object4.getClass();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        ((g4_0)object4).f = object;
                        object = this.Ra();
                        object.getClass();
                        object4 = md3_0.c((jD3)object);
                        object3 = new f4_0((g4_0)object, null);
                        Ae3.d((i90_0)object4, null, null, (Function2)object3, n3);
                    }
                } else {
                    bl3 = ap_0.b();
                    if (bl3) {
                        object4 = this.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(object4, string2);
                        object4 = nu1_0.a((mu1_1)object4);
                        object3 = new sn_2(this, (Ref$ObjectRef)object, null);
                        Ae3.d((i90_0)object4, null, null, (Function2)object3, n3);
                    } else {
                        object = new Message();
                        ((Message)object).arg1 = n7;
                        object4 = this.Ra();
                        object4.getClass();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        ((g4_0)object4).f = object;
                        object = this.Ra();
                        object.getClass();
                        object4 = md3_0.c((jD3)object);
                        object3 = new e4_0((g4_0)object, null);
                        Ae3.d((i90_0)object4, null, null, (Function2)object3, n3);
                    }
                }
                return;
            }
            this.Ta();
            return;
        }
        this.Ta();
    }

    public final g4_0 Ra() {
        return (g4_0)this.r.getValue();
    }

    public final void Sa(int n3) {
        qn_2 qn_22 = this;
        int n4 = n3;
        int n7 = 0;
        Object object = null;
        int n8 = 1;
        int n10 = 0;
        Class<PaymentActivity> clazz = null;
        if (n3 != 0) {
            Bundle bundle = "pan_card";
            Object object2 = "getChildFragmentManager(...)";
            int n14 = 2;
            if (n3 != n14) {
                n14 = 3;
                if (n3 != n14) {
                    n8 = 4;
                    if (n3 != n8) {
                        n8 = 5;
                        if (n3 == n8) {
                            Object object3 = this.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                            Object object4 = this.j;
                            if (object4 == null) {
                                object4 = "cartSVM";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            } else {
                                clazz = object4;
                            }
                            ((zo_0)((Object)clazz)).b = object4 = qn_22.o;
                            object3 = ((FragmentManager)object3).E((String)bundle);
                            if (object3 == null || (n4 = (int)(((Fragment)object3).isAdded() ? 1 : 0)) == 0) {
                                object3 = new qh2_2();
                                qn_22.Pa((Fragment)object3, (String)bundle, false);
                            }
                        }
                    } else {
                        iv1_2 iv1_22 = new iv1_2();
                        String string2 = "bag screen";
                        clazz = "<set-?>";
                        Intrinsics.checkNotNullParameter(string2, (String)((Object)clazz));
                        iv1_22.l = string2;
                        Intrinsics.checkNotNullParameter(string2, (String)((Object)clazz));
                        iv1_22.m = string2;
                        iv1_22.s = this;
                        string2 = "coupon";
                        this.Pa(iv1_22, string2, false);
                    }
                } else {
                    Object object5 = this.k;
                    if (object5 != null && (object = ((ex1_0)object5).t) != null) {
                        object = ((wx1_1)object).h1;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = kc2_2.Companion;
                        if (object5 != null && (object5 = ((ex1_0)object5).t) != null) {
                            clazz = ((wx1_1)object5).h1;
                        }
                        object.getClass();
                        object5 = new Bundle();
                        object = "quickview";
                        object5.putSerializable((String)object, (Serializable)((Object)clazz));
                        clazz = new Class<PaymentActivity>();
                        ((Fragment)((Object)clazz)).setArguments((Bundle)object5);
                        qn_22.Pa((Fragment)((Object)clazz), (String)object, n8 != 0);
                    } else {
                        object5 = this.getActivity();
                        if (object5 != null && (n4 = (int)((object5 = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                            object5 = ab0_0.Companion;
                            object = this.requireActivity();
                            String string3 = "requireActivity(...)";
                            Intrinsics.checkNotNullExpressionValue(object, string3);
                            object5.getClass();
                            aB0$a.a((Activity)object);
                        }
                    }
                }
            } else {
                Object object6;
                Object object7 = h40_0.a;
                n4 = (int)(h40_0.J1() ? 1 : 0);
                Object object8 = "";
                if (n4 != 0) {
                    boolean bl2;
                    object7 = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(object7, (String)object2);
                    bundle = ((FragmentManager)object7).E((String)bundle);
                    if (bundle != null && (bl2 = bundle.isAdded())) {
                        object2 = rm2_0.a;
                        object2 = this.k;
                        if (object2 == null || (object2 = ((ex1_0)object2).bb()) == null || (object2 = ((Cart)object2).getTotalPrice()) == null || (object2 = ((Price)object2).getFormattedValue()) == null) {
                            object2 = object8;
                        }
                        Intrinsics.checkNotNullParameter(object2, "cartValue");
                        object6 = AnalyticsManager.Companion;
                        String string4 = av_0.a((AnalyticsManager$Companion)object6);
                        String string5 = av_0.a((AnalyticsManager$Companion)object6);
                        String string6 = bv_0.a((AnalyticsManager$Companion)object6);
                        Bundle bundle2 = E1.a("cart_value", (String)object2);
                        String string7 = cv_0.a((AnalyticsManager$Companion)object6);
                        NewCustomEventsRevamp newCustomEventsRevamp = rm2_0.a;
                        String string8 = "pan interactions";
                        String string9 = "proceed to payment";
                        String string10 = "";
                        String string11 = "pan_interactions";
                        int n15 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string8, string9, string10, string11, string4, string5, string6, bundle2, string7, false, null, n15, null);
                        object2 = new a((FragmentManager)object7);
                        object7 = "beginTransaction(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object7);
                        ((a)object2).i((Fragment)bundle);
                        ((a)object2).d();
                    }
                }
                object7 = qn_22.k;
                if (object7 != null) {
                    object7 = ((ex1_0)object7).bb();
                } else {
                    n4 = 0;
                    object7 = null;
                }
                if (object7 != null) {
                    object7 = qn_22.k;
                    if (object7 == null || (object7 = ((ex1_0)object7).bb()) == null || (object7 = ((Cart)object7).getSubTotal()) == null || (object7 = ((Price)object7).getFormattedValue()) == null) {
                        object7 = object8;
                    }
                    if ((bundle = qn_22.k) == null || (bundle = bundle.bb()) == null || (bundle = bundle.getDeliveryCost()) == null || (bundle = bundle.getFormattedValue()) == null) {
                        bundle = object8;
                    }
                    if ((object2 = qn_22.k) == null || (object2 = ((ex1_0)object2).bb()) == null || (object2 = ((Cart)object2).getTotalDiscounts()) == null || (object2 = ((Price)object2).getFormattedValue()) == null) {
                        object2 = object8;
                    }
                    object6 = qz2_0.z();
                    object7 = new String[]{object7, bundle, object2, object6};
                    bundle = new Bundle();
                    object2 = "values";
                    bundle.putStringArray((String)object2, (String[])object7);
                    object7 = qn_22.k;
                    if (object7 == null || (object7 = ((ex1_0)object7).bb()) == null || (object7 = ((Cart)object7).getDeliveryAddress()) == null || (object7 = ((CartDeliveryAddress)object7).getDeliverySlaType()) == null) {
                        object7 = object8;
                    }
                    object2 = "delivery_days";
                    bundle.putString((String)object2, (String)object7);
                    object7 = qn_22.k;
                    if (object7 != null && (object7 = ((ex1_0)object7).bb()) != null && (object7 = ((Cart)object7).getTotalPrice()) != null && (object7 = ((Price)object7).getFormattedValue()) != null) {
                        object8 = object7;
                    }
                    object7 = "total_cost";
                    bundle.putString((String)object7, (String)object8);
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    object7 = this.getActivity();
                    n4 = object7 instanceof BaseActivity;
                    if (n4 != 0 && (n4 = (int)((object7 = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                        object7 = StringCompanionObject.INSTANCE;
                        n4 = R$string.acc_error_message_page_load_fail;
                        object7 = hv3_0.K(n4);
                        n10 = R$string.something_wrong_msg;
                        clazz = hv3_0.K(n10);
                        bundle = new Object[n8];
                        bundle[0] = clazz;
                        object7 = xh2_0.a((Object[])bundle, n8, (String)object7, "format(...)");
                        object = this.getActivity();
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
                        object = (BaseActivity)object;
                        n8 = R$string.something_wrong_msg;
                        String string12 = hv3_0.K(n8);
                        ((BaseSplitActivity)object).showNotification(string12, (String)object7);
                    }
                    return;
                }
                object7 = qn_22.k;
                if (object7 != null) {
                    object7 = ((ex1_0)object7).bb();
                } else {
                    n4 = 0;
                    object7 = null;
                }
                f00.a = object7;
                object7 = qn_22.k;
                object2 = "cartViewModel";
                if (object7 != null) {
                    object7 = ((ex1_0)object7).t;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object7 = null;
                    }
                    object7 = ((wx1_1)object7).c1;
                } else {
                    n4 = 0;
                    object7 = null;
                }
                if (object7 != null) {
                    object7 = qn_22.k;
                    if (object7 != null) {
                        object7 = ((ex1_0)object7).t;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            clazz = object7;
                        }
                        clazz = ((wx1_1)((Object)clazz)).c1;
                    }
                    f00.b = clazz;
                }
                object7 = UrlHelper.Companion;
                clazz = ((UrlHelper$Companion)object7).getInstance();
                n10 = (int)(((UrlHelper)((Object)clazz)).isUAT1Domain() ? 1 : 0);
                object2 = "envmode";
                if (n10 != 0) {
                    bundle.putInt((String)object2, n8);
                } else {
                    n4 = (int)(((UrlHelper)(object7 = ((UrlHelper$Companion)object7).getInstance())).isUAT2Domain() ? 1 : 0);
                    if (n4 != 0) {
                        bundle.putInt((String)object2, n14);
                    } else {
                        bundle.putInt((String)object2, 0);
                    }
                }
                Object object9 = this.getActivity();
                clazz = PaymentActivity.class;
                object7 = new Intent((Context)object9, clazz);
                object7.putExtra("PaymentData", bundle);
                object7.putExtra("isOrderPayment", false);
                object = hv3_0.K(R$string.payment_details);
                object9 = "toolbarTitle";
                object7.putExtra((String)object9, (String)object);
                n7 = 14;
                qn_22.startActivityForResult((Intent)object7, n7);
            }
        } else {
            Object object10 = this.l;
            if (object10 != null) {
                object10 = this.f;
                if (object10 == null) {
                    object10 = "activityFragmentListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                } else {
                    clazz = object10;
                }
                clazz.startLoader();
                this.Qa();
                return;
            }
            this.Ta();
        }
    }

    public final void Ta() {
        boolean bl2;
        Object object = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getChildFragmentManager(...)");
        String string2 = "cart_list";
        object = ((FragmentManager)object).E(string2);
        String string3 = "cartSVM";
        Object object2 = null;
        if (object != null && (bl2 = ((Fragment)object).isAdded())) {
            this.k = object = (ex1_0)object;
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl3 = false;
                object = null;
            }
            if ((object = ((zo_0)object).a) != null) {
                ((co_1)object).c = null;
            }
        } else {
            boolean bl4;
            Object object3;
            object = this.getArguments();
            if (object != null) {
                object = this.requireArguments();
                object3 = "cart_tab_selection";
                bl4 = object.getBoolean((String)object3);
            } else {
                bl4 = false;
                object = null;
            }
            object3 = new co_1(bl4, null, null);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object2 = object;
            }
            ((zo_0)object2).a = object3;
            object = this.k;
            if (object == null) {
                ex1_0.Companion.getClass();
                this.k = object = new ex1_0();
            }
            object = this.k;
            boolean bl5 = true;
            this.Pa((Fragment)object, string2, bl5);
        }
    }

    public final String getAjioTitle() {
        return null;
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return t;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        Object object = this.k;
        if (object == null || (object = ((ex1_0)object).ab()) == null) {
            object = "";
        }
        return object;
    }

    public final Boolean hasBackButton() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean l() {
        Exception exception2;
        int n3;
        int n4 = this.isVisible();
        boolean bl2 = false;
        if (n4 == 0) return bl2;
        FragmentManager fragmentManager = this.getChildFragmentManager();
        n4 = fragmentManager.J();
        if (n4 > (n3 = 1)) {
            try {
                fragmentManager = this.getChildFragmentManager();
                fragmentManager.W();
                return true;
            }
            catch (Exception exception2) {}
        } else {
            if (n4 != n3) return bl2;
            fragmentManager = this.getChildFragmentManager();
            fragmentManager.W();
            return bl2;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityResult(int n3, int n4, Intent object) {
        int n10;
        Object object3;
        boolean bl2;
        super.onActivityResult(n3, n4, (Intent)object);
        int n7 = 14;
        if (n3 != n7) return;
        n3 = 0;
        Object object2 = null;
        n7 = -1;
        if (n4 != n7) {
            int n8 = 70;
            if (n4 == n8) {
                object2 = this.k;
                if (object2 == null) return;
                ((ex1_0)object2).xb();
                return;
            }
            n8 = 71;
            if (n4 != n8) {
                return;
            }
            ex1_0 ex1_02 = this.k;
            if (ex1_02 == null) return;
            ex1_02.sb(false);
            return;
        }
        n4 = 0;
        Object object4 = null;
        long l2 = 300L;
        if (object != null && (bl2 = object.hasExtra((String)(object3 = "IS_PLACE_ORDER_ERROR")))) {
            AJIOApplication.Companion.getClass();
            object3 = AJIOApplication$a.a();
            Object object5 = new jo_2((Context)object3);
            ((jo_2)object5).p(0);
            n3 = 0;
            ((jo_2)object5).o(0.0f);
            ap_0.c = null;
            object5 = ap_0.b;
            ((sw_0)object5).removePreference("cart_id");
            ap_0.a.removeCartGuId();
            object2 = "PLACE_ORDER_ORDER_ID";
            n7 = (int)(object.hasExtra((String)object2) ? 1 : 0);
            if (n7 != 0) {
                object4 = object.getStringExtra((String)object2);
            }
            try {
                while ((n3 = ((FragmentManager)(object2 = this.getChildFragmentManager())).J()) > 0) {
                    object2 = this.getChildFragmentManager();
                    ((FragmentManager)object2).W();
                }
            }
            catch (Exception exception) {
                object = yn3_0.a;
                object5 = "CartFragment";
                ((yn3$a)object).l((String)object5);
                ((yn3$a)object).e(exception);
            }
            object2 = new Handler();
            object = new mn_1(this, (String)object4);
            object2.postDelayed((Runnable)object, l2);
            return;
        }
        object2 = this.getChildFragmentManager();
        n3 = ((FragmentManager)object2).J();
        if (n3 > 0) {
            object2 = this.getChildFragmentManager();
            n10 = 1;
            ((FragmentManager)object2).X(n7, n10, null);
        }
        object2 = new Handler();
        n10 = 0;
        object = null;
        object4 = new en_2(this, 0);
        object2.postDelayed((Runnable)object4, l2);
    }

    public final void onAttach(Context object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = this.getActivity();
        boolean bl3 = object2 instanceof su_0;
        if (bl3) {
            object2 = (su_0)object2;
            object2.a();
        }
        if (bl2 = object instanceof j3_0) {
            object2 = object;
            this.f = object2 = (j3_0)object;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                this.g = object2 = (fo3)object;
                bl2 = object instanceof nm_1;
                if (bl2) {
                    object2 = object;
                    this.h = object2 = (nm_1)object;
                    bl2 = object instanceof ea2_1;
                    if (bl2) {
                        object = (ea2_1)object;
                        this.i = object;
                        object = this.getChildFragmentManager();
                        object2 = new fn_2(this);
                        object.o.add(object2);
                        return;
                    }
                    object = pn_2.b(object, " must implement ProductDetailListener");
                    object2 = new ClassCastException((String)object);
                    throw object2;
                }
                object = pn_2.b(object, " must implement CartClosetListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement ToolbarListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = cp_1.Companion;
        Object object2 = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
        object.getClass();
        cp$a.D((FragmentManager)object2);
        boolean bl2 = true;
        this.setHasOptionsMenu(bl2);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = zo_0.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, string2);
        object2 = "<this>";
        object3 = sw0_0.a(object4, (String)object2, object4, string2, string2);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object4).concat((String)object2);
            this.j = object = (zo_0)((pD3)object).a((yn1_2)object3, (String)object2);
            object = this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(object, "requireArguments(...)");
            object2 = "cart_deeplink_url";
            bl2 = object.containsKey((String)object2);
            if (bl2) {
                this.l = object = this.requireArguments().getString((String)object2);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.cart_list;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onPause() {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseActivity;
        if (bl2 && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing())) {
            fragmentActivity = this.getActivity();
            Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
            fragmentActivity = (BaseActivity)fragmentActivity;
            ((BaseActivity)fragmentActivity).A0 = null;
        }
        super.onPause();
    }

    public final void onResume() {
        int n3;
        int n4;
        super.onResume();
        Object object = this.getActivity();
        if (object != null) {
            tm3_0.d((FragmentActivity)object);
        }
        if ((n4 = (object = this.getActivity()) instanceof BaseActivity) != 0 && (n4 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
            object = this.getActivity();
            String string2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
            Intrinsics.checkNotNull(object, string2);
            object = (BaseActivity)object;
            ((BaseActivity)object).A0 = this;
        }
        if ((n4 = this.n) > (n3 = -1)) {
            object = this.getChildFragmentManager();
            String string3 = "getChildFragmentManager(...)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            int n7 = ((FragmentManager)object).J();
            int n8 = this.n;
            if (n7 > n8) {
                string3 = ((FragmentManager)object).I(n8).getName();
                n8 = 1;
                ((FragmentManager)object).X(n3, n8, string3);
            }
            this.n = n3;
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        if (object2 != null && (n3 = (object2 = this.requireActivity()).isFinishing()) == 0 && (object2 = this.getActivity()) != null) {
            object2.invalidateOptionsMenu();
        }
        object2 = this.g;
        object4 = "toolbarListener";
        Object object5 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = object2.getToolbar()) != null) {
            object3 = t;
            ((AjioCustomToolbar)object2).setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object3));
        }
        if ((object2 = this.g) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object2 = null;
        }
        int n4 = R$drawable.ic_close;
        object3 = this.getToolbarTitle();
        boolean bl2 = true;
        int n7 = 3;
        object2.showUpButton(bl2, n7, n4, (String)object3);
        n3 = R$id.cart_container;
        object = (FrameLayout)object.findViewById(n3);
        this.m = object;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object3 = oa1_1.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, (Class)object3, string2);
        object2 = "<this>";
        object4 = sw0_0.a((Class)object3, (String)object2, (Class)object3, string2, string2);
        Intrinsics.checkNotNullParameter(object4, (String)object2);
        object2 = object4.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.q = object = (oa1_1)((pD3)object).a((yn1_2)object4, (String)object2);
            object = this.Ra().c;
            object2 = this.getViewLifecycleOwner();
            object4 = new kn_2(this, 0);
            object3 = new qN$c((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
            object = this.Ra().e;
            object2 = this.getViewLifecycleOwner();
            int n8 = 1;
            object4 = new c6_0(this, n8);
            object3 = new qN$c((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
            object = this.q;
            if (object == null) {
                object = "loginViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object5 = object;
            }
            object = ((oa1_1)object5).t;
            object2 = this.getViewLifecycleOwner();
            object4 = new ln_2(this, 0);
            object5 = new qN$c((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
            this.Sa(0);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void s1(String string2) {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
            this.requireActivity().onBackPressed();
            Bundle bundle = new Bundle();
            object = h40_0.a;
            object = z40_0.Companion;
            bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("isAdsDisabledOnCouponLink");
            bundle.putBoolean("is_firebase_coupon_enabled", bl2);
            object = "isFromCouponScreen";
            boolean bl3 = true;
            bundle.putBoolean((String)object, bl3);
            kj0_1 kj0_12 = kj0_1.g();
            FragmentActivity fragmentActivity = this.getActivity();
            int n3 = R$id.cart_container;
            Boolean bl4 = Boolean.FALSE;
            int n4 = 1003;
            boolean bl5 = true;
            kj0_12.q(fragmentActivity, string2, n4, this, n3, null, bl5, bundle, null, null, null, null, bl4, bl4, 0);
        }
    }
}

