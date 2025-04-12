/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.eosspromotion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.HeaderRecyclerViewAdapter;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import kotlin.jvm.internal.Intrinsics;

public class MyCouponsComponentView
extends FrameLayout
implements jc1_2,
View.OnClickListener {
    public Context a;
    public m82_0 b;
    public RecyclerView c;

    public MyCouponsComponentView(Context context) {
        super(context);
        this.a(context);
    }

    public MyCouponsComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(context);
    }

    public MyCouponsComponentView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a(context);
    }

    public final void a(Context object) {
        this.a = object;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.coupons_list_segment_view;
        object = object.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.coupons_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
    }

    public final void onClick(View view) {
    }

    public void setData(CouponPromotion object) {
        Context context = this.a;
        m82_0 m82_02 = this.b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(m82_02, "onClickCouponListener");
        Intrinsics.checkNotNullParameter(object, "data");
        qs1_2 qs1_22 = new HeaderRecyclerViewAdapter();
        qs1_22.a = m82_02;
        qs1_22.b = object;
        object = ((CouponPromotion)object).getMyCoupons();
        qs1_22.d = object;
        object = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.LayoutInflater");
        object = (LayoutInflater)object;
        qs1_22.c = object;
        object = new StaggeredGridLayoutManager();
        this.c.setLayoutManager((RecyclerView$o)object);
        this.c.setAdapter(qs1_22);
    }

    public void setOnClickCouponListener(m82_0 m82_02) {
        this.b = m82_02;
    }
}

