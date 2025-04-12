/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog$setUpWebView$1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
extends WebDialog {
    public static final /* synthetic */ int p;
    public boolean o;

    public static void g(b b2) {
        Intrinsics.checkNotNullParameter((Object)b2, "this$0");
        super.cancel();
    }

    public final Bundle c(String string2) {
        string2 = lz3_0.F(Uri.parse((String)string2).getQuery());
        Object object = "bridge_args";
        String string3 = string2.getString((String)object);
        string2.remove((String)object);
        boolean bl2 = lz3_0.A(string3);
        if (!bl2) {
            object = new JSONObject(string3);
            object = ce_0.a((JSONObject)object);
            string3 = "com.facebook.platform.protocol.BRIDGE_ARGS";
            try {
                string2.putBundle(string3, (Bundle)object);
            }
            catch (JSONException jSONException) {
                object = FacebookSdk.a;
            }
        }
        object = "method_results";
        string3 = string2.getString((String)object);
        string2.remove((String)object);
        bl2 = lz3_0.A(string3);
        if (!bl2) {
            object = new JSONObject(string3);
            object = ce_0.a((JSONObject)object);
            string3 = "com.facebook.platform.protocol.RESULT_ARGS";
            try {
                string2.putBundle(string3, (Bundle)object);
            }
            catch (JSONException jSONException) {
                object = FacebookSdk.a;
            }
        }
        string2.remove("version");
        int n3 = os1_1.l();
        string2.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", n3);
        return string2;
    }

    public final void cancel() {
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.d;
        boolean bl2 = this.k;
        if (bl2 && !(bl2 = this.i) && webDialog$setUpWebView$1 != null && (bl2 = webDialog$setUpWebView$1.isShown())) {
            bl2 = this.o;
            if (bl2) {
                return;
            }
            this.o = true;
            webDialog$setUpWebView$1.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            Object object = Looper.getMainLooper();
            webDialog$setUpWebView$1 = new Handler(object);
            object = new ci0_0((Object)this, 0);
            webDialog$setUpWebView$1.postDelayed((Runnable)object, 1500L);
            return;
        }
        super.cancel();
    }
}

