/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldType$Collection;
import com.google.protobuf.JavaType;

class FieldType$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        Enum enum_;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8 = JavaType.values().length;
        int[] nArray = new int[n8];
        $SwitchMap$com$google$protobuf$JavaType = nArray;
        int n10 = 1;
        try {
            object3 = JavaType.BYTE_STRING;
            n7 = object3.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            object3 = $SwitchMap$com$google$protobuf$JavaType;
            object2 = JavaType.MESSAGE;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (JavaType)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            object2 = $SwitchMap$com$google$protobuf$JavaType;
            enum_ = JavaType.STRING;
            n3 = enum_.ordinal();
            object2[n3] = (JavaType)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = FieldType$Collection.values().length;
        object2 = new int[n4];
        $SwitchMap$com$google$protobuf$FieldType$Collection = (int[])object2;
        try {
            enum_ = FieldType$Collection.MAP;
            n3 = enum_.ordinal();
            object2[n3] = (JavaType)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = $SwitchMap$com$google$protobuf$FieldType$Collection;
            object2 = FieldType$Collection.VECTOR;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$protobuf$FieldType$Collection;
            object = (Object)FieldType$Collection.SCALAR;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

