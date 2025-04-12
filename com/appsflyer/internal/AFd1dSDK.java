/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1dSDK$1;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1zSDK;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AFd1dSDK {
    public static final AFd1fSDK getMonetizationNetwork(Throwable throwable, String string2) {
        AFd1fSDK aFd1fSDK;
        String string3 = "";
        Intrinsics.checkNotNullParameter(throwable, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        Object object = throwable.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(object, string3);
        String string4 = n1.a((String)object, ": ", string2);
        String string5 = AFd1dSDK.getMonetizationNetwork(throwable);
        String string6 = yc0_2.b(throwable);
        object = aFd1fSDK;
        aFd1fSDK = new AFd1fSDK(string4, string5, string6, 0, 8, null);
        return aFd1fSDK;
    }

    /*
     * WARNING - void declaration
     */
    private static String getMonetizationNetwork(Throwable object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        StackTraceElement[] object2 = ((Throwable)object).getStackTrace();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Serializable serializable = new ArrayList();
        for (StackTraceElement stackTraceElement : object2) {
            void var6_7;
            String string3 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(string3, string2);
            String string4 = "com.appsflyer";
            boolean bl2 = b.s(string3, string4, false);
            if (!bl2) {
                Object var6_9 = null;
            }
            if (var6_7 == null) continue;
            ((ArrayList)serializable).add(var6_7);
        }
        AFd1dSDK$1 aFd1dSDK$1 = AFd1dSDK$1.getMediationNetwork;
        String string5 = CollectionsKt.R(serializable, "\n", null, null, aFd1dSDK$1, 30);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append("\n");
        ((StringBuilder)serializable).append(string5);
        object = ((StringBuilder)serializable).toString();
        Intrinsics.checkNotNullParameter(object, string2);
        return AFe1zSDK.getRevenue((String)object, "SHA-256");
    }
}

