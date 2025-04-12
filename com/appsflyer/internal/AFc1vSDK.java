/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class AFc1vSDK {
    public static final String getCurrencyIso4217Code(String object) {
        int n3 = 1;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = messageDigest.digest((byte[])object);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n4 = ((Object)object).length;
        charset = null;
        String string3 = string2;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object2 = object[i3];
            Object object3 = (byte)object2;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object3;
            object3 = xh2_0.a(objectArray, n3, "%02x", string2);
            string3 = Ft2.a(string3, (String)object3);
        }
        return string3;
    }

    public static final int getMonetizationNetwork(String object) {
        Intrinsics.checkNotNullParameter(object, "");
        String string2 = "(\\d+).(\\d+).(\\d+).*";
        Object object2 = new Regex(string2);
        object = ((Regex)object2).b((CharSequence)object);
        if (object != null) {
            int n3 = 1;
            object = ((oh1_1)object).c;
            object2 = ((oH1$b)object).c(n3);
            int n4 = 0;
            string2 = null;
            if (object2 != null && (object2 = ((MatchGroup)object2).a) != null && (object2 = StringsKt.toIntOrNull((String)object2)) != null) {
                n3 = ((Number)object2).intValue();
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 *= 1000000;
            int n7 = 2;
            Object object3 = ((oH1$b)object).c(n7);
            if (object3 != null && (object3 = ((MatchGroup)object3).a) != null && (object3 = StringsKt.toIntOrNull((String)object3)) != null) {
                n7 = ((Number)object3).intValue();
            } else {
                n7 = 0;
                object3 = null;
            }
            n7 = n7 * 1000 + n3;
            n3 = 3;
            object = ((oH1$b)object).c(n3);
            if (object != null && (object = ((MatchGroup)object).a) != null && (object = StringsKt.toIntOrNull((String)object)) != null) {
                n4 = ((Number)object).intValue();
            }
            return n7 + n4;
        }
        return -1;
    }
}

