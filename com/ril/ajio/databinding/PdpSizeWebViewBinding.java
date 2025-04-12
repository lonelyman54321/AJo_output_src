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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.web.NestedWebView;

public final class PdpSizeWebViewBinding
implements BC3 {
    public final AjioImageView pdpSizeBack;
    private final ConstraintLayout rootView;
    public final View seperatorLine;
    public final AjioProgressView termsAndConditionProgressView;
    public final TextView titleText;
    public final NestedWebView webview;

    private PdpSizeWebViewBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, View view, AjioProgressView ajioProgressView, TextView textView, NestedWebView nestedWebView) {
        this.rootView = constraintLayout;
        this.pdpSizeBack = ajioImageView;
        this.seperatorLine = view;
        this.termsAndConditionProgressView = ajioProgressView;
        this.titleText = textView;
        this.webview = nestedWebView;
    }

    public static PdpSizeWebViewBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.pdp_size_back;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (AjioImageView)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.seperator_line, object)) != null) {
            n3 = R$id.terms_and_condition_progressView;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (AjioProgressView)view2;
            if (object3 != null) {
                n3 = R$id.title_text;
                View view3 = view2 = dd2_2.a(n3, object);
                view3 = (TextView)view2;
                if (view3 != null) {
                    n3 = R$id.webview;
                    Object object4 = view2 = dd2_2.a(n3, object);
                    object4 = (NestedWebView)view2;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        PdpSizeWebViewBinding pdpSizeWebViewBinding = new PdpSizeWebViewBinding((ConstraintLayout)((Object)object5), (AjioImageView)((Object)object2), view, (AjioProgressView)((Object)object3), (TextView)view3, (NestedWebView)object4);
                        return pdpSizeWebViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpSizeWebViewBinding inflate(LayoutInflater layoutInflater) {
        return PdpSizeWebViewBinding.inflate(layoutInflater, null, false);
    }

    public static PdpSizeWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_size_web_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpSizeWebViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

