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
import com.ril.ajio.customviews.widgets.AjioButton;

public final class RowCcLoginHeaderRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioButton rowCcLoginHeaderBtnLogin;
    public final TextView rowCcLoginHeaderLbl;

    private RowCcLoginHeaderRefreshBinding(LinearLayout linearLayout, AjioButton ajioButton, TextView textView) {
        this.rootView = linearLayout;
        this.rowCcLoginHeaderBtnLogin = ajioButton;
        this.rowCcLoginHeaderLbl = textView;
    }

    public static RowCcLoginHeaderRefreshBinding bind(View object) {
        TextView textView;
        int n3 = R$id.row_cc_login_header_btn_login;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton != null && (textView = (TextView)dd2_2.a(n3 = R$id.row_cc_login_header_lbl, object)) != null) {
            object = (LinearLayout)object;
            RowCcLoginHeaderRefreshBinding rowCcLoginHeaderRefreshBinding = new RowCcLoginHeaderRefreshBinding((LinearLayout)object, ajioButton, textView);
            return rowCcLoginHeaderRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcLoginHeaderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcLoginHeaderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcLoginHeaderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_login_header_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcLoginHeaderRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

