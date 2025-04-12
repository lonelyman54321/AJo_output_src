/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class AFe1zSDK {
    public static final String AFAdRevenueData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        StringBuilder stringBuilder = new StringBuilder("[Exception Manager]: ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static boolean AFAdRevenueData(Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "");
        boolean bl2 = tp_2.w(objectArray, null);
        return !bl2;
    }

    public static final Pair getCurrencyIso4217Code(String object) {
        int n3 = 6;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        int n14 = 1;
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = "(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)";
        Regex regex = new Regex((String)object2);
        object = regex.b((CharSequence)object);
        regex = null;
        if (object != null) {
            object = ((oh1_1)object).c;
            object2 = ((oH1$b)object).c(n14);
            object2 = object2 != null && (object2 = ((MatchGroup)object2).a) != null ? StringsKt.toIntOrNull((String)object2) : null;
            Object object3 = ((oH1$b)object).c(n10);
            object3 = object3 != null && (object3 = ((MatchGroup)object3).a) != null ? StringsKt.toIntOrNull((String)object3) : null;
            Object object4 = ((oH1$b)object).c(n8);
            object4 = object4 != null && (object4 = ((MatchGroup)object4).a) != null ? StringsKt.toIntOrNull((String)object4) : null;
            Object object5 = ((oH1$b)object).c(n7);
            object5 = object5 != null && (object5 = ((MatchGroup)object5).a) != null ? StringsKt.toIntOrNull((String)object5) : null;
            Object object6 = ((oH1$b)object).c(n4);
            object6 = object6 != null && (object6 = ((MatchGroup)object6).a) != null ? StringsKt.toIntOrNull((String)object6) : null;
            object = ((oH1$b)object).c(n3);
            object = object != null && (object = ((MatchGroup)object).a) != null ? StringsKt.toIntOrNull((String)object) : null;
            Object object7 = new Object[n3];
            object7[0] = object2;
            object7[n14] = object3;
            object7[n10] = object4;
            object7[n8] = object5;
            object7[n7] = object6;
            object7[n4] = object;
            n3 = (int)(AFe1zSDK.AFAdRevenueData(object7) ? 1 : 0);
            if (n3 != 0) {
                Intrinsics.checkNotNull(object2);
                n3 = ((Number)object2).intValue();
                n4 = 1000000;
                Intrinsics.checkNotNull(object3);
                n7 = ((Number)object3).intValue() * 1000 + (n3 *= n4);
                Intrinsics.checkNotNull(object4);
                object7 = ((Number)object4).intValue() + n7;
                Intrinsics.checkNotNull(object5);
                n7 = ((Number)object5).intValue() * n4;
                Intrinsics.checkNotNull(object6);
                n4 = ((Number)object6).intValue() * 1000 + n7;
                Intrinsics.checkNotNull(object);
                object = ((Number)object).intValue() + n4;
                Pair pair = new Pair(object7, object);
                return pair;
            }
        }
        return null;
    }

    public static final String getRevenue(String object, String object2) {
        int n3 = 1;
        object2 = MessageDigest.getInstance((String)object2);
        Object object3 = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)object3);
        object3 = "";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = ((MessageDigest)object2).digest((byte[])object);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        int n4 = ((Object)object).length;
        Object object4 = object3;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object5 = object[i3];
            Object object6 = (byte)object5;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object6;
            object6 = xh2_0.a(objectArray, n3, "%02x", (String)object3);
            object4 = Ft2.a((String)object4, (String)object6);
        }
        return object4;
    }

    public static final Pair getRevenue(String object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = "^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$";
        Serializable serializable = new Regex((String)object2);
        object = serializable.b((CharSequence)object);
        int n3 = 0;
        serializable = null;
        if (object != null) {
            int n4;
            object = ((oh1_1)object).c;
            int n7 = 1;
            Object object3 = ((oH1$b)object).c(n7);
            if (object3 != null && (object3 = ((MatchGroup)object3).a) != null) {
                object3 = StringsKt.toIntOrNull((String)object3);
            } else {
                n4 = 0;
                object3 = null;
            }
            int n8 = 3;
            Object object4 = ((oH1$b)object).c(n8);
            if (object4 != null && (object4 = ((MatchGroup)object4).a) != null) {
                object4 = StringsKt.toIntOrNull((String)object4);
            } else {
                n8 = 0;
                object4 = null;
            }
            int n10 = 4;
            object = ((oH1$b)object).c(n10);
            object = object != null && (object = ((MatchGroup)object).a) != null ? StringsKt.toIntOrNull((String)object) : null;
            n10 = 1000000;
            if (object3 != null) {
                object = ((Number)object3).intValue() * n10;
                serializable = Integer.valueOf((((Number)object3).intValue() + n7) * n10 - n7);
                object2 = new Pair(object, serializable);
                return object2;
            }
            if (object4 != null && object != null) {
                n3 = ((Number)object4).intValue() * n10;
                serializable = Integer.valueOf(((Number)object).intValue() * 1000 + n3);
                n4 = ((Number)object4).intValue() * n10;
                object = (((Number)object).intValue() + n7) * 1000 + n4 - n7;
                object2 = new Pair(serializable, object);
                return object2;
            }
        }
        return null;
    }
}

