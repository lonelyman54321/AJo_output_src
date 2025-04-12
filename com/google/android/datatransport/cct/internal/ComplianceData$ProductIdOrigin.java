/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public final class ComplianceData$ProductIdOrigin
extends Enum {
    private static final /* synthetic */ ComplianceData$ProductIdOrigin[] $VALUES;
    public static final /* enum */ ComplianceData$ProductIdOrigin EVENT_OVERRIDE;
    public static final /* enum */ ComplianceData$ProductIdOrigin NOT_SET;
    private static final SparseArray valueMap;
    private final int value;

    static {
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin;
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin2;
        NOT_SET = complianceData$ProductIdOrigin2 = new ComplianceData$ProductIdOrigin("NOT_SET", 0, 0);
        int n3 = 1;
        int n4 = 5;
        EVENT_OVERRIDE = complianceData$ProductIdOrigin = new ComplianceData$ProductIdOrigin("EVENT_OVERRIDE", n3, n4);
        SparseArray sparseArray = new ComplianceData$ProductIdOrigin[2];
        sparseArray[0] = complianceData$ProductIdOrigin2;
        sparseArray[n3] = complianceData$ProductIdOrigin;
        $VALUES = sparseArray;
        valueMap = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)complianceData$ProductIdOrigin2);
        sparseArray.put(n4, (Object)complianceData$ProductIdOrigin);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ComplianceData$ProductIdOrigin() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ComplianceData$ProductIdOrigin forNumber(int n3) {
        return (ComplianceData$ProductIdOrigin)((Object)valueMap.get(n3));
    }

    public static ComplianceData$ProductIdOrigin valueOf(String string2) {
        return Enum.valueOf(ComplianceData$ProductIdOrigin.class, string2);
    }

    public static ComplianceData$ProductIdOrigin[] values() {
        return (ComplianceData$ProductIdOrigin[])$VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}

