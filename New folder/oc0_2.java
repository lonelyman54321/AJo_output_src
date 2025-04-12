/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.databinding.FragmentExReturnTabAddressRevampBinding;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oC0
 */
public final class oc0_2
extends r51_0
implements jC0$b {
    public static final oC0$a Companion;
    public static final /* synthetic */ gn1_2[] q;
    public Fragment f;
    public jc0_1 g;
    public ExReturnAddressActivity h;
    public TabLayout i;
    public ViewPager j;
    public h5_0 k;
    public boolean l;
    public Typeface m;
    public Typeface n;
    public boolean o;
    public final cc3_2 p;

    static {
        Object object = jz.a(oc0_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentExReturnTabAddressRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        q = gn1_2Array;
        Companion = object = new Object();
    }

    public oc0_2() {
        cc3_2 cc3_22;
        boolean bl2;
        this.l = bl2 = true;
        this.o = bl2;
        this.p = cc3_22 = z80_0.c(oC0$c.a, this);
    }

    public final FragmentExReturnTabAddressRevampBinding Pa() {
        Object object = q[0];
        object = this.p.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentExReturnTabAddressRevampBinding)object;
    }

    public final View Qa(int n3) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.h);
        int n4 = R$layout.tab_pick_drop_revamp;
        layoutInflater = layoutInflater.inflate(n4, null, false);
        n4 = R$id.tab_tv_text;
        View view = layoutInflater.findViewById(n4);
        String string2 = "null cannot be cast to non-null type android.widget.TextView";
        Intrinsics.checkNotNull(view, string2);
        view = (TextView)view;
        if (n3 == 0) {
            String string3 = hv3_0.K(R$string.home_pickup);
            view.setText((CharSequence)string3);
            n3 = hv3_0.m(R$color.white);
            view.setTextColor(n3);
            string3 = this.m;
            view.setTypeface((Typeface)string3);
            n3 = R$drawable.revamp_right_tab_selected_pickup_bg;
            view.setBackgroundResource(n3);
        } else {
            Object object = this.n;
            view.setTypeface(object);
            n3 = hv3_0.m(R$color.accent_color_18);
            view.setTextColor(n3);
            n3 = R$drawable.revamp_left_tab_unselected_pickup_bg;
            view.setBackgroundResource(n3);
            n3 = R$string.store_return;
            object = hv3_0.K(n3);
            view.setText((CharSequence)object);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    public final void k1(boolean bl2) {
        this.o = bl2;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = (ExReturnAddressActivity)object;
        this.h = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = new AddressRepo();
        Application application = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = application;
        object2 = this.getActivity();
        if (object2 != null) {
            Intrinsics.checkNotNull(object);
            String string2 = "owner";
            Intrinsics.checkNotNullParameter(object2, string2);
            String string3 = "factory";
            Intrinsics.checkNotNullParameter(object, string3);
            rd3_0 rd3_02 = object2.getViewModelStore();
            Intrinsics.checkNotNullParameter(object2, string2);
            object2 = object2.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(rd3_02, "store");
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
            Class<h5_0> clazz = h5_0.class;
            string3 = "modelClass";
            object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object2, clazz, string3);
            object2 = ef0_0.a(clazz, string3, string3, "<this>");
            String string4 = object2.getQualifiedName();
            if (string4 == null) {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            string3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            String string5 = string3.concat(string4);
            object = (h5_0)((pD3)object).a((yn1_2)object2, string5);
        } else {
            object = null;
        }
        this.k = object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_ex_return_tab_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        km_1.a(AnalyticsManager.Companion, "Exchange Return Address Screen");
        hv3_0.S(this.h);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        TabLayout$Tab tabLayout$Tab;
        TabLayout tabLayout;
        zr1_1 zr1_12;
        h5_0 h5_02;
        int n3;
        TabLayout tabLayout2;
        TabLayout tabLayout3;
        ViewPager viewPager;
        int n4;
        List list;
        Consignment consignment;
        Typeface typeface;
        Typeface typeface2;
        void var2_14;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)var2_14);
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.m = typeface2 = hv3_0.o(10, (Context)aJIOApplication);
        AJIOApplication aJIOApplication2 = AJIOApplication$a.a();
        this.n = typeface = hv3_0.o(9, (Context)aJIOApplication2);
        CollapsingToolbarLayout collapsingToolbarLayout = this.Pa().collapseToolBar;
        int n7 = R$style.collapsed_toolbar_title;
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(n7);
        n7 = R$style.expanded_toolbar_title;
        collapsingToolbarLayout.setExpandedTitleTextAppearance(n7);
        n7 = mz3_0.d(16);
        int n8 = collapsingToolbarLayout.getExpandedTitleMarginTop();
        int n10 = collapsingToolbarLayout.getExpandedTitleMarginEnd();
        int n14 = collapsingToolbarLayout.getExpandedTitleMarginBottom();
        collapsingToolbarLayout.setExpandedTitleMargin(n7, n8, n10, n14);
        FragmentActivity fragmentActivity = this.getActivity();
        String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity";
        Intrinsics.checkNotNull(fragmentActivity, string2);
        ReturnOrderItemDetails returnOrderItemDetails = ((ExReturnAddressActivity)fragmentActivity).q0;
        n7 = 1;
        n8 = 0;
        nc0_1 nc0_12 = null;
        n10 = returnOrderItemDetails != null && (n10 = (int)(returnOrderItemDetails.isStorePickUp() ? 1 : 0)) == n7 ? 1 : 0;
        if (returnOrderItemDetails != null && (consignment = returnOrderItemDetails.getConsignment()) != null && (list = consignment.getEntries()) != null) {
            n4 = list.size();
        } else {
            n4 = 0;
            Object var2_25 = null;
        }
        Object object3 = this.Pa().alfToolbar;
        String string3 = "Return /Exchange";
        ((Toolbar)object3).setTitle(string3);
        n4 = n4 > n7 ? 4 : 3;
        String string4 = hv3_0.J(n7, n4);
        ((Toolbar)object3).setSubtitle(string4);
        FragmentActivity fragmentActivity2 = this.getActivity();
        int n15 = R$style.muli_regular_12_accent_18;
        ((Toolbar)object3).setSubtitleTextAppearance((Context)fragmentActivity2, n15);
        n4 = R$drawable.ic_cc_close;
        ((Toolbar)object3).setNavigationIcon(n4);
        n4 = R$string.close;
        ((Toolbar)object3).setNavigationContentDescription(n4);
        lC0 lC02 = new lC0(this);
        ((Toolbar)object3).setNavigationOnClickListener(lC02);
        ConstraintLayout constraintLayout = this.Pa().fragmentAddressLayoutProceedTabs;
        string3 = null;
        object3 = new mC0(this, 0);
        constraintLayout.setOnClickListener((View.OnClickListener)object3);
        TextView textView = this.Pa().alfTvAddAddress;
        n15 = 1;
        object3 = new p80_0(this, n15);
        textView.setOnClickListener((View.OnClickListener)object3);
        ConstraintLayout constraintLayout2 = this.Pa().fragmentAddressLayoutProceed;
        object3 = new q80_0(this, n15);
        constraintLayout2.setOnClickListener((View.OnClickListener)object3);
        n4 = R$id.pickup_viewpager;
        this.j = viewPager = (ViewPager)object.findViewById(n4);
        n4 = R$id.pickup_tab;
        this.i = tabLayout3 = (TabLayout)object.findViewById(n4);
        FragmentManager fragmentManager = this.getFragmentManager();
        oC0$b oC0$b = new oC0$b(this, fragmentManager);
        ViewPager viewPager2 = this.j;
        if (viewPager2 != null) {
            viewPager2.setAdapter(oC0$b);
        }
        if ((tabLayout2 = this.i) != null) {
            ViewPager viewPager3 = this.j;
            tabLayout2.setupWithViewPager(viewPager3);
        }
        while (n8 < (n3 = 2)) {
            TabLayout tabLayout4 = this.i;
            Intrinsics.checkNotNull((Object)tabLayout4);
            TabLayout$Tab tabLayout$Tab2 = tabLayout4.getTabAt(n8);
            if (tabLayout$Tab2 != null) {
                if (n8 == 0) {
                    View view = this.Qa(n8);
                    tabLayout$Tab2.setCustomView(view);
                } else {
                    View view = this.Qa(n8);
                    tabLayout$Tab2.setCustomView(view);
                }
            }
            ++n8;
        }
        TabLayout tabLayout5 = this.i;
        if (tabLayout5 != null) {
            pc0_1 pc0_12 = new pc0_1(this);
            tabLayout5.addOnTabSelectedListener(pc0_12);
        }
        if ((h5_02 = this.k) != null && (zr1_12 = h5_02.p) != null) {
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            nc0_12 = new nc0_1(this);
            zr1_12.e(mu1_12, nc0_12);
        }
        if (n10 != 0 && (tabLayout = this.i) != null && (tabLayout$Tab = tabLayout.getTabAt(n7)) != null) {
            tabLayout$Tab.select();
        }
    }
}

