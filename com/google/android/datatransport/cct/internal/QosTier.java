/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public final class QosTier
extends Enum {
    private static final /* synthetic */ QosTier[] $VALUES;
    public static final /* enum */ QosTier DEFAULT;
    public static final /* enum */ QosTier FAST_IF_RADIO_AWAKE;
    public static final /* enum */ QosTier NEVER;
    public static final /* enum */ QosTier UNMETERED_ONLY;
    public static final /* enum */ QosTier UNMETERED_OR_DAILY;
    public static final /* enum */ QosTier UNRECOGNIZED;
    private static final SparseArray valueMap;
    private final int value;

    static {
        QosTier qosTier;
        QosTier qosTier2;
        QosTier qosTier3;
        QosTier qosTier4;
        QosTier qosTier5;
        QosTier qosTier6;
        DEFAULT = qosTier6 = new QosTier("DEFAULT", 0, 0);
        int n3 = 1;
        UNMETERED_ONLY = qosTier5 = new QosTier("UNMETERED_ONLY", n3, n3);
        int n4 = 2;
        UNMETERED_OR_DAILY = qosTier4 = new QosTier("UNMETERED_OR_DAILY", n4, n4);
        int n7 = 3;
        FAST_IF_RADIO_AWAKE = qosTier3 = new QosTier("FAST_IF_RADIO_AWAKE", n7, n7);
        int n8 = 4;
        NEVER = qosTier2 = new QosTier("NEVER", n8, n8);
        int n10 = 5;
        int n14 = -1;
        UNRECOGNIZED = qosTier = new QosTier("UNRECOGNIZED", n10, n14);
        SparseArray sparseArray = new QosTier[6];
        sparseArray[0] = qosTier6;
        sparseArray[n3] = qosTier5;
        sparseArray[n4] = qosTier4;
        sparseArray[n7] = qosTier3;
        sparseArray[n8] = qosTier2;
        sparseArray[n10] = qosTier;
        $VALUES = sparseArray;
        valueMap = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)qosTier6);
        sparseArray.put(n3, (Object)qosTier5);
        sparseArray.put(n4, (Object)qosTier4);
        sparseArray.put(n7, (Object)qosTier3);
        sparseArray.put(n8, (Object)qosTier2);
        sparseArray.put(n14, (Object)qosTier);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QosTier() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static QosTier forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public static QosTier valueOf(String string2) {
        return Enum.valueOf(QosTier.class, string2);
    }

    public static QosTier[] values() {
        return (QosTier[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

