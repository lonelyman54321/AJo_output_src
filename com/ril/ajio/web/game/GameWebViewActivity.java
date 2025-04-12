/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.ril.ajio.web.game;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.databinding.ActivityGameBinding;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import com.ril.ajio.web.game.GameWebViewActivity$a;
import com.ril.ajio.web.game.GameWebViewActivity$b;
import com.ril.ajio.web.game.GameWebViewActivity$c;
import com.ril.ajio.web.game.GameWebViewActivity$d;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class GameWebViewActivity
extends BaseSplitActivity
implements jy0_2 {
    public static final GameWebViewActivity$a Companion;
    public ly0_2 X;
    public GameInfo Y;
    public WebView Z;
    public final rq1_2 k0;
    public final GameWebViewActivity$b p0;

    static {
        GameWebViewActivity$a gameWebViewActivity$a;
        Companion = gameWebViewActivity$a = new Object();
    }

    public GameWebViewActivity() {
        Object object = et1_2.NONE;
        GameWebViewActivity$d gameWebViewActivity$d = new GameWebViewActivity$d(this);
        object = yr1_2.a(object, gameWebViewActivity$d);
        this.k0 = object;
        super(this);
        this.p0 = object;
    }

    public final void H1() {
        Bundle bundle = new Bundle();
        boolean bl2 = true;
        bundle.putBoolean("gotoAjioWallet", bl2);
        bundle.putBoolean("BUNDLE_SKIPPING_MY_ACCOUNT", bl2);
        at2_1.f((Context)this, bundle);
        this.setResult(0);
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
            GameWebViewActivity$c gameWebViewActivity$c = new GameWebViewActivity$c(this, string2, string3);
            ((n13_0)object).a(string4, (Context)this, gameWebViewActivity$c);
        }
    }

    public final void c1() {
        this.setResult(667);
        this.finish();
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

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = 45;
        if (n3 == n7) {
            if (n4 != 0) {
                this.setResult(n4, intent);
                this.finish();
            }
        } else {
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        this.q1();
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        int n3;
        super.onCreate((Bundle)object);
        object = this.k0;
        Object object2 = ((ActivityGameBinding)object.getValue()).getRoot();
        this.setContentView((View)object2);
        object = ((ActivityGameBinding)object.getValue()).agWebView;
        this.Z = object;
        object2 = this.getApplication();
        Object object3 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.X = object = new ly0_2(this, (Application)object2);
        object = this.getIntent();
        object2 = null;
        if (object != null) {
            n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 > n4) {
                object = (Parcelable)ey0_0.a((Intent)object);
            } else {
                object3 = "GAME_INFO";
                n3 = (object = object.getParcelableExtra((String)object3)) instanceof GameInfo;
                if (n3 == 0) {
                    bl2 = false;
                    object = null;
                }
                object = (GameInfo)object;
            }
            object = (GameInfo)object;
        } else {
            bl2 = false;
            object = null;
        }
        this.Y = object;
        if (object == null || (bl2 = TextUtils.isEmpty((CharSequence)(object = ((GameInfo)object).getGameUrl())))) {
            this.finish();
        }
        bl2 = false;
        WebView.setWebContentsDebuggingEnabled((boolean)false);
        object = this.Z;
        if (object != null) {
            object = object.getSettings();
            n3 = 1;
            object.setJavaScriptEnabled(n3 != 0);
            object.setDatabaseEnabled(n3 != 0);
            object.setDomStorageEnabled(n3 != 0);
            n3 = 2;
            object.setCacheMode(n3);
        }
        if ((object = this.Z) != null) {
            object3 = this.X;
            if (object3 == null) {
                object3 = "gameWebViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = object3;
            }
            object3 = "GamificationAndroidJSBridge";
            object.addJavascriptInterface(object2, (String)object3);
        }
        if ((object = this.Z) != null) {
            object2 = this.p0;
            object.setWebViewClient((WebViewClient)object2);
        }
        object = CookieManager.getInstance();
        object2 = new ky0_2((CookieManager)object, this);
        object.removeAllCookies((ValueCallback)object2);
    }

    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.Z;
        if (webView != null) {
            webView.stopLoading();
        }
        if ((webView = this.Z) != null) {
            webView.destroy();
        }
    }

    public final void q1() {
        this.setResult(0);
        this.finish();
    }

    public final void t1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "rewardsUrl");
        Object object = AnalyticsUtil.Companion;
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("enable_my_rewards_status");
        object = ((AnalyticsUtil$Companion)object).mapperToMyRewardsOption((String)object2);
        object2 = null;
        String string3 = "https";
        boolean bl2 = b.s(string2, string3, false);
        if (!bl2) {
            object2 = UrlHelper.Companion.getInstance().getBaseUrl();
            string2 = Ft2.a((String)object2, string2);
        }
        if (object == null || (object = ((MyRewardsOption)object).getTitle()) == null) {
            object = "My Rewards";
        }
        MyRewardsWebActivity.Companion.getClass();
        MyRewardsWebActivity$a.a(16, this, string2, (String)object);
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

    public final void y2(String string2) {
        if (string2 != null) {
            Object[] objectArray;
            Object object = this.X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameWebViewModel");
                object = null;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter(string2, "url");
            CharSequence charSequence = new StringBuilder(string2);
            object = ((Iterable)((ly0_2)object).c).iterator();
            while (true) {
                boolean bl2 = object.hasNext();
                boolean bl3 = false;
                if (!bl2) break;
                objectArray = (Object[])object.next();
                boolean bl4 = StringsKt.F(string2, (CharSequence)objectArray, false);
                if (bl4) continue;
                String string3 = "?";
                bl3 = StringsKt.F(charSequence, string3, false);
                if (bl3) {
                    string3 = "&";
                }
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            string2 = ((StringBuilder)charSequence).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            object = yn3_0.a;
            charSequence = kp1_0.c("Game Url: ", string2);
            objectArray = new Object[]{};
            ((yn3$a)object).a((String)charSequence, objectArray);
            object = this.Z;
            if (object != null) {
                object.loadUrl(string2);
            }
        }
    }
}

