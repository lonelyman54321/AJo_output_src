/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.InputFilter
 *  android.text.InputFilter$AllCaps
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.appbar.AppBarLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.services.data.Cart.Coupon;
import com.ril.ajio.services.data.Cart.Coupon$VoucherRestriction;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QuerySingleData;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from IV1
 */
public final class iv1_2
extends Fragment
implements View.OnClickListener,
FragmentTitlesInterface,
rc0_1,
OnNavigationClickListener {
    public static final iv1$a_0 Companion;
    public final hh3_2 a;
    public final hh3_2 b;
    public EditText c;
    public TextView d;
    public AjioLoaderView e;
    public TextView f;
    public View g;
    public kc0_2 h;
    public j3_0 i;
    public vh3_2 j;
    public final NewCustomEventsRevamp k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public CustomToolbarViewMerger q;
    public qm_1 r;
    public pm_1 s;
    public RecyclerView t;
    public TextView u;
    public View v;
    public final D w;
    public List x;

    static {
        iv1$a_0 iv1$a_0;
        Companion = iv1$a_0 = new Object();
    }

    public iv1_2() {
        Object object = new gv1_2(0);
        this.a = object = yr1_2.b((Function0)object);
        object = new hv1_2(this);
        this.b = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.k = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.l = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.m = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.n = "";
        object = Reflection.getOrCreateKotlinClass(fc0_2.class);
        object2 = new IV1$c(this);
        IV1$d iV1$d = new IV1$d(this);
        IV1$e iV1$e = new IV1$e(this);
        this.w = object = LW0.a(this, (yn1_2)object, (Function0)object2, iV1$d, iV1$e);
    }

    public final void C1(Coupon coupon) {
        Object object;
        iv1_2 iv1_22 = this;
        if (coupon == null) {
            return;
        }
        Object object2 = this.r;
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null) {
            ((qm_1)object2).c = false;
        }
        object2 = iv1_22.a.getValue();
        String string2 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (UserInformation)object2;
        boolean bl3 = ((UserInformation)object2).isUserOnline();
        if (!bl3 && (object2 = coupon.getVoucherRestriction()) != null) {
            int n3 = object2.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3;
                object = (Coupon$VoucherRestriction)((ArrayList)object2).get(i3);
                if (object == null || (string3 = ((Coupon$VoucherRestriction)object).getRestrictionType()) == null) continue;
                object = ((Coupon$VoucherRestriction)object).getRestrictionType();
                Intrinsics.checkNotNullExpressionValue(object, "getRestrictionType(...)");
                object = ((String)object).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(object, "toLowerCase(...)");
                string3 = "new customer";
                boolean bl4 = StringsKt.F((CharSequence)object, string3, false);
                if (!bl4) continue;
                object2 = iv1_22.r;
                if (object2 == null) break;
                ((qm_1)object2).c = bl2 = true;
                break;
            }
        }
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object3 = coupon.getVoucherCode();
        ((GTMEvents)object2).pushButtonTapEvent("Applicable_coupon_selected", object3, "coupon screen");
        iv1_22.n = "selected";
        Bundle bundle = new Bundle();
        object3 = iv1_22.k;
        object2 = ((NewCustomEventsRevamp)object3).getCOUPON_CODE();
        string2 = coupon.getVoucherCode();
        bundle.putString((String)object2, string2);
        object2 = ((NewCustomEventsRevamp)object3).getCOUPON_TYPE();
        string2 = iv1_22.n;
        bundle.putString((String)object2, string2);
        string2 = ((NewCustomEventsRevamp)object3).getEC_COUPON_INTERACTIONS();
        object = coupon.getVoucherCode();
        object2 = "getVoucherCode(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        String string4 = iv1_22.l;
        String string5 = iv1_22.m;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, "apply coupon", (String)object, "apply_coupon_click", "coupon screen", "coupon screen", string4, bundle, string5, false, null, 1536, null);
        object3 = coupon.getVoucherCode();
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        iv1_22.Oa((String)object3);
    }

    public final void J5(Coupon coupon) {
        boolean bl2;
        iv1_2 iv1_22 = this;
        Object object = AnalyticsManager.Companion;
        String string2 = "coupon screen";
        String string3 = "NA_coupon_selected";
        String string4 = "view products";
        tj2_0.e((AnalyticsManager$Companion)object, string3, string4, string2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.k;
        String string5 = newCustomEventsRevamp.getEC_COUPON_INTERACTIONS();
        String string6 = this.l;
        String string7 = this.m;
        String string8 = "coupon screen clicks";
        String string9 = "shop now cta";
        String string10 = "coupon_shop_now";
        String string11 = "coupon screen";
        String string12 = "coupon screen";
        int n3 = 1664;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string8, string9, string10, string11, string12, string6, null, string7, false, null, n3, null);
        object = this.r;
        if (object != null) {
            ((qm_1)object).d = bl2 = true;
        }
        if ((object = iv1_22.s) != null) {
            string2 = coupon.getProductUrl();
            if (string2 == null) {
                bl2 = false;
                string2 = null;
            }
            object.s1(string2);
        }
    }

    public final void Oa(String object) {
        block9: {
            Object object2;
            Object object3;
            QuerySingleData querySingleData;
            int n3;
            int n4;
            block11: {
                block10: {
                    String string2;
                    int n7;
                    n4 = 1;
                    this.o = object;
                    if (object == null || (n3 = ((String)object).length()) == 0) break block9;
                    object = this.o;
                    querySingleData = null;
                    if (object != null) {
                        int n8 = ((String)object).length() - n4;
                        n7 = 0;
                        object3 = null;
                        boolean bl2 = false;
                        string2 = null;
                        while (n7 <= n8) {
                            int n10 = !bl2 ? n7 : n8;
                            n10 = ((String)object).charAt(n10);
                            int n14 = 32;
                            n10 = Intrinsics.compare(n10, n14);
                            n10 = n10 <= 0 ? 1 : 0;
                            if (!bl2) {
                                if (n10 == 0) {
                                    bl2 = true;
                                    continue;
                                }
                                n7 += n4;
                                continue;
                            }
                            if (n10 == 0) break;
                            n8 += -1;
                        }
                        object = com.jio.jioads.adinterfaces.a.a(n8, n4, n7, (String)object);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    this.o = object;
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        n3 = 0;
                        object = null;
                    }
                    ((AjioLoaderView)((Object)object)).startLoader();
                    object = (ed0_2)this.b.getValue();
                    object2 = this.o;
                    Intrinsics.checkNotNull(object2);
                    object3 = h40_0.a;
                    n7 = (int)(h40_0.d1() ? 1 : 0);
                    if (n7 == 0) break block10;
                    object3 = z40_0.Companion;
                    object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                    string2 = "employee_offer_restriction_enabled";
                    n7 = (int)(((ao0_0)object3).a(string2) ? 1 : 0);
                    if (n7 != 0) break block11;
                }
                n4 = 0;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter("coupon screen", "screenName");
            Intrinsics.checkNotNullParameter(object2, "couponCode");
            querySingleData = new QuerySingleData((String)object2);
            object2 = md3_0.c((jD3)object);
            object3 = new cd0_2((ed0_2)object, querySingleData, n4 != 0, null);
            n3 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object3, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Pa() {
        var1_1 /* !! */  = this.e;
        if (var1_1 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            var1_1 /* !! */  = null;
        }
        var1_1 /* !! */ .startLoader();
        var1_1 /* !! */  = (ed0_2)this.b.getValue();
        var2_2 = h40_0.a;
        var3_3 = h40_0.d1();
        if (!var3_3) ** GOTO lbl-1000
        var2_2 = z40_0.Companion;
        var2_2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var2_2).a;
        var4_4 = "employee_offer_restriction_enabled";
        var3_3 = var2_2.a((String)var4_4);
        if (var3_3) {
            var3_3 = true;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = false;
            var2_2 = null;
        }
        var1_1 /* !! */ .getClass();
        Intrinsics.checkNotNullParameter("coupon screen", "screenName");
        var4_4 = md3_0.c((jD3)var1_1 /* !! */ );
        var5_5 = new dd0_2((ed0_2)var1_1 /* !! */ , var3_3, null);
        Ae3.d((i90_0)var4_4, null, null, var5_5, 3);
    }

    public final void Qa(String object) {
        Object object2 = this.getContext();
        String string2 = null;
        object2 = object2 != null ? UserInformation.getInstance((Context)object2) : null;
        Object object3 = this.requireActivity().getSupportFragmentManager();
        fv1_2 fv1_22 = new fv1_2(this, (String)object);
        String string3 = "verify_ril_profile_success";
        ((FragmentManager)object3).h0(string3, this, fv1_22);
        object3 = new hw3_0();
        ((DialogFragment)object3).setCancelable(false);
        fv1_22 = new Bundle();
        string3 = object2 != null ? ((UserInformation)object2).getUserPhoneNumber() : null;
        String string4 = "INTENT_USER_PHONE_NUMBER";
        fv1_22.putString(string4, string3);
        if (object2 != null) {
            string2 = ((UserInformation)object2).getUserEmailId();
        }
        fv1_22.putString("INTENT_USER_EMAIL_ID", string2);
        fv1_22.putBoolean("INTENT_COUPON_FRAUD_REDUCTION_FLOW", true);
        fv1_22.putString("INTENT_COUPON_CODE", (String)object);
        ((Fragment)object3).setArguments((Bundle)fv1_22);
        object = this.requireActivity().getSupportFragmentManager();
        ((DialogFragment)object3).show((FragmentManager)object, "UpdateProfileOtpBottomSheetFragment");
    }

    public final void e9(String string2) {
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
            int n3 = 2;
            CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)fragmentActivity, string2, n3);
        }
    }

    public final String getAjioTitle() {
        return "Apply coupon";
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return "Apply coupon";
    }

    public final Boolean hasBackButton() {
        return null;
    }

    public final void i1(Coupon object) {
        if (object == null) {
            return;
        }
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = ((Coupon)object).getVoucherCode();
        gTMEvents.pushButtonTapEvent("verify and apply click", string2, "coupon screen");
        object = ((Coupon)object).getVoucherCode();
        Intrinsics.checkNotNullExpressionValue(object, "getVoucherCode(...)");
        this.Qa((String)object);
    }

    public final void onActivityCreated(Bundle object) {
        block2: {
            super.onActivityCreated((Bundle)object);
            object = this.b;
            Object object2 = ((ed0_2)((hh3_2)object).getValue()).b;
            Object object3 = this.getViewLifecycleOwner();
            Object object4 = new dv1_2(this);
            IV1$b iV1$b = new IV1$b((Function1)object4);
            ((LiveData)object2).e((mu1_1)object3, iV1$b);
            object = ((ed0_2)((hh3_2)object).getValue()).c;
            object2 = this.getViewLifecycleOwner();
            object3 = new ev1_1(this);
            object4 = new IV1$b((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
            try {
                this.Pa();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(illegalArgumentException);
                Context context = this.getContext();
                if (context == null) break block2;
                ig0_0.Companion.getClass();
                context = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                int n3 = R$string.coupon_page_alert;
                object2 = hv3_0.K(n3);
                int n4 = 1;
                object3 = n4;
                int n7 = 8;
                ig0_0.b(context, (String)object2, (Integer)object3, n7);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.i = object2 = (j3_0)object;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object = (vh3_2)object;
                this.j = object;
                return;
            }
            object = pn_2.b(object, " Must implement TabListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " Must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        iv1_2 iv1_22 = this;
        Object object = "view";
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.applyCouponTv;
        if (n3 == n4) {
            object = this.c;
            String string2 = "couponBox";
            Iterator iterator = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((n3 = ((String)(object = object.getText().toString())).length()) > 0) {
                boolean bl2;
                iv1_22.n = "manual";
                Bundle bundle = new Bundle();
                NewCustomEventsRevamp newCustomEventsRevamp = iv1_22.k;
                object = newCustomEventsRevamp.getCOUPON_CODE();
                Object object2 = iv1_22.c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object2 = null;
                }
                object2 = object2.getText().toString();
                bundle.putString((String)object, (String)object2);
                object = newCustomEventsRevamp.getCOUPON_TYPE();
                object2 = iv1_22.n;
                bundle.putString((String)object, (String)object2);
                object2 = newCustomEventsRevamp.getEC_COUPON_INTERACTIONS();
                object = iv1_22.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                String string3 = object.getText().toString();
                String string4 = iv1_22.l;
                String string5 = iv1_22.m;
                String string6 = "apply coupon";
                Object object3 = "apply_coupon_click";
                Object object4 = "coupon screen";
                String string7 = "coupon screen";
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object2, string6, string3, (String)object3, (String)object4, string7, string4, bundle, string5, false, null, n7, null);
                object = h40_0.a;
                n3 = (int)(h40_0.d1() ? 1 : 0);
                boolean bl3 = true;
                if (n3 != 0) {
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    object2 = "employee_offer_restriction_enabled";
                    n3 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
                    if (n3 != 0 && (object = (Collection)iv1_22.x) != null && (n3 = (int)(object.isEmpty() ? 1 : 0)) == 0 && (object = iv1_22.x) != null) {
                        object = ((Iterable)object).iterator();
                        while (bl2 = object.hasNext()) {
                            object2 = (Coupon)object.next();
                            string6 = "toLowerCase(...)";
                            if (object2 != null && (string3 = ((Coupon)object2).getVoucherCode()) != null) {
                                object3 = Locale.ROOT;
                                string3 = string3.toLowerCase((Locale)object3);
                                Intrinsics.checkNotNullExpressionValue(string3, string6);
                            } else {
                                string3 = null;
                            }
                            object3 = iv1_22.c;
                            if (object3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                object3 = null;
                            }
                            object3 = object3.getText().toString();
                            object4 = Locale.ROOT;
                            object3 = ((String)object3).toLowerCase((Locale)object4);
                            Intrinsics.checkNotNullExpressionValue(object3, string6);
                            boolean bl4 = Intrinsics.areEqual(string3, object3);
                            if (!bl4 || (bl4 = ((Coupon)object2).isEmailVerified())) continue;
                            bl3 = ((Coupon)object2).isEmailVerified();
                        }
                    }
                }
                if (bl3) {
                    object = iv1_22.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        iterator = object;
                    }
                    object = iterator.getText().toString();
                    iv1_22.Oa((String)object);
                } else {
                    ai0_2.j(view);
                    object = iv1_22.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        iterator = object;
                    }
                    object = iterator.getText().toString();
                    iv1_22.Qa((String)object);
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        super.onCreate((Bundle)object);
        this.p = bl2 = og1_1.b();
        object = this.getParentFragment();
        if (object != null) {
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            object = oh2_0.a((Fragment)object, (String)object2, (rd3_0)object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
            object2 = qm_1.class;
            String string2 = "modelClass";
            object = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object, (Class)object2, string2);
            object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.r = object = (qm_1)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        menu2.clear();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        og1_1.g(this.p, false);
        this.setHasOptionsMenu(true);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.new_apply_coupon_fragment_layout_luxe;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        } else {
            n3 = R$layout.new_apply_coupon_fragment_layout_refresh;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
            object = new CustomToolbarViewMerger(this);
            this.q = object;
            Intrinsics.checkNotNull(layoutInflater);
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        super.onDestroy();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string2 = "coupon screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
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
        km_1.a(AnalyticsManager.Companion, "coupon screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        LinearLayoutManager linearLayoutManager;
        Object object3;
        int n4;
        Object object4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.j;
        Object object5 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            n7 = 0;
            object2 = null;
        }
        Object[] objectArray = null;
        object2.showTabLayout(false);
        n7 = og1_1.c();
        int n8 = 1;
        int n10 = 8;
        Object object6 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
        if (n7 != 0) {
            n7 = R$id.coupon_luxe_toolbar;
            object2 = (Toolbar)object.findViewById(n7);
            object4 = this.getActivity();
            n4 = object4 instanceof AppCompatActivity;
            if (n4 != 0) {
                object4 = this.getActivity();
                Intrinsics.checkNotNull(object4, (String)object6);
                ((AppCompatActivity)object4).setSupportActionBar((Toolbar)object2);
                object4 = this.getActivity();
                Intrinsics.checkNotNull(object4, (String)object6);
                object4 = (AppCompatActivity)object4;
                object6 = ((AppCompatActivity)object4).getSupportActionBar();
                if (object6 != null) {
                    ((ActionBar)object6).o();
                }
            }
            int n14 = R$drawable.ic_pdp_back;
            ((Toolbar)object2).setNavigationIcon(n14);
            n14 = R$string.back_button_text;
            object6 = this.getString(n14);
            ((Toolbar)object2).setNavigationContentDescription((CharSequence)object6);
            object6 = new zv1_1(this);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object6);
        } else {
            int n15;
            this.q = object2 = new CustomToolbarViewMerger(this);
            n4 = R$id.activity_cc_callme_parent;
            object4 = object.findViewById(n4);
            object3 = "findViewById(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
            ((CustomToolbarViewMerger)object2).initViews((View)object4);
            object2 = this.q;
            if (object2 != null) {
                object2 = ((CustomToolbarViewMerger)object2).getToolbar();
            } else {
                n7 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            object2.invalidate();
            object2 = this.getActivity();
            n7 = object2 instanceof AppCompatActivity;
            if (n7 != 0) {
                object2 = this.getActivity();
                Intrinsics.checkNotNull(object2, (String)object6);
                object2 = (AppCompatActivity)object2;
                object6 = this.q;
                if (object6 != null) {
                    object6 = ((CustomToolbarViewMerger)object6).getToolbar();
                } else {
                    n15 = 0;
                    object6 = null;
                }
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object6);
            }
            if ((object2 = this.q) != null) {
                ((CustomToolbarViewMerger)object2).setNavigationClick();
            }
            if ((object2 = this.q) != null) {
                ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n10);
            }
            if ((object2 = this.q) != null) {
                n15 = R$string.textview_coupon_discount_title_new;
                object6 = this.getString(n15);
                object4 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
                ((CustomToolbarViewMerger)object2).setTitleText((String)object6);
            }
            if ((object2 = this.q) != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                n15 = R$string.acc_page_header_offers;
                object6 = hv3_0.K(n15);
                object2.setContentDescription((CharSequence)object6);
            }
            object6 = Looper.getMainLooper();
            object2 = new Handler((Looper)object6);
            n4 = 0;
            object4 = null;
            object6 = new av1_2(this, 0);
            long l2 = 300L;
            object2.postDelayed((Runnable)object6, l2);
            n7 = R$id.app_bar_layout;
            object2 = (AppBarLayout)object.findViewById(n7);
            ((AppBarLayout)object2).setExpanded(n8 != 0);
        }
        n7 = R$id.couponListRv;
        this.t = object2 = (RecyclerView)object.findViewById(n7);
        n7 = R$id.enterCouponET;
        object2 = (EditText)object.findViewById(n7);
        this.c = object2;
        n7 = R$id.couponValidation;
        object2 = (TextView)object.findViewById(n7);
        this.d = object2;
        n7 = R$id.couponProgressBar;
        object2 = (AjioLoaderView)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.applyCouponTv;
        object2 = (TextView)object.findViewById(n7);
        this.f = object2;
        n7 = R$id.ag_add_tv;
        object2 = (TextView)object.findViewById(n7);
        this.u = object2;
        n7 = R$id.ajio_gift_card_view;
        object2 = object.findViewById(n7);
        this.v = object2;
        object2 = this.u;
        if (object2 != null) {
            n4 = 0;
            object4 = null;
            object6 = new bv1_2(this, 0);
            object2.setOnClickListener((View.OnClickListener)object6);
        }
        n7 = (int)(og1_1.b() ? 1 : 0);
        object6 = "applyCouponBtn";
        if (n7 != 0) {
            object2 = this.u;
            if (object2 != null) {
                n4 = object2.getPaintFlags();
                object3 = n4;
                Intrinsics.checkNotNull(object3);
                object2.setPaintFlags(n4 |= n10);
            }
            n7 = R$id.coupon_cancel;
            object = object.findViewById(n7);
            this.g = object;
            if (object != null) {
                object.setVisibility(n10);
            }
            if ((object = this.g) != null) {
                n10 = 0;
                linearLayoutManager = null;
                object2 = new cv1_2(this, 0);
                object.setOnClickListener((View.OnClickListener)object2);
            }
            if ((n3 = km_1.b((cp$a)(object = cp_1.Companion))) == 0) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object = null;
                }
                n7 = hv3_0.m(R$color.luxe_color_F5F5F5);
                object.setBackgroundColor(n7);
            }
        }
        object = new kc0_2(this);
        this.h = object;
        object = this.t;
        object2 = "couponRv";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object4 = this.requireActivity();
        linearLayoutManager = new LinearLayoutManager((Context)object4);
        ((RecyclerView)object).setLayoutManager(linearLayoutManager);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((object2 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
            n7 = 0;
            object2 = null;
        }
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        n3 = og1_1.b();
        object2 = "couponBox";
        if (n3 != 0) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object = object.getFilters();
            Intrinsics.checkNotNull(object);
            n10 = ((Object)object).length + n8;
            objectArray = Arrays.copyOf(object, n10);
            Intrinsics.checkNotNullExpressionValue(objectArray, "copyOf(...)");
            objectArray = (InputFilter[])objectArray;
            n3 = ((Object)object).length;
            linearLayoutManager = new InputFilter.AllCaps();
            objectArray[n3] = linearLayoutManager;
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object.setFilters(objectArray);
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object5 = object;
        }
        object = new jv1_1(this);
        object5.addTextChangedListener((TextWatcher)object);
    }
}

