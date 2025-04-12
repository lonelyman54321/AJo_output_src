/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.OrderRefundBreakUpLayoutBinding;

public final class FragmentOrderRefundBreakupBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView listHeader;
    public final RecyclerView orderList;
    public final OrderRefundBreakUpLayoutBinding refundDetailContainer;
    private final ConstraintLayout rootView;

    private FragmentOrderRefundBreakupBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, RecyclerView recyclerView, OrderRefundBreakUpLayoutBinding orderRefundBreakUpLayoutBinding) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.listHeader = textView;
        this.orderList = recyclerView;
        this.refundDetailContainer = orderRefundBreakUpLayoutBinding;
    }

    public static FragmentOrderRefundBreakupBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.listHeader;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.orderList;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (RecyclerView)view;
                    if (object2 != null && (view = dd2_2.a(n3 = R$id.refundDetailContainer, object)) != null) {
                        OrderRefundBreakUpLayoutBinding orderRefundBreakUpLayoutBinding = OrderRefundBreakUpLayoutBinding.bind(view);
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        FragmentOrderRefundBreakupBinding fragmentOrderRefundBreakupBinding = new FragmentOrderRefundBreakupBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (FrameLayout)view3, (TextView)view4, (RecyclerView)object2, orderRefundBreakUpLayoutBinding);
                        return fragmentOrderRefundBreakupBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentOrderRefundBreakupBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOrderRefundBreakupBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOrderRefundBreakupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_order_refund_breakup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOrderRefundBreakupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

