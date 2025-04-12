/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.appsflyer.internal;

import android.os.Bundle;
import com.appsflyer.internal.AFa1rSDK$AFa1tSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class AFa1rSDK$5
implements InvocationHandler {
    private /* synthetic */ AFa1rSDK$AFa1tSDK getMediationNetwork;
    private /* synthetic */ Class getMonetizationNetwork;

    public AFa1rSDK$5(Class clazz, AFa1rSDK$AFa1tSDK aFa1tSDK) {
        this.getMonetizationNetwork = clazz;
        this.getMediationNetwork = aFa1tSDK;
    }

    public final Object invoke(Object object, Method method, Object[] object2) {
        object = method.getName();
        boolean bl2 = object.equals("onDeferredAppLinkDataFetched");
        method = null;
        if (bl2) {
            bl2 = false;
            object = object2[0];
            if (object != null) {
                Object object3;
                object = this.getMonetizationNetwork.cast(object);
                object2 = this.getMonetizationNetwork.getMethod("getArgumentBundle", null);
                Object object4 = Bundle.class;
                object = ((Method)object2).invoke(object, null);
                if ((object = (Bundle)((Class)object4).cast(object)) != null) {
                    object2 = object.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                    object4 = object.getString("target_url");
                    object3 = "extras";
                    if ((object = object.getBundle((String)object3)) != null && (object = object.getBundle((String)(object3 = "deeplink_context"))) != null) {
                        object3 = "promo_code";
                        object = object.getString((String)object3);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                } else {
                    bl2 = false;
                    object = null;
                    object2 = null;
                    object4 = null;
                }
                object3 = this.getMediationNetwork;
                if (object3 != null) {
                    object3.AFAdRevenueData((String)object2, (String)object4, (String)object);
                }
            } else {
                object = this.getMediationNetwork;
                if (object != null) {
                    object.AFAdRevenueData(null, null, null);
                }
            }
            return null;
        }
        object = this.getMediationNetwork;
        if (object != null) {
            object2 = "onDeferredAppLinkDataFetched invocation failed";
            object.getRevenue((String)object2);
        }
        return null;
    }
}

