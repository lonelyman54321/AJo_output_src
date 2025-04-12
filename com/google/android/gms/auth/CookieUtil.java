/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String string2, Boolean object) {
        Preconditions.checkNotEmpty(string2);
        boolean bl2 = true;
        boolean bl3 = CookieUtil.zza((Boolean)object);
        object = bl2 != bl3 ? "http" : "https";
        return n1.a((String)object, "://", string2);
    }

    public static String getCookieValue(String string2, String string3, String string4, String string5, Boolean bl2, Boolean bl3, Long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        if (string2 == null) {
            string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append('=');
        boolean bl4 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl4) {
            stringBuilder.append(string3);
        }
        if (bl4 = CookieUtil.zza(bl2)) {
            string2 = ";HttpOnly";
            stringBuilder.append(string2);
        }
        if (bl4 = CookieUtil.zza(bl3)) {
            string2 = ";Secure";
            stringBuilder.append(string2);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)string4))) {
            string2 = ";Domain=";
            stringBuilder.append(string2);
            stringBuilder.append(string4);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)string5))) {
            string2 = ";Path=";
            stringBuilder.append(string2);
            stringBuilder.append(string5);
        }
        if (l2 != null && (l8 = (l7 = (l4 = l2.longValue()) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
            string2 = ";Max-Age=";
            stringBuilder.append(string2);
            stringBuilder.append(l2);
        }
        bl4 = false;
        string2 = null;
        boolean bl5 = TextUtils.isEmpty(null);
        if (!bl5) {
            string3 = ";Priority=null";
            stringBuilder.append(string3);
        }
        if (!(bl5 = TextUtils.isEmpty(null))) {
            string3 = ";SameSite=null";
            stringBuilder.append(string3);
        }
        if (bl4 = CookieUtil.zza(null)) {
            string2 = ";SameParty";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private static boolean zza(Boolean bl2) {
        boolean bl3;
        return bl2 != null && (bl3 = bl2.booleanValue());
    }
}

