/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.NcCouponLayoutBinding;
import com.ril.ajio.notifications.AspectFitImageView;

public final class NewNotificationListItemBinding
implements BC3 {
    public final AjioTextView action1;
    public final LinearLayout action1Layout;
    public final AjioTextView action2;
    public final LinearLayout action2Layout;
    public final AjioTextView action3;
    public final LinearLayout action3Layout;
    public final NcCouponLayoutBinding couponNc;
    public final LinearLayout expiredLayout;
    public final AjioTextView expiredText1;
    public final AjioTextView expiredText2;
    public final View expiryDisabledLayout;
    public final AjioTextView expiryText;
    public final FrameLayout imageAndCouponLayout;
    public final View leftBar;
    public final RelativeLayout notiBodyLayout;
    public final LinearLayout notiFooterLayout;
    public final AspectFitImageView notiImage;
    public final AjioTextView notiMessage;
    public final AjioTextView notiTitle;
    private final CardView rootView;
    public final TextView unread;

    private NewNotificationListItemBinding(CardView cardView, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2, LinearLayout linearLayout2, AjioTextView ajioTextView3, LinearLayout linearLayout3, NcCouponLayoutBinding ncCouponLayoutBinding, LinearLayout linearLayout4, AjioTextView ajioTextView4, AjioTextView ajioTextView5, View view, AjioTextView ajioTextView6, FrameLayout frameLayout, View view2, RelativeLayout relativeLayout, LinearLayout linearLayout5, AspectFitImageView aspectFitImageView, AjioTextView ajioTextView7, AjioTextView ajioTextView8, TextView textView) {
        this.rootView = cardView;
        this.action1 = ajioTextView;
        this.action1Layout = linearLayout;
        this.action2 = ajioTextView2;
        this.action2Layout = linearLayout2;
        this.action3 = ajioTextView3;
        this.action3Layout = linearLayout3;
        this.couponNc = ncCouponLayoutBinding;
        this.expiredLayout = linearLayout4;
        this.expiredText1 = ajioTextView4;
        this.expiredText2 = ajioTextView5;
        this.expiryDisabledLayout = view;
        this.expiryText = ajioTextView6;
        this.imageAndCouponLayout = frameLayout;
        this.leftBar = view2;
        this.notiBodyLayout = relativeLayout;
        this.notiFooterLayout = linearLayout5;
        this.notiImage = aspectFitImageView;
        this.notiMessage = ajioTextView7;
        this.notiTitle = ajioTextView8;
        this.unread = textView;
    }

    public static NewNotificationListItemBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.action_1;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.action_1_layout;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                n3 = R$id.action_2;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.action_2_layout;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.action_3;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioTextView)view2;
                        if (object4 != null) {
                            n3 = R$id.action_3_layout;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (LinearLayout)view2;
                            if (view5 != null && (view2 = dd2_2.a(n3 = R$id.coupon_nc, view)) != null) {
                                NcCouponLayoutBinding ncCouponLayoutBinding = NcCouponLayoutBinding.bind(view2);
                                n3 = R$id.expired_layout;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (LinearLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.expired_text_1;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioTextView)view2;
                                    if (object5 != null) {
                                        View view7;
                                        n3 = R$id.expired_text_2;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null && (view7 = dd2_2.a(n3 = R$id.expiry_disabled_layout, view)) != null) {
                                            n3 = R$id.expiry_text;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioTextView)view2;
                                            if (object7 != null) {
                                                View view8;
                                                n3 = R$id.image_and_coupon_layout;
                                                View view9 = view2 = dd2_2.a(n3, view);
                                                view9 = (FrameLayout)view2;
                                                if (view9 != null && (view8 = dd2_2.a(n3 = R$id.left_bar, view)) != null) {
                                                    n3 = R$id.noti_body_layout;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (RelativeLayout)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.noti_footer_layout;
                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                        view11 = (LinearLayout)view2;
                                                        if (view11 != null) {
                                                            n3 = R$id.noti_image;
                                                            Object object8 = view2 = dd2_2.a(n3, view);
                                                            object8 = (AspectFitImageView)view2;
                                                            if (object8 != null) {
                                                                n3 = R$id.noti_message;
                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                object9 = (AjioTextView)view2;
                                                                if (object9 != null) {
                                                                    n3 = R$id.noti_title;
                                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                                    object10 = (AjioTextView)view2;
                                                                    if (object10 != null) {
                                                                        n3 = R$id.unread;
                                                                        View view12 = view2 = dd2_2.a(n3, view);
                                                                        view12 = (TextView)view2;
                                                                        if (view12 != null) {
                                                                            Object object11 = view;
                                                                            object11 = (CardView)view;
                                                                            NewNotificationListItemBinding newNotificationListItemBinding = new NewNotificationListItemBinding((CardView)((Object)object11), (AjioTextView)object2, (LinearLayout)view3, (AjioTextView)object3, (LinearLayout)view4, (AjioTextView)object4, (LinearLayout)view5, ncCouponLayoutBinding, (LinearLayout)view6, (AjioTextView)object5, (AjioTextView)object6, view7, (AjioTextView)object7, (FrameLayout)view9, view8, (RelativeLayout)view10, (LinearLayout)view11, (AspectFitImageView)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (TextView)view12);
                                                                            return newNotificationListItemBinding;
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

    public static NewNotificationListItemBinding inflate(LayoutInflater layoutInflater) {
        return NewNotificationListItemBinding.inflate(layoutInflater, null, false);
    }

    public static NewNotificationListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_notification_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewNotificationListItemBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

