/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$CodedBuilder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageSchema$1;
import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.Protobuf;
import com.google.protobuf.RawMessageInfo;
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.StructuralMessageInfo;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class MessageSchema
implements Schema {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final int ENFORCE_UTF8_MASK = 0x20000000;
    private static final int FIELD_TYPE_MASK = 0xFF00000;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 0x10000000;
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema unknownFieldSchema;
    private final boolean useCachedSizeField;

    private MessageSchema(int[] nArray, Object[] objectArray, int n3, int n4, MessageLite messageLite, ProtoSyntax protoSyntax, boolean bl2, int[] nArray2, int n7, int n8, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean bl3;
        this.buffer = nArray;
        this.objects = objectArray;
        this.minFieldNumber = n3;
        this.maxFieldNumber = n4;
        this.lite = bl3 = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        if (extensionSchema != null && (bl3 = extensionSchema.hasExtensions(messageLite))) {
            bl3 = true;
        } else {
            bl3 = false;
            nArray = null;
        }
        this.hasExtensions = bl3;
        this.useCachedSizeField = bl2;
        this.intArray = nArray2;
        this.checkInitializedCount = n7;
        this.repeatedFieldOffsetStart = n8;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(Object object, Object object2, int n3) {
        boolean bl2;
        boolean bl3 = this.isFieldPresent(object, n3);
        if (bl3 == (bl2 = this.isFieldPresent(object2, n3))) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        return bl3;
    }

    private static boolean booleanAt(Object object, long l2) {
        return UnsafeUtil.getBoolean(object, l2);
    }

    private static void checkMutable(Object object) {
        boolean bl2 = MessageSchema.isMutable(object);
        if (bl2) {
            return;
        }
        object = jk0_0.a(object, "Mutating immutable message: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private int decodeMapEntry(byte[] byArray, int n3, int n4, MapEntryLite$Metadata mapEntryLite$Metadata, Map map2, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n7;
        byte[] byArray2 = byArray;
        int n8 = n4;
        MapEntryLite$Metadata mapEntryLite$Metadata2 = mapEntryLite$Metadata;
        int n10 = n3;
        ArrayDecoders$Registers arrayDecoders$Registers2 = arrayDecoders$Registers;
        n10 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
        int n14 = arrayDecoders$Registers.int1;
        if (n14 >= 0 && n14 <= (n7 = n4 - n10)) {
            int n15 = n10 + n14;
            Object object = mapEntryLite$Metadata.defaultKey;
            Object object2 = mapEntryLite$Metadata.defaultValue;
            Object object3 = object;
            Object object4 = object2;
            while (n10 < n15) {
                Class<?> clazz;
                WireFormat$FieldType wireFormat$FieldType;
                n14 = n10 + 1;
                if ((n10 = byArray2[n10]) < 0) {
                    n10 = ArrayDecoders.decodeVarint32(n10, byArray, n14, arrayDecoders$Registers2);
                    n14 = arrayDecoders$Registers2.int1;
                    n7 = n10;
                    n10 = n14;
                } else {
                    n7 = n14;
                }
                n14 = n10 >>> 3;
                int n16 = n10 & 7;
                int n17 = 1;
                if (n14 != n17) {
                    n17 = 2;
                    if (n14 == n17 && n16 == (n14 = ((WireFormat$FieldType)((Object)(object = mapEntryLite$Metadata2.valueType))).getWireType())) {
                        wireFormat$FieldType = mapEntryLite$Metadata2.valueType;
                        clazz = mapEntryLite$Metadata2.defaultValue.getClass();
                        object = byArray;
                        n16 = n4;
                        n10 = this.decodeMapEntryValue(byArray, n7, n4, wireFormat$FieldType, clazz, arrayDecoders$Registers);
                        object4 = arrayDecoders$Registers2.object1;
                        continue;
                    }
                } else {
                    object = mapEntryLite$Metadata2.keyType;
                    n14 = ((WireFormat$FieldType)((Object)object)).getWireType();
                    if (n16 == n14) {
                        wireFormat$FieldType = mapEntryLite$Metadata2.keyType;
                        clazz = null;
                        object = byArray;
                        n16 = n4;
                        n10 = this.decodeMapEntryValue(byArray, n7, n4, wireFormat$FieldType, null, arrayDecoders$Registers);
                        object3 = arrayDecoders$Registers2.object1;
                        continue;
                    }
                }
                n10 = ArrayDecoders.skipField(n10, byArray, n7, n8, arrayDecoders$Registers2);
            }
            if (n10 == n15) {
                map2.put(object3, object4);
                return n15;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int decodeMapEntryValue(byte[] object, int n3, int n4, WireFormat$FieldType object2, Class clazz, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n7;
        void var4_9;
        int[] nArray = MessageSchema$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n8 = var4_9.ordinal();
        n8 = nArray[n8];
        switch (n8) {
            default: {
                RuntimeException runtimeException = new RuntimeException("unsupported field type.");
                throw runtimeException;
            }
            case 17: {
                void var6_12;
                int n10;
                return ArrayDecoders.decodeStringRequireUtf8(object, n10, (ArrayDecoders$Registers)var6_12);
            }
            case 16: {
                void var6_12;
                int n10;
                n7 = ArrayDecoders.decodeVarint64(object, n10, (ArrayDecoders$Registers)var6_12);
                long l2 = CodedInputStream.decodeZigZag64(var6_12.long1);
                Long l3 = l2;
                var6_12.object1 = l3;
                return n7;
            }
            case 15: {
                void var6_12;
                int n10;
                n7 = ArrayDecoders.decodeVarint32(object, n10, (ArrayDecoders$Registers)var6_12);
                n10 = CodedInputStream.decodeZigZag32(var6_12.int1);
                Integer n14 = n10;
                var6_12.object1 = n14;
                return n7;
            }
            case 14: {
                void var3_8;
                void var5_11;
                void var6_12;
                int n10;
                Schema schema = Protobuf.getInstance().schemaFor((Class)var5_11);
                return ArrayDecoders.decodeMessageField(schema, object, n10, (int)var3_8, (ArrayDecoders$Registers)var6_12);
            }
            case 12: 
            case 13: {
                void var6_12;
                int n10;
                n7 = ArrayDecoders.decodeVarint64(object, n10, (ArrayDecoders$Registers)var6_12);
                long l4 = var6_12.long1;
                Long l7 = l4;
                var6_12.object1 = l7;
                return n7;
            }
            case 9: 
            case 10: 
            case 11: {
                void var6_12;
                int n10;
                n7 = ArrayDecoders.decodeVarint32(object, n10, (ArrayDecoders$Registers)var6_12);
                n10 = var6_12.int1;
                Integer n15 = n10;
                var6_12.object1 = n15;
                return n7;
            }
            case 8: {
                int n10;
                float f5 = ArrayDecoders.decodeFloat(object, n10);
                Float f6 = Float.valueOf(f5);
                var6_12.object1 = f6;
                return n10 + 4;
            }
            case 6: 
            case 7: {
                int n10;
                long l8 = ArrayDecoders.decodeFixed64(object, n10);
                Long l12 = l8;
                var6_12.object1 = l12;
                return n10 + 8;
            }
            case 4: 
            case 5: {
                int n10;
                n7 = ArrayDecoders.decodeFixed32(object, n10);
                Integer n16 = n7;
                var6_12.object1 = n16;
                return n10 + 4;
            }
            case 3: {
                int n10;
                double d2 = ArrayDecoders.decodeDouble(object, n10);
                Double d5 = d2;
                var6_12.object1 = d5;
                return n10 + 8;
            }
            case 2: {
                void var6_12;
                int n10;
                return ArrayDecoders.decodeBytes(object, n10, (ArrayDecoders$Registers)var6_12);
            }
            case 1: {
                Boolean bl2;
                void var6_12;
                int n10;
                n7 = ArrayDecoders.decodeVarint64(object, n10, (ArrayDecoders$Registers)var6_12);
                long l14 = var6_12.long1;
                long l15 = 0L;
                long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
                if (l16 != false) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    bl2 = null;
                }
                bl2 = n10 != 0;
                var6_12.object1 = bl2;
            }
        }
        return n7;
    }

    private static double doubleAt(Object object, long l2) {
        return UnsafeUtil.getDouble(object, l2);
    }

    private boolean equals(Object object, Object object2, int n3) {
        double d2;
        long l2;
        double d5;
        long l3;
        long l4;
        int n4 = this.typeAndOffsetAt(n3);
        long l7 = MessageSchema.offset(n4);
        n4 = MessageSchema.type(n4);
        boolean bl2 = false;
        boolean bl3 = true;
        switch (n4) {
            default: {
                return bl3;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: 
            case 68: {
                boolean bl4;
                n3 = (int)(this.isOneofCaseEqual(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl4 = SchemaUtil.safeEquals(object = UnsafeUtil.getObject(object, l7), object2 = UnsafeUtil.getObject(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 50: {
                object = UnsafeUtil.getObject(object, l7);
                object2 = UnsafeUtil.getObject(object2, l7);
                return SchemaUtil.safeEquals(object, object2);
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: {
                object = UnsafeUtil.getObject(object, l7);
                object2 = UnsafeUtil.getObject(object2, l7);
                return SchemaUtil.safeEquals(object, object2);
            }
            case 17: {
                boolean bl5;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl5 = SchemaUtil.safeEquals(object = UnsafeUtil.getObject(object, l7), object2 = UnsafeUtil.getObject(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 16: {
                long l8;
                long l12;
                long l14;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((l14 = (l12 = UnsafeUtil.getLong(object, l7)) - (l8 = UnsafeUtil.getLong(object2, l7))) == 0L ? 0 : (l14 < 0L ? -1 : 1))) == 0) {
                    bl2 = true;
                }
                return bl2;
            }
            case 15: {
                int n7;
                int n8;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n8 = UnsafeUtil.getInt(object, l7)) == (n7 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 14: {
                long l15;
                long l16;
                long l17;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((l17 = (l16 = UnsafeUtil.getLong(object, l7)) - (l15 = UnsafeUtil.getLong(object2, l7))) == 0L ? 0 : (l17 < 0L ? -1 : 1))) == 0) {
                    bl2 = true;
                }
                return bl2;
            }
            case 13: {
                int n10;
                int n14;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n14 = UnsafeUtil.getInt(object, l7)) == (n10 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 12: {
                int n15;
                int n16;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n16 = UnsafeUtil.getInt(object, l7)) == (n15 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 11: {
                int n17;
                int n18;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n18 = UnsafeUtil.getInt(object, l7)) == (n17 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 10: {
                boolean bl6;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl6 = SchemaUtil.safeEquals(object = UnsafeUtil.getObject(object, l7), object2 = UnsafeUtil.getObject(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 9: {
                boolean bl7;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl7 = SchemaUtil.safeEquals(object = UnsafeUtil.getObject(object, l7), object2 = UnsafeUtil.getObject(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 8: {
                boolean bl8;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl8 = SchemaUtil.safeEquals(object = UnsafeUtil.getObject(object, l7), object2 = UnsafeUtil.getObject(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 7: {
                boolean bl9;
                boolean bl10;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (bl10 = UnsafeUtil.getBoolean(object, l7)) == (bl9 = UnsafeUtil.getBoolean(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 6: {
                int n19;
                int n20;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n20 = UnsafeUtil.getInt(object, l7)) == (n19 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 5: {
                long l18;
                long l19;
                long l20;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((l20 = (l19 = UnsafeUtil.getLong(object, l7)) - (l18 = UnsafeUtil.getLong(object2, l7))) == 0L ? 0 : (l20 < 0L ? -1 : 1))) == 0) {
                    bl2 = true;
                }
                return bl2;
            }
            case 4: {
                int n21;
                int n22;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n22 = UnsafeUtil.getInt(object, l7)) == (n21 = UnsafeUtil.getInt(object2, l7))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 3: {
                long l21;
                long l22;
                long l23;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((l23 = (l22 = UnsafeUtil.getLong(object, l7)) - (l21 = UnsafeUtil.getLong(object2, l7))) == 0L ? 0 : (l23 < 0L ? -1 : 1))) == 0) {
                    bl2 = true;
                }
                return bl2;
            }
            case 2: {
                long l24;
                long l25;
                long l26;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)((l26 = (l25 = UnsafeUtil.getLong(object, l7)) - (l24 = UnsafeUtil.getLong(object2, l7))) == 0L ? 0 : (l26 < 0L ? -1 : 1))) == 0) {
                    bl2 = true;
                }
                return bl2;
            }
            case 1: {
                float f5;
                int n24;
                float f6;
                int n25;
                n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
                if (n3 != 0 && (n25 = Float.floatToIntBits(f6 = UnsafeUtil.getFloat(object, l7))) == (n24 = Float.floatToIntBits(f5 = UnsafeUtil.getFloat(object2, l7)))) {
                    bl2 = true;
                }
                return bl2;
            }
            case 0: 
        }
        n3 = (int)(this.arePresentForEquals(object, object2, n3) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)((l4 = (l3 = Double.doubleToLongBits(d5 = UnsafeUtil.getDouble(object, l7))) - (l2 = Double.doubleToLongBits(d2 = UnsafeUtil.getDouble(object2, l7)))) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
            bl2 = true;
        }
        return bl2;
    }

    private Object filterMapUnknownEnumValues(Object object, int n3, Object object2, UnknownFieldSchema unknownFieldSchema, Object object3) {
        int n4 = this.numberAt(n3);
        int n7 = this.typeAndOffsetAt(n3);
        long l2 = MessageSchema.offset(n7);
        if ((object = UnsafeUtil.getObject(object, l2)) == null) {
            return object2;
        }
        Internal$EnumVerifier internal$EnumVerifier = this.getEnumFieldVerifier(n3);
        if (internal$EnumVerifier == null) {
            return object2;
        }
        Map map2 = this.mapFieldSchema.forMutableMapData(object);
        return this.filterUnknownEnumMap(n3, n4, map2, internal$EnumVerifier, object2, unknownFieldSchema, object3);
    }

    private Object filterUnknownEnumMap(int n3, int n4, Map object, Internal$EnumVerifier internal$EnumVerifier, Object object2, UnknownFieldSchema unknownFieldSchema, Object object3) {
        boolean bl2;
        Object object4 = this.mapFieldSchema;
        Object object5 = this.getMapFieldDefaultEntry(n3);
        object5 = object4.forMapMetadata(object5);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object k2;
            object4 = (Map.Entry)object.next();
            Object object6 = (Integer)object4.getValue();
            int n7 = (Integer)object6;
            if ((n7 = (int)(internal$EnumVerifier.isInRange(n7) ? 1 : 0)) != 0) continue;
            if (object2 == null) {
                object2 = unknownFieldSchema.getBuilderFromMessage(object3);
            }
            object6 = object4.getKey();
            Object object7 = object4.getValue();
            n7 = MapEntryLite.computeSerializedSize((MapEntryLite$Metadata)object5, object6, object7);
            object6 = ByteString.newCodedBuilder(n7);
            object7 = ((ByteString$CodedBuilder)object6).getCodedOutput();
            try {
                k2 = object4.getKey();
            }
            catch (IOException iOException) {
                RuntimeException runtimeException = new RuntimeException(iOException);
                throw runtimeException;
            }
            object4 = object4.getValue();
            MapEntryLite.writeTo(object7, (MapEntryLite$Metadata)object5, k2, object4);
            object4 = ((ByteString$CodedBuilder)object6).build();
            unknownFieldSchema.addLengthDelimited(object2, n4, (ByteString)object4);
            object.remove();
        }
        return object2;
    }

    private static float floatAt(Object object, long l2) {
        return UnsafeUtil.getFloat(object, l2);
    }

    private Internal$EnumVerifier getEnumFieldVerifier(int n3) {
        Object[] objectArray = this.objects;
        n3 = n3 / 3 * 2 + 1;
        return (Internal$EnumVerifier)objectArray[n3];
    }

    private Object getMapFieldDefaultEntry(int n3) {
        Object[] objectArray = this.objects;
        n3 = n3 / 3 * 2;
        return objectArray[n3];
    }

    private Schema getMessageFieldSchema(int n3) {
        Object object = (Schema)this.objects[n3 = n3 / 3 * 2];
        if (object != null) {
            return object;
        }
        object = Protobuf.getInstance();
        Object object2 = this.objects;
        int n4 = n3 + 1;
        object2 = (Class)object2[n4];
        this.objects[n3] = object = ((Protobuf)object).schemaFor((Class)object2);
        return object;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object object) {
        object = (GeneratedMessageLite)object;
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite)object).unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = UnknownFieldSetLite.getDefaultInstance();
        if (unknownFieldSetLite == unknownFieldSetLite2) {
            ((GeneratedMessageLite)object).unknownFields = unknownFieldSetLite = UnknownFieldSetLite.newInstance();
        }
        return unknownFieldSetLite;
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object object) {
        object = unknownFieldSchema.getFromMessage(object);
        return unknownFieldSchema.getSerializedSize(object);
    }

    private static int intAt(Object object, long l2) {
        return UnsafeUtil.getInt(object, l2);
    }

    private static boolean isEnforceUtf8(int n3) {
        int n4 = 0x20000000;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private boolean isFieldPresent(Object object, int n3) {
        int n4 = this.presenceMaskAndOffsetAt(n3);
        int n7 = 0xFFFFF & n4;
        long l2 = n7;
        long l3 = 1048575L;
        boolean bl2 = false;
        int n8 = 1;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 == false) {
            n3 = this.typeAndOffsetAt(n3);
            long l4 = MessageSchema.offset(n3);
            n3 = MessageSchema.type(n3);
            long l7 = 0L;
            switch (n3) {
                default: {
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 17: {
                    object = UnsafeUtil.getObject(object, l4);
                    if (object != null) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 16: {
                    long l8 = UnsafeUtil.getLong(object, l4);
                    n4 = (int)(l8 == l7 ? 0 : (l8 < l7 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 15: {
                    int n10 = UnsafeUtil.getInt(object, l4);
                    if (n10 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 14: {
                    long l12 = UnsafeUtil.getLong(object, l4);
                    n4 = (int)(l12 == l7 ? 0 : (l12 < l7 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 13: {
                    int n14 = UnsafeUtil.getInt(object, l4);
                    if (n14 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 12: {
                    int n15 = UnsafeUtil.getInt(object, l4);
                    if (n15 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 11: {
                    int n16 = UnsafeUtil.getInt(object, l4);
                    if (n16 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 10: {
                    ByteString byteString = ByteString.EMPTY;
                    object = UnsafeUtil.getObject(object, l4);
                    return (byteString.equals(object) ^ n8) != 0;
                }
                case 9: {
                    object = UnsafeUtil.getObject(object, l4);
                    if (object != null) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 8: {
                    object = UnsafeUtil.getObject(object, l4);
                    n3 = object instanceof String;
                    if (n3 != 0) {
                        return (((String)object).isEmpty() ^ n8) != 0;
                    }
                    n3 = object instanceof ByteString;
                    if (n3 != 0) {
                        return (ByteString.EMPTY.equals(object) ^ n8) != 0;
                    }
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 7: {
                    return UnsafeUtil.getBoolean(object, l4);
                }
                case 6: {
                    int n17 = UnsafeUtil.getInt(object, l4);
                    if (n17 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 5: {
                    long l14 = UnsafeUtil.getLong(object, l4);
                    n4 = (int)(l14 == l7 ? 0 : (l14 < l7 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 4: {
                    int n18 = UnsafeUtil.getInt(object, l4);
                    if (n18 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 3: {
                    long l15 = UnsafeUtil.getLong(object, l4);
                    n4 = (int)(l15 == l7 ? 0 : (l15 < l7 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 2: {
                    long l16 = UnsafeUtil.getLong(object, l4);
                    n4 = (int)(l16 == l7 ? 0 : (l16 < l7 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 1: {
                    float f5 = UnsafeUtil.getFloat(object, l4);
                    int n19 = Float.floatToRawIntBits(f5);
                    if (n19 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 0: 
            }
            double d2 = UnsafeUtil.getDouble(object, l4);
            long l17 = Double.doubleToRawLongBits(d2);
            n4 = (int)(l17 == l7 ? 0 : (l17 < l7 ? -1 : 1));
            if (n4 != 0) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = n4 >>> 20;
        n3 = n8 << n3;
        int n20 = UnsafeUtil.getInt(object, l2) & n3;
        if (n20 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isFieldPresent(Object object, int n3, int n4, int n7, int n8) {
        int n10 = 1048575;
        if (n4 == n10) {
            return this.isFieldPresent(object, n3);
        }
        int n14 = n7 & n8;
        if (n14) {
            n14 = 1;
        } else {
            n14 = 0;
            object = null;
        }
        return n14 != 0;
    }

    private static boolean isInitialized(Object object, int n3, Schema schema) {
        long l2 = MessageSchema.offset(n3);
        object = UnsafeUtil.getObject(object, l2);
        return schema.isInitialized(object);
    }

    private static boolean isLegacyEnumIsClosed(int n3) {
        int n4 = -1 << -1;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private boolean isListInitialized(Object object, int n3, int n4) {
        int n7;
        long l2 = MessageSchema.offset(n3);
        object = (List)UnsafeUtil.getObject(object, l2);
        n3 = (int)(object.isEmpty() ? 1 : 0);
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        Schema schema = this.getMessageFieldSchema(n4);
        n4 = 0;
        for (int i3 = 0; i3 < (n7 = object.size()); ++i3) {
            Object e2 = object.get(i3);
            n7 = (int)(schema.isInitialized(e2) ? 1 : 0);
            if (n7 != 0) continue;
            return false;
        }
        return bl2;
    }

    private boolean isMapInitialized(Object iterator, int n3, int n4) {
        WireFormat$JavaType wireFormat$JavaType;
        MapFieldSchema mapFieldSchema = this.mapFieldSchema;
        long l2 = MessageSchema.offset(n3);
        iterator = UnsafeUtil.getObject(iterator, l2);
        iterator = mapFieldSchema.forMapData(iterator);
        n3 = (int)(iterator.isEmpty() ? 1 : 0);
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        Object object = this.getMapFieldDefaultEntry(n4);
        object = this.mapFieldSchema.forMapMetadata((Object)object).valueType.getJavaType();
        if (object != (wireFormat$JavaType = WireFormat$JavaType.MESSAGE)) {
            return bl2;
        }
        iterator = iterator.values().iterator();
        n3 = 0;
        object = null;
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            wireFormat$JavaType = iterator.next();
            if (object == null) {
                object = Protobuf.getInstance();
                Class<?> clazz = ((Object)((Object)wireFormat$JavaType)).getClass();
                object = ((Protobuf)object).schemaFor(clazz);
            }
            if ((n4 = (int)(object.isInitialized((Object)wireFormat$JavaType) ? 1 : 0)) != 0) continue;
            return false;
        }
        return bl2;
    }

    private static boolean isMutable(Object object) {
        if (object == null) {
            return false;
        }
        boolean bl2 = object instanceof GeneratedMessageLite;
        if (bl2) {
            return ((GeneratedMessageLite)object).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object object, Object object2, int n3) {
        int n4;
        n3 = this.presenceMaskAndOffsetAt(n3);
        int n7 = 1048575;
        long l2 = n3 &= n7;
        int n8 = UnsafeUtil.getInt(object, l2);
        if (n8 == (n4 = UnsafeUtil.getInt(object2, l2))) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        return n8 != 0;
    }

    private boolean isOneofPresent(Object object, int n3, int n4) {
        n4 = this.presenceMaskAndOffsetAt(n4);
        int n7 = 1048575;
        long l2 = n4 &= n7;
        int n8 = UnsafeUtil.getInt(object, l2);
        if (n8 == n3) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        return n8 != 0;
    }

    private static boolean isRequired(int n3) {
        int n4 = 0x10000000;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private static long longAt(Object object, long l2) {
        return UnsafeUtil.getLong(object, l2);
    }

    /*
     * Exception decompiling
     */
    private void mergeFromHelper(UnknownFieldSchema var1_1, ExtensionSchema var2_2, Object var3_3, Reader var4_4, ExtensionRegistryLite var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 304->309)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void mergeMap(Object object, int n3, Object object2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long l2 = MessageSchema.offset(n3 = this.typeAndOffsetAt(n3));
        Object object3 = UnsafeUtil.getObject(object, l2);
        if (object3 == null) {
            object3 = this.mapFieldSchema.newMapField(object2);
            UnsafeUtil.putObject(object, l2, object3);
        } else {
            Object object4 = this.mapFieldSchema;
            boolean bl2 = object4.isImmutable(object3);
            if (bl2) {
                object4 = this.mapFieldSchema.newMapField(object2);
                MapFieldSchema mapFieldSchema = this.mapFieldSchema;
                mapFieldSchema.mergeFrom(object4, object3);
                UnsafeUtil.putObject(object, l2, object4);
                object3 = object4;
            }
        }
        object = this.mapFieldSchema.forMutableMapData(object3);
        object3 = this.mapFieldSchema.forMapMetadata(object2);
        reader.readMap((Map)object, (MapEntryLite$Metadata)object3, extensionRegistryLite);
    }

    private void mergeMessage(Object object, Object object2, int n3) {
        int n4 = this.isFieldPresent(object2, n3);
        if (n4 == 0) {
            return;
        }
        Unsafe unsafe = UNSAFE;
        n4 = this.typeAndOffsetAt(n3);
        long l2 = MessageSchema.offset(n4);
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            object2 = this.getMessageFieldSchema(n3);
            boolean bl2 = this.isFieldPresent(object, n3);
            if (!bl2) {
                bl2 = MessageSchema.isMutable(object3);
                if (!bl2) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    Object object4 = object2.newInstance();
                    object2.mergeFrom(object4, object3);
                    unsafe.putObject(object, l2, object4);
                }
                this.setFieldPresent(object, n3);
                return;
            }
            Object object5 = unsafe.getObject(object, l2);
            bl2 = MessageSchema.isMutable(object5);
            if (!bl2) {
                Object object6 = object2.newInstance();
                object2.mergeFrom(object6, object5);
                unsafe.putObject(object, l2, object6);
                object5 = object6;
            }
            object2.mergeFrom(object5, object3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Source subfield ");
        n3 = this.numberAt(n3);
        stringBuilder.append(n3);
        stringBuilder.append(" is present but null: ");
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    private void mergeOneofMessage(Object object, Object object2, int n3) {
        int n4 = this.numberAt(n3);
        int n7 = this.isOneofPresent(object2, n4, n3);
        if (n7 == 0) {
            return;
        }
        Unsafe unsafe = UNSAFE;
        n7 = this.typeAndOffsetAt(n3);
        long l2 = MessageSchema.offset(n7);
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            object2 = this.getMessageFieldSchema(n3);
            boolean bl2 = this.isOneofPresent(object, n4, n3);
            if (!bl2) {
                bl2 = MessageSchema.isMutable(object3);
                if (!bl2) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    Object object4 = object2.newInstance();
                    object2.mergeFrom(object4, object3);
                    unsafe.putObject(object, l2, object4);
                }
                this.setOneofPresent(object, n4, n3);
                return;
            }
            Object object5 = unsafe.getObject(object, l2);
            n4 = (int)(MessageSchema.isMutable(object5) ? 1 : 0);
            if (n4 == 0) {
                Object object6 = object2.newInstance();
                object2.mergeFrom(object6, object5);
                unsafe.putObject(object, l2, object6);
                object5 = object6;
            }
            object2.mergeFrom(object5, object3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Source subfield ");
        n3 = this.numberAt(n3);
        stringBuilder.append(n3);
        stringBuilder.append(" is present but null: ");
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    private void mergeSingleField(Object object, Object object2, int n3) {
        int n4 = this.typeAndOffsetAt(n3);
        long l2 = MessageSchema.offset(n4);
        int n7 = this.numberAt(n3);
        n4 = MessageSchema.type(n4);
        switch (n4) {
            default: {
                break;
            }
            case 68: {
                this.mergeOneofMessage(object, object2, n3);
                break;
            }
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: {
                n4 = (int)(this.isOneofPresent(object2, n7, n3) ? 1 : 0);
                if (n4 == 0) break;
                object2 = UnsafeUtil.getObject(object2, l2);
                UnsafeUtil.putObject(object, l2, object2);
                this.setOneofPresent(object, n7, n3);
                break;
            }
            case 60: {
                this.mergeOneofMessage(object, object2, n3);
                break;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                n4 = (int)(this.isOneofPresent(object2, n7, n3) ? 1 : 0);
                if (n4 == 0) break;
                object2 = UnsafeUtil.getObject(object2, l2);
                UnsafeUtil.putObject(object, l2, object2);
                this.setOneofPresent(object, n7, n3);
                break;
            }
            case 50: {
                MapFieldSchema mapFieldSchema = this.mapFieldSchema;
                SchemaUtil.mergeMap(mapFieldSchema, object, object2, l2);
                break;
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: {
                ListFieldSchema listFieldSchema = this.listFieldSchema;
                listFieldSchema.mergeListsAt(object, object2, l2);
                break;
            }
            case 17: {
                this.mergeMessage(object, object2, n3);
                break;
            }
            case 16: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                long l3 = UnsafeUtil.getLong(object2, l2);
                UnsafeUtil.putLong(object, l2, l3);
                this.setFieldPresent(object, n3);
                break;
            }
            case 15: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n8 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n8);
                this.setFieldPresent(object, n3);
                break;
            }
            case 14: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                long l4 = UnsafeUtil.getLong(object2, l2);
                UnsafeUtil.putLong(object, l2, l4);
                this.setFieldPresent(object, n3);
                break;
            }
            case 13: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n10 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n10);
                this.setFieldPresent(object, n3);
                break;
            }
            case 12: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n14 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n14);
                this.setFieldPresent(object, n3);
                break;
            }
            case 11: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n15 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n15);
                this.setFieldPresent(object, n3);
                break;
            }
            case 10: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                object2 = UnsafeUtil.getObject(object2, l2);
                UnsafeUtil.putObject(object, l2, object2);
                this.setFieldPresent(object, n3);
                break;
            }
            case 9: {
                this.mergeMessage(object, object2, n3);
                break;
            }
            case 8: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                object2 = UnsafeUtil.getObject(object2, l2);
                UnsafeUtil.putObject(object, l2, object2);
                this.setFieldPresent(object, n3);
                break;
            }
            case 7: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                boolean bl2 = UnsafeUtil.getBoolean(object2, l2);
                UnsafeUtil.putBoolean(object, l2, bl2);
                this.setFieldPresent(object, n3);
                break;
            }
            case 6: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n16 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n16);
                this.setFieldPresent(object, n3);
                break;
            }
            case 5: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                long l7 = UnsafeUtil.getLong(object2, l2);
                UnsafeUtil.putLong(object, l2, l7);
                this.setFieldPresent(object, n3);
                break;
            }
            case 4: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                int n17 = UnsafeUtil.getInt(object2, l2);
                UnsafeUtil.putInt(object, l2, n17);
                this.setFieldPresent(object, n3);
                break;
            }
            case 3: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                long l8 = UnsafeUtil.getLong(object2, l2);
                UnsafeUtil.putLong(object, l2, l8);
                this.setFieldPresent(object, n3);
                break;
            }
            case 2: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                long l12 = UnsafeUtil.getLong(object2, l2);
                UnsafeUtil.putLong(object, l2, l12);
                this.setFieldPresent(object, n3);
                break;
            }
            case 1: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                float f5 = UnsafeUtil.getFloat(object2, l2);
                UnsafeUtil.putFloat(object, l2, f5);
                this.setFieldPresent(object, n3);
                break;
            }
            case 0: {
                n4 = (int)(this.isFieldPresent(object2, n3) ? 1 : 0);
                if (n4 == 0) break;
                double d2 = UnsafeUtil.getDouble(object2, l2);
                UnsafeUtil.putDouble(object, l2, d2);
                this.setFieldPresent(object, n3);
            }
        }
    }

    private Object mutableMessageFieldForMerge(Object object, int n3) {
        Schema schema = this.getMessageFieldSchema(n3);
        int n4 = this.typeAndOffsetAt(n3);
        long l2 = MessageSchema.offset(n4);
        if ((n3 = (int)(this.isFieldPresent(object, n3) ? 1 : 0)) == 0) {
            return schema.newInstance();
        }
        Object object2 = UNSAFE;
        n3 = (int)(MessageSchema.isMutable(object = ((Unsafe)object2).getObject(object, l2)) ? 1 : 0);
        if (n3 != 0) {
            return object;
        }
        object2 = schema.newInstance();
        if (object != null) {
            schema.mergeFrom(object2, object);
        }
        return object2;
    }

    private Object mutableOneofMessageFieldForMerge(Object object, int n3, int n4) {
        Schema schema = this.getMessageFieldSchema(n4);
        if ((n3 = (int)(this.isOneofPresent(object, n3, n4) ? 1 : 0)) == 0) {
            return schema.newInstance();
        }
        Object object2 = UNSAFE;
        long l2 = MessageSchema.offset(n4 = this.typeAndOffsetAt(n4));
        n3 = (int)(MessageSchema.isMutable(object = ((Unsafe)object2).getObject(object, l2)) ? 1 : 0);
        if (n3 != 0) {
            return object;
        }
        object2 = schema.newInstance();
        if (object != null) {
            schema.mergeFrom(object2, object);
        }
        return object2;
    }

    public static MessageSchema newSchema(Class clazz, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean bl2 = messageInfo instanceof RawMessageInfo;
        if (bl2) {
            return MessageSchema.newSchemaForRawMessageInfo((RawMessageInfo)messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return MessageSchema.newSchemaForMessageInfo((StructuralMessageInfo)messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static MessageSchema newSchemaForMessageInfo(StructuralMessageInfo var0, NewInstanceSchema var1_1, ListFieldSchema var2_2, UnknownFieldSchema var3_3, ExtensionSchema var4_4, MapFieldSchema var5_5) {
        var6_6 /* !! */  = var0.getFields();
        var7_7 = var6_6 /* !! */ .length;
        var8_8 = 0;
        var9_9 = null;
        if (var7_7 == 0) {
            var10_10 = 0;
            var11_11 = 0;
        } else {
            var12_12 = var6_6 /* !! */ [0];
            var7_7 = var12_12.getFieldNumber();
            var13_13 = var6_6 /* !! */ .length + -1;
            var14_14 = var6_6 /* !! */ [var13_13];
            var13_13 = var14_14.getFieldNumber();
            var10_10 = var7_7;
            var11_11 = var13_13;
        }
        var7_7 = var6_6 /* !! */ .length;
        var15_15 = new int[var7_7 * 3];
        var16_16 = new Object[var7_7 * 2];
        var7_7 = var6_6 /* !! */ .length;
        var13_13 = 0;
        var14_14 = null;
        var17_17 = 0;
        var18_18 /* !! */  = null;
        var19_19 = 0;
        var20_20 = null;
        while (true) {
            var21_21 = 49;
            var22_22 = 18;
            if (var13_13 >= var7_7) break;
            var23_23 = var6_6 /* !! */ [var13_13];
            var24_24 = var23_23.getType();
            if (var24_24 == (var25_25 = FieldType.MAP)) {
                ++var17_17;
            } else {
                var24_24 = var23_23.getType();
                var26_26 = var24_24.id();
                if (var26_26 >= var22_22 && (var22_22 = (var27_27 = var23_23.getType()).id()) <= var21_21) {
                    ++var19_19;
                }
            }
            ++var13_13;
        }
        var7_7 = 0;
        var12_12 = null;
        if (var17_17 > 0) {
            var14_14 = new int[var17_17];
        } else {
            var13_13 = 0;
            var14_14 = null;
        }
        if (var19_19 > 0) {
            var12_12 = new int[var19_19];
        }
        if ((var18_18 /* !! */  = var0.getCheckInitialized()) == null) {
            var18_18 /* !! */  = MessageSchema.EMPTY_INT_ARRAY;
        }
        var20_20 = null;
        var28_28 = 0;
        var23_23 = null;
        var26_26 = 0;
        var24_24 = null;
        var29_29 = 0;
        var25_25 = null;
        var30_30 = 0;
        for (var19_19 = 0; var19_19 < (var8_8 = var6_6 /* !! */ .length); ++var19_19) {
            var9_9 = var6_6 /* !! */ [var19_19];
            var21_21 = var9_9.getFieldNumber();
            MessageSchema.storeFieldData((FieldInfo)var9_9, var15_15, var28_28, var16_16);
            var22_22 = var18_18 /* !! */ .length;
            if (var26_26 < var22_22 && (var22_22 = var18_18 /* !! */ [var26_26]) == var21_21) {
                var21_21 = var26_26 + 1;
                var18_18 /* !! */ [var26_26] = var28_28;
                var26_26 = var21_21;
            }
            if ((var31_31 = var9_9.getType()) == (var27_27 = FieldType.MAP)) {
                var8_8 = var29_29 + 1;
                var14_14[var29_29] = var28_28;
                var29_29 = var8_8;
                while (true) {
                    var32_32 = var28_28;
                    break;
                }
            } else {
                if ((var21_21 = (var31_31 = var9_9.getType()).id()) < (var22_22 = 18) || (var21_21 = (var31_31 = var9_9.getType()).id()) > (var22_22 = 49)) ** continue;
                var21_21 = var30_30 + 1;
                var9_9 = var9_9.getField();
                var32_32 = var28_28;
                var33_33 = UnsafeUtil.objectFieldOffset((Field)var9_9);
                var8_8 = (int)var33_33;
                var12_12[var30_30] = var8_8;
                var30_30 = var21_21;
            }
            var28_28 = var32_32 + 3;
            var21_21 = 49;
            var22_22 = 18;
        }
        if (var14_14 == null) {
            var14_14 = MessageSchema.EMPTY_INT_ARRAY;
        }
        if (var12_12 == null) {
            var12_12 = MessageSchema.EMPTY_INT_ARRAY;
        }
        var35_34 = var18_18 /* !! */ .length;
        var8_8 = ((Object)var14_14).length;
        var35_34 += var8_8;
        var8_8 = ((Object)var12_12).length;
        var23_23 = new int[var35_34 + var8_8];
        var35_34 = var18_18 /* !! */ .length;
        System.arraycopy(var18_18 /* !! */ , 0, var23_23, 0, var35_34);
        var35_34 = var18_18 /* !! */ .length;
        var19_19 = ((Object)var14_14).length;
        System.arraycopy(var14_14, 0, var23_23, var35_34, var19_19);
        var35_34 = var18_18 /* !! */ .length;
        var19_19 = ((Object)var14_14).length;
        var35_34 += var19_19;
        var19_19 = ((Object)var12_12).length;
        System.arraycopy(var12_12, 0, var23_23, var35_34, var19_19);
        var20_20 = var0.getDefaultInstance();
        var31_31 = var0.getSyntax();
        var26_26 = var18_18 /* !! */ .length;
        var7_7 = var18_18 /* !! */ .length;
        var8_8 = ((Object)var14_14).length;
        var29_29 = var7_7 + var8_8;
        var18_18 /* !! */  = (int[])var6_6 /* !! */ ;
        var6_6 /* !! */  = new MessageSchema(var15_15, var16_16, var10_10, var11_11, var20_20, (ProtoSyntax)var31_31, true, (int[])var23_23, var26_26, var29_29, var1_1, var2_2, var3_3, var4_4, var5_5);
        return var6_6 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        int n10;
        Object[] objectArray;
        int n14;
        int[] nArray;
        int n15;
        int n16;
        int n17;
        int n18;
        Object object2 = rawMessageInfo.getStringInfo();
        int n19 = ((String)object2).length();
        int n20 = 0;
        int[] nArray2 = null;
        int n21 = ((String)object2).charAt(0);
        if (n21 >= (n18 = 55296)) {
            n21 = 1;
            while (true) {
                n17 = n21 + '\u0001';
                if ((n21 = (int)((String)object2).charAt(n21)) >= n18) {
                    n21 = n17;
                    continue;
                }
                break;
            }
        } else {
            n17 = 1;
        }
        n21 = n17 + 1;
        if ((n17 = (int)((String)object2).charAt(n17)) >= n18) {
            n17 &= 0x1FFF;
            n16 = 13;
            while (true) {
                n15 = n21 + 1;
                if ((n21 = (int)((String)object2).charAt(n21)) < n18) break;
                n21 = (n21 & 0x1FFF) << n16;
                n17 |= n21;
                n16 += 13;
                n21 = n15;
            }
            n17 |= (n21 <<= n16);
            n21 = n15;
        }
        if (n17 == 0) {
            nArray = EMPTY_INT_ARRAY;
            n17 = 0;
            n14 = 0;
            objectArray = null;
            n10 = 0;
            Object var19_19 = null;
            n8 = 0;
            Object var21_33 = null;
            n7 = 0;
            Object var23_39 = null;
            n4 = 0;
            object = null;
            n3 = 0;
        } else {
            int n22;
            n17 = n21 + 1;
            if ((n21 = (int)((String)object2).charAt(n21)) >= n18) {
                n21 &= 0x1FFF;
                n16 = 13;
                while (true) {
                    n15 = n17 + 1;
                    if ((n17 = (int)((String)object2).charAt(n17)) < n18) break;
                    n17 = (n17 & 0x1FFF) << n16;
                    n21 |= n17;
                    n16 += 13;
                    n17 = n15;
                }
                n21 |= (n17 <<= n16);
                n17 = n15;
            }
            n16 = n17 + 1;
            if ((n17 = (int)((String)object2).charAt(n17)) >= n18) {
                n17 &= 0x1FFF;
                n15 = 13;
                while (true) {
                    n14 = n16 + 1;
                    if ((n16 = (int)((String)object2).charAt(n16)) < n18) break;
                    n16 = (n16 & 0x1FFF) << n15;
                    n17 |= n16;
                    n15 += 13;
                    n16 = n14;
                }
                n17 |= (n16 <<= n15);
                n16 = n14;
            }
            n15 = n16 + 1;
            if ((n16 = (int)((String)object2).charAt(n16)) >= n18) {
                n16 &= 0x1FFF;
                n14 = 13;
                while (true) {
                    n10 = n15 + 1;
                    if ((n15 = (int)((String)object2).charAt(n15)) < n18) break;
                    n15 = (n15 & 0x1FFF) << n14;
                    n16 |= n15;
                    n14 += 13;
                    n15 = n10;
                }
                n16 |= (n15 <<= n14);
                n15 = n10;
            }
            n14 = n15 + 1;
            if ((n15 = (int)((String)object2).charAt(n15)) >= n18) {
                n15 &= 0x1FFF;
                n10 = 13;
                while (true) {
                    n8 = n14 + 1;
                    if ((n14 = (int)((String)object2).charAt(n14)) < n18) break;
                    n14 = (n14 & 0x1FFF) << n10;
                    n15 |= n14;
                    n10 += 13;
                    n14 = n8;
                }
                n15 |= (n14 <<= n10);
                n14 = n8;
            }
            n10 = n14 + 1;
            if ((n14 = (int)((String)object2).charAt(n14)) >= n18) {
                n14 &= 0x1FFF;
                n8 = 13;
                while (true) {
                    n7 = n10 + 1;
                    if ((n10 = (int)((String)object2).charAt(n10)) < n18) break;
                    n10 = (n10 & 0x1FFF) << n8;
                    n14 |= n10;
                    n8 += 13;
                    n10 = n7;
                }
                n14 |= (n10 <<= n8);
                n10 = n7;
            }
            n8 = n10 + 1;
            if ((n10 = (int)((String)object2).charAt(n10)) >= n18) {
                n10 &= 0x1FFF;
                n7 = 13;
                while (true) {
                    n22 = n8 + 1;
                    if ((n8 = (int)((String)object2).charAt(n8)) < n18) break;
                    n8 = (n8 & 0x1FFF) << n7;
                    n10 |= n8;
                    n7 += 13;
                    n8 = n22;
                }
                n10 |= (n8 <<= n7);
                n8 = n22;
            }
            n7 = n8 + 1;
            if ((n8 = (int)((String)object2).charAt(n8)) >= n18) {
                n8 &= 0x1FFF;
                n22 = 13;
                while (true) {
                    n4 = n7 + 1;
                    if ((n7 = (int)((String)object2).charAt(n7)) < n18) break;
                    n7 = (n7 & 0x1FFF) << n22;
                    n8 |= n7;
                    n22 += 13;
                    n7 = n4;
                }
                n8 |= (n7 <<= n22);
                n7 = n4;
            }
            n22 = n7 + 1;
            if ((n7 = (int)((String)object2).charAt(n7)) >= n18) {
                int n24;
                n7 &= 0x1FFF;
                n4 = 13;
                while (true) {
                    n24 = n22 + 1;
                    if ((n22 = (int)((String)object2).charAt(n22)) < n18) break;
                    n22 = (n22 & 0x1FFF) << n4;
                    n7 |= n22;
                    n4 += 13;
                    n22 = n24;
                }
                n7 |= (n22 <<= n4);
                n22 = n24;
            }
            int[] nArray3 = new int[n7 + n10 + n8];
            n4 = n21 * 2 + n17;
            n17 = n21;
            nArray = nArray3;
            n3 = n7;
            n21 = n22;
            n8 = n16;
            n7 = n15;
        }
        Object object3 = UNSAFE;
        Object[] objectArray2 = rawMessageInfo.getObjects();
        Class<?> clazz = rawMessageInfo.getDefaultInstance().getClass();
        n20 = n14 * 3;
        nArray2 = new int[n20];
        objectArray = new Object[n14 *= 2];
        int n25 = n3 + n10;
        int n26 = n3;
        int n27 = n25;
        n10 = 0;
        Object var19_20 = null;
        int n28 = 0;
        while (true) {
            int n29;
            int n30;
            int n32;
            int n34;
            int n35;
            int n36;
            int n37;
            block55: {
                Field field;
                int n38;
                long l2;
                int n39;
                block57: {
                    block59: {
                        block61: {
                            Object object4;
                            block60: {
                                block58: {
                                    Object object5;
                                    block56: {
                                        block51: {
                                            void var19_28;
                                            void var44_76;
                                            Object object6;
                                            int n41;
                                            block53: {
                                                block54: {
                                                    block52: {
                                                        ProtoSyntax protoSyntax;
                                                        ProtoSyntax protoSyntax2;
                                                        if (n21 >= n19) {
                                                            n37 = n8;
                                                            n36 = n7;
                                                            MessageLite messageLite = rawMessageInfo.getDefaultInstance();
                                                            ProtoSyntax protoSyntax3 = rawMessageInfo.getSyntax();
                                                            object3 = object2;
                                                            int[] nArray4 = nArray2;
                                                            n10 = n8;
                                                            n8 = n7;
                                                            return new MessageSchema(nArray2, objectArray, n37, n7, messageLite, protoSyntax3, false, nArray, n3, n25, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
                                                        }
                                                        n39 = n21 + 1;
                                                        if ((n21 = (int)((String)object2).charAt(n21)) >= n18) {
                                                            n21 &= 0x1FFF;
                                                            n35 = n39;
                                                            n39 = 13;
                                                            while (true) {
                                                                n34 = n35 + 1;
                                                                if ((n35 = (int)((String)object2).charAt(n35)) < n18) break;
                                                                n35 = (n35 & 0x1FFF) << n39;
                                                                n21 |= n35;
                                                                n39 += 13;
                                                                n35 = n34;
                                                            }
                                                            n21 |= (n35 <<= n39);
                                                            n35 = n34;
                                                        } else {
                                                            n35 = n39;
                                                        }
                                                        n39 = n35 + 1;
                                                        n35 = ((String)object2).charAt(n35);
                                                        if (n35 >= n18) {
                                                            n35 &= 0x1FFF;
                                                            n32 = n39;
                                                            n39 = 13;
                                                            while (true) {
                                                                n30 = n32 + 1;
                                                                if ((n32 = (int)((String)object2).charAt(n32)) < n18) break;
                                                                n32 = (n32 & 0x1FFF) << n39;
                                                                n35 |= n32;
                                                                n39 += 13;
                                                                n32 = n30;
                                                            }
                                                            n35 |= (n32 <<= n39);
                                                            n32 = n30;
                                                        } else {
                                                            n32 = n39;
                                                        }
                                                        n18 = n35 & 0xFF;
                                                        n30 = n19;
                                                        n19 = n35 & 0x400;
                                                        if (n19 != 0) {
                                                            n19 = n10 + 1;
                                                            nArray[n10] = n28;
                                                            n10 = n19;
                                                        }
                                                        n19 = 51;
                                                        n29 = n10;
                                                        if (n18 < n19) break block51;
                                                        n19 = n32 + 1;
                                                        if ((n32 = (int)((String)object2).charAt(n32)) >= (n10 = 55296)) {
                                                            n32 &= 0x1FFF;
                                                            n41 = 13;
                                                            while (true) {
                                                                n37 = n19 + 1;
                                                                if ((n19 = (int)((String)object2).charAt(n19)) < n10) break;
                                                                n19 = (n19 & 0x1FFF) << n41;
                                                                n32 |= n19;
                                                                n41 += 13;
                                                                n19 = n37;
                                                                n10 = 55296;
                                                            }
                                                            n32 |= (n19 <<= n41);
                                                            n19 = n37;
                                                        }
                                                        n10 = n18 + -51;
                                                        n41 = n19;
                                                        n19 = 9;
                                                        if (n10 == n19 || n10 == (n19 = 17)) break block52;
                                                        n19 = 12;
                                                        if (n10 != n19 || (n19 = (int)(((Object)((Object)(protoSyntax2 = rawMessageInfo.getSyntax()))).equals((Object)(protoSyntax = ProtoSyntax.PROTO2)) ? 1 : 0)) == 0 && (n19 = n35 & 0x800) == 0) break block53;
                                                        n19 = n28 / 3 * 2 + 1;
                                                        n10 = n4 + 1;
                                                        objectArray[n19] = object = objectArray2[n4];
                                                        break block54;
                                                    }
                                                    n19 = n28 / 3 * 2 + 1;
                                                    n10 = n4 + 1;
                                                    objectArray[n19] = object = objectArray2[n4];
                                                }
                                                n4 = n10;
                                            }
                                            if ((n10 = (object6 = objectArray2[n32 *= 2]) instanceof Field) != 0) {
                                                Field field2 = (Field)object6;
                                            } else {
                                                String string2 = (String)object6;
                                                Field field3 = MessageSchema.reflectField(clazz, string2);
                                                objectArray2[n32] = field3;
                                            }
                                            n37 = n8;
                                            l2 = ((Unsafe)object3).objectFieldOffset((Field)var44_76);
                                            n19 = (int)l2;
                                            Object object7 = objectArray2[++n32];
                                            n8 = object7 instanceof Field;
                                            if (n8 != 0) {
                                                Field field4 = (Field)object7;
                                            } else {
                                                String string3 = (String)object7;
                                                Field field5 = MessageSchema.reflectField(clazz, string3);
                                                objectArray2[n32] = field5;
                                            }
                                            l2 = ((Unsafe)object3).objectFieldOffset((Field)var19_28);
                                            n32 = (int)l2;
                                            n36 = n7;
                                            n34 = n4;
                                            n10 = n41;
                                            object = object2;
                                            n38 = n32;
                                            n32 = 0;
                                            break block55;
                                        }
                                        n37 = n8;
                                        n19 = n4 + 1;
                                        String string4 = (String)objectArray2[n4];
                                        field = MessageSchema.reflectField(clazz, string4);
                                        n8 = 9;
                                        if (n18 != n8 && n18 != (n8 = 17)) break block56;
                                        n36 = n7;
                                        n7 = 1;
                                        n8 = n28 / 3 * 2 + n7;
                                        object = field.getType();
                                        objectArray[n8] = object;
                                        break block57;
                                    }
                                    n8 = 27;
                                    if (n18 != n8 && n18 != (n8 = 49)) break block58;
                                    n36 = n7;
                                    n7 = 1;
                                    n8 = n28 / 3 * 2 + n7;
                                    n4 += 2;
                                    objectArray[n8] = object5 = objectArray2[n19];
                                    break block59;
                                }
                                n8 = 12;
                                if (n18 == n8 || n18 == (n8 = 30) || n18 == (n8 = 44)) break block60;
                                n8 = 50;
                                if (n18 == n8) {
                                    Object object8;
                                    n8 = n26 + 1;
                                    nArray[n26] = n28;
                                    n26 = n28 / 3 * 2;
                                    n36 = n4 + 2;
                                    objectArray[n26] = object8 = objectArray2[n19];
                                    n19 = n35 & 0x800;
                                    if (n19 != 0) {
                                        n19 = n4 + 3;
                                        objectArray[++n26] = object = objectArray2[n36];
                                        n26 = n8;
                                    } else {
                                        n26 = n8;
                                        n19 = n36;
                                    }
                                }
                                n36 = n7;
                                break block61;
                            }
                            ProtoSyntax protoSyntax = rawMessageInfo.getSyntax();
                            n36 = n7;
                            ProtoSyntax protoSyntax4 = ProtoSyntax.PROTO2;
                            if (protoSyntax != protoSyntax4 && (n8 = n35 & 0x800) == 0) break block61;
                            n8 = n28 / 3 * 2;
                            n7 = 1;
                            n4 += 2;
                            objectArray[n8 += n7] = object4 = objectArray2[n19];
                            break block59;
                        }
                        n7 = 1;
                        break block57;
                    }
                    n19 = n4;
                }
                l2 = ((Unsafe)object3).objectFieldOffset(field);
                n8 = (int)l2;
                n10 = n35 & 0x1000;
                if (n10 != 0 && n18 <= (n10 = 17)) {
                    void var23_44;
                    Object object9;
                    n10 = n32 + 1;
                    if ((n32 = (int)((String)object2).charAt(n32)) >= (n4 = 55296)) {
                        n32 &= 0x1FFF;
                        n39 = 13;
                        while (true) {
                            n34 = n10 + 1;
                            if ((n10 = (int)((String)object2).charAt(n10)) < n4) break;
                            n10 = (n10 & 0x1FFF) << n39;
                            n32 |= n10;
                            n39 += 13;
                            n10 = n34;
                        }
                        n32 |= (n10 <<= n39);
                        n10 = n34;
                    }
                    if ((n4 = (object9 = objectArray2[n34 = n32 / 32 + (n39 = n17 * 2)]) instanceof Field) != 0) {
                        Field field6 = (Field)object9;
                    } else {
                        String string5 = (String)object9;
                        Field field7 = MessageSchema.reflectField(clazz, string5);
                        objectArray2[n34] = field7;
                    }
                    object = object2;
                    n34 = n19;
                    long l3 = ((Unsafe)object3).objectFieldOffset((Field)var23_44);
                    n19 = (int)l3;
                    n32 %= 32;
                    n38 = n19;
                } else {
                    object = object2;
                    n34 = n19;
                    n38 = 1048575;
                    n10 = n32;
                    n32 = 0;
                }
                n19 = 18;
                if (n18 >= n19 && n18 <= (n19 = 49)) {
                    n19 = n27 + 1;
                    nArray[n27] = n8;
                    n27 = n19;
                }
                n19 = n8;
            }
            n8 = n28 + 1;
            nArray2[n28] = n21;
            n21 = n28 + 2;
            n7 = n35 & 0x200;
            if (n7 != 0) {
                n7 = 0x20000000;
            } else {
                n7 = 0;
                Object var23_47 = null;
            }
            int n42 = n17;
            n17 = n35 & 0x100;
            n17 = n17 != 0 ? 0x10000000 : 0;
            n17 |= n7;
            n35 = (n35 &= 0x800) != 0 ? -1 << -1 : 0;
            n18 = n18 << 20 | (n17 |= n35);
            nArray2[n8] = n19 |= n18;
            n28 += 3;
            n19 = n32 << 20;
            nArray2[n21] = n38 |= n19;
            n21 = n10;
            object2 = object;
            n4 = n34;
            n19 = n30;
            n7 = n36;
            n10 = n29;
            n17 = n42;
            n8 = n37;
            n18 = 55296;
        }
    }

    private int numberAt(int n3) {
        return this.buffer[n3];
    }

    private static long offset(int n3) {
        return n3 & 0xFFFFF;
    }

    private static boolean oneofBooleanAt(Object object, long l2) {
        return (Boolean)UnsafeUtil.getObject(object, l2);
    }

    private static double oneofDoubleAt(Object object, long l2) {
        return (Double)UnsafeUtil.getObject(object, l2);
    }

    private static float oneofFloatAt(Object object, long l2) {
        return ((Float)UnsafeUtil.getObject(object, l2)).floatValue();
    }

    private static int oneofIntAt(Object object, long l2) {
        return (Integer)UnsafeUtil.getObject(object, l2);
    }

    private static long oneofLongAt(Object object, long l2) {
        return (Long)UnsafeUtil.getObject(object, l2);
    }

    private int parseMapField(Object object, byte[] byArray, int n3, int n4, int n7, long l2, ArrayDecoders$Registers arrayDecoders$Registers) {
        MessageSchema messageSchema = this;
        Unsafe unsafe = UNSAFE;
        Object object2 = this.getMapFieldDefaultEntry(n7);
        Object object3 = this.mapFieldSchema;
        Object object4 = unsafe.getObject(object, l2);
        boolean bl2 = object3.isImmutable(object4);
        if (bl2) {
            object3 = this.mapFieldSchema.newMapField(object2);
            MapFieldSchema mapFieldSchema = this.mapFieldSchema;
            mapFieldSchema.mergeFrom(object3, object4);
            unsafe.putObject(object, l2, object3);
            object4 = object3;
        }
        object2 = messageSchema.mapFieldSchema.forMapMetadata(object2);
        object4 = messageSchema.mapFieldSchema.forMutableMapData(object4);
        object3 = arrayDecoders$Registers;
        return this.decodeMapEntry(byArray, n3, n4, (MapEntryLite$Metadata)object2, (Map)object4, arrayDecoders$Registers);
    }

    /*
     * WARNING - void declaration
     */
    private int parseOneofField(Object object, byte[] byArray, int n3, int n4, int n7, int n8, int n10, int n14, int n15, long l2, int n16, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n17;
        block24: {
            Object object2 = object;
            Object object3 = byArray;
            int n18 = n3;
            n17 = n7;
            int n19 = n8;
            int n20 = n10;
            long l3 = l2;
            Object object4 = arrayDecoders$Registers;
            Object object5 = UNSAFE;
            int[] nArray = this.buffer;
            int n21 = n16 + 2;
            int n22 = nArray[n21];
            n21 = 1048575;
            long l4 = n22 &= n21;
            int n24 = 5;
            int bl2 = 2;
            switch (n15) {
                default: {
                    break;
                }
                case 68: {
                    int n25 = 3;
                    if (n10 != n25) break;
                    object5 = this.mutableOneofMessageFieldForMerge(object, n8, n16);
                    int n26 = n7 & 0xFFFFFFF8 | 4;
                    Schema object7 = this.getMessageFieldSchema(n16);
                    Object n32 = object5;
                    n25 = n4;
                    n17 = ArrayDecoders.mergeGroupField(object5, object7, byArray, n3, n4, n26, arrayDecoders$Registers);
                    this.storeOneofMessageField(object, n8, n16, object5);
                    break block24;
                }
                case 67: {
                    if (n10 != 0) break;
                    n17 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
                    long l7 = CodedInputStream.decodeZigZag64(arrayDecoders$Registers.long1);
                    Long schema = l7;
                    ((Unsafe)object5).putObject(object, l2, schema);
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 66: {
                    if (n10 != 0) break;
                    n17 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
                    n20 = CodedInputStream.decodeZigZag32(arrayDecoders$Registers.int1);
                    Integer string2 = n20;
                    ((Unsafe)object5).putObject(object, l2, string2);
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 63: {
                    if (n10 != 0) break;
                    n20 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
                    int n27 = arrayDecoders$Registers.int1;
                    Internal$EnumVerifier internal$EnumVerifier = this.getEnumFieldVerifier(n16);
                    if (internal$EnumVerifier != null && (n18 = (int)(internal$EnumVerifier.isInRange(n27) ? 1 : 0)) == 0) {
                        object2 = MessageSchema.getMutableUnknownFields(object);
                        long l8 = n27;
                        object3 = l8;
                        ((UnknownFieldSetLite)object2).storeField(n7, object3);
                    } else {
                        Integer l18 = n27;
                        ((Unsafe)object5).putObject(object2, l3, l18);
                        ((Unsafe)object5).putInt(object2, l4, n19);
                    }
                    n17 = n20;
                    break block24;
                }
                case 61: {
                    if (n10 != bl2) break;
                    n17 = ArrayDecoders.decodeBytes(byArray, n3, arrayDecoders$Registers);
                    Object bl3 = arrayDecoders$Registers.object1;
                    ((Unsafe)object5).putObject(object, l2, bl3);
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 60: {
                    if (n10 != bl2) break;
                    object5 = this.mutableOneofMessageFieldForMerge(object, n8, n16);
                    Schema n34 = this.getMessageFieldSchema(n16);
                    Object f7 = object5;
                    int n28 = n4;
                    n17 = ArrayDecoders.mergeMessageField(object5, n34, byArray, n3, n4, arrayDecoders$Registers);
                    this.storeOneofMessageField(object, n8, n16, object5);
                    break block24;
                }
                case 59: {
                    if (n10 != bl2) break;
                    n17 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
                    n20 = arrayDecoders$Registers.int1;
                    if (n20 == 0) {
                        String l20 = "";
                        ((Unsafe)object5).putObject(object, l2, l20);
                    } else {
                        n18 = n14 & 0x20000000;
                        if (n18 != 0) {
                            n18 = n17 + n20;
                            if ((n18 = (int)(Utf8.isValidUtf8(byArray, n17, n18) ? 1 : 0)) == 0) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        }
                        object4 = Internal.UTF_8;
                        String string2 = new String((byte[])object3, n17, n20, (Charset)object4);
                        ((Unsafe)object5).putObject(object2, l3, string2);
                        n17 += n20;
                    }
                    ((Unsafe)object5).putInt(object2, l4, n19);
                    break block24;
                }
                case 58: {
                    void var30_30;
                    if (n10 != 0) break;
                    n17 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
                    long l12 = arrayDecoders$Registers.long1;
                    long l14 = 0L;
                    long l15 = l12 - l14;
                    n18 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                    if (n18 != 0) {
                        boolean bl3 = true;
                    } else {
                        boolean bl4 = false;
                    }
                    Boolean bl5 = (boolean)var30_30;
                    ((Unsafe)object5).putObject(object2, l3, bl5);
                    ((Unsafe)object5).putInt(object2, l4, n19);
                    break block24;
                }
                case 57: 
                case 64: {
                    if (n10 != n24) break;
                    Integer d5 = ArrayDecoders.decodeFixed32(byArray, n3);
                    ((Unsafe)object5).putObject(object, l2, d5);
                    n17 = n3 + 4;
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 56: 
                case 65: {
                    n17 = 1;
                    float f5 = Float.MIN_VALUE;
                    if (n10 != n17) break;
                    long l16 = ArrayDecoders.decodeFixed64(byArray, n3);
                    Long l17 = l16;
                    ((Unsafe)object5).putObject(object, l2, l17);
                    n17 = n3 + 8;
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 55: 
                case 62: {
                    if (n10 != 0) break;
                    n17 = ArrayDecoders.decodeVarint32(byArray, n3, arrayDecoders$Registers);
                    n20 = arrayDecoders$Registers.int1;
                    Integer n29 = n20;
                    ((Unsafe)object5).putObject(object, l2, n29);
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 53: 
                case 54: {
                    if (n10 != 0) break;
                    n17 = ArrayDecoders.decodeVarint64(byArray, n3, arrayDecoders$Registers);
                    long l18 = arrayDecoders$Registers.long1;
                    Long l19 = l18;
                    ((Unsafe)object5).putObject(object, l2, l19);
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 52: {
                    if (n10 != n24) break;
                    float f6 = ArrayDecoders.decodeFloat(byArray, n3);
                    Float f7 = Float.valueOf(f6);
                    ((Unsafe)object5).putObject(object, l2, f7);
                    n17 = n3 + 4;
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
                case 51: {
                    n17 = 1;
                    float f8 = Float.MIN_VALUE;
                    if (n10 != n17) break;
                    double d2 = ArrayDecoders.decodeDouble(byArray, n3);
                    Double d5 = d2;
                    ((Unsafe)object5).putObject(object, l2, d5);
                    n17 = n3 + 8;
                    ((Unsafe)object5).putInt(object, l4, n8);
                    break block24;
                }
            }
            n17 = n18;
        }
        return n17;
    }

    private int parseRepeatedField(Object object, byte[] byArray, int n3, int n4, int n7, int n8, int n10, int n14, long l2, int n15, long l3, ArrayDecoders$Registers arrayDecoders$Registers) {
        int n16;
        block39: {
            MessageSchema messageSchema = this;
            Object object2 = object;
            Object object3 = byArray;
            int n17 = n3;
            int n18 = n10;
            int n19 = n14;
            long l4 = l3;
            ArrayDecoders$Registers arrayDecoders$Registers2 = arrayDecoders$Registers;
            Unsafe unsafe = UNSAFE;
            Internal$ProtobufList internal$ProtobufList = (Internal$ProtobufList)unsafe.getObject(object, l3);
            int n20 = internal$ProtobufList.isModifiable();
            int n21 = 2;
            if (n20 == 0) {
                n20 = internal$ProtobufList.size();
                n20 = n20 == 0 ? 10 : (n20 *= 2);
                internal$ProtobufList = internal$ProtobufList.mutableCopyWithCapacity(n20);
                unsafe.putObject(object, l4, internal$ProtobufList);
            }
            int n22 = 1;
            int n24 = 5;
            switch (n15) {
                default: {
                    break;
                }
                case 49: {
                    n16 = 3;
                    if (n18 != n16) break;
                    object2 = this.getMessageFieldSchema(n19);
                    n10 = n7;
                    n16 = ArrayDecoders.decodeGroupList((Schema)object2, n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    break block39;
                }
                case 34: 
                case 48: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedSInt64List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeSInt64List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 33: 
                case 47: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedSInt32List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeSInt32List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 30: 
                case 44: {
                    if (n18 == n21) {
                        n18 = ArrayDecoders.decodePackedVarint32List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n18 = n7;
                        object3 = byArray;
                        n17 = n3;
                        n22 = n4;
                        arrayDecoders$Registers2 = arrayDecoders$Registers;
                        n18 = ArrayDecoders.decodeVarint32List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    object3 = this.getEnumFieldVerifier(n19);
                    n17 = 0;
                    UnknownFieldSchema unknownFieldSchema = messageSchema.unknownFieldSchema;
                    n14 = n8;
                    n15 = 0;
                    SchemaUtil.filterUnknownEnumList(object, n8, (List)internal$ProtobufList, (Internal$EnumVerifier)object3, null, unknownFieldSchema);
                    n16 = n18;
                    break block39;
                }
                case 28: {
                    if (n18 != n21) break;
                    n10 = n3;
                    n14 = n4;
                    n16 = ArrayDecoders.decodeBytesList(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    break block39;
                }
                case 27: {
                    if (n18 != n21) break;
                    object2 = this.getMessageFieldSchema(n19);
                    n10 = n7;
                    n16 = ArrayDecoders.decodeMessageList((Schema)object2, n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    break block39;
                }
                case 26: {
                    if (n18 != n21) break;
                    long l7 = l2 & 0x20000000L;
                    l4 = 0L;
                    long l8 = l7 - l4;
                    n19 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                    if (n19 == 0) {
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeStringList(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    } else {
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeStringListRequireUtf8(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 25: 
                case 42: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedBoolList(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeBoolList(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 24: 
                case 31: 
                case 41: 
                case 45: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedFixed32List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != n24) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeFixed32List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 23: 
                case 32: 
                case 40: 
                case 46: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedFixed64List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != n22) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeFixed64List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 22: 
                case 29: 
                case 39: 
                case 43: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedVarint32List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeVarint32List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 20: 
                case 21: 
                case 37: 
                case 38: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedVarint64List(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != 0) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeVarint64List(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 19: 
                case 36: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedFloatList(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != n24) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeFloatList(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
                case 18: 
                case 35: {
                    if (n18 == n21) {
                        n16 = ArrayDecoders.decodePackedDoubleList(byArray, n17, internal$ProtobufList, arrayDecoders$Registers2);
                    } else {
                        if (n18 != n22) break;
                        n10 = n3;
                        n14 = n4;
                        n16 = ArrayDecoders.decodeDoubleList(n7, byArray, n3, n4, internal$ProtobufList, arrayDecoders$Registers);
                    }
                    break block39;
                }
            }
            n16 = n17;
        }
        return n16;
    }

    private int positionForFieldNumber(int n3) {
        int n4 = this.minFieldNumber;
        if (n3 >= n4 && n3 <= (n4 = this.maxFieldNumber)) {
            return this.slowPositionForFieldNumber(n3, 0);
        }
        return -1;
    }

    private int positionForFieldNumber(int n3, int n4) {
        int n7 = this.minFieldNumber;
        if (n3 >= n7 && n3 <= (n7 = this.maxFieldNumber)) {
            return this.slowPositionForFieldNumber(n3, n4);
        }
        return -1;
    }

    private int presenceMaskAndOffsetAt(int n3) {
        int[] nArray = this.buffer;
        return nArray[n3 += 2];
    }

    private void readGroupList(Object object, long l2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        object = this.listFieldSchema.mutableListAt(object, l2);
        reader.readGroupList((List)object, schema, extensionRegistryLite);
    }

    private void readMessageList(Object object, int n3, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        long l2 = MessageSchema.offset(n3);
        object = this.listFieldSchema.mutableListAt(object, l2);
        reader.readMessageList((List)object, schema, extensionRegistryLite);
    }

    private void readString(Object object, int n3, Reader reader) {
        boolean bl2 = MessageSchema.isEnforceUtf8(n3);
        if (bl2) {
            long l2 = MessageSchema.offset(n3);
            String string2 = reader.readStringRequireUtf8();
            UnsafeUtil.putObject(object, l2, (Object)string2);
        } else {
            bl2 = this.lite;
            if (bl2) {
                long l3 = MessageSchema.offset(n3);
                String string3 = reader.readString();
                UnsafeUtil.putObject(object, l3, (Object)string3);
            } else {
                long l4 = MessageSchema.offset(n3);
                ByteString byteString = reader.readBytes();
                UnsafeUtil.putObject(object, l4, (Object)byteString);
            }
        }
    }

    private void readStringList(Object object, int n3, Reader reader) {
        boolean bl2 = MessageSchema.isEnforceUtf8(n3);
        if (bl2) {
            ListFieldSchema listFieldSchema = this.listFieldSchema;
            long l2 = MessageSchema.offset(n3);
            object = listFieldSchema.mutableListAt(object, l2);
            reader.readStringListRequireUtf8((List)object);
        } else {
            ListFieldSchema listFieldSchema = this.listFieldSchema;
            long l3 = MessageSchema.offset(n3);
            object = listFieldSchema.mutableListAt(object, l3);
            reader.readStringList((List)object);
        }
    }

    private static Field reflectField(Class object, String charSequence) {
        try {
            return ((Class)object).getDeclaredField((String)charSequence);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object[] objectArray = ((Class)object).getDeclaredFields();
            int n3 = objectArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Field field = objectArray[i3];
                String string2 = field.getName();
                boolean bl2 = ((String)charSequence).equals(string2);
                if (!bl2) continue;
                return field;
            }
            charSequence = Gn.a("Field ", (String)charSequence, " for ");
            object = ((Class)object).getName();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" not found. Known fields are ");
            object = Arrays.toString(objectArray);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            RuntimeException runtimeException = new RuntimeException((String)object);
            throw runtimeException;
        }
    }

    private void setFieldPresent(Object object, int n3) {
        long l2;
        int n4 = 0xFFFFF & (n3 = this.presenceMaskAndOffsetAt(n3));
        long l3 = n4;
        long l4 = l3 - (l2 = 1048575L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return;
        }
        n3 >>>= 20;
        n3 = 1 << n3;
        int n7 = UnsafeUtil.getInt(object, l3);
        UnsafeUtil.putInt(object, l3, n3 |= n7);
    }

    private void setOneofPresent(Object object, int n3, int n4) {
        long l2 = this.presenceMaskAndOffsetAt(n4) & 0xFFFFF;
        UnsafeUtil.putInt(object, l2, n3);
    }

    private int slowPositionForFieldNumber(int n3, int n4) {
        int[] nArray = this.buffer;
        int n7 = nArray.length / 3 + -1;
        while (n4 <= n7) {
            int n8 = n7 + n4 >>> 1;
            int n10 = n8 * 3;
            int n14 = this.numberAt(n10);
            if (n3 == n14) {
                return n10;
            }
            if (n3 < n14) {
                n7 = n8 += -1;
                continue;
            }
            n4 = ++n8;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void storeFieldData(FieldInfo var0, int[] var1_1, int var2_2, Object[] var3_3) {
        var4_4 = var0.getOneof();
        var5_5 = 0;
        if (var4_4 != null) {
            var6_6 = var0.getType();
            var7_8 = var6_6.id() + 51;
            var8_9 = var4_4.getValueField();
            var9_10 = UnsafeUtil.objectFieldOffset(var8_9);
            var11_11 = (int)var9_10;
            var4_4 = var4_4.getCaseField();
            var12_12 = UnsafeUtil.objectFieldOffset((Field)var4_4);
lbl11:
            // 2 sources

            while (true) {
                var14_14 = (int)var12_12;
lbl13:
                // 2 sources

                while (true) {
                    var15_15 = 0;
                    var8_9 = null;
                    ** GOTO lbl40
                    break;
                }
                break;
            }
        } else {
            var4_4 = var0.getType();
            var6_7 = var0.getField();
            var16_16 = UnsafeUtil.objectFieldOffset(var6_7);
            var11_11 = (int)var16_16;
            var7_8 = var4_4.id();
            var15_15 = var4_4.isList();
            if (var15_15 == 0 && (var14_14 = var4_4.isMap()) == 0) {
                var4_4 = var0.getPresenceField();
                if (var4_4 == null) {
                    var14_14 = 1048575;
                } else {
                    var12_13 = UnsafeUtil.objectFieldOffset((Field)var4_4);
                    var14_14 = (int)var12_13;
                }
                var15_15 = Integer.numberOfTrailingZeros(var0.getPresenceMask());
            } else {
                var4_4 = var0.getCachedSizeField();
                if (var4_4 == null) {
                    var14_14 = 0;
                    var4_4 = null;
                    ** continue;
                }
                var4_4 = var0.getCachedSizeField();
                var12_12 = UnsafeUtil.objectFieldOffset((Field)var4_4);
                ** continue;
            }
        }
lbl40:
        // 2 sources

        var1_1 /* !! */ [var2_2] = var18_17 = var0.getFieldNumber();
        var18_17 = var2_2 + 1;
        var19_18 = var0.isEnforceUtf8();
        var19_18 = var19_18 != 0 ? 0x20000000 : 0;
        var20_19 = var0.isRequired();
        if (var20_19) {
            var5_5 = 0x10000000;
        }
        var5_5 |= var19_18;
        var1_1 /* !! */ [var18_17] = var5_5 = var5_5 | (var7_8 <<= 20) | var11_11;
        var5_5 = var2_2 + 2;
        var7_8 = var15_15 << 20;
        var1_1 /* !! */ [var5_5] = var14_14 |= var7_8;
        var1_1 /* !! */  = (int[])var0.getMessageFieldClass();
        var4_4 = var0.getMapDefaultEntry();
        if (var4_4 != null) {
            var2_2 = var2_2 / 3 * 2;
            var3_3[var2_2] = var4_4 = var0.getMapDefaultEntry();
            if (var1_1 /* !! */  != null) {
                var3_3[++var2_2] = var1_1 /* !! */ ;
            } else {
                var1_1 /* !! */  = (int[])var0.getEnumVerifier();
                if (var1_1 /* !! */  != null) {
                    var3_3[++var2_2] = var0 = var0.getEnumVerifier();
                }
            }
        } else if (var1_1 /* !! */  != null) {
            var2_2 = var2_2 / 3 * 2 + 1;
            var3_3[var2_2] = var1_1 /* !! */ ;
        } else {
            var1_1 /* !! */  = (int[])var0.getEnumVerifier();
            if (var1_1 /* !! */  != null) {
                var2_2 = var2_2 / 3 * 2 + 1;
                var3_3[var2_2] = var0 = var0.getEnumVerifier();
            }
        }
    }

    private void storeMessageField(Object object, int n3, Object object2) {
        Unsafe unsafe = UNSAFE;
        long l2 = MessageSchema.offset(this.typeAndOffsetAt(n3));
        unsafe.putObject(object, l2, object2);
        this.setFieldPresent(object, n3);
    }

    private void storeOneofMessageField(Object object, int n3, int n4, Object object2) {
        Unsafe unsafe = UNSAFE;
        long l2 = MessageSchema.offset(this.typeAndOffsetAt(n4));
        unsafe.putObject(object, l2, object2);
        this.setOneofPresent(object, n3, n4);
    }

    private static int type(int n3) {
        return (n3 & 0xFF00000) >>> 20;
    }

    private int typeAndOffsetAt(int n3) {
        int[] nArray = this.buffer;
        return nArray[++n3];
    }

    /*
     * Unable to fully structure code
     */
    private void writeFieldsInAscendingOrder(Object var1_1, Writer var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = this.hasExtensions;
        if (var6_6 != 0 && (var8_8 = (var7_7 = this.extensionSchema.getExtensions(var1_1)).isEmpty()) == 0) {
            var7_7 = var7_7.iterator();
            var9_9 = (Map.Entry)var7_7.next();
            var10_10 = var7_7;
        } else {
            var8_8 = 0;
            var9_9 = null;
            var10_10 = null;
        }
        var7_7 = var3_3.buffer;
        var11_11 = ((Object)var7_7).length;
        var12_12 = MessageSchema.UNSAFE;
        var13_13 = 1048575;
        var6_6 = 1048575;
        var14_14 = 1.469367E-39f;
        var15_15 = 0;
        var16_16 = null;
        for (var17_17 = 0; var17_17 < var11_11; var17_17 += 3) {
            var18_18 = var3_3.typeAndOffsetAt(var17_17);
            var19_19 = var3_3.numberAt(var17_17);
            var20_20 = MessageSchema.type(var18_18);
            if (var20_20 <= (var21_21 = 17)) {
                var22_22 = var3_3.buffer;
                var23_23 = var17_17 + 2;
                var21_21 = var22_22[var23_23];
                var24_24 = var21_21 & var13_13;
                if (var24_24 != var6_6) {
                    if (var24_24 == var13_13) {
                        var25_25 = var9_9;
                        var15_15 = 0;
                        var16_16 = null;
                    } else {
                        var25_25 = var9_9;
                        var26_26 = var24_24;
                        var15_15 = var6_6 = var12_12.getInt(var4_4, var26_26);
                    }
                    var6_6 = var24_24;
                } else {
                    var25_25 = var9_9;
                }
                var8_8 = var21_21 >>> 20;
                var8_8 = 1 << var8_8;
                var21_21 = var6_6;
                var28_27 = var8_8;
                var29_28 = var25_25;
lbl47:
                // 2 sources

                while (true) {
                    var30_29 = var15_15;
                    break;
                }
            } else {
                var25_25 = var9_9;
                var21_21 = var6_6;
                var29_28 = var9_9;
                var28_27 = 0;
                ** continue;
            }
            while (var29_28 != null && (var6_6 = (var7_7 = var3_3.extensionSchema).extensionNumber((Map.Entry)var29_28)) <= var19_19) {
                var7_7 = var3_3.extensionSchema;
                var7_7.serializeExtension(var5_5, (Map.Entry)var29_28);
                var6_6 = (int)var10_10.hasNext();
                if (var6_6 != 0) {
                    var29_28 = var7_7 = (Map.Entry)var10_10.next();
                    continue;
                }
                var24_24 = 0;
                var29_28 = null;
            }
            var31_30 = MessageSchema.offset(var18_18);
            switch (var20_20) lbl-1000:
            // 70 sources

            {
                default: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    break;
                }
                case 68: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var9_9 = var3_3.getMessageFieldSchema(var17_17);
                    var5_5.writeGroup(var19_19, var7_7, (Schema)var9_9);
                    ** GOTO lbl-1000
                }
                case 67: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var26_26 = MessageSchema.oneofLongAt(var4_4, var31_30);
                    var5_5.writeSInt64(var19_19, var26_26);
                    ** GOTO lbl-1000
                }
                case 66: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeSInt32(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 65: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var26_26 = MessageSchema.oneofLongAt(var4_4, var31_30);
                    var5_5.writeSFixed64(var19_19, var26_26);
                    ** GOTO lbl-1000
                }
                case 64: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeSFixed32(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 63: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeEnum(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 62: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeUInt32(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 61: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var7_7 = (ByteString)var12_12.getObject(var4_4, var31_30);
                    var5_5.writeBytes(var19_19, (ByteString)var7_7);
                    ** GOTO lbl-1000
                }
                case 60: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var9_9 = var3_3.getMessageFieldSchema(var17_17);
                    var5_5.writeMessage(var19_19, var7_7, (Schema)var9_9);
                    ** GOTO lbl-1000
                }
                case 59: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var3_3.writeString(var19_19, var7_7, var5_5);
                    ** GOTO lbl-1000
                }
                case 58: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = (int)MessageSchema.oneofBooleanAt(var4_4, var31_30);
                    var5_5.writeBool(var19_19, (boolean)var6_6);
                    ** GOTO lbl-1000
                }
                case 57: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeFixed32(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 56: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var26_26 = MessageSchema.oneofLongAt(var4_4, var31_30);
                    var5_5.writeFixed64(var19_19, var26_26);
                    ** GOTO lbl-1000
                }
                case 55: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = MessageSchema.oneofIntAt(var4_4, var31_30);
                    var5_5.writeInt32(var19_19, var6_6);
                    ** GOTO lbl-1000
                }
                case 54: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var26_26 = MessageSchema.oneofLongAt(var4_4, var31_30);
                    var5_5.writeUInt64(var19_19, var26_26);
                    ** GOTO lbl-1000
                }
                case 53: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var26_26 = MessageSchema.oneofLongAt(var4_4, var31_30);
                    var5_5.writeInt64(var19_19, var26_26);
                    ** GOTO lbl-1000
                }
                case 52: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var14_14 = MessageSchema.oneofFloatAt(var4_4, var31_30);
                    var5_5.writeFloat(var19_19, var14_14);
                    ** GOTO lbl-1000
                }
                case 51: {
                    var6_6 = (int)var3_3.isOneofPresent(var4_4, var19_19, var17_17);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var35_33 = MessageSchema.oneofDoubleAt(var4_4, var31_30);
                    var5_5.writeDouble(var19_19, var35_33);
                    ** GOTO lbl-1000
                }
                case 50: {
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var3_3.writeMapHelper(var5_5, var19_19, var7_7, var17_17);
                    ** GOTO lbl-1000
                }
                case 49: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    var16_16 = var3_3.getMessageFieldSchema(var17_17);
                    SchemaUtil.writeGroupList(var6_6, (List)var9_9, var5_5, var16_16);
                    ** GOTO lbl-1000
                }
                case 48: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    var20_20 = 1;
                    SchemaUtil.writeSInt64List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 47: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSInt32List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 46: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSFixed64List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 45: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSFixed32List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 44: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeEnumList(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 43: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeUInt32List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 42: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeBoolList(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 41: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFixed32List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 40: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFixed64List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 39: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeInt32List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 38: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeUInt64List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 37: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeInt64List(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 36: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFloatList(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 35: {
                    var20_20 = 1;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeDoubleList(var6_6, (List)var9_9, var5_5, (boolean)var20_20);
                    ** GOTO lbl-1000
                }
                case 34: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    var20_20 = 0;
                    SchemaUtil.writeSInt64List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 33: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSInt32List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 32: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSFixed64List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 31: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeSFixed32List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 30: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeEnumList(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 29: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeUInt32List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 28: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeBytesList(var6_6, (List)var9_9, var5_5);
                    ** GOTO lbl-1000
                }
                case 27: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    var16_16 = var3_3.getMessageFieldSchema(var17_17);
                    SchemaUtil.writeMessageList(var6_6, (List)var9_9, var5_5, var16_16);
                    ** GOTO lbl-1000
                }
                case 26: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeStringList(var6_6, (List)var9_9, var5_5);
                    ** GOTO lbl-1000
                }
                case 25: {
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    var20_20 = 0;
                    SchemaUtil.writeBoolList(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 24: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFixed32List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 23: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFixed64List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 22: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeInt32List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 21: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeUInt64List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 20: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeInt64List(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 19: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeFloatList(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 18: {
                    var20_20 = 0;
                    var6_6 = var3_3.numberAt(var17_17);
                    var9_9 = (List)var12_12.getObject(var4_4, var31_30);
                    SchemaUtil.writeDoubleList(var6_6, (List)var9_9, var5_5, false);
                    ** GOTO lbl-1000
                }
                case 17: {
                    var7_7 = this;
                    var9_9 = var1_1;
                    var34_32 = var29_28;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var33_31 = var11_11;
                    var11_11 = var19_19;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var9_9 = var3_3.getMessageFieldSchema(var17_17);
                    var5_5.writeGroup(var11_11, var7_7, (Schema)var9_9);
                    break;
                }
                case 16: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var26_26 = var12_12.getLong(var4_4, var31_30);
                    var5_5.writeSInt64(var11_11, var26_26);
                    break;
                }
                case 15: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeSInt32(var11_11, var6_6);
                    break;
                }
                case 14: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var26_26 = var12_12.getLong(var4_4, var31_30);
                    var5_5.writeSFixed64(var11_11, var26_26);
                    break;
                }
                case 13: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeSFixed32(var11_11, var6_6);
                    break;
                }
                case 12: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeEnum(var11_11, var6_6);
                    break;
                }
                case 11: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeUInt32(var11_11, var6_6);
                    break;
                }
                case 10: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var7_7 = (ByteString)var12_12.getObject(var4_4, var31_30);
                    var5_5.writeBytes(var11_11, (ByteString)var7_7);
                    break;
                }
                case 9: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var9_9 = var3_3.getMessageFieldSchema(var17_17);
                    var5_5.writeMessage(var11_11, var7_7, (Schema)var9_9);
                    break;
                }
                case 8: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var7_7 = var12_12.getObject(var4_4, var31_30);
                    var3_3.writeString(var11_11, var7_7, var5_5);
                    break;
                }
                case 7: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = (int)MessageSchema.booleanAt(var4_4, var31_30);
                    var5_5.writeBool(var11_11, (boolean)var6_6);
                    break;
                }
                case 6: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeFixed32(var11_11, var6_6);
                    break;
                }
                case 5: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var26_26 = var12_12.getLong(var4_4, var31_30);
                    var5_5.writeFixed64(var11_11, var26_26);
                    break;
                }
                case 4: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var6_6 = var12_12.getInt(var4_4, var31_30);
                    var5_5.writeInt32(var11_11, var6_6);
                    break;
                }
                case 3: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var26_26 = var12_12.getLong(var4_4, var31_30);
                    var5_5.writeUInt64(var11_11, var26_26);
                    break;
                }
                case 2: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var26_26 = var12_12.getLong(var4_4, var31_30);
                    var5_5.writeInt64(var11_11, var26_26);
                    break;
                }
                case 1: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var14_14 = MessageSchema.floatAt(var4_4, var31_30);
                    var5_5.writeFloat(var11_11, var14_14);
                    break;
                }
                case 0: {
                    var33_31 = var11_11;
                    var34_32 = var29_28;
                    var11_11 = var19_19;
                    var7_7 = this;
                    var9_9 = var1_1;
                    var15_15 = var17_17;
                    var18_18 = var21_21;
                    var20_20 = var30_29;
                    var19_19 = var28_27;
                    var6_6 = (int)this.isFieldPresent(var1_1, var17_17, var21_21, var30_29, var28_27);
                    if (var6_6 == 0) break;
                    var35_33 = MessageSchema.doubleAt(var4_4, var31_30);
                    var5_5.writeDouble(var11_11, var35_33);
                }
            }
            var6_6 = var21_21;
            var9_9 = var34_32;
            var15_15 = var30_29;
            var11_11 = var33_31;
            var13_13 = 1048575;
        }
        var25_25 = var9_9;
        while (var9_9 != null) {
            var7_7 = var3_3.extensionSchema;
            var7_7.serializeExtension(var5_5, (Map.Entry)var9_9);
            var6_6 = (int)var10_10.hasNext();
            if (var6_6 != 0) {
                var9_9 = var7_7 = (Map.Entry)var10_10.next();
                continue;
            }
            var8_8 = 0;
            var9_9 = null;
        }
        var7_7 = var3_3.unknownFieldSchema;
        var3_3.writeUnknownInMessageTo((UnknownFieldSchema)var7_7, var4_4, var5_5);
    }

    private void writeFieldsInDescendingOrder(Object object, Writer writer) {
        Object object2;
        boolean bl2;
        Object object3 = this.unknownFieldSchema;
        this.writeUnknownInMessageTo((UnknownFieldSchema)object3, object, writer);
        boolean bl3 = this.hasExtensions;
        if (bl3 && !(bl2 = ((FieldSet)(object3 = this.extensionSchema.getExtensions(object))).isEmpty())) {
            object3 = ((FieldSet)object3).descendingIterator();
            object2 = (Map.Entry)object3.next();
        } else {
            bl3 = false;
            object3 = null;
            bl2 = false;
            object2 = null;
        }
        int[] nArray = this.buffer;
        block71: for (int i3 = nArray.length + -3; i3 >= 0; i3 += -3) {
            Object object4;
            int n3;
            int n4 = this.typeAndOffsetAt(i3);
            int n7 = this.numberAt(i3);
            while (object2 != null && (n3 = ((ExtensionSchema)(object4 = this.extensionSchema)).extensionNumber((Map.Entry)object2)) > n7) {
                object4 = this.extensionSchema;
                ((ExtensionSchema)object4).serializeExtension(writer, (Map.Entry)object2);
                bl2 = object3.hasNext();
                if (bl2) {
                    object2 = (Map.Entry)object3.next();
                    continue;
                }
                bl2 = false;
                object2 = null;
            }
            n3 = MessageSchema.type(n4);
            boolean bl4 = true;
            switch (n3) {
                default: {
                    continue block71;
                }
                case 68: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    writer.writeGroup(n7, object5, (Schema)object4);
                    continue block71;
                }
                case 67: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.oneofLongAt(object, l2);
                    writer.writeSInt64(n7, l2);
                    continue block71;
                }
                case 66: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeSInt32(n7, n4);
                    continue block71;
                }
                case 65: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.oneofLongAt(object, l2);
                    writer.writeSFixed64(n7, l2);
                    continue block71;
                }
                case 64: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeSFixed32(n7, n4);
                    continue block71;
                }
                case 63: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeEnum(n7, n4);
                    continue block71;
                }
                case 62: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeUInt32(n7, n4);
                    continue block71;
                }
                case 61: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (ByteString)UnsafeUtil.getObject(object, l2);
                    writer.writeBytes(n7, (ByteString)object5);
                    continue block71;
                }
                case 60: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    writer.writeMessage(n7, object5, (Schema)object4);
                    continue block71;
                }
                case 59: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    this.writeString(n7, object5, writer);
                    continue block71;
                }
                case 58: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = (int)(MessageSchema.oneofBooleanAt(object, l2) ? 1 : 0);
                    writer.writeBool(n7, n4 != 0);
                    continue block71;
                }
                case 57: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeFixed32(n7, n4);
                    continue block71;
                }
                case 56: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.oneofLongAt(object, l2);
                    writer.writeFixed64(n7, l2);
                    continue block71;
                }
                case 55: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.oneofIntAt(object, l2);
                    writer.writeInt32(n7, n4);
                    continue block71;
                }
                case 54: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.oneofLongAt(object, l2);
                    writer.writeUInt64(n7, l2);
                    continue block71;
                }
                case 53: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.oneofLongAt(object, l2);
                    writer.writeInt64(n7, l2);
                    continue block71;
                }
                case 52: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    float f5 = MessageSchema.oneofFloatAt(object, l2);
                    writer.writeFloat(n7, f5);
                    continue block71;
                }
                case 51: {
                    n3 = (int)(this.isOneofPresent(object, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    double d2 = MessageSchema.oneofDoubleAt(object, l2);
                    writer.writeDouble(n7, d2);
                    continue block71;
                }
                case 50: {
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    this.writeMapHelper(writer, n7, object5, i3);
                    continue block71;
                }
                case 49: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    SchemaUtil.writeGroupList(n7, (List)object5, writer, (Schema)object4);
                    continue block71;
                }
                case 48: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeSInt64List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 47: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeSInt32List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 46: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeSFixed64List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 45: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeSFixed32List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 44: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeEnumList(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 43: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeUInt32List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 42: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeBoolList(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 41: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeFixed32List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 40: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeFixed64List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 39: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeInt32List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 38: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeUInt64List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 37: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeInt64List(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 36: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeFloatList(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 35: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeDoubleList(n7, (List)object5, writer, bl4);
                    continue block71;
                }
                case 34: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeSInt64List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 33: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeSInt32List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 32: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeSFixed64List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 31: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeSFixed32List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 30: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeEnumList(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 29: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeUInt32List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 28: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeBytesList(n7, (List)object5, writer);
                    continue block71;
                }
                case 27: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    SchemaUtil.writeMessageList(n7, (List)object5, writer, (Schema)object4);
                    continue block71;
                }
                case 26: {
                    n7 = this.numberAt(i3);
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l2);
                    SchemaUtil.writeStringList(n7, (List)object5, writer);
                    continue block71;
                }
                case 25: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeBoolList(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 24: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeFixed32List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 23: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeFixed64List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 22: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeInt32List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 21: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeUInt64List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 20: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeInt64List(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 19: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeFloatList(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 18: {
                    n7 = this.numberAt(i3);
                    long l3 = MessageSchema.offset(n4);
                    Object object5 = (List)UnsafeUtil.getObject(object, l3);
                    SchemaUtil.writeDoubleList(n7, (List)object5, writer, false);
                    continue block71;
                }
                case 17: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    writer.writeGroup(n7, object5, (Schema)object4);
                    continue block71;
                }
                case 16: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.longAt(object, l2);
                    writer.writeSInt64(n7, l2);
                    continue block71;
                }
                case 15: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeSInt32(n7, n4);
                    continue block71;
                }
                case 14: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.longAt(object, l2);
                    writer.writeSFixed64(n7, l2);
                    continue block71;
                }
                case 13: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeSFixed32(n7, n4);
                    continue block71;
                }
                case 12: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeEnum(n7, n4);
                    continue block71;
                }
                case 11: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeUInt32(n7, n4);
                    continue block71;
                }
                case 10: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = (ByteString)UnsafeUtil.getObject(object, l2);
                    writer.writeBytes(n7, (ByteString)object5);
                    continue block71;
                }
                case 9: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    object4 = this.getMessageFieldSchema(i3);
                    writer.writeMessage(n7, object5, (Schema)object4);
                    continue block71;
                }
                case 8: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    Object object5 = UnsafeUtil.getObject(object, l2);
                    this.writeString(n7, object5, writer);
                    continue block71;
                }
                case 7: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = (int)(MessageSchema.booleanAt(object, l2) ? 1 : 0);
                    writer.writeBool(n7, n4 != 0);
                    continue block71;
                }
                case 6: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeFixed32(n7, n4);
                    continue block71;
                }
                case 5: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.longAt(object, l2);
                    writer.writeFixed64(n7, l2);
                    continue block71;
                }
                case 4: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    n4 = MessageSchema.intAt(object, l2);
                    writer.writeInt32(n7, n4);
                    continue block71;
                }
                case 3: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.longAt(object, l2);
                    writer.writeUInt64(n7, l2);
                    continue block71;
                }
                case 2: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    l2 = MessageSchema.longAt(object, l2);
                    writer.writeInt64(n7, l2);
                    continue block71;
                }
                case 1: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    float f5 = MessageSchema.floatAt(object, l2);
                    writer.writeFloat(n7, f5);
                    continue block71;
                }
                case 0: {
                    n3 = (int)(this.isFieldPresent(object, i3) ? 1 : 0);
                    if (n3 == 0) continue block71;
                    long l2 = MessageSchema.offset(n4);
                    double d2 = MessageSchema.doubleAt(object, l2);
                    writer.writeDouble(n7, d2);
                }
            }
        }
        while (object2 != null) {
            object = this.extensionSchema;
            ((ExtensionSchema)object).serializeExtension(writer, (Map.Entry)object2);
            boolean bl5 = object3.hasNext();
            if (bl5) {
                object2 = object = (Map.Entry)object3.next();
                continue;
            }
            bl2 = false;
            object2 = null;
        }
    }

    private void writeMapHelper(Writer writer, int n3, Object object, int n4) {
        if (object != null) {
            MapFieldSchema mapFieldSchema = this.mapFieldSchema;
            Object object2 = this.getMapFieldDefaultEntry(n4);
            object2 = mapFieldSchema.forMapMetadata(object2);
            mapFieldSchema = this.mapFieldSchema;
            object = mapFieldSchema.forMapData(object);
            writer.writeMap(n3, (MapEntryLite$Metadata)object2, (Map)object);
        }
    }

    private void writeString(int n3, Object object, Writer writer) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            writer.writeString(n3, (String)object);
        } else {
            object = (ByteString)object;
            writer.writeBytes(n3, (ByteString)object);
        }
    }

    private void writeUnknownInMessageTo(UnknownFieldSchema unknownFieldSchema, Object object, Writer writer) {
        object = unknownFieldSchema.getFromMessage(object);
        unknownFieldSchema.writeTo(object, writer);
    }

    public boolean equals(Object object, Object object2) {
        Object object3 = this.buffer;
        int n3 = ((int[])object3).length;
        Object object4 = null;
        for (int i3 = 0; i3 < n3; i3 += 3) {
            boolean bl2 = this.equals(object, object2, i3);
            if (bl2) continue;
            return false;
        }
        object3 = this.unknownFieldSchema.getFromMessage(object);
        n3 = (int)(object3.equals(object4 = this.unknownFieldSchema.getFromMessage(object2)) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.hasExtensions ? 1 : 0);
        if (n3 != 0) {
            object = this.extensionSchema.getExtensions(object);
            object2 = this.extensionSchema.getExtensions(object2);
            return ((FieldSet)object).equals(object2);
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSerializedSize(Object var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = MessageSchema.UNSAFE;
        var5_5 = 1048575;
        var6_6 = 1048575;
        var7_7 = 0;
        var8_8 = null;
        var10_10 = 0;
        for (var9_9 = 0; var9_9 < (var12_12 = (var11_11 /* !! */  = var2_2.buffer).length); var9_9 += 3) {
            block101: {
                var12_12 = var2_2.typeAndOffsetAt(var9_9);
                var13_13 = MessageSchema.type(var12_12);
                var14_14 = var2_2.numberAt(var9_9);
                var15_15 = var2_2.buffer;
                var16_16 = var9_9 + 2;
                var17_17 = var15_15[var16_16];
                var16_16 = var17_17 & var5_5;
                var18_18 = 17;
                var19_19 = 1;
                if (var13_13 <= var18_18) {
                    if (var16_16 != var6_6) {
                        if (var16_16 == var5_5) {
                            var7_7 = 0;
                            var8_8 = null;
                        } else {
                            var20_20 = var16_16;
                            var7_7 = var6_6 = var4_4.getInt(var3_3, var20_20);
                        }
                        var6_6 = var16_16;
                    }
                    var17_17 >>>= 20;
                    var17_17 = var19_19 << var17_17;
                    var18_18 = var6_6;
                    var22_21 = var7_7;
                    var23_22 = var17_17;
                } else {
                    var18_18 = var6_6;
                    var22_21 = var7_7;
                    var23_22 = 0;
                }
                var24_23 = MessageSchema.offset(var12_12);
                var26_24 = FieldType.DOUBLE_LIST_PACKED;
                var6_6 = var26_24.id();
                if (var13_13 < var6_6 || var13_13 > (var6_6 = (var26_24 = FieldType.SINT64_LIST_PACKED).id())) {
                    var16_16 = 0;
                }
                var17_17 = 0;
                var15_15 = null;
                var27_25 = 0L;
                switch (var13_13) {
                    default: {
                        ** GOTO lbl56
                    }
                    case 68: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = (MessageLite)var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = CodedOutputStream.computeGroupSize(var14_14, (MessageLite)var26_24, (Schema)var8_8);
lbl54:
                        // 22 sources

                        while (true) {
                            var10_10 += var6_6;
lbl56:
                            // 50 sources

                            while (true) {
                                var19_19 = 0;
                                break block101;
                                break;
                            }
                            break;
                        }
                    }
                    case 67: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var20_20 = MessageSchema.oneofLongAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeSInt64Size(var14_14, var20_20);
                        ** GOTO lbl54
                    }
                    case 66: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = MessageSchema.oneofIntAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeSInt32Size(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 65: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeSFixed64Size(var14_14, var27_25);
                        ** GOTO lbl54
                    }
                    case 64: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = 0;
                        var26_24 = null;
                        var7_7 = CodedOutputStream.computeSFixed32Size(var14_14, 0);
lbl82:
                        // 3 sources

                        while (true) {
                            var10_10 += var7_7;
                            ** GOTO lbl56
                            break;
                        }
                    }
                    case 63: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = MessageSchema.oneofIntAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeEnumSize(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 62: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = MessageSchema.oneofIntAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeUInt32Size(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 61: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = (ByteString)var4_4.getObject(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeBytesSize(var14_14, (ByteString)var26_24);
                        ** GOTO lbl54
                    }
                    case 60: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = SchemaUtil.computeSizeMessage(var14_14, var26_24, (Schema)var8_8);
lbl109:
                        // 21 sources

                        while (true) {
                            var10_10 += var6_6;
                            ** GOTO lbl56
                            break;
                        }
                    }
                    case 59: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = var4_4.getObject(var3_3, var24_23);
                        var7_7 = var26_24 instanceof ByteString;
                        if (var7_7 == 0) ** GOTO lbl123
                        var26_24 = (ByteString)var26_24;
                        var6_6 = CodedOutputStream.computeBytesSize(var14_14, (ByteString)var26_24);
lbl120:
                        // 4 sources

                        while (true) {
                            var10_10 = var6_6 += var10_10;
                            ** GOTO lbl56
                            break;
                        }
lbl123:
                        // 1 sources

                        var26_24 = (String)var26_24;
                        var6_6 = CodedOutputStream.computeStringSize(var14_14, (String)var26_24);
                        ** GOTO lbl120
                    }
                    case 58: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeBoolSize(var14_14, (boolean)var19_19);
                        ** GOTO lbl54
                    }
                    case 57: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = 0;
                        var26_24 = null;
                        var7_7 = CodedOutputStream.computeFixed32Size(var14_14, 0);
                        ** GOTO lbl82
                    }
                    case 56: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeFixed64Size(var14_14, var27_25);
                        ** GOTO lbl54
                    }
                    case 55: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = MessageSchema.oneofIntAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeInt32Size(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 54: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var20_20 = MessageSchema.oneofLongAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeUInt64Size(var14_14, var20_20);
                        ** GOTO lbl54
                    }
                    case 53: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var20_20 = MessageSchema.oneofLongAt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeInt64Size(var14_14, var20_20);
                        ** GOTO lbl54
                    }
                    case 52: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeFloatSize(var14_14, 0.0f);
                        ** GOTO lbl54
                    }
                    case 51: {
                        var6_6 = (int)var2_2.isOneofPresent(var3_3, var14_14, var9_9);
                        if (var6_6 == 0) ** GOTO lbl56
                        var20_20 = 0L;
                        var29_26 = 0.0;
                        var6_6 = CodedOutputStream.computeDoubleSize(var14_14, var29_26);
                        ** GOTO lbl54
                    }
                    case 50: {
                        var26_24 = var2_2.mapFieldSchema;
                        var8_8 = var4_4.getObject(var3_3, var24_23);
                        var11_11 /* !! */  = (int[])var2_2.getMapFieldDefaultEntry(var9_9);
                        var6_6 = var26_24.getSerializedSize(var14_14, var8_8, var11_11 /* !! */ );
                        ** GOTO lbl109
                    }
                    case 49: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = SchemaUtil.computeSizeGroupList(var14_14, (List)var26_24, (Schema)var8_8);
                        ** GOTO lbl109
                    }
                    case 48: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeSInt64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
lbl194:
                        // 14 sources

                        while (true) {
                            var12_12 = var12_12 + var7_7 + var6_6;
                            var10_10 += var12_12;
                            ** GOTO lbl56
                            break;
                        }
                    }
                    case 47: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeSInt32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 46: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 45: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 44: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeEnumListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 43: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeUInt32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 42: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeBoolListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 41: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 40: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 39: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeInt32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 38: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeUInt64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 37: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeInt64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 36: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** GOTO lbl194
                    }
                    case 35: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64ListNoTag((List)var26_24);
                        if (var6_6 <= 0) ** GOTO lbl56
                        var7_7 = (int)var2_2.useCachedSizeField;
                        if (var7_7 != 0) {
                            var24_23 = var16_16;
                            var4_4.putInt(var3_3, var24_23, var6_6);
                        }
                        var7_7 = CodedOutputStream.computeTagSize(var14_14);
                        var12_12 = CodedOutputStream.computeUInt32SizeNoTag(var6_6);
                        ** continue;
                    }
                    case 34: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var13_13 = 0;
                        var6_6 = SchemaUtil.computeSizeSInt64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 33: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeSInt32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 32: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 31: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 30: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeEnumList(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 29: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeUInt32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 28: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeByteStringList(var14_14, (List)var26_24);
                        ** GOTO lbl109
                    }
                    case 27: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = SchemaUtil.computeSizeMessageList(var14_14, (List)var26_24, (Schema)var8_8);
                        ** GOTO lbl109
                    }
                    case 26: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeStringList(var14_14, (List)var26_24);
                        ** GOTO lbl109
                    }
                    case 25: {
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var13_13 = 0;
                        var6_6 = SchemaUtil.computeSizeBoolList(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 24: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 23: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 22: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeInt32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 21: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeUInt64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 20: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeInt64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 19: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed32List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 18: {
                        var13_13 = 0;
                        var26_24 = (List)var4_4.getObject(var3_3, var24_23);
                        var6_6 = SchemaUtil.computeSizeFixed64List(var14_14, (List)var26_24, false);
                        ** GOTO lbl109
                    }
                    case 17: {
                        var26_24 = this;
                        var27_25 = var24_23;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = (MessageLite)var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = CodedOutputStream.computeGroupSize(var14_14, (MessageLite)var26_24, (Schema)var8_8);
                        ** GOTO lbl54
                    }
                    case 16: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var20_20 = var4_4.getLong(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeSInt64Size(var14_14, var20_20);
                        ** GOTO lbl54
                    }
                    case 15: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = var4_4.getInt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeSInt32Size(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 14: {
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeSFixed64Size(var14_14, var27_25);
                        ** GOTO lbl54
                    }
                    case 13: {
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = 0;
                        var26_24 = null;
                        var7_7 = CodedOutputStream.computeSFixed32Size(var14_14, 0);
                        ** continue;
                    }
                    case 12: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = var4_4.getInt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeEnumSize(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 11: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = var4_4.getInt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeUInt32Size(var14_14, var6_6);
                        ** GOTO lbl54
                    }
                    case 10: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = (ByteString)var4_4.getObject(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeBytesSize(var14_14, (ByteString)var26_24);
                        ** GOTO lbl54
                    }
                    case 9: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = var4_4.getObject(var3_3, var24_23);
                        var8_8 = var2_2.getMessageFieldSchema(var9_9);
                        var6_6 = SchemaUtil.computeSizeMessage(var14_14, var26_24, (Schema)var8_8);
                        ** continue;
                    }
                    case 8: {
                        var27_25 = var24_23;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var26_24 = var4_4.getObject(var3_3, var24_23);
                        var7_7 = var26_24 instanceof ByteString;
                        if (var7_7 == 0) ** GOTO lbl557
                        var26_24 = (ByteString)var26_24;
                        var6_6 = CodedOutputStream.computeBytesSize(var14_14, (ByteString)var26_24);
                        ** GOTO lbl120
lbl557:
                        // 1 sources

                        var26_24 = (String)var26_24;
                        var6_6 = CodedOutputStream.computeStringSize(var14_14, (String)var26_24);
                        ** continue;
                    }
                    case 7: {
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) ** GOTO lbl56
                        var6_6 = CodedOutputStream.computeBoolSize(var14_14, (boolean)var19_19);
                        ** continue;
                    }
                    case 6: {
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 != 0) ** break;
                        ** continue;
                        var19_19 = 0;
                        var6_6 = CodedOutputStream.computeFixed32Size(var14_14, 0);
lbl583:
                        // 7 sources

                        while (true) {
                            var10_10 += var6_6;
                            break block101;
                            break;
                        }
                    }
                    case 5: {
                        var19_19 = 0;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) break block101;
                        var6_6 = CodedOutputStream.computeFixed64Size(var14_14, var27_25);
                        ** GOTO lbl583
                    }
                    case 4: {
                        var27_25 = var24_23;
                        var19_19 = 0;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) break block101;
                        var6_6 = var4_4.getInt(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeInt32Size(var14_14, var6_6);
                        ** GOTO lbl583
                    }
                    case 3: {
                        var27_25 = var24_23;
                        var19_19 = 0;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) break block101;
                        var20_20 = var4_4.getLong(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeUInt64Size(var14_14, var20_20);
                        ** GOTO lbl583
                    }
                    case 2: {
                        var27_25 = var24_23;
                        var19_19 = 0;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) break block101;
                        var20_20 = var4_4.getLong(var3_3, var24_23);
                        var6_6 = CodedOutputStream.computeInt64Size(var14_14, var20_20);
                        ** GOTO lbl583
                    }
                    case 1: {
                        var19_19 = 0;
                        var26_24 = this;
                        var8_8 = var1_1;
                        var12_12 = var9_9;
                        var13_13 = var18_18;
                        var17_17 = var22_21;
                        var16_16 = var23_22;
                        var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                        if (var6_6 == 0) break block101;
                        var6_6 = CodedOutputStream.computeFloatSize(var14_14, 0.0f);
                        ** GOTO lbl583
                    }
                    case 0: 
                }
                var19_19 = 0;
                var26_24 = this;
                var8_8 = var1_1;
                var12_12 = var9_9;
                var13_13 = var18_18;
                var17_17 = var22_21;
                var16_16 = var23_22;
                var6_6 = (int)this.isFieldPresent(var1_1, var9_9, var18_18, var22_21, var23_22);
                if (var6_6 != 0) {
                    var20_20 = 0L;
                    var29_26 = 0.0;
                    var6_6 = CodedOutputStream.computeDoubleSize(var14_14, var29_26);
                    ** continue;
                }
            }
            var6_6 = var18_18;
            var7_7 = var22_21;
            var5_5 = 1048575;
        }
        var26_24 = var2_2.unknownFieldSchema;
        var6_6 = var2_2.getUnknownFieldsSerializedSize((UnknownFieldSchema)var26_24, var3_3);
        var10_10 += var6_6;
        var6_6 = (int)var2_2.hasExtensions;
        if (var6_6 != 0) {
            var26_24 = var2_2.extensionSchema.getExtensions(var3_3);
            var6_6 = var26_24.getSerializedSize();
            var10_10 += var6_6;
        }
        return var10_10;
    }

    /*
     * Unable to fully structure code
     */
    public int hashCode(Object var1_1) {
        var2_2 = this.buffer;
        var3_3 = ((int[])var2_2).length;
        var5_5 = null;
        var6_6 = 0;
        block40: for (var4_4 = 0; var4_4 < var3_3; var4_4 += 3) {
            var7_7 = this.typeAndOffsetAt(var4_4);
            var8_8 = this.numberAt(var4_4);
            var9_9 = MessageSchema.offset(var7_7);
            var7_7 = MessageSchema.type(var7_7);
            var11_10 = 37;
            switch (var7_7) {
                default: {
                    continue block40;
                }
                case 68: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var6_6 *= 53;
                    var7_7 = var12_11.hashCode();
lbl20:
                    // 24 sources

                    while (true) {
                        var7_7 += var6_6;
                        var6_6 = var7_7;
                        continue block40;
                        break;
                    }
                }
                case 67: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var13_12 = MessageSchema.oneofLongAt(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 66: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
lbl36:
                    // 12 sources

                    while (true) {
                        var6_6 += var7_7;
                        continue block40;
                        break;
                    }
                }
                case 65: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var13_12 = MessageSchema.oneofLongAt(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 64: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 63: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 62: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 61: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 60: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var6_6 *= 53;
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 59: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var12_11 = (String)UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 58: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = Internal.hashBoolean(MessageSchema.oneofBooleanAt(var1_1, var9_9));
                    ** GOTO lbl20
                }
                case 57: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 56: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var13_12 = MessageSchema.oneofLongAt(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 55: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var7_7 = MessageSchema.oneofIntAt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 54: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var13_12 = MessageSchema.oneofLongAt(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 53: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var13_12 = MessageSchema.oneofLongAt(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 52: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var15_13 = MessageSchema.oneofFloatAt(var1_1, var9_9);
                    var7_7 = Float.floatToIntBits(var15_13);
                    ** GOTO lbl20
                }
                case 51: {
                    var7_7 = (int)this.isOneofPresent(var1_1, var8_8, var4_4);
                    if (var7_7 == 0) continue block40;
                    var6_6 *= 53;
                    var16_14 = MessageSchema.oneofDoubleAt(var1_1, var9_9);
                    var13_12 = Double.doubleToLongBits(var16_14);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 50: {
                    var6_6 *= 53;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    var6_6 *= 53;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 17: {
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    if (var12_11 != null) {
                        var11_10 = var12_11.hashCode();
                    }
lbl153:
                    // 5 sources

                    while (true) {
                        var6_6 = var6_6 * 53 + var11_10;
                        continue block40;
                        break;
                    }
                }
                case 16: {
                    var6_6 *= 53;
                    var13_12 = UnsafeUtil.getLong(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 15: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 14: {
                    var6_6 *= 53;
                    var13_12 = UnsafeUtil.getLong(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 13: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 12: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 11: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 10: {
                    var6_6 *= 53;
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 9: {
                    var12_11 = UnsafeUtil.getObject(var1_1, var9_9);
                    if (var12_11 == null) ** GOTO lbl153
                    var11_10 = var12_11.hashCode();
                    ** continue;
                }
                case 8: {
                    var6_6 *= 53;
                    var12_11 = (String)UnsafeUtil.getObject(var1_1, var9_9);
                    var7_7 = var12_11.hashCode();
                    ** GOTO lbl20
                }
                case 7: {
                    var6_6 *= 53;
                    var7_7 = Internal.hashBoolean(UnsafeUtil.getBoolean(var1_1, var9_9));
                    ** GOTO lbl20
                }
                case 6: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** GOTO lbl36
                }
                case 5: {
                    var6_6 *= 53;
                    var13_12 = UnsafeUtil.getLong(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 4: {
                    var6_6 *= 53;
                    var7_7 = UnsafeUtil.getInt(var1_1, var9_9);
                    ** continue;
                }
                case 3: {
                    var6_6 *= 53;
                    var13_12 = UnsafeUtil.getLong(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 2: {
                    var6_6 *= 53;
                    var13_12 = UnsafeUtil.getLong(var1_1, var9_9);
                    var7_7 = Internal.hashLong(var13_12);
                    ** GOTO lbl20
                }
                case 1: {
                    var6_6 *= 53;
                    var15_13 = UnsafeUtil.getFloat(var1_1, var9_9);
                    var7_7 = Float.floatToIntBits(var15_13);
                    ** GOTO lbl20
                }
                case 0: {
                    var6_6 *= 53;
                    var16_14 = UnsafeUtil.getDouble(var1_1, var9_9);
                    var13_12 = Double.doubleToLongBits(var16_14);
                    var7_7 = Internal.hashLong(var13_12);
                    ** continue;
                }
            }
        }
        var2_2 = this.unknownFieldSchema.getFromMessage(var1_1);
        var3_3 = var2_2.hashCode() + (var6_6 *= 53);
        var4_4 = (int)this.hasExtensions;
        if (var4_4 != 0) {
            var3_3 *= 53;
            var5_5 = this.extensionSchema;
            var1_1 = var5_5.getExtensions(var1_1);
            var18_15 = var1_1.hashCode();
            var3_3 += var18_15;
        }
        return var3_3;
    }

    public final boolean isInitialized(Object object) {
        Object object2;
        int n3;
        MessageSchema messageSchema = this;
        Object object3 = object;
        int n4 = 1048575;
        int n7 = 1048575;
        int n8 = 0;
        int n10 = 0;
        while (true) {
            int n14;
            int n15;
            block14: {
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                block11: {
                    block12: {
                        int n21;
                        block13: {
                            n20 = messageSchema.checkInitializedCount;
                            n3 = 1;
                            if (n10 >= n20) break;
                            n19 = messageSchema.intArray[n10];
                            n21 = messageSchema.numberAt(n19);
                            n18 = messageSchema.typeAndOffsetAt(n19);
                            int[] nArray = messageSchema.buffer;
                            n17 = n19 + 2;
                            n20 = nArray[n17];
                            n17 = n20 & n4;
                            n16 = n3 << (n20 >>>= 20);
                            if (n17 != n7) {
                                if (n17 != n4) {
                                    object2 = UNSAFE;
                                    long l2 = n17;
                                    n8 = ((Unsafe)object2).getInt(object3, l2);
                                }
                                n15 = n8;
                                n14 = n17;
                            } else {
                                n14 = n7;
                                n15 = n8;
                            }
                            n7 = (int)(MessageSchema.isRequired(n18) ? 1 : 0);
                            if (n7 != 0) {
                                object2 = this;
                                n20 = n19;
                                n3 = n14;
                                n17 = n15;
                                n7 = (int)(this.isFieldPresent(object, n19, n14, n15, n16) ? 1 : 0);
                                if (n7 == 0) {
                                    return false;
                                }
                            }
                            if ((n7 = MessageSchema.type(n18)) == (n8 = 9) || n7 == (n8 = 17)) break block11;
                            n8 = 27;
                            if (n7 == n8) break block12;
                            n8 = 60;
                            if (n7 == n8 || n7 == (n8 = 68)) break block13;
                            n8 = 49;
                            if (n7 == n8) break block12;
                            n8 = 50;
                            if (n7 == n8 && (n7 = (int)(messageSchema.isMapInitialized(object3, n18, n19) ? 1 : 0)) == 0) {
                                return false;
                            }
                            break block14;
                        }
                        n7 = (int)(messageSchema.isOneofPresent(object3, n21, n19) ? 1 : 0);
                        if (n7 != 0 && (n7 = (int)(MessageSchema.isInitialized(object3, n18, (Schema)(object2 = messageSchema.getMessageFieldSchema(n19))) ? 1 : 0)) == 0) {
                            return false;
                        }
                        break block14;
                    }
                    if ((n7 = (int)(messageSchema.isListInitialized(object3, n18, n19) ? 1 : 0)) == 0) {
                        return false;
                    }
                    break block14;
                }
                object2 = this;
                n20 = n19;
                n3 = n14;
                n17 = n15;
                n7 = (int)(this.isFieldPresent(object, n19, n14, n15, n16) ? 1 : 0);
                if (n7 != 0 && (n7 = (int)(MessageSchema.isInitialized(object3, n18, (Schema)(object2 = messageSchema.getMessageFieldSchema(n19))) ? 1 : 0)) == 0) {
                    return false;
                }
            }
            ++n10;
            n7 = n14;
            n8 = n15;
        }
        n7 = (int)(messageSchema.hasExtensions ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(((FieldSet)(object2 = messageSchema.extensionSchema.getExtensions(object3))).isInitialized() ? 1 : 0)) == 0) {
            return false;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public void makeImmutable(Object var1_1) {
        var2_2 = MessageSchema.isMutable(var1_1);
        if (var2_2 == 0) {
            return;
        }
        var2_2 = var1_1 instanceof GeneratedMessageLite;
        if (var2_2 != 0) {
            var3_3 = var1_1;
            var3_3 = (GeneratedMessageLite)var1_1;
            var3_3.clearMemoizedSerializedSize();
            var3_3.clearMemoizedHashCode();
            var3_3.markImmutable();
        }
        var3_3 = this.buffer;
        var2_2 = ((Object)var3_3).length;
        block5: for (var4_4 = 0; var4_4 < var2_2; var4_4 += 3) {
            var5_5 = this.typeAndOffsetAt(var4_4);
            var6_6 = MessageSchema.offset(var5_5);
            if ((var5_5 = MessageSchema.type(var5_5)) == (var8_7 = 9)) ** GOTO lbl-1000
            var8_7 = 60;
            if (var5_5 == var8_7 || var5_5 == (var8_7 = 68)) ** GOTO lbl34
            switch (var5_5) {
                default: {
                    continue block5;
                }
                case 50: {
                    var9_8 = MessageSchema.UNSAFE;
                    var10_9 = var9_8.getObject(var1_1, var6_6);
                    if (var10_9 == null) continue block5;
                    var11_10 = this.mapFieldSchema;
                    var10_9 = var11_10.toImmutable(var10_9);
                    var9_8.putObject(var1_1, var6_6, var10_9);
                    continue block5;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    var9_8 = this.listFieldSchema;
                    var9_8.makeImmutableListAt(var1_1, var6_6);
                    continue block5;
                }
lbl34:
                // 1 sources

                var5_5 = this.numberAt(var4_4);
                if ((var5_5 = (int)this.isOneofPresent(var1_1, var5_5, var4_4)) == 0) continue block5;
                var9_8 = this.getMessageFieldSchema(var4_4);
                var10_9 = MessageSchema.UNSAFE;
                var12_11 = var10_9.getObject(var1_1, var6_6);
                var9_8.makeImmutable(var12_11);
                continue block5;
                case 17: lbl-1000:
                // 2 sources

                {
                    if ((var5_5 = (int)this.isFieldPresent(var1_1, var4_4)) == 0) continue block5;
                    var9_8 = this.getMessageFieldSchema(var4_4);
                    var10_9 = MessageSchema.UNSAFE;
                    var12_11 = var10_9.getObject(var1_1, var6_6);
                    var9_8.makeImmutable(var12_11);
                }
            }
        }
        var3_3 = this.unknownFieldSchema;
        var3_3.makeImmutable(var1_1);
        var2_2 = (int)this.hasExtensions;
        if (var2_2 != 0) {
            var3_3 = this.extensionSchema;
            var3_3.makeImmutable(var1_1);
        }
    }

    public void mergeFrom(Object object, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        MessageSchema.checkMutable(object);
        UnknownFieldSchema unknownFieldSchema = this.unknownFieldSchema;
        ExtensionSchema extensionSchema = this.extensionSchema;
        this.mergeFromHelper(unknownFieldSchema, extensionSchema, object, reader, extensionRegistryLite);
    }

    public void mergeFrom(Object object, Object object2) {
        int[] nArray;
        int n3;
        int n4;
        MessageSchema.checkMutable(object);
        object2.getClass();
        Object object3 = null;
        for (n4 = 0; n4 < (n3 = (nArray = this.buffer).length); n4 += 3) {
            this.mergeSingleField(object, object2, n4);
        }
        object3 = this.unknownFieldSchema;
        SchemaUtil.mergeUnknownFields((UnknownFieldSchema)object3, object, object2);
        n4 = (int)(this.hasExtensions ? 1 : 0);
        if (n4 != 0) {
            object3 = this.extensionSchema;
            SchemaUtil.mergeExtensions((ExtensionSchema)object3, object, object2);
        }
    }

    public void mergeFrom(Object object, byte[] byArray, int n3, int n4, ArrayDecoders$Registers arrayDecoders$Registers) {
        this.parseMessage(object, byArray, n3, n4, 0, arrayDecoders$Registers);
    }

    public Object newInstance() {
        NewInstanceSchema newInstanceSchema = this.newInstanceSchema;
        MessageLite messageLite = this.defaultInstance;
        return newInstanceSchema.newInstance(messageLite);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int parseMessage(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, ArrayDecoders$Registers var6_6) {
        block64: {
            block63: {
                block62: {
                    block56: {
                        var7_7 = this;
                        var8_8 = var1_1;
                        var9_9 /* !! */  = var2_2;
                        var10_10 = var4_4;
                        var11_11 = var5_5;
                        var12_12 = var6_6;
                        MessageSchema.checkMutable(var1_1);
                        var13_13 = MessageSchema.UNSAFE;
                        var14_14 = var3_3;
                        var15_15 = -1;
                        var16_16 = 0;
                        var17_17 = 0.0f;
                        var18_18 = null;
                        var19_19 = 0;
                        var20_20 = null;
                        var21_21 = 0;
                        var22_22 = null;
                        var23_23 = 1048575;
                        block16: while (var14_14 < var10_10) {
                            block55: {
                                block61: {
                                    block60: {
                                        block59: {
                                            block58: {
                                                block57: {
                                                    var19_19 = var14_14 + 1;
                                                    if ((var14_14 = var9_9 /* !! */ [var14_14]) < 0) {
                                                        var14_14 = ArrayDecoders.decodeVarint32(var14_14, var9_9 /* !! */ , var19_19, var12_12);
                                                        var24_24 /* !! */  = var12_12.int1;
                                                        var19_19 = var14_14;
                                                    } else {
                                                        var24_24 /* !! */  = var14_14;
                                                    }
                                                    var14_14 = var24_24 /* !! */  >>> 3;
                                                    var25_25 = var24_24 /* !! */  & 7;
                                                    var26_26 = 3;
                                                    if (var14_14 > var15_15) {
                                                        var15_15 = var7_7.positionForFieldNumber(var14_14, var16_16 /= var26_26);
lbl32:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var15_15 = var7_7.positionForFieldNumber(var14_14);
                                                    ** continue;
                                                    var16_16 = var15_15;
                                                    var15_15 = -1;
                                                    if (var16_16 != var15_15) break block57;
                                                    var27_27 = var14_14;
                                                    var16_16 = var19_19;
                                                    var28_28 = var24_24 /* !! */ ;
                                                    var29_29 = var21_21;
                                                    var30_30 = var23_23;
                                                    var31_31 = var13_13;
                                                    var25_25 = var11_11;
                                                    var32_32 = -1;
                                                    var33_33 = 0;
                                                    break block55;
                                                }
                                                var34_34 = var7_7.buffer;
                                                var29_29 = var16_16 + 1;
                                                var15_15 = var34_34[var29_29];
                                                var26_26 = MessageSchema.type(var15_15);
                                                var35_35 = MessageSchema.offset(var15_15);
                                                var29_29 = var24_24 /* !! */ ;
                                                var24_24 /* !! */  = 17;
                                                var37_36 = var35_35;
                                                if (var26_26 > var24_24 /* !! */ ) break block58;
                                                var39_37 = var7_7.buffer;
                                                var40_38 = var16_16 + 2;
                                                var24_24 /* !! */  = (int)var39_37[var40_38];
                                                var40_38 = var24_24 /* !! */  >>> 20;
                                                var40_38 = 1 << var40_38;
                                                var11_11 = 1048575;
                                                var32_32 = var40_38;
                                                if ((var24_24 /* !! */  &= var11_11) != var23_23) {
                                                    if (var23_23 != var11_11) {
                                                        var35_35 = var23_23;
                                                        var13_13.putInt(var8_8, var35_35, var21_21);
                                                        var11_11 = 1048575;
                                                    }
                                                    if (var24_24 /* !! */  == var11_11) {
                                                        var21_21 = 0;
                                                        var22_22 = null;
                                                    } else {
                                                        var41_39 = var24_24 /* !! */ ;
                                                        var21_21 = var13_13.getInt(var8_8, var41_39);
                                                    }
                                                    var30_30 = var24_24 /* !! */ ;
                                                    var40_38 = var21_21;
                                                } else {
                                                    var40_38 = var21_21;
                                                    var30_30 = var23_23;
                                                }
                                                var24_24 /* !! */  = 5;
                                                switch (var26_26) {
                                                    default: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var44_41 = -1;
                                                        break;
                                                    }
                                                    case 17: {
                                                        var15_15 = 3;
                                                        if (var25_25 == var15_15) {
                                                            var43_40 = super.mutableMessageFieldForMerge(var8_8, var16_16);
                                                            var15_15 = var14_14 << 3;
                                                            var21_21 = var15_15 | 4;
                                                            var34_34 = super.getMessageFieldSchema(var16_16);
                                                            var27_27 = var14_14;
                                                            var45_42 = var43_40;
                                                            var44_41 = -1;
                                                            var25_25 = var16_16;
                                                            var18_18 = var2_2;
                                                            var23_23 = var29_29;
                                                            var24_24 /* !! */  = var4_4;
                                                            var10_10 = var29_29;
                                                            var46_43 = var6_6;
                                                            var14_14 = ArrayDecoders.mergeGroupField(var43_40, (Schema)var34_34, var2_2, var19_19, var4_4, var21_21, var6_6);
                                                            super.storeMessageField(var8_8, var16_16, var43_40);
                                                            var21_21 = var40_38 | var32_32;
                                                            var9_9 /* !! */  = var2_2;
                                                            var11_11 = var5_5;
lbl112:
                                                            // 3 sources

                                                            while (true) {
                                                                var19_19 = var10_10;
                                                                var23_23 = var30_30;
                                                                var15_15 = var27_27;
lbl116:
                                                                // 2 sources

                                                                while (true) {
                                                                    var10_10 = var4_4;
                                                                    continue block16;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var27_27 = var14_14;
                                                        var10_10 = var29_29;
                                                        var44_41 = -1;
                                                        var43_40 = var2_2;
                                                        var23_23 = var16_16;
                                                        break;
                                                    }
                                                    case 16: {
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var44_41 = -1;
                                                        var43_40 = var2_2;
                                                        if (var25_25 != 0) break;
                                                        var47_44 = var37_36;
                                                        var25_25 = ArrayDecoders.decodeVarint64(var2_2, var19_19, var12_12);
                                                        var49_45 = var12_12.long1;
                                                        var51_46 = CodedInputStream.decodeZigZag64(var49_45);
                                                        var45_42 = var13_13;
                                                        var34_34 = var1_1;
                                                        var53_47 = var37_36;
                                                        var47_44 = var51_46;
                                                        var13_13.putLong(var1_1, var37_36, var51_46);
lbl141:
                                                        // 2 sources

                                                        while (true) {
                                                            var21_21 = var40_38 | var32_32;
                                                            var11_11 = var5_5;
                                                            var16_16 = var23_23;
                                                            var9_9 /* !! */  = (byte[])var43_40;
                                                            var14_14 = var25_25;
                                                            ** GOTO lbl112
                                                            break;
                                                        }
                                                    }
                                                    case 15: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != 0) break;
                                                        var14_14 = ArrayDecoders.decodeVarint32(var2_2, var19_19, var12_12);
                                                        var15_15 = CodedInputStream.decodeZigZag32(var12_12.int1);
                                                        var13_13.putInt(var8_8, var37_36, var15_15);
lbl159:
                                                        // 10 sources

                                                        while (true) {
                                                            var21_21 = var40_38 | var32_32;
                                                            var11_11 = var5_5;
                                                            var16_16 = var23_23;
                                                            var9_9 /* !! */  = (byte[])var43_40;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    case 12: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != 0) break;
                                                        var14_14 = ArrayDecoders.decodeVarint32(var2_2, var19_19, var12_12);
                                                        var16_16 = var12_12.int1;
                                                        var20_20 = super.getEnumFieldVerifier(var23_23);
                                                        if ((var15_15 = (int)MessageSchema.isLegacyEnumIsClosed(var15_15)) != 0 && var20_20 != null && (var15_15 = (int)var20_20.isInRange(var16_16)) == 0) {
                                                            var34_34 = MessageSchema.getMutableUnknownFields(var1_1);
                                                            var53_47 = var16_16;
                                                            var18_18 = var53_47;
                                                            var34_34.storeField(var29_29, var18_18);
                                                            var11_11 = var5_5;
                                                            var16_16 = var23_23;
                                                            var21_21 = var40_38;
                                                            var19_19 = var29_29;
                                                            var23_23 = var30_30;
                                                            var15_15 = var27_27;
                                                            var10_10 = var4_4;
                                                            var9_9 /* !! */  = var2_2;
                                                            continue block16;
                                                        }
                                                        var13_13.putInt(var8_8, var47_44, var16_16);
                                                        ** GOTO lbl159
                                                    }
                                                    case 10: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var14_14 = 2;
                                                        var44_41 = -1;
                                                        if (var25_25 != var14_14) break;
                                                        var14_14 = ArrayDecoders.decodeBytes(var2_2, var19_19, var12_12);
                                                        var34_34 = var12_12.object1;
                                                        var13_13.putObject(var8_8, var37_36, var34_34);
                                                        ** GOTO lbl159
                                                    }
                                                    case 9: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var14_14 = 2;
                                                        var44_41 = -1;
                                                        if (var25_25 != var14_14) break;
                                                        var55_48 = super.mutableMessageFieldForMerge(var8_8, var16_16);
                                                        var34_34 = super.getMessageFieldSchema(var16_16);
                                                        var45_42 = var55_48;
                                                        var18_18 = var2_2;
                                                        var24_24 /* !! */  = var4_4;
                                                        var22_22 = var6_6;
                                                        var14_14 = ArrayDecoders.mergeMessageField(var55_48, (Schema)var34_34, var2_2, var19_19, var4_4, var6_6);
                                                        super.storeMessageField(var8_8, var16_16, var55_48);
                                                        ** GOTO lbl159
                                                    }
                                                    case 8: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var14_14 = 2;
                                                        var44_41 = -1;
                                                        if (var25_25 != var14_14) break;
                                                        var14_14 = (int)MessageSchema.isEnforceUtf8(var15_15);
                                                        var14_14 = var14_14 != 0 ? ArrayDecoders.decodeStringRequireUtf8(var2_2, var19_19, var12_12) : ArrayDecoders.decodeString(var2_2, var19_19, var12_12);
                                                        var34_34 = var12_12.object1;
                                                        var13_13.putObject(var8_8, var47_44, var34_34);
                                                        ** GOTO lbl159
                                                    }
                                                    case 7: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != 0) break;
                                                        var14_14 = ArrayDecoders.decodeVarint64(var2_2, var19_19, var12_12);
                                                        var56_49 = var12_12.long1;
                                                        var51_46 = 0L;
                                                        cfr_temp_0 = var56_49 - var51_46;
                                                        var19_19 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                        if (var19_19 != 0) {
                                                            var15_15 = 1;
                                                        } else {
                                                            var15_15 = 0;
                                                            var34_34 = null;
                                                        }
                                                        UnsafeUtil.putBoolean(var8_8, var47_44, (boolean)var15_15);
                                                        ** GOTO lbl159
                                                    }
                                                    case 6: 
                                                    case 13: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var56_49 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != var24_24 /* !! */ ) break;
                                                        var14_14 = ArrayDecoders.decodeFixed32(var2_2, var19_19);
                                                        var13_13.putInt(var8_8, var37_36, var14_14);
lbl266:
                                                        // 2 sources

                                                        while (true) {
                                                            var14_14 = var19_19 + 4;
                                                            ** GOTO lbl159
                                                            break;
                                                        }
                                                    }
                                                    case 5: 
                                                    case 14: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var56_49 = var37_36;
                                                        var14_14 = 1;
                                                        var44_41 = -1;
                                                        if (var25_25 != var14_14) break;
                                                        var47_44 = ArrayDecoders.decodeFixed64(var2_2, var19_19);
                                                        var45_42 = var13_13;
                                                        var34_34 = var1_1;
                                                        var25_25 = var19_19;
                                                        var53_47 = var37_36;
                                                        var13_13.putLong(var1_1, var37_36, var47_44);
                                                        var14_14 = var19_19 + 8;
                                                        ** GOTO lbl159
                                                    }
                                                    case 4: 
                                                    case 11: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var44_41 = -1;
                                                        if (var25_25 != 0) break;
                                                        var14_14 = ArrayDecoders.decodeVarint32(var2_2, var19_19, var12_12);
                                                        var15_15 = var12_12.int1;
                                                        var47_44 = var37_36;
                                                        var13_13.putInt(var8_8, var37_36, var15_15);
                                                        ** GOTO lbl159
                                                    }
                                                    case 2: 
                                                    case 3: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var47_44 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != 0) break;
                                                        var25_25 = ArrayDecoders.decodeVarint64(var2_2, var19_19, var12_12);
                                                        var53_47 = var12_12.long1;
                                                        var45_42 = var13_13;
                                                        var34_34 = var1_1;
                                                        var51_46 = var53_47;
                                                        var53_47 = var37_36;
                                                        var47_44 = var51_46;
                                                        var13_13.putLong(var1_1, var37_36, var51_46);
                                                        ** continue;
                                                    }
                                                    case 1: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var49_45 = var37_36;
                                                        var44_41 = -1;
                                                        if (var25_25 != var24_24 /* !! */ ) break;
                                                        var17_17 = ArrayDecoders.decodeFloat(var2_2, var19_19);
                                                        UnsafeUtil.putFloat(var8_8, var37_36, var17_17);
                                                        ** continue;
                                                    }
                                                    case 0: {
                                                        var43_40 = var2_2;
                                                        var27_27 = var14_14;
                                                        var23_23 = var16_16;
                                                        var10_10 = var29_29;
                                                        var49_45 = var37_36;
                                                        var16_16 = 1;
                                                        var17_17 = 1.4E-45f;
                                                        var44_41 = -1;
                                                        if (var25_25 != var16_16) break;
                                                        var58_50 = ArrayDecoders.decodeDouble(var2_2, var19_19);
                                                        UnsafeUtil.putDouble(var8_8, var37_36, var58_50);
                                                        var14_14 = var19_19 + 8;
                                                        ** continue;
                                                    }
                                                }
                                                var25_25 = var5_5;
                                                var16_16 = var19_19;
                                                var33_33 = var23_23;
                                                var31_31 = var13_13;
                                                var29_29 = var40_38;
                                                var28_28 = var10_10;
                                                var32_32 = -1;
                                                break block55;
                                            }
                                            var27_27 = var14_14;
                                            var40_38 = var16_16;
                                            var32_32 = var23_23;
                                            var10_10 = var29_29;
                                            var11_11 = 1048575;
                                            var44_41 = -1;
                                            var29_29 = var21_21;
                                            var41_39 = var35_35;
                                            var14_14 = 27;
                                            if (var26_26 != var14_14) break block59;
                                            var14_14 = 2;
                                            if (var25_25 == var14_14) {
                                                var45_42 = (Internal$ProtobufList)var13_13.getObject(var8_8, var35_35);
                                                var15_15 = (int)var45_42.isModifiable();
                                                if (var15_15 == 0) {
                                                    var15_15 = var45_42.size();
                                                    var15_15 = var15_15 == 0 ? 10 : (var15_15 *= 2);
                                                    var45_42 = var45_42.mutableCopyWithCapacity(var15_15);
                                                    var13_13.putObject(var8_8, var41_39, var45_42);
                                                }
                                                var22_22 = var45_42;
                                                var45_42 = super.getMessageFieldSchema(var40_38);
                                                var15_15 = var10_10;
                                                var18_18 = var2_2;
                                                var24_24 /* !! */  = var4_4;
                                                var30_30 = var32_32;
                                                var46_43 = var6_6;
                                                var14_14 = ArrayDecoders.decodeMessageList((Schema)var45_42, var10_10, var2_2, var19_19, var4_4, (Internal$ProtobufList)var22_22, var6_6);
                                                var11_11 = var5_5;
                                                var16_16 = var40_38;
                                                var19_19 = var10_10;
                                                var21_21 = var29_29;
                                                var23_23 = var32_32;
                                                var15_15 = var27_27;
                                                var9_9 /* !! */  = var2_2;
                                                ** continue;
                                            }
                                            var30_30 = var23_23;
                                            var60_51 = var19_19;
                                            var31_31 = var13_13;
                                            var33_33 = var16_16;
                                            var44_41 = var10_10;
                                            var32_32 = -1;
                                            break block60;
                                        }
                                        var30_30 = var23_23;
                                        var14_14 = 49;
                                        if (var26_26 <= var14_14) {
                                            var56_49 = var15_15;
                                            var45_42 = this;
                                            var37_36 = var56_49;
                                            var34_34 = var1_1;
                                            var18_18 = var2_2;
                                            var24_24 /* !! */  = var19_19;
                                            var60_51 = var19_19;
                                            var24_24 /* !! */  = var4_4;
                                            var21_21 = var10_10;
                                            var23_23 = var27_27;
                                            var3_3 = var26_26;
                                            var32_32 = -1;
                                            var26_26 = var25_25;
                                            var25_25 = var16_16;
                                            var31_31 = var13_13;
                                            var11_11 = var3_3;
                                            var33_33 = var16_16;
                                            var44_41 = var10_10;
                                            var8_8 = var6_6;
                                            var14_14 = this.parseRepeatedField(var1_1, var2_2, var19_19, var4_4, var10_10, var27_27, var26_26, var16_16, var56_49, var3_3, var35_35, var6_6);
                                            if (var14_14 != var19_19) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    var7_7 = this;
                                                    var8_8 = var1_1;
                                                    var9_9 /* !! */  = var2_2;
                                                    var10_10 = var4_4;
                                                    var11_11 = var5_5;
                                                    var12_12 = var6_6;
                                                    var19_19 = var44_41;
                                                    var21_21 = var29_29;
                                                    var16_16 = var33_33;
                                                    var23_23 = var30_30;
                                                    var15_15 = var27_27;
                                                    var13_13 = var31_31;
                                                    continue block16;
                                                    break;
                                                }
                                            }
lbl430:
                                            // 4 sources

                                            while (true) {
                                                var25_25 = var5_5;
                                                var16_16 = var14_14;
lbl433:
                                                // 2 sources

                                                while (true) {
                                                    var28_28 = var44_41;
                                                    break block55;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var60_51 = var19_19;
                                        var3_3 = var26_26;
                                        var31_31 = var13_13;
                                        var33_33 = var16_16;
                                        var44_41 = var10_10;
                                        var32_32 = -1;
                                        var14_14 = 50;
                                        var28_28 = var26_26;
                                        if (var26_26 != var14_14) break block61;
                                        var14_14 = 2;
                                        if (var25_25 != var14_14) break block60;
                                        var45_42 = this;
                                        var34_34 = var1_1;
                                        var18_18 = var2_2;
                                        var24_24 /* !! */  = var4_4;
                                        var21_21 = var16_16;
                                        var55_48 = var6_6;
                                        var14_14 = this.parseMapField(var1_1, var2_2, var19_19, var4_4, var16_16, var35_35, var6_6);
                                        if (var14_14 == var19_19) ** GOTO lbl430
                                        ** GOTO lbl-1000
                                    }
                                    var25_25 = var5_5;
                                    var16_16 = var60_51;
                                    ** continue;
                                }
                                var45_42 = this;
                                var34_34 = var1_1;
                                var18_18 = var2_2;
                                var24_24 /* !! */  = var4_4;
                                var21_21 = var10_10;
                                var23_23 = var27_27;
                                var26_26 = var25_25;
                                var25_25 = var15_15;
                                var14_14 = this.parseOneofField(var1_1, var2_2, var19_19, var4_4, var10_10, var27_27, var26_26, var15_15, var3_3, var35_35, var16_16, var6_6);
                                if (var14_14 != var19_19) ** break;
                                ** continue;
                                ** continue;
                            }
                            if (var28_28 == var25_25 && var25_25 != 0) {
                                var15_15 = 1048575;
                                var13_13 = this;
                                var23_23 = var16_16;
                                var21_21 = var29_29;
                                var14_14 = var30_30;
                                break block56;
                            }
                            var13_13 = this;
                            var14_14 = (int)this.hasExtensions;
                            var61_52 = var6_6;
                            if (var14_14 != 0 && (var45_42 = var6_6.extensionRegistry) != (var34_34 = (Object)ExtensionRegistryLite.getEmptyRegistry())) {
                                var22_22 = this.defaultInstance;
                                var46_43 = this.unknownFieldSchema;
                                var14_14 = var28_28;
                                var34_34 = var2_2;
                                var19_19 = var4_4;
                                var39_37 = var1_1;
                                var43_40 = var6_6;
                                var14_14 = ArrayDecoders.decodeExtensionOrUnknownField(var28_28, var2_2, var16_16, var4_4, var1_1, (MessageLite)var22_22, (UnknownFieldSchema)var46_43, var6_6);
                            } else {
                                var39_37 = MessageSchema.getMutableUnknownFields(var1_1);
                                var14_14 = var28_28;
                                var34_34 = var2_2;
                                var19_19 = var4_4;
                                var22_22 = var6_6;
                                var14_14 = ArrayDecoders.decodeUnknownField(var28_28, var2_2, var16_16, var4_4, (UnknownFieldSetLite)var39_37, var6_6);
                            }
                            var8_8 = var1_1;
                            var9_9 /* !! */  = var2_2;
                            var10_10 = var4_4;
                            var19_19 = var28_28;
                            var7_7 = var13_13;
                            var12_12 = var61_52;
                            var21_21 = var29_29;
                            var16_16 = var33_33;
                            var23_23 = var30_30;
                            var15_15 = var27_27;
                            var13_13 = var31_31;
                            var11_11 = var25_25;
                        }
                        var29_29 = var21_21;
                        var30_30 = var23_23;
                        var31_31 = var13_13;
                        var25_25 = var11_11;
                        var13_13 = var7_7;
                        var23_23 = var14_14;
                        var28_28 = var19_19;
                        var14_14 = var30_30;
                        var15_15 = 1048575;
                    }
                    if (var14_14 != var15_15) {
                        var49_45 = var14_14;
                        var43_40 = var1_1;
                        var18_18 = var31_31;
                        var31_31.putInt(var1_1, var49_45, var21_21);
                    } else {
                        var43_40 = var1_1;
                    }
                    var14_14 = var13_13.checkInitializedCount;
                    var15_15 = 0;
                    var34_34 = null;
                    var19_19 = 0;
                    var20_20 = null;
                    for (var11_11 = var14_14; var11_11 < (var14_14 = var13_13.repeatedFieldOffsetStart); ++var11_11) {
                        var16_16 = var13_13.intArray[var11_11];
                        var39_37 = var13_13.unknownFieldSchema;
                        var45_42 = this;
                        var34_34 = var1_1;
                        var22_22 = var1_1;
                        var20_20 = var45_42 = this.filterMapUnknownEnumValues(var1_1, var16_16, var20_20, (UnknownFieldSchema)var39_37, var1_1);
                        var20_20 = (UnknownFieldSetLite)var45_42;
                    }
                    if (var20_20 != null) {
                        var45_42 = var13_13.unknownFieldSchema;
                        var45_42.setBuilderToMessage(var43_40, var20_20);
                    }
                    if (var25_25 != 0) break block62;
                    var14_14 = var4_4;
                    if (var23_23 != var4_4) {
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    break block63;
                }
                var14_14 = var4_4;
                if (var23_23 > var4_4 || var28_28 != var25_25) break block64;
            }
            return var23_23;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public void writeTo(Object object, Writer writer) {
        Writer$FieldOrder writer$FieldOrder;
        Writer$FieldOrder writer$FieldOrder2 = writer.fieldOrder();
        if (writer$FieldOrder2 == (writer$FieldOrder = Writer$FieldOrder.DESCENDING)) {
            this.writeFieldsInDescendingOrder(object, writer);
        } else {
            this.writeFieldsInAscendingOrder(object, writer);
        }
    }
}

