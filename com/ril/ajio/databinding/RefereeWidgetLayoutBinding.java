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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RefereeWidgetLayoutBinding
implements BC3 {
    public final CardView fahRefereeWidgetItem;
    public final AppCompatImageView refereeCancel;
    public final TextView refereeCashExpire;
    public final TextView refereeCashInfo;
    public final AppCompatImageView refereeDummyIv;
    public final TextView refereeHeader;
    private final CardView rootView;

    private RefereeWidgetLayoutBinding(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, AppCompatImageView appCompatImageView2, TextView textView3) {
        this.rootView = cardView;
        this.fahRefereeWidgetItem = cardView2;
        this.refereeCancel = appCompatImageView;
        this.refereeCashExpire = textView;
        this.refereeCashInfo = textView2;
        this.refereeDummyIv = appCompatImageView2;
        this.refereeHeader = textView3;
    }

    public static RefereeWidgetLayoutBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (CardView)((Object)object);
        int n3 = R$id.referee_cancel;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AppCompatImageView)view;
        if (object3 != null) {
            n3 = R$id.referee_cash_expire;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.referee_cash_info;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.referee_dummy_iv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppCompatImageView)view;
                    if (object4 != null) {
                        n3 = R$id.referee_header;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            Object object5 = object;
                            view = object2;
                            object = new RefereeWidgetLayoutBinding((CardView)((Object)object2), (CardView)((Object)object2), (AppCompatImageView)((Object)object3), (TextView)view2, (TextView)view3, (AppCompatImageView)((Object)object4), (TextView)view4);
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

    public static RefereeWidgetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RefereeWidgetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RefereeWidgetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.referee_widget_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RefereeWidgetLayoutBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

