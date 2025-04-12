/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ChangeType$1;
import com.google.api.ChangeType$ChangeTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class ChangeType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ ChangeType[] $VALUES;
    public static final /* enum */ ChangeType ADDED;
    public static final int ADDED_VALUE = 1;
    public static final /* enum */ ChangeType CHANGE_TYPE_UNSPECIFIED;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ ChangeType MODIFIED;
    public static final int MODIFIED_VALUE = 3;
    public static final /* enum */ ChangeType REMOVED;
    public static final int REMOVED_VALUE = 2;
    public static final /* enum */ ChangeType UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        ChangeType changeType;
        ChangeType changeType2;
        ChangeType changeType3;
        ChangeType changeType4;
        Object object = new ChangeType("CHANGE_TYPE_UNSPECIFIED", 0, 0);
        CHANGE_TYPE_UNSPECIFIED = object;
        int n3 = 1;
        ADDED = changeType4 = new ChangeType("ADDED", n3, n3);
        int n4 = 2;
        REMOVED = changeType3 = new ChangeType("REMOVED", n4, n4);
        int n7 = 3;
        MODIFIED = changeType2 = new ChangeType("MODIFIED", n7, n7);
        int n8 = 4;
        UNRECOGNIZED = changeType = new ChangeType("UNRECOGNIZED", n8, -1);
        ChangeType[] changeTypeArray = new ChangeType[5];
        changeTypeArray[0] = object;
        changeTypeArray[n3] = changeType4;
        changeTypeArray[n4] = changeType3;
        changeTypeArray[n7] = changeType2;
        changeTypeArray[n8] = changeType;
        $VALUES = changeTypeArray;
        internalValueMap = object = new ChangeType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ChangeType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ChangeType forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return MODIFIED;
                }
                return REMOVED;
            }
            return ADDED;
        }
        return CHANGE_TYPE_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return ChangeType$ChangeTypeVerifier.INSTANCE;
    }

    public static ChangeType valueOf(int n3) {
        return ChangeType.forNumber(n3);
    }

    public static ChangeType valueOf(String string2) {
        return Enum.valueOf(ChangeType.class, string2);
    }

    public static ChangeType[] values() {
        return (ChangeType[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

