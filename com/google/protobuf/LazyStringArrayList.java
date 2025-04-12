/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringArrayList$ByteArrayListView;
import com.google.protobuf.LazyStringArrayList$ByteStringListView;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList
extends AbstractProtobufList
implements LazyStringList,
RandomAccess {
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List list;

    static {
        LazyStringArrayList lazyStringArrayList;
        EMPTY_LIST = lazyStringArrayList = new LazyStringArrayList(false);
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public LazyStringArrayList(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this(arrayList);
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        ArrayList arrayList;
        int n3 = lazyStringList.size();
        this.list = arrayList = new ArrayList(n3);
        this.addAll((Collection)lazyStringList);
    }

    private LazyStringArrayList(ArrayList arrayList) {
        this.list = arrayList;
    }

    public LazyStringArrayList(List list) {
        ArrayList arrayList = new ArrayList(list);
        this(arrayList);
    }

    private LazyStringArrayList(boolean bl2) {
        super(bl2);
        List list;
        this.list = list = Collections.emptyList();
    }

    public static /* synthetic */ Object access$000(LazyStringArrayList lazyStringArrayList, int n3, byte[] byArray) {
        return lazyStringArrayList.setAndReturn(n3, byArray);
    }

    public static /* synthetic */ byte[] access$100(Object object) {
        return LazyStringArrayList.asByteArray(object);
    }

    public static /* synthetic */ void access$200(LazyStringArrayList lazyStringArrayList, int n3, byte[] byArray) {
        lazyStringArrayList.add(n3, byArray);
    }

    public static /* synthetic */ Object access$300(LazyStringArrayList lazyStringArrayList, int n3, ByteString byteString) {
        return lazyStringArrayList.setAndReturn(n3, byteString);
    }

    public static /* synthetic */ ByteString access$400(Object object) {
        return LazyStringArrayList.asByteString(object);
    }

    public static /* synthetic */ void access$500(LazyStringArrayList lazyStringArrayList, int n3, ByteString byteString) {
        lazyStringArrayList.add(n3, byteString);
    }

    private void add(int n3, ByteString byteString) {
        this.ensureIsMutable();
        this.list.add(n3, byteString);
        this.modCount = n3 = this.modCount + 1;
    }

    private void add(int n3, byte[] byArray) {
        this.ensureIsMutable();
        this.list.add(n3, byArray);
        this.modCount = n3 = this.modCount + 1;
    }

    private static byte[] asByteArray(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return (byte[])object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            return Internal.toByteArray((String)object);
        }
        return ((ByteString)object).toByteArray();
    }

    private static ByteString asByteString(Object object) {
        boolean bl2 = object instanceof ByteString;
        if (bl2) {
            return (ByteString)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            return ByteString.copyFromUtf8((String)object);
        }
        return ByteString.copyFrom((byte[])object);
    }

    private static String asString(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof ByteString;
        if (bl2) {
            return ((ByteString)object).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[])object);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    private Object setAndReturn(int n3, ByteString byteString) {
        this.ensureIsMutable();
        return this.list.set(n3, byteString);
    }

    private Object setAndReturn(int n3, byte[] byArray) {
        this.ensureIsMutable();
        return this.list.set(n3, byArray);
    }

    public void add(int n3, String string2) {
        this.ensureIsMutable();
        this.list.add(n3, string2);
        this.modCount = n3 = this.modCount + 1;
    }

    public void add(ByteString byteString) {
        int n3;
        this.ensureIsMutable();
        this.list.add(byteString);
        this.modCount = n3 = this.modCount + 1;
    }

    public void add(byte[] byArray) {
        int n3;
        this.ensureIsMutable();
        this.list.add(byArray);
        this.modCount = n3 = this.modCount + 1;
    }

    public boolean addAll(int n3, Collection collection) {
        int n4;
        this.ensureIsMutable();
        boolean bl2 = collection instanceof LazyStringList;
        if (bl2) {
            collection = ((LazyStringList)collection).getUnderlyingElements();
        }
        n3 = (int)(this.list.addAll(n3, collection) ? 1 : 0);
        this.modCount = n4 = this.modCount + 1;
        return n3 != 0;
    }

    public boolean addAll(Collection collection) {
        int n3 = this.size();
        return this.addAll(n3, collection);
    }

    public boolean addAllByteArray(Collection collection) {
        int n3;
        this.ensureIsMutable();
        boolean bl2 = this.list.addAll(collection);
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public boolean addAllByteString(Collection collection) {
        int n3;
        this.ensureIsMutable();
        boolean bl2 = this.list.addAll(collection);
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public List asByteArrayList() {
        LazyStringArrayList$ByteArrayListView lazyStringArrayList$ByteArrayListView = new LazyStringArrayList$ByteArrayListView(this);
        return lazyStringArrayList$ByteArrayListView;
    }

    public List asByteStringList() {
        LazyStringArrayList$ByteStringListView lazyStringArrayList$ByteStringListView = new LazyStringArrayList$ByteStringListView(this);
        return lazyStringArrayList$ByteStringListView;
    }

    public void clear() {
        int n3;
        this.ensureIsMutable();
        this.list.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public String get(int n3) {
        Object object = this.list.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof ByteString;
        if (bl2) {
            object = (ByteString)object;
            String string2 = ((ByteString)object).toStringUtf8();
            boolean bl3 = ((ByteString)object).isValidUtf8();
            if (bl3) {
                object = this.list;
                object.set(n3, string2);
            }
            return string2;
        }
        object = (byte[])object;
        String string3 = Internal.toStringUtf8((byte[])object);
        boolean bl4 = Internal.isValidUtf8((byte[])object);
        if (bl4) {
            object = this.list;
            object.set(n3, string3);
        }
        return string3;
    }

    public byte[] getByteArray(int n3) {
        Object object = this.list.get(n3);
        byte[] byArray = LazyStringArrayList.asByteArray(object);
        if (byArray != object) {
            object = this.list;
            object.set(n3, (byte[])byArray);
        }
        return byArray;
    }

    public ByteString getByteString(int n3) {
        Object object = this.list.get(n3);
        ByteString byteString = LazyStringArrayList.asByteString(object);
        if (byteString != object) {
            object = this.list;
            object.set(n3, (ByteString)byteString);
        }
        return byteString;
    }

    public Object getRaw(int n3) {
        return this.list.get(n3);
    }

    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    public LazyStringList getUnmodifiableView() {
        boolean bl2 = this.isModifiable();
        if (bl2) {
            UnmodifiableLazyStringList unmodifiableLazyStringList = new UnmodifiableLazyStringList(this);
            return unmodifiableLazyStringList;
        }
        return this;
    }

    public void mergeFrom(LazyStringList object) {
        boolean bl2;
        this.ensureIsMutable();
        object = object.getUnderlyingElements().iterator();
        while (bl2 = object.hasNext()) {
            List list;
            Object object2 = object.next();
            boolean bl3 = object2 instanceof byte[];
            if (bl3) {
                object2 = (byte[])object2;
                list = this.list;
                int n3 = ((E)object2).length;
                object2 = Arrays.copyOf(object2, n3);
                list.add(object2);
                continue;
            }
            list = this.list;
            list.add(object2);
        }
    }

    public LazyStringArrayList mutableCopyWithCapacity(int n3) {
        int n4 = this.size();
        if (n3 >= n4) {
            ArrayList arrayList = new ArrayList(n3);
            List list = this.list;
            arrayList.addAll(list);
            list = new LazyStringArrayList(arrayList);
            return list;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public String remove(int n3) {
        int n4;
        this.ensureIsMutable();
        Object e2 = this.list.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return LazyStringArrayList.asString(e2);
    }

    public String set(int n3, String string2) {
        this.ensureIsMutable();
        return LazyStringArrayList.asString(this.list.set(n3, string2));
    }

    public void set(int n3, ByteString byteString) {
        this.setAndReturn(n3, byteString);
    }

    public void set(int n3, byte[] byArray) {
        this.setAndReturn(n3, byArray);
    }

    public int size() {
        return this.list.size();
    }
}

