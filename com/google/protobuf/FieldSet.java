/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.FieldSet$1;
import com.google.protobuf.FieldSet$Builder;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.LazyField$LazyIterator;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.WireFormat$Utf8Validation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FieldSet {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final FieldSet DEFAULT_INSTANCE;
    private final SmallSortedMap fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    static {
        FieldSet fieldSet;
        DEFAULT_INSTANCE = fieldSet = new FieldSet(true);
    }

    private FieldSet() {
        SmallSortedMap smallSortedMap;
        this.fields = smallSortedMap = SmallSortedMap.newFieldMap(16);
    }

    private FieldSet(SmallSortedMap smallSortedMap) {
        this.fields = smallSortedMap;
        this.makeImmutable();
    }

    public /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, FieldSet$1 fieldSet$1) {
        this(smallSortedMap);
    }

    private FieldSet(boolean bl2) {
        SmallSortedMap smallSortedMap = SmallSortedMap.newFieldMap(0);
        this(smallSortedMap);
        this.makeImmutable();
    }

    public static /* synthetic */ SmallSortedMap access$100(SmallSortedMap smallSortedMap, boolean bl2) {
        return FieldSet.cloneAllFieldsMap(smallSortedMap, bl2);
    }

    public static /* synthetic */ boolean access$300(FieldSet fieldSet) {
        return fieldSet.hasLazyField;
    }

    public static /* synthetic */ boolean access$302(FieldSet fieldSet, boolean bl2) {
        fieldSet.hasLazyField = bl2;
        return bl2;
    }

    public static /* synthetic */ SmallSortedMap access$400(FieldSet fieldSet) {
        return fieldSet.fields;
    }

    public static /* synthetic */ boolean access$500(WireFormat$FieldType wireFormat$FieldType, Object object) {
        return FieldSet.isValidType(wireFormat$FieldType, object);
    }

    public static /* synthetic */ boolean access$600(Map.Entry entry) {
        return FieldSet.isInitialized(entry);
    }

    public static /* synthetic */ Object access$700(Object object) {
        return FieldSet.cloneIfMutable(object);
    }

    private static SmallSortedMap cloneAllFieldsMap(SmallSortedMap object, boolean bl2) {
        int n3;
        int n4;
        int n7 = 16;
        SmallSortedMap smallSortedMap = SmallSortedMap.newFieldMap(n7);
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)object).getNumArrayEntries()); ++n4) {
            Map.Entry entry2 = ((SmallSortedMap)object).getArrayEntryAt(n4);
            FieldSet.cloneFieldEntry(smallSortedMap, entry2, bl2);
        }
        object = ((SmallSortedMap)object).getOverflowEntries().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            FieldSet.cloneFieldEntry(smallSortedMap, entry, bl2);
        }
        return smallSortedMap;
    }

    private static void cloneFieldEntry(Map map2, Map.Entry object, boolean bl2) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
        boolean bl3 = (object = object.getValue()) instanceof LazyField;
        if (bl3) {
            object = ((LazyField)object).getValue();
            map2.put(fieldSet$FieldDescriptorLite, object);
        } else if (bl2 && (bl2 = object instanceof List)) {
            object = (List)object;
            ArrayList arrayList = new ArrayList(object);
            map2.put(fieldSet$FieldDescriptorLite, arrayList);
        } else {
            map2.put(fieldSet$FieldDescriptorLite, object);
        }
    }

    private static Object cloneIfMutable(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            object = (byte[])object;
            byte[] byArray = new byte[((Object)object).length];
            int n3 = ((Object)object).length;
            System.arraycopy(object, 0, byArray, 0, n3);
            return byArray;
        }
        return object;
    }

    public static int computeElementSize(WireFormat$FieldType wireFormat$FieldType, int n3, Object object) {
        n3 = CodedOutputStream.computeTagSize(n3);
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.GROUP;
        if (wireFormat$FieldType == wireFormat$FieldType2) {
            n3 *= 2;
        }
        int n4 = FieldSet.computeElementSizeNoTag(wireFormat$FieldType, object);
        return n3 + n4;
    }

    public static int computeElementSizeNoTag(WireFormat$FieldType object, Object object2) {
        int[] nArray = FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw object;
            }
            case 18: {
                n3 = object2 instanceof Internal$EnumLite;
                if (n3 != 0) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal$EnumLite)object2).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag((Integer)object2);
            }
            case 17: {
                return CodedOutputStream.computeSInt64SizeNoTag((Long)object2);
            }
            case 16: {
                return CodedOutputStream.computeSInt32SizeNoTag((Integer)object2);
            }
            case 15: {
                return CodedOutputStream.computeSFixed64SizeNoTag((Long)object2);
            }
            case 14: {
                return CodedOutputStream.computeSFixed32SizeNoTag((Integer)object2);
            }
            case 13: {
                return CodedOutputStream.computeUInt32SizeNoTag((Integer)object2);
            }
            case 12: {
                n3 = object2 instanceof ByteString;
                if (n3 != 0) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString)object2);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[])object2);
            }
            case 11: {
                n3 = object2 instanceof ByteString;
                if (n3 != 0) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString)object2);
                }
                return CodedOutputStream.computeStringSizeNoTag((String)object2);
            }
            case 10: {
                n3 = object2 instanceof LazyField;
                if (n3 != 0) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField)object2);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite)object2);
            }
            case 9: {
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite)object2);
            }
            case 8: {
                return CodedOutputStream.computeBoolSizeNoTag((Boolean)object2);
            }
            case 7: {
                return CodedOutputStream.computeFixed32SizeNoTag((Integer)object2);
            }
            case 6: {
                return CodedOutputStream.computeFixed64SizeNoTag((Long)object2);
            }
            case 5: {
                return CodedOutputStream.computeInt32SizeNoTag((Integer)object2);
            }
            case 4: {
                return CodedOutputStream.computeUInt64SizeNoTag((Long)object2);
            }
            case 3: {
                return CodedOutputStream.computeInt64SizeNoTag((Long)object2);
            }
            case 2: {
                return CodedOutputStream.computeFloatSizeNoTag(((Float)object2).floatValue());
            }
            case 1: 
        }
        return CodedOutputStream.computeDoubleSizeNoTag((Double)object2);
    }

    public static int computeFieldSize(FieldSet$FieldDescriptorLite iterator, Object object) {
        WireFormat$FieldType wireFormat$FieldType = iterator.getLiteType();
        int n3 = iterator.getNumber();
        int n4 = (int)(iterator.isRepeated() ? 1 : 0);
        if (n4 != 0) {
            int n7;
            object = (List)object;
            int n8 = iterator.isPacked();
            n4 = 0;
            if (n8 != 0) {
                int n10;
                n8 = object.isEmpty();
                if (n8 != 0) {
                    return 0;
                }
                iterator = object.iterator();
                while ((n10 = iterator.hasNext()) != 0) {
                    object = iterator.next();
                    n10 = FieldSet.computeElementSizeNoTag(wireFormat$FieldType, object);
                    n4 += n10;
                }
                n8 = CodedOutputStream.computeTagSize(n3) + n4;
                return CodedOutputStream.computeUInt32SizeNoTag(n4) + n8;
            }
            iterator = object.iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object = iterator.next();
                n7 = FieldSet.computeElementSize(wireFormat$FieldType, n3, object);
                n4 += n7;
            }
            return n4;
        }
        return FieldSet.computeElementSize(wireFormat$FieldType, n3, object);
    }

    public static FieldSet emptySet() {
        return DEFAULT_INSTANCE;
    }

    private int getMessageSetSerializedSize(Map.Entry entry) {
        boolean bl2;
        WireFormat$JavaType wireFormat$JavaType;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)entry.getKey();
        Object object = entry.getValue();
        WireFormat$JavaType wireFormat$JavaType2 = fieldSet$FieldDescriptorLite.getLiteJavaType();
        if (wireFormat$JavaType2 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE) && !(bl2 = fieldSet$FieldDescriptorLite.isRepeated()) && !(bl2 = fieldSet$FieldDescriptorLite.isPacked())) {
            boolean bl3 = object instanceof LazyField;
            if (bl3) {
                int n3 = ((FieldSet$FieldDescriptorLite)entry.getKey()).getNumber();
                object = (LazyField)object;
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(n3, object);
            }
            int n4 = ((FieldSet$FieldDescriptorLite)entry.getKey()).getNumber();
            object = (MessageLite)object;
            return CodedOutputStream.computeMessageSetExtensionSize(n4, object);
        }
        return FieldSet.computeFieldSize(fieldSet$FieldDescriptorLite, object);
    }

    public static int getWireFormatForFieldType(WireFormat$FieldType wireFormat$FieldType, boolean bl2) {
        if (bl2) {
            return 2;
        }
        return wireFormat$FieldType.getWireType();
    }

    private static boolean isInitialized(Map.Entry object) {
        WireFormat$JavaType wireFormat$JavaType;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
        WireFormat$JavaType wireFormat$JavaType2 = fieldSet$FieldDescriptorLite.getLiteJavaType();
        if (wireFormat$JavaType2 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE)) {
            boolean bl2 = fieldSet$FieldDescriptorLite.isRepeated();
            if (bl2) {
                object = ((List)object.getValue()).iterator();
                while (bl2 = object.hasNext()) {
                    fieldSet$FieldDescriptorLite = object.next();
                    bl2 = FieldSet.isMessageFieldValueInitialized(fieldSet$FieldDescriptorLite);
                    if (bl2) continue;
                    return false;
                }
            } else {
                return FieldSet.isMessageFieldValueInitialized(object.getValue());
            }
        }
        return true;
    }

    private static boolean isMessageFieldValueInitialized(Object object) {
        boolean bl2 = object instanceof MessageLiteOrBuilder;
        if (bl2) {
            return ((MessageLiteOrBuilder)object).isInitialized();
        }
        boolean bl3 = object instanceof LazyField;
        if (bl3) {
            return true;
        }
        object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw object;
    }

    private static boolean isValidType(WireFormat$FieldType enum_, Object object) {
        Internal.checkNotNull(object);
        int[] nArray = FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$JavaType;
        enum_ = ((WireFormat$FieldType)enum_).getJavaType();
        int n3 = enum_.ordinal();
        n3 = nArray[n3];
        boolean bl2 = true;
        switch (n3) {
            default: {
                return false;
            }
            case 9: {
                n3 = object instanceof MessageLite;
                if (n3 == 0 && (n3 = object instanceof LazyField) == 0) {
                    bl2 = false;
                    nArray = null;
                }
                return bl2;
            }
            case 8: {
                n3 = object instanceof Integer;
                if (n3 == 0 && (n3 = object instanceof Internal$EnumLite) == 0) {
                    bl2 = false;
                    nArray = null;
                }
                return bl2;
            }
            case 7: {
                n3 = object instanceof ByteString;
                if (n3 == 0 && (n3 = object instanceof byte[]) == 0) {
                    bl2 = false;
                    nArray = null;
                }
                return bl2;
            }
            case 6: {
                return object instanceof String;
            }
            case 5: {
                return object instanceof Boolean;
            }
            case 4: {
                return object instanceof Double;
            }
            case 3: {
                return object instanceof Float;
            }
            case 2: {
                return object instanceof Long;
            }
            case 1: 
        }
        return object instanceof Integer;
    }

    private void mergeFromField(Map.Entry object) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
        boolean bl2 = (object = object.getValue()) instanceof LazyField;
        if (bl2) {
            object = ((LazyField)object).getValue();
        }
        if (bl2 = fieldSet$FieldDescriptorLite.isRepeated()) {
            boolean bl3;
            ArrayList arrayList = this.getField(fieldSet$FieldDescriptorLite);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            object = ((List)object).iterator();
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                List list = arrayList;
                list = arrayList;
                object2 = FieldSet.cloneIfMutable(object2);
                list.add(object2);
            }
            object = this.fields;
            ((SmallSortedMap)object).put(fieldSet$FieldDescriptorLite, (Object)arrayList);
        } else {
            WireFormat$JavaType wireFormat$JavaType;
            Object object3 = fieldSet$FieldDescriptorLite.getLiteJavaType();
            if (object3 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE)) {
                object3 = this.getField(fieldSet$FieldDescriptorLite);
                if (object3 == null) {
                    object3 = this.fields;
                    object = FieldSet.cloneIfMutable(object);
                    ((SmallSortedMap)object3).put(fieldSet$FieldDescriptorLite, object);
                } else {
                    object3 = ((MessageLite)object3).toBuilder();
                    object = (MessageLite)object;
                    object = fieldSet$FieldDescriptorLite.internalMergeFrom((MessageLite$Builder)object3, (MessageLite)object).build();
                    object3 = this.fields;
                    ((SmallSortedMap)object3).put(fieldSet$FieldDescriptorLite, object);
                }
            } else {
                object3 = this.fields;
                object = FieldSet.cloneIfMutable(object);
                ((SmallSortedMap)object3).put(fieldSet$FieldDescriptorLite, object);
            }
        }
    }

    public static FieldSet$Builder newBuilder() {
        FieldSet$Builder fieldSet$Builder = new FieldSet$Builder(null);
        return fieldSet$Builder;
    }

    public static FieldSet newFieldSet() {
        FieldSet fieldSet = new FieldSet();
        return fieldSet;
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat$FieldType wireFormat$FieldType, boolean bl2) {
        if (bl2) {
            WireFormat$Utf8Validation wireFormat$Utf8Validation = WireFormat$Utf8Validation.STRICT;
            return WireFormat.readPrimitiveField(codedInputStream, wireFormat$FieldType, wireFormat$Utf8Validation);
        }
        WireFormat$Utf8Validation wireFormat$Utf8Validation = WireFormat$Utf8Validation.LOOSE;
        return WireFormat.readPrimitiveField(codedInputStream, wireFormat$FieldType, wireFormat$Utf8Validation);
    }

    private void verifyType(FieldSet$FieldDescriptorLite object, Object object2) {
        Object object3 = object.getLiteType();
        boolean bl2 = FieldSet.isValidType(object3, object2);
        if (bl2) {
            return;
        }
        Integer n3 = object.getNumber();
        object = object.getLiteType().getJavaType();
        object2 = object2.getClass().getName();
        Object[] objectArray = new Object[]{n3, object, object2};
        object = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", objectArray);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int n3, Object object) {
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.GROUP;
        if (wireFormat$FieldType == wireFormat$FieldType2) {
            object = (MessageLite)object;
            codedOutputStream.writeGroup(n3, (MessageLite)object);
        } else {
            wireFormat$FieldType2 = null;
            int n4 = FieldSet.getWireFormatForFieldType(wireFormat$FieldType, false);
            codedOutputStream.writeTag(n3, n4);
            FieldSet.writeElementNoTag(codedOutputStream, wireFormat$FieldType, object);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, Object object) {
        int[] nArray = FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n3 = wireFormat$FieldType.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                break;
            }
            case 18: {
                n3 = object instanceof Internal$EnumLite;
                if (n3 != 0) {
                    object = (Internal$EnumLite)object;
                    n3 = object.getNumber();
                    codedOutputStream.writeEnumNoTag(n3);
                    break;
                }
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeEnumNoTag(n3);
                break;
            }
            case 17: {
                object = (Long)object;
                long l2 = (Long)object;
                codedOutputStream.writeSInt64NoTag(l2);
                break;
            }
            case 16: {
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeSInt32NoTag(n3);
                break;
            }
            case 15: {
                object = (Long)object;
                long l3 = (Long)object;
                codedOutputStream.writeSFixed64NoTag(l3);
                break;
            }
            case 14: {
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeSFixed32NoTag(n3);
                break;
            }
            case 13: {
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeUInt32NoTag(n3);
                break;
            }
            case 12: {
                n3 = object instanceof ByteString;
                if (n3 != 0) {
                    object = (ByteString)object;
                    codedOutputStream.writeBytesNoTag((ByteString)object);
                    break;
                }
                object = (byte[])object;
                codedOutputStream.writeByteArrayNoTag((byte[])object);
                break;
            }
            case 11: {
                n3 = object instanceof ByteString;
                if (n3 != 0) {
                    object = (ByteString)object;
                    codedOutputStream.writeBytesNoTag((ByteString)object);
                    break;
                }
                object = (String)object;
                codedOutputStream.writeStringNoTag((String)object);
                break;
            }
            case 10: {
                object = (MessageLite)object;
                codedOutputStream.writeMessageNoTag((MessageLite)object);
                break;
            }
            case 9: {
                object = (MessageLite)object;
                codedOutputStream.writeGroupNoTag((MessageLite)object);
                break;
            }
            case 8: {
                object = (Boolean)object;
                n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                codedOutputStream.writeBoolNoTag(n3 != 0);
                break;
            }
            case 7: {
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeFixed32NoTag(n3);
                break;
            }
            case 6: {
                object = (Long)object;
                long l4 = (Long)object;
                codedOutputStream.writeFixed64NoTag(l4);
                break;
            }
            case 5: {
                object = (Integer)object;
                n3 = (Integer)object;
                codedOutputStream.writeInt32NoTag(n3);
                break;
            }
            case 4: {
                object = (Long)object;
                long l7 = (Long)object;
                codedOutputStream.writeUInt64NoTag(l7);
                break;
            }
            case 3: {
                object = (Long)object;
                long l8 = (Long)object;
                codedOutputStream.writeInt64NoTag(l8);
                break;
            }
            case 2: {
                object = (Float)object;
                float f5 = ((Float)object).floatValue();
                codedOutputStream.writeFloatNoTag(f5);
                break;
            }
            case 1: {
                object = (Double)object;
                double d2 = (Double)object;
                codedOutputStream.writeDoubleNoTag(d2);
            }
        }
    }

    public static void writeField(FieldSet$FieldDescriptorLite iterator, Object object, CodedOutputStream codedOutputStream) {
        WireFormat$FieldType wireFormat$FieldType = iterator.getLiteType();
        int n3 = iterator.getNumber();
        int n4 = iterator.isRepeated();
        if (n4 != 0) {
            object = (List)object;
            int n7 = iterator.isPacked();
            if (n7 != 0) {
                boolean bl2;
                n7 = object.isEmpty();
                if (n7 != 0) {
                    return;
                }
                n7 = 2;
                codedOutputStream.writeTag(n3, n7);
                iterator = object.iterator();
                n3 = 0;
                while ((n4 = iterator.hasNext()) != 0) {
                    Object e2 = iterator.next();
                    n4 = FieldSet.computeElementSizeNoTag(wireFormat$FieldType, e2);
                    n3 += n4;
                }
                codedOutputStream.writeUInt32NoTag(n3);
                iterator = object.iterator();
                while (bl2 = iterator.hasNext()) {
                    object = iterator.next();
                    FieldSet.writeElementNoTag(codedOutputStream, wireFormat$FieldType, object);
                }
            } else {
                boolean bl3;
                iterator = object.iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    FieldSet.writeElement(codedOutputStream, wireFormat$FieldType, n3, object);
                }
            }
        } else {
            boolean bl4 = object instanceof LazyField;
            if (bl4) {
                object = (LazyField)object;
                iterator = ((LazyField)object).getValue();
                FieldSet.writeElement(codedOutputStream, wireFormat$FieldType, n3, iterator);
            } else {
                FieldSet.writeElement(codedOutputStream, wireFormat$FieldType, n3, object);
            }
        }
    }

    private void writeMessageSetTo(Map.Entry object, CodedOutputStream codedOutputStream) {
        boolean bl2;
        WireFormat$JavaType wireFormat$JavaType;
        Object object2 = (FieldSet$FieldDescriptorLite)object.getKey();
        WireFormat$JavaType wireFormat$JavaType2 = object2.getLiteJavaType();
        if (wireFormat$JavaType2 == (wireFormat$JavaType = WireFormat$JavaType.MESSAGE) && !(bl2 = object2.isRepeated()) && !(bl2 = object2.isPacked())) {
            object2 = object.getValue();
            bl2 = object2 instanceof LazyField;
            if (bl2) {
                object2 = ((LazyField)object2).toByteString();
                object = (FieldSet$FieldDescriptorLite)object.getKey();
                int n3 = object.getNumber();
                codedOutputStream.writeRawMessageSetExtension(n3, (ByteString)object2);
            } else {
                object = (FieldSet$FieldDescriptorLite)object.getKey();
                int n4 = object.getNumber();
                object2 = (MessageLite)object2;
                codedOutputStream.writeMessageSetExtension(n4, (MessageLite)object2);
            }
        } else {
            object = object.getValue();
            FieldSet.writeField((FieldSet$FieldDescriptorLite)object2, object, codedOutputStream);
        }
    }

    public void addRepeatedField(FieldSet$FieldDescriptorLite object, Object object2) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            this.verifyType((FieldSet$FieldDescriptorLite)object, object2);
            ArrayList<Object> arrayList = this.getField((FieldSet$FieldDescriptorLite)object);
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

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(FieldSet$FieldDescriptorLite object) {
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

    public FieldSet clone() {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite;
        Object object;
        int n3;
        int n4;
        FieldSet fieldSet = FieldSet.newFieldSet();
        Iterator iterator = null;
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++n4) {
            object = this.fields.getArrayEntryAt(n4);
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            fieldSet.setField(fieldSet$FieldDescriptorLite, object);
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            fieldSet.setField(fieldSet$FieldDescriptorLite, object);
        }
        n4 = (int)(this.hasLazyField ? 1 : 0);
        fieldSet.hasLazyField = n4;
        return fieldSet;
    }

    public Iterator descendingIterator() {
        boolean bl2 = this.hasLazyField;
        if (bl2) {
            Iterator iterator = this.fields.descendingEntrySet().iterator();
            LazyField$LazyIterator lazyField$LazyIterator = new LazyField$LazyIterator(iterator);
            return lazyField$LazyIterator;
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof FieldSet;
        if (!bl2) {
            return false;
        }
        object = (FieldSet)object;
        SmallSortedMap smallSortedMap = this.fields;
        object = ((FieldSet)object).fields;
        return smallSortedMap.equals(object);
    }

    public Map getAllFields() {
        boolean bl2 = this.hasLazyField;
        if (bl2) {
            SmallSortedMap smallSortedMap = FieldSet.cloneAllFieldsMap(this.fields, false);
            SmallSortedMap smallSortedMap2 = this.fields;
            boolean bl3 = smallSortedMap2.isImmutable();
            if (bl3) {
                smallSortedMap.makeImmutable();
            }
            return smallSortedMap;
        }
        Map map2 = this.fields;
        bl2 = map2.isImmutable();
        map2 = bl2 ? this.fields : Collections.unmodifiableMap(this.fields);
        return map2;
    }

    public Object getField(FieldSet$FieldDescriptorLite object) {
        SmallSortedMap smallSortedMap = this.fields;
        boolean bl2 = (object = smallSortedMap.get(object)) instanceof LazyField;
        if (bl2) {
            object = ((LazyField)object).getValue();
        }
        return object;
    }

    public int getMessageSetSerializedSize() {
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            n3 = this.getMessageSetSerializedSize((Map.Entry)object);
            n4 += n3;
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = this.getMessageSetSerializedSize((Map.Entry)object);
            n4 += n3;
        }
        return n4;
    }

    public Object getRepeatedField(FieldSet$FieldDescriptorLite object, int n3) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            if ((object = this.getField((FieldSet$FieldDescriptorLite)object)) != null) {
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
            if ((object = this.getField((FieldSet$FieldDescriptorLite)object)) == null) {
                return 0;
            }
            return ((List)object).size();
        }
        object = new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public int getSerializedSize() {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite;
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            n3 = FieldSet.computeFieldSize(fieldSet$FieldDescriptorLite, object);
            n4 += n3;
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            n3 = FieldSet.computeFieldSize(fieldSet$FieldDescriptorLite, object);
            n4 += n3;
        }
        return n4;
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

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            n3 = (int)(FieldSet.isInitialized((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = (int)(FieldSet.isInitialized((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        boolean bl2 = this.hasLazyField;
        if (bl2) {
            Iterator iterator = this.fields.entrySet().iterator();
            LazyField$LazyIterator lazyField$LazyIterator = new LazyField$LazyIterator(iterator);
            return lazyField$LazyIterator;
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        Object object;
        int n3;
        int n4 = this.isImmutable;
        if (n4 != 0) {
            return;
        }
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++n4) {
            object = this.fields.getArrayEntryAt(n4);
            Object v4 = object.getValue();
            boolean bl2 = v4 instanceof GeneratedMessageLite;
            if (!bl2) continue;
            object = (GeneratedMessageLite)object.getValue();
            ((GeneratedMessageLite)object).makeImmutable();
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(FieldSet object) {
        Object object2;
        int n3;
        int n4;
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((SmallSortedMap)(object2 = ((FieldSet)object).fields)).getNumArrayEntries()); ++n4) {
            object2 = ((FieldSet)object).fields.getArrayEntryAt(n4);
            this.mergeFromField((Map.Entry)object2);
        }
        object = ((FieldSet)object).fields.getOverflowEntries().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            this.mergeFromField(entry);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setField(FieldSet$FieldDescriptorLite object, Object object2) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            boolean bl3;
            bl2 = object2 instanceof List;
            if (!bl2) {
                object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                throw object;
            }
            ArrayList arrayList = new ArrayList();
            object2 = (List)object2;
            arrayList.addAll(object2);
            object2 = arrayList.iterator();
            while (bl3 = object2.hasNext()) {
                Object e2 = object2.next();
                this.verifyType((FieldSet$FieldDescriptorLite)object, e2);
            }
            object2 = arrayList;
        } else {
            this.verifyType((FieldSet$FieldDescriptorLite)object, object2);
        }
        bl2 = object2 instanceof LazyField;
        if (bl2) {
            this.hasLazyField = bl2 = true;
        }
        this.fields.put((Comparable)object, object2);
    }

    public void setRepeatedField(FieldSet$FieldDescriptorLite object, int n3, Object object2) {
        boolean bl2 = object.isRepeated();
        if (bl2) {
            Object object3 = this.getField((FieldSet$FieldDescriptorLite)object);
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

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            this.writeMessageSetTo((Map.Entry)object, codedOutputStream);
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            this.writeMessageSetTo((Map.Entry)object, codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite;
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((SmallSortedMap)(object = this.fields)).getNumArrayEntries()); ++i3) {
            object = this.fields.getArrayEntryAt(i3);
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            FieldSet.writeField(fieldSet$FieldDescriptorLite, object, codedOutputStream);
        }
        iterator = this.fields.getOverflowEntries().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite)object.getKey();
            object = object.getValue();
            FieldSet.writeField(fieldSet$FieldDescriptorLite, object, codedOutputStream);
        }
    }
}

