/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.facebook.appevents.codeless;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.codeless.b;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class ViewIndexer$a {
    public static GraphRequest a(String object, AccessToken object2, String string2) {
        String string3 = null;
        int n3 = 1;
        String string4 = "app_indexing";
        Intrinsics.checkNotNullParameter(string4, "requestType");
        if (object == null) {
            return null;
        }
        Object object3 = GraphRequest.j;
        object3 = StringCompanionObject.INSTANCE;
        object3 = Locale.US;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string5 = "format(locale, format, *args)";
        string2 = IV0.a(objectArray, n3, (Locale)object3, "%s/app_indexing", string5);
        object2 = GraphRequest$c.i((AccessToken)object2, string2, null, null);
        string2 = ((GraphRequest)object2).d;
        if (string2 == null) {
            string2 = new Bundle();
        }
        String string6 = "tree";
        string2.putString(string6, (String)object);
        int n4 = tn_0.a;
        object = FacebookSdk.a();
        string6 = object.getPackageManager();
        object = object.getPackageName();
        object = string6.getPackageInfo((String)object, 0);
        object = ((PackageInfo)object).versionName;
        string3 = "{\n      val packageInfo \u2026ageInfo.versionName\n    }";
        try {
            Intrinsics.checkNotNullExpressionValue(object, string3);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = "";
        }
        string2.putString("app_version", (String)object);
        string3 = "android";
        string2.putString("platform", string3);
        object = "request_type";
        string2.putString((String)object, string4);
        n4 = (int)(Intrinsics.areEqual(string4, string4) ? 1 : 0);
        if (n4 != 0) {
            object = "device_session_id";
            string3 = b.a();
            string2.putString((String)object, string3);
        }
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        ((GraphRequest)object2).d = string2;
        object = new Object();
        ((GraphRequest)object2).j((GraphRequest$b)object);
        return object2;
    }
}

