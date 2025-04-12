/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.AppEventsLogger$a;
import com.facebook.applinks.AppLinkData$1;
import com.ril.ajio.AJIOApplication;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public static final /* synthetic */ int d;
    public Uri a;
    public JSONObject b;
    public Bundle c;

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static void a(Context var0, String var1_2, W9 var2_3) {
        block19: {
            var3_4 /* !! */  = new JSONObject();
            var4_5 = "event";
            var5_6 = "DEFERRED_APP_LINK";
            try {
                var3_4 /* !! */ .put((String)var4_5, (Object)var5_6);
                var4_5 = Zq$a.a((Context)var0);
                var5_6 = AppEventsLogger$a.a((Context)var0);
                var6_7 = FacebookSdk.g((Context)var0);
                lz3_0.M(var3_4 /* !! */ , (zq_0)var4_5, var5_6, var6_7, (Context)var0);
                var4_5 = FacebookSdk.a();
                lz3_0.N((Context)var4_5, var3_4 /* !! */ );
                var4_5 = "application_package_name";
                var0 = var0.getPackageName();
                var3_4 /* !! */ .put((String)var4_5, var0);
                var0 = var1_2.concat("/activities");
                var1_2 = null;
            }
            catch (JSONException var0_1) {
                var1_2 = new RuntimeException("An error occurred while preparing deferred app link", var0_1);
                throw var1_2;
            }
            var4_5 = GraphRequest.j;
            var0 = GraphRequest$c.i(null, (String)var0, var3_4 /* !! */ , null);
            var0 = var0.c();
            var0 = var0.b;
            if (var0 == null) break block19;
            var3_4 /* !! */  = "applink_args";
            var3_4 /* !! */  = var0.optString((String)var3_4 /* !! */ );
            var4_5 = "click_time";
            var7_8 = -1;
            var9_9 = var0.optLong((String)var4_5, var7_8);
            var4_5 = "applink_class";
            var4_5 = var0.optString((String)var4_5);
            var11_10 = "applink_url";
            var0 = var0.optString(var11_10);
            var12_11 = TextUtils.isEmpty((CharSequence)var3_4 /* !! */ );
            if (var12_11 || (var1_2 = com.facebook.applinks.a.b((String)var3_4 /* !! */ )) == null) break block19;
            var13_12 /* !! */  = (long)(var9_9 == var7_8 ? 0 : (var9_9 < var7_8 ? -1 : 1));
            if (var13_12 /* !! */  == false) ** GOTO lbl54
            try {
                var3_4 /* !! */  = var1_2.b;
                var5_6 = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
                if (var3_4 /* !! */  != null) {
                    var3_4 /* !! */ .put(var5_6, var9_9);
                }
                if ((var3_4 /* !! */  = var1_2.c) != null) {
                    var14_13 = Long.toString(var9_9);
                    var3_4 /* !! */ .putString(var5_6, var14_13);
                }
                ** GOTO lbl54
            }
            catch (JSONException v0) {
                var3_4 /* !! */  = FacebookSdk.a;
lbl54:
                // 3 sources

                if (var4_5 == null) ** GOTO lbl67
                try {
                    var3_4 /* !! */  = var1_2.b;
                    var5_6 = "com.facebook.platform.APPLINK_NATIVE_CLASS";
                    if (var3_4 /* !! */  != null) {
                        var3_4 /* !! */ .put(var5_6, var4_5);
                    }
                    if ((var3_4 /* !! */  = var1_2.c) != null) {
                        var3_4 /* !! */ .putString(var5_6, (String)var4_5);
                    }
                    ** GOTO lbl67
                }
                catch (JSONException v1) {
                    var3_4 /* !! */  = FacebookSdk.a;
lbl67:
                    // 3 sources

                    if (var0 == null) break block19;
                    try {
                        var3_4 /* !! */  = var1_2.b;
                        var4_5 = "com.facebook.platform.APPLINK_NATIVE_URL";
                        if (var3_4 /* !! */  != null) {
                            var3_4 /* !! */ .put((String)var4_5, var0);
                        }
                        if ((var3_4 /* !! */  = var1_2.c) != null) {
                            var3_4 /* !! */ .putString((String)var4_5, (String)var0);
                        }
                    }
                    catch (JSONException v2) {
                        try {
                            var0 = FacebookSdk.a;
                        }
                        catch (Exception v3) {
                            var0 = FacebookSdk.a;
                        }
                    }
                }
            }
        }
        var2_3.b((a)var1_2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b(String var0) {
        var1_1 = "promo_code";
        var2_2 = "deeplink_context";
        var3_3 = "extras";
        var4_4 = "target_url";
        var5_6 = "fb_ref";
        var6_7 = "referer_data";
        var7_8 = "ref";
        if (var0 == null) {
            return null;
        }
        var8_9 = new JSONObject((String)var0);
        var0 = "version";
        var0 = var8_9.getString((String)var0);
        var9_10 = "bridge_args";
        var9_10 = var8_9.getJSONObject(var9_10);
        var10_11 = "method";
        var9_10 = var9_10.getString(var10_11);
        var10_11 = "applink";
        var11_12 = var9_10.equals(var10_11);
        if (var11_12 == false) return null;
        var9_10 = "2";
        var12_13 = var0.equals(var9_10);
        if (var12_13 == false) return null;
        var0 = new a();
        var9_10 = "method_args";
        var0.b = var8_9 = var8_9.getJSONObject(var9_10);
        var13_14 = var8_9.has(var7_8);
        if (var13_14) {
            var5_6 = var0.b;
            var5_6.getString(var7_8);
        } else {
            var7_8 = var0.b;
            var14_15 = var7_8.has(var6_7);
            if (var14_15 && (var14_15 = (var6_7 = (var7_8 = var0.b).getJSONObject(var6_7)).has((String)var5_6))) {
                var6_7.getString((String)var5_6);
            }
        }
        var5_6 = var0.b;
        var15_16 = var5_6.has(var4_4);
        if (!var15_16) ** GOTO lbl68
        var5_6 = var0.b;
        var4_4 = var5_6.getString(var4_4);
        var4_4 = Uri.parse((String)var4_4);
        var0.a = var4_4;
        var5_6 = a.class;
        var16_17 = td0.b(var5_6);
        if (var16_17 || var4_4 == null) ** GOTO lbl68
        var6_7 = "al_applink_data";
        try {
            var4_4 = var4_4.getQueryParameter(var6_7);
            if (var4_4 == null) ** GOTO lbl68
            var6_7 = new JSONObject(var4_4);
            ** GOTO lbl68
        }
        catch (Throwable var4_5) {
            block13: {
                try {
                    td0.a(var5_6, var4_5);
                    break block13;
                }
                catch (FacebookException v0) {
                    var0 = lz3_0.a;
                    var0 = FacebookSdk.a;
                    return null;
                }
                catch (JSONException v1) {
                    var0 = lz3_0.a;
                    var0 = FacebookSdk.a;
                }
                return null;
                catch (JSONException v2) {}
            }
            if ((var17_18 = (var4_4 = var0.b).has(var3_3)) && (var17_18 = (var3_3 = (var4_4 = var0.b).getJSONObject(var3_3)).has(var2_2)) && (var18_19 = (var2_2 = var3_3.getJSONObject(var2_2)).has(var1_1))) {
                var2_2.getString(var1_1);
            }
            var1_1 = var0.b;
            var1_1 = com.facebook.applinks.a.d((JSONObject)var1_1);
            var0.c = var1_1;
        }
        return var0;
    }

    public static void c(AJIOApplication aJIOApplication, W9 w9) {
        String string2 = "context";
        Xz3.f(aJIOApplication, string2);
        Object object = "name";
        Intrinsics.checkNotNullParameter("completionHandler", (String)object);
        Object object2 = lz3_0.a;
        Xz3.f(aJIOApplication, string2);
        string2 = FacebookSdk.b();
        Intrinsics.checkNotNullParameter("applicationId", (String)object);
        aJIOApplication = aJIOApplication.getApplicationContext();
        object2 = FacebookSdk.d();
        object = new AppLinkData$1((Context)aJIOApplication, string2, w9);
        object2.execute((Runnable)object);
    }

    public static Bundle d(JSONObject object) {
        boolean bl2;
        Bundle bundle = new Bundle();
        Iterator iterator = object.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String[] stringArray = object.get(string2);
            int n3 = stringArray instanceof JSONObject;
            if (n3 != 0) {
                stringArray = com.facebook.applinks.a.d((JSONObject)stringArray);
                bundle.putBundle(string2, (Bundle)stringArray);
                continue;
            }
            n3 = stringArray instanceof JSONArray;
            if (n3 != 0) {
                Object object2;
                int n4;
                stringArray = (JSONArray)stringArray;
                n3 = stringArray.length();
                if (n3 == 0) {
                    stringArray = new String[]{};
                    bundle.putStringArray(string2, stringArray);
                    continue;
                }
                Object[] objectArray = stringArray.get(0);
                int n7 = objectArray instanceof JSONObject;
                if (n7 != 0) {
                    n3 = stringArray.length();
                    objectArray = new Bundle[n3];
                    for (n4 = 0; n4 < (n7 = stringArray.length()); ++n4) {
                        objectArray[n4] = object2 = com.facebook.applinks.a.d(stringArray.getJSONObject(n4));
                    }
                    bundle.putParcelableArray(string2, (Parcelable[])objectArray);
                    continue;
                }
                n3 = objectArray instanceof JSONArray;
                if (n3 == 0) {
                    n3 = stringArray.length();
                    objectArray = new String[n3];
                    while (n4 < (n7 = stringArray.length())) {
                        objectArray[n4] = object2 = stringArray.get(n4).toString();
                        ++n4;
                    }
                    bundle.putStringArray(string2, (String[])objectArray);
                    continue;
                }
                object = new FacebookException("Nested arrays are not supported.");
                throw object;
            }
            stringArray = stringArray.toString();
            bundle.putString(string2, (String)stringArray);
        }
        return bundle;
    }
}

