/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.affise.attribution.utils;

import android.net.Uri;
import com.affise.attribution.referrer.ReferrerKey;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerKt {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String getReferrerValue(String string2, ReferrerKey object) {
        StringBuilder stringBuilder;
        String string3 = "https://referrer/?";
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = null;
        if (object == null) {
            return null;
        }
        try {
            stringBuilder = new StringBuilder(string3);
        }
        catch (Exception exception) {
            return string4;
        }
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        string2 = Uri.parse((String)string2);
        String string5 = ((ReferrerKey)((Object)object)).getType();
        return string2.getQueryParameter(string5);
    }
}

