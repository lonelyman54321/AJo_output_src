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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;
import com.willy.ratingbar.ScaleRatingBar;

public final class RowOrderRevampProductBinding
implements BC3 {
    public final Barrier barrier;
    public final CardView cvContainer;
    public final ImageView priorityTagIv;
    public final LinearLayout rateThisProductLl;
    public final RatingBar rateThisProductRatingBar;
    public final ScaleRatingBar ratedItemRatingBar;
    private final LinearLayout rootView;
    public final FrameLayout rowOrderLayoutClick;
    public final LinearLayout rowOrderLayoutProduct;
    public final ImageView rowOrderProductImvArrow;
    public final AjioRoundedCornerImageView rowOrderProductImvProduct;
    public final AppCompatImageView rowOrderProductImvTrack;
    public final LinearLayout rowOrderProductLayoutTrack;
    public final AjioTextView rowOrderProductLblRefund;
    public final AjioTextView rowOrderProductLblTrack;
    public final AjioTextView rowOrderProductTvExchange;
    public final AjioTextView rowOrderProductTvHeaderinfo;
    public final AjioTextView rowOrderProductTvInfo;
    public final AjioTextView rowOrderProductTvRefundAmount;
    public final AjioTextView rowOrderProductTvStatus;
    public final AjioTextView rowOrderProductTvSubinfo;
    public final TrackOrderLayout trackOrderLayout;
    public final AjioTextView tvFreebies;
    public final AjioTextView youRatedTextId;
    public final LinearLayout yourRatingLl;

    private RowOrderRevampProductBinding(LinearLayout linearLayout, Barrier barrier, CardView cardView, ImageView imageView, LinearLayout linearLayout2, RatingBar ratingBar, ScaleRatingBar scaleRatingBar, FrameLayout frameLayout, LinearLayout linearLayout3, ImageView imageView2, AjioRoundedCornerImageView ajioRoundedCornerImageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout4, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, TrackOrderLayout trackOrderLayout, AjioTextView ajioTextView9, AjioTextView ajioTextView10, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.barrier = barrier;
        this.cvContainer = cardView;
        this.priorityTagIv = imageView;
        this.rateThisProductLl = linearLayout2;
        this.rateThisProductRatingBar = ratingBar;
        this.ratedItemRatingBar = scaleRatingBar;
        this.rowOrderLayoutClick = frameLayout;
        this.rowOrderLayoutProduct = linearLayout3;
        this.rowOrderProductImvArrow = imageView2;
        this.rowOrderProductImvProduct = ajioRoundedCornerImageView;
        this.rowOrderProductImvTrack = appCompatImageView;
        this.rowOrderProductLayoutTrack = linearLayout4;
        this.rowOrderProductLblRefund = ajioTextView;
        this.rowOrderProductLblTrack = ajioTextView2;
        this.rowOrderProductTvExchange = ajioTextView3;
        this.rowOrderProductTvHeaderinfo = ajioTextView4;
        this.rowOrderProductTvInfo = ajioTextView5;
        this.rowOrderProductTvRefundAmount = ajioTextView6;
        this.rowOrderProductTvStatus = ajioTextView7;
        this.rowOrderProductTvSubinfo = ajioTextView8;
        this.trackOrderLayout = trackOrderLayout;
        this.tvFreebies = ajioTextView9;
        this.youRatedTextId = ajioTextView10;
        this.yourRatingLl = linearLayout5;
    }

    public static RowOrderRevampProductBinding bind(View view) {
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
                                            Object object4 = view2 = dd2_2.a(n3, view);
                                            object4 = (AjioRoundedCornerImageView)view2;
                                            if (object4 != null) {
                                                n3 = R$id.row_order_product_imv_track;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (AppCompatImageView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.row_order_product_layout_track;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (LinearLayout)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.row_order_product_lbl_refund;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (AjioTextView)view2;
                                                        if (object6 != null) {
                                                            n3 = R$id.row_order_product_lbl_track;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (AjioTextView)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.row_order_product_tv_exchange;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (AjioTextView)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.row_order_product_tv_headerinfo;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (AjioTextView)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.row_order_product_tv_info;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (AjioTextView)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.row_order_product_tv_refund_amount;
                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                            object11 = (AjioTextView)view2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.row_order_product_tv_status;
                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                object12 = (AjioTextView)view2;
                                                                                if (object12 != null) {
                                                                                    n3 = R$id.row_order_product_tv_subinfo;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (AjioTextView)view2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.track_order_layout;
                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                        object14 = (TrackOrderLayout)view2;
                                                                                        if (object14 != null) {
                                                                                            n3 = R$id.tvFreebies;
                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                            object15 = (AjioTextView)view2;
                                                                                            if (object15 != null) {
                                                                                                n3 = R$id.you_rated_text_id;
                                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                object16 = (AjioTextView)view2;
                                                                                                if (object16 != null) {
                                                                                                    n3 = R$id.your_rating_ll;
                                                                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                                                                    view11 = (LinearLayout)view2;
                                                                                                    if (view11 != null) {
                                                                                                        View view12 = view;
                                                                                                        view12 = (LinearLayout)view;
                                                                                                        RowOrderRevampProductBinding rowOrderRevampProductBinding = new RowOrderRevampProductBinding((LinearLayout)view12, (Barrier)view3, (CardView)((Object)object2), (ImageView)view4, (LinearLayout)view5, (RatingBar)view6, (ScaleRatingBar)((Object)object3), (FrameLayout)view7, (LinearLayout)view8, (ImageView)view9, (AjioRoundedCornerImageView)((Object)object4), (AppCompatImageView)((Object)object5), (LinearLayout)view10, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (TrackOrderLayout)((Object)object14), (AjioTextView)object15, (AjioTextView)object16, (LinearLayout)view11);
                                                                                                        return rowOrderRevampProductBinding;
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

    public static RowOrderRevampProductBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderRevampProductBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderRevampProductBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_revamp_product;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderRevampProductBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

