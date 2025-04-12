/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkToolbarHandler;
import com.ril.ajio.payment.offer.OfferBottomSheetFragment;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from GU1
 */
public final class gu1_2
extends fw_2
implements vs1_2 {
    public final D a;
    public final hh3_2 b;
    public cu1_1 c;
    public PEProgressView d;
    public EditText e;
    public final ArrayList f;
    public OnNavigationClickListener g;

    public gu1_2() {
        ArrayList arrayList = Reflection.getOrCreateKotlinClass(kj2_1.class);
        gu1$b_0 gu1$b_0 = new gu1$b_0(this);
        GU1$c gU1$c = new GU1$c(this);
        GU1$d gU1$d = new GU1$d(this);
        arrayList = LW0.a(this, (yn1_2)((Object)arrayList), gu1$b_0, gU1$c, gU1$d);
        this.a = arrayList;
        arrayList = new ArrayList(this, 0);
        arrayList = yr1_2.b((Function0)((Object)arrayList));
        this.b = arrayList;
        this.f = arrayList = new ArrayList();
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
        return (kj2_1)this.a.getValue();
    }

    public final void a() {
        PEProgressView pEProgressView = this.d;
        if (pEProgressView != null) {
            pEProgressView.show();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(OfferDetails object) {
        Exception exception2;
        block4: {
            Object object2;
            block3: {
                boolean bl2;
                block2: {
                    try {
                        bl2 = this.isAdded();
                        if (!bl2) return;
                        if (object == null) break block2;
                        object2 = ((OfferDetails)object).getNetPayableAmount();
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                bl2 = false;
                object2 = null;
            }
            object = OfferBottomSheetFragment.Oa((OfferDetails)object, (Float)object2);
            object2 = this.getChildFragmentManager();
            String string2 = "OfferBottomSheetFragment";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    public final void h() {
        PEProgressView pEProgressView = this.d;
        if (pEProgressView != null) {
            pEProgressView.dismiss();
        }
    }

    public final void o() {
        cu1_1 cu1_12 = this.c;
        if (cu1_12 != null) {
            cu1_12.notifyDataSetChanged();
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

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnNavigationClickListener;
        if (bl2) {
            object = (OnNavigationClickListener)object;
            this.g = object;
            return;
        }
        object = pn_2.b(object, " Must implement OnNavigationClickListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        ((GTMEvents)object).pushOpenScreenEvent("single page checkout net banking list page");
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_netbanking_fragment;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_netbanking_fragment;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onResume() {
        super.onResume();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string2 = bv_0.a(analyticsManager$Companion);
        String string3 = cv_0.a(analyticsManager$Companion);
        newCustomEventsRevamp.newPushCustomScreenView("bank selection screen", "payment instrument", string2, null, string3);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f5;
        int n3;
        Object object;
        hh3_2 hh3_22;
        Object object2;
        int n4;
        Object object3;
        Object object4;
        int n7;
        gu1_2 gu1_22 = this;
        View view2 = view;
        Object object5 = "view";
        Intrinsics.checkNotNullParameter(view, (String)object5);
        super.onViewCreated(view, bundle);
        int n8 = og1_1.b();
        if (n8 != 0) {
            n8 = R$id.pesdk_toolbar;
            object5 = (Toolbar)view.findViewById(n8);
            n7 = R$id.pesdk_toolbar_title_tv;
            object4 = (TextView)view.findViewById(n7);
            object3 = hv3_0.K(R$string.search_other_bank);
            object4.setText((CharSequence)object3);
            n7 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object5).setNavigationIcon(n7);
            n7 = R$string.acc_back_from_net_banking;
            object4 = this.getString(n7);
            ((Toolbar)object5).setNavigationContentDescription((CharSequence)object4);
            n4 = 1;
            object4 = new wh1_2(this, n4);
            ((Toolbar)object5).setNavigationOnClickListener((View.OnClickListener)object4);
        } else {
            n8 = R$id.pesdk_layout_coordinator;
            object5 = view.findViewById(n8);
            Intrinsics.checkNotNull(object5);
            object4 = new PesdkToolbarHandler((View)object5);
            n8 = R$string.search_other_banks;
            object5 = this.getString(n8);
            object3 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            ((PesdkToolbarHandler)object4).setTitleText((String)object5);
            ((PesdkToolbarHandler)object4).setNavigationClick();
            object5 = this.getActivity();
            n8 = object5 instanceof AppCompatActivity;
            if (n8 != 0) {
                object5 = this.getActivity();
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                object5 = (AppCompatActivity)object5;
                object3 = ((PesdkToolbarHandler)object4).getToolbar();
                ((AppCompatActivity)object5).setSupportActionBar((Toolbar)object3);
            }
            if ((object5 = ((PesdkToolbarHandler)object4).getToolbar()) != null) {
                object5 = ((PesdkToolbarHandler)object4).getToolbar();
                Intrinsics.checkNotNull(object5);
                object5.invalidate();
            }
            if ((object5 = ((PesdkToolbarHandler)object4).getToolbar()) != null) {
                object4 = new du1_2(gu1_22);
                ((Toolbar)object5).setNavigationOnClickListener((View.OnClickListener)object4);
            }
        }
        object5 = this.Pa().m;
        ArrayList arrayList = gu1_22.f;
        n7 = 0;
        object4 = null;
        if (object5 != null) {
            object5 = object5.iterator();
            while ((n4 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object2 = object3 = object5.next();
                object2 = (PaymentInstrumentInfo)object3;
                if (object2 != null) {
                    int n10 = -1;
                    int n14 = -1;
                    int n15 = Short.MAX_VALUE;
                    hh3_22 = null;
                    double d2 = 0.0;
                    object3 = PaymentInstrumentInfo.copy$default((PaymentInstrumentInfo)object2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, d2, null, false, null, null, null, null, null, null, null, null, null, null, n10, n14, n15, null);
                } else {
                    n4 = 0;
                    object3 = null;
                }
                arrayList.add(object3);
            }
        }
        n8 = arrayList.size();
        object3 = null;
        for (n4 = 0; n4 < n8; ++n4) {
            object = (PaymentInstrumentInfo)arrayList.get(n4);
            if (object != null) {
                object = ((PaymentInstrumentInfo)object).getPriceValidation();
            } else {
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            if (object == null) continue;
            object = (PaymentInstrumentInfo)arrayList.get(n4);
            if (object != null) {
                ((PaymentInstrumentInfo)object).setPriceValidation(null);
            }
            if ((object = (PaymentInstrumentInfo)arrayList.get(n4)) == null) continue;
            ((PaymentInstrumentInfo)object).setOfferDetails(null);
        }
        f5 = this.Pa().o;
        hh3_22 = gu1_22.b;
        Object object6 = object5 = hh3_22.getValue();
        object6 = (op2_2)object5;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        kj2_1 kj2_12 = this.Pa();
        object5 = object2;
        object4 = arrayList;
        object3 = this;
        gu1_22.c = object2 = new cu1_1(arrayList, this, f5, (op2_2)object6, mu1_12, kj2_12);
        n8 = R$id.netbanking_list;
        object5 = view2.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, "findViewById(...)");
        object5 = (RecyclerView)object5;
        n7 = R$id.search_text;
        object4 = (EditText)view2.findViewById(n7);
        gu1_22.e = object4;
        n7 = R$id.tv_search_text_clear;
        object4 = (ImageView)view2.findViewById(n7);
        object3 = this.requireActivity();
        object4 = new LinearLayoutManager((Context)object3);
        ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object4);
        object4 = gu1_22.c;
        ((RecyclerView)object5).setAdapter((RecyclerView$f)object4);
        n8 = R$id.payment_progress_bar;
        object5 = (PEProgressView)view2.findViewById(n8);
        gu1_22.d = object5;
        object5 = new ArrayList();
        object4 = new ArrayList();
        object3 = gu1_22.e;
        if (object3 != null) {
            object = "";
            object3.setText((CharSequence)object);
        }
        if ((object3 = gu1_22.e) != null) {
            object = new hu1_0(arrayList, (ArrayList)object5, (ArrayList)object4, gu1_22);
            object3.addTextChangedListener((TextWatcher)object);
        }
        object5 = ((op2_2)hh3_22.getValue()).l;
        object4 = this.getViewLifecycleOwner();
        n3 = 1;
        f5 = Float.MIN_VALUE;
        object3 = new f91(gu1_22, n3);
        object = new gu1$a_0((Function1)object3);
        ((LiveData)object5).e((mu1_1)object4, (F62)object);
        object5 = (op2_2)hh3_22.getValue();
        if (object5 != null && (object5 = ((op2_2)object5).G) != null) {
            object4 = this.getViewLifecycleOwner();
            object3 = new fu1_1(gu1_22);
            object = new gu1$a_0((Function1)object3);
            ((LiveData)object5).e((mu1_1)object4, (F62)object);
        }
    }

    public final void t(int n3) {
        cu1_1 cu1_12 = this.c;
        if (cu1_12 != null) {
            cu1_12.c = n3;
        }
        if (cu1_12 != null) {
            cu1_12.notifyDataSetChanged();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(int n3) {
        Object object = this.Pa();
        TenantResponse tenantResponse = ((kj2_1)object).E;
        if (tenantResponse != null) {
            Object object2;
            Object object3 = null;
            int n4 = 1;
            object = new NetBanking(null, n4, null);
            Object object4 = this.c;
            if (object4 != null && (object4 = ((qw_2)object4).a) != null && (object4 = (PaymentInstrumentInfo)object4.get(n3)) != null) {
                object4 = ((PaymentInstrumentInfo)object4).getCode();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((NetBanking)object).setCode((String)object4);
            object4 = oo2_0.a;
            Object object5 = this.c;
            if (object5 != null && (object5 = ((qw_2)object5).a) != null && (object2 = (PaymentInstrumentInfo)object5.get(n3)) != null) {
                object3 = ((PaymentInstrumentInfo)object2).getPriceValidation();
            }
            float f5 = this.Pa().o;
            object2 = Float.valueOf(f5);
            object4.getClass();
            object4 = oo2_0.p((NetBanking)object, tenantResponse, (PriceValidation)object3, (Float)object2);
            object2 = ((PayNowRequest)object4).getNetPayableAmount();
            if (object2 != null) {
                f5 = ((Float)object2).floatValue();
            } else {
                object2 = this.Pa();
                f5 = ((kj2_1)object2).o;
            }
            float f6 = f5;
            object2 = this.d;
            if (object2 != null) {
                ((PEProgressView)((Object)object2)).show();
            }
            object3 = object2 = this.b.getValue();
            object3 = (op2_2)object2;
            object5 = this.Pa().s;
            object2 = this.Pa();
            HashSet hashSet = ((kj2_1)object2).w;
            ((op2_2)object3).j((PayNowRequest)object4, (PaymentInstruments)object5, tenantResponse, f6, hashSet);
        }
    }
}

