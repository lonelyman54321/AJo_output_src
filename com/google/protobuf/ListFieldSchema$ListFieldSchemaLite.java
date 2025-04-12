/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.ListFieldSchema$1;
import com.google.protobuf.UnsafeUtil;
import java.util.List;

final class ListFieldSchema$ListFieldSchemaLite
extends ListFieldSchema {
    private ListFieldSchema$ListFieldSchemaLite() {
        super(null);
    }

    public /* synthetic */ ListFieldSchema$ListFieldSchemaLite(ListFieldSchema$1 listFieldSchema$1) {
        this();
    }

    public static Internal$ProtobufList getProtobufList(Object object, long l2) {
        return (Internal$ProtobufList)UnsafeUtil.getObject(object, l2);
    }

    public void makeImmutableListAt(Object object, long l2) {
        ListFieldSchema$ListFieldSchemaLite.getProtobufList(object, l2).makeImmutable();
    }

    public void mergeListsAt(Object object, Object object2, long l2) {
        Internal$ProtobufList internal$ProtobufList = ListFieldSchema$ListFieldSchemaLite.getProtobufList(object, l2);
        object2 = ListFieldSchema$ListFieldSchemaLite.getProtobufList(object2, l2);
        int n3 = internal$ProtobufList.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = internal$ProtobufList.isModifiable();
            if (!bl2) {
                internal$ProtobufList = internal$ProtobufList.mutableCopyWithCapacity(n4 += n3);
            }
            internal$ProtobufList.addAll(object2);
        }
        if (n3 > 0) {
            object2 = internal$ProtobufList;
        }
        UnsafeUtil.putObject(object, l2, object2);
    }

    public List mutableListAt(Object object, long l2) {
        Internal$ProtobufList internal$ProtobufList = ListFieldSchema$ListFieldSchemaLite.getProtobufList(object, l2);
        int n3 = internal$ProtobufList.isModifiable();
        if (n3 == 0) {
            n3 = internal$ProtobufList.size();
            n3 = n3 == 0 ? 10 : (n3 *= 2);
            internal$ProtobufList = internal$ProtobufList.mutableCopyWithCapacity(n3);
            UnsafeUtil.putObject(object, l2, (Object)internal$ProtobufList);
        }
        return internal$ProtobufList;
    }
}

