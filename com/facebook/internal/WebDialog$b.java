/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.Bundle
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.facebook.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.WebDialog;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class WebDialog$b
extends WebViewClient {
    public final /* synthetic */ WebDialog a;

    public WebDialog$b(WebDialog webDialog) {
        this.a = webDialog;
    }

    public final void onPageFinished(WebView object, String object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        String string2 = "url";
        Intrinsics.checkNotNullParameter(object2, string2);
        super.onPageFinished(object, object2);
        object = this.a;
        boolean bl2 = object.j;
        if (!bl2 && (object2 = object.e) != null) {
            object2.dismiss();
        }
        object2 = object.g;
        string2 = null;
        if (object2 != null) {
            object2.setBackgroundColor(0);
        }
        if ((object2 = object.d) != null) {
            object2.setVisibility(0);
        }
        object2 = object.f;
        if (object2 != null) {
            object2.setVisibility(0);
        }
        object.k = true;
    }

    public final void onPageStarted(WebView object, String string2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(string2, "url");
        super.onPageStarted(object, string2, bitmap);
        object = this.a;
        boolean bl2 = object.j;
        if (!bl2 && (object = object.e) != null) {
            object.show();
        }
    }

    public final void onReceivedError(WebView object, int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(string3, "failingUrl");
        super.onReceivedError(object, n3, string2, string3);
        object = new FacebookDialogException(string2, n3, string3);
        this.a.e((Exception)object);
    }

    public final void onReceivedSslError(WebView object, SslErrorHandler sslErrorHandler, SslError sslError) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(sslErrorHandler, "handler");
        Intrinsics.checkNotNullParameter(sslError, "error");
        super.onReceivedSslError(object, sslErrorHandler, sslError);
        sslErrorHandler.cancel();
        object = new FacebookDialogException(null, -11, null);
        this.a.e((Exception)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean shouldOverrideUrlLoading(WebView object, String object2) {
        String string2;
        int n3;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object3, "url");
        lz3_0 lz3_02 = lz3_0.a;
        FacebookSdk facebookSdk = FacebookSdk.a;
        Uri uri = Uri.parse((String)object3);
        Object object4 = uri.getPath();
        boolean bl2 = false;
        String string3 = null;
        boolean bl3 = true;
        if (object4 != null && (n3 = Pattern.matches((String)(object4 = "^/(v\\d+\\.\\d+/)??dialog/.*"), string2 = uri.getPath())) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            Object var1_7 = null;
        }
        object4 = this.a;
        String string4 = ((WebDialog)((Object)object4)).b;
        int n4 = b.s((String)object3, string4, false);
        if (n4 != 0) {
            String string5;
            String string6;
            boolean bl4;
            Bundle bundle = ((WebDialog)((Object)object4)).c((String)object3);
            if ((object3 = bundle.getString("error")) == null) {
                object3 = bundle.getString("error_type");
            }
            if ((string3 = bundle.getString("error_msg")) == null) {
                string3 = bundle.getString("error_message");
            }
            if (string3 == null) {
                string3 = bundle.getString("error_description");
            }
            string4 = bundle.getString("error_code");
            int n7 = -1;
            if (string4 != null && !(bl4 = lz3_0.A(string4))) {
                try {
                    n4 = Integer.parseInt(string4);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            n4 = -1;
            bl4 = lz3_0.A((String)object3);
            if (bl4 && (bl4 = lz3_0.A(string3)) && n4 == n7) {
                object3 = ((WebDialog)((Object)object4)).c;
                if (object3 == null) return bl3;
                bl2 = ((WebDialog)((Object)object4)).i;
                if (bl2) return bl3;
                ((WebDialog)((Object)object4)).i = bl3;
                bl2 = false;
                string3 = null;
                object3.a(bundle, null);
                ((WebDialog)((Object)object4)).dismiss();
                return bl3;
            }
            if (object3 != null && ((n3 = (int)(Intrinsics.areEqual(object3, string6 = "access_denied") ? 1 : 0)) != 0 || (n3 = (int)(Intrinsics.areEqual(object3, string5 = "OAuthAccessDeniedException") ? 1 : 0)) != 0)) {
                ((WebDialog)((Object)object4)).cancel();
                return bl3;
            }
            n3 = 4201;
            if (n4 == n3) {
                ((WebDialog)((Object)object4)).cancel();
                return bl3;
            }
            FacebookRequestError facebookRequestError = new FacebookRequestError(n4, (String)object3, string3);
            object3 = new FacebookServiceException(facebookRequestError, string3);
            ((WebDialog)((Object)object4)).e((Exception)object3);
            return bl3;
        }
        string4 = "fbconnect://cancel";
        n4 = b.s((String)object3, string4, false);
        if (n4 != 0) {
            ((WebDialog)((Object)object4)).cancel();
            return bl3;
        }
        if (n3 != 0) return bl2;
        String string7 = "touch";
        n3 = StringsKt.F((CharSequence)object3, string7, false);
        if (n3 != 0) {
            return bl2;
        }
        try {
            Context context = object4.getContext();
            string4 = "android.intent.action.VIEW";
            object3 = Uri.parse((String)object3);
            object4 = new Intent(string4, (Uri)object3);
            context.startActivity((Intent)object4);
            return true;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return bl2;
        }
    }
}

