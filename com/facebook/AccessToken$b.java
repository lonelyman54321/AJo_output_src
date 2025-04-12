/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.facebook;

import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AccessToken$b {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static AccessToken a(JSONObject object) {
        AccessToken accessToken;
        void var8_12;
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        Object object2 = "version";
        int n3 = object.getInt((String)object2);
        int n4 = 1;
        if (n3 > n4) {
            FacebookException facebookException = new FacebookException("Unknown AccessToken serialization format.");
            throw facebookException;
        }
        object2 = "token";
        String string2 = object.getString((String)object2);
        long l2 = object.getLong("expires_at");
        Date date = new Date(l2);
        JSONArray jSONArray = object.getJSONArray("permissions");
        JSONArray jSONArray2 = object.getJSONArray("declined_permissions");
        JSONArray jSONArray3 = object.optJSONArray("expired_permissions");
        long l3 = object.getLong("last_refresh");
        Date date2 = new Date(l3);
        Object object3 = object.getString("source");
        Intrinsics.checkNotNullExpressionValue(object3, "jsonObject.getString(SOURCE_KEY)");
        F1 f1 = F1.valueOf((String)object3);
        object3 = object.getString("application_id");
        Object object4 = object.getString("user_id");
        long l4 = object.optLong("data_access_expiration_time", 0L);
        Date date3 = new Date(l4);
        String string3 = object.optString("graph_domain", null);
        Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
        Intrinsics.checkNotNullExpressionValue(object3, "applicationId");
        Intrinsics.checkNotNullExpressionValue(object4, "userId");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "permissionsArray");
        object2 = lz3_0.C(jSONArray);
        String string4 = "declinedPermissionsArray";
        Intrinsics.checkNotNullExpressionValue(jSONArray2, string4);
        ArrayList arrayList = lz3_0.C(jSONArray2);
        if (jSONArray3 == null) {
            ArrayList arrayList2 = new ArrayList();
        } else {
            ArrayList arrayList3 = lz3_0.C(jSONArray3);
        }
        void var22_28 = var8_12;
        AccessToken accessToken2 = accessToken;
        String string5 = object3;
        String string6 = object4;
        object3 = object2;
        object4 = arrayList;
        arrayList = var22_28;
        return new AccessToken(string2, string5, string6, (Collection)object2, (Collection)object4, (Collection)var22_28, f1, date, date2, date3, string3);
    }

    public static AccessToken b() {
        return b.f.a().c;
    }

    public static boolean c() {
        Date date;
        boolean bl2;
        Object object = b.f.a().c;
        if (object != null && !(bl2 = (date = new Date()).after((Date)(object = ((AccessToken)object).a)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static void d(AccessToken accessToken) {
        b.f.a().c(accessToken, true);
    }
}

