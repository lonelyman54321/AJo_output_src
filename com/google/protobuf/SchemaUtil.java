/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.LazyFieldLite;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLiteSchema;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.RandomAccess;

final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class GENERATED_MESSAGE_CLASS = SchemaUtil.getGeneratedMessageClass();
    private static final UnknownFieldSchema UNKNOWN_FIELD_SET_FULL_SCHEMA = SchemaUtil.getUnknownFieldSetSchema();
    private static final UnknownFieldSchema UNKNOWN_FIELD_SET_LITE_SCHEMA;

    static {
        UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = new UnknownFieldSetLiteSchema();
        UNKNOWN_FIELD_SET_LITE_SCHEMA = unknownFieldSetLiteSchema;
    }

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n4) + n3;
        }
        return CodedOutputStream.computeBoolSize(n3, true) * n4;
    }

    public static int computeSizeBoolListNoTag(List list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.computeTagSize(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            ByteString byteString = (ByteString)list.get(i3);
            n4 = CodedOutputStream.computeBytesSizeNoTag(byteString);
            n3 += n4;
        }
        return n3;
    }

    public static int computeSizeEnumList(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeEnumListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeEnumListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof IntArrayList;
        if (n7 != 0) {
            list = (IntArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = CodedOutputStream.computeEnumSizeNoTag(((IntArrayList)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.computeEnumSizeNoTag(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int computeSizeFixed32List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n4 *= 4) + n3;
        }
        return CodedOutputStream.computeFixed32Size(n3, 0) * n4;
    }

    public static int computeSizeFixed32ListNoTag(List list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n4 *= 8) + n3;
        }
        return CodedOutputStream.computeFixed64Size(n3, 0L) * n4;
    }

    public static int computeSizeFixed64ListNoTag(List list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            MessageLite messageLite = (MessageLite)list.get(i3);
            int n8 = CodedOutputStream.computeGroupSize(n3, messageLite);
            n7 += n8;
        }
        return n7;
    }

    public static int computeSizeGroupList(int n3, List list, Schema schema) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            MessageLite messageLite = (MessageLite)list.get(i3);
            int n8 = CodedOutputStream.computeGroupSize(n3, messageLite, schema);
            n7 += n8;
        }
        return n7;
    }

    public static int computeSizeInt32List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeInt32ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeInt32ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof IntArrayList;
        if (n7 != 0) {
            list = (IntArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = CodedOutputStream.computeInt32SizeNoTag(((IntArrayList)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.computeInt32SizeNoTag(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int computeSizeInt64List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n4 = SchemaUtil.computeSizeInt64ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n4) + n3;
        }
        int n7 = list.size();
        return CodedOutputStream.computeTagSize(n3) * n7 + n4;
    }

    public static int computeSizeInt64ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof LongArrayList;
        if (n7 != 0) {
            list = (LongArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((LongArrayList)list).getLong(n3);
                int n8 = CodedOutputStream.computeInt64SizeNoTag(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = CodedOutputStream.computeInt64SizeNoTag(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int computeSizeMessage(int n3, Object object, Schema schema) {
        boolean bl2 = object instanceof LazyFieldLite;
        if (bl2) {
            object = (LazyFieldLite)object;
            return CodedOutputStream.computeLazyFieldSize(n3, (LazyFieldLite)object);
        }
        object = (MessageLite)object;
        return CodedOutputStream.computeMessageSize(n3, (MessageLite)object, schema);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int computeSizeMessageList(int n3, List list) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.computeTagSize(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof LazyFieldLite;
            if (bl2) {
                LazyFieldLite lazyFieldLite = (LazyFieldLite)e2;
                n8 = CodedOutputStream.computeLazyFieldSizeNoTag(lazyFieldLite);
            } else {
                MessageLite messageLite = (MessageLite)e2;
                n8 = CodedOutputStream.computeMessageSizeNoTag(messageLite);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int computeSizeMessageList(int n3, List list, Schema schema) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.computeTagSize(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof LazyFieldLite;
            if (bl2) {
                LazyFieldLite lazyFieldLite = (LazyFieldLite)e2;
                n8 = CodedOutputStream.computeLazyFieldSizeNoTag(lazyFieldLite);
            } else {
                MessageLite messageLite = (MessageLite)e2;
                n8 = CodedOutputStream.computeMessageSizeNoTag(messageLite, schema);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    public static int computeSizeSInt32List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeSInt32ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeSInt32ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof IntArrayList;
        if (n7 != 0) {
            list = (IntArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = CodedOutputStream.computeSInt32SizeNoTag(((IntArrayList)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.computeSInt32SizeNoTag(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int computeSizeSInt64List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeSInt64ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeSInt64ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof LongArrayList;
        if (n7 != 0) {
            list = (LongArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((LongArrayList)list).getLong(n3);
                int n8 = CodedOutputStream.computeSInt64SizeNoTag(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = CodedOutputStream.computeSInt64SizeNoTag(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int computeSizeStringList(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.computeTagSize(n3) * n7;
        int n8 = list instanceof LazyStringList;
        if (n8 != 0) {
            list = (LazyStringList)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.getRaw(n4);
                boolean bl2 = object instanceof ByteString;
                if (bl2) {
                    ByteString byteString = (ByteString)object;
                    n8 = CodedOutputStream.computeBytesSizeNoTag(byteString);
                } else {
                    String string2 = (String)object;
                    n8 = CodedOutputStream.computeStringSizeNoTag(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof ByteString;
                if (bl3) {
                    ByteString byteString = (ByteString)e2;
                    n8 = CodedOutputStream.computeBytesSizeNoTag(byteString);
                } else {
                    String string3 = (String)e2;
                    n8 = CodedOutputStream.computeStringSizeNoTag(string3);
                }
                n3 = n8 += n3;
                ++n4;
            }
        }
        return n3;
    }

    public static int computeSizeUInt32List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeUInt32ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeUInt32ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof IntArrayList;
        if (n7 != 0) {
            list = (IntArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = CodedOutputStream.computeUInt32SizeNoTag(((IntArrayList)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.computeUInt32SizeNoTag(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int computeSizeUInt64List(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = SchemaUtil.computeSizeUInt64ListNoTag(list);
        if (bl2) {
            n3 = CodedOutputStream.computeTagSize(n3);
            return CodedOutputStream.computeLengthDelimitedFieldSize(n7) + n3;
        }
        return CodedOutputStream.computeTagSize(n3) * n4 + n7;
    }

    public static int computeSizeUInt64ListNoTag(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof LongArrayList;
        if (n7 != 0) {
            list = (LongArrayList)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((LongArrayList)list).getLong(n3);
                int n8 = CodedOutputStream.computeUInt64SizeNoTag(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = CodedOutputStream.computeUInt64SizeNoTag(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static Object filterUnknownEnumList(Object list, int n3, List object, Internal$EnumLiteMap internal$EnumLiteMap, Object object2, UnknownFieldSchema unknownFieldSchema) {
        if (internal$EnumLiteMap == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            Object var8_8 = null;
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                Internal$EnumLite internal$EnumLite = internal$EnumLiteMap.findValueByNumber(n10);
                if (internal$EnumLite != null) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = SchemaUtil.storeUnknownEnum(list, n3, n10, object2, unknownFieldSchema);
            }
            if (n7 != n4) {
                list = ((List)object).subList(n7, n4);
                list.clear();
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                Internal$EnumLite internal$EnumLite = internal$EnumLiteMap.findValueByNumber(n4);
                if (internal$EnumLite != null) continue;
                object2 = SchemaUtil.storeUnknownEnum(list, n3, n4, object2, unknownFieldSchema);
                object.remove();
            }
        }
        return object2;
    }

    public static Object filterUnknownEnumList(Object list, int n3, List object, Internal$EnumVerifier internal$EnumVerifier, Object object2, UnknownFieldSchema unknownFieldSchema) {
        if (internal$EnumVerifier == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                boolean bl2 = internal$EnumVerifier.isInRange(n10);
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = SchemaUtil.storeUnknownEnum(list, n3, n10, object2, unknownFieldSchema);
            }
            if (n7 != n4) {
                list = ((List)object).subList(n7, n4);
                list.clear();
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                boolean bl3 = internal$EnumVerifier.isInRange(n4);
                if (bl3) continue;
                object2 = SchemaUtil.storeUnknownEnum(list, n3, n4, object2, unknownFieldSchema);
                object.remove();
            }
        }
        return object2;
    }

    private static Class getGeneratedMessageClass() {
        String string2 = "com.google.protobuf.GeneratedMessageV3";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object getMapDefaultEntry(Class object, String object2) {
        Throwable throwable2;
        block3: {
            CharSequence charSequence;
            Object object3;
            String string2 = "Unable to look up map field default entry holder class for ";
            try {
                object3 = new StringBuilder();
                charSequence = ((Class)object).getName();
                object3.append((String)charSequence);
                charSequence = "$";
                object3.append((String)charSequence);
                int n3 = 1;
                String string3 = SchemaUtil.toCamelCase((String)object2, n3 != 0);
                object3.append(string3);
                string3 = "DefaultEntryHolder";
                object3.append(string3);
                object3 = object3.toString();
                object3 = Class.forName((String)object3);
                object3 = object3.getDeclaredFields();
                int n4 = ((Field[])object3).length;
                if (n4 == n3) {
                    object = null;
                    object = object3[0];
                    return UnsafeUtil.getStaticObject((Field)object);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            object2 = " in ";
            ((StringBuilder)charSequence).append((String)object2);
            object = ((Class)object).getName();
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        object2 = new RuntimeException(throwable2);
        throw object2;
    }

    private static UnknownFieldSchema getUnknownFieldSetSchema() {
        GenericDeclaration genericDeclaration;
        block5: {
            try {
                genericDeclaration = SchemaUtil.getUnknownFieldSetSchemaClass();
                if (genericDeclaration != null) break block5;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        genericDeclaration = genericDeclaration.getConstructor(null);
        genericDeclaration = ((Constructor)genericDeclaration).newInstance(null);
        return (UnknownFieldSchema)((Object)genericDeclaration);
    }

    private static Class getUnknownFieldSetSchemaClass() {
        String string2 = "com.google.protobuf.UnknownFieldSetSchema";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void mergeExtensions(ExtensionSchema object, Object object2, Object object3) {
        boolean bl2 = ((FieldSet)(object3 = ((ExtensionSchema)object).getExtensions(object3))).isEmpty();
        if (!bl2) {
            object = ((ExtensionSchema)object).getMutableExtensions(object2);
            ((FieldSet)object).mergeFrom((FieldSet)object3);
        }
    }

    public static void mergeMap(MapFieldSchema object, Object object2, Object object3, long l2) {
        Object object4 = UnsafeUtil.getObject(object2, l2);
        object3 = UnsafeUtil.getObject(object3, l2);
        object = object.mergeFrom(object4, object3);
        UnsafeUtil.putObject(object2, l2, object);
    }

    public static void mergeUnknownFields(UnknownFieldSchema unknownFieldSchema, Object object, Object object2) {
        Object object3 = unknownFieldSchema.getFromMessage(object);
        object2 = unknownFieldSchema.getFromMessage(object2);
        object2 = unknownFieldSchema.merge(object3, object2);
        unknownFieldSchema.setToMessage(object, object2);
    }

    public static void requireGeneratedMessage(Class serializable) {
        boolean bl2;
        Class clazz = GeneratedMessageLite.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = GENERATED_MESSAGE_CLASS) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static boolean safeEquals(Object object, Object object2) {
        boolean bl2;
        if (!(object == object2 || object != null && (bl2 = object.equals(object2)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean shouldUseTableSwitch(int n3, int n4, int n7) {
        int n8 = 40;
        boolean bl2 = true;
        if (n4 < n8) {
            return bl2;
        }
        long l2 = n4;
        long l3 = n3;
        l2 -= l3;
        l3 = n7;
        long l4 = (long)2 * l3;
        long l7 = 3;
        l3 += l7;
        long l8 = 10;
        long l12 = (l2 += l8) - (l3 = l3 * l7 + (l4 += l7));
        n7 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
        if (n7 > 0) {
            bl2 = false;
        }
        return bl2;
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArray) {
        int n3 = fieldInfoArray.length;
        int n4 = 0;
        if (n3 == 0) {
            return false;
        }
        n3 = fieldInfoArray[0].getFieldNumber();
        n4 = fieldInfoArray.length + -1;
        n4 = fieldInfoArray[n4].getFieldNumber();
        int n7 = fieldInfoArray.length;
        return SchemaUtil.shouldUseTableSwitch(n3, n4, n7);
    }

    public static Object storeUnknownEnum(Object object, int n3, int n4, Object object2, UnknownFieldSchema unknownFieldSchema) {
        if (object2 == null) {
            object2 = unknownFieldSchema.getBuilderFromMessage(object);
        }
        long l2 = n4;
        unknownFieldSchema.addVarint(object2, n3, l2);
        return object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String toCamelCase(String var0, boolean var1_1) {
        var2_2 = new StringBuilder();
        block0: for (var3_3 = '\u0000'; var3_3 < (var4_4 = var0.length()); ++var3_3) {
            block6: {
                block7: {
                    var5_5 = 'a';
                    var4_4 = var0.charAt(var3_3);
                    if (var5_5 <= var4_4 && var4_4 <= (var5_5 = 'z')) {
                        if (var1_1 != '\u0000') {
                            var1_1 = var4_4 += -32;
                            var2_2.append(var1_1);
                        } else {
                            var2_2.append(var4_4);
                        }
lbl13:
                        // 4 sources

                        while (true) {
                            var1_1 = '\u0000';
                            continue block0;
                            break;
                        }
                    }
                    var5_5 = 'A';
                    if (var5_5 > var4_4 || var4_4 > (var5_5 = 'Z')) break block6;
                    if (var3_3 != '\u0000' || var1_1 != '\u0000') break block7;
                    var1_1 = var4_4 += 32;
                    var2_2.append(var1_1);
                    ** GOTO lbl13
                }
                var2_2.append(var4_4);
                ** continue;
            }
            var1_1 = 48;
            var5_5 = '\u0001';
            if (var1_1 <= var4_4 && var4_4 <= (var1_1 = '9')) {
                var2_2.append(var4_4);
            }
            var1_1 = '\u0001';
        }
        return var2_2.toString();
    }

    public static UnknownFieldSchema unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int n3, boolean bl2, Writer writer) {
        if (bl2) {
            bl2 = true;
            writer.writeBool(n3, bl2);
        }
    }

    public static void writeBoolList(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeBoolList(n3, list, bl2);
        }
    }

    public static void writeBytes(int n3, ByteString byteString, Writer writer) {
        boolean bl2;
        if (byteString != null && !(bl2 = byteString.isEmpty())) {
            writer.writeBytes(n3, byteString);
        }
    }

    public static void writeBytesList(int n3, List list, Writer writer) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeBytesList(n3, list);
        }
    }

    public static void writeDouble(int n3, double d2, Writer writer) {
        long l2;
        long l3 = Double.doubleToRawLongBits(d2);
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeDouble(n3, d2);
        }
    }

    public static void writeDoubleList(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeDoubleList(n3, list, bl2);
        }
    }

    public static void writeEnum(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeEnum(n3, n4);
        }
    }

    public static void writeEnumList(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeEnumList(n3, list, bl2);
        }
    }

    public static void writeFixed32(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeFixed32(n3, n4);
        }
    }

    public static void writeFixed32List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeFixed32List(n3, list, bl2);
        }
    }

    public static void writeFixed64(int n3, long l2, Writer writer) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeFixed64(n3, l2);
        }
    }

    public static void writeFixed64List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeFixed64List(n3, list, bl2);
        }
    }

    public static void writeFloat(int n3, float f5, Writer writer) {
        int n4 = Float.floatToRawIntBits(f5);
        if (n4 != 0) {
            writer.writeFloat(n3, f5);
        }
    }

    public static void writeFloatList(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeFloatList(n3, list, bl2);
        }
    }

    public static void writeGroupList(int n3, List list, Writer writer) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeGroupList(n3, list);
        }
    }

    public static void writeGroupList(int n3, List list, Writer writer, Schema schema) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeGroupList(n3, list, schema);
        }
    }

    public static void writeInt32(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeInt32(n3, n4);
        }
    }

    public static void writeInt32List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeInt32List(n3, list, bl2);
        }
    }

    public static void writeInt64(int n3, long l2, Writer writer) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeInt64(n3, l2);
        }
    }

    public static void writeInt64List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeInt64List(n3, list, bl2);
        }
    }

    public static void writeLazyFieldList(int n3, List object, Writer writer) {
        boolean bl2;
        if (object != null && !(bl2 = object.isEmpty())) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                LazyFieldLite lazyFieldLite = (LazyFieldLite)object.next();
                lazyFieldLite.writeTo(writer, n3);
            }
        }
    }

    public static void writeMessage(int n3, Object object, Writer writer) {
        if (object != null) {
            writer.writeMessage(n3, object);
        }
    }

    public static void writeMessageList(int n3, List list, Writer writer) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeMessageList(n3, list);
        }
    }

    public static void writeMessageList(int n3, List list, Writer writer, Schema schema) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeMessageList(n3, list, schema);
        }
    }

    public static void writeSFixed32(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeSFixed32(n3, n4);
        }
    }

    public static void writeSFixed32List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeSFixed32List(n3, list, bl2);
        }
    }

    public static void writeSFixed64(int n3, long l2, Writer writer) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeSFixed64(n3, l2);
        }
    }

    public static void writeSFixed64List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeSFixed64List(n3, list, bl2);
        }
    }

    public static void writeSInt32(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeSInt32(n3, n4);
        }
    }

    public static void writeSInt32List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeSInt32List(n3, list, bl2);
        }
    }

    public static void writeSInt64(int n3, long l2, Writer writer) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeSInt64(n3, l2);
        }
    }

    public static void writeSInt64List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeSInt64List(n3, list, bl2);
        }
    }

    public static void writeString(int n3, Object object, Writer writer) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            SchemaUtil.writeStringInternal(n3, (String)object, writer);
        } else {
            object = (ByteString)object;
            SchemaUtil.writeBytes(n3, (ByteString)object, writer);
        }
    }

    private static void writeStringInternal(int n3, String string2, Writer writer) {
        boolean bl2;
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            writer.writeString(n3, string2);
        }
    }

    public static void writeStringList(int n3, List list, Writer writer) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            writer.writeStringList(n3, list);
        }
    }

    public static void writeUInt32(int n3, int n4, Writer writer) {
        if (n4 != 0) {
            writer.writeUInt32(n3, n4);
        }
    }

    public static void writeUInt32List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeUInt32List(n3, list, bl2);
        }
    }

    public static void writeUInt64(int n3, long l2, Writer writer) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            writer.writeUInt64(n3, l2);
        }
    }

    public static void writeUInt64List(int n3, List list, Writer writer, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            writer.writeUInt64List(n3, list, bl2);
        }
    }
}

