/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFk1uSDK;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class AFk1tSDK
extends FilterInputStream {
    private static final int[] AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code;
    private static final byte[] getMediationNetwork;
    private static final int[] getMonetizationNetwork;
    private static final int[] getRevenue;
    private int AFInAppEventParameterName;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int component2;
    private final int[] component3;
    private final int[] component4;
    private int copy;
    private int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private final int toString;
    private int values;

    static {
        getMediationNetwork = AFk1uSDK.getRevenue;
        getRevenue = AFk1uSDK.getMonetizationNetwork;
        AFAdRevenueData = AFk1uSDK.getCurrencyIso4217Code;
        getMonetizationNetwork = AFk1uSDK.getMediationNetwork;
        getCurrencyIso4217Code = AFk1uSDK.AFAdRevenueData;
    }

    public AFk1tSDK(InputStream inputStream, int n3, byte[] byArray, byte[][] byArray2) {
        this(inputStream, n3, byArray, byArray2, 0);
    }

    private AFk1tSDK(InputStream object, int n3, byte[] byArray, byte[][] byArray2, byte by2) {
        Object object2 = new BufferedInputStream((InputStream)object, 4096);
        super((InputStream)object2);
        object = new int[4];
        this.component3 = (int[])object;
        int n4 = 16;
        object2 = new byte[n4];
        this.component1 = (byte[])object2;
        object2 = new byte[n4];
        this.equals = (byte[])object2;
        this.copy = 1;
        this.copydefault = -1 >>> 1;
        this.values = n4;
        this.AFInAppEventParameterName = n4;
        this.component2 = n3;
        object = AFk1uSDK.getMediationNetwork(byArray, n3);
        this.component4 = (int[])object;
        object = AFk1tSDK.AFAdRevenueData(byArray2);
        this.areAllFieldsValid = (byte[][])object;
        this.hashCode = n4 = 100;
        this.toString = n4;
    }

    private void AFAdRevenueData(byte[] byArray, byte[] byArray2) {
        byte by2;
        byte by4;
        byte by5;
        byte by6;
        byte by7;
        byte by8;
        Object[] objectArray;
        Object[] objectArray2;
        int[] nArray;
        AFk1tSDK aFk1tSDK = this;
        int[] nArray2 = this.component3;
        boolean n3 = false;
        Object object = byArray[0] << 24;
        int n4 = 1;
        int n7 = (byArray[n4] & 0xFF) << 16;
        object |= n7;
        n7 = 2;
        int n8 = byArray[n7] & 0xFF;
        int n10 = 8;
        object |= (n8 <<= n10);
        n8 = 3;
        int n14 = byArray[n8] & 0xFF;
        object |= n14;
        int[] nArray3 = this.component4;
        int n15 = nArray3[0];
        nArray2[0] = object ^= n15;
        object = 4;
        n15 = byArray[object] << 24;
        Object object2 = 5;
        int n16 = (byArray[object2] & 0xFF) << 16;
        n15 |= n16;
        n16 = 6;
        int n17 = (byArray[n16] & 0xFF) << n10;
        n15 |= n17;
        n17 = 7;
        int n18 = byArray[n17] & 0xFF;
        n15 |= n18;
        n18 = nArray3[n4];
        nArray2[n4] = n15 ^= n18;
        n15 = byArray[n10] << 24;
        n18 = 9;
        int n19 = (byArray[n18] & 0xFF) << 16;
        n15 |= n19;
        int n20 = (byArray[10] & 0xFF) << n10;
        n15 |= n20;
        n19 = byArray[11] & 0xFF;
        n15 |= n19;
        n19 = nArray3[n7];
        nArray2[n7] = n15 ^= n19;
        n19 = byArray[12] << 24;
        int n21 = 13;
        n15 = (byArray[n21] & 0xFF) << 16 | n19;
        n20 = (byArray[14] & 0xFF) << n10;
        n15 |= n20;
        n20 = 15;
        n19 = byArray[n20] & 0xFF;
        nArray2[n8] = n14 = nArray3[n8] ^ (n15 |= n19);
        int n22 = 1;
        n14 = 4;
        while (n22 < (n15 = aFk1tSDK.component2)) {
            nArray = getRevenue;
            int[] nArray4 = aFk1tSDK.component3;
            Object object3 = aFk1tSDK.areAllFieldsValid;
            byte[] byArray3 = object3[0];
            int n24 = byArray3[0];
            n24 = nArray4[n24] >>> 24;
            n24 = nArray[n24];
            int[] nArray5 = AFAdRevenueData;
            byte[] byArray4 = object3[n4];
            int n25 = byArray4[0];
            n25 = nArray4[n25];
            n18 = n25 >>> 16 & 0xFF;
            n18 = nArray5[n18];
            n18 = n24 ^ n18;
            int[] nArray6 = getMonetizationNetwork;
            byte[] byArray5 = object3[n7];
            int n26 = byArray5[0];
            n17 = nArray4[n26] >>> 8 & 0xFF;
            n17 = nArray6[n17] ^ n18;
            objectArray2 = getCurrencyIso4217Code;
            object3 = object3[n8];
            n26 = (int)object3[0];
            n16 = nArray4[n26] & 0xFF;
            n16 = objectArray2[n16] ^ n17;
            objectArray = aFk1tSDK.component4;
            n26 = objectArray[n14];
            n16 ^= n26;
            n26 = byArray3[n4];
            n26 = nArray4[n26] >>> 24;
            n26 = nArray[n26];
            int n27 = byArray4[n4];
            n27 = nArray4[n27];
            object2 = n27 >>> 16 & 0xFF;
            object2 = nArray5[object2];
            object2 = n26 ^ object2;
            n26 = byArray5[n4];
            object = nArray4[n26] >>> 8 & 0xFF;
            object = nArray6[object] ^ object2;
            object2 = object3[n4];
            object2 = nArray4[object2] & 0xFF;
            object2 = objectArray2[object2];
            object ^= object2;
            object2 = n14 + 1;
            object2 = objectArray[object2];
            object ^= object2;
            object2 = byArray3[n7];
            object2 = nArray4[object2] >>> 24;
            object2 = nArray[object2];
            n26 = byArray4[n7];
            n26 = nArray4[n26];
            n4 = n26 >>> 16 & 0xFF;
            n4 = nArray5[n4] ^ object2;
            object2 = byArray5[n7];
            object2 = nArray4[object2] >>> n10 & 0xFF;
            object2 = nArray6[object2];
            n4 ^= object2;
            object2 = object3[n7];
            object2 = nArray4[object2] & 0xFF;
            object2 = objectArray2[object2];
            n4 ^= object2;
            object2 = n14 + 2;
            object2 = objectArray[object2];
            n4 ^= object2;
            object2 = byArray3[n8];
            object2 = nArray4[object2] >>> 24;
            n15 = nArray[object2];
            object2 = byArray4[n8];
            object2 = nArray4[object2] >>> 16 & 0xFF;
            object2 = nArray5[object2];
            n15 ^= object2;
            object2 = byArray5[n8];
            object2 = nArray4[object2] >>> n10 & 0xFF;
            object2 = nArray6[object2];
            n15 ^= object2;
            object2 = object3[n8];
            object2 = nArray4[object2] & 0xFF;
            object2 = objectArray2[object2];
            n15 ^= object2;
            object2 = n14 + 3;
            object2 = objectArray[object2];
            nArray4[0] = n16;
            nArray4[1] = object;
            nArray4[n7] = n4;
            nArray4[n8] = n15 ^= object2;
            ++n22;
            n14 += 4;
            object = 4;
            n4 = 1;
            object2 = 5;
            n16 = 6;
            n17 = 7;
            n18 = 9;
            n20 = 15;
        }
        nArray2 = aFk1tSDK.component4;
        object = nArray2[n14];
        byte[] byArray6 = getMediationNetwork;
        nArray = aFk1tSDK.component3;
        Object object4 = aFk1tSDK.areAllFieldsValid;
        byte[] byArray7 = object4[0];
        n17 = byArray7[0];
        n17 = nArray[n17] >>> 24;
        n17 = byArray6[n17];
        n18 = object >>> 24;
        byArray2[0] = n17 = (int)((byte)(n17 ^ n18));
        n17 = 1;
        objectArray2 = object4[n17];
        n19 = objectArray2[0];
        n19 = nArray[n19] >>> 16 & 0xFF;
        n19 = byArray6[n19];
        n20 = object >>> 16;
        byArray2[n17] = n19 = (int)((byte)(n19 ^ n20));
        objectArray = object4[n7];
        n19 = objectArray[0];
        n19 = nArray[n19] >>> n10 & 0xFF;
        n19 = byArray6[n19];
        n20 = object >>> 8;
        byArray2[n7] = n19 = (int)((byte)(n19 ^ n20));
        object4 = object4[n8];
        byte[] byArray8 = object4[0];
        int n28 = nArray[byArray8] & 0xFF;
        byArray2[n8] = by8 = (byte)(byArray6[n28] ^ object);
        int n30 = n14 + 1;
        n30 = nArray2[n30];
        object = 1;
        n19 = byArray7[object];
        n19 = nArray[n19] >>> 24;
        n19 = byArray6[n19];
        n20 = n30 >>> 24;
        byArray2[4] = n19 = (int)((byte)(n19 ^ n20));
        n19 = objectArray2[object];
        n19 = nArray[n19] >>> 16 & 0xFF;
        n19 = byArray6[n19];
        n20 = n30 >>> 16;
        byArray2[5] = n19 = (int)((byte)(n19 ^ n20));
        n19 = objectArray[object];
        n19 = nArray[n19] >>> n10 & 0xFF;
        n19 = byArray6[n19];
        n20 = n30 >>> 8;
        byArray2[6] = n19 = (int)((byte)(n19 ^ n20));
        object = object4[object];
        object = nArray[object] & 0xFF;
        object = byArray6[object];
        byArray2[7] = by7 = (byte)(n30 ^ object);
        int n34 = n14 + 2;
        n34 = nArray2[n34];
        object = byArray7[n7];
        object = nArray[object] >>> 24;
        object = byArray6[object];
        n19 = n34 >>> 24;
        byArray2[n10] = object = (Object)((byte)(object ^ n19));
        object = objectArray2[n7];
        object = nArray[object] >>> 16 & 0xFF;
        object = byArray6[object];
        n19 = n34 >>> 16;
        byArray2[9] = object = (Object)((byte)(object ^ n19));
        object = objectArray[n7];
        object = nArray[object] >>> n10 & 0xFF;
        object = byArray6[object];
        n19 = n34 >>> 8;
        byArray2[10] = object = (Object)((byte)(object ^ n19));
        object = object4[n7];
        object = nArray[object] & 0xFF;
        object = byArray6[object];
        byArray2[11] = by6 = (byte)(n34 ^ object);
        n22 = nArray2[n14 += n8];
        byte by9 = byArray7[n8];
        int n35 = nArray[by9] >>> 24;
        byte by10 = byArray6[n35];
        object = n22 >>> 24;
        byArray2[12] = by5 = (byte)(by10 ^ object);
        byte by11 = objectArray2[n8];
        int n36 = nArray[by11] >>> 16 & 0xFF;
        byte by12 = byArray6[n36];
        object = n22 >>> 16;
        byArray2[n21] = by4 = (byte)(by12 ^ object);
        byte by13 = objectArray[n8];
        int n37 = nArray[by13] >>> n10 & 0xFF;
        byte by14 = byArray6[n37];
        object = n22 >>> 8;
        byArray2[14] = by2 = (byte)(by14 ^ object);
        byte[] byArray9 = object4[n8];
        int n38 = nArray[byArray9] & 0xFF;
        byte by15 = byArray6[n38];
        byArray2[15] = n22 = (int)((byte)(n22 ^ by15));
    }

    private static byte[][] AFAdRevenueData(byte[][] byArray) {
        int n3;
        int n4 = byArray.length;
        byte[][] byArrayArray = new byte[n4][];
        for (int i3 = 0; i3 < (n3 = byArray.length); ++i3) {
            byte[] byArray2;
            int n7;
            byte[] byArray3 = new byte[byArray[i3].length];
            byArrayArray[i3] = byArray3;
            byArray3 = null;
            for (n3 = 0; n3 < (n7 = (byArray2 = byArray[i3]).length); ++n3) {
                byte by2;
                byte[] byArray4 = byArrayArray[i3];
                byte by4 = byArray2[n3];
                byArray4[by4] = by2 = (byte)n3;
            }
        }
        return byArrayArray;
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
        int n7 = this.copydefault;
        int n8 = -1 >>> 1;
        if (n7 == n8) {
            object = this.in;
            this.copydefault = n7 = ((InputStream)object).read();
        }
        if ((n7 = this.values) != (n8 = 16)) return this.AFInAppEventParameterName;
        object = this.component1;
        int n10 = this.copydefault;
        int n14 = n10;
        object[0] = n14;
        object = "unexpected block size";
        if (n10 < 0) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n10 = 1;
        n14 = 1;
        while ((n4 = (inputStream = this.in).read(byArray = this.component1, n14, n3 = 16 - n14)) > 0 && (n14 += n4) < n8) {
        }
        if (n14 < n8) {
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n7 = this.hashCode;
        n14 = this.toString;
        if (n7 == n14) {
            object = this.component1;
            byte[] byArray2 = this.equals;
            this.AFAdRevenueData((byte[])object, byArray2);
        } else {
            n14 = this.copy;
            if (n14 <= n7) {
                object = this.component1;
                byte[] byArray3 = this.equals;
                this.AFAdRevenueData((byte[])object, byArray3);
            } else {
                object = this.component1;
                byte[] byArray4 = this.equals;
                n4 = ((Object)object).length;
                System.arraycopy(object, 0, byArray4, 0, n4);
            }
            n7 = this.copy;
            n14 = this.toString;
            this.copy = n7 < n14 ? (n7 += n10) : n10;
        }
        object = this.in;
        this.copydefault = n7 = ((InputStream)object).read();
        this.values = 0;
        if (n7 < 0) {
            object = this.equals;
            n10 = 15;
            n7 = object[n10] & 0xFF;
            n8 -= n7;
        }
        this.AFInAppEventParameterName = n8;
        return this.AFInAppEventParameterName;
    }

    public final int available() {
        this.getMediationNetwork();
        int n3 = this.AFInAppEventParameterName;
        int n4 = this.values;
        return n3 - n4;
    }

    public final void close() {
        super.close();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void mark(int n3) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int n3;
        this.getMediationNetwork();
        int n4 = this.values;
        int n7 = this.AFInAppEventParameterName;
        if (n4 >= n7) {
            return -1;
        }
        byte[] byArray = this.equals;
        this.values = n3 = n4 + 1;
        return byArray[n4] & 0xFF;
    }

    public final int read(byte[] byArray) {
        int n3 = byArray.length;
        return this.read(byArray, 0, n3);
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = n3;
        while (n8 < n7) {
            int n10;
            this.getMediationNetwork();
            int n14 = this.values;
            int n15 = this.AFInAppEventParameterName;
            if (n14 >= n15) {
                if (n8 == n3) {
                    return -1;
                }
                return n4 - (n7 -= n8);
            }
            n15 = n8 + 1;
            byte[] byArray2 = this.equals;
            this.values = n10 = n14 + 1;
            byArray[n8] = n14 = byArray2[n14];
            n8 = n15;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void reset() {
        // MONITORENTER : this
        // MONITOREXIT : this
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

