/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.myaccount.order.returns.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ActivityReturnInfoRevampBinding;
import com.ril.ajio.myaccount.order.returns.activity.Hilt_ReturnInfoActivity;
import com.ril.ajio.myaccount.order.returns.activity.ReturnInfoActivity$a;
import com.ril.ajio.services.data.Cart.ShippingImvData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnInfoActivity
extends Hilt_ReturnInfoActivity {
    public static final /* synthetic */ int A0;
    public final rq1_2 p0;
    public RecyclerView q0;
    public View r0;
    public View s0;
    public AjioTextView t0;
    public View u0;
    public ArrayList v0;
    public ArrayList w0;
    public final ArrayList x0;
    public int y0;
    public int z0;

    public ReturnInfoActivity() {
        Object object = et1_2.NONE;
        ReturnInfoActivity$a returnInfoActivity$a = new ReturnInfoActivity$a(this);
        object = yr1_2.a(object, returnInfoActivity$a);
        this.p0 = object;
        this.x0 = object;
    }

    public final void finish() {
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        int n3 = this.y0;
        int n4 = this.z0;
        String string2 = z41.a("Click on Less, ", " / ", " items eligible for store", n3, n4);
        gTMEvents.pushButtonTapEvent("Store Returns", string2, "Exchange / Return Address Screen");
        super.finish();
    }

    public final void onCreate(Bundle object) {
        Object object2;
        String string2;
        int n3 = 1;
        int n4 = 0;
        Object object3 = null;
        super.onCreate((Bundle)object);
        object = this.p2().getRoot();
        this.setContentView((View)object);
        object = this.p2().collapseToolBar;
        int n7 = R$style.collapsed_toolbar_title;
        ((CollapsingToolbarLayout)((Object)object)).setCollapsedTitleTextAppearance(n7);
        n7 = R$style.expanded_toolbar_title;
        ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleTextAppearance(n7);
        n7 = mz3_0.d(16);
        int n8 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginTop();
        int n10 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginEnd();
        int n14 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginBottom();
        ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleMargin(n7, n8, n10, n14);
        object = this.p2().alfToolbar;
        Object object4 = hv3_0.K(R$string.how_store_return_works_txt);
        ((Toolbar)object).setTitle((CharSequence)object4);
        object = this.p2().alfToolbar;
        n7 = R$drawable.ic_cc_close;
        ((Toolbar)object).setNavigationIcon(n7);
        object = this.p2().alfToolbar;
        n7 = R$string.close;
        object4 = this.getString(n7);
        ((Toolbar)object).setNavigationContentDescription((CharSequence)object4);
        object = this.p2().alfToolbar;
        object4 = new on2_1(this);
        ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object4);
        int n15 = R$id.drop_at_store_layout_return_info;
        object = this.findViewById(n15);
        this.s0 = object;
        n15 = R$id.return_info_layout_items;
        object = this.findViewById(n15);
        this.r0 = object;
        n15 = R$id.return_info_rv_eligible;
        this.q0 = object = (RecyclerView)this.findViewById(n15);
        n15 = R$id.return_info_tv_eligible;
        this.t0 = object = (AjioTextView)this.findViewById(n15);
        n15 = R$id.return_info_lbl_home_pickup;
        object = this.findViewById(n15);
        this.u0 = object;
        object = this.p2().returnInfoLblHomePickup.alertText;
        n7 = R$string.request_home_pickup;
        object4 = this.getString(n7);
        object.setText((CharSequence)object4);
        object = this.getIntent().getExtras();
        n7 = 0;
        object4 = null;
        if (object != null) {
            object = this.getIntent().getExtras();
            if (object != null) {
                string2 = "dropAtStoreAvailable";
                object = object.get(string2);
            } else {
                n15 = 0;
                object = null;
            }
            string2 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.Product>";
            Intrinsics.checkNotNull(object, string2);
            this.v0 = object = (ArrayList)object;
            object = this.getIntent().getExtras();
            if (object != null) {
                object2 = "dropAtStoreNotAvailable";
                object = object.get((String)object2);
            } else {
                n15 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object, string2);
            this.w0 = object = (ArrayList)object;
        }
        if ((object = this.v0) != null && (n15 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
            object = this.v0;
            Intrinsics.checkNotNull(object);
            n15 = ((ArrayList)object).size();
        } else {
            n15 = 0;
            object = null;
        }
        this.y0 = n15;
        object = this.w0;
        if (object != null && (n15 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
            object = this.w0;
            Intrinsics.checkNotNull(object);
            n15 = ((ArrayList)object).size();
        } else {
            n15 = 0;
            object = null;
        }
        this.z0 = n15;
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        n8 = this.y0;
        n10 = this.z0;
        Object object5 = " / ";
        Object object6 = " items eligible for store";
        string2 = z41.a("Click on Expand, ", (String)object5, (String)object6, n8, n10);
        object2 = "Exchange / Return Address Screen";
        String string3 = "Store Returns";
        ((GTMEvents)object).pushButtonTapEvent(string3, string2, (String)object2);
        n15 = this.z0;
        n8 = 8;
        if (n15 == 0) {
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemLayout");
                n15 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.s0;
            if (object == null) {
                object = "mInfoLayout";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            n15 = -1;
            object4.setBackgroundColor(n15);
        } else {
            n15 = this.y0;
            object2 = "mEligibleTv";
            string3 = "mEligibleRv";
            if (n15 > 0) {
                object = this.t0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n15 = 0;
                    object = null;
                }
                n10 = R$string.items_elligible;
                int n16 = this.y0;
                object5 = n16;
                int n17 = this.z0;
                object6 = n17;
                int n18 = 2;
                Object object7 = new Object[n18];
                object7[0] = object5;
                object7[n3] = object6;
                object2 = hv3_0.L(n10, object7);
                object.setText((CharSequence)object2);
                object = this.v0;
                if (object == null) {
                    object = mz0_2.a;
                }
                object = object.iterator();
                while (true) {
                    n10 = (int)(object.hasNext() ? 1 : 0);
                    object5 = this.x0;
                    if (n10 == 0) break;
                    object2 = (Product)object.next();
                    hv3_0.a.getClass();
                    object6 = hv3_0.k((Product)object2);
                    n18 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                    if (n18 != 0) continue;
                    if (object2 != null) {
                        object2 = ((Product)object2).getFnlColorVariantData();
                    } else {
                        n10 = 0;
                        object2 = null;
                    }
                    object2 = hv3_0.A((ProductFnlColorVariantData)object2);
                    object7 = new ShippingImvData((String)object6, (String)object2, false);
                    ((ArrayList)object5).add(object7);
                }
                object = this.w0;
                if (object == null) {
                    object = mz0_2.a;
                }
                object = object.iterator();
                while ((n4 = object.hasNext()) != 0) {
                    object3 = (Product)object.next();
                    hv3_0.a.getClass();
                    object2 = hv3_0.k((Product)object3);
                    n17 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n17 != 0) continue;
                    if (object3 != null) {
                        object3 = ((Product)object3).getFnlColorVariantData();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    object3 = hv3_0.A((ProductFnlColorVariantData)object3);
                    object6 = new ShippingImvData((String)object2, (String)object3, n3 != 0);
                    ((ArrayList)object5).add(object6);
                }
                object = this.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n15 = 0;
                    object = null;
                }
                n4 = 5;
                Object object8 = new GridLayoutManager((Context)this, n4);
                ((RecyclerView)object).setLayoutManager((RecyclerView$o)object8);
                hv3_0.q(R$dimen.return_info_imv_width);
                hv3_0.q(R$dimen.return_info_imv_height);
                object = new RecyclerView$f();
                ((k33)object).a = object5;
                ((k33)object).b = n3 = hv3_0.q(R$dimen.shipping_product_imv_height);
                ((k33)object).c = n3 = hv3_0.q(R$dimen.shipping_product_imv_height);
                ((k33)object).d = n3 = hv3_0.q(R$dimen.shipping_product_imv_height_not_elligible);
                ((k33)object).e = n3 = 15;
                object8 = this.q0;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object8 = null;
                }
                ((RecyclerView)object8).setAdapter((RecyclerView$f)object);
            } else {
                object = this.t0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n15 = 0;
                    object = null;
                }
                object.setVisibility(n8);
                object = this.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n15 = 0;
                    object = null;
                }
                object.setVisibility(n8);
            }
            n15 = this.z0;
            if (n15 == 0) {
                object = this.u0;
                if (object == null) {
                    object = "mHomePickUpLbl";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object4 = object;
                }
                object4.setVisibility(n8);
            }
        }
    }

    public final ActivityReturnInfoRevampBinding p2() {
        return (ActivityReturnInfoRevampBinding)this.p0.getValue();
    }
}

