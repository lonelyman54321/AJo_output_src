/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
package com.appsflyer.internal;

import android.net.TrafficStats;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AFe1eSDK
implements Comparable,
Callable {
    private static final AtomicInteger component1;
    public volatile int AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component2;
    private Throwable component3;
    private long component4;
    public final Set getCurrencyIso4217Code;
    public AFe1cSDK getMediationNetwork;
    public final AFf1zSDK getMonetizationNetwork;
    public final Set getRevenue;
    private boolean toString;

    static {
        AtomicInteger atomicInteger;
        component1 = atomicInteger = new AtomicInteger();
    }

    public AFe1eSDK(AFf1zSDK object, AFf1zSDK[] aFf1zSDKArray, String string2) {
        int n3;
        HashSet hashSet;
        this.getRevenue = hashSet = new HashSet();
        Serializable serializable = new HashSet();
        this.getCurrencyIso4217Code = serializable;
        serializable = component1;
        this.areAllFieldsValid = n3 = ((AtomicInteger)serializable).incrementAndGet();
        this.toString = false;
        this.AFAdRevenueData = 0;
        this.getMonetizationNetwork = object;
        Collections.addAll(hashSet, aFf1zSDKArray);
        if (string2 != null) {
            this.component2 = string2;
            return;
        }
        object = String.valueOf(n3);
        this.component2 = object;
    }

    public abstract AFe1cSDK AFAdRevenueData();

    public /* synthetic */ Object call() {
        return this.component3();
    }

    public /* synthetic */ int compareTo(Object object) {
        object = (AFe1eSDK)object;
        return this.getCurrencyIso4217Code((AFe1eSDK)object);
    }

    public final Throwable component1() {
        return this.component3;
    }

    public final boolean component2() {
        return this.toString;
    }

    public final AFe1cSDK component3() {
        long l2;
        AFe1cSDK aFe1cSDK;
        int n3;
        TrafficStats.setThreadStatsTag((int)"AppsFlyer".hashCode());
        this.getMediationNetwork = null;
        this.component3 = null;
        long l3 = System.currentTimeMillis();
        this.AFAdRevenueData = n3 = this.AFAdRevenueData + 1;
        try {
            aFe1cSDK = this.AFAdRevenueData();
        }
        catch (Throwable throwable) {
            AFe1cSDK aFe1cSDK2;
            try {
                this.component3 = throwable;
                aFe1cSDK2 = AFe1cSDK.getMonetizationNetwork;
            }
            catch (Throwable throwable2) {
                long l4;
                this.component4 = l4 = System.currentTimeMillis() - l3;
                this.getRevenue();
                throw throwable2;
            }
            this.getMediationNetwork = aFe1cSDK2;
            this.getCurrencyIso4217Code(throwable);
            throw throwable;
        }
        this.getMediationNetwork = aFe1cSDK;
        this.component4 = l2 = System.currentTimeMillis() - l3;
        this.getRevenue();
        return aFe1cSDK;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        String string2 = null;
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            object = (AFe1eSDK)object;
            object3 = this.getMonetizationNetwork;
            object2 = ((AFe1eSDK)object).getMonetizationNetwork;
            if (object3 != object2) {
                return false;
            }
            string2 = this.component2;
            object = ((AFe1eSDK)object).component2;
            return string2.equals(object);
        }
        return false;
    }

    public final int getCurrencyIso4217Code(AFe1eSDK aFe1eSDK) {
        Object object = this.getMonetizationNetwork;
        int n3 = ((AFf1zSDK)((Object)object)).AFLogger;
        Object object2 = aFe1eSDK.getMonetizationNetwork;
        int n4 = object2.AFLogger;
        if ((n3 -= n4) == 0) {
            object = this.component2;
            object2 = aFe1eSDK.component2;
            n3 = (int)(object.equals(object2) ? 1 : 0);
            if (n3 != 0) {
                return 0;
            }
            n3 = this.areAllFieldsValid;
            int n7 = aFe1eSDK.areAllFieldsValid;
            n3 -= n7;
        }
        return n3;
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    public void getCurrencyIso4217Code(Throwable throwable) {
    }

    public abstract boolean getMediationNetwork();

    public abstract long getMonetizationNetwork();

    public void getRevenue() {
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.getMonetizationNetwork)).hashCode() * 31;
        return this.component2.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        Object object = this.getMonetizationNetwork;
        ((StringBuilder)charSequence).append(object);
        object = "-";
        ((StringBuilder)charSequence).append((String)object);
        String string2 = this.component2;
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((Object)charSequence).toString();
        string2 = String.valueOf(this.areAllFieldsValid);
        String string3 = this.component2;
        boolean bl2 = string2.equals(string3);
        if (!bl2) {
            charSequence = nn_2.a((String)charSequence, (String)object);
            int n3 = this.areAllFieldsValid;
            ((StringBuilder)charSequence).append(n3);
            charSequence = ((Object)charSequence).toString();
        }
        return charSequence;
    }
}

