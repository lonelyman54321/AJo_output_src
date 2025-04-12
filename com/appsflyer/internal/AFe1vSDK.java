/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFe1zSDK;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1vSDK {
    public static boolean getMonetizationNetwork(String string2, String object) {
        int n3;
        Object object2 = "";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = AFc1vSDK.getMonetizationNetwork(string2);
        int n7 = AFc1vSDK.getMonetizationNetwork((String)object);
        Pair pair = AFe1zSDK.getCurrencyIso4217Code((String)object);
        object = AFe1zSDK.getRevenue((String)object);
        int n8 = -1;
        boolean bl2 = true;
        if (n7 != n8 && pair == null) {
            if (n7 == n4) {
                return bl2;
            }
            return false;
        }
        if (object != null) {
            int n10;
            object2 = (Number)((Pair)object).a;
            n7 = ((Number)object2).intValue();
            if (n7 <= n4 && n4 <= (n10 = ((Number)(object = (Number)((Pair)object).b)).intValue())) {
                return bl2;
            }
            return false;
        }
        if (pair != null && (n3 = ((Number)(object = (Number)pair.a)).intValue()) <= n4 && n4 <= (n3 = ((Number)(object = (Number)pair.b)).intValue())) {
            return bl2;
        }
        return false;
    }
}

