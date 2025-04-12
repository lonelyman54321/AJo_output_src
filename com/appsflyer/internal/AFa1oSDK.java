/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.HashMap;
import java.util.Map;

public abstract class AFa1oSDK {
    public String AFAdRevenueData;
    public String areAllFieldsValid;
    public int component1;
    public String component2;
    public String component3;
    public String component4;
    private byte[] copydefault;
    public Map getCurrencyIso4217Code;
    public AppsFlyerRequestListener getMediationNetwork;
    public String getMonetizationNetwork;
    protected final Map getRevenue;
    private final boolean hashCode;

    public AFa1oSDK() {
        this(null, null, null);
    }

    public AFa1oSDK(String string2, String string3, Boolean bl2) {
        HashMap hashMap;
        this.getRevenue = hashMap = new HashMap();
        this.areAllFieldsValid = string2;
        this.component4 = string3;
        boolean bl3 = bl2 != null ? bl2 : true;
        this.hashCode = bl3;
    }

    public static String AFAdRevenueData(String string2) {
        String string3 = AFb1rSDK.getRevenue().getMonetizationNetwork().getMediationNetwork().component4();
        if (string3 != null) {
            string2 = Uri.parse((String)string2).buildUpon();
            String string4 = "channel";
            string2 = string2.appendQueryParameter(string4, string3).build().toString();
        }
        return string2;
    }

    public static boolean getRevenue(double d2) {
        double d5;
        double d7;
        double d9;
        double d12 = 0.0;
        double d13 = d2 - d12;
        Object object = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (object >= 0 && (d9 = (d7 = d2 - (d5 = 1.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) < 0) {
            d9 = 1.0;
            Object object2 = d2 == d12 ? 0 : (d2 > d12 ? 1 : -1);
            if (object2 == false) {
                return (boolean)d9;
            }
            int n3 = (int)(d2 = d5 / d2);
            int n4 = n3 + 1;
            if (n4 > 0) {
                d12 = Math.random();
                double d14 = n3;
                n4 = (int)(d12 = d12 * d14 + d5);
                if (n4 != n3) {
                    return (boolean)d9;
                }
                return false;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported max value");
            throw illegalArgumentException;
        }
        return false;
    }

    public final AFa1oSDK AFAdRevenueData(byte[] byArray) {
        this.copydefault = byArray;
        return this;
    }

    public final boolean AFAdRevenueData() {
        return this.hashCode;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component1() {
        return true;
    }

    public boolean component2() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public final AFa1oSDK getCurrencyIso4217Code(String string2, Object object) {
        Map map2 = this.getRevenue;
        synchronized (map2) {
            Map map3 = this.getRevenue;
            map3.put(string2, object);
            return this;
        }
    }

    public abstract AFf1zSDK getCurrencyIso4217Code();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFa1oSDK getMediationNetwork(int n3) {
        this.component1 = n3;
        Map map2 = this.getRevenue;
        synchronized (map2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                String string2;
                Map map3;
                block4: {
                    try {
                        map3 = this.getRevenue;
                        string2 = "counter";
                        bl2 = map3.containsKey(string2);
                        if (!bl2) break block4;
                        map3 = this.getRevenue;
                        string2 = "counter";
                        String string3 = Integer.toString(n3);
                        map3.put(string2, string3);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (bl2 = (map3 = this.getRevenue).containsKey(string2 = "launch_counter")) {
                    map3 = this.getRevenue;
                    string2 = "launch_counter";
                    String string4 = Integer.toString(n3);
                    map3.put(string2, string4);
                }
                return this;
            }
            throw throwable2;
        }
    }

    public final byte[] getMediationNetwork() {
        return this.copydefault;
    }

    public final Map getMonetizationNetwork() {
        return this.getRevenue;
    }

    public AFa1oSDK getRevenue(String string2) {
        this.component4 = string2;
        return this;
    }

    public final AFa1oSDK getRevenue(Map map2) {
        synchronized (map2) {
            Map map3 = this.getRevenue;
            map3.putAll(map2);
            return this;
        }
    }

    public final boolean getRevenue() {
        String string2 = this.areAllFieldsValid;
        return string2 == null && (string2 = this.getMonetizationNetwork) == null;
    }
}

