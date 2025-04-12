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

public final class ExchangeReturnControllerBottomlistRowNewBinding
implements BC3 {
    public final LinearLayout costLayout;
    public final LinearLayout dataLayout;
    public final AjioTextView editView;
    public final RelativeLayout exchangeItemsDetailsLayout;
    public final AjioTextView exchangeSize;
    public final AjioRoundedCornerImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final AjioTextView itemOriginalPrice;
    public final AjioTextView resetView;
    public final AjioTextView returnTypeName;
    private final RelativeLayout rootView;

    private ExchangeReturnControllerBottomlistRowNewBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, RelativeLayout relativeLayout2, AjioTextView ajioTextView2, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = relativeLayout;
        this.costLayout = linearLayout;
        this.dataLayout = linearLayout2;
        this.editView = ajioTextView;
        this.exchangeItemsDetailsLayout = relativeLayout2;
        this.exchangeSize = ajioTextView2;
        this.imgProduct = ajioRoundedCornerImageView;
        this.itemActualCost = ajioTextView3;
        this.itemOriginalPrice = ajioTextView4;
        this.resetView = ajioTextView5;
        this.returnTypeName = ajioTextView6;
    }

    public static ExchangeReturnControllerBottomlistRowNewBinding bind(View object) {
        View view;
        int n3 = R$id.cost_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.data_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.edit_view;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.exchange_items_details_layout;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (RelativeLayout)view;
                    if (view4 != null) {
                        n3 = R$id.exchange_size;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.img_product;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioRoundedCornerImageView)view;
                            if (object4 != null) {
                                n3 = R$id.item_actual_cost;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.item_original_price;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        n3 = R$id.reset_view;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (AjioTextView)view;
                                        if (object7 != null) {
                                            n3 = R$id.return_type_name;
                                            Object object8 = view = dd2_2.a(n3, object);
                                            object8 = (AjioTextView)view;
                                            if (object8 != null) {
                                                Object object9 = object;
                                                object9 = (RelativeLayout)object;
                                                ExchangeReturnControllerBottomlistRowNewBinding exchangeReturnControllerBottomlistRowNewBinding = new ExchangeReturnControllerBottomlistRowNewBinding((RelativeLayout)object9, (LinearLayout)view2, (LinearLayout)view3, (AjioTextView)object2, (RelativeLayout)view4, (AjioTextView)object3, (AjioRoundedCornerImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8);
                                                return exchangeReturnControllerBottomlistRowNewBinding;
                                            }
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

    public static ExchangeReturnControllerBottomlistRowNewBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnControllerBottomlistRowNewBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnControllerBottomlistRowNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_return_controller_bottomlist_row_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnControllerBottomlistRowNewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

