/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.databinding.FragmentSpendHistoryRefreshBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from na3
 */
public final class na3_2
extends Fragment
implements qa3_1,
ja2_1,
ua0_0 {
    public static final na3$a Companion;
    public static final /* synthetic */ gn1_2[] j;
    public j3_0 a;
    public vh3_2 b;
    public final hh3_2 c;
    public ia3_0 d;
    public final NewEEcommerceEventsRevamp e;
    public final NewCustomEventsRevamp f;
    public final String g;
    public final String h;
    public final cc3_2 i;

    static {
        Object object = jz.a(na3_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentSpendHistoryRefreshBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        j = gn1_2Array;
        Companion = object = new Object();
    }

    public na3_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new ka3_1(this);
        this.c = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.e = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.f = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.g = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.h = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.i = object = z80_0.c(na3$b.a, this);
    }

    public final void O4(float f5, float f6, String string2) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = this.f;
        Object object2 = newCustomEventsRevamp.getORDER_ID();
        bundle.putString((String)object2, string2);
        String string3 = newCustomEventsRevamp.getEC_WALLET_INTERACTION();
        String string4 = "history detail";
        String string5 = "";
        String string6 = "history_detail";
        CharSequence charSequence = "wallet transactions history screen";
        String string7 = "wallet screen";
        String string8 = this.g;
        String string9 = this.h;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string4, string5, string6, (String)charSequence, string7, string8, bundle, string9, false, null, n3, null);
        object = this.getContext();
        if (object != null) {
            int n4;
            object2 = new BottomSheetDialog((Context)object);
            object = this.getLayoutInflater();
            int n7 = R$layout.sh_breakup_bottomsheet;
            object = object.inflate(n7, null);
            ((BottomSheetDialog)object2).setContentView((View)object);
            n7 = com.ril.ajio.R$id.cancelBtn;
            newCustomEventsRevamp = object.findViewById(n7);
            string3 = "findViewById(...)";
            Intrinsics.checkNotNullExpressionValue(newCustomEventsRevamp, string3);
            int n8 = com.ril.ajio.R$id.totalSpent;
            string4 = object.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            string4 = (TextView)string4;
            int n10 = com.ril.ajio.R$id.point;
            string5 = object.findViewById(n10);
            Intrinsics.checkNotNullExpressionValue(string5, string3);
            string5 = (TextView)string5;
            int n14 = com.ril.ajio.R$id.cash;
            string6 = object.findViewById(n14);
            Intrinsics.checkNotNullExpressionValue(string6, string3);
            string6 = (TextView)string6;
            int n15 = com.ril.ajio.R$id.point_txt;
            object = object.findViewById(n15);
            Intrinsics.checkNotNullExpressionValue(object, string3);
            object = (TextView)object;
            int n16 = R$string.super_cash;
            string3 = hv3_0.K(n16);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(" ");
            string3 = ((StringBuilder)charSequence).toString();
            object.setText((CharSequence)string3);
            int n17 = R$string.total_spent;
            float f7 = f6 + f5;
            string3 = qz2_0.x(Float.valueOf(f7));
            n15 = 1;
            charSequence = new Object[n15];
            string7 = null;
            charSequence[0] = string3;
            object = hv3_0.L(n17, (Object[])charSequence);
            string4.setText((CharSequence)object);
            object = qz2_0.x(Float.valueOf(f6));
            string5.setText((CharSequence)object);
            object = qz2_0.x(Float.valueOf(f5));
            string6.setText((CharSequence)object);
            object = new ma3_2((BottomSheetDialog)object2);
            newCustomEventsRevamp.setOnClickListener((View.OnClickListener)object);
            object2.show();
            object = object2.getWindow();
            if (object != null && (object = object.findViewById(n4 = R$id.design_bottom_sheet)) != null) {
                n4 = 17170445;
                object.setBackgroundResource(n4);
            }
        }
    }

    public final FragmentSpendHistoryRefreshBinding Oa() {
        Object object = j[0];
        object = this.i.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentSpendHistoryRefreshBinding)object;
    }

    public final void d3(String object, String string2) {
        Bundle bundle = dm_1.a((String)object, "orderCode", string2, "productId");
        String string3 = "product_code";
        bundle.putString(string3, (String)object);
        bundle.putString("clicked_item_code", string2);
        boolean bl2 = true;
        bundle.putBoolean("CLEAR_STACK", bl2);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.onFragmentInteraction("SpendHistoryFragmentRefresh", 35, bundle);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.a = object2 = (j3_0)object;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object = (vh3_2)object;
                this.b = object;
            }
            return;
        }
        object = pn_2.b(object, "must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = (sa3_2)this.c.getValue();
        object.getClass();
        aW aW2 = md3_0.c((jD3)object);
        ra3_2 ra3_22 = new ra3_2((sa3_2)object, null);
        Ae3.d(aW2, null, null, ra3_22, 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_spend_history_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        km_1.a(AnalyticsManager.Companion, "history screen");
    }

    public final void onStop() {
        super.onStop();
        this.e.setPreviousScreenData("wallet transactions history screen", "wallet screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n4 = object2 instanceof AppCompatActivity;
        if (n4 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object3 = this.Oa().spToolbar;
            ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object3);
        }
        if ((object2 = this.Oa().spToolbar) != null) {
            n3 = 1;
            object3 = new vc0_0(this, n3);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object3);
        }
        if ((object2 = this.b) != null) {
            object3 = null;
            object2.showTabLayout(false);
        }
        n4 = com.ril.ajio.R$id.parent_layout;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ConstraintLayout)((Object)object);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new c9((ViewGroup)object, 2);
        long l2 = 100;
        object2.postDelayed((Runnable)object3, l2);
        object = new ia3_0(this, this);
        this.d = object;
        object = this.Oa().spendHistoryRV;
        object2 = this.d;
        object3 = "spendHistoryAdapter";
        n3 = 0;
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n4 = 0;
            object2 = null;
        }
        Object object5 = new yl2_1(this);
        object2 = ((Ql2)object2).j((yl2_1)object5);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.Oa().spendHistoryRV;
        object5 = this.getContext();
        object2 = new WrapperLinearLayoutManager((Context)object5);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        object = this.getViewLifecycleOwner();
        object2 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object5 = new oa3_2(this, null);
        ((iu1_0)object).c((Function2)object5);
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object2 = new pa3_2(this, null);
        ((iu1_0)object).c((Function2)object2);
        Bundle bundle = new Bundle();
        object = this.f.getNUMBER_OF_TRANSACTION();
        object2 = this.d;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object4 = object2;
        }
        n4 = ((Ql2)object4).getItemCount();
        bundle.putInt((String)object, n4);
        object = this.e;
        String string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.f.newPushCustomScreenView("wallet transactions history screen", "wallet screen", string2, bundle, string3);
    }

    public final void x0() {
        int n3 = 1;
        Context context = this.getContext();
        if (context != null) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_error_message;
            object = hv3_0.K(n4);
            int n7 = R$string.something_wrong_msg;
            Object object2 = hv3_0.K(n7);
            Object object3 = new Object[n3];
            object3[0] = object2;
            object = xh2_0.a(object3, n3, (String)object, "format(...)");
            object2 = this.a;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n7 = 0;
                object2 = null;
            }
            int n8 = R$string.something_wrong_msg;
            object3 = hv3_0.K(n8);
            object2.showToastNotification(context, (String)object3, n3, (String)object);
        }
    }
}

