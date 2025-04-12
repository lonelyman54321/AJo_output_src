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
 *  android.widget.RatingBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.willy.ratingbar.ScaleRatingBar;

public final class RowReturnOrderCardBinding
implements BC3 {
    public final Barrier barrier;
    public final CardView cvContainer;
    public final ImageView priorityTagIv;
    public final LinearLayout rateThisProductLl;
    public final RatingBar rateThisProductRatingBar;
    public final ScaleRatingBar ratedItemRatingBar;
    private final LinearLayout rootView;
    public final AjioTextView rowOrderImpsFailedInfo;
    public final FrameLayout rowOrderLayoutClick;
    public final LinearLayout rowOrderLayoutProduct;
    public final ImageView rowOrderProductImvArrow;
    public final AjioRoundedCornerImageView rowOrderProductImvProduct;
    public final LinearLayout rowOrderProductLayoutTrack;
    public final AjioTextView rowOrderProductLblRefund;
    public final AjioTextView rowOrderProductLblRefundNew;
    public final AjioTextView rowOrderProductLblTrack;
    public final AjioTextView rowOrderProductTvExchange;
    public final AjioTextView rowOrderProductTvHeaderinfo;
    public final AjioTextView rowOrderProductTvInfo;
    public final AjioTextView rowOrderProductTvRefundAmount;
    public final AjioTextView rowOrderProductTvRefundAmountNew;
    public final AjioTextView rowOrderProductTvStatus;
    public final AjioTextView rowOrderProductTvSubinfo;
    public final LinearLayout yourRatingLl;

    private RowReturnOrderCardBinding(LinearLayout linearLayout, Barrier barrier, CardView cardView, ImageView imageView, LinearLayout linearLayout2, RatingBar ratingBar, ScaleRatingBar scaleRatingBar, AjioTextView ajioTextView, FrameLayout frameLayout, LinearLayout linearLayout3, ImageView imageView2, AjioRoundedCornerImageView ajioRoundedCornerImageView, LinearLayout linearLayout4, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.barrier = barrier;
        this.cvContainer = cardView;
        this.priorityTagIv = imageView;
        this.rateThisProductLl = linearLayout2;
        this.rateThisProductRatingBar = ratingBar;
        this.ratedItemRatingBar = scaleRatingBar;
        this.rowOrderImpsFailedInfo = ajioTextView;
        this.rowOrderLayoutClick = frameLayout;
        this.rowOrderLayoutProduct = linearLayout3;
        this.rowOrderProductImvArrow = imageView2;
        this.rowOrderProductImvProduct = ajioRoundedCornerImageView;
        this.rowOrderProductLayoutTrack = linearLayout4;
        this.rowOrderProductLblRefund = ajioTextView2;
        this.rowOrderProductLblRefundNew = ajioTextView3;
        this.rowOrderProductLblTrack = ajioTextView4;
        this.rowOrderProductTvExchange = ajioTextView5;
        this.rowOrderProductTvHeaderinfo = ajioTextView6;
        this.rowOrderProductTvInfo = ajioTextView7;
        this.rowOrderProductTvRefundAmount = ajioTextView8;
        this.rowOrderProductTvRefundAmountNew = ajioTextView9;
        this.rowOrderProductTvStatus = ajioTextView10;
        this.rowOrderProductTvSubinfo = ajioTextView11;
        this.yourRatingLl = linearLayout5;
    }

    public static RowReturnOrderCardBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.barrier;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Barrier)view2;
        if (view3 != null) {
            n3 = R$id.cv_container;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (CardView)view2;
            if (object2 != null) {
                n3 = R$id.priority_tag_iv;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (ImageView)view2;
                if (view4 != null) {
                    n3 = R$id.rate_this_product_ll;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (LinearLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.rate_this_product_rating_bar;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (RatingBar)view2;
                        if (view6 != null) {
                            n3 = R$id.rated_item_rating_bar;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (ScaleRatingBar)view2;
                            if (object3 != null) {
                                n3 = R$id.row_order_imps_failed_info;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (AjioTextView)view2;
                                if (object4 != null) {
                                    n3 = R$id.row_order_layout_click;
                                    View view7 = view2 = dd2_2.a(n3, view);
                                    view7 = (FrameLayout)view2;
                                    if (view7 != null) {
                                        n3 = R$id.row_order_layout_product;
                                        View view8 = view2 = dd2_2.a(n3, view);
                                        view8 = (LinearLayout)view2;
                                        if (view8 != null) {
                                            n3 = R$id.row_order_product_imv_arrow;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (ImageView)view2;
                                            if (view9 != null) {
                                                n3 = R$id.row_order_product_imv_product;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (AjioRoundedCornerImageView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.row_order_product_layout_track;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (LinearLayout)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.row_order_product_lbl_refund;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (AjioTextView)view2;
                                                        if (object6 != null) {
                                                            n3 = R$id.row_order_product_lbl_refund_new;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (AjioTextView)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.row_order_product_lbl_track;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (AjioTextView)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.row_order_product_tv_exchange;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (AjioTextView)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.row_order_product_tv_headerinfo;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (AjioTextView)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.row_order_product_tv_info;
                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                            object11 = (AjioTextView)view2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.row_order_product_tv_refund_amount;
                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                object12 = (AjioTextView)view2;
                                                                                if (object12 != null) {
                                                                                    n3 = R$id.row_order_product_tv_refund_amount_new;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (AjioTextView)view2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.row_order_product_tv_status;
                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                        object14 = (AjioTextView)view2;
                                                                                        if (object14 != null) {
                                                                                            n3 = R$id.row_order_product_tv_subinfo;
                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                            object15 = (AjioTextView)view2;
                                                                                            if (object15 != null) {
                                                                                                n3 = R$id.your_rating_ll;
                                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                                view11 = (LinearLayout)view2;
                                                                                                if (view11 != null) {
                                                                                                    View view12 = view;
                                                                                                    view12 = (LinearLayout)view;
                                                                                                    RowReturnOrderCardBinding rowReturnOrderCardBinding = new RowReturnOrderCardBinding((LinearLayout)view12, (Barrier)view3, (CardView)((Object)object2), (ImageView)view4, (LinearLayout)view5, (RatingBar)view6, (ScaleRatingBar)((Object)object3), (AjioTextView)object4, (FrameLayout)view7, (LinearLayout)view8, (ImageView)view9, (AjioRoundedCornerImageView)((Object)object5), (LinearLayout)view10, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (LinearLayout)view11);
                                                                                                    return rowReturnOrderCardBinding;
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

    public static RowReturnOrderCardBinding inflate(LayoutInflater layoutInflater) {
        return RowReturnOrderCardBinding.inflate(layoutInflater, null, false);
    }

    public static RowReturnOrderCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_return_order_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReturnOrderCardBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

