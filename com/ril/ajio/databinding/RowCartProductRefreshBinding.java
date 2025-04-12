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

public final class RowCartProductRefreshBinding
implements BC3 {
    public final ConstraintLayout allOfferContainer;
    public final TextView brandInfo;
    public final View cartProductDivider;
    public final TextView cartS1S2Info;
    public final LinearLayout couponPromotionContainer;
    public final TextView discountTv;
    public final ConstraintLayout dodCartPrdView;
    public final TextView dodCartTimerTv;
    public final TextView dodEndsInTxt;
    public final ImageView dodImg;
    public final TextView exclusiveTag;
    public final ConstraintLayout headerContainer;
    public final ImageView idCartGwpImg;
    public final AjioTextView idCartGwpTitle;
    public final ConstraintLayout idConstraintSizeQty;
    public final ImageView idGwpRightArrow;
    public final ImageView ivPdDeliveryAlert;
    public final ImageView ivStandardPd2;
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
    public final TextView tvStandardDeliveryDatePd2;

    private RowCartProductRefreshBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, View view, TextView textView2, LinearLayout linearLayout, TextView textView3, ConstraintLayout constraintLayout3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, ConstraintLayout constraintLayout4, ImageView imageView2, AjioTextView ajioTextView, ConstraintLayout constraintLayout5, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView7, TextView textView8, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, View view2, ImageView imageView6, TextView textView9, TextView textView10, TextView textView11, TextView textView12, AjioCheckBox ajioCheckBox, TextView textView13, TextView textView14, AppCompatImageView appCompatImageView, TextView textView15, ConstraintLayout constraintLayout8, ImageView imageView7, ConstraintLayout constraintLayout9, TextView textView16, LinearLayout linearLayout2, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, LinearLayout linearLayout3, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.rootView = constraintLayout;
        this.allOfferContainer = constraintLayout2;
        this.brandInfo = textView;
        this.cartProductDivider = view;
        this.cartS1S2Info = textView2;
        this.couponPromotionContainer = linearLayout;
        this.discountTv = textView3;
        this.dodCartPrdView = constraintLayout3;
        this.dodCartTimerTv = textView4;
        this.dodEndsInTxt = textView5;
        this.dodImg = imageView;
        this.exclusiveTag = textView6;
        this.headerContainer = constraintLayout4;
        this.idCartGwpImg = imageView2;
        this.idCartGwpTitle = ajioTextView;
        this.idConstraintSizeQty = constraintLayout5;
        this.idGwpRightArrow = imageView3;
        this.ivPdDeliveryAlert = imageView4;
        this.ivStandardPd2 = imageView5;
        this.lowStockInfo = textView7;
        this.moreOffers = textView8;
        this.offerContainer = constraintLayout6;
        this.offerContainerFreebies = constraintLayout7;
        this.offerDivider = view2;
        this.offerImg = imageView6;
        this.offerPrice = textView9;
        this.offerSubTitle = textView10;
        this.offerTitle = textView11;
        this.originalPrice = textView12;
        this.pdCheckbox = ajioCheckBox;
        this.pdDeliveryDetails = textView13;
        this.pdOrderCutOffTime = textView14;
        this.priceDropIV = appCompatImageView;
        this.priceDropTV = textView15;
        this.priorityDeliveryConstraint = constraintLayout8;
        this.productImg = imageView7;
        this.productInfoContainer = constraintLayout9;
        this.productTitle = textView16;
        this.qtyContainer = linearLayout2;
        this.qtyInfo = textView17;
        this.qtyText = textView18;
        this.removeProduct = textView19;
        this.returnExchangeTv = textView20;
        this.savingsTv = textView21;
        this.sizeContainer = linearLayout3;
        this.sizeInfo = textView22;
        this.sizeText = textView23;
        this.tvBestPrice = textView24;
        this.tvStandardDeliveryDate = textView25;
        this.tvStandardDeliveryDatePd2 = textView26;
    }

    public static RowCartProductRefreshBinding bind(View view) {
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
                n3 = R$id.cartS1S2Info;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.couponPromotionContainer;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.discountTv;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (TextView)view2;
                        if (view7 != null) {
                            n3 = R$id.dodCartPrdView;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (ConstraintLayout)view2;
                            if (object3 != null) {
                                n3 = R$id.dodCartTimerTv;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (TextView)view2;
                                if (view8 != null) {
                                    n3 = R$id.dodEndsInTxt;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (TextView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.dodImg;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (ImageView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.exclusiveTag;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (TextView)view2;
                                            if (view11 != null) {
                                                n3 = R$id.headerContainer;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (ConstraintLayout)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.id_cart_gwp_img;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (ImageView)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.id_cart_gwp_title;
                                                        Object object5 = view2 = dd2_2.a(n3, view);
                                                        object5 = (AjioTextView)view2;
                                                        if (object5 != null) {
                                                            n3 = R$id.id_constraint_size_qty;
                                                            Object object6 = view2 = dd2_2.a(n3, view);
                                                            object6 = (ConstraintLayout)view2;
                                                            if (object6 != null) {
                                                                n3 = R$id.id_gwp_right_arrow;
                                                                View view13 = view2 = dd2_2.a(n3, view);
                                                                view13 = (ImageView)view2;
                                                                if (view13 != null) {
                                                                    n3 = R$id.iv_pd_delivery_alert;
                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                    view14 = (ImageView)view2;
                                                                    if (view14 != null) {
                                                                        n3 = R$id.iv_standard_pd2;
                                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                                        view15 = (ImageView)view2;
                                                                        if (view15 != null) {
                                                                            n3 = R$id.lowStockInfo;
                                                                            View view16 = view2 = dd2_2.a(n3, view);
                                                                            view16 = (TextView)view2;
                                                                            if (view16 != null) {
                                                                                n3 = R$id.moreOffers;
                                                                                View view17 = view2 = dd2_2.a(n3, view);
                                                                                view17 = (TextView)view2;
                                                                                if (view17 != null) {
                                                                                    n3 = R$id.offerContainer;
                                                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                                                    object7 = (ConstraintLayout)view2;
                                                                                    if (object7 != null) {
                                                                                        View view18;
                                                                                        n3 = R$id.offerContainerFreebies;
                                                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                                                        object8 = (ConstraintLayout)view2;
                                                                                        if (object8 != null && (view18 = dd2_2.a(n3 = R$id.offerDivider, view)) != null) {
                                                                                            n3 = R$id.offerImg;
                                                                                            View view19 = view2 = dd2_2.a(n3, view);
                                                                                            view19 = (ImageView)view2;
                                                                                            if (view19 != null) {
                                                                                                n3 = R$id.offerPrice;
                                                                                                View view20 = view2 = dd2_2.a(n3, view);
                                                                                                view20 = (TextView)view2;
                                                                                                if (view20 != null) {
                                                                                                    n3 = R$id.offerSubTitle;
                                                                                                    View view21 = view2 = dd2_2.a(n3, view);
                                                                                                    view21 = (TextView)view2;
                                                                                                    if (view21 != null) {
                                                                                                        n3 = R$id.offerTitle;
                                                                                                        View view22 = view2 = dd2_2.a(n3, view);
                                                                                                        view22 = (TextView)view2;
                                                                                                        if (view22 != null) {
                                                                                                            n3 = R$id.originalPrice;
                                                                                                            View view23 = view2 = dd2_2.a(n3, view);
                                                                                                            view23 = (TextView)view2;
                                                                                                            if (view23 != null) {
                                                                                                                n3 = R$id.pd_checkbox;
                                                                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                                                                object9 = (AjioCheckBox)view2;
                                                                                                                if (object9 != null) {
                                                                                                                    n3 = R$id.pd_delivery_details;
                                                                                                                    View view24 = view2 = dd2_2.a(n3, view);
                                                                                                                    view24 = (TextView)view2;
                                                                                                                    if (view24 != null) {
                                                                                                                        n3 = R$id.pd_order_cut_off_time;
                                                                                                                        View view25 = view2 = dd2_2.a(n3, view);
                                                                                                                        view25 = (TextView)view2;
                                                                                                                        if (view25 != null) {
                                                                                                                            n3 = R$id.priceDropIV;
                                                                                                                            Object object10 = view2 = dd2_2.a(n3, view);
                                                                                                                            object10 = (AppCompatImageView)view2;
                                                                                                                            if (object10 != null) {
                                                                                                                                n3 = R$id.priceDropTV;
                                                                                                                                View view26 = view2 = dd2_2.a(n3, view);
                                                                                                                                view26 = (TextView)view2;
                                                                                                                                if (view26 != null) {
                                                                                                                                    n3 = R$id.priorityDeliveryConstraint;
                                                                                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object11 = (ConstraintLayout)view2;
                                                                                                                                    if (object11 != null) {
                                                                                                                                        n3 = R$id.productImg;
                                                                                                                                        View view27 = view2 = dd2_2.a(n3, view);
                                                                                                                                        view27 = (ImageView)view2;
                                                                                                                                        if (view27 != null) {
                                                                                                                                            n3 = R$id.productInfoContainer;
                                                                                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object12 = (ConstraintLayout)view2;
                                                                                                                                            if (object12 != null) {
                                                                                                                                                n3 = R$id.productTitle;
                                                                                                                                                View view28 = view2 = dd2_2.a(n3, view);
                                                                                                                                                view28 = (TextView)view2;
                                                                                                                                                if (view28 != null) {
                                                                                                                                                    n3 = R$id.qtyContainer;
                                                                                                                                                    View view29 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    view29 = (LinearLayout)view2;
                                                                                                                                                    if (view29 != null) {
                                                                                                                                                        n3 = R$id.qtyInfo;
                                                                                                                                                        View view30 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        view30 = (TextView)view2;
                                                                                                                                                        if (view30 != null) {
                                                                                                                                                            n3 = R$id.qtyText;
                                                                                                                                                            View view31 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            view31 = (TextView)view2;
                                                                                                                                                            if (view31 != null) {
                                                                                                                                                                n3 = R$id.removeProduct;
                                                                                                                                                                View view32 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                view32 = (TextView)view2;
                                                                                                                                                                if (view32 != null) {
                                                                                                                                                                    n3 = R$id.returnExchangeTv;
                                                                                                                                                                    View view33 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                    view33 = (TextView)view2;
                                                                                                                                                                    if (view33 != null) {
                                                                                                                                                                        n3 = R$id.savingsTv;
                                                                                                                                                                        View view34 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                        view34 = (TextView)view2;
                                                                                                                                                                        if (view34 != null) {
                                                                                                                                                                            n3 = R$id.sizeContainer;
                                                                                                                                                                            View view35 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                            view35 = (LinearLayout)view2;
                                                                                                                                                                            if (view35 != null) {
                                                                                                                                                                                n3 = R$id.sizeInfo;
                                                                                                                                                                                View view36 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                view36 = (TextView)view2;
                                                                                                                                                                                if (view36 != null) {
                                                                                                                                                                                    n3 = R$id.sizeText;
                                                                                                                                                                                    View view37 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                    view37 = (TextView)view2;
                                                                                                                                                                                    if (view37 != null) {
                                                                                                                                                                                        n3 = R$id.tvBestPrice;
                                                                                                                                                                                        View view38 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                        view38 = (TextView)view2;
                                                                                                                                                                                        if (view38 != null) {
                                                                                                                                                                                            n3 = R$id.tvStandardDeliveryDate;
                                                                                                                                                                                            View view39 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                            view39 = (TextView)view2;
                                                                                                                                                                                            if (view39 != null) {
                                                                                                                                                                                                n3 = R$id.tvStandardDeliveryDatePd2;
                                                                                                                                                                                                View view40 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                view40 = (TextView)view2;
                                                                                                                                                                                                if (view40 != null) {
                                                                                                                                                                                                    Object object13 = view;
                                                                                                                                                                                                    object13 = (ConstraintLayout)view;
                                                                                                                                                                                                    RowCartProductRefreshBinding rowCartProductRefreshBinding = new RowCartProductRefreshBinding((ConstraintLayout)((Object)object13), (ConstraintLayout)((Object)object2), (TextView)view4, view3, (TextView)view5, (LinearLayout)view6, (TextView)view7, (ConstraintLayout)((Object)object3), (TextView)view8, (TextView)view9, (ImageView)view10, (TextView)view11, (ConstraintLayout)((Object)object4), (ImageView)view12, (AjioTextView)object5, (ConstraintLayout)((Object)object6), (ImageView)view13, (ImageView)view14, (ImageView)view15, (TextView)view16, (TextView)view17, (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), view18, (ImageView)view19, (TextView)view20, (TextView)view21, (TextView)view22, (TextView)view23, (AjioCheckBox)object9, (TextView)view24, (TextView)view25, (AppCompatImageView)((Object)object10), (TextView)view26, (ConstraintLayout)((Object)object11), (ImageView)view27, (ConstraintLayout)((Object)object12), (TextView)view28, (LinearLayout)view29, (TextView)view30, (TextView)view31, (TextView)view32, (TextView)view33, (TextView)view34, (LinearLayout)view35, (TextView)view36, (TextView)view37, (TextView)view38, (TextView)view39, (TextView)view40);
                                                                                                                                                                                                    return rowCartProductRefreshBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartProductRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCartProductRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartProductRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_product_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartProductRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

