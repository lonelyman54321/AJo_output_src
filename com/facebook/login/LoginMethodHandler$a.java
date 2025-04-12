/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoginMethodHandler$a {
    public static AccessToken a(Bundle bundle, F1 f1, String string2) {
        Object object;
        int n3;
        Object object2 = bundle;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        long l2 = 0L;
        Object object3 = new Date(l2);
        Date date = lz3_0.o(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", (Date)object3);
        ArrayList arrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        object3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Object object4 = new Date(l2);
        Date date2 = lz3_0.o(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", (Date)object4);
        if (object3 != null && (n3 = ((String)object3).length()) != 0 && (object4 = bundle.getString((String)(object = "com.facebook.platform.extra.USER_ID"))) != null && (n3 = ((String)object4).length()) != 0) {
            String string3 = bundle.getString("graph_domain");
            Date date3 = new Date();
            object = object3;
            object2 = new AccessToken((String)object3, string2, (String)object4, arrayList, null, null, f1, date, date3, date2, string3);
            return object2;
        }
        return null;
    }

    public static AccessToken b(Collection stringArray, Bundle bundle, F1 f1, String string2) {
        Object object;
        int n3;
        Object object2;
        int n4;
        Object object3;
        int n7;
        Object object4 = bundle;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Object object5 = new Date();
        Object object6 = "expires_in";
        Date date = lz3_0.o(bundle, (String)object6, (Date)object5);
        String string3 = bundle.getString("access_token");
        int n8 = 0;
        object5 = null;
        if (string3 == null) {
            return null;
        }
        long l2 = 0L;
        object6 = new Date(l2);
        String string4 = "data_access_expiration_time";
        Date date2 = lz3_0.o(bundle, string4, (Date)object6);
        object6 = bundle.getString("granted_scopes");
        int n10 = 6;
        Object object7 = null;
        String[] stringArray2 = ",";
        if (object6 != null && (n7 = ((String)object6).length()) > 0) {
            object3 = new String[]{stringArray2};
            object6 = StringsKt.a0((CharSequence)object6, object3, false, 0, n10);
            object3 = new String[]{};
            object6 = object6.toArray((T[])object3);
            n7 = ((String[])object6).length;
            object6 = xx_2.d(Arrays.copyOf(object6, n7));
            object3 = object6;
        } else {
            object3 = stringArray;
        }
        object6 = bundle.getString("denied_scopes");
        if (object6 != null && (n4 = ((String)object6).length()) > 0) {
            object2 = new String[]{stringArray2};
            object6 = StringsKt.a0((CharSequence)object6, object2, false, 0, n10);
            object2 = new String[]{};
            object6 = object6.toArray((T[])object2);
            n4 = ((Object)object6).length;
            object6 = xx_2.d(Arrays.copyOf(object6, n4));
            object2 = object6;
        } else {
            n4 = 0;
            object2 = null;
        }
        object6 = bundle.getString("expired_scopes");
        if (object6 != null && (n3 = ((String)object6).length()) > 0) {
            stringArray2 = new String[]{stringArray2};
            object6 = StringsKt.a0((CharSequence)object6, stringArray2, false, 0, n10);
            stringArray2 = new String[]{};
            object6 = object6.toArray(stringArray2);
            int n14 = ((Object)object6).length;
            object6 = xx_2.d(Arrays.copyOf(object6, n14));
            object = object6;
        } else {
            n3 = 0;
            object = null;
        }
        int n15 = lz3_0.A(string3);
        if (n15 != 0) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        object5 = "signed_request";
        object4 = bundle.getString((String)object5);
        if (object4 != null && (n8 = object4.length()) != 0) {
            block25: {
                object5 = ".";
                object5 = new String[]{object5};
                object4 = StringsKt.a0((CharSequence)object4, object5, false, 0, n10);
                object4 = (Collection)object4;
                object5 = new String[]{};
                object4 = object4.toArray((T[])object5);
                object4 = (String[])object4;
                n8 = ((Object)object4).length;
                n15 = 2;
                if (n8 != n15) break block25;
                n8 = 1;
                object4 = object4[n8];
                object4 = Base64.decode((String)object4, (int)0);
                object6 = "data";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
                object6 = Charsets.UTF_8;
                object5 = new String((byte[])object4, (Charset)object6);
                object4 = new JSONObject((String)object5);
                object5 = "user_id";
                string4 = object4.getString((String)object5);
                object4 = "jsonObject.getString(\"user_id\")";
                try {
                    Intrinsics.checkNotNullExpressionValue(string4, (String)object4);
                    object5 = new Date();
                    object6 = object4;
                    object7 = object3;
                    stringArray2 = object2;
                    object3 = object;
                    object2 = f1;
                    object = object5;
                    object4 = new AccessToken(string3, string2, string4, (Collection)object7, (Collection)stringArray2, (Collection)object3, f1, date, (Date)object5, date2, string5);
                    return object4;
                }
                catch (UnsupportedEncodingException | JSONException throwable) {}
            }
            object4 = new FacebookException("Failed to retrieve user_id from signed_request");
            throw object4;
        }
        object4 = new FacebookException("Authorization response does not contain the signed_request");
        throw object4;
    }

    public static AuthenticationToken c(Bundle object, String object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "bundle");
        Object object3 = "id_token";
        object = object.getString((String)object3);
        if (object != null && (n3 = ((String)object).length()) != 0 && object2 != null && (n3 = ((String)object2).length()) != 0) {
            try {
                object3 = new AuthenticationToken((String)object, (String)object2);
            }
            catch (Exception exception) {
                object3 = exception.getMessage();
                object2 = new RuntimeException((String)object3, exception);
                throw object2;
            }
        } else {
            n3 = 0;
            object3 = null;
        }
        return object3;
    }
}

