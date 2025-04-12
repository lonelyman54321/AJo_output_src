/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.facebook.login;

import com.facebook.login.DeviceAuthDialog$b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class DeviceAuthDialog$a {
    public static final DeviceAuthDialog$b a(JSONObject object) {
        object = object.getJSONObject("permissions").getJSONArray("data");
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<String> arrayList3 = new ArrayList<String>();
        int n3 = object.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            int n4;
            Object object2 = object.optJSONObject(i3);
            String string2 = "permission";
            String string3 = object2.optString(string2);
            Intrinsics.checkNotNullExpressionValue(string3, string2);
            int n7 = string3.length();
            if (n7 == 0 || (n7 = (int)(Intrinsics.areEqual(string3, string2 = "installed") ? 1 : 0)) != 0 || (object2 = object2.optString(string2 = "status")) == null) continue;
            n7 = ((String)object2).hashCode();
            if (n7 != (n4 = -1309235419)) {
                n4 = 280295099;
                if (n7 != n4) {
                    n4 = 568196142;
                    if (n7 != n4 || !(bl2 = ((String)object2).equals(string2 = "declined"))) continue;
                    arrayList2.add(string3);
                    continue;
                }
                string2 = "granted";
                bl2 = ((String)object2).equals(string2);
                if (!bl2) continue;
                arrayList.add(string3);
                continue;
            }
            string2 = "expired";
            bl2 = ((String)object2).equals(string2);
            if (!bl2) continue;
            arrayList3.add(string3);
        }
        Intrinsics.checkNotNullParameter(arrayList, "grantedPermissions");
        Intrinsics.checkNotNullParameter(arrayList2, "declinedPermissions");
        Intrinsics.checkNotNullParameter(arrayList3, "expiredPermissions");
        object = new Object();
        object.a = arrayList;
        object.b = arrayList2;
        object.c = arrayList3;
        return object;
    }
}

