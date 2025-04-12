/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutPaymentUpiHowToBinding
implements BC3 {
    public final ImageView cancelIv;
    public final FrameLayout cancelView;
    public final AjioTextView headingTv;
    public final RecyclerView listRv;
    public final ConstraintLayout mainView;
    private final ConstraintLayout rootView;

    private LayoutPaymentUpiHowToBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, AjioTextView ajioTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.cancelIv = imageView;
        this.cancelView = frameLayout;
        this.headingTv = ajioTextView;
        this.listRv = recyclerView;
        this.mainView = constraintLayout2;
    }

    public static LayoutPaymentUpiHowToBinding bind(View object) {
        View view;
        int n3 = R$id.cancel_iv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancel_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.heading_tv;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.list_rv;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (RecyclerView)view;
                    if (object3 != null) {
                        n3 = R$id.main_view;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (ConstraintLayout)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (ConstraintLayout)((Object)object);
                            LayoutPaymentUpiHowToBinding layoutPaymentUpiHowToBinding = new LayoutPaymentUpiHowToBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (FrameLayout)view3, (AjioTextView)object2, (RecyclerView)object3, (ConstraintLayout)((Object)object4));
                            return layoutPaymentUpiHowToBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPaymentUpiHowToBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPaymentUpiHowToBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPaymentUpiHowToBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_payment_upi_how_to;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPaymentUpiHowToBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

