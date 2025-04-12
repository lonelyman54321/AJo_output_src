/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
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
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Zt3
 */
public final class zt3_0
extends fw_2
implements SK$b {
    public final hh3_2 a;
    public final D b;
    public TextView c;
    public ProgressBar d;
    public PEProgressView e;
    public Zt3$b f;
    public String g;
    public boolean h;
    public OnNavigationClickListener i;

    public zt3_0() {
        Object object = new yt3_0(this);
        this.a = object = yr1_2.b((Function0)object);
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        Zt3$d zt3$d = new Zt3$d(this);
        Zt3$e zt3$e = new Zt3$e(this);
        Zt3$f zt3$f = new Zt3$f(this);
        this.b = object = LW0.a(this, (yn1_2)object, zt3$d, zt3$e, zt3$f);
        this.g = "";
    }

    public final void H6() {
        Object object = this.g;
        object = kp1_0.c("Cancel payment on UPI collect flow - ", object);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        String string2 = "UPI_cancelled ";
        ak0_0.a(analyticsManager$Companion, gTMEvents, string2, object);
        object = this.f;
        if (object != null) {
            object.cancel();
        }
        this.f = null;
        this.Oa("UserCancel");
    }

    public final void Oa(String string2) {
        Object object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
            object = null;
        }
        object.show();
        object = this.Qa();
        TenantResponse tenantResponse = this.Ra().E;
        float f5 = this.Ra().o;
        ((op2_2)object).c(string2, tenantResponse, f5);
    }

    public final void Pa(String object) {
        boolean bl2;
        int n3;
        Object object2 = this.f;
        if (object2 != null) {
            object2.cancel();
        }
        object2 = null;
        this.f = null;
        if (object == null || (n3 = ((String)object).length()) == 0) {
            object = this.Ra().q;
            if (object != null) {
                object = ((au3)object).a;
            } else {
                bl2 = false;
                object = null;
            }
            object = JsonUtils.toJson(object);
        }
        kj2_1 kj2_12 = this.Ra();
        int n4 = 5;
        hj2_0 hj2_02 = new hj2_0((String)object, n4, false, false);
        kj2_12.c(hj2_02);
        this.h = bl2 = true;
        object = this.i;
        if (object == null) {
            object = "navigationClickListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.onNavigationClick();
    }

    public final op2_2 Qa() {
        return (op2_2)this.a.getValue();
    }

    public final kj2_1 Ra() {
        return (kj2_1)this.b.getValue();
    }

    public final void Sa() {
        sk_2.Companion.getClass();
        sk_2 sk_22 = new sk_2();
        Intrinsics.checkNotNullParameter(this, "onCancelTransactionClick");
        sk_22.a = this;
        FragmentManager fragmentManager = this.getChildFragmentManager();
        sk_22.show(fragmentManager, "CancelTransactionDialog");
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnNavigationClickListener;
        if (bl2) {
            object = (OnNavigationClickListener)object;
            this.i = object;
            object = this.getActivity();
            boolean bl3 = object instanceof PaymentActivity;
            if (bl3) {
                object = this.getActivity();
                object2 = "null cannot be cast to non-null type com.ril.ajio.payment.view.PaymentActivity";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (PaymentActivity)object;
            }
            if ((object = this.getActivity()) != null && (object = ((ComponentActivity)object).getOnBackPressedDispatcher()) != null) {
                object2 = new Zt3$a(this);
                ((d82_0)object).a(this, (W72)object2);
            }
            return;
        }
        object = pn_2.b((Context)object, " Must implement OnNavigationClickListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_activity_upi_status;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.activity_upi_status;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        Zt3$b zt3$b = this.f;
        if (zt3$b != null) {
            zt3$b.cancel();
        }
        this.f = null;
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.Sa();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        Object object;
        int n4;
        zt3_0 zt3_02 = this;
        Object object2 = view;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(view, (String)object3);
        super.onViewCreated(view, bundle);
        int n7 = og1_1.b();
        Object object4 = "Transaction Status";
        if (n7 != 0) {
            n7 = R$id.pesdk_toolbar;
            object3 = (Toolbar)view.findViewById(n7);
            n4 = R$id.pesdk_toolbar_title_tv;
            ((TextView)view.findViewById(n4)).setText((CharSequence)object4);
            object4 = this.getActivity();
            object = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
            Intrinsics.checkNotNull(object4, (String)object);
            object4 = (AppCompatActivity)object4;
            kq2_1.d((Toolbar)object3, (AppCompatActivity)object4);
            n3 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object3).setNavigationIcon(n3);
            n3 = R$string.back_button_text;
            ((Toolbar)object3).setNavigationContentDescription(n3);
        } else {
            n7 = R$id.pesdk_layout_coordinator;
            object3 = view.findViewById(n7);
            Intrinsics.checkNotNull(object3);
            object = new PesdkToolbarHandler((View)object3);
            ((PesdkToolbarHandler)object).setTitleText((String)object4);
            ((PesdkToolbarHandler)object).setNavigationClick();
            object3 = this.getActivity();
            n7 = object3 instanceof AppCompatActivity;
            if (n7 != 0 && (object3 = (AppCompatActivity)this.getActivity()) != null) {
                object4 = ((PesdkToolbarHandler)object).getToolbar();
                ((AppCompatActivity)object3).setSupportActionBar((Toolbar)object4);
            }
            if ((object3 = ((PesdkToolbarHandler)object).getToolbar()) != null) {
                object3.invalidate();
            }
        }
        n7 = R$id.progressbar;
        object3 = (ProgressBar)object2.findViewById(n7);
        zt3_02.d = object3;
        n7 = R$id.pe_upi_progress_bar;
        object3 = (PEProgressView)object2.findViewById(n7);
        zt3_02.e = object3;
        n7 = R$id.upi_payment_status_timer;
        object3 = (TextView)object2.findViewById(n7);
        zt3_02.c = object3;
        object3 = dm0_0.a;
        if (object3 != null) {
            object4 = "upi.paymentInstrumentId";
            n4 = (int)(object3.containsKey(object4) ? 1 : 0);
            if (n4 != 0) {
                zt3_02.g = object3 = (String)object3.get(object4);
            } else {
                object4 = "upi.vpa";
                n4 = (int)(object3.containsKey(object4) ? 1 : 0);
                if (n4 != 0) {
                    zt3_02.g = object3 = (String)object3.get(object4);
                }
            }
        }
        if ((object2 = (TextView)object2.findViewById(n7 = R$id.upi_id_tv)) != null) {
            object3 = this.Ra().q;
            n3 = 0;
            object4 = null;
            if (object3 != null) {
                object3 = ((au3)object3).b;
            } else {
                n7 = 0;
                object3 = null;
            }
            if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                object3 = this.Ra().q;
                if (object3 != null) {
                    object4 = ((au3)object3).b;
                }
                object2.setText((CharSequence)object4);
            }
        }
        object3 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        String string2 = "";
        String string3 = "screen_view";
        String string4 = "upi_timer_screen";
        String string5 = "";
        String string6 = "";
        String string7 = "";
        int n8 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "", "", string2, string3, string4, string5, string6, null, string7, false, null, n8, null);
        object2 = this.Qa().n;
        object3 = this.getViewLifecycleOwner();
        object4 = new tt_1(zt3_02, 2);
        object = new Zt3$c((Function1)object4);
        ((LiveData)object2).e((mu1_1)object3, (F62)object);
        object2 = this.Qa().o;
        object3 = this.getViewLifecycleOwner();
        object4 = new cq0_2(zt3_02, 1);
        object = new Zt3$c((Function1)object4);
        ((LiveData)object2).e((mu1_1)object3, (F62)object);
        object2 = this.Qa().p;
        object3 = this.getViewLifecycleOwner();
        n4 = 2;
        object4 = new me1_0(zt3_02, n4);
        object = new Zt3$c((Function1)object4);
        ((LiveData)object2).e((mu1_1)object3, (F62)object);
        object2 = this.Ra().q;
        if (object2 != null && (object2 = ((au3)object2).a) != null && (object2 = ((PayNowResponse)object2).getTransactionInformation()) != null && (object2 = ((TransactionInformation)object2).getPollingTime()) != null && (l7 = (l4 = (l3 = ((Number)object2).longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            object4 = new Zt3$b(l3, zt3_02);
            zt3_02.f = object4;
            object4.start();
        }
    }
}

