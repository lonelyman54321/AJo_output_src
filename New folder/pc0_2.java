/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.view.BaseActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pc0
 */
public final class pc0_2
extends ew_2
implements View.OnClickListener {
    public TabLayout b;
    public ViewPager c;
    public gc0_1 d;
    public zr1_1 e;
    public int f;
    public fd0_2 g;
    public LinearLayout h;
    public TextView i;
    public AjioProgressView j;

    public final void Oa() {
        TabLayout tabLayout = null;
        int n3 = 1;
        Object object = this.getActivity();
        if (object != null) {
            Object object2;
            Object object3;
            TextView textView;
            int n4;
            Object object4;
            int n7;
            int n8;
            Object object5 = this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object5, "getChildFragmentManager(...)");
            Object object6 = this.getContext();
            this.d = object = new gc0_1((Context)object6, (FragmentManager)object5);
            object5 = this.c;
            if (object5 != null) {
                ((ViewPager)((Object)object5)).setAdapter((Uk2)object);
            }
            if ((object = this.b) != null) {
                object5 = this.c;
                ((TabLayout)((Object)object)).setupWithViewPager((ViewPager)((Object)object5));
            }
            if ((object = this.c) != null) {
                ((ViewPager)((Object)object)).setCurrentItem(0);
            }
            object = this.c;
            int n10 = 3;
            if (object != null) {
                ((ViewPager)((Object)object)).setOffscreenPageLimit(n10);
            }
            object = this.g;
            object6 = null;
            if (object != null && (object = ((fd0_2)object).g) != null && (n8 = ((ArrayList)object).size()) == n3) {
                object = this.i;
                if (object != null) {
                    n7 = R$string.coupon_offer;
                    object4 = this.g;
                    if (object4 != null && (object4 = ((fd0_2)object4).g) != null) {
                        n4 = ((ArrayList)object4).size();
                        object4 = n4;
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    textView = new Object[n3];
                    textView[0] = object4;
                    object3 = hv3_0.L(n7, (Object[])textView);
                    object.setText((CharSequence)object3);
                }
            } else {
                object = this.i;
                if (object != null) {
                    n7 = R$string.coupon_offers;
                    object4 = this.g;
                    if (object4 != null && (object4 = ((fd0_2)object4).g) != null) {
                        n4 = ((ArrayList)object4).size();
                        object4 = n4;
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    textView = new Object[n3];
                    textView[0] = object4;
                    object3 = hv3_0.L(n7, (Object[])textView);
                    object.setText((CharSequence)object3);
                }
            }
            if ((object = this.i) != null) {
                object.setVisibility(0);
            }
            object = null;
            for (n8 = 0; n8 < n10; n8 += n3) {
                object3 = this.b;
                if (object3 != null) {
                    object3 = object3.getTabAt(n8);
                } else {
                    n7 = 0;
                    object3 = null;
                }
                if (object3 == null) continue;
                object4 = this.d;
                if (object4 != null) {
                    int n14;
                    object4 = LayoutInflater.from((Context)((gc0_1)object4).j);
                    int n15 = R$layout.coupon_custom_tab;
                    object4 = object4.inflate(n15, null, false);
                    n15 = R$id.coupon_list_type;
                    textView = (TextView)object4.findViewById(n15);
                    if (n8 != 0) {
                        if (n8 != n3) {
                            n14 = R$string.bank_offers;
                            textView.setText(n14);
                        } else {
                            n14 = R$string.coupons;
                            textView.setText(n14);
                        }
                    } else {
                        n14 = R$string.all;
                        textView.setText(n14);
                    }
                    Intrinsics.checkNotNull(object4);
                } else {
                    n4 = 0;
                    object4 = null;
                }
                ((TabLayout$Tab)object3).setCustomView((View)object4);
            }
            tabLayout = this.b;
            if (tabLayout != null) {
                Intrinsics.checkNotNull((Object)tabLayout);
                n3 = tabLayout.getSelectedTabPosition();
                object6 = tabLayout.getTabAt(n3);
            }
            if (object6 != null && (tabLayout = object6.getCustomView()) != null) {
                n3 = R$id.coupon_list_type;
                tabLayout = (TextView)tabLayout.findViewById(n3);
                n3 = hv3_0.m(R$color.blue);
                tabLayout.setTextColor(n3);
                object2 = FontsManager.getInstance();
                object = this.getContext();
                n10 = 8;
                object2 = ((FontsManager)object2).getTypefaceWithFont((Context)object, n10);
                tabLayout.setTypeface((Typeface)object2);
            }
            if ((tabLayout = this.b) != null) {
                object2 = new qc0_2(this);
                tabLayout.addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object2);
            }
        }
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.coupon_cancel_container;
        if (n3 == n4 && (object = this.getActivity()) != null && (object = this.getActivity()) != null) {
            ((ComponentActivity)object).onBackPressed();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("Offers Page");
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        String string2 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string2, (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = fd0_2.class;
        object3 = "modelClass";
        object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = string2.concat((String)object3);
            this.g = object = (fd0_2)((pD3)object).a((yn1_2)object2, (String)object3);
            if (object != null && (object = ((fd0_2)object).g) != null) {
                ((ArrayList)object).clear();
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.activity_coupon;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n4 = object2 instanceof BaseActivity;
        if (n4 != 0) {
            object2 = this.getActivity();
            object4 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
            Intrinsics.checkNotNull(object2, (String)object4);
            ((BaseActivity)object2).hideToolbarLayout();
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, (String)object4);
            object2 = (BaseActivity)object2;
            ((BaseActivity)object2).F2();
        }
        n4 = R$id.coupon_tab;
        object2 = (TabLayout)object.findViewById(n4);
        this.b = object2;
        n4 = R$id.coupon_view_pager;
        object2 = (ViewPager)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.coupon_cancel_container;
        object2 = (LinearLayout)object.findViewById(n4);
        this.h = object2;
        n4 = R$id.coupon_toolbar_offer_count;
        object2 = (TextView)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.coupon_progress_bar;
        object = (AjioProgressView)object.findViewById(n4);
        this.j = object;
        object = this.h;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.i) != null) {
            n4 = 8;
            object.setVisibility(n4);
        }
        object = new zr1_1();
        this.e = object;
        object = this.g;
        if (object != null && (object = ((fd0_2)object).d) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new mc0_2(this, 0);
            object3 = new pc0$a((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.g) != null && (object = ((fd0_2)object).f) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new nc0_2(this, 0);
            object3 = new pc0$a((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.e) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new oc0_1(this, 0);
            object3 = new pc0$a((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.g) != null && (object = ((fd0_2)object).g) != null && (n3 = ((ArrayList)object).size()) == 0) {
            bx0_2 bx0_22;
            int n7;
            int n8;
            this.f = n3 = 2;
            object = this.e;
            n4 = 0;
            object2 = null;
            if (object != null) {
                object4 = 0;
                ((LiveData)object).k(object4);
            }
            if ((object = this.j) != null) {
                object.setVisibility(0);
            }
            if ((object = this.g) != null) {
                object2 = ((fd0_2)object).a.getOfferCouponList();
                object4 = new xc0_1((fd0_2)object);
                object3 = new yc0_0((Function1)object4);
                n8 = 0;
                object4 = new zc0_1(object, 0);
                n7 = 0;
                bx0_22 = new ad0_2(0, (Function1)object4);
                object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)((Object)bx0_22));
                object = ((fd0_2)object).b;
                ((t30_0)object).b((yr0_2)object2);
            }
            if ((object = this.g) != null) {
                object2 = ((fd0_2)object).a.getOfferBankList();
                object4 = new bd0_2(object, 0);
                n8 = 1;
                object3 = new gc_0(n8, (Function1)object4);
                object4 = new hc_2((Hj)object, n8);
                n7 = 1;
                bx0_22 = new ic_0(n7, (Function1)object4);
                object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)((Object)bx0_22));
                object = ((fd0_2)object).b;
                ((t30_0)object).b((yr0_2)object2);
            }
        } else {
            this.Oa();
        }
    }
}

