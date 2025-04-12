/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1zSDK;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFb1kSDK {
    public String AFAdRevenueData;
    public AFf1zSDK getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    String getMonetizationNetwork;
    public String getRevenue;

    public AFb1kSDK(String string2, byte[] byArray, String string3, AFf1zSDK aFf1zSDK) {
        this.AFAdRevenueData = string2;
        this.getMediationNetwork = byArray;
        this.getMonetizationNetwork = string3;
        this.getCurrencyIso4217Code = aFf1zSDK;
    }

    public AFb1kSDK(char[] object) {
        boolean bl2;
        String string2 = new String((char[])object);
        Scanner scanner = new Scanner(string2);
        int n3 = 0;
        object = null;
        int n4 = 0;
        string2 = null;
        while (bl2 = scanner.hasNextLine()) {
            Object object2 = scanner.nextLine();
            Object object3 = "url=";
            int n7 = ((String)object2).startsWith((String)object3);
            int n8 = 4;
            if (n7 != 0) {
                object2 = ((String)object2).substring(n8).trim();
                this.AFAdRevenueData = object2;
                continue;
            }
            object3 = "version=";
            n7 = ((String)object2).startsWith((String)object3);
            int n10 = 2;
            if (n7 != 0) {
                object2 = ((String)object2).substring(8).trim();
                this.getMonetizationNetwork = object2;
                object2 = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
                object3 = this.getMonetizationNetwork;
                n7 = (int)(((Matcher)(object2 = ((Pattern)object2).matcher((CharSequence)object3))).matches() ? 1 : 0);
                if (n7 == 0) continue;
                object = ((Matcher)object2).group(1);
                n3 = Integer.parseInt((String)object);
                string2 = ((Matcher)object2).group(n10);
                n4 = Integer.parseInt(string2);
                continue;
            }
            object3 = "data=";
            n7 = ((String)object2).startsWith((String)object3);
            int n14 = 5;
            if (n7 != 0) {
                object2 = ((String)object2).substring(n14).trim();
                if (n3 <= n8 && n4 < (n7 = 11)) {
                    object3 = Charset.defaultCharset();
                    object2 = ((String)object2).getBytes((Charset)object3);
                } else {
                    object2 = Base64.decode((String)object2, (int)n10);
                }
                this.getMediationNetwork = (byte[])object2;
                continue;
            }
            object3 = "type=";
            n7 = ((String)object2).startsWith((String)object3);
            if (n7 == 0) continue;
            object2 = ((String)object2).substring(n14).trim();
            object3 = AFf1zSDK.valueOf((String)object2);
            try {
                this.getCurrencyIso4217Code = object3;
            }
            catch (Exception exception) {
                object2 = String.valueOf(object2);
                String string3 = "CACHE: Unknown task type: ";
                object2 = string3.concat((String)object2);
                AFLogger.afErrorLog((String)object2, exception);
            }
        }
        scanner.close();
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = AFb1kSDK.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (AFb1kSDK)object;
            object2 = this.getMonetizationNetwork;
            if (object2 != null ? !(bl3 = object2.equals(object3 = ((AFb1kSDK)object).getMonetizationNetwork)) : (object2 = ((AFb1kSDK)object).getMonetizationNetwork) != null) {
                return false;
            }
            object2 = this.getMediationNetwork;
            object3 = ((AFb1kSDK)object).getMediationNetwork;
            bl3 = Arrays.equals((byte[])object2, (byte[])object3);
            if (!bl3) {
                return false;
            }
            object2 = this.AFAdRevenueData;
            if (object2 != null ? !(bl3 = object2.equals(object3 = ((AFb1kSDK)object).AFAdRevenueData)) : (object2 = ((AFb1kSDK)object).AFAdRevenueData) != null) {
                return false;
            }
            object2 = this.getRevenue;
            if (object2 != null ? !(bl3 = object2.equals(object3 = ((AFb1kSDK)object).getRevenue)) : (object2 = ((AFb1kSDK)object).getRevenue) != null) {
                return false;
            }
            object2 = this.getCurrencyIso4217Code;
            object = ((AFb1kSDK)object).getCurrencyIso4217Code;
            if (object2 == object) {
                return bl2;
            }
        }
        return false;
    }

    public final byte[] getMonetizationNetwork() {
        return this.getMediationNetwork;
    }

    public final int hashCode() {
        int n3;
        Object object = this.getMonetizationNetwork;
        int n4 = 0;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        byte[] byArray = this.getMediationNetwork;
        int n7 = (Arrays.hashCode(byArray) + (n3 *= 31)) * 31;
        object = this.AFAdRevenueData;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.getRevenue;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.getCurrencyIso4217Code;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n7 + n4;
    }
}

