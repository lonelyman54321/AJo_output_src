/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.eosspromotion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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

public class AvailableCouponsComponentView
extends FrameLayout
implements jc1_2,
o82_0 {
    public Context a;
    public m82_0 b;
    public RecyclerView c;
    public et_2 d;

    public AvailableCouponsComponentView(Context context) {
        super(context);
        this.a(context);
    }

    public AvailableCouponsComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(context);
    }

    public AvailableCouponsComponentView(Context context, AttributeSet attributeSet, int n3) {
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

    public void setData(CouponPromotion object) {
        Context context = this.a;
        object = ((CouponPromotion)object).getAvailableCoupons();
        m82_0 m82_02 = this.b;
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(object, "availableCoupons");
        Intrinsics.checkNotNullParameter(m82_02, "onClickCouponListener");
        Intrinsics.checkNotNullParameter(this, "onClickListener");
        et_2 et_22 = new HeaderRecyclerViewAdapter();
        et_22.a = object;
        et_22.b = m82_02;
        et_22.c = this;
        object = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.LayoutInflater");
        object = (LayoutInflater)object;
        et_22.d = object;
        this.d = et_22;
        object = new StaggeredGridLayoutManager();
        this.c.setLayoutManager((RecyclerView$o)object);
        object = this.c;
        et_22 = this.d;
        ((RecyclerView)object).setAdapter(et_22);
    }

    public void setOnClickCouponListener(m82_0 m82_02) {
        this.b = m82_02;
    }
}

