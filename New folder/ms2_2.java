/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.gson.JsonObject;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.DeleteSaveInstrumentQuery;
import com.ril.ajio.services.data.Payment.PEToken;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.StoredPaymentInstrument;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from mS2
 */
public final class ms2_2
extends fw_2
implements os2_1,
io0$a_0 {
    public final hh3_2 a;
    public final D b;
    public RecyclerView c;
    public TextView d;
    public StoredPaymentInstrument e;
    public Z82 f;
    public final NewEEcommerceEventsRevamp g;
    public final NewCustomEventsRevamp h;
    public final hh3_2 i;

    public ms2_2() {
        Object object = new rd1_1(this, 2);
        this.a = object = yr1_2.b((Function0)object);
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        Object object2 = new mS2$b(this);
        mS2$c mS2$c = new mS2$c(this);
        mS2$d mS2$d = new mS2$d(this);
        this.b = object = LW0.a(this, (yn1_2)object, (Function0)object2, mS2$c, mS2$d);
        object = AnalyticsManager.Companion;
        this.g = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.h = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = new ld2_1(this, 2);
        this.i = object = yr1_2.b((Function0)object);
    }

    public final void Oa() {
        int n3 = 1;
        Object object = this.f;
        if (object != null) {
            object.r0();
        }
        object = (op2_2)this.a.getValue();
        Object object2 = ((kj2_1)this.b.getValue()).r;
        Object object3 = ((op2_2)object).a;
        object3.getClass();
        Object object4 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{};
        String string2 = "payment";
        String string3 = "saved_card";
        object4 = ((UrlHelper)object4).getApiUrl(string2, string3, object5);
        object5 = JsonObject.class;
        object2 = (JsonObject)JsonUtils.fromJson((String)object2, (Class)object5);
        if (object2 == null) {
            object2 = new JsonObject();
        }
        object2 = ((oo2_1)object3).a.getSavedCard((String)object4, "PAYMENT_StoredPaymentInstrument", (JsonObject)object2);
        object4 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object4);
        object4 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object4);
        object4 = new q21_0(object3, 2);
        object3 = new go2_2((q21_0)object4);
        object4 = new s53_0((q63_0)object2, (bx0_2)object3);
        object2 = new Object();
        object3 = new u53_0((q63_0)object4, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object2 = new y8_0(object, n3);
        object4 = new wp2_0((y8_0)object2);
        object2 = new a8_0(object, n3);
        Object object6 = new xp2_1((a8_0)object2);
        object6 = ((g53_0)object3).f((o60_0)object4, (o60_0)object6);
        ((op2_2)object).b.b((yr0_2)object6);
        object6 = Unit.a;
    }

    public final void S3(PaymentInstrumentInfo object) {
        Object object2 = AnalyticsManager.Companion;
        Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        Object object4 = "savedcard_popoupclicked";
        Object object5 = "Delete clicked on \"Are you sure\" pop up";
        ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, (String)object4, (String)object5);
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, "data");
            int n3 = 31;
            object4 = null;
            int n4 = 0;
            object5 = null;
            Object object6 = null;
            Object object7 = null;
            String string2 = null;
            object3 = object2;
            object2 = new DeleteSaveInstrumentQuery(null, null, null, null, null, n3, null);
            object3 = ((PaymentInstrumentInfo)object).getPaymentInstrumentId();
            ((DeleteSaveInstrumentQuery)object2).setPaymentInstrumentId((String)object3);
            object = ((PaymentInstrumentInfo)object).getInstrumentChecksum();
            ((DeleteSaveInstrumentQuery)object2).setRequestChecksum((String)object);
            object = this.f;
            if (object != null) {
                object.r0();
            }
            object = (op2_2)this.a.getValue();
            object3 = ((kj2_1)this.b.getValue()).r;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "deleteQuery");
            object4 = ((op2_2)object).a;
            object4.getClass();
            Intrinsics.checkNotNullParameter(object2, "query");
            object5 = UrlHelper.Companion.getInstance();
            object6 = new Object[]{};
            object7 = "payment";
            string2 = "delete_instrument";
            object5 = ((UrlHelper)object5).getApiUrl((String)object7, string2, object6);
            object3 = (PEToken)JsonUtils.fromJson((String)object3, PEToken.class);
            object6 = null;
            object7 = object3 != null ? ((PEToken)object3).getTenant() : null;
            ((DeleteSaveInstrumentQuery)object2).setTenant((Tenant)object7);
            object7 = object3 != null ? ((PEToken)object3).getAccessToken() : null;
            ((DeleteSaveInstrumentQuery)object2).setAccessToken((String)object7);
            if (object3 != null) {
                object6 = ((PEToken)object3).getCustomer();
            }
            ((DeleteSaveInstrumentQuery)object2).setCustomer((Customer)object6);
            object2 = JsonUtils.toJson(object2);
            object3 = JsonObject.class;
            object2 = (JsonObject)JsonUtils.fromJson((String)object2, object3);
            if (object2 == null) {
                object2 = new JsonObject();
            }
            object2 = ((oo2_1)object4).a.deleteSavedInstrument((String)object5, "PAYMENT_DeletePaymentInstrument", (JsonObject)object2);
            object3 = qt2_2.c;
            object2 = ((g53_0)object2).h((Scheduler)object3);
            object3 = ti_2.a();
            object2 = ((g53_0)object2).e((Scheduler)object3);
            object3 = new bo_2(object4, 1);
            object4 = new tl1_0(object3);
            object3 = new s53_0((q63_0)object2, (bx0_2)object4);
            object2 = new Object();
            object4 = new u53_0((q63_0)object3, (bx0_2)object2);
            Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
            int n7 = 1;
            object2 = new p8_0(object, n7);
            object3 = new fp2_1((p8_0)object2);
            n4 = 1;
            object2 = new r8_0(object, n4);
            object6 = null;
            object5 = new hp2_0(0, (Function1)object2);
            object2 = ((g53_0)object4).f((o60_0)object3, (o60_0)object5);
            object = ((op2_2)object).b;
            ((t30_0)object).b((yr0_2)object2);
        }
    }

    public final void U5(PaymentInstrumentInfo object) {
        Intrinsics.checkNotNullParameter(object, "data");
        ((io2_1)this.i.getValue()).c.k(object);
        object = new io0_1();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "DeleteSavedCardDialog");
        Intrinsics.checkNotNullParameter(this, "onDeleteCardClickListener");
        ((io0_1)object).a = this;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (Z82)object;
        this.f = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        if (object != null) {
            object = object.getString("token");
            kj2_1 kj2_12 = (kj2_1)this.b.getValue();
            kj2_12.r = object;
        }
        int n3 = R$layout.pesdk_frgment_saved_card;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onStop() {
        super.onStop();
        this.g.setPreviousScreenData("saved cards screen", "payment management screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.savedcard_list;
        object2 = (RecyclerView)object.findViewById(n3);
        this.c = object2;
        n3 = (int)(og1_1.b() ? 1 : 0);
        Object object3 = null;
        Object object4 = "recyclerView";
        if (n3 != 0) {
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object2 = null;
            }
            int n4 = hv3_0.m(R$color.pesdk_lux_color_2);
            object2.setBackgroundColor(n4);
        }
        n3 = R$id.no_saved_card;
        object = (TextView)object.findViewById(n3);
        this.d = object;
        object2 = this.requireActivity();
        object = new LinearLayoutManager((Context)object2);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object2;
        }
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
        object = this.a;
        object2 = ((op2_2)((hh3_2)object).getValue()).r;
        object3 = this.getViewLifecycleOwner();
        object4 = new r8_0(this, 2);
        mS2$a mS2$a = new mS2$a((Function1)object4);
        ((LiveData)object2).e((mu1_1)object3, mS2$a);
        object = ((op2_2)((hh3_2)object).getValue()).w;
        object2 = this.getViewLifecycleOwner();
        object3 = new jd2_0(this, 1);
        object4 = new mS2$a((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        this.Oa();
        km_1.a(AnalyticsManager.Companion, "saved cards page");
    }
}

