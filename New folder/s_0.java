/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from s
 */
public final class s_0
extends Fragment
implements ja2_1,
ua0_0 {
    public static final s$a Companion;
    public j3_0 a;
    public ue3_1 b;
    public final hh3_2 c;
    public RecyclerView d;
    public V5 e;
    public View f;
    public ShimmerFrameLayout g;

    static {
        s$a s$a;
        Companion = s$a = new Object();
    }

    public s_0() {
        Object object = new q_0(this, 0);
        this.c = object = yr1_2.b((Function0)object);
    }

    public final void d3(String string2, String object) {
        String string3;
        Intrinsics.checkNotNullParameter(string2, "orderCode");
        Intrinsics.checkNotNullParameter(object, "productId");
        Object object2 = this.getParentFragment();
        boolean bl2 = object2 instanceof k5_0;
        boolean bl3 = true;
        if (bl2) {
            object2 = this.getParentFragment();
            string3 = "null cannot be cast to non-null type com.ril.ajio.myaccount.ajiocash.fragment.AjioCashDetailFragmentRefresh";
            Intrinsics.checkNotNull(object2, string3);
            object2 = (k5_0)object2;
            ((k5_0)object2).i = bl3;
        }
        object2 = "product_code";
        string3 = "clicked_item_code";
        string2 = px1_2.b((String)object2, string2, string3, (String)object);
        string2.putBoolean("CLEAR_STACK", bl3);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.onFragmentInteraction("ACNonTransferableFragment", 35, (Bundle)string2);
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
        super.onCreate((Bundle)object);
        object = h40_0.a;
        boolean bl2 = h40_0.B0();
        int n3 = 3;
        Object object2 = this.c;
        if (bl2) {
            object = (y_0)((hh3_2)object2).getValue();
            object2 = this.b;
            object.getClass();
            aW aW2 = md3_0.c((jD3)object);
            w_0 w_02 = new w_0((y_0)object, (ue3_1)object2, null);
            Ae3.d(aW2, null, null, w_02, n3);
        } else {
            object = (y_0)((hh3_2)object2).getValue();
            object.getClass();
            object2 = md3_0.c((jD3)object);
            x_0 x_02 = new x_0((y_0)object, null);
            Ae3.d((i90_0)object2, null, null, x_02, n3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ac_non_transferable;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        j3_0 j3_02 = this.a;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.stopLoader();
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.ac_nt_shimmer_view_parent;
        object2 = object.findViewById(n3);
        this.f = object2;
        n3 = R$id.ac_nt_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.nt_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.d = object;
        object = new V5(this);
        this.e = object;
        object = this.d;
        object2 = "nonTransferableRV";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        Context context = this.getContext();
        Object object3 = new WrapperLinearLayoutManager(context);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object2 = this.e) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioCashNTAdapter");
            n3 = 0;
            object2 = null;
        }
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = h40_0.a;
        bl2 = h40_0.B0();
        object2 = "getViewLifecycleOwner(...)";
        if (bl2) {
            object = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = nu1_0.a((mu1_1)object);
            object3 = new t_0(this, null);
            ((iu1_0)object).c((Function2)object3);
        } else {
            object = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = nu1_0.a((mu1_1)object);
            object3 = new u_0(this, null);
            ((iu1_0)object).c((Function2)object3);
        }
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object2 = new v_0(this, null);
        ((iu1_0)object).c((Function2)object2);
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

