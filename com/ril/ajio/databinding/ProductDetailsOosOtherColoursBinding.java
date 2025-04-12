/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ProductDetailsOosOtherColoursBinding
implements BC3 {
    public final ConstraintLayout constraintOosOtherColours;
    public final AjioTextView plpRowBrandTv;
    public final AjioTextView plpRowDiscountPercentTv;
    public final AjioTextView plpRowFinalPriceTv;
    public final AjioTextView plpRowMrpPriceTv;
    public final AjioTextView plpRowPrdNameTv;
    public final LinearLayout plpRowPriceView;
    public final AjioRoundedCornerImageView plpRowProductIv;
    private final ConstraintLayout rootView;

    private ProductDetailsOosOtherColoursBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, LinearLayout linearLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView) {
        this.rootView = constraintLayout;
        this.constraintOosOtherColours = constraintLayout2;
        this.plpRowBrandTv = ajioTextView;
        this.plpRowDiscountPercentTv = ajioTextView2;
        this.plpRowFinalPriceTv = ajioTextView3;
        this.plpRowMrpPriceTv = ajioTextView4;
        this.plpRowPrdNameTv = ajioTextView5;
        this.plpRowPriceView = linearLayout;
        this.plpRowProductIv = ajioRoundedCornerImageView;
    }

    public static ProductDetailsOosOtherColoursBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.plp_row_brand_tv;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioTextView)view;
        if (object3 != null) {
            n3 = R$id.plp_row_discount_percent_tv;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.plp_row_final_price_tv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.plp_row_mrp_price_tv;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        n3 = R$id.plp_row_prd_name_tv;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (AjioTextView)view;
                        if (object7 != null) {
                            n3 = R$id.plp_row_price_view;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (LinearLayout)view;
                            if (view2 != null) {
                                n3 = R$id.plp_row_product_iv;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioRoundedCornerImageView)view;
                                if (object8 != null) {
                                    Object object9 = object;
                                    view = object2;
                                    object = new ProductDetailsOosOtherColoursBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view2, (AjioRoundedCornerImageView)((Object)object8));
                                    return object;
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

    public static ProductDetailsOosOtherColoursBinding inflate(LayoutInflater layoutInflater) {
        return ProductDetailsOosOtherColoursBinding.inflate(layoutInflater, null, false);
    }

    public static ProductDetailsOosOtherColoursBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.product_details_oos_other_colours;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProductDetailsOosOtherColoursBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

