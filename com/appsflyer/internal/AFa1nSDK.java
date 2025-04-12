/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.HashMap;

public class AFa1nSDK
extends HashMap {
    private static AFa1nSDK getMediationNetwork;
    private final Object getMonetizationNetwork;

    private AFa1nSDK() {
        Object object;
        this.getMonetizationNetwork = object = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AFa1nSDK afErrorLog() {
        Class<AFa1nSDK> clazz = AFa1nSDK.class;
        synchronized (clazz) {
            try {
                AFa1nSDK aFa1nSDK = getMediationNetwork;
                if (aFa1nSDK != null) return getMediationNetwork;
                getMediationNetwork = aFa1nSDK = new AFa1nSDK();
                return getMediationNetwork;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public String put(Integer object, String string2) {
        Object object2 = this.getMonetizationNetwork;
        synchronized (object2) {
            object = super.put(object, string2);
            object = (String)object;
            return object;
        }
    }

    public String remove(Object object) {
        Object object2 = this.getMonetizationNetwork;
        synchronized (object2) {
            object = super.remove(object);
            object = (String)object;
            return object;
        }
    }

    public boolean remove(Object object, Object object2) {
        Object object3 = this.getMonetizationNetwork;
        synchronized (object3) {
            boolean bl2 = super.remove(object, object2);
            return bl2;
        }
    }
}

