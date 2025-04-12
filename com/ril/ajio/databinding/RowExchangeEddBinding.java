/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExchangeEddBinding
implements BC3 {
    private final LinearLayout rootView;
    public final ImageView rowExchangeEddErrorImv;
    public final AjioTextView rowExchangeEddErrorTvError;
    public final LinearLayout rowExchangeEddLL;
    public final ConstraintLayout rowExchangeEddLayoutError;
    public final AjioTextView tvCreateReturn;
    public final AjioTextView tvCreateReturnInfo;
    public final AjioTextView tvLearnWhy;

    private RowExchangeEddBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, LinearLayout linearLayout2, ConstraintLayout constraintLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.rowExchangeEddErrorImv = imageView;
        this.rowExchangeEddErrorTvError = ajioTextView;
        this.rowExchangeEddLL = linearLayout2;
        this.rowExchangeEddLayoutError = constraintLayout;
        this.tvCreateReturn = ajioTextView2;
        this.tvCreateReturnInfo = ajioTextView3;
        this.tvLearnWhy = ajioTextView4;
    }

    public static RowExchangeEddBinding bind(View object) {
        View view;
        int n3 = R$id.row_exchange_edd_error_imv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.row_exchange_edd_error_tv_error;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.row_exchange_edd_layout_error;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.tvCreateReturn;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.tvCreateReturnInfo;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tvLearnWhy;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                object = new RowExchangeEddBinding((LinearLayout)object3, (ImageView)view2, (AjioTextView)object2, (LinearLayout)object3, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return object;
                            }
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

    public static RowExchangeEddBinding inflate(LayoutInflater layoutInflater) {
        return RowExchangeEddBinding.inflate(layoutInflater, null, false);
    }

    public static RowExchangeEddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_exchange_edd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExchangeEddBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

