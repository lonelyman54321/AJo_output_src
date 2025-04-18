/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet$1;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FieldSet$Builder {
    private SmallSortedMap fields;
    private boolean hasLazyField;
    private boolean hasNestedBuilders;
    private boolean isMutable;

    private FieldSet$Builder() {
        SmallSortedMap smallSortedMap = SmallSortedMap.newFieldMap(16);
        this(smallSortedMap);
    }

    public /* synthetic */ FieldSet$Builder(FieldSet$1 fieldSet$1) {
        this();
    }

    private FieldSet$Builder(SmallSortedMap smallSortedMap) {
        this.fields = smallSortedMap;
        this.isMutable = true;
    }

    private FieldSet buildImpl(boolean bl2) {
        SmallSortedMap smallSortedMap = this.fields;
        boolean bl3 = smallSortedMap.isEmpty();
        if (bl3) {
            return FieldSet.emptySet();
        }
        bl3 = false;
        smallSortedMap = null;
        this.isMutable = false;
        SmallSortedMap smallSortedMap2 = this.fields;
        boolean bl4 = this.hasNestedBuilders;
        if (bl4) {
            smallSortedMap2 = FieldSet.access$100(smallSortedMap2, false);
            FieldSet$Builder.replaceBuilders(smallSortedMap2, bl2);
        }
        FieldSet fieldSet = new FieldSet(smallSortedMap2, null);
        bl3 = this.hasLazyField;
        FieldSet.access$302(fieldSet, bl3);
        return fieldSet;
    }

    private void ensureIsMutable() {
        boolean bl2 = this.isMutable;
        if (!bl2) {
            SmallSortedMap smallSortedMap = this.fields;
            boolean bl3 = true;
            this.fields = smallSortedMap = FieldSet.access$100(smallSortedMap, bl3);
            this.isMutable = bl3;
        }
    }

    public static FieldSet$Builder fromFieldSet(FieldSet fieldSet) {
        boolean bl2;
        SmallSortedMap smallSortedMap = FieldSet.access$100(FieldSet.access$400(fieldSet), true);
        FieldSet$Builder fieldSet$Builder = new FieldSet$Builder(smallSortedMap);
        fieldSet$Builder.hasLazyField = bl2 = FieldSet.access$300(fieldSet);
        return fieldSet$Builder;
    }

    private void mergeFromField(Map.Entry object) {
        Object object2 = (FieldSet$FieldDescriptorLite)object.getKey();
        boolean bl2 = (object = object.getValue()) instanceof LazyField;
        if (bl2) {
            object = ((LazyField)object).getValue();
        }
        if (bl2 = object2.isRepeated()) {
            boolean bl3;
            ArrayList<Object> arrayList = (ArrayList<Object>)this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object2);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
                SmallSortedMap smallSortedMap = this.fields;
                smallSortedMap.put((Comparable)object2, (Object)arrayList);
            }
            object = ((List)object).iterator();
            while (bl3 = object.hasNext()) {
                object2 = FieldSet.access$700(object.next());
                arrayList.add(object2);
            }
        } else {
            WireFormat$JavaType wireFormat$JavaType;
            Object object3 = object2.getLiteJavaType();
            if (object3 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE)) {
                object3 = this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object2);
                if (object3 == null) {
                    object3 = this.fields;
                    object = FieldSet.access$700(object);
                    ((SmallSortedMap)object3).put((Comparable)object2, object);
                } else {
                    boolean bl4 = object3 instanceof MessageLite$Builder;
                    if (bl4) {
                        object3 = (MessageLite$Builder)object3;
                        object = (MessageLite)object;
                        object2.internalMergeFrom((MessageLite$Builder)object3, (MessageLite)object);
                    } else {
                        object3 = ((MessageLite)object3).toBuilder();
                        object = (MessageLite)object;
                        object = object2.internalMergeFrom((MessageLite$Builder)object3, (MessageLite)object).build();
                        object3 = this.fields;
                        ((SmallSortedMap)object3).put((Comparable)object2, object);
                    }
                }
            } else {
                object3 = this.fields;
                object = FieldSet.access$700(object);
                ((SmallSortedMap)object3).put((Comparable)object2, object);
            }
        }
    }

    private static Object replaceBuilder(Object object, boolean bl2) {
        boolean bl3 = object instanceof MessageLite$Builder;
        if (!bl3) {
            return object;
        }
        object = (MessageLite$Builder)object;
        if (bl2) {
            return object.buildPartial();
        }
        return object.build();
    }

    private static Object replaceBuilders(FieldSet$FieldDescriptorLite object, Object object2, boolean bl2) {
        Object object3;
        if (object2 == null) {
            return object2;
        }
        WireFormat$JavaType wireFormat$JavaType = object.getLiteJavaType();
        if (wireFormat$JavaType == (object3 = WireFormat$JavaType.MESSAGE)) {
            boolean bl3 = object.isRepeated();
            if (bl3) {
                bl3 = object2 instanceof List;
                if (bl3) {
                    int n3;
                    object = object2;
                    object = (List)object2;
                    wireFormat$JavaType = null;
                    for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
                        object3 = object.get(i3);
                        Object object4 = FieldSet$Builder.replaceBuilder(object3, bl2);
                        if (object4 == object3) continue;
                        if (object == object2) {
                            object3 = new ArrayList(object);
                            object = object3;
                        }
                        object.set(i3, object4);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder("Repeated field should contains a List but actually contains type: ");
                object2 = object2.getClass();
                stringBuilder.append(object2);
                object2 = stringBuilder.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            return FieldSet$Builder.replaceBuilder(object2, bl2);
        }
        return object2;
    }

    private static void replaceBuilders(SmallSortedMap object, boolean bl2) {
        int n3;
        int n4;
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)object).getNumArrayEntries()); ++n4) {
            Map.Entry entry2 = ((SmallSortedMap)object).getArrayEntryAt(n4);
            FieldSet$Builder.replaceBuilders(entry2, bl2);
        }
        object = ((SmallSortedMap)object).getOverflowEntries().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            FieldSet$Builder.replaceBuilders(entry, bl2);
        }
    }

    private static void replaceBuilders(Map.Entry entry, boolean bl2) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)entry.getKey();
        Object v4 = entry.getValue();
        Object object = FieldSet$Builder.replaceBuilders(fieldSet$FieldDescriptorLite, v4, bl2);
        entry.setValue(object);
    }

    private void verifyType(FieldSet$FieldDescriptorLite object, Object object2) {
        Object object3 = object.getLiteType();
        boolean bl2 = FieldSet.access$500((WireFormat$FieldType)((Object)object3), object2);
        if (!bl2) {
            Object object4;
            object3 = object.getLiteType().getJavaType();
            if (object3 == (object4 = WireFormat$JavaType.MESSAGE) && (bl2 = object2 instanceof MessageLite$Builder)) {
                return;
            }
            object4 = object.getNumber();
            object = object.getLiteType().getJavaType();
            object2 = object2.getClass().getName();
            Object[] objectArray = new Object[]{object4, object, object2};
            object = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", objectArray);
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
    }

    public void addRepeatedField(FieldSet$FieldDescriptorLite object, Object object2) {
        this.ensureIsMutable();
        boolean bl2 = object.isRepeated();
        if (bl2) {
            ArrayList<Object> arrayList;
            bl2 = this.hasNestedBuilders;
            if (!bl2 && !(bl2 = object2 instanceof MessageLite$Builder)) {
                bl2 = false;
                arrayList = null;
            } else {
                bl2 = true;
            }
            this.hasNestedBuilders = bl2;
            this.verifyType((FieldSet$FieldDescriptorLite)object, object2);
            arrayList = this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
                SmallSortedMap smallSortedMap = this.fields;
                smallSortedMap.put((Comparable)object, (Object)arrayList);
            } else {
                arrayList = arrayList;
            }
            arrayList.add(object2);
            return;
        }
        object = new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public FieldSet build() {
        return this.buildImpl(false);
    }

    public FieldSet buildPartial() {
        return this.buildImpl(true);
    }

    public void clearField(FieldSet$FieldDescriptorLite object) {
        this.ensureIsMutable();
        SmallSortedMap smallSortedMap = this.fields;
        smallSortedMap.remove(object);
        object = this.fields;
        boolean bl2 = ((AbstractMap)object).isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
            this.hasLazyField = false;
        }
    }

    public Map getAllFields() {
        boolean bl2 = this.hasLazyField;
        if (bl2) {
            SmallSortedMap smallSortedMap = FieldSet.access$100(this.fields, false);
            SmallSortedMap smallSortedMap2 = this.fields;
            boolean bl3 = smallSortedMap2.isImmutable();
            if (bl3) {
                smallSortedMap.makeImmutable();
            } else {
                bl3 = true;
                FieldSet$Builder.replaceBuilders(smallSortedMap, bl3);
            }
            return smallSortedMap;
        }
        Map map2 = this.fields;
        bl2 = map2.isImmutable();
        map2 = bl2 ? this.fields : Collections.unmodifiableMap(this.fields);
        return map2;
    }

    public Object getField(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object object = this.getFieldAllowBuilders(fieldSet$FieldDescriptorLite);
        return FieldSet$Builder.replaceBuilders(fieldSet$FieldDescriptorLite, object, true);
    }

    public Object getFieldAllowBuilders(FieldSet$FieldDescriptorLite object) {
        SmallSortedMap smallSortedMap = this.fields;
        boolean bl2 = (object = smallSortedMap.get(object)) instanceof LazyField;
        if (bl2) {
            object = ((LazyField)object).getValue();
        }
        return object;
    }

    public Object getRepeatedField(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, int n3) {
        boolean bl2 = this.hasNestedBuilders;
        if (bl2) {
            this.ensureIsMutable();
        }
        return FieldSet$Builder.replaceBuilder(this.getRepeatedFieldAllowBuilders(fieldSet$FieldDescriptorLite, n3), true);
    }

    public Object getRepeatedFieldAllowBuilders(FieldSet$FieldDescriptorLite object, int n3) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            if ((object = this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object)) != null) {
                return ((List)object).get(n3);
            }
            object = new IndexOutOfBoundsException();
            throw object;
        }
        object = new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public int getRepeatedFieldCount(FieldSet$FieldDescriptorLite object) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            if ((object = this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object)) == null) {
                return 0;
            }
            return ((List)object).size();
        }
        object = new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
        throw object;
    }

    public boolean hasField(FieldSet$FieldDescriptorLite object) {
        boolean bl2 = object.isRepeated();
        if (!bl2) {
            boolean bl3;
            SmallSortedMap smallSortedMap = this.fields;
            if ((object = smallSortedMap.get(object)) != null) {
                bl3 = true;
            } else {
                bl3 = false;
                object = null;
            }
            return bl3;
        }
        object = new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        throw object;
    }

    public boolean isInitialized() {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            n3 = (int)(FieldSet.access$600((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = (int)(FieldSet.access$600((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public void mergeFrom(FieldSet object) {
        Object object2;
        int n3;
        int n4;
        this.ensureIsMutable();
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)(object2 = FieldSet.access$400((FieldSet)object))).getNumArrayEntries()); ++n4) {
            object2 = FieldSet.access$400((FieldSet)object).getArrayEntryAt(n4);
            this.mergeFromField((Map.Entry)object2);
        }
        object = FieldSet.access$400((FieldSet)object).getOverflowEntries().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            this.mergeFromField(entry);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setField(FieldSet$FieldDescriptorLite object, Object object2) {
        this.ensureIsMutable();
        boolean bl2 = object.isRepeated();
        boolean bl3 = false;
        boolean bl4 = true;
        if (!bl2) {
            this.verifyType((FieldSet$FieldDescriptorLite)object, object2);
        } else {
            boolean bl5;
            bl2 = object2 instanceof List;
            if (!bl2) {
                object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                throw object;
            }
            object2 = (List)object2;
            ArrayList arrayList = new ArrayList(object2);
            object2 = arrayList.iterator();
            while (bl5 = object2.hasNext()) {
                Object e2 = object2.next();
                this.verifyType((FieldSet$FieldDescriptorLite)object, e2);
                boolean bl6 = this.hasNestedBuilders;
                if (!bl6 && !(bl5 = e2 instanceof MessageLite$Builder)) {
                    bl5 = false;
                    e2 = null;
                } else {
                    bl5 = true;
                }
                this.hasNestedBuilders = bl5;
            }
            object2 = arrayList;
        }
        bl2 = object2 instanceof LazyField;
        if (bl2) {
            this.hasLazyField = bl4;
        }
        if ((bl2 = this.hasNestedBuilders) || (bl2 = object2 instanceof MessageLite$Builder)) {
            bl3 = true;
        }
        this.hasNestedBuilders = bl3;
        this.fields.put((Comparable)object, object2);
    }

    public void setRepeatedField(FieldSet$FieldDescriptorLite object, int n3, Object object2) {
        this.ensureIsMutable();
        boolean bl2 = object.isRepeated();
        if (bl2) {
            Object object3;
            bl2 = this.hasNestedBuilders;
            if (!bl2 && !(bl2 = object2 instanceof MessageLite$Builder)) {
                bl2 = false;
                object3 = null;
            } else {
                bl2 = true;
            }
            this.hasNestedBuilders = bl2;
            object3 = this.getFieldAllowBuilders((FieldSet$FieldDescriptorLite)object);
            if (object3 != null) {
                this.verifyType((FieldSet$FieldDescriptorLite)object, object2);
                ((List)object3).set(n3, object2);
                return;
            }
            object = new IndexOutOfBoundsException();
            throw object;
        }
        object = new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        throw object;
    }
}

