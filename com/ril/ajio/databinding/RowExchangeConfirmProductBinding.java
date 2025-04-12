/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExchangeConfirmProductBinding
implements BC3 {
    public final AjioTextView brandName;
    public final AjioRoundedCornerImageView imgProduct;
    public final RelativeLayout itemLayoutPrice;
    public final AjioTextView itemLblPrice;
    public final TextView itemName;
    public final AjioTextView itemPrice;
    public final AjioTextView itemTvStatus;
    public final AjioTextView quantity;
    private final RelativeLayout rootView;
    public final AjioTextView size;

    private RowExchangeConfirmProductBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioRoundedCornerImageView ajioRoundedCornerImageView, RelativeLayout relativeLayout2, AjioTextView ajioTextView2, TextView textView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = relativeLayout;
        this.brandName = ajioTextView;
        this.imgProduct = ajioRoundedCornerImageView;
        this.itemLayoutPrice = relativeLayout2;
        this.itemLblPrice = ajioTextView2;
        this.itemName = textView;
        this.itemPrice = ajioTextView3;
        this.itemTvStatus = ajioTextView4;
        this.quantity = ajioTextView5;
        this.size = ajioTextView6;
    }

    public static RowExchangeConfirmProductBinding bind(View object) {
        View view;
        int n3 = R$id.brand_Name;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.img_product;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioRoundedCornerImageView)view;
            if (object3 != null) {
                n3 = R$id.item_layout_price;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (RelativeLayout)view;
                if (view2 != null) {
                    n3 = R$id.item_lbl_price;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.item_name;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.item_price;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.item_tv_status;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    n3 = R$id.quantity;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (AjioTextView)view;
                                    if (object7 != null) {
                                        n3 = R$id.size;
                                        Object object8 = view = dd2_2.a(n3, object);
                                        object8 = (AjioTextView)view;
                                        if (object8 != null) {
                                            Object object9 = object;
                                            object9 = (RelativeLayout)object;
                                            RowExchangeConfirmProductBinding rowExchangeConfirmProductBinding = new RowExchangeConfirmProductBinding((RelativeLayout)object9, (AjioTextView)object2, (AjioRoundedCornerImageView)((Object)object3), (RelativeLayout)view2, (AjioTextView)object4, (TextView)view3, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8);
                                            return rowExchangeConfirmProductBinding;
                                        }
                                    }
                                }
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

    public static RowExchangeConfirmProductBinding inflate(LayoutInflater layoutInflater) {
        return RowExchangeConfirmProductBinding.inflate(layoutInflater, null, false);
    }

    public static RowExchangeConfirmProductBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_exchange_confirm_product;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExchangeConfirmProductBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

