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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ComposeGiftsViewBinding;

public final class ExchangeFragmentProductLayoutRevampBinding
implements BC3 {
    public final AjioTextView brandname;
    public final ConstraintLayout dataLayout;
    public final AjioTextView idConvenienceFee;
    public final AjioTextView idReadPolicy;
    public final AjioImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final AjioTextView itemDetail;
    public final AjioTextView itemIncludeConvFee;
    public final AjioTextView itemOriginalPrice;
    public final LinearLayout liConvenienceFee;
    public final AjioTextView quantity;
    private final CardView rootView;
    public final AjioTextView size;
    public final AjioTextView tvRefundBreakup;
    public final AjioTextView tvReturnFee;
    public final ComposeGiftsViewBinding viewComposeGwp;

    private ExchangeFragmentProductLayoutRevampBinding(CardView cardView, AjioTextView ajioTextView, ConstraintLayout constraintLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioImageView ajioImageView, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, LinearLayout linearLayout, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, ComposeGiftsViewBinding composeGiftsViewBinding) {
        this.rootView = cardView;
        this.brandname = ajioTextView;
        this.dataLayout = constraintLayout;
        this.idConvenienceFee = ajioTextView2;
        this.idReadPolicy = ajioTextView3;
        this.imgProduct = ajioImageView;
        this.itemActualCost = ajioTextView4;
        this.itemDetail = ajioTextView5;
        this.itemIncludeConvFee = ajioTextView6;
        this.itemOriginalPrice = ajioTextView7;
        this.liConvenienceFee = linearLayout;
        this.quantity = ajioTextView8;
        this.size = ajioTextView9;
        this.tvRefundBreakup = ajioTextView10;
        this.tvReturnFee = ajioTextView11;
        this.viewComposeGwp = composeGiftsViewBinding;
    }

    public static ExchangeFragmentProductLayoutRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brandname;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.data_layout;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.id_convenience_fee;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.id_read_policy;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.img_product;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioImageView)view2;
                        if (object6 != null) {
                            n3 = R$id.item_actual_cost;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.item_detail;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.item_include_conv_fee;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.item_original_price;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.li_convenience_fee;
                                            View view3 = view2 = dd2_2.a(n3, view);
                                            view3 = (LinearLayout)view2;
                                            if (view3 != null) {
                                                n3 = R$id.quantity;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.size;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)view2;
                                                    if (object12 != null) {
                                                        n3 = R$id.tv_refund_breakup;
                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                        object13 = (AjioTextView)view2;
                                                        if (object13 != null) {
                                                            n3 = R$id.tv_return_fee;
                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                            object14 = (AjioTextView)view2;
                                                            if (object14 != null && (view2 = dd2_2.a(n3 = R$id.viewComposeGwp, view)) != null) {
                                                                ComposeGiftsViewBinding composeGiftsViewBinding = ComposeGiftsViewBinding.bind(view2);
                                                                Object object15 = view;
                                                                object15 = (CardView)view;
                                                                ExchangeFragmentProductLayoutRevampBinding exchangeFragmentProductLayoutRevampBinding = new ExchangeFragmentProductLayoutRevampBinding((CardView)((Object)object15), (AjioTextView)object2, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (LinearLayout)view3, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, composeGiftsViewBinding);
                                                                return exchangeFragmentProductLayoutRevampBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExchangeFragmentProductLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeFragmentProductLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeFragmentProductLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_fragment_product_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeFragmentProductLayoutRevampBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

