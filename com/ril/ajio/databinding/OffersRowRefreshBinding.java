/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class OffersRowRefreshBinding
implements BC3 {
    public final TextView appliedLabel;
    public final TextView couponCode;
    public final Group couponGroup;
    public final CardView couponParent;
    public final TextView linkClicked;
    private final CardView rootView;
    public final TextView useCode;
    public final TextView voucherText;

    private OffersRowRefreshBinding(CardView cardView, TextView textView, TextView textView2, Group group, CardView cardView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = cardView;
        this.appliedLabel = textView;
        this.couponCode = textView2;
        this.couponGroup = group;
        this.couponParent = cardView2;
        this.linkClicked = textView3;
        this.useCode = textView4;
        this.voucherText = textView5;
    }

    public static OffersRowRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.applied_label;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.coupon_code;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.coupon_group;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (Group)view;
                if (view4 != null) {
                    Object object2 = object;
                    object2 = (CardView)((Object)object);
                    n3 = R$id.link_clicked;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.use_code;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.voucher_text;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                object = new OffersRowRefreshBinding((CardView)((Object)object2), (TextView)view2, (TextView)view3, (Group)view4, (CardView)((Object)object2), (TextView)view5, (TextView)view6, (TextView)view7);
                                return object;
                            }
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

    public static OffersRowRefreshBinding inflate(LayoutInflater layoutInflater) {
        return OffersRowRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static OffersRowRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.offers_row_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OffersRowRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

