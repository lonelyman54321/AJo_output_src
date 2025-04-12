/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebSettings$TextSize
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 */
package com.ril.ajio.web;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener;
import com.ril.ajio.databinding.ActivityTermsAndConditionsBinding;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.utility.NetworkRedirectionReceiver;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.ril.ajio.web.CustomWebViewActivity$b;
import com.ril.ajio.web.CustomWebViewActivity$c;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class CustomWebViewActivity
extends BaseSplitActivity
implements a,
nc1_2,
hu1_1,
DeleteAccountInteractionListener {
    public static final CustomWebViewActivity$a Companion;
    public final rq1_2 X;
    public FrameLayout Y;
    public WebView Z;
    public AjioLoaderView k0;
    public String p0;
    public String q0;
    public String r0;
    public String s0;
    public String t0;
    public final NewCustomEventsRevamp u0;
    public boolean v0;
    public int w0;
    public wj3_2 x0;
    public final hh3_2 y0;

    static {
        CustomWebViewActivity$a customWebViewActivity$a;
        Companion = customWebViewActivity$a = new Object();
    }

    public CustomWebViewActivity() {
        Object object = et1_2.NONE;
        CustomWebViewActivity$c customWebViewActivity$c = new CustomWebViewActivity$c(this);
        object = yr1_2.a(object, customWebViewActivity$c);
        this.X = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.u0 = object;
        this.v0 = true;
        this.w0 = -1;
        super(0);
        object = yr1_2.b((Function0)object);
        this.y0 = object;
    }

    public static final void A2(CustomWebViewActivity customWebViewActivity, String string2, String string3) {
        int n3;
        Object object = customWebViewActivity;
        customWebViewActivity.getClass();
        if (string2 != null && (n3 = string2.length()) != 0) {
            Bundle bundle = new Bundle();
            String string4 = customWebViewActivity.p0;
            bundle.putString("product_id", string4);
            string4 = customWebViewActivity.q0;
            bundle.putString("product_name", string4);
            string4 = customWebViewActivity.t0;
            bundle.putString("product_brand", string4);
            object = customWebViewActivity.u0;
            String string5 = ((NewCustomEventsRevamp)object).getSIZE_CHART_INTERACTION();
            int n4 = 1536;
            String string6 = "size_chart_interactions";
            String string7 = "size guide screen";
            String string8 = "size guide screen";
            String string9 = "pdp screen";
            String string10 = "pdp screen";
            string4 = string3;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string5, string3, string2, string6, string7, string8, string9, bundle, string10, false, null, n4, null);
        }
    }

    public static final void C2(CustomWebViewActivity object, String string2, String string3, String string4) {
        int n3;
        object.getClass();
        if (string3 != null && (n3 = string3.length()) != 0 || string4 != null && (n3 = string4.length()) != 0) {
            GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string5 = ((CustomWebViewActivity)object).u0.getSIZE_CHART_INTERACTIONS();
            AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
            object = ((CustomWebViewActivity)object).D2();
            object = analyticsData$Builder.bundle((Bundle)object);
            AnalyticsData analyticsData = ((AnalyticsData$Builder)object).build();
            String string6 = "size guide screen";
            gTMEvents.gtmEventsToGaWithCategory(string5, string2, string4, string3, string6, analyticsData);
        }
    }

    public static final void H2(Context context, int n3, String string2) {
        CustomWebViewActivity$a customWebViewActivity$a = Companion;
        customWebViewActivity$a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        CustomWebViewActivity$a.b(customWebViewActivity$a, context, string2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void y2(CustomWebViewActivity customWebViewActivity) {
        String string2 = customWebViewActivity.r0;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = "";
        }
        String string3 = string2;
        Bundle bundle = new Bundle();
        Object object = customWebViewActivity.p0;
        bundle.putString("product_id", (String)object);
        object = customWebViewActivity.q0;
        bundle.putString("product_name", (String)object);
        object = customWebViewActivity.r0;
        bundle.putString("product_size", (String)object);
        string2 = "product_brand";
        object = customWebViewActivity.t0;
        bundle.putString(string2, (String)object);
        int n3 = string3.length();
        if (n3 != 0) {
            object = customWebViewActivity.u0;
            String string4 = ((NewCustomEventsRevamp)object).getSIZE_CHART_INTERACTION();
            String string5 = ((NewCustomEventsRevamp)object).getSIZE_CHART();
            String string6 = ((NewCustomEventsRevamp)object).getSIZE_CHART_INTERACTION();
            String string7 = "size guide screen";
            String string8 = "size guide screen";
            String string9 = "pdp screen";
            String string10 = "pdp screen";
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string5, string3, string6, string7, string8, string9, bundle, string10, false, null, n4, null);
            return;
        }
    }

    public static final void z2(CustomWebViewActivity customWebViewActivity, int n3, String string2) {
        int n4;
        int n7;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        int n8;
        Object object;
        String string9;
        String string10;
        Object object2;
        Object object3 = customWebViewActivity;
        if (n3 > 0) {
            object2 = customWebViewActivity.u0;
            string10 = ((NewCustomEventsRevamp)object2).getSIZE_CHART_INTERACTIONS();
            string9 = String.valueOf(n3);
            object = customWebViewActivity.D2();
            n8 = 0;
            string8 = "past purchase shown";
            string7 = "size_chart_interactions";
            string6 = "size guide screen";
            string5 = "size guide screen";
            string4 = "pdp screen";
            string3 = "pdp screen";
            n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string10, string8, string9, string7, string6, string5, string4, object, string3, false, null, n7, null);
        } else {
            NewCustomEventsRevamp newCustomEventsRevamp = customWebViewActivity.u0;
            String string11 = newCustomEventsRevamp.getSIZE_CHART_INTERACTIONS();
            String string12 = String.valueOf(n3);
            Bundle bundle = customWebViewActivity.D2();
            String string13 = "past purchase not shown";
            String string14 = "size_chart_interactions";
            String string15 = "size guide screen";
            String string16 = "size guide screen";
            String string17 = "pdp screen";
            String string18 = "pdp screen";
            int n10 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string11, string13, string12, string14, string15, string16, string17, bundle, string18, false, null, n10, null);
        }
        if (string2 != null && (n4 = string2.length()) != 0) {
            object2 = ((CustomWebViewActivity)object3).u0;
            string10 = ((NewCustomEventsRevamp)object2).getPURCHASE_RECOMMENDATIONS();
            string4 = customWebViewActivity.D2();
            string3 = null;
            string8 = "";
            string9 = "size_chart_interactions";
            string7 = "size guide screen";
            string6 = "size guide screen";
            string5 = "pdp screen";
            object = "pdp screen";
            n8 = 1536;
            n7 = 0;
            object3 = object2;
            object2 = string10;
            string10 = string2;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, string2, string8, string9, string7, string6, string5, (Bundle)string4, (String)object, false, null, n8, null);
        }
    }

    public final void A9(String string2, String string3) {
        boolean bl2;
        String string4;
        int n3;
        if (string3 != null && (n3 = string3.length()) != 0 && ((n3 = (int)(StringsKt.F(string3, string4 = "sizeChartUrl", false) ? 1 : 0)) != 0 || (bl2 = StringsKt.F(string3, string4 = "sizeguide", false)))) {
            int n4 = R$string.size_guide;
            string2 = hv3_0.K(n4);
            this.G2(string2);
        } else {
            this.G2(string2);
        }
    }

    public final Bundle D2() {
        Bundle bundle = new Bundle();
        String string2 = this.p0;
        bundle.putString("product_id", string2);
        string2 = this.q0;
        bundle.putString("product_name", string2);
        string2 = this.s0;
        bundle.putString("product_size", string2);
        string2 = this.t0;
        bundle.putString("product_brand", string2);
        return bundle;
    }

    public final ActivityTermsAndConditionsBinding E2() {
        return (ActivityTermsAndConditionsBinding)this.X.getValue();
    }

    public final void F2() {
        int n3;
        int n4;
        Object object = this.Z;
        if (object != null && (n4 = object.canGoBack()) == (n3 = 1)) {
            object = this.Z;
            if (object != null) {
                object.goBack();
            }
        } else {
            object = this.r0;
            if (object != null) {
                object = new Intent();
                String string2 = "recommendation_size_chart";
                String string3 = this.r0;
                object.putExtra(string2, string3);
                n3 = -1;
                this.setResult(n3, (Intent)object);
            }
            this.finish();
        }
    }

    public final void G2(String object) {
        int n3 = this.w0;
        int n4 = 21;
        String string2 = "toolbarTitleTv";
        if (n3 != n4 && n3 != (n4 = 22)) {
            Object object2 = this.E2().toolbarHeaderView.toolbarTitleTv;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ai0_2.B((View)object2);
            Object object3 = Looper.getMainLooper();
            object2 = new Handler(object3);
            object3 = new vg0_1(this, (String)object);
            long l2 = 500L;
            object2.postDelayed((Runnable)object3, l2);
            object2 = this.E2().toolbarHeaderView.toolbarTitleTv;
            if (object == null) {
                object = "AJIO";
            }
            object2.setText((CharSequence)object);
            object = h40_0.a;
            object = h40_0.s();
            object2 = "master";
            boolean bl2 = object.optBoolean((String)object2);
            if (bl2) {
                object = this.getIntent();
                object2 = "respect_policy_page";
                n4 = 0;
                object3 = null;
                bl2 = object.getBooleanExtra((String)object2, false);
                if (bl2) {
                    object = this.E2().toolbarHeaderView.toolbarTitleTv;
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    ai0_2.i((View)object);
                }
            }
            return;
        }
        object = this.E2().toolbarHeaderView.toolbarTitleTv;
        Intrinsics.checkNotNullExpressionValue(object, string2);
        ai0_2.i((View)object);
    }

    public final void I1(String string2) {
        Intent intent = new Intent();
        intent.putExtra("PLP_LINK", string2);
        this.setResult(-1, intent);
        this.finish();
    }

    public final void closeActivity() {
        this.setResult(-1);
        this.finish();
    }

    public final void dismissProgress() {
        AjioLoaderView ajioLoaderView = this.k0;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
    }

    public final void e8(String object) {
        int n3 = 1;
        String string2 = "url";
        Intrinsics.checkNotNullParameter(object, string2);
        Object[] objectArray = "android.intent.action.VIEW";
        object = Uri.parse((String)object);
        string2 = new Intent((String)objectArray, (Uri)object);
        try {
            this.startActivity((Intent)string2);
        }
        catch (Exception exception) {
            object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_error_message;
            object = hv3_0.K(n4);
            int n7 = R$string.no_app_found;
            string2 = hv3_0.K(n7);
            objectArray = new Object[n3];
            objectArray[0] = string2;
            string2 = "format(...)";
            object = xh2_0.a(objectArray, n3, (String)object, string2);
            n3 = R$string.no_app_found;
            String string3 = hv3_0.K(n3);
            mq0_2.c(string3, (String)object);
        }
    }

    public final void m3(String string2) {
        a$a.a(string2);
    }

    public final void moveToDeleteReasonScreen() {
        Object object = this.E2().groupDeleteAccount;
        int n3 = 8;
        object.setVisibility(n3);
        this.E2().webviewContainer.setVisibility(n3);
        this.E2().webviewContainerDelete.setVisibility(0);
        yo0_2.Companion.getClass();
        object = new yo0_2();
        Object object2 = this.getSupportFragmentManager();
        object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
        int n4 = R$id.webview_container_delete;
        ((k)object2).j(n4, (Fragment)object, null);
        Intrinsics.checkNotNullExpressionValue(object2, "replace(...)");
        ((k)object2).c(null);
        boolean bl2 = true;
        ((androidx.fragment.app.a)object2).o(bl2, bl2);
    }

    public final void onBackPressed() {
        this.F2();
    }

    public final void onCreate(Bundle bundle) {
        Object object;
        Object object2;
        CustomWebViewActivity customWebViewActivity;
        block29: {
            Object object3;
            int n3;
            Object object4;
            Object object5;
            int n4;
            block28: {
                customWebViewActivity = this;
                n4 = 0;
                object5 = null;
                super.onCreate(bundle);
                object2 = this.E2().getRoot();
                this.setContentView((View)object2);
                cp_1.Companion.getClass();
                object2 = cp$a.e();
                object4 = this.getPackageName();
                object = "getPackageName(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object);
                object2.getClass();
                cp_1.Q((Context)this, (String)object4);
                n3 = R$id.webview_container;
                object2 = this.findViewById(n3);
                object2 = (FrameLayout)object2;
                this.Y = object2;
                object2 = new WebView((Context)this);
                this.Z = object2;
                object4 = this.Y;
                if (object4 == null) break block28;
                try {
                    object4.addView((View)object2);
                }
                catch (Exception exception) {
                    object4 = yn3_0.a;
                    ((yn3$a)object4).e(exception);
                }
            }
            object2 = customWebViewActivity.Z;
            int n7 = 1;
            if (object2 != null && (object2 = object2.getSettings()) != null) {
                object2.setJavaScriptEnabled(n7 != 0);
            }
            if ((object2 = customWebViewActivity.Z) != null) {
                object = new CustomWebViewActivity$b(customWebViewActivity);
                object3 = "GamificationAndroidJSBridge";
                object2.addJavascriptInterface(object, (String)object3);
            }
            n3 = R$id.terms_and_condition_progressView;
            object2 = (AjioProgressView)customWebViewActivity.findViewById(n3);
            n3 = R$id.ajio_loader_view;
            object2 = (AjioLoaderView)customWebViewActivity.findViewById(n3);
            customWebViewActivity.k0 = object2;
            object2 = this.E2().toolbar;
            int n8 = R$drawable.nav_back;
            ((Toolbar)object2).setNavigationIcon(n8);
            object2 = this.E2().toolbar;
            n8 = R$string.back_button_text;
            object = hv3_0.K(n8);
            ((Toolbar)object2).setNavigationContentDescription((CharSequence)object);
            object2 = this.E2().toolbar.getNavigationIcon();
            if (object2 != null) {
                object = "#000000";
                n8 = Color.parseColor((String)object);
                object3 = PorterDuff.Mode.SRC_IN;
                object2.setColorFilter(n8, (PorterDuff.Mode)object3);
            }
            object2 = this.E2().toolbar;
            object = new sg0_1(customWebViewActivity, 0);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object);
            this.showProgress();
            object2 = h40_0.a;
            object2 = h40_0.s();
            n3 = (int)(object2.optBoolean("master") ? 1 : 0);
            object = "";
            if (n3 != 0 && (n3 = (int)((object2 = this.getIntent()).getBooleanExtra((String)(object3 = "respect_policy_page"), false) ? 1 : 0)) != 0) {
                object2 = customWebViewActivity.y0.getValue();
                object3 = "getValue(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                object2 = (UserInformation)object2;
                n3 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
                if (n3 != 0) {
                    this.E2().groupDeleteAccount.setVisibility(0);
                    this.E2().tvPrivacy.setSelected(n7 != 0);
                    wj3_2.Companion.getClass();
                    customWebViewActivity.x0 = object2 = new wj3_2();
                    object2 = this.E2().toolbarHeaderView.toolbarTitleTv;
                    Intrinsics.checkNotNullExpressionValue(object2, "toolbarTitleTv");
                    ai0_2.i((View)object2);
                    object2 = this.getSupportFragmentManager();
                    object2.getClass();
                    object3 = new androidx.fragment.app.a((FragmentManager)object2);
                    n3 = R$id.webview_container_delete;
                    Object object6 = customWebViewActivity.x0;
                    String string2 = null;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("yourDataDeleteFragment");
                        object6 = null;
                    }
                    ((k)object3).j(n3, (Fragment)object6, null);
                    Intrinsics.checkNotNullExpressionValue(object3, "replace(...)");
                    ((k)object3).c((String)object);
                    ((androidx.fragment.app.a)object3).o(n7 != 0, n7 != 0);
                    object2 = this.E2().tvPrivacy;
                    object4 = new tg0_1(customWebViewActivity, 0);
                    object2.setOnClickListener((View.OnClickListener)object4);
                    object2 = this.E2().tvYourData;
                    object4 = new ug0_1(customWebViewActivity);
                    object2.setOnClickListener((View.OnClickListener)object4);
                    object2 = AnalyticsManager.Companion;
                    String string3 = bv_0.a((AnalyticsManager$Companion)object2);
                    String string4 = cv_0.a((AnalyticsManager$Companion)object2);
                    object3 = customWebViewActivity.u0;
                    object6 = "";
                    string2 = "";
                    String string5 = "screen_view";
                    String string6 = "privacy policy screen";
                    String string7 = "privacy policy screen";
                    int n10 = 1668;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object6, string2, null, string5, string6, string7, string3, null, string4, false, null, n10, null);
                }
            }
            object2 = this.getIntent();
            object4 = "URL";
            if ((object2 = object2.getStringExtra((String)object4)) != null) {
                object = object2;
            }
            object2 = this.getIntent();
            object4 = "should hide toolbar";
            n3 = (int)(object2.getBooleanExtra((String)object4, false) ? 1 : 0);
            if (n3 != 0) {
                object2 = this.E2().toolbar;
                n4 = 8;
                object2.setVisibility(n4);
                object2 = customWebViewActivity.Z;
                if (object2 != null && (object2 = object2.getSettings()) != null) {
                    object5 = WebSettings.TextSize.NORMAL;
                    object2.setTextSize((WebSettings.TextSize)object5);
                }
            } else {
                object2 = this.E2().toolbar;
                object2.setVisibility(0);
            }
            object2 = this.getIntent();
            n7 = -1;
            customWebViewActivity.w0 = n3 = object2.getIntExtra("SOURCE", n7);
            customWebViewActivity.q0 = object2 = this.getIntent().getStringExtra("product_name");
            object2 = this.getIntent();
            object5 = "product_id";
            customWebViewActivity.p0 = object2 = object2.getStringExtra((String)object5);
            object2 = customWebViewActivity.Z;
            n4 = customWebViewActivity.w0;
            af3_2.a((WebView)object2, customWebViewActivity, customWebViewActivity, n4, customWebViewActivity);
            n3 = customWebViewActivity.w0;
            if (n3 != n7) {
                object = tf3_2.a(n3, (String)object);
            }
            object5 = this.getApplicationContext();
            object4 = "getApplicationContext(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
            object2 = new jo_2((Context)object5);
            n4 = customWebViewActivity.w0;
            n7 = 21;
            if (n4 != n7 && n4 != (n7 = 22)) {
                object5 = customWebViewActivity.Z;
                object4 = "appPreferences";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                if (object5 != null && object != null) {
                    n7 = ((String)object).length();
                    if (n7 == 0) break block29;
                    object4 = CookieManager.getInstance();
                    object3 = new sf3_2((CookieManager)object4, (WebView)object5, (jo_2)object2, (String)object);
                    try {
                        object4.removeAllCookies((ValueCallback)object3);
                    }
                    catch (Exception exception) {
                        object5 = yn3_0.a;
                        ((yn3$a)object5).e(exception);
                    }
                }
            }
        }
        if ((object2 = customWebViewActivity.Z) != null) {
            object2.loadUrl((String)object);
        }
    }

    public final void onDestroy() {
        NetworkRedirectionReceiver.Companion.getClass();
        NetworkRedirectionReceiver.b = false;
        AjioLoaderView ajioLoaderView = this.k0;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        if ((ajioLoaderView = this.Z) != null) {
            ajioLoaderView.stopLoading();
        }
        if ((ajioLoaderView = this.Z) != null) {
            ajioLoaderView.destroy();
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        int n4;
        String string2 = "event";
        Intrinsics.checkNotNullParameter(keyEvent, string2);
        int n7 = 4;
        if (n3 == n7 && (string2 = this.Z) != null && (n7 = (int)(string2.canGoBack() ? 1 : 0)) == (n4 = 1)) {
            WebView webView = this.Z;
            if (webView != null) {
                webView.goBack();
            }
            return n4;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.F2();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void q0() {
        at2_1.e((Context)this);
    }

    public final void setDeleteAccountTitle() {
        AjioTextView ajioTextView = this.E2().toolbarHeaderView.toolbarTitleTv;
        Intrinsics.checkNotNullExpressionValue(ajioTextView, "toolbarTitleTv");
        ai0_2.B((View)ajioTextView);
        this.E2().toolbarHeaderView.toolbarTitleTv.setText("Delete Account");
    }

    public final void showProgress() {
        AjioLoaderView ajioLoaderView = this.k0;
        if (ajioLoaderView != null) {
            ajioLoaderView.startLoader();
        }
    }
}

