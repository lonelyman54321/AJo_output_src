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

public final class DialogCartPriceErrorBinding
implements BC3 {
    public final TextView errorHeader;
    public final TextView errorInfo;
    public final TextView refreshBtn;
    private final LinearLayout rootView;

    private DialogCartPriceErrorBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.errorHeader = textView;
        this.errorInfo = textView2;
        this.refreshBtn = textView3;
    }

    public static DialogCartPriceErrorBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.error_header;
        TextView textView3 = (TextView)dd2_2.a(n3, object);
        if (textView3 != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.error_info, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.refresh_btn, object)) != null) {
            object = (LinearLayout)object;
            DialogCartPriceErrorBinding dialogCartPriceErrorBinding = new DialogCartPriceErrorBinding((LinearLayout)object, textView3, textView2, textView);
            return dialogCartPriceErrorBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogCartPriceErrorBinding inflate(LayoutInflater layoutInflater) {
        return DialogCartPriceErrorBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCartPriceErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cart_price_error;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCartPriceErrorBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

