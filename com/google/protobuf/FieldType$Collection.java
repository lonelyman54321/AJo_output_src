/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

final class FieldType$Collection
extends Enum {
    private static final /* synthetic */ FieldType$Collection[] $VALUES;
    public static final /* enum */ FieldType$Collection MAP;
    public static final /* enum */ FieldType$Collection PACKED_VECTOR;
    public static final /* enum */ FieldType$Collection SCALAR;
    public static final /* enum */ FieldType$Collection VECTOR;
    private final boolean isList;

    static {
        FieldType$Collection fieldType$Collection;
        FieldType$Collection fieldType$Collection2;
        FieldType$Collection fieldType$Collection3;
        FieldType$Collection fieldType$Collection4;
        SCALAR = fieldType$Collection4 = new FieldType$Collection("SCALAR", 0, false);
        int n3 = 1;
        VECTOR = fieldType$Collection3 = new FieldType$Collection("VECTOR", n3, n3 != 0);
        int n4 = 2;
        PACKED_VECTOR = fieldType$Collection2 = new FieldType$Collection("PACKED_VECTOR", n4, n3 != 0);
        int n7 = 3;
        MAP = fieldType$Collection = new FieldType$Collection("MAP", n7, false);
        FieldType$Collection[] fieldType$CollectionArray = new FieldType$Collection[4];
        fieldType$CollectionArray[0] = fieldType$Collection4;
        fieldType$CollectionArray[n3] = fieldType$Collection3;
        fieldType$CollectionArray[n4] = fieldType$Collection2;
        fieldType$CollectionArray[n7] = fieldType$Collection;
        $VALUES = fieldType$CollectionArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FieldType$Collection() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.isList = var3_2;
    }

    public static FieldType$Collection valueOf(String string2) {
        return Enum.valueOf(FieldType$Collection.class, string2);
    }

    public static FieldType$Collection[] values() {
        return (FieldType$Collection[])$VALUES.clone();
    }

    public boolean isList() {
        return this.isList;
    }
}

