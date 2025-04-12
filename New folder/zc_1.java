/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from Zc
 */
public final class zc_1
extends fw_2
implements jy0_1 {
    public static final Zc$a Companion;
    public cy0_1 a;
    public final D b;
    public final hh3_2 c;
    public final ArrayList d;
    public LinearLayout e;
    public RecyclerView f;
    public int g;
    public Function1 h;
    public final String i;
    public final String j;
    public final NewCustomEventsRevamp k;
    public AjioTextView l;
    public boolean m;
    public Function1 n;

    static {
        Zc$a zc$a;
        Companion = zc$a = new Object();
    }

    public zc_1() {
        Object object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        Object object2 = new Zc$c(this);
        Object object3 = new Zc$d(this);
        Zc$e zc$e = new Zc$e(this);
        this.b = object = LW0.a(this, (yn1_2)object, (Function0)object2, (Function0)object3, zc$e);
        object = new xc_0(this);
        this.c = object = yr1_2.b((Function0)object);
        object = new ArrayList();
        this.d = object;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.i = object3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.j = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.k = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
    }

    public final void Oa() {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing())) {
            fragmentActivity = this.requireActivity();
            fragmentActivity.onBackPressed();
        }
    }

    public final kj2_1 Pa() {
        return (kj2_1)this.b.getValue();
    }

    public final void Qa(ArrayList object) {
        boolean n3 = ((ArrayList)object).isEmpty();
        String string2 = "emptyViewContainer";
        String string3 = "emiAllBanksList";
        Object object2 = null;
        if (n3) {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl2 = false;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl3 = false;
                object = null;
            }
            ai0_2.B((View)object);
            int n4 = this.g;
            string2 = "emptyViewContainerDescription";
            if (n4 == 0) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                ai0_2.i((View)object2);
            } else {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                ai0_2.B((View)object2);
            }
        } else {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl4 = false;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            ai0_2.i((View)object2);
        }
    }

    public final void Ra() {
        int n3;
        zc_1 zc_12 = this;
        Object object = this.d;
        if (object != null && (n3 = ((ArrayList)object).isEmpty()) == 0 && (n3 = this.m) == 0) {
            Object object2;
            String string2;
            Object object3;
            boolean bl2;
            object = ((ArrayList)object).iterator();
            n3 = 0;
            String string3 = null;
            String string4 = "";
            int n4 = 0;
            Object object4 = null;
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                int n7 = n4 + 1;
                string2 = null;
                if (n4 >= 0) {
                    if ((object3 = (PaymentInstrumentInfo)object3) != null) {
                        object4 = ((PaymentInstrumentInfo)object3).getNo_cost_emi_enabled();
                        object2 = Boolean.TRUE;
                        n4 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    if (n4 != 0) {
                        if (object3 != null) {
                            string2 = ((PaymentInstrumentInfo)object3).getName();
                        }
                        object4 = ",";
                        string4 = nb0_0.a(string4, string2, (String)object4);
                    }
                    n4 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            int n8 = string4.length();
            n4 = 1;
            if (n8 > 0) {
                n3 = 1;
            }
            if (n3 != 0 && (n8 = (int)le3_2.D(string4)) == (n3 = 44)) {
                string4 = le3_2.C(string4);
            }
            object2 = string4;
            n8 = zc_12.g;
            object = n8 == 0 ? "all" : "no cost emi";
            object3 = zc_12.k;
            String string5 = ((NewCustomEventsRevamp)object3).getEC_CHECKOUT_INTERACTIONS();
            string2 = "No cost EMI impression-".concat((String)object);
            String string6 = zc_12.i;
            String string7 = zc_12.j;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string5, string2, (String)object2, "checkout_interactions", "emi screen", "emi screen", string6, null, string7, false, null, 1536, null);
            string3 = zc_12.i;
            string4 = zc_12.j;
            NewCustomEventsRevamp newCustomEventsRevamp = zc_12.k;
            String string8 = "EMI interactions";
            string6 = "";
            String string9 = "checkout_interactions";
            string7 = "emi screen";
            String string10 = "emi screen";
            int n10 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string8, (String)object, string6, string9, string7, string10, string3, null, string4, false, null, n10, null);
            zc_12.m = n4;
        }
    }

    public final void Sa(String object) {
        PaymentInstrumentInfo paymentInstrumentInfo;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "query");
        ArrayList<PaymentInstrumentInfo> arrayList = new ArrayList<PaymentInstrumentInfo>();
        Object object2 = this.d.iterator();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            String string2;
            paymentInstrumentInfo = (PaymentInstrumentInfo)object2.next();
            if (paymentInstrumentInfo == null || (string2 = paymentInstrumentInfo.getName()) == null) continue;
            Object object3 = Locale.getDefault();
            String string3 = "getDefault(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            string2 = string2.toLowerCase((Locale)object3);
            object3 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
            if (string2 == null) continue;
            String string4 = ((String)object).toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, string3);
            string3 = string4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
            object3 = null;
            boolean bl4 = StringsKt.F(string2, string3, false);
            if (bl4 != (bl3 = true)) continue;
            arrayList.add(paymentInstrumentInfo);
        }
        object = this.a;
        if (object != null) {
            ((zv_0)object).a = arrayList;
        }
        if (object != null) {
            int n3;
            ((zv_0)object).c = n3 = -1;
            object = ((zv_0)object).b;
            object2 = ((zy0_1)object).c;
            bl2 = false;
            paymentInstrumentInfo = null;
            if (object2 != null) {
                ((PaymentInstrumentInfo)object2).setOfferDetails(null);
                ((PaymentInstrumentInfo)object2).setPriceValidation(null);
            }
            ((zy0_1)object).c = null;
        }
        if ((object = this.a) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        this.Qa(arrayList);
    }

    public final void a() {
        Function1 function1 = this.h;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBarListener");
            function1 = null;
        }
        Boolean bl2 = Boolean.TRUE;
        function1.invoke(bl2);
    }

    public final void g(String string2, String string3, String string4, Bundle bundle, String string5) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        String string6 = "payment accordian select";
        Intrinsics.checkNotNullParameter(string6, "eventAction");
        Intrinsics.checkNotNullParameter(string4, "eventLabel");
        String string7 = "payment_accordian_select";
        Intrinsics.checkNotNullParameter(string7, "eventName");
        String string8 = this.i;
        String string9 = this.j;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.k, string2, string6, string4, string7, "emi screen", "emi screen", string8, null, string9, false, null, 1536, null);
    }

    public final void h() {
        Function1 function1 = this.h;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBarListener");
            function1 = null;
        }
        Boolean bl2 = Boolean.FALSE;
        function1.invoke(bl2);
    }

    public final void o() {
        cy0_1 cy0_12 = this.a;
        if (cy0_12 != null) {
            cy0_12.notifyDataSetChanged();
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        Object object2;
        super.onActivityResult(n3, n4, (Intent)object);
        if (object != null && (object2 = this.getActivity()) != null && n3 == (n4 = 1004)) {
            Object object3 = object.getExtras();
            if (object3 != null) {
                object2 = this.Pa();
                String string2 = "transactionresponse";
                object3 = object3.getString(string2);
                int n7 = 13;
                object = new hj2_0((String)object3, n7, false, false);
                ((kj2_1)object2).c((hj2_0)object);
            }
            this.Oa();
        }
    }

    public final void onCreate(Bundle bundle) {
        int n3;
        super.onCreate(bundle);
        bundle = this.getArguments();
        if (bundle != null) {
            String string2 = "TAB_TYPE";
            n3 = bundle.getInt(string2);
        } else {
            n3 = 0;
            bundle = null;
        }
        this.g = n3;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_all_banks;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        hh3_2 hh3_22;
        Object object2;
        zc_1 zc_12 = this;
        Object object3 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n3 = R$id.emi_all_banks_list;
        Object object4 = (RecyclerView)view.findViewById(n3);
        this.f = object4;
        n3 = R$id.emi_empty_view_container;
        object4 = (LinearLayout)view.findViewById(n3);
        this.e = object4;
        n3 = R$id.emi_empty_view_descp;
        object3 = (AjioTextView)view.findViewById(n3);
        this.l = object3;
        int n4 = this.g;
        object3 = n4 == 0 ? this.Pa().m : this.Pa().n;
        ArrayList arrayList = zc_12.d;
        Object object5 = null;
        if (object3 != null) {
            object3 = object3.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = object4 = object3.next();
                object2 = (PaymentInstrumentInfo)object4;
                if (object2 != null) {
                    int n7 = -1;
                    int n8 = -1;
                    int n10 = Short.MAX_VALUE;
                    hh3_22 = null;
                    double d2 = 0.0;
                    object4 = PaymentInstrumentInfo.copy$default((PaymentInstrumentInfo)object2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, d2, null, false, null, null, null, null, null, null, null, null, null, null, n7, n8, n10, null);
                } else {
                    n3 = 0;
                    object4 = null;
                }
                arrayList.add(object4);
            }
        }
        n4 = arrayList.size();
        object4 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            object = (PaymentInstrumentInfo)arrayList.get(n3);
            object = object != null ? ((PaymentInstrumentInfo)object).getPriceValidation() : null;
            if (object == null) continue;
            object = (PaymentInstrumentInfo)arrayList.get(n3);
            if (object != null) {
                ((PaymentInstrumentInfo)object).setPriceValidation(null);
            }
            if ((object = (PaymentInstrumentInfo)arrayList.get(n3)) == null) continue;
            ((PaymentInstrumentInfo)object).setOfferDetails(null);
        }
        float f5 = this.Pa().o;
        hh3_22 = zc_12.c;
        Object object6 = object3 = hh3_22.getValue();
        object6 = (op2_2)object3;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        kj2_1 kj2_12 = this.Pa();
        object3 = object2;
        object4 = arrayList;
        object = this;
        zc_12.a = object2 = new cy0_1(arrayList, this, f5, (op2_2)object6, mu1_12, kj2_12);
        object4 = this.requireActivity();
        object3 = new LinearLayoutManager((Context)object4);
        object4 = zc_12.f;
        object = "emiAllBanksList";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n3 = 0;
            object4 = null;
        }
        ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object3);
        object3 = zc_12.f;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n4 = 0;
            object3 = null;
        }
        f5 = 1.1E-44f;
        int n14 = mz3_0.d(8);
        object4 = new wb3_0(n14);
        ((RecyclerView)object3).addItemDecoration((RecyclerView$n)object4);
        object3 = zc_12.f;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object5 = object3;
        }
        object3 = zc_12.a;
        ((RecyclerView)object5).setAdapter((RecyclerView$f)object3);
        zc_12.Qa(arrayList);
        object3 = ((op2_2)hh3_22.getValue()).l;
        object4 = this.getViewLifecycleOwner();
        n14 = 0;
        f5 = 0.0f;
        object = new vc_1(zc_12, 0);
        Zc$b zc$b = new Zc$b((Function1)object);
        ((LiveData)object3).e((mu1_1)object4, zc$b);
        object3 = ((op2_2)hh3_22.getValue()).H;
        if (object3 != null) {
            object4 = this.getViewLifecycleOwner();
            object = new wc_0(zc_12);
            zc$b = new Zc$b((Function1)object);
            ((LiveData)object3).e((mu1_1)object4, zc$b);
        }
        if ((object3 = zc_12.n) != null) {
            object4 = Boolean.TRUE;
            object3.invoke(object4);
        }
    }

    public final void t(int n3) {
        cy0_1 cy0_12 = this.a;
        if (cy0_12 != null) {
            cy0_12.c = n3;
        }
        if (cy0_12 != null) {
            cy0_12.notifyDataSetChanged();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(int n3) {
        Object object = this.Pa();
        TenantResponse tenantResponse = ((kj2_1)object).E;
        if (tenantResponse != null) {
            float f5;
            Object object2;
            int n4 = 0;
            Object object3 = null;
            int n7 = 3;
            object = new EMI(null, null, n7, null);
            Object object4 = this.a;
            if (object4 != null && (object4 = ((zv_0)object4).a) != null && (object4 = (PaymentInstrumentInfo)object4.get(n3)) != null) {
                object4 = ((PaymentInstrumentInfo)object4).getName();
            } else {
                n7 = 0;
                object4 = null;
            }
            ((EMI)object).setBankName((String)object4);
            object4 = this.a;
            if (object4 != null && (object4 = ((zv_0)object4).a) != null && (object4 = (PaymentInstrumentInfo)object4.get(n3)) != null) {
                object4 = ((PaymentInstrumentInfo)object4).getInstrument_code();
            } else {
                n7 = 0;
                object4 = null;
            }
            ((EMI)object).setCode((String)object4);
            object4 = oo2_0.a;
            Object object5 = this.a;
            if (object5 != null && (object5 = ((zv_0)object5).a) != null && (object2 = (PaymentInstrumentInfo)object5.get(n3)) != null) {
                object2 = ((PaymentInstrumentInfo)object2).getPriceValidation();
            } else {
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            float f6 = this.Pa().o;
            object5 = Float.valueOf(f6);
            object4.getClass();
            object4 = oo2_0.o((EMI)object, tenantResponse, (PriceValidation)object2, (Float)object5);
            object2 = ((PayNowRequest)object4).getNetPayableAmount();
            if (object2 != null) {
                f5 = ((Float)object2).floatValue();
            } else {
                object2 = this.Pa();
                f5 = ((kj2_1)object2).o;
            }
            float f7 = f5;
            object2 = this.h;
            if (object2 == null) {
                object2 = "progressBarListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            object2 = Boolean.TRUE;
            object3.invoke(object2);
            object2 = ((EMI)object).getBankName();
            object2 = kp1_0.c("EMI-", (String)object2);
            object = this.Pa();
            n4 = 1;
            ((kj2_1)object).d(n4, (String)object2, "emi screen", (String)object2);
            object3 = object2 = this.c.getValue();
            object3 = (op2_2)object2;
            object5 = this.Pa().s;
            object2 = this.Pa();
            HashSet hashSet = ((kj2_1)object2).w;
            ((op2_2)object3).i((PayNowRequest)object4, (PaymentInstruments)object5, tenantResponse, f7, hashSet);
        }
    }
}

