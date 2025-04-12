/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.CookieManager
 *  android.webkit.WebView
 */
package com.ril.ajio.web.game;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.databinding.ActivityMyRewardsBinding;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import com.ril.ajio.web.game.MyRewardsWebActivity$b;
import com.ril.ajio.web.game.MyRewardsWebActivity$c;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class MyRewardsWebActivity
extends AppCompatActivity
implements a,
jy0_2 {
    public static final MyRewardsWebActivity$a Companion;
    public String X;
    public boolean Y;
    public ly0_2 Z;
    public final NewEEcommerceEventsRevamp k0;
    public final NewCustomEventsRevamp p0;
    public final String q0;
    public final String r0;
    public final rq1_2 s0;

    static {
        MyRewardsWebActivity$a myRewardsWebActivity$a;
        Companion = myRewardsWebActivity$a = new Object();
    }

    public MyRewardsWebActivity() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.k0 = object2;
        this.p0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.q0 = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.r0 = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = et1_2.NONE;
        object2 = new MyRewardsWebActivity$c(this);
        object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        this.s0 = object;
    }

    public final void A9(String object, String object2) {
        object2 = this.X;
        if (object2 != null) {
            object = this.p2().toolbarHeaderView.toolbarTitleTv;
            object2 = this.X;
            object.setText((CharSequence)object2);
        } else if (object != null) {
            object2 = this.p2().toolbarHeaderView.toolbarTitleTv;
            object2.setText((CharSequence)object);
        } else {
            object = this.p2().toolbarHeaderView.toolbarTitleTv;
            object2 = "AJIO";
            object.setText((CharSequence)object2);
        }
    }

    public final void H1() {
        Bundle bundle = new Bundle();
        boolean bl2 = true;
        bundle.putBoolean("gotoAjioWallet", bl2);
        bundle.putBoolean("BUNDLE_SKIPPING_MY_ACCOUNT", bl2);
        at2_1.f((Context)this, bundle);
        this.setResult(-1);
        this.finish();
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "absoluteUrl");
        Intent intent = new Intent();
        String string3 = null;
        String string4 = "http";
        boolean bl2 = b.s(string2, string4, false);
        if (!bl2) {
            string3 = UrlHelper.Companion.getInstance().getBaseUrl();
            string2 = Ft2.a(string3, string2);
        }
        intent.putExtra("PLP_URL", string2);
        this.setResult(44, intent);
        this.finish();
    }

    public final void a0(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Object object = "gameUrl";
        Intrinsics.checkNotNullParameter(string3, (String)object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
        if (bl2) {
            boolean bl3 = this.isFinishing();
            if (!bl3) {
                string3 = n1.a(string2, "\n", string3);
                bl3 = false;
                string4 = null;
                object = "AJIO - Share with your friends";
                d23_0.f((Context)this, string3, string2, null, (String)object);
            }
        } else {
            n13_0.Companion.getClass();
            object = N13$a.a();
            MyRewardsWebActivity$b myRewardsWebActivity$b = new MyRewardsWebActivity$b(this, string2, string3);
            ((n13_0)object).a(string4, (Context)this, myRewardsWebActivity$b);
        }
    }

    public final void c1() {
        this.setResult(667);
        this.finish();
    }

    public final void dismissProgress() {
        this.p2().ajioLoaderView.stopLoader();
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "tcUrlChunk");
        String string3 = null;
        String string4 = "http";
        boolean bl2 = b.s(string2, string4, false);
        if (!bl2) {
            string3 = UrlHelper.Companion.getInstance().getBaseUrl();
            string2 = Ft2.a(string3, string2);
        }
        CustomWebViewActivity$a.b(CustomWebViewActivity.Companion, (Context)this, string2, 16);
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
            int n4 = R$string.acc_error_message_page_load_fail;
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

    public final void onCreate(Bundle object) {
        int n3;
        super.onCreate((Bundle)object);
        object = this.p2().getRoot();
        this.setContentView((View)object);
        af3_2.b(this.p2().webview, this);
        object = this.getIntent();
        Object object2 = "URL";
        object = object.getStringExtra((String)object2);
        if (object == null) {
            object = "";
        }
        object2 = this.getIntent();
        int n4 = 0;
        StringBuilder stringBuilder = null;
        int n7 = object2.getIntExtra("SOURCE", 0);
        Object object3 = this.getIntent().getStringExtra("TITLE");
        this.X = object3;
        object3 = this.getIntent();
        String string2 = "IS_APP_PARAMS";
        this.Y = n3 = object3.getBooleanExtra(string2, false);
        n3 = -1;
        if (n7 != n3) {
            object = tf3_2.a(n7, (String)object);
        }
        n7 = (int)(this.Y ? 1 : 0);
        if (n7 != 0) {
            Object object4;
            boolean bl2;
            Object object5;
            WebView.setWebContentsDebuggingEnabled((boolean)false);
            CookieManager.getInstance().setAcceptCookie(true);
            CookieManager.getInstance().acceptCookie();
            object2 = CookieManager.getInstance();
            object3 = this.p2().webview;
            object2.acceptThirdPartyCookies((WebView)object3);
            object3 = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(object3, "getApplication(...)");
            this.Z = object2 = new ly0_2(this, (Application)object3);
            object2 = this.p2().webview;
            n3 = 0;
            object3 = null;
            string2 = "gameWebViewModel";
            if (object2 != null) {
                object5 = this.Z;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object5 = null;
                }
                object4 = "GamificationAndroidJSBridge";
                object2.addJavascriptInterface(object5, (String)object4);
            }
            if (object != null) {
                object2 = this.Z;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object2 = null;
                }
                object2 = ((ly0_2)object2).b();
                object5 = this.Z;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object5;
                }
                object3.getClass();
                object3 = ly0_2.a((String)object);
                string2 = CookieManager.getInstance();
                object2 = ((ArrayList)object2).iterator();
                while (bl2 = object2.hasNext()) {
                    object5 = (String)object2.next();
                    string2.setCookie((String)object3, (String)object5);
                    object4 = yn3_0.a;
                    String string3 = " is set to url domain: ";
                    object5 = UX.c("MyRewardsWebView: Cookie: ", (String)object5, string3, (String)object3);
                    Object[] objectArray = new Object[]{};
                    ((yn3$a)object4).a((String)object5, objectArray);
                }
            }
        }
        object2 = this.p2().toolbar;
        n3 = R$drawable.nav_back;
        ((Toolbar)object2).setNavigationIcon(n3);
        object2 = this.p2().toolbar;
        n3 = R$string.back_button_text;
        ((Toolbar)object2).setNavigationContentDescription(n3);
        object2 = this.p2().toolbar;
        n3 = R$string.acc_page_header_my_rewards;
        object3 = hv3_0.K(n3);
        stringBuilder = new StringBuilder();
        stringBuilder.append((String)object3);
        stringBuilder.append(" title");
        object3 = stringBuilder.toString();
        object2.setContentDescription((CharSequence)object3);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        n4 = 1;
        object3 = new so_0(this, n4);
        long l2 = 100;
        object2.postDelayed((Runnable)object3, l2);
        object2 = this.p2().toolbar.getNavigationIcon();
        if (object2 != null) {
            object3 = "#000000";
            n3 = Color.parseColor((String)object3);
            stringBuilder = PorterDuff.Mode.SRC_IN;
            object2.setColorFilter(n3, (PorterDuff.Mode)stringBuilder);
        }
        object2 = this.p2().toolbar;
        n4 = 2;
        object3 = new UT(this, n4);
        ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object3);
        object2 = this.p2().toolbarHeaderView.toolbarSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(object2, "toolbarSubtitleTv");
        ai0_2.i((View)object2);
        object2 = this.p2().toolbarHeaderView.toolbarTitleTv;
        object3 = "toolbarTitleTv";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        ai0_2.B((View)object2);
        object2 = this.X;
        if (object2 != null) {
            object2 = this.p2().toolbarHeaderView.toolbarTitleTv;
            object3 = this.X;
            object2.setText((CharSequence)object3);
        }
        this.p2().webview.loadUrl((String)object);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.p2().ajioLoaderView.stopLoader();
        this.p2().webview.stopLoading();
        this.p2().webview.destroy();
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        String string2 = "event";
        Intrinsics.checkNotNullParameter(keyEvent, string2);
        int n4 = 4;
        if (n3 == n4 && (n4 = (int)((string2 = this.p2().webview).canGoBack() ? 1 : 0)) != 0) {
            this.p2().webview.goBack();
            return true;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            menuItem = this.p2().webview;
            boolean bl2 = menuItem.canGoBack();
            if (bl2) {
                menuItem = this.p2().webview;
                menuItem.goBack();
            } else {
                this.q1();
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onResume() {
        super.onResume();
        String string2 = "";
        Bundle bundle = px1_2.b("total_reward", string2, "number_of_reward_valid", string2);
        String string3 = this.q0;
        String string4 = this.r0;
        this.p0.newPushCustomScreenView("reward screen", "reward screen", string3, bundle, string4);
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.k0;
        String string2 = "reward screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    public final ActivityMyRewardsBinding p2() {
        return (ActivityMyRewardsBinding)this.s0.getValue();
    }

    public final void q1() {
        this.setResult(0);
        this.finish();
    }

    public final void showProgress() {
        this.p2().ajioLoaderView.startLoader();
    }

    public final void t1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "rewardsUrl");
    }

    public final void u1(String string2) {
        String string3 = "Ajio - Coupon Code";
        Intrinsics.checkNotNullParameter(string3, "clipLabel");
        Intrinsics.checkNotNullParameter(string2, "couponCode");
        Object object = this.getSystemService("clipboard");
        String string4 = "null cannot be cast to non-null type android.content.ClipboardManager";
        Intrinsics.checkNotNull(object, string4);
        object = (ClipboardManager)object;
        string2 = ClipData.newPlainText((CharSequence)string3, (CharSequence)string2);
        if (string2 != null) {
            object.setPrimaryClip((ClipData)string2);
            int n3 = R$string.coupon_code_copied;
            string2 = hv3_0.K(n3);
            object = null;
            string3 = null;
            hv3_0.o0(0, string2, null);
        }
    }
}

