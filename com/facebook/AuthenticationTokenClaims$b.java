/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.facebook;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AuthenticationTokenClaims$b {
    public static String a(String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            return jSONObject.getString(string2);
        }
        return null;
    }
}

