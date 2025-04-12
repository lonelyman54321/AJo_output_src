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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.notifications.AspectFitImageView;

public final class NotificationListItemBinding
implements BC3 {
    public final AjioTextView action1;
    public final LinearLayout action1Layout;
    public final AjioTextView action2;
    public final LinearLayout action2Layout;
    public final AjioTextView action3;
    public final LinearLayout action3Layout;
    public final AjioTextView couponText;
    public final LinearLayout expiredLayout;
    public final AjioTextView expiredText1;
    public final AjioTextView expiredText2;
    public final View expiryDisabledLayout;
    public final AjioTextView expiryText;
    public final FrameLayout imageAndCouponLayout;
    public final RelativeLayout notiBodyLayout;
    public final LinearLayout notiCouponLayout;
    public final LinearLayout notiFooterLayout;
    public final AspectFitImageView notiImage;
    public final AjioTextView notiMessage;
    public final AjioTextView notiTitle;
    private final RelativeLayout rootView;
    public final TextView unread;

    private NotificationListItemBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2, LinearLayout linearLayout2, AjioTextView ajioTextView3, LinearLayout linearLayout3, AjioTextView ajioTextView4, LinearLayout linearLayout4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, View view, AjioTextView ajioTextView7, FrameLayout frameLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout5, LinearLayout linearLayout6, AspectFitImageView aspectFitImageView, AjioTextView ajioTextView8, AjioTextView ajioTextView9, TextView textView) {
        this.rootView = relativeLayout;
        this.action1 = ajioTextView;
        this.action1Layout = linearLayout;
        this.action2 = ajioTextView2;
        this.action2Layout = linearLayout2;
        this.action3 = ajioTextView3;
        this.action3Layout = linearLayout3;
        this.couponText = ajioTextView4;
        this.expiredLayout = linearLayout4;
        this.expiredText1 = ajioTextView5;
        this.expiredText2 = ajioTextView6;
        this.expiryDisabledLayout = view;
        this.expiryText = ajioTextView7;
        this.imageAndCouponLayout = frameLayout;
        this.notiBodyLayout = relativeLayout2;
        this.notiCouponLayout = linearLayout5;
        this.notiFooterLayout = linearLayout6;
        this.notiImage = aspectFitImageView;
        this.notiMessage = ajioTextView8;
        this.notiTitle = ajioTextView9;
        this.unread = textView;
    }

    public static NotificationListItemBinding bind(View view) {
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
                            if (view5 != null) {
                                n3 = R$id.coupon_text;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.expired_layout;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (LinearLayout)view2;
                                    if (view6 != null) {
                                        n3 = R$id.expired_text_1;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null) {
                                            View view7;
                                            n3 = R$id.expired_text_2;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioTextView)view2;
                                            if (object7 != null && (view7 = dd2_2.a(n3 = R$id.expiry_disabled_layout, view)) != null) {
                                                n3 = R$id.expiry_text;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioTextView)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.image_and_coupon_layout;
                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                    view8 = (FrameLayout)view2;
                                                    if (view8 != null) {
                                                        n3 = R$id.noti_body_layout;
                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                        view9 = (RelativeLayout)view2;
                                                        if (view9 != null) {
                                                            n3 = R$id.noti_coupon_layout;
                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                            view10 = (LinearLayout)view2;
                                                            if (view10 != null) {
                                                                n3 = R$id.noti_footer_layout;
                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                view11 = (LinearLayout)view2;
                                                                if (view11 != null) {
                                                                    n3 = R$id.noti_image;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (AspectFitImageView)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.noti_message;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (AjioTextView)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.noti_title;
                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                            object11 = (AjioTextView)view2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.unread;
                                                                                View view12 = view2 = dd2_2.a(n3, view);
                                                                                view12 = (TextView)view2;
                                                                                if (view12 != null) {
                                                                                    View view13 = view;
                                                                                    view13 = (RelativeLayout)view;
                                                                                    NotificationListItemBinding notificationListItemBinding = new NotificationListItemBinding((RelativeLayout)view13, (AjioTextView)object2, (LinearLayout)view3, (AjioTextView)object3, (LinearLayout)view4, (AjioTextView)object4, (LinearLayout)view5, (AjioTextView)object5, (LinearLayout)view6, (AjioTextView)object6, (AjioTextView)object7, view7, (AjioTextView)object8, (FrameLayout)view8, (RelativeLayout)view9, (LinearLayout)view10, (LinearLayout)view11, (AspectFitImageView)((Object)object9), (AjioTextView)object10, (AjioTextView)object11, (TextView)view12);
                                                                                    return notificationListItemBinding;
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

    public static NotificationListItemBinding inflate(LayoutInflater layoutInflater) {
        return NotificationListItemBinding.inflate(layoutInflater, null, false);
    }

    public static NotificationListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.notification_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NotificationListItemBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

