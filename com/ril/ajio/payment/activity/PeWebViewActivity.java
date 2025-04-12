/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.Base64
 *  android.view.MenuItem
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.TextView
 */
package com.ril.ajio.payment.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.activity.BaseActivity;
import com.ril.ajio.payment.activity.PeWebViewActivity$a;
import com.ril.ajio.payment.activity.PeWebViewActivity$b;
import com.ril.ajio.payment.activity.PeWebViewActivity$c;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class PeWebViewActivity
extends BaseActivity
implements SK$b {
    public static final PeWebViewActivity$a Companion;
    public final hh3_2 Z;
    public WebView k0;
    public PEProgressView p0;
    public float q0;
    public TenantResponse r0;

    static {
        PeWebViewActivity$a peWebViewActivity$a;
        Companion = peWebViewActivity$a = new Object();
    }

    public PeWebViewActivity() {
        Object object = new dt_2(this, 2);
        this.Z = object = yr1_2.b((Function0)object);
    }

    public final void H6() {
        Object object = this.p0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webProgressView");
            object = null;
        }
        object.show();
        object = (op2_2)this.Z.getValue();
        TenantResponse tenantResponse = this.r0;
        float f5 = this.q0;
        ((op2_2)object).c("UserCancel", tenantResponse, f5);
    }

    public final void onBackPressed() {
        this.s2((Context)this);
    }

    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_activity_webview;
            this.setContentView(n3);
            n3 = R$id.pesdk_toolbar;
            object = (Toolbar)this.findViewById(n3);
            int bl2 = R$id.pesdk_toolbar_title_tv;
            object3 = (TextView)this.findViewById(bl2);
            object2 = "PAYMENT DETAILS";
            object3.setText((CharSequence)object2);
            int n4 = R$drawable.ic_back_arrow_lux;
            object.setNavigationIcon(n4);
            int n7 = R$string.back_button_text;
            object.setNavigationContentDescription(n7);
        } else {
            n3 = R$layout.pesdk_activity_webview;
            this.setContentView(n3);
            n3 = R$id.pesdk_toolbar;
            object = (Toolbar)this.findViewById(n3);
            int n8 = R$id.pesdk_toolbar_title_tv;
            object3 = (TextView)this.findViewById(n8);
            object2 = "Payment Details";
            object3.setText((CharSequence)object2);
            int n10 = R$drawable.pesdk_ic_toolbar_back;
            object.setNavigationIcon(n10);
            int n14 = R$string.back_button_text;
            object.setNavigationContentDescription(n14);
        }
        kq2_1.d((Toolbar)object, this);
        n3 = R$id.webview;
        object = (WebView)this.findViewById(n3);
        this.k0 = object;
        object = this.Z;
        object3 = ((op2_2)object.getValue()).m;
        int n15 = 1;
        object2 = new up0_0(this, n15);
        Object object4 = new PeWebViewActivity$c((Function1)object2);
        ((LiveData)object3).e(this, (F62)object4);
        object = ((op2_2)object.getValue()).o;
        int n16 = 1;
        object3 = new vp0_1(this, n16);
        object2 = new PeWebViewActivity$c((Function1)object3);
        object.e(this, (F62)object2);
        object = this.getIntent();
        object3 = "parentScreen";
        n3 = (int)(object.hasExtra((String)object3) ? 1 : 0);
        if (n3 != 0) {
            object = this.getIntent();
            object.removeExtra((String)object3);
        }
        n3 = R$id.pe_webview_progress_bar;
        object = (PEProgressView)this.findViewById(n3);
        this.p0 = object;
        object = new PeWebViewActivity$b(this);
        object3 = this.k0;
        n16 = 0;
        object2 = null;
        object4 = "webView";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            boolean bl2 = false;
            object3 = null;
        }
        object3.setWebViewClient((WebViewClient)object);
        object = this.k0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object3 = new WebChromeClient();
        object.setWebChromeClient((WebChromeClient)object3);
        object = this.k0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object2 = object;
        }
        object = object2.getSettings();
        Intrinsics.checkNotNullExpressionValue(object, "getSettings(...)");
        boolean bl3 = true;
        object.setJavaScriptEnabled(bl3);
        object.setDomStorageEnabled(bl3);
        object.setLoadWithOverviewMode(bl3);
        object.setUseWideViewPort(bl3);
        object.setBuiltInZoomControls(bl3);
        object.setDisplayZoomControls(false);
        object.setSupportZoom(bl3);
        object.setCacheMode(2);
        object = new AlertDialog.Builder((Context)this);
        object.setMessage((CharSequence)"Please chnage the network.");
        object.setCancelable(bl3);
        object3 = new lq2_2(this);
        object.setPositiveButton((CharSequence)"Yes", (DialogInterface.OnClickListener)object3);
        object3 = new Object();
        object.setNegativeButton((CharSequence)"No", (DialogInterface.OnClickListener)object3);
        this.r2();
        object = new Handler();
        object3 = new ep1_2(1);
        object.postDelayed((Runnable)object3, 5000L);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.s2((Context)this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void p2() {
        PEProgressView pEProgressView = this.p0;
        if (pEProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webProgressView");
            pEProgressView = null;
        }
        pEProgressView.dismiss();
        pEProgressView = new Intent();
        Bundle bundle = new Bundle();
        pEProgressView.putExtras(bundle);
        this.setResult(0, (Intent)pEProgressView);
        this.finish();
    }

    public final void r2() {
        float f5;
        String string2;
        Class<TenantResponse> clazz;
        Object object = this.getIntent().getStringExtra("html");
        Object object2 = null;
        if (object != null) {
            clazz = Charsets.UTF_8;
            object = ((String)object).getBytes((Charset)((Object)clazz));
            Intrinsics.checkNotNullExpressionValue(object, "getBytes(...)");
            object = Base64.encodeToString((byte[])object, (int)0);
            clazz = this.k0;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                clazz = null;
            }
            string2 = "text/html; charset=UTF-8";
            String string3 = "base64";
            clazz.loadData((String)object, string2, string3);
        }
        object = this.getIntent();
        clazz = "NET_PAYABLE";
        string2 = null;
        this.q0 = f5 = object.getFloatExtra((String)((Object)clazz), 0.0f);
        object = this.getIntent();
        clazz = "TENANT_RESPONSE";
        object = object.getStringExtra((String)((Object)clazz));
        clazz = TenantResponse.class;
        object = JsonUtils.fromJson((String)object, clazz);
        try {
            object2 = object = (TenantResponse)object;
        }
        catch (Exception exception) {
            clazz = yn3_0.a;
            ((yn3$a)((Object)clazz)).e(exception);
        }
        this.r0 = object2;
    }

    public final void s2(Context object) {
        if (object == null) {
            this.p2();
            return;
        }
        sk_2.Companion.getClass();
        object = new sk_2();
        Intrinsics.checkNotNullParameter(this, "onCancelTransactionClick");
        ((sk_2)object).a = this;
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "CancelTransactionDialog");
    }
}

