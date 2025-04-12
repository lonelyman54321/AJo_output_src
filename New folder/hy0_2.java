/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.PEProgressView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hy0
 */
public final class hy0_2
extends fw_2
implements TabLayout$OnTabSelectedListener {
    public static final Hy0$a Companion;
    public PEProgressView a;
    public EditText b;
    public TabLayout c;
    public OnNavigationClickListener d;
    public FrameLayout e;
    public FrameLayout f;
    public zc_1 g;
    public zc_1 h;

    static {
        Hy0$a hy0$a;
        Companion = hy0$a = new Object();
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnNavigationClickListener;
        if (bl2) {
            object = (OnNavigationClickListener)object;
            this.d = object;
            return;
        }
        object = pn_2.b(object, " Must implement OnNavigationClickListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        ((GTMEvents)object).pushOpenScreenEvent("emi screen");
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_luxe_emi_fragment;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_emi_fragment;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        View view = tabLayout$Tab != null ? tabLayout$Tab.getCustomView() : null;
        if ((view = (TextView)view) != null) {
            int n3 = hv3_0.m(R$color.white);
            view.setTextColor(n3);
        }
        this.onTabSelected(tabLayout$Tab);
    }

    public final void onTabSelected(TabLayout$Tab object) {
        int n3;
        int n4;
        Object object2 = null;
        View view = object != null ? ((TabLayout$Tab)object).getCustomView() : null;
        if ((view = (TextView)view) != null) {
            int n7 = hv3_0.m(R$color.white);
            view.setTextColor(n7);
        }
        if (object != null) {
            n4 = ((TabLayout$Tab)object).getPosition();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        view = null;
        String string2 = "frameAllBanks";
        int n8 = 8;
        String string3 = "frameNoCostEmiBanks";
        if (object != null && (n3 = ((Integer)object).intValue()) == 0) {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n4 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object2.setVisibility(0);
        } else if (object != null && (n4 = ((Integer)object).intValue()) == (n3 = 1)) {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n4 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object2.setVisibility(n8);
            object = this.h;
            if (object != null) {
                ((zc_1)object).Ra();
            }
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
        int n4;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = R$id.payment_progress_bar;
        object2 = (PEProgressView)object.findViewById(n7);
        this.a = object2;
        n7 = R$id.search_text;
        object2 = (EditText)object.findViewById(n7);
        this.b = object2;
        n7 = R$id.tv_search_text_clear;
        object2 = (ImageView)object.findViewById(n7);
        n7 = R$id.emi_tab_layout;
        object2 = (TabLayout)object.findViewById(n7);
        this.c = object2;
        n7 = R$id.frame_all_banks;
        object2 = (FrameLayout)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.frame_no_cost_emi_banks;
        object2 = (FrameLayout)object.findViewById(n7);
        this.f = object2;
        object2 = this.getChildFragmentManager();
        object2.getClass();
        Object object4 = new a((FragmentManager)object2);
        object2 = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        zc_1.Companion.getClass();
        Object object5 = new zc_1();
        Object object6 = new Bundle();
        Object object7 = "TAB_TYPE";
        object6.putInt((String)object7, 0);
        ((Fragment)object5).setArguments((Bundle)object6);
        this.g = object5;
        int n8 = 0;
        object6 = new ey0_2(this, 0);
        String string2 = "progressBarListener";
        Intrinsics.checkNotNullParameter(object6, string2);
        ((zc_1)object5).h = object6;
        object5 = this.g;
        if (object5 != null) {
            object6 = new fy0_2(this, 0);
            object3 = "gaEventListener";
            Intrinsics.checkNotNullParameter(object6, (String)object3);
            ((zc_1)object5).n = object6;
        }
        object5 = this.g;
        boolean bl2 = true;
        object3 = null;
        if (object5 != null) {
            int n10 = R$id.frame_all_banks;
            ((a)object4).h(n10, (Fragment)object5, null, (int)(bl2 ? 1 : 0));
            ((a)object4).d();
        }
        object4 = this.getChildFragmentManager();
        object4.getClass();
        object5 = new a((FragmentManager)object4);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
        object2 = new zc_1();
        object4 = new Bundle();
        object4.putInt((String)object7, (int)(bl2 ? 1 : 0));
        ((Fragment)object2).setArguments((Bundle)object4);
        this.h = object2;
        object4 = new gy0_1(this);
        Intrinsics.checkNotNullParameter(object4, string2);
        ((zc_1)object2).h = object4;
        object2 = this.h;
        if (object2 != null) {
            n4 = R$id.frame_no_cost_emi_banks;
            ((a)object5).h(n4, (Fragment)object2, null, (int)(bl2 ? 1 : 0));
            ((a)object5).d();
        }
        object2 = this.c;
        object4 = "emiTabLayout";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        if ((object5 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object5 = null;
        }
        object5 = ((TabLayout)((Object)object5)).newTab();
        int n14 = R$layout.emi_all_view;
        object5 = ((TabLayout$Tab)object5).setCustomView(n14);
        ((TabLayout)((Object)object2)).addTab((TabLayout$Tab)object5);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        if ((object5 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object5 = null;
        }
        object5 = ((TabLayout)((Object)object5)).newTab();
        n14 = R$layout.emi_no_cost_view;
        object5 = ((TabLayout$Tab)object5).setCustomView(n14);
        ((TabLayout)((Object)object2)).addTab((TabLayout$Tab)object5);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        if ((object2 = ((TabLayout)((Object)object2)).getTabAt(0)) != null) {
            object2 = ((TabLayout$Tab)object2).getCustomView();
        } else {
            n7 = 0;
            object2 = null;
        }
        object5 = "null cannot be cast to non-null type android.widget.TextView";
        Intrinsics.checkNotNull(object2, (String)object5);
        object2 = (TextView)object2;
        object7 = this.c;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n14 = 0;
            object7 = null;
        }
        if ((object7 = ((TabLayout)((Object)object7)).getTabAt((int)(bl2 ? 1 : 0))) != null) {
            object7 = ((TabLayout$Tab)object7).getCustomView();
        } else {
            n14 = 0;
            object7 = null;
        }
        Intrinsics.checkNotNull(object7, (String)object5);
        object7 = (TextView)object7;
        n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$string.all_emi_list;
            object5 = this.getString(n3);
            string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object5, string2);
            Locale locale = Locale.ROOT;
            object5 = ((String)object5).toUpperCase(locale);
            String string3 = "toUpperCase(...)";
            Intrinsics.checkNotNullExpressionValue(object5, string3);
            object2.setText((CharSequence)object5);
            n7 = R$string.no_cost_emi;
            object2 = this.getString(n7);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = ((String)object2).toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            object7.setText((CharSequence)object2);
        } else {
            AJIOApplication.Companion.getClass();
            object5 = AJIOApplication$a.a();
            n8 = R$drawable.ajio_emi_tab_selector;
            object5 = t70.getDrawable((Context)object5, n8);
            object2.setBackground((Drawable)object5);
            object5 = AJIOApplication$a.a();
            n8 = R$drawable.ajio_emi_tab_selector_2;
            object5 = t70.getDrawable((Context)object5, n8);
            object7.setBackground((Drawable)object5);
            n3 = R$string.all_emi_list;
            object5 = this.getString(n3);
            object2.setText((CharSequence)object5);
            n7 = R$string.no_cost_emi;
            object2 = this.getString(n7);
            object7.setText((CharSequence)object2);
        }
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        ((TabLayout)((Object)object2)).addOnTabSelectedListener(this);
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        if ((object5 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object5;
        }
        object4 = ((TabLayout)((Object)object3)).getTabAt(0);
        ((TabLayout)((Object)object2)).selectTab((TabLayout$Tab)object4, bl2);
        n7 = (int)(og1_1.b() ? 1 : 0);
        if (n7 != 0) {
            n7 = R$id.pesdk_toolbar;
            object2 = (Toolbar)object.findViewById(n7);
            n4 = R$id.pesdk_toolbar_title_tv;
            object = (TextView)object.findViewById(n4);
            object4 = hv3_0.K(R$string.search_other_bank);
            object.setText((CharSequence)object4);
            int n15 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object2).setNavigationIcon(n15);
            n4 = 1;
            object = new ro_1(this, n4);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object);
        } else {
            n7 = R$id.pesdk_toolbar;
            object2 = (Toolbar)object.findViewById(n7);
            n4 = R$id.pesdk_toolbar_title_tv;
            object = (TextView)object.findViewById(n4);
            n4 = R$string.search_other_bank;
            object4 = hv3_0.K(n4);
            object.setText((CharSequence)object4);
            int n16 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object2).setNavigationIcon(n16);
            object = new dy0_1(this);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object);
        }
        object = this.b;
        if (object != null) {
            object2 = "";
            object.setText((CharSequence)object2);
        }
        if ((object = this.b) != null) {
            object2 = new iy0_1(this);
            object.addTextChangedListener((TextWatcher)object2);
        }
    }
}

