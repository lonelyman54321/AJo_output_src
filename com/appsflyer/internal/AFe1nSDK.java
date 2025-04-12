/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public class AFe1nSDK {
    public final long getRevenue;

    public AFe1nSDK(long l2) {
        this.getRevenue = l2;
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        Class<?> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = this.getClass()) == (clazz = object.getClass())) {
            object = (AFe1nSDK)object;
            long l2 = this.getRevenue;
            long l3 = ((AFe1nSDK)object).getRevenue;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                return bl2;
            }
        }
        return false;
    }

    public int hashCode() {
        long l2 = this.getRevenue;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }
}

