/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$MapAdapter$Converter;

class Internal$MapAdapter$1
implements Internal$MapAdapter$Converter {
    final /* synthetic */ Internal$EnumLiteMap val$enumMap;
    final /* synthetic */ Internal$EnumLite val$unrecognizedValue;

    public Internal$MapAdapter$1(Internal$EnumLiteMap internal$EnumLiteMap, Internal$EnumLite internal$EnumLite) {
        this.val$enumMap = internal$EnumLiteMap;
        this.val$unrecognizedValue = internal$EnumLite;
    }

    public Integer doBackward(Internal$EnumLite internal$EnumLite) {
        return internal$EnumLite.getNumber();
    }

    public Internal$EnumLite doForward(Integer object) {
        Internal$EnumLiteMap internal$EnumLiteMap = this.val$enumMap;
        int n3 = (Integer)object;
        if ((object = internal$EnumLiteMap.findValueByNumber(n3)) == null) {
            object = this.val$unrecognizedValue;
        }
        return object;
    }
}

