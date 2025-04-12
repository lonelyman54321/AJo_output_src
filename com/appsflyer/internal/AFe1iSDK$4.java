/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1iSDK$AFa1zSDK;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

final class AFe1iSDK$4
extends Lambda
implements Function0 {
    private /* synthetic */ AFe1iSDK getMediationNetwork;

    public AFe1iSDK$4(AFe1iSDK aFe1iSDK) {
        this.getMediationNetwork = aFe1iSDK;
        super(0);
    }

    public final String AFAdRevenueData() {
        boolean bl2;
        int n3 = 1;
        Object object = AFe1iSDK.getMediationNetwork(this.getMediationNetwork);
        Object object2 = AFe1iSDK.getRevenue(this.getMediationNetwork).component4();
        object = AFb1rSDK.getMonetizationNetwork((AFd1rSDK)object, (String)object2);
        object2 = "";
        if (object != null && !(bl2 = b.k((CharSequence)object))) {
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            Object[] objectArray = AFe1iSDK$AFa1zSDK.getCurrencyIso4217Code();
            Object object3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            object3 = ((String)object).toLowerCase((Locale)object3);
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            bl2 = objectArray.contains(object3);
            if (!bl2) {
                String string2 = "-";
                object = string2.concat((String)object);
            } else {
                objectArray = StringCompanionObject.INSTANCE;
                objectArray = new Object[n3];
                object3 = null;
                objectArray[0] = object;
                Object object4 = Arrays.copyOf(objectArray, n3);
                object4 = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", object4);
                Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                AFLogger.afWarnLog((String)object4);
                object = object2;
            }
        }
        if (object != null) {
            object2 = object;
        }
        return ((Object)StringsKt.m0((CharSequence)object2)).toString();
    }

    public final /* synthetic */ Object invoke() {
        return this.AFAdRevenueData();
    }
}

