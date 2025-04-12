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
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from wq2
 */
public final class wq2_1
extends Fragment
implements OnNavigationClickListener,
zq2_1,
ua0_0 {
    public static final wq2$a_0 Companion;
    public j3_0 a;
    public final hh3_2 b;
    public CustomToolbarViewMerger c;
    public RecyclerView d;
    public View e;
    public ShimmerFrameLayout f;
    public aq2_0 g;
    public float h;
    public String i;

    static {
        wq2$a_0 wq2$a_0;
        Companion = wq2$a_0 = new Object();
    }

    public wq2_1() {
        Object object = new ln0_2(this, 1);
        this.b = object = yr1_2.b((Function0)object);
        this.i = "";
    }

    public final void E4() {
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        String string2 = this.i;
        kj0_12.w(fragmentActivity, string2);
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
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            float f5;
            this.h = f5 = object.getFloat("PENDING_POINTS", 0.0f);
            object3 = "TnC";
            object2 = "";
            this.i = object = object.getString((String)object3, (String)object2);
        }
        object = (dq2_1)this.b.getValue();
        object.getClass();
        object3 = md3_0.c((jD3)object);
        object2 = new cq2_2((dq2_1)object, null);
        Ae3.d((i90_0)object3, null, null, (Function2)object2, 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_pending_points_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this);
        this.c = object;
        Intrinsics.checkNotNull(layoutInflater);
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
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
        km_1.a(AnalyticsManager.Companion, "pending points screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        float f5;
        Object object4;
        boolean bl2 = true;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n3 = object2 instanceof AppCompatActivity;
        Object object5 = "customToolbarViewMerger";
        if (n3 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object4 = this.c;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                object4 = null;
                f5 = 0.0f;
            }
            object4 = ((CustomToolbarViewMerger)object4).getToolbar();
            ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object4);
        }
        n3 = R$id.app_bar_layout;
        object2 = object.findViewById(n3);
        object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        ((AppBarLayout)object2).setOutlineProvider(null);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object2 = null;
        }
        ((CustomToolbarViewMerger)object2).setNavigationClick();
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object2 = null;
        }
        f5 = this.h;
        object4 = qz2_0.x(Float.valueOf(f5));
        ((CustomToolbarViewMerger)object2).setTitleText((String)object4);
        n3 = R$string.super_cash;
        object2 = hv3_0.K(n3);
        object4 = this.c;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            object4 = null;
            f5 = 0.0f;
        }
        int n4 = R$string.pending_super_cash;
        Object[] objectArray = new Object[bl2];
        objectArray[0] = object2;
        object2 = hv3_0.L(n4, objectArray);
        ((CustomToolbarViewMerger)object4).setSubTitleText((String)object2);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object2 = null;
        }
        f5 = 18.0f;
        ((CustomToolbarViewMerger)object2).setFloatViewTitleTextSize(f5);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object2 = null;
        }
        f5 = 12.0f;
        ((CustomToolbarViewMerger)object2).setFloatViewSubtitleTextSize(f5);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object2 = null;
        }
        int n7 = hv3_0.m(R$color.accent_color_10);
        ((CustomToolbarViewMerger)object2).setSubTitleColor(n7);
        n3 = R$id.app_bar_layout;
        ((AppBarLayout)object.findViewById(n3)).setExpanded(bl2);
        n3 = R$id.active_points_rv;
        this.d = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.ap_shimmer_view_parent;
        object2 = object.findViewById(n3);
        this.e = object2;
        n3 = R$id.ap_shimmer_view;
        object = (ShimmerFrameLayout)object.findViewById(n3);
        this.f = object;
        object = new aq2_0(this);
        this.g = object;
        object = this.d;
        object2 = "pendingPointsRV";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        if ((object3 = this.g) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pendingPointsAdapter");
            bl2 = false;
            object3 = null;
        }
        object5 = new yl2_1(this);
        object3 = ((Ql2)object3).j((yl2_1)object5);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object3 = this.getContext();
        object2 = new WrapperLinearLayoutManager((Context)object3);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        object = this.getViewLifecycleOwner();
        object2 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object3 = new xq2_2(this, null);
        ((iu1_0)object).c((Function2)object3);
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object2 = new yq2_2(this, null);
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

