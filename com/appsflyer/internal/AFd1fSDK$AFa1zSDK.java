/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.internal.AFd1fSDK;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class AFd1fSDK$AFa1zSDK {
    private AFd1fSDK$AFa1zSDK() {
    }

    public /* synthetic */ AFd1fSDK$AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static AFd1fSDK getMediationNetwork(String object) {
        boolean bl2;
        boolean bl3;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = new String[]{"\n"};
        object = StringsKt.a0((CharSequence)object, object2, false, 0, 6);
        int n3 = object.size();
        int n4 = 4;
        if (n3 != n4) {
            return null;
        }
        object = object.iterator();
        n3 = 0;
        object2 = null;
        n4 = 0;
        String string3 = null;
        String string4 = null;
        int n7 = 0;
        Object object3 = null;
        while (bl3 = object.hasNext()) {
            String string5;
            String string6 = (String)object.next();
            boolean bl4 = b.s(string6, string5 = "label=", false);
            if (bl4) {
                object2 = AFd1fSDK$AFa1zSDK.getMonetizationNetwork(string6, string5);
                continue;
            }
            string5 = "hashName=";
            bl4 = b.s(string6, string5, false);
            if (bl4) {
                string3 = AFd1fSDK$AFa1zSDK.getMonetizationNetwork(string6, string5);
                continue;
            }
            string5 = "stackTrace=";
            bl4 = b.s(string6, string5, false);
            if (bl4) {
                string4 = AFd1fSDK$AFa1zSDK.getMonetizationNetwork(string6, string5);
                continue;
            }
            string5 = "c=";
            boolean bl5 = b.s(string6, string5, false);
            if (!bl5) break;
            object3 = string6.substring(2);
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            n7 = Integer.parseInt(((Object)StringsKt.m0((CharSequence)object3)).toString());
            object3 = n7;
        }
        if (bl2 = AFd1fSDK$AFa1zSDK.getMediationNetwork(object3, object = new String[]{object2, string3, string4})) {
            return null;
        }
        Intrinsics.checkNotNull(object2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNull(object3);
        int n8 = ((Number)object3).intValue();
        object = new AFd1fSDK((String)object2, string3, string4, n8);
        return object;
    }

    private static boolean getMediationNetwork(Integer n3, String ... stringArray) {
        int n4;
        int n7;
        if (n3 == null) {
            n7 = 1;
        } else {
            n7 = 0;
            n3 = null;
        }
        int n8 = stringArray.length;
        for (n8 = 0; n8 < (n4 = 3); ++n8) {
            String string2 = stringArray[n8];
            if (n7 == 0 && string2 != null && (n7 = string2.length()) != 0) {
                n7 = 0;
                n3 = null;
                continue;
            }
            n7 = 1;
        }
        return n7 != 0;
    }

    private static String getMonetizationNetwork(String object, String string2) {
        int n3 = string2.length();
        object = ((String)object).substring(n3);
        string2 = "";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = ((Object)StringsKt.m0((CharSequence)object)).toString();
        Intrinsics.checkNotNullParameter(object, string2);
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        object = Base64.decode((byte[])object, (int)2);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        string2 = new String((byte[])object, charset);
        return string2;
    }
}

