/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NcCouponLayoutBinding
implements BC3 {
    public final AjioTextView couponNotiMessage;
    public final AjioTextView couponNotiTitle;
    public final AjioTextView couponText;
    public final TextView couponUnread;
    public final LinearLayout notiCouponLayout;
    public final ConstraintLayout parentCouponLayout;
    private final ConstraintLayout rootView;

    private NcCouponLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, TextView textView, LinearLayout linearLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.couponNotiMessage = ajioTextView;
        this.couponNotiTitle = ajioTextView2;
        this.couponText = ajioTextView3;
        this.couponUnread = textView;
        this.notiCouponLayout = linearLayout;
        this.parentCouponLayout = constraintLayout2;
    }

    public static NcCouponLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_noti_message;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.coupon_noti_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.coupon_text;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.coupon_unread;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (TextView)view;
                    if (view2 != null) {
                        n3 = R$id.noti_coupon_layout;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (LinearLayout)view;
                        if (view3 != null) {
                            Object object5 = object;
                            object5 = (ConstraintLayout)((Object)object);
                            object = new NcCouponLayoutBinding((ConstraintLayout)((Object)object5), (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (TextView)view2, (LinearLayout)view3, (ConstraintLayout)((Object)object5));
                            return object;
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

    public static NcCouponLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NcCouponLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NcCouponLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.nc_coupon_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NcCouponLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

