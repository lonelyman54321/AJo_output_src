/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.ListFieldSchema$1;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.UnmodifiableLazyStringList;
import com.google.protobuf.UnsafeUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ListFieldSchema$ListFieldSchemaFull
extends ListFieldSchema {
    private static final Class UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ListFieldSchema$ListFieldSchemaFull() {
        super(null);
    }

    public /* synthetic */ ListFieldSchema$ListFieldSchemaFull(ListFieldSchema$1 listFieldSchema$1) {
        this();
    }

    public static List getList(Object object, long l2) {
        return (List)UnsafeUtil.getObject(object, l2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static List mutableListAt(Object object, long l2, int n3) {
        void var4_12;
        List list = ListFieldSchema$ListFieldSchemaFull.getList(object, l2);
        boolean bl2 = list.isEmpty();
        if (bl2) {
            void var4_7;
            bl2 = list instanceof LazyStringList;
            if (bl2) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(n3);
            } else {
                bl2 = list instanceof PrimitiveNonBoxingCollection;
                if (bl2 && (bl2 = list instanceof Internal$ProtobufList)) {
                    Internal$ProtobufList internal$ProtobufList;
                    Internal$ProtobufList internal$ProtobufList2 = internal$ProtobufList = ((Internal$ProtobufList)list).mutableCopyWithCapacity(n3);
                } else {
                    ArrayList arrayList = new ArrayList(n3);
                }
            }
            UnsafeUtil.putObject(object, l2, (Object)var4_7);
            return (List)var4_12;
        }
        Object object2 = UNMODIFIABLE_LIST_CLASS;
        Class<?> clazz = list.getClass();
        bl2 = ((Class)object2).isAssignableFrom(clazz);
        if (bl2) {
            int n4 = list.size() + n3;
            object2 = new Object(n4);
            ((ArrayList)object2).addAll(list);
            UnsafeUtil.putObject(object, l2, object2);
        } else {
            bl2 = list instanceof UnmodifiableLazyStringList;
            if (!bl2) {
                bl2 = list instanceof PrimitiveNonBoxingCollection;
                if (!bl2) return (List)var4_12;
                bl2 = list instanceof Internal$ProtobufList;
                if (!bl2) return (List)var4_12;
                object2 = list;
                object2 = (Internal$ProtobufList)list;
                boolean bl3 = object2.isModifiable();
                if (bl3) return (List)var4_12;
                int n7 = list.size() + n3;
                Internal$ProtobufList internal$ProtobufList = object2.mutableCopyWithCapacity(n7);
                UnsafeUtil.putObject(object, l2, (Object)internal$ProtobufList);
                return (List)var4_12;
            }
            int n8 = list.size() + n3;
            object2 = new Object(n8);
            UnmodifiableLazyStringList unmodifiableLazyStringList = (UnmodifiableLazyStringList)list;
            ((LazyStringArrayList)object2).addAll((Collection)unmodifiableLazyStringList);
            UnsafeUtil.putObject(object, l2, object2);
        }
        List list2 = object2;
        return (List)var4_12;
    }

    public void makeImmutableListAt(Object object, long l2) {
        Internal$ProtobufList internal$ProtobufList = (Internal$ProtobufList)UnsafeUtil.getObject(object, l2);
        boolean bl2 = internal$ProtobufList instanceof LazyStringList;
        if (bl2) {
            internal$ProtobufList = ((LazyStringList)((Object)internal$ProtobufList)).getUnmodifiableView();
        } else {
            Class clazz = UNMODIFIABLE_LIST_CLASS;
            Class<?> clazz2 = internal$ProtobufList.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            bl2 = internal$ProtobufList instanceof PrimitiveNonBoxingCollection;
            if (bl2 && (bl2 = internal$ProtobufList instanceof Internal$ProtobufList)) {
                boolean bl3 = (internal$ProtobufList = (Internal$ProtobufList)internal$ProtobufList).isModifiable();
                if (bl3) {
                    internal$ProtobufList.makeImmutable();
                }
                return;
            }
            internal$ProtobufList = Collections.unmodifiableList(internal$ProtobufList);
        }
        UnsafeUtil.putObject(object, l2, (Object)internal$ProtobufList);
    }

    public void mergeListsAt(Object object, Object object2, long l2) {
        object2 = ListFieldSchema$ListFieldSchemaFull.getList(object2, l2);
        int n3 = object2.size();
        List list = ListFieldSchema$ListFieldSchemaFull.mutableListAt(object, l2, n3);
        int n4 = list.size();
        int n7 = object2.size();
        if (n4 > 0 && n7 > 0) {
            list.addAll(object2);
        }
        if (n4 > 0) {
            object2 = list;
        }
        UnsafeUtil.putObject(object, l2, object2);
    }

    public List mutableListAt(Object object, long l2) {
        return ListFieldSchema$ListFieldSchemaFull.mutableListAt(object, l2, 10);
    }
}

