/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.pdp.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.web.NestedWebView;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class PDPSizeGuideWebView
extends LinearLayout
implements a,
View.OnClickListener {
    public final NestedWebView a;
    public final AjioProgressView b;
    public final TextView c;
    public zi2_1 d;

    public PDPSizeGuideWebView(Context object) {
        TextView textView;
        Intrinsics.checkNotNullParameter(object, "context");
        super((Context)object);
        object = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.pdp_size_web_view;
        int n4 = 1;
        object.inflate(n3, (ViewGroup)this, n4 != 0);
        this.setOrientation(n4);
        int n7 = R$id.webview;
        object = (NestedWebView)this.findViewById(n7);
        this.a = object;
        n7 = R$id.terms_and_condition_progressView;
        object = (AjioProgressView)this.findViewById(n7);
        this.b = object;
        n3 = R$id.title_text;
        this.c = textView = (TextView)this.findViewById(n3);
        n3 = R$id.pdp_size_back;
        textView = (ImageView)this.findViewById(n3);
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener)this);
        }
        if (object != null) {
            ((AjioProgressView)((Object)object)).dismiss();
        }
        this.showProgress();
    }

    public PDPSizeGuideWebView(Context object, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "attrs";
        Intrinsics.checkNotNullParameter(attributeSet, string2);
        super((Context)object, attributeSet);
        object = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.pdp_size_web_view;
        int n4 = 1;
        object.inflate(n3, (ViewGroup)this, n4 != 0);
        this.setOrientation(n4);
        int n7 = R$id.webview;
        object = (NestedWebView)this.findViewById(n7);
        this.a = object;
        n7 = R$id.terms_and_condition_progressView;
        object = (AjioProgressView)this.findViewById(n7);
        this.b = object;
        n3 = R$id.title_text;
        attributeSet = (TextView)this.findViewById(n3);
        this.c = attributeSet;
        n3 = R$id.pdp_size_back;
        attributeSet = (ImageView)this.findViewById(n3);
        if (attributeSet != null) {
            attributeSet.setOnClickListener((View.OnClickListener)this);
        }
        if (object != null) {
            ((AjioProgressView)((Object)object)).dismiss();
        }
        this.showProgress();
    }

    public PDPSizeGuideWebView(Context object, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "attrs";
        Intrinsics.checkNotNullParameter(attributeSet, string2);
        super((Context)object, attributeSet, n3);
        object = LayoutInflater.from((Context)this.getContext());
        int n4 = R$layout.pdp_size_web_view;
        n3 = 1;
        object.inflate(n4, (ViewGroup)this, n3 != 0);
        this.setOrientation(n3);
        int n7 = R$id.webview;
        object = (NestedWebView)this.findViewById(n7);
        this.a = object;
        n7 = R$id.terms_and_condition_progressView;
        object = (AjioProgressView)this.findViewById(n7);
        this.b = object;
        n4 = R$id.title_text;
        attributeSet = (TextView)this.findViewById(n4);
        this.c = attributeSet;
        n4 = R$id.pdp_size_back;
        attributeSet = (ImageView)this.findViewById(n4);
        if (attributeSet != null) {
            attributeSet.setOnClickListener((View.OnClickListener)this);
        }
        if (object != null) {
            ((AjioProgressView)((Object)object)).dismiss();
        }
        this.showProgress();
    }

    private final void setToolbarTitle(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        TextView textView = this.c;
        if (bl2) {
            if (textView != null) {
                string2 = "AJIO";
                textView.setText((CharSequence)string2);
            }
        } else if (textView != null) {
            textView.setText((CharSequence)string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void A9(String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            boolean bl3;
            Object object;
            boolean bl4;
            bl2 = false;
            if (string3 != null) {
                bl4 = StringsKt.F(string3, "sizeChartUrl", false);
                object = bl4;
            } else {
                bl4 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            bl4 = (Boolean)object;
            if (bl4 || (bl3 = StringsKt.F(string3, (CharSequence)(object = "sizeguide"), false))) {
                int n3 = R$string.size_guide;
                string2 = hv3_0.K(n3);
                this.setToolbarTitle(string2);
                return;
            }
        }
        this.setToolbarTitle(string2);
    }

    public final void dismissProgress() {
        AjioProgressView ajioProgressView = this.b;
        if (ajioProgressView != null) {
            ajioProgressView.dismiss();
        }
    }

    public final void e8(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void m3(String string2) {
        a$a.a(string2);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = R$id.pdp_size_back) == (n3 = object.getId())) {
            Boolean bl2;
            object = this.a;
            if (object != null) {
                n4 = (int)(object.canGoBack() ? 1 : 0);
                bl2 = n4 != 0;
            } else {
                n4 = 0;
                bl2 = null;
            }
            Intrinsics.checkNotNull(bl2);
            n4 = bl2.booleanValue();
            if (n4) {
                if (object != null) {
                    object.goBack();
                }
            } else {
                n3 = 8;
                this.setVisibility(n3);
            }
            if ((object = this.d) != null) {
                object.i7();
            }
        }
    }

    public final void setInfoCallBack(zi2_1 zi2_12) {
        Intrinsics.checkNotNullParameter(zi2_12, "pdpInfoSetter");
        this.d = zi2_12;
    }

    public final void showProgress() {
        AjioProgressView ajioProgressView = this.b;
        if (ajioProgressView != null) {
            ajioProgressView.show();
        }
    }
}

