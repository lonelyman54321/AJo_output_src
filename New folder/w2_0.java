/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.k$e;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from W2
 */
public final class w2_0
extends Fragment
implements OnNavigationClickListener,
View.OnClickListener,
ua0_0 {
    public static final W2$a Companion;
    public static final NewEEcommerceEventsRevamp o;
    public static final NewCustomEventsRevamp p;
    public static final String q;
    public static final String r;
    public j3_0 a;
    public final hh3_2 b;
    public CustomToolbarViewMerger c;
    public View d;
    public RecyclerView e;
    public View f;
    public ShimmerFrameLayout g;
    public t2_0 h;
    public TextView i;
    public TextView j;
    public View k;
    public float l;
    public float m;
    public String n;

    static {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new Object();
        Companion = object;
        object = AnalyticsManager.Companion;
        o = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        p = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        q = newEEcommerceEventsRevamp.getPrevScreen();
        r = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public w2_0() {
        Object object = new u2_0(this, 0);
        this.b = object = yr1_2.b((Function0)object);
        this.n = "";
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

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        w2_0 w2_02 = this;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.tnc_container;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            NewCustomEventsRevamp newCustomEventsRevamp = p;
            String string2 = newCustomEventsRevamp.getEC_WALLET_INTERACTION();
            String string3 = "ajio points view t and c";
            String string4 = "";
            String string5 = "ajio_wallet_points_view_t_and_c";
            String string6 = "wallet overview screen";
            String string7 = "wallet screen";
            String string8 = q;
            String string9 = r;
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n8, null);
            object2 = kj0_1.g();
            object = this.getActivity();
            String string10 = w2_02.n;
            ((kj0_1)object2).w((Activity)object, string10);
        } else {
            n7 = R$id.pending_point_click;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                tj2_0.e(AnalyticsManager.Companion, "AJIOWallet", "Go to Pending Points", "pending points");
                object = wq2_1.Companion;
                float f5 = w2_02.m;
                String string11 = w2_02.n;
                object.getClass();
                object = new wq2_1();
                Object object3 = new Bundle();
                String string12 = "PENDING_POINTS";
                object3.putFloat(string12, f5);
                object3.putString("TnC", string11);
                ((Fragment)object).setArguments((Bundle)object3);
                j3_0 j3_02 = w2_02.a;
                string11 = "activityFragmentListener";
                if (j3_02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string11);
                    n7 = 0;
                    j3_02 = null;
                    f5 = 0.0f;
                }
                if ((object3 = w2_02.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string11);
                } else {
                    object2 = object3;
                }
                object2 = object2.y();
                string11 = "PendingPointFragment";
                boolean bl2 = true;
                j3$a.a(j3_02, (Fragment)object2, (Fragment)object, bl2, string11);
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            float f5;
            this.l = f5 = object.getFloat("ACTIVE_POINTS", 0.0f);
            this.m = f5 = object.getFloat("PENDING_POINTS", 0.0f);
            object3 = "TnC";
            object2 = "";
            this.n = object = object.getString((String)object3, (String)object2);
        }
        object = (b3_0)this.b.getValue();
        object.getClass();
        object3 = md3_0.c((jD3)object);
        object2 = new a3_0((b3_0)object, null);
        Ae3.d((i90_0)object3, null, null, (Function2)object2, 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_active_points_refresh;
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
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = o;
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = newEEcommerceEventsRevamp.getPrevScreenType();
        p.newPushCustomScreenView("wallet points screen", "wallet screen", string2, null, string3);
        km_1.a(AnalyticsManager.Companion, "points screen");
    }

    public final void onStop() {
        o.setPreviousScreenData("wallet points screen", "wallet screen");
        super.onStop();
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        float f5;
        float f6;
        Object object3;
        x2_0 x2_02 = null;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n7 = object2 instanceof AppCompatActivity;
        Object object4 = "customToolbarViewMerger";
        if (n7 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object3 = this.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object3 = null;
                f6 = 0.0f;
            }
            object3 = ((CustomToolbarViewMerger)object3).getToolbar();
            object2.setSupportActionBar((Toolbar)object3);
        }
        if ((object2 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2.setNavigationClick();
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        f6 = this.l;
        object3 = qz2_0.x(Float.valueOf(f6));
        object2.setTitleText((String)object3);
        n7 = R$string.super_cash;
        object2 = hv3_0.K(n7);
        object3 = this.c;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
            f6 = 0.0f;
        }
        int n8 = R$string.active_super_cash;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object2;
        object2 = hv3_0.L(n8, objectArray);
        ((CustomToolbarViewMerger)object3).setSubTitleText((String)object2);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        f6 = 18.0f;
        object2.setFloatViewTitleTextSize(f6);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        f6 = 12.0f;
        object2.setFloatViewSubtitleTextSize(f6);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        int n10 = hv3_0.m(R$color.accent_color_10);
        object2.setSubTitleColor(n10);
        n7 = R$id.app_bar_layout;
        object2 = object.findViewById(n7);
        object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object2 = (AppBarLayout)object2;
        object2.setExpanded(n4 != 0);
        object2.setOutlineProvider(null);
        n7 = R$id.pending_point_click;
        object2 = object.findViewById(n7);
        this.d = object2;
        n7 = R$id.active_points_rv;
        object2 = (RecyclerView)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.ap_shimmer_view_parent;
        object2 = object.findViewById(n7);
        this.f = object2;
        n7 = R$id.ap_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n7);
        this.g = object2;
        n7 = R$id.pending_points_tv;
        object2 = (TextView)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.tv_additional_pending;
        object2 = (TextView)object.findViewById(n7);
        this.j = object2;
        n7 = R$id.tnc_container;
        object = object.findViewById(n7);
        this.k = object;
        object2 = t2_0.d;
        object = new Ql2((k$e)object2);
        this.h = object;
        object = this.e;
        object2 = "activePointsRV";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((object4 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activePointsAdapter");
            n10 = 0;
            object4 = null;
        }
        object3 = new yl2_1(this);
        object4 = ((Ql2)object4).j((yl2_1)object3);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object4 = this.getContext();
        object2 = new WrapperLinearLayoutManager((Context)object4);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pendingPointTV");
            n3 = 0;
            object = null;
        }
        f5 = this.m;
        object2 = qz2_0.x(Float.valueOf(f5));
        object.setText((CharSequence)object2);
        n3 = R$string.super_cash;
        object = hv3_0.K(n3);
        object2 = this.j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAdditionalPending");
            n7 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        n10 = R$string.additional_pending_points;
        Object[] objectArray2 = new Object[n4];
        objectArray2[0] = object;
        object = hv3_0.L(n10, objectArray2);
        object2.setText((CharSequence)object);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pendingPointsClick");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tncContainer");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.getViewLifecycleOwner();
        object2 = "getViewLifecycleOwner(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        x2_02 = new x2_0(this, null);
        ((iu1_0)object).c(x2_02);
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = nu1_0.a((mu1_1)object);
        object2 = new y2_0(this, null);
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

