/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutNotificationRewardsExpiringBinding
implements BC3 {
    public final View expiryDisabledLayout;
    public final ImageView lnreIvImage;
    public final TextView lnreTvDesc;
    public final TextView lnreTvTitle;
    private final CardView rootView;
    public final TextView unread;

    private LayoutNotificationRewardsExpiringBinding(CardView cardView, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.expiryDisabledLayout = view;
        this.lnreIvImage = imageView;
        this.lnreTvDesc = textView;
        this.lnreTvTitle = textView2;
        this.unread = textView3;
    }

    public static LayoutNotificationRewardsExpiringBinding bind(View object) {
        int n3 = R$id.expiry_disabled_layout;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.lnreIvImage;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (ImageView)object2;
            if (view2 != null) {
                n3 = R$id.lnreTvDesc;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (TextView)object2;
                if (view3 != null) {
                    n3 = R$id.lnreTvTitle;
                    View view4 = object2 = dd2_2.a(n3, object);
                    view4 = (TextView)object2;
                    if (view4 != null) {
                        n3 = R$id.unread;
                        View view5 = object2 = dd2_2.a(n3, object);
                        view5 = (TextView)object2;
                        if (view5 != null) {
                            LayoutNotificationRewardsExpiringBinding layoutNotificationRewardsExpiringBinding;
                            Object object3 = object;
                            object3 = (CardView)((Object)object);
                            object2 = layoutNotificationRewardsExpiringBinding;
                            layoutNotificationRewardsExpiringBinding = new LayoutNotificationRewardsExpiringBinding((CardView)((Object)object3), view, (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                            return layoutNotificationRewardsExpiringBinding;
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

    public static LayoutNotificationRewardsExpiringBinding inflate(LayoutInflater layoutInflater) {
        return LayoutNotificationRewardsExpiringBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutNotificationRewardsExpiringBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_notification_rewards_expiring;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutNotificationRewardsExpiringBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

