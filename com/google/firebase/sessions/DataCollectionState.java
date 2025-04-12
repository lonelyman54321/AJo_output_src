/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

public final class DataCollectionState
extends Enum
implements NumberedEnum {
    private static final /* synthetic */ DataCollectionState[] $VALUES;
    public static final /* enum */ DataCollectionState COLLECTION_DISABLED;
    public static final /* enum */ DataCollectionState COLLECTION_DISABLED_REMOTE;
    public static final /* enum */ DataCollectionState COLLECTION_ENABLED;
    public static final /* enum */ DataCollectionState COLLECTION_SAMPLED;
    public static final /* enum */ DataCollectionState COLLECTION_SDK_NOT_INSTALLED;
    public static final /* enum */ DataCollectionState COLLECTION_UNKNOWN;
    private final int number;

    private static final /* synthetic */ DataCollectionState[] $values() {
        DataCollectionState dataCollectionState = COLLECTION_UNKNOWN;
        dataCollectionState = COLLECTION_SDK_NOT_INSTALLED;
        dataCollectionState = COLLECTION_ENABLED;
        dataCollectionState = COLLECTION_DISABLED;
        dataCollectionState = COLLECTION_DISABLED_REMOTE;
        dataCollectionState = COLLECTION_SAMPLED;
        DataCollectionState[] dataCollectionStateArray = new DataCollectionState[]{dataCollectionState, dataCollectionState, dataCollectionState, dataCollectionState, dataCollectionState, dataCollectionState};
        return dataCollectionStateArray;
    }

    static {
        DataCollectionState dataCollectionState;
        COLLECTION_UNKNOWN = dataCollectionState = new DataCollectionState("COLLECTION_UNKNOWN", 0, 0);
        int n3 = 1;
        COLLECTION_SDK_NOT_INSTALLED = dataCollectionState = new DataCollectionState("COLLECTION_SDK_NOT_INSTALLED", n3, n3);
        n3 = 2;
        COLLECTION_ENABLED = dataCollectionState = new DataCollectionState("COLLECTION_ENABLED", n3, n3);
        n3 = 3;
        COLLECTION_DISABLED = dataCollectionState = new DataCollectionState("COLLECTION_DISABLED", n3, n3);
        n3 = 4;
        COLLECTION_DISABLED_REMOTE = dataCollectionState = new DataCollectionState("COLLECTION_DISABLED_REMOTE", n3, n3);
        n3 = 5;
        COLLECTION_SAMPLED = dataCollectionState = new DataCollectionState("COLLECTION_SAMPLED", n3, n3);
        $VALUES = DataCollectionState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DataCollectionState() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number = var3_2;
    }

    public static DataCollectionState valueOf(String string2) {
        return Enum.valueOf(DataCollectionState.class, string2);
    }

    public static DataCollectionState[] values() {
        return (DataCollectionState[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number;
    }
}

