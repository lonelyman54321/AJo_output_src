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
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from G
 */
public final class g_0
extends Fragment
implements ja2_1,
ua0_0,
mq3_0,
rv_1 {
    public static final G$a Companion;
    public j3_0 a;
    public final hh3_2 b;
    public RecyclerView c;
    public D d;
    public View e;
    public ShimmerFrameLayout f;
    public Float g;

    static {
        G$a g$a;
        Companion = g$a = new Object();
    }

    public g_0() {
        Object object = new e_0(this, 0);
        this.b = object = yr1_2.b((Function0)object);
        AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void Y7(String object) {
        Intrinsics.checkNotNullParameter(object, "id");
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
        object2.getClass();
        Intrinsics.checkNotNullParameter(fragmentManager, "childFragmentManager");
        String string2 = "AjioCashImpsStatusBottomSheetFragment";
        Intrinsics.checkNotNullParameter(string2, "tag");
        object2 = fragmentManager.E(string2);
        if (object2 == null) {
            U5.Companion.getClass();
            Intrinsics.checkNotNullParameter(object, "transactionId");
            object2 = new U5();
            fragmentManager = new Bundle();
            String string3 = "TRANSACTION_ID";
            fragmentManager.putString(string3, (String)object);
            ((Fragment)object2).setArguments((Bundle)fragmentManager);
            object = this.getChildFragmentManager();
            ((DialogFragment)object2).show((FragmentManager)object, string2);
        }
    }

    public final void d3(String string2, String object) {
        String string3;
        Intrinsics.checkNotNullParameter(string2, "orderCode");
        Intrinsics.checkNotNullParameter(object, "productId");
        Object object2 = this.getParentFragment();
        boolean bl2 = object2 instanceof k5_0;
        if (bl2) {
            object2 = this.getParentFragment();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.myaccount.ajiocash.fragment.AjioCashDetailFragmentRefresh");
            object2 = (k5_0)object2;
            string3 = null;
            ((k5_0)object2).i = 0;
        }
        object2 = "product_code";
        string3 = "clicked_item_code";
        string2 = px1_2.b((String)object2, string2, string3, (String)object);
        bl2 = true;
        string2.putBoolean("CLEAR_STACK", bl2);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.onFragmentInteraction("ACTransferableFragment", 35, (Bundle)string2);
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        int n7 = 65;
        if (n3 == n7 && n4 == (n3 = -1)) {
            Object object2;
            o6_0 o6_02;
            n3 = 0;
            if (object != null) {
                n7 = 0;
                o6_02 = null;
                n4 = (int)(object.getBooleanExtra("IS_WALLET_TRANSFER_INITIATED", false) ? 1 : 0);
                object2 = n4 != 0;
            } else {
                n4 = 0;
                object2 = null;
            }
            object = Boolean.TRUE;
            n4 = (int)(Intrinsics.areEqual(object2, object) ? 1 : 0);
            if (n4 != 0) {
                object2 = (p6)this.b.getValue();
                object2.getClass();
                object = md3_0.c((jD3)object2);
                o6_02 = new o6_0((p6)object2, null);
                n4 = 3;
                Ae3.d((i90_0)object, null, null, o6_02, n4);
                object2 = this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(object2, "getViewLifecycleOwner(...)");
                object2 = nu1_0.a((mu1_1)object2);
                object = new h_0(this, null);
                ((iu1_0)object2).c((Function2)object);
                object2 = this.a;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n4 = 0;
                    object2 = null;
                }
                object = "ACTransferableFragment";
                n7 = 66;
                object2.onFragmentInteraction((String)object, n7, null);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.a = object;
            return;
        }
        object = pn_2.b(object, "must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        int n3;
        float f5;
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Bundle bundle = null;
        if (object != null) {
            object2 = "TRANSFERABLE_CASH";
            f5 = object.getFloat((String)object2);
            object = Float.valueOf(f5);
        } else {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        this.g = object;
        object = (p6)this.b.getValue();
        object.getClass();
        object2 = md3_0.c((jD3)object);
        o6_0 o6_02 = new o6_0((p6)object, null);
        n3 = 3;
        f5 = 4.2E-45f;
        Ae3.d((i90_0)object2, null, null, o6_02, n3);
        object = ye3_0.a;
        object = this.g;
        if (object != null) {
            f5 = ((Float)object).floatValue();
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        bundle = new Bundle();
        object2 = ye3_0.b;
        bundle.putFloat((String)object2, f5);
        vb0_0.a(AnalyticsManager.Companion, "cash screen", bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ac_non_transferable;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        j3_0 j3_02 = this.a;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.stopLoader();
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.ac_nt_shimmer_view_parent;
        object2 = object.findViewById(n3);
        this.e = object2;
        n3 = R$id.ac_nt_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.nt_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        object2 = this.g;
        object = new D(this, this, (Float)object2, this);
        this.d = object;
        object = this.c;
        object2 = "transferableRV";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        Context context = this.getContext();
        Object object4 = new WrapperLinearLayoutManager(context);
        object.setLayoutManager((RecyclerView$o)object4);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        if ((object2 = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acTransferableAdapter");
            n3 = 0;
            object2 = null;
        }
        object4 = new yl2_1(this);
        object2 = ((Ql2)object2).j((yl2_1)object4);
        object.setAdapter((RecyclerView$f)object2);
        object = this.getViewLifecycleOwner();
        object2 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object4 = new h_0(this, null);
        object.c((Function2)object4);
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object2 = new I(this, null);
        object.c((Function2)object2);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
            object = null;
        }
        if ((object2 = this.e) == null) {
            object2 = "shimmerParent";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object3);
    }

    public final void r2(float f5) {
        AnalyticsManager.Companion.getInstance().getGtmEvents().setScreenName("cash screen");
        ye3_0.a(f5);
        FragmentActivity fragmentActivity = this.getActivity();
        Intent intent = new Intent((Context)fragmentActivity, ReturnImpsActivity.class);
        fragmentActivity = new Bundle();
        fragmentActivity.putFloat("IMPS_AMOUNT", f5);
        fragmentActivity.putBoolean("TRANSFER_TO_BANK_FLOW", true);
        intent.putExtras((Bundle)fragmentActivity);
        this.startActivityForResult(intent, 65);
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

