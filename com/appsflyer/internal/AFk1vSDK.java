/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFk1vSDK
extends FilterInputStream {
    private static final short AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;
    private int valueOf;

    static {
        double d2 = Math.sqrt(5.0) - 1.0;
        AFAdRevenueData = (short)(Math.pow(2.0, 15.0) * d2);
    }

    public AFk1vSDK(InputStream inputStream, int[] nArray, int n3, byte[] byArray, int n4, int n7) {
        this(inputStream, nArray, n3, byArray, n4, n7, 0);
    }

    private AFk1vSDK(InputStream inputStream, int[] nArray, int n3, byte[] byArray, int n4, int n7, byte by2) {
        int n8;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
        super(bufferedInputStream);
        this.areAllFieldsValid = -1 >>> 1;
        this.valueOf = n8 = 1;
        by2 = (byte)8;
        byte[] byArray2 = new byte[by2];
        this.getMediationNetwork = byArray2;
        byArray2 = new byte[by2];
        this.getMonetizationNetwork = byArray2;
        byArray2 = new byte[by2];
        this.getCurrencyIso4217Code = byArray2;
        this.getRevenue = by2;
        this.component2 = by2;
        this.component1 = n4 = Math.min(Math.max(n4, 5), 16);
        this.component4 = n7;
        n4 = 0;
        int n10 = 3;
        if (n7 == n10) {
            byte[] byArray3 = this.getMonetizationNetwork;
            System.arraycopy(byArray, 0, byArray3, 0, by2);
        }
        int n14 = nArray[0];
        long l2 = n14;
        long l3 = 0xFFFFFFFFL;
        l2 &= l3;
        int n15 = 32;
        n8 = nArray[n8];
        long l4 = (long)n8 & l3 | (l2 <<= n15);
        if (n3 == 0) {
            int n16;
            this.component3 = n3 = (int)l4;
            long l7 = l4 >> n10;
            n4 = AFAdRevenueData;
            l3 = (long)n4 * l7 >> n15;
            by2 = (byte)l3;
            this.hashCode = by2;
            this.copy = n16 = (int)(l4 >> n15);
            l4 = n4;
            this.toString = n8 = (int)(l7 += l4);
        } else {
            int n17;
            this.component3 = n14 = (int)l4;
            this.hashCode = n4 = n14 * n3;
            this.copy = n3 ^= n14;
            this.toString = n17 = (int)(l4 >>= n15);
        }
        this.equals = n8 = 100;
        this.copydefault = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int getMediationNetwork() {
        int n3;
        byte[] byArray;
        InputStream inputStream;
        int n4;
        Object object;
        int n7 = this.areAllFieldsValid;
        int n8 = -1 >>> 1;
        if (n7 == n8) {
            object = this.in;
            this.areAllFieldsValid = n7 = ((InputStream)object).read();
        }
        if ((n7 = this.getRevenue) != (n8 = 8)) return this.component2;
        object = this.getMediationNetwork;
        int n10 = this.areAllFieldsValid;
        int n14 = n10;
        object[0] = n14;
        object = "unexpected block size";
        if (n10 < 0) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n10 = 1;
        n14 = 1;
        while ((n4 = (inputStream = this.in).read(byArray = this.getMediationNetwork, n14, n3 = 8 - n14)) > 0 && (n14 += n4) < n8) {
        }
        if (n14 < n8) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n7 = this.equals;
        n14 = this.copydefault;
        if (n7 == n14) {
            this.getRevenue();
        } else {
            n14 = this.valueOf;
            if (n14 <= n7) {
                this.getRevenue();
            }
            this.valueOf = (n7 = this.valueOf) < (n14 = this.copydefault) ? (n7 += n10) : n10;
        }
        object = this.in;
        this.areAllFieldsValid = n7 = ((InputStream)object).read();
        this.getRevenue = 0;
        if (n7 < 0) {
            object = this.getMediationNetwork;
            n10 = 7;
            n7 = object[n10] & 0xFF;
            n8 -= n7;
        }
        this.component2 = n8;
        return this.component2;
    }

    private void getRevenue() {
        int n3;
        byte[] byArray;
        byte[] byArray2;
        AFk1vSDK aFk1vSDK = this;
        int n4 = this.component4;
        int n7 = 3;
        if (n4 == n7) {
            byArray2 = this.getMediationNetwork;
            byArray = this.getCurrencyIso4217Code;
            n3 = byArray2.length;
            System.arraycopy(byArray2, 0, byArray, 0, n3);
        }
        byArray2 = aFk1vSDK.getMediationNetwork;
        int n8 = byArray2[0] << 24;
        n3 = -16777216;
        n8 &= n3;
        int n10 = 1;
        int n14 = byArray2[n10] << 16;
        int n15 = 0xFF0000;
        n8 += (n14 &= n15);
        n14 = 2;
        int n16 = byArray2[n14];
        int n17 = 8;
        n16 <<= n17;
        int n18 = 65280;
        n8 += (n16 &= n18);
        n16 = byArray2[n7] & 0xFF;
        n8 += n16;
        n16 = 4;
        int n19 = byArray2[n16] << 24;
        n3 &= n19;
        n19 = 5;
        int n20 = byArray2[n19] << 16;
        n3 += (n15 &= n20);
        n15 = 6;
        n20 = byArray2[n15] << n17;
        n3 += (n18 &= n20);
        n18 = 7;
        n4 = byArray2[n18] & 0xFF;
        n3 += n4;
        byArray2 = null;
        for (n4 = 0; n4 < (n20 = aFk1vSDK.component1); ++n4) {
            short s7 = AFAdRevenueData;
            int n21 = (n20 - n4) * s7 + n8;
            int n22 = n8 << 4;
            n17 = aFk1vSDK.copy;
            n22 += n17;
            n17 = n21 ^ n22;
            n21 = n8 >>> 5;
            n18 = aFk1vSDK.toString;
            n20 = (n20 - n4) * s7 + (n3 -= (n17 ^= (n21 += n18)));
            n17 = n3 << 4;
            n18 = aFk1vSDK.component3;
            n17 = n17 + n18 ^ n20;
            n18 = n3 >>> 5;
            n20 = aFk1vSDK.hashCode;
            n8 -= (n17 ^= (n18 += n20));
            n17 = 8;
            n18 = 7;
        }
        byArray2 = aFk1vSDK.getMediationNetwork;
        byArray2[0] = n17 = (int)((byte)(n8 >> 24));
        byArray2[n10] = n17 = (int)((byte)(n8 >> 16));
        byArray2[n14] = n10 = (int)((byte)(n8 >> 8));
        byArray2[n7] = n8 = (int)((byte)n8);
        byArray2[n16] = n8 = (int)((byte)(n3 >> 24));
        byArray2[n19] = n8 = (int)((byte)(n3 >> 16));
        byArray2[n15] = n8 = (int)((byte)(n3 >> 8));
        n8 = (byte)n3;
        n3 = 7;
        byArray2[n3] = n8;
        n4 = aFk1vSDK.component4;
        if (n4 == n7) {
            n4 = 8;
            byte[] byArray3 = null;
            for (n7 = 0; n7 < n4; ++n7) {
                byArray = aFk1vSDK.getMediationNetwork;
                n3 = byArray[n7];
                byte[] byArray4 = aFk1vSDK.getMonetizationNetwork;
                n10 = byArray4[n7];
                byArray[n7] = n3 = (int)((byte)(n3 ^ n10));
            }
            byArray2 = aFk1vSDK.getCurrencyIso4217Code;
            byArray3 = aFk1vSDK.getMonetizationNetwork;
            n8 = byArray2.length;
            System.arraycopy(byArray2, 0, byArray3, 0, n8);
        }
    }

    public final int available() {
        this.getMediationNetwork();
        int n3 = this.component2;
        int n4 = this.getRevenue;
        return n3 - n4;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int n3;
        this.getMediationNetwork();
        int n4 = this.getRevenue;
        int n7 = this.component2;
        if (n4 >= n7) {
            return -1;
        }
        byte[] byArray = this.getMediationNetwork;
        this.getRevenue = n3 = n4 + 1;
        return byArray[n4] & 0xFF;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = n3;
        while (n8 < n7) {
            int n10;
            this.getMediationNetwork();
            int n14 = this.getRevenue;
            int n15 = this.component2;
            if (n14 >= n15) {
                if (n8 == n3) {
                    return -1;
                }
                return n4 - (n7 -= n8);
            }
            n15 = n8 + 1;
            byte[] byArray2 = this.getMediationNetwork;
            this.getRevenue = n10 = n14 + 1;
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

