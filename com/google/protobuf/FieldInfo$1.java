/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldType;

class FieldInfo$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FieldType fieldType;
        int n7 = FieldType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$protobuf$FieldType = nArray;
        try {
            fieldType = FieldType.MESSAGE;
            n4 = fieldType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$FieldType;
            fieldType = FieldType.GROUP;
            n4 = fieldType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$FieldType;
            fieldType = FieldType.MESSAGE_LIST;
            n4 = fieldType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$FieldType;
            fieldType = FieldType.GROUP_LIST;
            n4 = fieldType.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

