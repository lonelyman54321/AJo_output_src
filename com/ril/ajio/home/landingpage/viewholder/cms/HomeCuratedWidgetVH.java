/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package com.ril.ajio.home.landingpage.viewholder.cms;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.customviews.CustomLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH$a;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import com.ril.ajio.services.data.options.CuratedWidget;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class HomeCuratedWidgetVH
extends RecyclerView$B
implements TT2$b {
    public final View a;
    public final U71 b;
    public final OnGAEventHandlerListener c;
    public final tt2_2 d;
    public final kc1_2 e;
    public final OnGACuratedWidgetEventHandlerListener f;
    public final e00$a g;
    public final ConstraintLayout h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final RecyclerView k;
    public final AnalyticsGAEventHandlerMultipleWidget l;
    public final AnalyticsGAEventHandlerMultipleWidget m;
    public String n;
    public int o;
    public String p;
    public HomeRowData q;
    public final HomeCuratedWidgetVH$a r;

    public HomeCuratedWidgetVH(View object, U71 object2, OnGAEventHandlerListener object3, tt2_2 tt2_22, kc1_2 kc1_22, OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener, e00$a e00$a) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object3, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        Intrinsics.checkNotNullParameter((Object)e00$a, "cmsPageTypes");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = tt2_22;
        this.e = kc1_22;
        this.f = onGACuratedWidgetEventHandlerListener;
        this.g = e00$a;
        int n3 = R$id.product_widget_parent;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.h = object2;
        n3 = R$id.product_widget_title_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.i = object2;
        n3 = R$id.product_widget_subtitle_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.j = object2;
        n3 = R$id.home_product_widget_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (RecyclerView)object;
        this.k = object;
        object = AnalyticsGAEventHandlerMultipleWidget.Companion;
        object2 = object.getInstance();
        this.l = object2;
        object = object.getMultipleWidgetInstance();
        this.m = object;
        object = "";
        this.n = object;
        this.p = object;
        super(this);
        this.r = object;
    }

    public final String k() {
        return this.p;
    }

    public final void w() {
        Object object = this.b;
        if (object != null) {
            int n3 = this.getBindingAdapterPosition();
            object.z(n3);
        }
        object = kotlinx.coroutines.d.a(ir0_2.a);
        m71_0 m71_02 = new m71_0(this, null);
        Ae3.d((i90_0)object, null, null, m71_02, 3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(HomeRowData homeRowData) {
        HomeCuratedWidgetVH homeCuratedWidgetVH = this;
        HomeRowData homeRowData2 = homeRowData;
        this.q = homeRowData;
        if (homeRowData == null) return;
        Object object = homeRowData.getBanners();
        Object object2 = this.h;
        if (object != null) {
            object = homeRowData.getBanners();
            Intrinsics.checkNotNull(object);
            int n3 = object.isEmpty();
            if (n3 == 0) {
                int n4;
                Object object3;
                Object object4;
                Object object5;
                int n7;
                Object object6;
                int n8;
                Object object7;
                int n10;
                object = homeRowData.getBgColor();
                if (object != null && (n3 = ((String)object).length()) > 0) {
                    object = homeRowData.getBgColor();
                    n3 = Color.parseColor((String)object);
                    object2.setBackgroundColor(n3);
                } else {
                    object = object2.getContext();
                    n10 = R$color.white;
                    n3 = t70.getColor((Context)object, n10);
                    object2.setBackgroundColor(n3);
                }
                object = homeRowData.getHeading();
                Object object8 = homeCuratedWidgetVH.i;
                U71 u71 = homeCuratedWidgetVH.b;
                if (object != null && (n3 = ((String)object).length()) != 0) {
                    homeCuratedWidgetVH.n = object = homeRowData.getHeading();
                    object = homeRowData.getHeading();
                    object8.setText((CharSequence)object);
                    ai0_2.B((View)object8);
                    if (u71 != null) {
                        object = homeRowData.getHeading();
                        u71.I((String)object);
                    }
                } else {
                    ai0_2.i((View)object8);
                }
                object = homeRowData.getSubHeading();
                object8 = homeCuratedWidgetVH.j;
                if (object != null && (n3 = ((String)object).length()) != 0) {
                    object = homeRowData.getSubHeading();
                    object8.setText((CharSequence)object);
                    ai0_2.B((View)object8);
                } else {
                    ai0_2.i((View)object8);
                }
                object = homeRowData.getBanners();
                if (object != null) {
                    n3 = object.size();
                } else {
                    n3 = 0;
                    object = null;
                }
                Object object9 = "";
                if (n3 > 0) {
                    n3 = 0;
                    object = null;
                    if (u71 != null && (object8 = u71.H(n10 = this.getBindingAdapterPosition())) != null) {
                        object8 = ((CuratedWidget)object8).getLayoutType();
                    } else {
                        n10 = 0;
                        object8 = null;
                    }
                    object7 = homeRowData.getBanners();
                    if (object7 != null && (object7 = (BannerData)CollectionsKt.N(0, (List)object7)) != null) {
                        object7 = ((BannerData)object7).getNoOfproducts();
                    } else {
                        n8 = 0;
                        object7 = null;
                    }
                    if (object7 != null) {
                        object7 = homeRowData.getBanners();
                        if (object7 != null && (object7 = (BannerData)CollectionsKt.N(0, (List)object7)) != null) {
                            object7 = ((BannerData)object7).getNoOfproducts();
                        } else {
                            n8 = 0;
                            object7 = null;
                        }
                        Intrinsics.checkNotNull(object7);
                        n8 = (Integer)object7;
                    } else {
                        n8 = 0;
                        object7 = null;
                    }
                    object6 = CuratedLayoutType.HOME_WIDGET_TYPE_HIDE;
                    if (object8 != object6 && n8 != 0) {
                        object2 = homeRowData.getBanners();
                        if (object2 != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                            object2 = ((BannerData)object2).getNoOfproducts();
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        if (object2 != null) {
                            object2 = homeRowData.getBanners();
                            if (object2 != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                                object2 = ((BannerData)object2).getNoOfproducts();
                            } else {
                                n7 = 0;
                                object2 = null;
                            }
                            object2 = String.valueOf(object2);
                        } else {
                            object2 = "10";
                        }
                        Object object10 = object2;
                        object2 = homeRowData.getBanners();
                        object5 = object2 != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getFeedLogic()) : null;
                        object2 = homeRowData.getBanners();
                        object4 = object2 != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getWidgetLevel()) : null;
                        String string2 = homeRowData.getHeading();
                        n7 = this.getBindingAdapterPosition();
                        object8 = od3_2.a();
                        object7 = ld3_2.STORE_AJIO.getStoreId();
                        n8 = (int)(Intrinsics.areEqual(object8, object7) ? 1 : 0);
                        if (n8 != 0) {
                            object8 = "rilfnl";
                        }
                        Object object11 = object8;
                        object8 = homeRowData.getBanners();
                        if (object8 != null && (object8 = (BannerData)CollectionsKt.N(0, (List)object8)) != null) {
                            object = ((BannerData)object8).getShowDefault();
                        }
                        Object object12 = object;
                        Boolean bl2 = Boolean.FALSE;
                        Integer n14 = n7;
                        int n15 = 768;
                        object3 = object;
                        object = new WidgetRecord((String)object5, (String)object4, (String)object10, string2, bl2, (Boolean)object12, n14, (String)object11, null, null, n15, null);
                        if (u71 != null) {
                            n7 = this.getBindingAdapterPosition();
                            object8 = homeRowData.getComponentName();
                            if (object8 == null && (object8 = homeRowData.getHeading()) == null) {
                                object8 = object9;
                            }
                            u71.F(n7, (WidgetRecord)object, (String)object8);
                        }
                    } else {
                        object = object2.getLayoutParams();
                        ((ViewGroup.LayoutParams)object).height = 0;
                        ((ViewGroup.LayoutParams)object).width = 0;
                        return;
                    }
                }
                object3 = homeCuratedWidgetVH.g;
                object = ((Enum)object3).name();
                object5 = "Home";
                n3 = (int)(Intrinsics.areEqual(object, object5) ? 1 : 0);
                object4 = homeCuratedWidgetVH.k;
                if (n3 != 0) {
                    n7 = this.getBindingAdapterPosition();
                    object8 = homeCuratedWidgetVH.e;
                    object = new i71(u71, homeRowData2, n7, (kc1_2)object8);
                } else {
                    ze0_2 ze0_22;
                    ai0_2.q((RecyclerView)object4);
                    n7 = hv3_0.q(R$dimen.dimen_24);
                    n10 = hv3_0.q(R$dimen.dimen_8);
                    object = new lo_1(n7, n10);
                    ((RecyclerView)object4).addItemDecoration((RecyclerView$n)object);
                    n8 = this.getBindingAdapterPosition();
                    String string3 = homeCuratedWidgetVH.n;
                    n3 = 1;
                    p9_0 p9_02 = new p9_0(homeCuratedWidgetVH, n3);
                    object2 = homeCuratedWidgetVH.b;
                    object6 = homeCuratedWidgetVH.e;
                    object = ze0_22;
                    object8 = homeRowData;
                    ze0_22 = new ze0_2((U71)object2, homeRowData, n8, (kc1_2)object6, string3, p9_02);
                }
                object8 = object4.getContext();
                object2 = new CustomLinearLayoutManager((Context)object8, 0, false);
                ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object2);
                n7 = hv3_0.F();
                n10 = hv3_0.q(R$dimen.dp144);
                n8 = hv3_0.q(R$dimen.dp20);
                if (u71 != null && (object6 = u71.H(n4 = this.getBindingAdapterPosition())) != null && (object6 = ((CuratedWidget)object6).getCuratedWidgetItemList()) != null) {
                    n4 = ((ArrayList)object6).size();
                } else {
                    n4 = 0;
                    object6 = null;
                }
                n10 = (n10 + n8) * n4;
                if (n10 < n7) {
                    object7 = hv3_0.C();
                    n4 = R$dimen.dp24;
                    n8 = object7.getDimensionPixelSize(n4);
                    object6 = hv3_0.C();
                    int n16 = R$dimen.dp1;
                    object6.getDimensionPixelSize(n16);
                    n7 = (n7 - n10) / 2;
                    object4.setPadding(n7, n8, n7, 0);
                    object2 = object4.getContext();
                    object8 = new LinearLayoutManager((Context)object2, 0, false);
                    ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object8);
                } else {
                    object8 = object4.getContext();
                    object2 = new CustomLinearLayoutManager((Context)object8, 0, false);
                    ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object2);
                }
                object2 = ((RecyclerView)object4).getAdapter();
                if (object2 == null) {
                    ((RecyclerView)object4).setAdapter((RecyclerView$f)object);
                }
                object = homeCuratedWidgetVH.r;
                ((RecyclerView)object4).addOnScrollListener((RecyclerView$s)object);
                object = homeRowData.getBanners();
                if (object != null && (object = (BannerData)CollectionsKt.N(0, (List)object)) != null && (object = ((BannerData)object).getUuid()) != null) {
                    object9 = object;
                }
                homeCuratedWidgetVH.p = object9;
                object = homeCuratedWidgetVH.d;
                ((tt2_2)object).b((RecyclerView)object4, homeCuratedWidgetVH);
                ((tt2_2)object).a((RecyclerView)object4, homeCuratedWidgetVH);
                object = ((Enum)object3).name();
                n3 = (int)(Intrinsics.areEqual(object, object5) ? 1 : 0);
                if (n3 == 0) return;
                object2 = Looper.getMainLooper();
                object = new Handler((Looper)object2);
                object2 = new j71(homeCuratedWidgetVH);
                long l2 = 100;
                object.postDelayed((Runnable)object2, l2);
                return;
            }
        }
        object = object2.getLayoutParams();
        ((ViewGroup.LayoutParams)object).height = 0;
        ((ViewGroup.LayoutParams)object).width = 0;
    }
}

