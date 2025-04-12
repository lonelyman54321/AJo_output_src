/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1aSDK;
import com.appsflyer.internal.AFk1ySDK;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFk1xSDK
extends FilterInputStream {
    private final int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private int component1;
    private byte[] component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private AFj1aSDK getCurrencyIso4217Code;
    private int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1xSDK(InputStream inputStream, int[] nArray, byte[] byArray, int n3, boolean bl2, int n4) {
        this(inputStream, nArray, byArray, n3, false, n4, 0);
    }

    /*
     * WARNING - void declaration
     */
    private AFk1xSDK(InputStream inputStream, int[] nArray, byte[] object, int n3, boolean bl2, int n4, byte by2) {
        void var6_7;
        int n7;
        int n8 = 4096;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, n8);
        super(bufferedInputStream);
        this.getMediationNetwork = n7 = 1;
        this.hashCode = -1 >>> 1;
        this.AFAdRevenueData = n3 = Math.min(Math.max(n3, 3), 16);
        int n10 = 8;
        byte[] byArray = new byte[n10];
        this.component3 = byArray;
        byArray = new byte[n10];
        this.component4 = byArray;
        byte[] byArray2 = new byte[n10];
        this.component2 = byArray2;
        int n14 = 2;
        int[] nArray2 = new int[n14];
        this.areAllFieldsValid = nArray2;
        this.component1 = n10;
        this.copydefault = n10;
        this.toString = var6_7;
        nArray2 = null;
        if (var6_7 == n14) {
            System.arraycopy(object, 0, byArray, 0, n10);
        }
        this.getCurrencyIso4217Code = object = new AFj1aSDK(nArray, n3, n7 != 0, false);
        this.getRevenue = n7 = 100;
        this.getMonetizationNetwork = n7;
    }

    private void getMonetizationNetwork() {
        int n3;
        Object object;
        AFk1xSDK aFk1xSDK = this;
        int n4 = this.toString;
        int n7 = 2;
        if (n4 == n7) {
            object = this.component3;
            byte[] byArray = this.component2;
            n3 = ((byte[])object).length;
            System.arraycopy(object, 0, byArray, 0, n3);
        }
        object = aFk1xSDK.component3;
        int n8 = object[0] << 24;
        n3 = -16777216;
        n8 &= n3;
        int n10 = 1;
        int n14 = object[n10] << 16;
        int n15 = 0xFF0000;
        n8 += (n14 &= n15);
        n14 = object[n7];
        int n16 = 8;
        n14 <<= n16;
        int n17 = 65280;
        n14 = 3;
        int n18 = object[n14] & 0xFF;
        int n19 = (n8 += (n14 &= n17)) + n18;
        n8 = 4;
        n18 = object[n8] << 24;
        n3 &= n18;
        n18 = 5;
        int n20 = object[n18] << 16;
        n3 += (n15 &= n20);
        n15 = 6;
        n20 = object[n15] << n16;
        n3 += (n17 &= n20);
        n17 = 7;
        n4 = object[n17] & 0xFF;
        n20 = n3 + n4;
        int n21 = aFk1xSDK.AFAdRevenueData;
        object = aFk1xSDK.getCurrencyIso4217Code;
        Object[] objectArray = object.getRevenue;
        object = object.getMonetizationNetwork;
        int[] nArray = aFk1xSDK.areAllFieldsValid;
        AFk1ySDK.getRevenue(n19, n20, false, n21, objectArray, (int[][])object, nArray);
        object = aFk1xSDK.areAllFieldsValid;
        n3 = object[0];
        n4 = object[n10];
        byte[] byArray = aFk1xSDK.component3;
        byArray[0] = n20 = (int)((byte)(n3 >> 24));
        byArray[n10] = n20 = (int)((byte)(n3 >> 16));
        byArray[n7] = n10 = (int)((byte)(n3 >> 8));
        byArray[n14] = n3 = (int)((byte)n3);
        byArray[n8] = n3 = (int)((byte)(n4 >> 24));
        byArray[n18] = n8 = (int)((byte)(n4 >> 16));
        byArray[n15] = n8 = (int)((byte)(n4 >> 8));
        byArray[n17] = n4 = (int)((byte)n4);
        n4 = aFk1xSDK.toString;
        if (n4 == n7) {
            byte[] byArray2;
            object = null;
            for (n4 = 0; n4 < n16; ++n4) {
                byArray2 = aFk1xSDK.component3;
                n8 = byArray2[n4];
                objectArray = aFk1xSDK.component4;
                n3 = objectArray[n4];
                byArray2[n4] = n8 = (int)((byte)(n8 ^ n3));
            }
            object = aFk1xSDK.component2;
            byArray2 = aFk1xSDK.component4;
            n8 = ((byte[])object).length;
            System.arraycopy(object, 0, byArray2, 0, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int getRevenue() {
        int n3;
        byte[] byArray;
        InputStream inputStream;
        int n4;
        Object object;
        int n7 = this.hashCode;
        int n8 = -1 >>> 1;
        if (n7 == n8) {
            object = this.in;
            this.hashCode = n7 = ((InputStream)object).read();
        }
        if ((n7 = this.component1) != (n8 = 8)) return this.copydefault;
        object = this.component3;
        int n10 = this.hashCode;
        int n14 = n10;
        object[0] = n14;
        object = "unexpected block size";
        if (n10 < 0) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n10 = 1;
        n14 = 1;
        while ((n4 = (inputStream = this.in).read(byArray = this.component3, n14, n3 = 8 - n14)) > 0 && (n14 += n4) < n8) {
        }
        if (n14 < n8) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n7 = this.getRevenue;
        n14 = this.getMonetizationNetwork;
        if (n7 == n14) {
            this.getMonetizationNetwork();
        } else {
            n14 = this.getMediationNetwork;
            if (n14 <= n7) {
                this.getMonetizationNetwork();
            }
            this.getMediationNetwork = (n7 = this.getMediationNetwork) < (n14 = this.getMonetizationNetwork) ? (n7 += n10) : n10;
        }
        object = this.in;
        this.hashCode = n7 = ((InputStream)object).read();
        this.component1 = 0;
        if (n7 < 0) {
            object = this.component3;
            n10 = 7;
            n7 = object[n10] & 0xFF;
            n8 -= n7;
        }
        this.copydefault = n8;
        return this.copydefault;
    }

    public final int available() {
        this.getRevenue();
        int n3 = this.copydefault;
        int n4 = this.component1;
        return n3 - n4;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int n3;
        this.getRevenue();
        int n4 = this.component1;
        int n7 = this.copydefault;
        if (n4 >= n7) {
            return -1;
        }
        byte[] byArray = this.component3;
        this.component1 = n3 = n4 + 1;
        return byArray[n4] & 0xFF;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = n3;
        while (n8 < n7) {
            int n10;
            this.getRevenue();
            int n14 = this.component1;
            int n15 = this.copydefault;
            if (n14 >= n15) {
                if (n8 == n3) {
                    return -1;
                }
                return n4 - (n7 -= n8);
            }
            n15 = n8 + 1;
            byte[] byArray2 = this.component3;
            this.component1 = n10 = n14 + 1;
            byArray[n8] = n14 = byArray2[n14];
            n8 = n15;
        }
        return n4;
    }

    public final long skip(long l2) {
        int n3;
        long l3;
        long l4 = 0L;
        while ((l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) < 0 && (l3 = (long)this.read()) != (n3 = -1)) {
            long l7 = 1L;
            l4 += l7;
        }
        return l4;
    }
}

