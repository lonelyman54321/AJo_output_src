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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcItemhelpAlertRefreshBinding
implements BC3 {
    public final TextView alertTvContent;
    public final TextView alertTvSubtitle;
    public final TextView alertTvTitle;
    private final LinearLayout rootView;
    public final LinearLayout rowCcitemhelpAlert;

    private RowCcItemhelpAlertRefreshBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.alertTvContent = textView;
        this.alertTvSubtitle = textView2;
        this.alertTvTitle = textView3;
        this.rowCcitemhelpAlert = linearLayout2;
    }

    public static RowCcItemhelpAlertRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.alert_tv_content;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.alert_tv_subtitle;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.alert_tv_title;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.row_ccitemhelp_alert;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        RowCcItemhelpAlertRefreshBinding rowCcItemhelpAlertRefreshBinding = new RowCcItemhelpAlertRefreshBinding((LinearLayout)object2, (TextView)view2, (TextView)view3, (TextView)view4, (LinearLayout)view5);
                        return rowCcItemhelpAlertRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcItemhelpAlertRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemhelpAlertRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemhelpAlertRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_itemhelp_alert_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemhelpAlertRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

