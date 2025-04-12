/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.myaccount.order.fragment.OrderListFragment$addOperationMessageViewObserver$onGlobalLayoutListener$1;
import com.ril.ajio.myaccount.order.fragment.a;
import com.ril.ajio.myaccount.order.fragment.b$a;
import com.ril.ajio.myaccount.order.fragment.b$b;
import com.ril.ajio.myaccount.order.fragment.b$c;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class b
extends c61_0
implements FragmentTitlesInterface,
jv1_2,
View.OnClickListener,
OnNavigationClickListener,
Av,
xc1_2 {
    public static final b$a Companion;
    public static final String Z;
    public RecyclerView A;
    public TextView B;
    public TextView C;
    public ShimmerFrameLayout D;
    public final lq2_1 E;
    public final hh3_2 F;
    public final hh3_2 G;
    public final hh3_2 H;
    public boolean I;
    public String J;
    public String K;
    public boolean L;
    public final NewCustomEventsRevamp M;
    public final String N;
    public final String O;
    public final boolean P;
    public Timer Q;
    public Integer R;
    public gE2 S;
    public final hh3_2 T;
    public int U;
    public String X;
    public JioAdView Y;
    public Component f;
    public AjioButton g;
    public AjioButton h;
    public RecyclerView i;
    public Button j;
    public Button k;
    public RelativeLayout l;
    public TextView m;
    public CustomToolbarViewMerger n;
    public OnFragmentInteractionListener o;
    public ps1_2 p;
    public View q;
    public tf2_2 r;
    public AjioLoaderView s;
    public ky1_0 t;
    public AjioTextView u;
    public AjioTextView v;
    public LinearLayout w;
    public LinearLayout x;
    public TextView y;
    public View z;

    static {
        Object object = new Object();
        Companion = object;
        object = b.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "getSimpleName(...)");
        Z = object;
    }

    public b() {
        lq2_1.Companion.getClass();
        Object object = lq2$a_0.a(this);
        ((lq2_1)object).e();
        int n3 = 1;
        Object object2 = new iq2_1[n3];
        Iq2$b iq2$b = Iq2$b.b;
        object2[0] = iq2$b;
        ((lq2_1)object).g((iq2_1)object2);
        object2 = PermissionTrigger.RATINGS;
        ((lq2_1)object).f((PermissionTrigger)((Object)object2));
        this.E = object;
        object = new fb0_1(this, 2);
        this.F = object = yr1_2.b((Function0)object);
        object = new Object();
        this.G = object = yr1_2.b((Function0)object);
        object = new sf2_1(this, 0);
        this.H = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.M = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.N = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.O = object = cv_0.a((AnalyticsManager$Companion)object);
        this.P = n3;
        hv3_0.D();
        object = new sb0_1(this, n3);
        this.T = object = yr1_2.b((Function0)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Va(Banner object, int n3) {
        Object object2;
        Object object3 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object3, "EXTERNAL_AD");
        CharSequence charSequence = "getHost(...)";
        String string2 = null;
        String string3 = "";
        if (n4 != 0) {
            object3 = ((Banner)object).getBannerAdsMetaData();
            if (object3 != null) {
                string2 = ((BannerAdsMetaData)object3).getCtaFb();
            }
            if (string2 != null && (n4 = string2.length()) != 0) {
                object3 = new URL(string2);
                object3 = ((URL)object3).getHost();
                Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
            } else {
                object3 = string3;
            }
            charSequence = "TPBA";
        } else {
            object3 = ((Banner)object).getBannerType();
            n4 = Intrinsics.areEqual(object3, object2 = "AD");
            if (n4 != 0) {
                object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null) {
                    string2 = ((BannerAdsMetaData)object3).getCtaFb();
                }
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object3 = new URL(string2);
                    object3 = ((URL)object3).getHost();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                } else {
                    object3 = string3;
                }
                charSequence = "jioads_direct_demand";
            } else {
                object3 = ((Banner)object).getBannerUrl();
                if (object3 == null) {
                    object3 = string3;
                }
                int n7 = 100;
                object3 = le3_2.E(n7, (String)object3);
                charSequence = "paid";
            }
        }
        Object object4 = object3;
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        string2 = ((Banner)object).getBannerUrl();
        if (string2 != null) {
            string3 = string2;
        }
        object3.getClass();
        object3 = cp_1.k(string3);
        String string4 = n1.a((String)charSequence, " - ", (String)object3);
        object3 = ((Banner)object).getWidth();
        object = ((Banner)object).getHeight();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(object3);
        ((StringBuilder)charSequence).append("x");
        ((StringBuilder)charSequence).append(object);
        String string5 = ((StringBuilder)charSequence).toString();
        String string6 = hj0_0.a(n3, "0|");
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = bv_0.a((AnalyticsManager$Companion)object);
        ((NewEEcommerceEventsRevamp)object2).pushSelectContentEventForThirdPartyBanner(string7, string8, (String)object4, string4, string5, string6);
    }

    public final void I() {
        OrderListFunctionalRepo orderListFunctionalRepo = OrderListFunctionalRepo.INSTANCE;
        int n3 = orderListFunctionalRepo.getCurrentPage() + 1;
        orderListFunctionalRepo.setCurrentPage(n3);
        int n4 = orderListFunctionalRepo.getCurrentPage();
        this.Sa(n4, false);
    }

    public final void I4(Banner object, int n3, String string2) {
        Intrinsics.checkNotNullParameter(object, "banner");
        Object object2 = ((Banner)object).getBannerType();
        int n4 = Intrinsics.areEqual(object2, "AD");
        hh3_2 hh3_22 = this.F;
        String string3 = "Web view Screen";
        String string4 = "ajio";
        String string5 = null;
        if (n4 != 0) {
            xv$a_0 xv$a_0;
            if (string2 != null && (n4 = string2.length()) != 0 && (n4 = (int)(((h40_0)(object2 = h40_0.a)).p1(xv$a_0 = xv$a_0.OrderList) ? 1 : 0)) != 0) {
                boolean bl2;
                com.ril.ajio.myaccount.order.fragment.b.Va((Banner)object, n3);
                Object object3 = ((Banner)object).getBannerAdsMetaData();
                if (object3 != null && (object3 = ((BannerAdsMetaData)object3).getClickTracker()) != null) {
                    if ((object = ((Banner)object).getBannerAdsMetaData()) != null) {
                        string5 = ((BannerAdsMetaData)object).getCcbValue();
                    }
                    Intrinsics.checkNotNullParameter(object3, "url");
                    long l2 = k7.p();
                    object = String.valueOf(l2);
                    object2 = "[trq]";
                    object = kotlin.text.b.n((String)object3, (String)object2, (String)object, false);
                    if (string5 == null) {
                        string5 = "";
                    }
                    object = kotlin.text.b.n((String)object, "[ccb]", string5, false);
                    object3 = (BannerAdViewModel)hh3_22.getValue();
                    ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
                }
                if (bl2 = StringsKt.F(string2, string4, false)) {
                    object = AnalyticsManager.Companion;
                    km_1.a((AnalyticsManager$Companion)object, string3);
                }
                object = kj0_1.g();
                object3 = this.getActivity();
                ((kj0_1)object).w((Activity)object3, string2);
            }
        } else {
            String string6;
            object2 = ((Banner)object).getBannerType();
            n4 = (int)(Intrinsics.areEqual(object2, string6 = "EXTERNAL_AD") ? 1 : 0);
            if (n4 != 0) {
                if (string2 != null && (n4 = string2.length()) != 0) {
                    object2 = h40_0.a;
                    object2 = xv$a_0.OrderList;
                    n4 = (int)(h40_0.r2((xv$a_0)((Object)object2)) ? 1 : 0);
                    if (n4 != 0) {
                        boolean bl3;
                        com.ril.ajio.myaccount.order.fragment.b.Va((Banner)object, n3);
                        object = ((Banner)object).getBannerAdsMetaData();
                        if (object != null) {
                            string5 = ((BannerAdsMetaData)object).getClickTracker();
                        }
                        if (string5 != null) {
                            object = (BannerAdViewModel)hh3_22.getValue();
                            ((BannerAdViewModel)object).callBannerClickImpression(string5);
                        }
                        if (bl3 = StringsKt.F(string2, string4, false)) {
                            object = AnalyticsManager.Companion;
                            km_1.a((AnalyticsManager$Companion)object, string3);
                        }
                        object = kj0_1.g();
                        FragmentActivity fragmentActivity = this.getActivity();
                        ((kj0_1)object).w(fragmentActivity, string2);
                    }
                }
            } else if (string2 != null && (n4 = string2.length()) != 0) {
                object2 = h40_0.a;
                object2 = xv$a_0.OrderList;
                n4 = (int)(h40_0.R0((xv$a_0)((Object)object2)) ? 1 : 0);
                if (n4 != 0) {
                    com.ril.ajio.myaccount.order.fragment.b.Va((Banner)object, n3);
                    object = kj0_1.g();
                    FragmentActivity fragmentActivity = this.getActivity();
                    ((kj0_1)object).w(fragmentActivity, string2);
                }
            }
        }
    }

    public final void Pa() {
        String string2 = this.X;
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0) {
            string2 = this.x;
            String string3 = null;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoCollapsedView");
                n3 = 0;
                string2 = null;
            }
            string2.setVisibility(0);
            string2 = this.w;
            if (string2 == null) {
                string2 = "infoExpandedView";
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                string3 = string2;
            }
            n3 = 8;
            string3.setVisibility(n3);
            this.Ta();
        }
    }

    public final void Qa() {
        Object object;
        Object object2 = OrderListFunctionalRepo.INSTANCE;
        boolean bl2 = ((OrderListFunctionalRepo)object2).isOrderDateRangeAvailable();
        if (bl2 && !(bl2 = (object = this.requireActivity()).isFinishing()) && (bl2 = this.isAdded()) && !(bl2 = this.isRemoving())) {
            object = com.ril.ajio.myaccount.order.fragment.a.Companion;
            Collection collection = ((OrderListFunctionalRepo)object2).getOrderDateRange();
            Object object3 = new ArrayList(collection);
            object2 = ((OrderListFunctionalRepo)object2).getCurrentOrderDateRangeKey();
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, "allDateRange");
            object = new a();
            collection = new Bundle();
            String string2 = "dateRange";
            collection.putParcelableArrayList(string2, (ArrayList)object3);
            collection.putString("currentDateRange", (String)object2);
            ((Fragment)object).setArguments((Bundle)collection);
            int n3 = 9438;
            ((Fragment)object).setTargetFragment(this, n3);
            object2 = this.requireParentFragment().getChildFragmentManager();
            object3 = "DateRangeDialog";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
        }
    }

    public final void Ra() {
        String string2 = this.X;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = this.I)) {
            string2 = this.x;
            String string3 = null;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoCollapsedView");
                bl2 = false;
                string2 = null;
            }
            int n3 = 8;
            string2.setVisibility(n3);
            string2 = this.w;
            if (string2 == null) {
                string2 = "infoExpandedView";
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                string3 = string2;
            }
            string2 = null;
            string3.setVisibility(0);
            this.I = bl2 = true;
            this.Ta();
        }
    }

    public final void Sa(int n3, boolean bl2) {
        qf2_2 qf2_22;
        Object object;
        int n4;
        Object object2;
        if (bl2) {
            object2 = this.s;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
                n4 = 0;
                object2 = null;
            }
            ((AjioLoaderView)((Object)object2)).startLoader();
        }
        object2 = "shimmerView";
        Object object3 = "shimmerLayout";
        if (!bl2 && (bl2 = (object = OrderListFunctionalRepo.INSTANCE).getCurrentPage())) {
            object = this.D;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object = null;
            }
            hv3_0.s0((ShimmerFrameLayout)((Object)object));
            object = this.q;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object2);
                bl2 = false;
                object = null;
            }
            n4 = 8;
            object.setVisibility(n4);
        } else {
            object = this.q;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object2);
                bl2 = false;
                object = null;
            }
            n4 = 0;
            object2 = null;
            object.setVisibility(0);
            object = this.D;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object = null;
            }
            hv3_0.p0((ShimmerFrameLayout)((Object)object));
        }
        object = this.r;
        if (object == null) {
            object = "orderListViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            object3 = null;
        } else {
            object3 = object;
        }
        String string2 = OrderListFunctionalRepo.INSTANCE.getCurrentOrderDateRangeKey();
        boolean bl3 = hv3_0.D();
        object3.getClass();
        object = md3_0.c((jD3)object3);
        object2 = qf2_22;
        qf2_22 = new qf2_2((tf2_2)object3, n3, string2, bl3, null);
        Ae3.d((i90_0)object, null, null, qf2_22, 3);
    }

    public final void Ta() {
        int n3 = this.U;
        int n4 = 1;
        String string2 = "readMore";
        String string3 = "readLess";
        AjioButton ajioButton = null;
        if (n3 > n4) {
            AjioButton ajioButton2 = this.h;
            if (ajioButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                ajioButton2 = null;
            }
            n4 = 0;
            ajioButton2.setVisibility(0);
            ajioButton2 = this.g;
            if (ajioButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioButton = ajioButton2;
            }
            ajioButton.setVisibility(0);
        } else {
            AjioButton ajioButton3 = this.h;
            if (ajioButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                ajioButton3 = null;
            }
            n4 = 8;
            ajioButton3.setVisibility(n4);
            ajioButton3 = this.g;
            if (ajioButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioButton = ajioButton3;
            }
            ajioButton.setVisibility(n4);
        }
    }

    public final void Ua() {
        Object object;
        Object object2;
        Object object3;
        FragmentActivity fragmentActivity;
        Object object4;
        int n3;
        Object object5;
        Object object6;
        Object object7;
        int n4;
        int n7;
        Object object8 = this.z;
        Object object9 = null;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoOrderLayout");
            n7 = 0;
            object8 = null;
        }
        int n8 = 8;
        object8.setVisibility(n8);
        object8 = OrderListFunctionalRepo.INSTANCE;
        Object object10 = ((OrderListFunctionalRepo)object8).getOrderHistory();
        if (object10 != null) {
            object10 = ((OrderHistory)object10).getOperationalMessage();
        } else {
            n4 = 0;
            object10 = null;
        }
        this.X = object10;
        n4 = TextUtils.isEmpty((CharSequence)object10);
        Object object11 = "mRecyclerView";
        if (n4 == 0) {
            object7 = this.u;
            object10 = "topMsgExpand";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                n8 = 0;
                object7 = null;
            }
            object6 = this.X;
            object7.setText((CharSequence)object6);
            object7 = this.v;
            object6 = "topMsgCollapse";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object7 = null;
            }
            object5 = this.X;
            object7.setText((CharSequence)object5);
            object7 = this.v;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n8 = 0;
                object7 = null;
            }
            ai0_2.B((View)object7);
            object7 = new OrderListFragment$addOperationMessageViewObserver$onGlobalLayoutListener$1(this);
            object6 = this.u;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                n3 = 0;
                object6 = null;
            }
            object10 = object6.getViewTreeObserver();
            object10.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object7);
            object7 = this.i;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object7 = null;
            }
            object10 = new zf2_0(this);
            ((RecyclerView)object7).addOnScrollListener((RecyclerView$s)object10);
            this.Ra();
        } else {
            object10 = this.w;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoExpandedView");
                n4 = 0;
                object10 = null;
            }
            object10.setVisibility(n8);
            object10 = this.x;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoCollapsedView");
                n4 = 0;
                object10 = null;
            }
            object10.setVisibility(n8);
        }
        object7 = this.i;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object11);
            n8 = 0;
            object7 = null;
        }
        if ((object7 = ((RecyclerView)object7).getAdapter()) == null && (object7 = this.getActivity()) != null) {
            object5 = ((OrderListFunctionalRepo)object8).getOrderList();
            object4 = ((OrderListFunctionalRepo)object8).getOrderDateRange();
            fragmentActivity = this.getActivity();
            object6 = object7;
            object3 = this;
            object2 = this;
            object = this;
            object7 = new if2_0((ArrayList)object5, (List)object4, this, this, fragmentActivity, this);
            ((if2_0)object7).m = object10 = ((OrderListFunctionalRepo)object8).getDataRangeResultValueForKey();
            object10 = z40_0.Companion;
            object10 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object10).a;
            object6 = "enableOrderListDateFilter";
            n4 = (int)(((ao0_0)object10).a((String)object6) ? 1 : 0);
            ((if2_0)object7).n = n4;
            object10 = this.i;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n4 = 0;
                object10 = null;
            }
            ((RecyclerView)object10).setAdapter((RecyclerView$f)object7);
            ((if2_0)object7).h = object10 = new if0_0(this);
            ((if2_0)object7).l = object10 = new b$c(this);
            n3 = 3;
            ((if2_0)object7).i = object10 = new ap0_0(this, n3);
        } else {
            object7 = this.i;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object7 = null;
            }
            if ((object7 = ((RecyclerView)object7).getAdapter()) != null) {
                object7 = this.i;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                    n8 = 0;
                    object7 = null;
                }
                if ((n8 = (object7 = ((RecyclerView)object7).getAdapter()) instanceof if2_0) != 0) {
                    object7 = this.i;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                        n8 = 0;
                        object7 = null;
                    }
                    object7 = ((RecyclerView)object7).getAdapter();
                    Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.adapter.OrderListRecyclerAdapter");
                    object7 = (if2_0)object7;
                    ((if2_0)object7).m = object10 = ((OrderListFunctionalRepo)object8).getDataRangeResultValueForKey();
                }
                if ((object7 = this.i) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                    n8 = 0;
                    object7 = null;
                }
                if ((object7 = ((RecyclerView)object7).getAdapter()) != null) {
                    ((RecyclerView$f)object7).notifyDataSetChanged();
                }
            }
        }
        object7 = this.i;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object11);
            n8 = 0;
            object7 = null;
        }
        if ((n8 = object7.getVisibility()) != 0) {
            object7 = this.i;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object7 = null;
            }
            n4 = 0;
            object10 = null;
            object7.setVisibility(0);
        }
        object7 = new Bundle();
        int n10 = ((OrderListFunctionalRepo)object8).getTotalOrdersCount();
        object7.putInt("total_number_of_orders", n10);
        n4 = ((OrderListFunctionalRepo)object8).getCurrentPage() + 1;
        object7.putInt("page_number", n4);
        object11 = ((OrderListFunctionalRepo)object8).getDataRangeResultValueForKey();
        object7.putString("date_range", (String)object11);
        object10 = AnalyticsManager.Companion;
        object11 = ((AnalyticsManager$Companion)object10).getInstance().getGtmEvents();
        object6 = "order listing screen";
        ((GTMEvents)object11).pushOpenScreenEvent((String)object6, (Bundle)object7);
        fragmentActivity = new Bundle();
        object7 = this.M.getNUMBER_OF_ORDER();
        n7 = ((OrderListFunctionalRepo)object8).getTotalOrdersCount();
        fragmentActivity.putInt((String)object7, n7);
        object5 = ((AnalyticsManager$Companion)object10).getInstance().getNewCustomEventsRevamp();
        object2 = bv_0.a((AnalyticsManager$Companion)object10);
        object = cv_0.a((AnalyticsManager$Companion)object10);
        object4 = "order listing screen";
        object3 = "order management screen";
        ((NewCustomEventsRevamp)object5).newPushCustomScreenView((String)object4, (String)object3, (String)object2, (Bundle)fragmentActivity, (String)object);
        object8 = this.r;
        if (object8 == null) {
            object8 = "orderListViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
        } else {
            object9 = object8;
        }
        object8 = ((tf2_2)object9).j;
        if (object8 != null) {
            object7 = Looper.getMainLooper();
            object9 = new Handler((Looper)object7);
            object7 = new vf2_1((String)object8, this);
            long l2 = 150L;
            object9.postDelayed((Runnable)object7, l2);
        }
    }

    public final void W7(JioAdView jioAdView) {
        this.Y = jioAdView;
    }

    public final void Wa(float f5, String object) {
        Object object2 = this.i;
        if (object2 != null) {
            int n3 = 0;
            OrderListFunctionalRepo orderListFunctionalRepo = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                object2 = null;
            }
            if ((object2 = ((RecyclerView)object2).getAdapter()) != null) {
                if (object != null) {
                    boolean bl2;
                    Iterator iterator = OrderListFunctionalRepo.INSTANCE.getOrderList().iterator();
                    int n4 = 0;
                    Object var8_9 = null;
                    while (bl2 = iterator.hasNext()) {
                        Object object3 = iterator.next();
                        int n7 = n4 + 1;
                        if (n4 >= 0) {
                            Object object4 = ((OrderItemLine)(object3 = (OrderItemLine)object3)).getBaseProductId();
                            boolean bl3 = Intrinsics.areEqual(object4, object);
                            if (bl3 && (object4 = ((OrderItemLine)object3).getProductRating()) != null) {
                                object4 = Float.valueOf(f5);
                                ((OrderItemLine)object3).setProductRating((Float)object4);
                                object4 = OrderListFunctionalRepo.INSTANCE.getOrderList();
                                ((ArrayList)object4).set(n4, object3);
                            }
                            n4 = n7;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    ((RecyclerView$f)object2).notifyDataSetChanged();
                } else {
                    int n8;
                    object = this.R;
                    if (object != null && (n8 = ((Number)object).intValue()) != (n3 = -1)) {
                        Float f6;
                        orderListFunctionalRepo = OrderListFunctionalRepo.INSTANCE;
                        Serializable serializable = orderListFunctionalRepo.getOrderList();
                        if ((serializable = (OrderItemLine)CollectionsKt.N(n8, (List)((Object)serializable))) != null && (f6 = ((OrderItemLine)serializable).getProductRating()) != null) {
                            Serializable serializable2 = Float.valueOf(f5);
                            ((OrderItemLine)serializable).setProductRating((Float)serializable2);
                            serializable2 = orderListFunctionalRepo.getOrderList();
                            ((ArrayList)serializable2).set(n8, serializable);
                            ((RecyclerView$f)object2).notifyDataSetChanged();
                        }
                    }
                }
            }
        }
    }

    public final String getAjioTitle() {
        return "Orders & Payments";
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return "";
    }

    public final String getProductListTitle() {
        return "";
    }

    public final String getToolbarTitle() {
        return "";
    }

    public final Boolean hasBackButton() {
        return Boolean.FALSE;
    }

    public final void onActivityCreated(Bundle object) {
        int n3;
        int n4;
        super.onActivityCreated((Bundle)object);
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderListViewModel");
            n4 = 0;
            object = null;
        }
        object = ((tf2_2)object).e;
        Object object2 = this.getViewLifecycleOwner();
        int n7 = 0;
        Function1 function1 = new xf2_1(this, 0);
        Object object3 = new b$b(function1);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClosetViewModel");
            n4 = 0;
            object = null;
        }
        object = ((ky1_0)object).m;
        object2 = this.getViewLifecycleOwner();
        function1 = new bb_1(this, 2);
        object3 = new b$b(function1);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = ((BannerAdViewModel)this.F.getValue()).getAdditionalBannerLD();
        object2 = this.getViewLifecycleOwner();
        n7 = 1;
        function1 = new db_1(this, n7);
        object3 = new b$b(function1);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = OrderListFunctionalRepo.INSTANCE;
        object2 = ((OrderListFunctionalRepo)object).getOrderHistory();
        boolean bl2 = true;
        if (object2 != null && (n3 = ((ArrayList)(object2 = ((OrderListFunctionalRepo)object).getOrderList())).isEmpty()) == 0) {
            object2 = this.p;
            object3 = "myAcountFragmentsListener";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object2 = null;
            }
            n3 = object2.getRefreshOrderList();
            ps1_2 ps1_22 = this.p;
            if (ps1_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                ps1_22 = null;
            }
            object3 = null;
            ps1_22.setRefreshOrderList(false);
            n7 = -1;
            if (n3 != 0 && (n3 = ((OrderListFunctionalRepo)object).getClickedPageNumber()) != n7) {
                n4 = ((OrderListFunctionalRepo)object).getClickedPageNumber();
                this.Sa(n4, bl2);
            } else {
                ((OrderListFunctionalRepo)object).setClickedPageNumber(n7);
                this.Ua();
            }
        } else {
            n4 = ((OrderListFunctionalRepo)object).getCurrentPage();
            this.Sa(n4, bl2);
        }
        this.J = null;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnFragmentInteractionListener;
        if (bl2) {
            object2 = object;
            this.o = object2 = (OnFragmentInteractionListener)object;
            bl2 = object instanceof ps1_2;
            if (bl2) {
                object = (ps1_2)object;
                this.p = object;
                return;
            }
            object = pn_2.b(object, " must implement MyAcountFragmentsListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement OnFragmentInteractionListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.no_order_layout_btn_older_order;
        String string3 = Z;
        String string4 = "mListener";
        if (n3 == n4) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
            object = (String)object;
            string2 = "CLICK_ADD_FROM_CLOSET";
            n3 = (int)(Intrinsics.areEqual(object, string2) ? 1 : 0);
            if (n3 != 0) {
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    boolean bl2 = false;
                    object = null;
                }
                n3 = 1231;
                object.onFragmentInteraction(string3, n3, null);
            } else {
                string2 = "CLICK_START_SHOPPING";
                boolean bl3 = Intrinsics.areEqual(object, string2);
                if (bl3) {
                    this.Ua();
                }
            }
        } else {
            int n7 = R$id.no_order_layout_btn_shopping;
            if (n3 == n7) {
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n7 = 0;
                    object = null;
                }
                n3 = 1230;
                object.onFragmentInteraction(string3, n3, null);
            } else {
                n7 = R$id.lodcCvChangeOrderDateRange;
                if (n3 == n7) {
                    this.Qa();
                } else {
                    n7 = R$id.lodcTvChangeOrderDateRange;
                    if (n3 == n7) {
                        this.Qa();
                    } else {
                        n7 = R$id.read_less;
                        if (n3 == n7) {
                            this.Pa();
                        } else {
                            n7 = R$id.read_more;
                            if (n3 == n7) {
                                n7 = 0;
                                object = null;
                                this.I = false;
                                this.Ra();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        Object object6 = "store";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object4, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object7 = tf2_2.class;
        String string4 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object5, object7, string4);
        object4 = "<this>";
        object5 = ef0_0.a(object7, string4, string4, (String)object4);
        object7 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.r = object3 = (tf2_2)((pD3)object3).a((yn1_2)object5, (String)object7);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object5 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object7 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, (String)object6);
            Intrinsics.checkNotNullParameter(object5, string2);
            Intrinsics.checkNotNullParameter(object7, string3);
            Class<ky1_0> clazz = ky1_0.class;
            object3 = rl3_0.b((rd3_0)object3, (E$b)object5, (Wd0)object7, clazz, string4);
            object5 = ef0_0.a(clazz, string4, string4, (String)object4);
            object7 = object5.getQualifiedName();
            if (object7 != null) {
                object7 = string6.concat((String)object7);
                this.t = object3 = (ky1_0)((pD3)object3).a((yn1_2)object5, (String)object7);
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object3 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object5 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object2 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object3, (String)object6);
                Intrinsics.checkNotNullParameter(object5, string2);
                Intrinsics.checkNotNullParameter(object2, string3);
                object6 = gE2.class;
                object2 = rl3_0.b((rd3_0)object3, (E$b)object5, (Wd0)object2, (Class)object6, string4);
                object3 = ef0_0.a((Class)object6, string4, string4, (String)object4);
                object4 = object3.getQualifiedName();
                if (object4 != null) {
                    object4 = string6.concat((String)object4);
                    this.S = object2 = (gE2)((pD3)object2).a((yn1_2)object3, (String)object4);
                    if (object != null) {
                        int n3;
                        object3 = null;
                        this.J = object2 = object.getString("ORDER_NO", null);
                        this.K = object2 = object.getString("RETURN_ID", null);
                        object2 = this.J;
                        object4 = "orderListViewModel";
                        if (object2 != null) {
                            object5 = this.r;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                n3 = 0;
                                object5 = null;
                            }
                            ((tf2_2)object5).j = object2;
                        }
                        if ((object2 = this.J) != null) {
                            object2 = new Bundle();
                            object6 = this.J;
                            object2.putString("product_code", (String)object6);
                            object5 = this.K;
                            object6 = Z;
                            string2 = "mListener";
                            string3 = "clicked_item_code";
                            if (object5 != null) {
                                object = object.getString(string3, null);
                                object2.putString(string3, (String)object);
                                object5 = this.K;
                                object2.putString("return_refund_return_id", (String)object5);
                                object = this.o;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    object = null;
                                }
                                n3 = 2;
                                object.onFragmentInteraction((String)object6, n3, (Bundle)object2);
                            } else {
                                n3 = object.containsKey(string3);
                                if (n3 != 0) {
                                    object = object.getString(string3, null);
                                    object2.putString(string3, (String)object);
                                    object = this.o;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        object = null;
                                    }
                                    n3 = 4;
                                    object.onFragmentInteraction((String)object6, n3, (Bundle)object2);
                                }
                            }
                            object = this.r;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                object = null;
                            }
                            ((tf2_2)object).j = null;
                        }
                    }
                    OrderListFunctionalRepo.INSTANCE.resetData();
                    return;
                }
                object2 = string5.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        Object object3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_orderlist_revamp;
        mu1_1 mu1_12 = null;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this);
        this.n = object;
        Intrinsics.checkNotNull(layoutInflater);
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        object = this.S;
        object2 = "getViewLifecycleOwner(...)";
        if (object != null && (object = ((gE2)object).a) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(mu1_12, (String)object2);
            int n4 = 1;
            object3 = new x22_0(this, n4);
            b$b b$b = new b$b((Function1)object3);
            ((R53)object).e(mu1_12, b$b);
        }
        if ((object = this.S) != null && (object = ((gE2)object).b) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(mu1_12, (String)object2);
            int n7 = 2;
            object2 = new jb_2(this, n7);
            object3 = new b$b((Function1)object2);
            ((R53)object).e(mu1_12, (F62)object3);
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        super.onDestroy();
        OrderListFunctionalRepo.INSTANCE.resetData();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.Q;
        if (object != null) {
            ((Timer)object).cancel();
        }
        if ((object = this.Y) != null) {
            ((JioAdView)object).onDestroy();
        }
        da_2.Companion.getClass();
        da$b.a().getClass();
        da_2.a();
    }

    public final void onNavigationClick() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.o;
        if (onFragmentInteractionListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
            onFragmentInteractionListener = null;
        }
        String string2 = Z;
        onFragmentInteractionListener.onFragmentInteraction(string2, 12134, null);
    }

    public final void onResume() {
        super.onResume();
        Object object = this.X;
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            object = this.i;
            String string2 = "mRecyclerView";
            Integer n4 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object = ((RecyclerView)object).getLayoutManager()) != null) {
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                if ((object = (LinearLayoutManager)((RecyclerView)object).getLayoutManager()) != null) {
                    n3 = ((LinearLayoutManager)object).findFirstCompletelyVisibleItemPosition();
                    n4 = n3;
                }
                if (n4 != null && (n3 = n4.intValue()) == 0) {
                    this.Ra();
                } else {
                    this.Pa();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().setPreviousScreenData("order listing screen", "order management screen");
        AnalyticsGAEventHandler analyticsGAEventHandler = AnalyticsGAEventHandler.Companion.getInstance();
        Message message = new Message();
        message.what = 1004;
        analyticsGAEventHandler.sendMessage(message);
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Object object3;
        Object object4;
        int n3;
        int n4;
        Object object5;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = (AppCompatActivity)this.getActivity();
        Object object6 = "customToolbarViewMerger";
        Object object7 = null;
        if (object2 != null) {
            object5 = this.n;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                object5 = null;
            }
            object5 = ((CustomToolbarViewMerger)object5).getToolbar();
            object2.setSupportActionBar((Toolbar)object5);
        }
        object2 = this.p;
        object5 = "myAcountFragmentsListener";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object2 = null;
        }
        object2.hideToolbarLayout();
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        object2.setNavigationClick();
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        if ((object2 = object2.getToolbar()) != null) {
            object2.invalidate();
        }
        if ((object2 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        int n7 = 8;
        object2.setSubTitleVisibility(n7);
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        int n8 = R$string.orders;
        Object object8 = hv3_0.K(n8);
        object2.setTitleText((String)object8);
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        if ((object2 = object2.getToolbar()) != null) {
            n8 = R$string.acc_page_header_orders_listing;
            object8 = hv3_0.K(n8);
            object2.setContentDescription((CharSequence)object8);
        }
        object8 = Looper.getMainLooper();
        object2 = new Handler((Looper)object8);
        int n10 = 0;
        String string2 = null;
        object8 = new rf2_0(this, 0);
        long l2 = 500L;
        object2.postDelayed((Runnable)object8, l2);
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        object2 = object2.getHeaderTitleTv();
        object8 = " ";
        if (object2 != null) {
            n10 = R$string.header_text;
            string2 = hv3_0.K(n10);
            n3 = R$string.order_listing;
            object4 = hv3_0.K(n3);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append((String)object8);
            ((StringBuilder)object3).append((String)object4);
            string2 = ((StringBuilder)object3).toString();
            object2.setContentDescription((CharSequence)string2);
        }
        if ((object2 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        if ((object2 = object2.getFloatTitleTv()) != null) {
            n10 = R$string.title_text;
            string2 = hv3_0.K(n10);
            n3 = R$string.order_listing;
            object4 = hv3_0.K(n3);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append((String)object8);
            ((StringBuilder)object3).append((String)object4);
            object8 = ((StringBuilder)object3).toString();
            object2.setContentDescription((CharSequence)object8);
        }
        if ((object2 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        n8 = hv3_0.m(R$color.accent_color_10);
        object2.setTitleColor(n8);
        object2 = this.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object2 = null;
        }
        int n14 = hv3_0.m(R$color.white);
        object2.setBackGroundColor(n14);
        object6 = Looper.getMainLooper();
        object2 = new Handler((Looper)object6);
        object6 = new uf2_0(this);
        long l3 = 800L;
        object2.postDelayed((Runnable)object6, l3);
        object2 = this.p;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object2 = null;
        }
        n14 = 0;
        object6 = null;
        object2.showTabLayout(false);
        n4 = R$id.order_list_recycler_view;
        object2 = (RecyclerView)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.top_msg_expand_layout;
        object2 = (LinearLayout)object.findViewById(n4);
        this.w = object2;
        n4 = R$id.read_less;
        object2 = (AjioButton)object.findViewById(n4);
        this.h = object2;
        object5 = "readLess";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n4 = R$id.top_msg_collapse_layout;
        object2 = (LinearLayout)object.findViewById(n4);
        this.x = object2;
        n4 = R$id.top_msg_expand;
        object2 = (AjioTextView)object.findViewById(n4);
        this.u = object2;
        n4 = R$id.top_msg_collapse;
        object2 = (AjioTextView)object.findViewById(n4);
        this.v = object2;
        n4 = R$id.read_more;
        object2 = (AjioButton)object.findViewById(n4);
        this.g = object2;
        object8 = "readMore";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n4 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n4 = R$id.ajio_loader_view;
        object2 = (AjioLoaderView)object.findViewById(n4);
        this.s = object2;
        object2 = this.i;
        string2 = "mRecyclerView";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        object3 = this.requireActivity();
        int n15 = 1;
        object4 = new LinearLayoutManager((Context)object3, n15, false);
        object2.setLayoutManager((RecyclerView$o)object4);
        n4 = R$id.no_order_layout;
        object2 = object.findViewById(n4);
        this.z = object2;
        n4 = R$id.no_order_layout_tv_title;
        object2 = (TextView)object.findViewById(n4);
        this.C = object2;
        n4 = R$id.no_order_layout_lbl_closet;
        object2 = (TextView)object.findViewById(n4);
        this.y = object2;
        n4 = R$id.view_orderlist_shimmer;
        object2 = (ShimmerFrameLayout)object.findViewById(n4);
        this.D = object2;
        n4 = R$id.order_list_view_shimmer;
        object2 = object.findViewById(n4);
        this.q = object2;
        object2 = this.i;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        n10 = hv3_0.m(R$color.accent_color_19);
        object2.setBackgroundColor(n10);
        n4 = R$id.no_order_layout_rv;
        object2 = (RecyclerView)object.findViewById(n4);
        this.A = object2;
        n4 = R$id.no_order_layout_btn_shopping;
        object2 = (Button)object.findViewById(n4);
        this.j = object2;
        n4 = R$id.no_order_layout_btn_older_order;
        object2 = (Button)object.findViewById(n4);
        this.k = object2;
        n4 = R$id.lodcTvOrderDateRange;
        object2 = (TextView)object.findViewById(n4);
        this.B = object2;
        n4 = R$id.lodcCvChangeOrderDateRange;
        object2 = (RelativeLayout)object.findViewById(n4);
        this.l = object2;
        n4 = R$id.lodcTvChangeOrderDateRange;
        object = (TextView)object.findViewById(n4);
        this.m = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n7);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n7);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOlderOrderBtn");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShoppingBtn");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.l;
        object2 = "cvChangeOrderDateRange";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.m;
        object5 = "tvChangeOrderDateRange";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        bl2 = this.P;
        if (bl2) {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object7 = object;
            }
            object7.setVisibility(0);
        } else {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object7 = object;
            }
            object7.setVisibility(0);
        }
    }

    public final boolean p4() {
        OrderListFunctionalRepo orderListFunctionalRepo = OrderListFunctionalRepo.INSTANCE;
        int n3 = orderListFunctionalRepo.getCurrentPage();
        int n4 = orderListFunctionalRepo.getTotalPages();
        int n7 = 1;
        if (n3 >= (n4 -= n7)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final void u9(BannerAdsMetaData object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdsMetaData");
        Object object2 = ((BannerAdsMetaData)object).getImpressionTracker();
        if (object2 != null) {
            object = ((BannerAdsMetaData)object).getCcbValue();
            Intrinsics.checkNotNullParameter(object2, "url");
            long l2 = k7.p();
            String string2 = String.valueOf(l2);
            String string3 = "[trq]";
            object2 = kotlin.text.b.n((String)object2, string3, string2, false);
            if (object == null) {
                object = "";
            }
            string2 = "[ccb]";
            object = kotlin.text.b.n((String)object2, string2, (String)object, false);
            object2 = (BannerAdViewModel)this.F.getValue();
            ((BannerAdViewModel)object2).callBannerViewImpression((String)object);
        }
    }
}

