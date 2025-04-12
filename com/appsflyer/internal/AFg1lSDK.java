/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1jSDK;

public final class AFg1lSDK
extends AFa1oSDK {
    public AFg1lSDK(Context object) {
        Comparable<StringBuilder> comparable = new StringBuilder();
        String string2 = AFg1jSDK.getMediationNetwork;
        String string3 = AppsFlyerLib.getInstance().getHostPrefix();
        String string4 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[]{string3, string4};
        string2 = String.format(string2, objectArray);
        comparable.append(string2);
        object = object.getPackageName();
        comparable.append((String)object);
        object = ((Object)comparable).toString();
        comparable = Boolean.FALSE;
        super("Register", (String)object, (Boolean)comparable);
    }

    public final boolean areAllFieldsValid() {
        return false;
    }

    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.hashCode;
    }
}

