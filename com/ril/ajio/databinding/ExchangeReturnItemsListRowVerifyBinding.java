/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeReturnItemsListRowVerifyBinding
implements BC3 {
    public final LinearLayout costLayout;
    public final LinearLayout dataLayout;
    public final RelativeLayout exchangeItemsDetailsLayout;
    public final AjioRoundedCornerImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final AjioTextView itemIncludeConvFee;
    public final AjioTextView itemOriginalPrice;
    public final AjioTextView returnType;
    private final RelativeLayout rootView;
    public final AjioTextView sizeType;

    private ExchangeReturnItemsListRowVerifyBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = relativeLayout;
        this.costLayout = linearLayout;
        this.dataLayout = linearLayout2;
        this.exchangeItemsDetailsLayout = relativeLayout2;
        this.imgProduct = ajioRoundedCornerImageView;
        this.itemActualCost = ajioTextView;
        this.itemIncludeConvFee = ajioTextView2;
        this.itemOriginalPrice = ajioTextView3;
        this.returnType = ajioTextView4;
        this.sizeType = ajioTextView5;
    }

    public static ExchangeReturnItemsListRowVerifyBinding bind(View object) {
        View view;
        int n3 = R$id.cost_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.data_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.exchange_items_details_layout;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n3 = R$id.img_product;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioRoundedCornerImageView)view;
                    if (object2 != null) {
                        n3 = R$id.item_actual_cost;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.item_include_conv_fee;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.item_original_price;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.return_type;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        n3 = R$id.size_type;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (AjioTextView)view;
                                        if (object7 != null) {
                                            Object object8 = object;
                                            object8 = (RelativeLayout)object;
                                            ExchangeReturnItemsListRowVerifyBinding exchangeReturnItemsListRowVerifyBinding = new ExchangeReturnItemsListRowVerifyBinding((RelativeLayout)object8, (LinearLayout)view2, (LinearLayout)view3, (RelativeLayout)view4, (AjioRoundedCornerImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                            return exchangeReturnItemsListRowVerifyBinding;
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

    public static ExchangeReturnItemsListRowVerifyBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnItemsListRowVerifyBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnItemsListRowVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_return_items_list_row_verify;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnItemsListRowVerifyBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

