/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.E$b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from K5
 */
public final class k5_0
extends Fragment
implements TabLayout$OnTabSelectedListener,
OnNavigationClickListener,
ue3_1 {
    public static final K5$a Companion;
    public vh3_2 a;
    public TabLayout b;
    public FrameLayout c;
    public FrameLayout d;
    public CustomToolbarViewMerger e;
    public float f;
    public float g;
    public float h;
    public int i;
    public ShimmerFrameLayout j;
    public final hh3_2 k;
    public final NewEEcommerceEventsRevamp l;
    public final NewCustomEventsRevamp m;
    public wc_1 n;
    public View o;
    public View p;

    static {
        K5$a k5$a;
        Companion = k5$a = new Object();
    }

    public k5_0() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new J5(this);
        this.k = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.l = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.m = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
    }

    public final void Oa(int n3) {
        Object object = this.getChildFragmentManager().D(n3);
        if (object == null) {
            object = this.getChildFragmentManager();
            object.getClass();
            a a2 = new a((FragmentManager)object);
            object = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(a2, (String)object);
            int n4 = R$id.tabDataNT;
            int n7 = 1;
            if (n3 == n4) {
                s_0.Companion.getClass();
                s_0 s_02 = new s_0();
                object = h40_0.a;
                n4 = (int)(h40_0.B0() ? 1 : 0);
                if (n4 != 0) {
                    object = "mWalletChangeListener";
                    Intrinsics.checkNotNullParameter(this, (String)object);
                    s_02.b = this;
                }
                n4 = R$id.tabDataNT;
                a2.h(n4, s_02, null, n7);
                a2.d();
            } else {
                n4 = R$id.tabDataT;
                if (n3 == n4) {
                    Object object2 = g_0.Companion;
                    float f5 = this.g;
                    object2.getClass();
                    object2 = new g_0();
                    Bundle bundle = new Bundle();
                    String string2 = "TRANSFERABLE_CASH";
                    bundle.putFloat(string2, f5);
                    ((Fragment)object2).setArguments(bundle);
                    n4 = R$id.tabDataT;
                    a2.h(n4, (Fragment)object2, null, n7);
                    a2.d();
                }
            }
        }
    }

    public final void Pa() {
        int n3;
        Object object = this.d;
        FrameLayout frameLayout = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cashTabDataViewT");
            n3 = 0;
            object = null;
        }
        int n4 = 8;
        object.setVisibility(n4);
        object = this.c;
        if (object == null) {
            object = "cashTabDataViewNT";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            frameLayout = object;
        }
        frameLayout.setVisibility(0);
        n3 = R$id.tabDataNT;
        this.Oa(n3);
    }

    public final void Qa() {
        int n3;
        Object object = this.c;
        FrameLayout frameLayout = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cashTabDataViewNT");
            n3 = 0;
            object = null;
        }
        int n4 = 8;
        object.setVisibility(n4);
        object = this.d;
        if (object == null) {
            object = "cashTabDataViewT";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            frameLayout = object;
        }
        frameLayout.setVisibility(0);
        n3 = R$id.tabDataT;
        this.Oa(n3);
    }

    public final void d9(Float object) {
        CustomToolbarViewMerger customToolbarViewMerger = this.e;
        if (customToolbarViewMerger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
            customToolbarViewMerger = null;
        }
        object = qz2_0.x((Float)object);
        customToolbarViewMerger.setTitleText((String)object);
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof vh3_2;
        if (bl2) {
            object = (vh3_2)object;
            this.a = object;
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<wc_1> clazz = wc_1.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.n = object = (wc_1)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ajio_cash_detail_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this);
        this.e = object;
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
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.l;
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = newEEcommerceEventsRevamp.getPrevScreenType();
        this.m.newPushCustomScreenView("wallet cash screen", "wallet screen", string2, null, string3);
        km_1.a(AnalyticsManager.Companion, "cash screen");
    }

    public final void onStop() {
        super.onStop();
        this.l.setPreviousScreenData("wallet cash screen", "wallet screen");
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        int n3;
        int n4;
        View view;
        Integer n7 = null;
        if (tabLayout$Tab != null) {
            view = tabLayout$Tab.getCustomView();
        } else {
            n4 = 0;
            view = null;
        }
        view = (TextView)view;
        if (view != null) {
            int n8 = hv3_0.m(R$color.white);
            view.setTextColor(n8);
        }
        if (tabLayout$Tab != null) {
            n3 = tabLayout$Tab.getPosition();
            n7 = n3;
        }
        if (n7 != null && (n3 = n7.intValue()) == (n4 = 1)) {
            this.Pa();
        } else if (n7 != null && (n3 = n7.intValue()) == 0) {
            this.Qa();
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        tabLayout$Tab = tabLayout$Tab != null ? tabLayout$Tab.getCustomView() : null;
        if ((tabLayout$Tab = (TextView)tabLayout$Tab) != null) {
            int n3 = hv3_0.m(R$color.accent_color_10);
            tabLayout$Tab.setTextColor(n3);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        hv3_0.p0(this.j);
        object2 = this.n;
        Object object3 = null;
        Object object4 = "ajioWalletVM";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object2 = null;
        }
        object2.b();
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object2 = null;
        }
        object2 = object2.e;
        object4 = this.getViewLifecycleOwner();
        Object object5 = new i5_0(this, 0);
        K5$b k5$b = new K5$b((i5_0)object5);
        object2.e((mu1_1)object4, k5$b);
        object2 = this.getActivity();
        n3 = object2 instanceof AppCompatActivity;
        object4 = "customToolbarViewMerger";
        if (n3 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object5 = this.e;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object5 = null;
            }
            object5 = ((CustomToolbarViewMerger)object5).getToolbar();
            object2.setSupportActionBar((Toolbar)object5);
        }
        n3 = R$id.app_bar_layout;
        object2 = object.findViewById(n3);
        object5 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        ((AppBarLayout)object2).setOutlineProvider(null);
        object2 = this.e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object2 = null;
        }
        object2.setNavigationClick();
        n3 = R$id.app_bar_layout;
        object2 = (AppBarLayout)object.findViewById(n3);
        boolean bl2 = true;
        object2.setExpanded(bl2);
        object2 = this.a;
        if (object2 != null) {
            object2.showTabLayout(false);
        }
        n3 = R$id.ac_tab_layout;
        object2 = (TabLayout)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.tabDataNT;
        object2 = (FrameLayout)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.tabDataT;
        object2 = (FrameLayout)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.wallet_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.j = object2;
        n3 = R$id.view_3;
        object2 = object.findViewById(n3);
        this.o = object2;
        n3 = R$id.view_4;
        this.p = object = object.findViewById(n3);
        object = h40_0.a;
        boolean bl3 = h40_0.B0();
        if (bl3) {
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerView1");
                bl3 = false;
                object = null;
            }
            ai0_2.i(object);
            object = this.p;
            if (object == null) {
                object = "shimmerView2";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            ai0_2.i(object3);
        }
    }
}

