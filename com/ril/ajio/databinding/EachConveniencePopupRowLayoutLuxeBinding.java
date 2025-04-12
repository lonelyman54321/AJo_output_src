/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class EachConveniencePopupRowLayoutLuxeBinding
implements BC3 {
    public final AjioTextView feeLabelTv;
    public final AjioTextView feeValueFreeTv;
    public final AjioTextView feeValueStrikeTv;
    public final AjioTextView feeValueTv;
    public final LinearLayoutCompat llTitle;
    private final ConstraintLayout rootView;
    public final AjioTextView tvConvFeeType;

    private EachConveniencePopupRowLayoutLuxeBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayoutCompat linearLayoutCompat, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.feeLabelTv = ajioTextView;
        this.feeValueFreeTv = ajioTextView2;
        this.feeValueStrikeTv = ajioTextView3;
        this.feeValueTv = ajioTextView4;
        this.llTitle = linearLayoutCompat;
        this.tvConvFeeType = ajioTextView5;
    }

    public static EachConveniencePopupRowLayoutLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.fee_label_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.fee_value_free_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.fee_value_strike_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.fee_value_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.llTitle;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (LinearLayoutCompat)view;
                        if (object6 != null) {
                            n3 = R$id.tvConvFeeType;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                object8 = (ConstraintLayout)((Object)object);
                                EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding = new EachConveniencePopupRowLayoutLuxeBinding((ConstraintLayout)((Object)object8), (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (LinearLayoutCompat)((Object)object6), (AjioTextView)object7);
                                return eachConveniencePopupRowLayoutLuxeBinding;
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

    public static EachConveniencePopupRowLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return EachConveniencePopupRowLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static EachConveniencePopupRowLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.each_convenience_popup_row_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EachConveniencePopupRowLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

