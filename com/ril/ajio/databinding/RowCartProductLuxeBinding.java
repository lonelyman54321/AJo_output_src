/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCartProductLuxeBinding
implements BC3 {
    public final ConstraintLayout allOfferContainer;
    public final TextView brandInfo;
    public final View cartProductDivider;
    public final ConstraintLayout cartProductParent;
    public final TextView cartS1S2Info;
    public final TextView discountTv;
    public final ConstraintLayout dodCartPrdView;
    public final TextView dodCartTimerTv;
    public final TextView dodEndsInTxt;
    public final ImageView dodImg;
    public final TextView dodStockLeft;
    public final TextView exclusiveTag;
    public final ImageView idCartGwpImg;
    public final AjioTextView idCartGwpTitle;
    public final ImageView idGwpRightArrow;
    public final ImageView ivPdDeliveryAlert;
    public final TextView lowStockInfo;
    public final TextView moreOffers;
    public final ConstraintLayout offerContainer;
    public final ConstraintLayout offerContainerFreebies;
    public final View offerDivider;
    public final ImageView offerImg;
    public final TextView offerPrice;
    public final TextView offerSubTitle;
    public final TextView offerTitle;
    public final TextView originalPrice;
    public final AjioCheckBox pdCheckbox;
    public final TextView pdDeliveryDetails;
    public final TextView pdOrderCutOffTime;
    public final AppCompatImageView priceDropIV;
    public final TextView priceDropTV;
    public final ConstraintLayout priorityDeliveryConstraint;
    public final ImageView productImg;
    public final ConstraintLayout productInfoContainer;
    public final TextView productTitle;
    public final LinearLayout qtyContainer;
    public final TextView qtyInfo;
    public final TextView qtyText;
    public final TextView removeProduct;
    public final TextView returnExchangeTv;
    private final ConstraintLayout rootView;
    public final TextView savingsTv;
    public final LinearLayout sizeContainer;
    public final TextView sizeInfo;
    public final TextView sizeText;
    public final TextView tvBestPrice;
    public final TextView tvStandardDeliveryDate;

    private RowCartProductLuxeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, View view, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, ConstraintLayout constraintLayout4, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, TextView textView7, ImageView imageView2, AjioTextView ajioTextView, ImageView imageView3, ImageView imageView4, TextView textView8, TextView textView9, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, View view2, ImageView imageView5, TextView textView10, TextView textView11, TextView textView12, TextView textView13, AjioCheckBox ajioCheckBox, TextView textView14, TextView textView15, AppCompatImageView appCompatImageView, TextView textView16, ConstraintLayout constraintLayout7, ImageView imageView6, ConstraintLayout constraintLayout8, TextView textView17, LinearLayout linearLayout, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, LinearLayout linearLayout2, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.rootView = constraintLayout;
        this.allOfferContainer = constraintLayout2;
        this.brandInfo = textView;
        this.cartProductDivider = view;
        this.cartProductParent = constraintLayout3;
        this.cartS1S2Info = textView2;
        this.discountTv = textView3;
        this.dodCartPrdView = constraintLayout4;
        this.dodCartTimerTv = textView4;
        this.dodEndsInTxt = textView5;
        this.dodImg = imageView;
        this.dodStockLeft = textView6;
        this.exclusiveTag = textView7;
        this.idCartGwpImg = imageView2;
        this.idCartGwpTitle = ajioTextView;
        this.idGwpRightArrow = imageView3;
        this.ivPdDeliveryAlert = imageView4;
        this.lowStockInfo = textView8;
        this.moreOffers = textView9;
        this.offerContainer = constraintLayout5;
        this.offerContainerFreebies = constraintLayout6;
        this.offerDivider = view2;
        this.offerImg = imageView5;
        this.offerPrice = textView10;
        this.offerSubTitle = textView11;
        this.offerTitle = textView12;
        this.originalPrice = textView13;
        this.pdCheckbox = ajioCheckBox;
        this.pdDeliveryDetails = textView14;
        this.pdOrderCutOffTime = textView15;
        this.priceDropIV = appCompatImageView;
        this.priceDropTV = textView16;
        this.priorityDeliveryConstraint = constraintLayout7;
        this.productImg = imageView6;
        this.productInfoContainer = constraintLayout8;
        this.productTitle = textView17;
        this.qtyContainer = linearLayout;
        this.qtyInfo = textView18;
        this.qtyText = textView19;
        this.removeProduct = textView20;
        this.returnExchangeTv = textView21;
        this.savingsTv = textView22;
        this.sizeContainer = linearLayout2;
        this.sizeInfo = textView23;
        this.sizeText = textView24;
        this.tvBestPrice = textView25;
        this.tvStandardDeliveryDate = textView26;
    }

    public static RowCartProductLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.allOfferContainer;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            View view3;
            n3 = R$id.brandInfo;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.cartProductDivider, view)) != null) {
                Object object3 = view;
                object3 = (ConstraintLayout)view;
                n3 = R$id.cartS1S2Info;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.discountTv;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.dodCartPrdView;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (ConstraintLayout)view2;
                        if (object4 != null) {
                            n3 = R$id.dodCartTimerTv;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (TextView)view2;
                            if (view7 != null) {
                                n3 = R$id.dodEndsInTxt;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (TextView)view2;
                                if (view8 != null) {
                                    n3 = R$id.dodImg;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (ImageView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.dodStockLeft;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (TextView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.exclusiveTag;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (TextView)view2;
                                            if (view11 != null) {
                                                n3 = R$id.id_cart_gwp_img;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (ImageView)view2;
                                                if (view12 != null) {
                                                    n3 = R$id.id_cart_gwp_title;
                                                    Object object5 = view2 = dd2_2.a(n3, view);
                                                    object5 = (AjioTextView)view2;
                                                    if (object5 != null) {
                                                        n3 = R$id.id_gwp_right_arrow;
                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                        view13 = (ImageView)view2;
                                                        if (view13 != null) {
                                                            n3 = R$id.iv_pd_delivery_alert;
                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                            view14 = (ImageView)view2;
                                                            if (view14 != null) {
                                                                n3 = R$id.lowStockInfo;
                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                view15 = (TextView)view2;
                                                                if (view15 != null) {
                                                                    n3 = R$id.moreOffers;
                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                    view16 = (TextView)view2;
                                                                    if (view16 != null) {
                                                                        n3 = R$id.offerContainer;
                                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                                        object6 = (ConstraintLayout)view2;
                                                                        if (object6 != null) {
                                                                            View view17;
                                                                            n3 = R$id.offerContainerFreebies;
                                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                                            object7 = (ConstraintLayout)view2;
                                                                            if (object7 != null && (view17 = dd2_2.a(n3 = R$id.offerDivider, view)) != null) {
                                                                                n3 = R$id.offerImg;
                                                                                View view18 = view2 = dd2_2.a(n3, view);
                                                                                view18 = (ImageView)view2;
                                                                                if (view18 != null) {
                                                                                    n3 = R$id.offerPrice;
                                                                                    View view19 = view2 = dd2_2.a(n3, view);
                                                                                    view19 = (TextView)view2;
                                                                                    if (view19 != null) {
                                                                                        n3 = R$id.offerSubTitle;
                                                                                        View view20 = view2 = dd2_2.a(n3, view);
                                                                                        view20 = (TextView)view2;
                                                                                        if (view20 != null) {
                                                                                            n3 = R$id.offerTitle;
                                                                                            View view21 = view2 = dd2_2.a(n3, view);
                                                                                            view21 = (TextView)view2;
                                                                                            if (view21 != null) {
                                                                                                n3 = R$id.originalPrice;
                                                                                                View view22 = view2 = dd2_2.a(n3, view);
                                                                                                view22 = (TextView)view2;
                                                                                                if (view22 != null) {
                                                                                                    n3 = R$id.pd_checkbox;
                                                                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                                                                    object8 = (AjioCheckBox)view2;
                                                                                                    if (object8 != null) {
                                                                                                        n3 = R$id.pd_delivery_details;
                                                                                                        View view23 = view2 = dd2_2.a(n3, view);
                                                                                                        view23 = (TextView)view2;
                                                                                                        if (view23 != null) {
                                                                                                            n3 = R$id.pd_order_cut_off_time;
                                                                                                            View view24 = view2 = dd2_2.a(n3, view);
                                                                                                            view24 = (TextView)view2;
                                                                                                            if (view24 != null) {
                                                                                                                n3 = R$id.priceDropIV;
                                                                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                                                                object9 = (AppCompatImageView)view2;
                                                                                                                if (object9 != null) {
                                                                                                                    n3 = R$id.priceDropTV;
                                                                                                                    View view25 = view2 = dd2_2.a(n3, view);
                                                                                                                    view25 = (TextView)view2;
                                                                                                                    if (view25 != null) {
                                                                                                                        n3 = R$id.priorityDeliveryConstraint;
                                                                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                                                                        object10 = (ConstraintLayout)view2;
                                                                                                                        if (object10 != null) {
                                                                                                                            n3 = R$id.productImg;
                                                                                                                            View view26 = view2 = dd2_2.a(n3, view);
                                                                                                                            view26 = (ImageView)view2;
                                                                                                                            if (view26 != null) {
                                                                                                                                n3 = R$id.productInfoContainer;
                                                                                                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                                                                                                object11 = (ConstraintLayout)view2;
                                                                                                                                if (object11 != null) {
                                                                                                                                    n3 = R$id.productTitle;
                                                                                                                                    View view27 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view27 = (TextView)view2;
                                                                                                                                    if (view27 != null) {
                                                                                                                                        n3 = R$id.qtyContainer;
                                                                                                                                        View view28 = view2 = dd2_2.a(n3, view);
                                                                                                                                        view28 = (LinearLayout)view2;
                                                                                                                                        if (view28 != null) {
                                                                                                                                            n3 = R$id.qtyInfo;
                                                                                                                                            View view29 = view2 = dd2_2.a(n3, view);
                                                                                                                                            view29 = (TextView)view2;
                                                                                                                                            if (view29 != null) {
                                                                                                                                                n3 = R$id.qtyText;
                                                                                                                                                View view30 = view2 = dd2_2.a(n3, view);
                                                                                                                                                view30 = (TextView)view2;
                                                                                                                                                if (view30 != null) {
                                                                                                                                                    n3 = R$id.removeProduct;
                                                                                                                                                    View view31 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    view31 = (TextView)view2;
                                                                                                                                                    if (view31 != null) {
                                                                                                                                                        n3 = R$id.returnExchangeTv;
                                                                                                                                                        View view32 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        view32 = (TextView)view2;
                                                                                                                                                        if (view32 != null) {
                                                                                                                                                            n3 = R$id.savingsTv;
                                                                                                                                                            View view33 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            view33 = (TextView)view2;
                                                                                                                                                            if (view33 != null) {
                                                                                                                                                                n3 = R$id.sizeContainer;
                                                                                                                                                                View view34 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                view34 = (LinearLayout)view2;
                                                                                                                                                                if (view34 != null) {
                                                                                                                                                                    n3 = R$id.sizeInfo;
                                                                                                                                                                    View view35 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                    view35 = (TextView)view2;
                                                                                                                                                                    if (view35 != null) {
                                                                                                                                                                        n3 = R$id.sizeText;
                                                                                                                                                                        View view36 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                        view36 = (TextView)view2;
                                                                                                                                                                        if (view36 != null) {
                                                                                                                                                                            n3 = R$id.tvBestPrice;
                                                                                                                                                                            View view37 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                            view37 = (TextView)view2;
                                                                                                                                                                            if (view37 != null) {
                                                                                                                                                                                n3 = R$id.tvStandardDeliveryDate;
                                                                                                                                                                                View view38 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                view38 = (TextView)view2;
                                                                                                                                                                                if (view38 != null) {
                                                                                                                                                                                    object = new RowCartProductLuxeBinding((ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object2), (TextView)view4, view3, (ConstraintLayout)((Object)object3), (TextView)view5, (TextView)view6, (ConstraintLayout)((Object)object4), (TextView)view7, (TextView)view8, (ImageView)view9, (TextView)view10, (TextView)view11, (ImageView)view12, (AjioTextView)object5, (ImageView)view13, (ImageView)view14, (TextView)view15, (TextView)view16, (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), view17, (ImageView)view18, (TextView)view19, (TextView)view20, (TextView)view21, (TextView)view22, (AjioCheckBox)object8, (TextView)view23, (TextView)view24, (AppCompatImageView)((Object)object9), (TextView)view25, (ConstraintLayout)((Object)object10), (ImageView)view26, (ConstraintLayout)((Object)object11), (TextView)view27, (LinearLayout)view28, (TextView)view29, (TextView)view30, (TextView)view31, (TextView)view32, (TextView)view33, (LinearLayout)view34, (TextView)view35, (TextView)view36, (TextView)view37, (TextView)view38);
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

    public static RowCartProductLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartProductLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartProductLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_product_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartProductLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

