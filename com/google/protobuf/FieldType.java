/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldType$1;
import com.google.protobuf.FieldType$Collection;
import com.google.protobuf.JavaType;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public final class FieldType
extends Enum {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final /* enum */ FieldType BOOL;
    public static final /* enum */ FieldType BOOL_LIST;
    public static final /* enum */ FieldType BOOL_LIST_PACKED;
    public static final /* enum */ FieldType BYTES;
    public static final /* enum */ FieldType BYTES_LIST;
    public static final /* enum */ FieldType DOUBLE;
    public static final /* enum */ FieldType DOUBLE_LIST;
    public static final /* enum */ FieldType DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final /* enum */ FieldType ENUM;
    public static final /* enum */ FieldType ENUM_LIST;
    public static final /* enum */ FieldType ENUM_LIST_PACKED;
    public static final /* enum */ FieldType FIXED32;
    public static final /* enum */ FieldType FIXED32_LIST;
    public static final /* enum */ FieldType FIXED32_LIST_PACKED;
    public static final /* enum */ FieldType FIXED64;
    public static final /* enum */ FieldType FIXED64_LIST;
    public static final /* enum */ FieldType FIXED64_LIST_PACKED;
    public static final /* enum */ FieldType FLOAT;
    public static final /* enum */ FieldType FLOAT_LIST;
    public static final /* enum */ FieldType FLOAT_LIST_PACKED;
    public static final /* enum */ FieldType GROUP;
    public static final /* enum */ FieldType GROUP_LIST;
    public static final /* enum */ FieldType INT32;
    public static final /* enum */ FieldType INT32_LIST;
    public static final /* enum */ FieldType INT32_LIST_PACKED;
    public static final /* enum */ FieldType INT64;
    public static final /* enum */ FieldType INT64_LIST;
    public static final /* enum */ FieldType INT64_LIST_PACKED;
    public static final /* enum */ FieldType MAP;
    public static final /* enum */ FieldType MESSAGE;
    public static final /* enum */ FieldType MESSAGE_LIST;
    public static final /* enum */ FieldType SFIXED32;
    public static final /* enum */ FieldType SFIXED32_LIST;
    public static final /* enum */ FieldType SFIXED32_LIST_PACKED;
    public static final /* enum */ FieldType SFIXED64;
    public static final /* enum */ FieldType SFIXED64_LIST;
    public static final /* enum */ FieldType SFIXED64_LIST_PACKED;
    public static final /* enum */ FieldType SINT32;
    public static final /* enum */ FieldType SINT32_LIST;
    public static final /* enum */ FieldType SINT32_LIST_PACKED;
    public static final /* enum */ FieldType SINT64;
    public static final /* enum */ FieldType SINT64_LIST;
    public static final /* enum */ FieldType SINT64_LIST_PACKED;
    public static final /* enum */ FieldType STRING;
    public static final /* enum */ FieldType STRING_LIST;
    public static final /* enum */ FieldType UINT32;
    public static final /* enum */ FieldType UINT32_LIST;
    public static final /* enum */ FieldType UINT32_LIST_PACKED;
    public static final /* enum */ FieldType UINT64;
    public static final /* enum */ FieldType UINT64_LIST;
    public static final /* enum */ FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final FieldType$Collection collection;
    private final Class elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    static {
        FieldType fieldType;
        FieldType fieldType2;
        FieldType fieldType3;
        FieldType fieldType4;
        FieldType fieldType5;
        FieldType fieldType6;
        FieldType fieldType7;
        FieldType fieldType8;
        FieldType fieldType9;
        FieldType fieldType10;
        FieldType fieldType11;
        FieldType fieldType12;
        FieldType fieldType13;
        FieldType fieldType14;
        FieldType fieldType15;
        FieldType fieldType16;
        FieldType fieldType17;
        FieldType fieldType18;
        FieldType fieldType19;
        FieldType fieldType20;
        FieldType fieldType21;
        FieldType fieldType22;
        FieldType fieldType23;
        FieldType fieldType24;
        FieldType fieldType25;
        FieldType fieldType26;
        FieldType fieldType27;
        FieldType fieldType28;
        FieldType fieldType29;
        FieldType fieldType30;
        FieldType fieldType31;
        FieldType fieldType32;
        FieldType fieldType33;
        FieldType fieldType34;
        FieldType fieldType35;
        FieldType fieldType36;
        FieldType fieldType37;
        FieldType fieldType38;
        FieldType fieldType39;
        FieldType fieldType40;
        FieldType fieldType41;
        Enum enum_ = FieldType$Collection.SCALAR;
        Enum enum_2 = JavaType.DOUBLE;
        FieldType[] fieldTypeArray = fieldType41;
        Enum enum_3 = enum_;
        FieldType[] fieldTypeArray2 = enum_2;
        DOUBLE = fieldType41 = new FieldType("DOUBLE", 0, 0, (FieldType$Collection)enum_, (JavaType)enum_2);
        Enum enum_4 = JavaType.FLOAT;
        fieldTypeArray = fieldType40;
        fieldTypeArray2 = enum_4;
        FLOAT = fieldType40 = new FieldType("FLOAT", 1, 1, (FieldType$Collection)enum_, (JavaType)enum_4);
        Enum enum_5 = JavaType.LONG;
        fieldTypeArray = fieldType39;
        fieldTypeArray2 = enum_5;
        INT64 = fieldType39 = new FieldType("INT64", 2, 2, (FieldType$Collection)enum_, (JavaType)enum_5);
        fieldTypeArray = fieldType38;
        UINT64 = fieldType38 = new FieldType("UINT64", 3, 3, (FieldType$Collection)enum_, (JavaType)enum_5);
        Enum enum_6 = JavaType.INT;
        fieldTypeArray = fieldType37;
        fieldTypeArray2 = enum_6;
        INT32 = fieldType37 = new FieldType("INT32", 4, 4, (FieldType$Collection)enum_, (JavaType)enum_6);
        fieldTypeArray = fieldType36;
        fieldTypeArray2 = enum_5;
        FIXED64 = fieldType36 = new FieldType("FIXED64", 5, 5, (FieldType$Collection)enum_, (JavaType)enum_5);
        fieldTypeArray = fieldType35;
        fieldTypeArray2 = enum_6;
        FIXED32 = fieldType35 = new FieldType("FIXED32", 6, 6, (FieldType$Collection)enum_, (JavaType)enum_6);
        Enum enum_7 = JavaType.BOOLEAN;
        fieldTypeArray = fieldType34;
        fieldTypeArray2 = enum_7;
        BOOL = fieldType34 = new FieldType("BOOL", 7, 7, (FieldType$Collection)enum_, (JavaType)enum_7);
        Enum enum_8 = JavaType.STRING;
        fieldTypeArray = fieldType33;
        fieldTypeArray2 = enum_8;
        STRING = fieldType33 = new FieldType("STRING", 8, 8, (FieldType$Collection)enum_, (JavaType)enum_8);
        JavaType javaType = JavaType.MESSAGE;
        fieldTypeArray = fieldType32;
        fieldTypeArray2 = javaType;
        MESSAGE = fieldType32 = new FieldType("MESSAGE", 9, 9, (FieldType$Collection)enum_, javaType);
        Enum enum_9 = JavaType.BYTE_STRING;
        fieldTypeArray = fieldType31;
        fieldTypeArray2 = enum_9;
        BYTES = fieldType31 = new FieldType("BYTES", 10, 10, (FieldType$Collection)enum_, (JavaType)enum_9);
        fieldTypeArray = fieldType30;
        fieldTypeArray2 = enum_6;
        UINT32 = fieldType30 = new FieldType("UINT32", 11, 11, (FieldType$Collection)enum_, (JavaType)enum_6);
        Enum enum_10 = JavaType.ENUM;
        fieldTypeArray = fieldType29;
        fieldTypeArray2 = enum_10;
        ENUM = fieldType29 = new FieldType("ENUM", 12, 12, (FieldType$Collection)enum_, (JavaType)enum_10);
        fieldTypeArray = fieldType28;
        fieldTypeArray2 = enum_6;
        SFIXED32 = fieldType28 = new FieldType("SFIXED32", 13, 13, (FieldType$Collection)enum_, (JavaType)enum_6);
        fieldTypeArray = fieldType27;
        fieldTypeArray2 = enum_5;
        SFIXED64 = fieldType27 = new FieldType("SFIXED64", 14, 14, (FieldType$Collection)enum_, (JavaType)enum_5);
        fieldTypeArray = fieldType26;
        fieldTypeArray2 = enum_6;
        SINT32 = fieldType26 = new FieldType("SINT32", 15, 15, (FieldType$Collection)enum_, (JavaType)enum_6);
        fieldTypeArray = fieldType25;
        fieldTypeArray2 = enum_5;
        SINT64 = fieldType25 = new FieldType("SINT64", 16, 16, (FieldType$Collection)enum_, (JavaType)enum_5);
        fieldTypeArray = fieldType24;
        fieldTypeArray2 = javaType;
        GROUP = fieldType24 = new FieldType("GROUP", 17, 17, (FieldType$Collection)enum_, javaType);
        FieldType$Collection fieldType$Collection = FieldType$Collection.VECTOR;
        fieldTypeArray = enum_;
        enum_3 = fieldType$Collection;
        fieldTypeArray2 = enum_2;
        DOUBLE_LIST = enum_ = new FieldType("DOUBLE_LIST", 18, 18, fieldType$Collection, (JavaType)enum_2);
        fieldTypeArray = fieldType23;
        fieldTypeArray2 = enum_4;
        FLOAT_LIST = fieldType23 = new FieldType("FLOAT_LIST", 19, 19, fieldType$Collection, (JavaType)enum_4);
        fieldTypeArray = fieldType22;
        fieldTypeArray2 = enum_5;
        INT64_LIST = fieldType22 = new FieldType("INT64_LIST", 20, 20, fieldType$Collection, (JavaType)enum_5);
        fieldTypeArray = fieldType21;
        UINT64_LIST = fieldType21 = new FieldType("UINT64_LIST", 21, 21, fieldType$Collection, (JavaType)enum_5);
        fieldTypeArray = fieldType20;
        fieldTypeArray2 = enum_6;
        INT32_LIST = fieldType20 = new FieldType("INT32_LIST", 22, 22, fieldType$Collection, (JavaType)enum_6);
        fieldTypeArray = fieldType19;
        fieldTypeArray2 = enum_5;
        FIXED64_LIST = fieldType19 = new FieldType("FIXED64_LIST", 23, 23, fieldType$Collection, (JavaType)enum_5);
        fieldTypeArray = fieldType18;
        fieldTypeArray2 = enum_6;
        FIXED32_LIST = fieldType18 = new FieldType("FIXED32_LIST", 24, 24, fieldType$Collection, (JavaType)enum_6);
        fieldTypeArray = fieldType17;
        fieldTypeArray2 = enum_7;
        BOOL_LIST = fieldType17 = new FieldType("BOOL_LIST", 25, 25, fieldType$Collection, (JavaType)enum_7);
        fieldTypeArray = fieldType16;
        fieldTypeArray2 = enum_8;
        STRING_LIST = fieldType16 = new FieldType("STRING_LIST", 26, 26, fieldType$Collection, (JavaType)enum_8);
        fieldTypeArray = enum_8;
        fieldTypeArray2 = javaType;
        MESSAGE_LIST = enum_8 = new FieldType("MESSAGE_LIST", 27, 27, fieldType$Collection, javaType);
        fieldTypeArray = fieldType15;
        fieldTypeArray2 = enum_9;
        BYTES_LIST = fieldType15 = new FieldType("BYTES_LIST", 28, 28, fieldType$Collection, (JavaType)enum_9);
        fieldTypeArray = enum_9;
        fieldTypeArray2 = enum_6;
        UINT32_LIST = enum_9 = new FieldType("UINT32_LIST", 29, 29, fieldType$Collection, (JavaType)enum_6);
        fieldTypeArray = fieldType14;
        fieldTypeArray2 = enum_10;
        ENUM_LIST = fieldType14 = new FieldType("ENUM_LIST", 30, 30, fieldType$Collection, (JavaType)enum_10);
        fieldTypeArray = fieldType13;
        fieldTypeArray2 = enum_6;
        SFIXED32_LIST = fieldType13 = new FieldType("SFIXED32_LIST", 31, 31, fieldType$Collection, (JavaType)enum_6);
        fieldTypeArray = fieldType12;
        fieldTypeArray2 = enum_5;
        SFIXED64_LIST = fieldType12 = new FieldType("SFIXED64_LIST", 32, 32, fieldType$Collection, (JavaType)enum_5);
        fieldTypeArray = fieldType11;
        fieldTypeArray2 = enum_6;
        SINT32_LIST = fieldType11 = new FieldType("SINT32_LIST", 33, 33, fieldType$Collection, (JavaType)enum_6);
        fieldTypeArray = fieldType10;
        fieldTypeArray2 = enum_5;
        SINT64_LIST = fieldType10 = new FieldType("SINT64_LIST", 34, 34, fieldType$Collection, (JavaType)enum_5);
        FieldType$Collection fieldType$Collection2 = FieldType$Collection.PACKED_VECTOR;
        fieldTypeArray = fieldType9;
        enum_3 = fieldType$Collection2;
        fieldTypeArray2 = enum_2;
        DOUBLE_LIST_PACKED = fieldType9 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, fieldType$Collection2, (JavaType)enum_2);
        fieldTypeArray = enum_2;
        fieldTypeArray2 = enum_4;
        FLOAT_LIST_PACKED = enum_2 = new FieldType("FLOAT_LIST_PACKED", 36, 36, fieldType$Collection2, (JavaType)enum_4);
        fieldTypeArray = enum_4;
        fieldTypeArray2 = enum_5;
        INT64_LIST_PACKED = enum_4 = new FieldType("INT64_LIST_PACKED", 37, 37, fieldType$Collection2, (JavaType)enum_5);
        fieldTypeArray = fieldType8;
        UINT64_LIST_PACKED = fieldType8 = new FieldType("UINT64_LIST_PACKED", 38, 38, fieldType$Collection2, (JavaType)enum_5);
        fieldTypeArray = fieldType7;
        fieldTypeArray2 = enum_6;
        INT32_LIST_PACKED = fieldType7 = new FieldType("INT32_LIST_PACKED", 39, 39, fieldType$Collection2, (JavaType)enum_6);
        fieldTypeArray = fieldType6;
        fieldTypeArray2 = enum_5;
        FIXED64_LIST_PACKED = fieldType6 = new FieldType("FIXED64_LIST_PACKED", 40, 40, fieldType$Collection2, (JavaType)enum_5);
        fieldTypeArray = fieldType5;
        fieldTypeArray2 = enum_6;
        FIXED32_LIST_PACKED = fieldType5 = new FieldType("FIXED32_LIST_PACKED", 41, 41, fieldType$Collection2, (JavaType)enum_6);
        fieldTypeArray = fieldType4;
        fieldTypeArray2 = enum_7;
        BOOL_LIST_PACKED = fieldType4 = new FieldType("BOOL_LIST_PACKED", 42, 42, fieldType$Collection2, (JavaType)enum_7);
        fieldTypeArray = enum_7;
        fieldTypeArray2 = enum_6;
        UINT32_LIST_PACKED = enum_7 = new FieldType("UINT32_LIST_PACKED", 43, 43, fieldType$Collection2, (JavaType)enum_6);
        fieldTypeArray = fieldType3;
        fieldTypeArray2 = enum_10;
        ENUM_LIST_PACKED = fieldType3 = new FieldType("ENUM_LIST_PACKED", 44, 44, fieldType$Collection2, (JavaType)enum_10);
        fieldTypeArray = enum_10;
        fieldTypeArray2 = enum_6;
        SFIXED32_LIST_PACKED = enum_10 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, fieldType$Collection2, (JavaType)enum_6);
        fieldTypeArray = fieldType2;
        fieldTypeArray2 = enum_5;
        SFIXED64_LIST_PACKED = fieldType2 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, fieldType$Collection2, (JavaType)enum_5);
        fieldTypeArray = fieldType;
        fieldTypeArray2 = enum_6;
        SINT32_LIST_PACKED = fieldType = new FieldType("SINT32_LIST_PACKED", 47, 47, fieldType$Collection2, (JavaType)enum_6);
        fieldTypeArray = enum_6;
        fieldTypeArray2 = enum_5;
        SINT64_LIST_PACKED = enum_6 = new FieldType("SINT64_LIST_PACKED", 48, 48, fieldType$Collection2, (JavaType)enum_5);
        fieldTypeArray = enum_5;
        enum_3 = fieldType$Collection;
        fieldTypeArray2 = javaType;
        GROUP_LIST = enum_5 = new FieldType("GROUP_LIST", 49, 49, fieldType$Collection, javaType);
        FieldType$Collection fieldType$Collection3 = FieldType$Collection.MAP;
        JavaType javaType2 = JavaType.VOID;
        String string2 = "MAP";
        int n3 = 50;
        int n4 = 50;
        fieldTypeArray = new FieldType(string2, n3, n4, fieldType$Collection3, javaType2);
        MAP = fieldTypeArray;
        FieldType[] fieldTypeArray3 = new FieldType[51];
        fieldTypeArray3[0] = fieldType41;
        int n7 = 1;
        fieldTypeArray3[n7] = fieldType40;
        fieldTypeArray3[2] = fieldType39;
        fieldTypeArray3[3] = fieldType38;
        fieldTypeArray3[4] = fieldType37;
        fieldTypeArray3[5] = fieldType36;
        fieldTypeArray3[6] = fieldType35;
        fieldTypeArray3[7] = fieldType34;
        fieldTypeArray3[8] = fieldType33;
        fieldTypeArray3[9] = fieldType32;
        fieldTypeArray3[10] = fieldType31;
        fieldTypeArray3[11] = fieldType30;
        fieldTypeArray3[12] = fieldType29;
        fieldTypeArray3[13] = fieldType28;
        fieldTypeArray3[14] = fieldType27;
        fieldTypeArray3[15] = fieldType26;
        fieldTypeArray3[16] = fieldType25;
        fieldTypeArray3[17] = fieldType24;
        fieldTypeArray3[18] = enum_;
        fieldTypeArray3[19] = fieldType23;
        fieldTypeArray3[20] = fieldType22;
        fieldTypeArray3[21] = fieldType21;
        fieldTypeArray3[22] = fieldType20;
        fieldTypeArray3[23] = fieldType19;
        fieldTypeArray3[24] = fieldType18;
        fieldTypeArray3[25] = fieldType17;
        fieldTypeArray3[26] = fieldType16;
        fieldTypeArray3[27] = enum_8;
        fieldTypeArray3[28] = fieldType15;
        fieldTypeArray3[29] = enum_9;
        fieldTypeArray3[30] = fieldType14;
        fieldTypeArray3[31] = fieldType13;
        fieldTypeArray3[32] = fieldType12;
        fieldTypeArray3[33] = fieldType11;
        fieldTypeArray3[34] = fieldType10;
        fieldTypeArray3[35] = fieldType9;
        fieldTypeArray3[36] = enum_2;
        fieldTypeArray3[37] = enum_4;
        fieldTypeArray3[38] = fieldType8;
        fieldTypeArray3[39] = fieldType7;
        fieldTypeArray3[40] = fieldType6;
        fieldTypeArray3[41] = fieldType5;
        fieldTypeArray3[42] = fieldType4;
        fieldTypeArray3[43] = enum_7;
        fieldTypeArray3[44] = fieldType3;
        fieldTypeArray3[45] = enum_10;
        fieldTypeArray3[46] = fieldType2;
        fieldTypeArray3[47] = fieldType;
        fieldTypeArray3[48] = enum_6;
        fieldTypeArray3[49] = enum_5;
        int n8 = 50;
        fieldTypeArray3[n8] = fieldTypeArray;
        $VALUES = fieldTypeArray3;
        EMPTY_TYPES = new Type[0];
        fieldTypeArray = FieldType.values();
        fieldTypeArray3 = new FieldType[fieldTypeArray.length];
        VALUES = fieldTypeArray3;
        int n10 = fieldTypeArray.length;
        for (int i3 = 0; i3 < n10; i3 += n7) {
            enum_3 = fieldTypeArray[i3];
            fieldTypeArray2 = VALUES;
            int n14 = ((FieldType)enum_3).id;
            fieldTypeArray2[n14] = enum_3;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FieldType(JavaType javaType) {
        int n4;
        void var5_4;
        void var4_3;
        void var2_-1;
        void var1_-1;
        this.id = (int)javaType;
        this.collection = var4_3;
        this.javaType = var5_4;
        Object object = FieldType$1.$SwitchMap$com$google$protobuf$FieldType$Collection;
        int n7 = var4_3.ordinal();
        int n8 = object[n7];
        n7 = 2;
        int n10 = 1;
        if (n8 != n10) {
            if (n8 != n7) {
                n8 = 0;
                object = null;
                this.elementType = null;
            } else {
                object = var5_4.getBoxedType();
                this.elementType = object;
            }
        } else {
            object = var5_4.getBoxedType();
            this.elementType = object;
        }
        object = (Object)FieldType$Collection.SCALAR;
        if (var4_3 != object || (n8 = (object = FieldType$1.$SwitchMap$com$google$protobuf$JavaType)[n4 = var5_4.ordinal()]) == n10 || n8 == n7 || n8 == (n7 = 3)) {
            n10 = 0;
        }
        this.primitiveScalar = n10;
    }

    public static FieldType forId(int n3) {
        FieldType[] fieldTypeArray;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (fieldTypeArray = VALUES).length)) {
            return fieldTypeArray[n3];
        }
        return null;
    }

    private static Type getGenericSuperList(Class type2) {
        Class<List> clazz;
        Object object = type2.getGenericInterfaces();
        int n3 = ((Type[])object).length;
        int n4 = 0;
        while (true) {
            clazz = List.class;
            if (n4 >= n3) break;
            Type type3 = object[n4];
            boolean bl2 = type3 instanceof ParameterizedType;
            if (bl2) {
                Type type4 = type3;
                type4 = (Class)((ParameterizedType)type3).getRawType();
                boolean bl3 = clazz.isAssignableFrom((Class<?>)type4);
                if (bl3) {
                    return type3;
                }
            }
            ++n4;
        }
        boolean bl4 = (type2 = type2.getGenericSuperclass()) instanceof ParameterizedType;
        if (bl4) {
            object = type2;
            object = (Class)((ParameterizedType)type2).getRawType();
            bl4 = clazz.isAssignableFrom((Class<?>)object);
            if (bl4) {
                return type2;
            }
        }
        return null;
    }

    private static Type getListParameter(Class serializable, Type[] object) {
        block0: while (true) {
            boolean bl2;
            Type[] typeArray = List.class;
            if (serializable == typeArray) break;
            Class<?>[] classArray = FieldType.getGenericSuperList((Class)serializable);
            int n3 = classArray instanceof ParameterizedType;
            if (n3 != 0) {
                int n4;
                classArray = (ParameterizedType)classArray;
                typeArray = classArray.getActualTypeArguments();
                block1: for (n3 = 0; n3 < (n4 = typeArray.length); ++n3) {
                    Type type2 = typeArray[n3];
                    bl2 = type2 instanceof TypeVariable;
                    if (!bl2) continue;
                    int n7 = ((Type[])object).length;
                    TypeVariable<Class<T>>[] typeVariableArray = ((Class)serializable).getTypeParameters();
                    int n8 = typeVariableArray.length;
                    if (n7 == n8) {
                        for (n7 = 0; n7 < (n8 = typeVariableArray.length); ++n7) {
                            TypeVariable typeVariable = typeVariableArray[n7];
                            if (type2 != typeVariable) continue;
                            typeArray[n3] = type2 = object[n7];
                            continue block1;
                        }
                        object = new StringBuilder("Unable to find replacement for ");
                        ((StringBuilder)object).append(type2);
                        object = ((StringBuilder)object).toString();
                        serializable = new RuntimeException((String)object);
                        throw serializable;
                    }
                    serializable = new RuntimeException("Type array mismatch");
                    throw serializable;
                }
                serializable = (Class)classArray.getRawType();
                object = typeArray;
                continue;
            }
            object = EMPTY_TYPES;
            for (Type type2 : ((Class)serializable).getInterfaces()) {
                bl2 = typeArray.isAssignableFrom((Class<?>)type2);
                if (!bl2) continue;
                serializable = type2;
                continue block0;
            }
            serializable = ((Class)serializable).getSuperclass();
        }
        int n10 = ((Type[])object).length;
        int n14 = 1;
        if (n10 == n14) {
            return object[0];
        }
        serializable = new RuntimeException("Unable to identify parameter type for List<T>");
        throw serializable;
    }

    private boolean isValidForList(Field object) {
        boolean bl2;
        Class clazz = ((Field)object).getType();
        Type[] typeArray = this.javaType.getType();
        boolean bl3 = typeArray.isAssignableFrom(clazz);
        if (!bl3) {
            return false;
        }
        typeArray = EMPTY_TYPES;
        Type type2 = ((Field)object).getGenericType();
        boolean bl4 = type2 instanceof ParameterizedType;
        if (bl4) {
            object = (ParameterizedType)((Field)object).getGenericType();
            typeArray = object.getActualTypeArguments();
        }
        if (!(bl2 = (object = FieldType.getListParameter(clazz, typeArray)) instanceof Class)) {
            return true;
        }
        clazz = this.elementType;
        object = (Class)object;
        return clazz.isAssignableFrom((Class<?>)object);
    }

    public static FieldType valueOf(String string2) {
        return Enum.valueOf(FieldType.class, string2);
    }

    public static FieldType[] values() {
        return (FieldType[])$VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        boolean bl2;
        FieldType$Collection fieldType$Collection = this.collection;
        FieldType$Collection fieldType$Collection2 = FieldType$Collection.MAP;
        if (fieldType$Collection == fieldType$Collection2) {
            bl2 = true;
        } else {
            bl2 = false;
            fieldType$Collection = null;
        }
        return bl2;
    }

    public boolean isPacked() {
        FieldType$Collection fieldType$Collection = FieldType$Collection.PACKED_VECTOR;
        FieldType$Collection fieldType$Collection2 = this.collection;
        return ((Object)((Object)fieldType$Collection)).equals((Object)fieldType$Collection2);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        boolean bl2;
        FieldType$Collection fieldType$Collection = this.collection;
        FieldType$Collection fieldType$Collection2 = FieldType$Collection.SCALAR;
        if (fieldType$Collection == fieldType$Collection2) {
            bl2 = true;
        } else {
            bl2 = false;
            fieldType$Collection = null;
        }
        return bl2;
    }

    public boolean isValidForField(Field annotatedElement) {
        Object object = FieldType$Collection.VECTOR;
        FieldType$Collection fieldType$Collection = this.collection;
        boolean bl2 = ((Object)object).equals((Object)fieldType$Collection);
        if (bl2) {
            return this.isValidForList((Field)annotatedElement);
        }
        object = this.javaType.getType();
        annotatedElement = annotatedElement.getType();
        return ((Class)object).isAssignableFrom((Class<?>)annotatedElement);
    }
}

