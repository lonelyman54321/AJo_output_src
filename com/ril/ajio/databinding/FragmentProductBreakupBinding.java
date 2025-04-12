/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentProductBreakupBinding
implements BC3 {
    public final ConstraintLayout bankOfferConstraintview;
    public final FrameLayout cancelContainer;
    public final ConstraintLayout constraintConvFee;
    public final AjioTextView convenienceFeeNonRefund;
    public final AjioTextView convenienceFeeTitleTv;
    public final AjioTextView convenienceFeeWhatsThis;
    public final ConstraintLayout couponConstraintview;
    public final ConstraintLayout discountConstaintview;
    public final ImageView imCancelBtn;
    public final LinearLayout linearLayout1;
    public final AjioTextView listHeader;
    public final AjioTextView okayButton;
    public final ConstraintLayout originalPriceContainer;
    public final ConstraintLayout parentLayout;
    public final ConstraintLayout promoConstraintview;
    private final ConstraintLayout rootView;
    public final AjioTextView tvBankDiscountPrice;
    public final AjioTextView tvConvFee;
    public final AjioTextView tvCouponPrice;
    public final AjioTextView tvDiscountPrice;
    public final AjioTextView tvOriginalPrice;
    public final AjioTextView tvProductDetails;
    public final AjioTextView tvProductTotal;
    public final AjioTextView tvPromoPrice;

    private FragmentProductBreakupBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, ConstraintLayout constraintLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ImageView imageView, LinearLayout linearLayout, AjioTextView ajioTextView4, AjioTextView ajioTextView5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, ConstraintLayout constraintLayout8, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13) {
        this.rootView = constraintLayout;
        this.bankOfferConstraintview = constraintLayout2;
        this.cancelContainer = frameLayout;
        this.constraintConvFee = constraintLayout3;
        this.convenienceFeeNonRefund = ajioTextView;
        this.convenienceFeeTitleTv = ajioTextView2;
        this.convenienceFeeWhatsThis = ajioTextView3;
        this.couponConstraintview = constraintLayout4;
        this.discountConstaintview = constraintLayout5;
        this.imCancelBtn = imageView;
        this.linearLayout1 = linearLayout;
        this.listHeader = ajioTextView4;
        this.okayButton = ajioTextView5;
        this.originalPriceContainer = constraintLayout6;
        this.parentLayout = constraintLayout7;
        this.promoConstraintview = constraintLayout8;
        this.tvBankDiscountPrice = ajioTextView6;
        this.tvConvFee = ajioTextView7;
        this.tvCouponPrice = ajioTextView8;
        this.tvDiscountPrice = ajioTextView9;
        this.tvOriginalPrice = ajioTextView10;
        this.tvProductDetails = ajioTextView11;
        this.tvProductTotal = ajioTextView12;
        this.tvPromoPrice = ajioTextView13;
    }

    public static FragmentProductBreakupBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bank_offer_constraintview;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (FrameLayout)view2;
            if (view3 != null) {
                n3 = R$id.constraint_conv_fee;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (ConstraintLayout)view2;
                if (object3 != null) {
                    n3 = R$id.convenience_fee_non_refund;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.convenience_fee_title_tv;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.convenience_fee_whats_this;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.coupon_constraintview;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (ConstraintLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.discount_constaintview;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (ConstraintLayout)view2;
                                    if (object8 != null) {
                                        n3 = R$id.im_cancelBtn;
                                        View view4 = view2 = dd2_2.a(n3, view);
                                        view4 = (ImageView)view2;
                                        if (view4 != null) {
                                            n3 = R$id.linearLayout1;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (LinearLayout)view2;
                                            if (view5 != null) {
                                                n3 = R$id.listHeader;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.okay_button;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.original_price_container;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (ConstraintLayout)view2;
                                                        if (object11 != null) {
                                                            Object object12 = view;
                                                            object12 = (ConstraintLayout)view;
                                                            n3 = R$id.promo_constraintview;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (ConstraintLayout)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.tv_bank_discount_price;
                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                object14 = (AjioTextView)view2;
                                                                if (object14 != null) {
                                                                    n3 = R$id.tv_conv_fee;
                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                    object15 = (AjioTextView)view2;
                                                                    if (object15 != null) {
                                                                        n3 = R$id.tv_coupon_price;
                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                        object16 = (AjioTextView)view2;
                                                                        if (object16 != null) {
                                                                            n3 = R$id.tv_discount_price;
                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                            object17 = (AjioTextView)view2;
                                                                            if (object17 != null) {
                                                                                n3 = R$id.tv_original_price;
                                                                                Object object18 = view2 = dd2_2.a(n3, view);
                                                                                object18 = (AjioTextView)view2;
                                                                                if (object18 != null) {
                                                                                    n3 = R$id.tv_product_details;
                                                                                    Object object19 = view2 = dd2_2.a(n3, view);
                                                                                    object19 = (AjioTextView)view2;
                                                                                    if (object19 != null) {
                                                                                        n3 = R$id.tv_product_total;
                                                                                        Object object20 = view2 = dd2_2.a(n3, view);
                                                                                        object20 = (AjioTextView)view2;
                                                                                        if (object20 != null) {
                                                                                            n3 = R$id.tv_promo_price;
                                                                                            Object object21 = view2 = dd2_2.a(n3, view);
                                                                                            object21 = (AjioTextView)view2;
                                                                                            if (object21 != null) {
                                                                                                object = new FragmentProductBreakupBinding((ConstraintLayout)((Object)object12), (ConstraintLayout)((Object)object2), (FrameLayout)view3, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (ImageView)view4, (LinearLayout)view5, (AjioTextView)object9, (AjioTextView)object10, (ConstraintLayout)((Object)object11), (ConstraintLayout)((Object)object12), (ConstraintLayout)((Object)object13), (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21);
                                                                                                return object;
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

    public static FragmentProductBreakupBinding inflate(LayoutInflater layoutInflater) {
        return FragmentProductBreakupBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentProductBreakupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_product_breakup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentProductBreakupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

