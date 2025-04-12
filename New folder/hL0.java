/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public final class hL0
extends Enum {
    private static final /* synthetic */ hL0[] $VALUES;
    public static final /* enum */ hL0 BOOL;
    public static final /* enum */ hL0 BOOL_LIST;
    public static final /* enum */ hL0 BOOL_LIST_PACKED;
    public static final /* enum */ hL0 BYTES;
    public static final /* enum */ hL0 BYTES_LIST;
    public static final /* enum */ hL0 DOUBLE;
    public static final /* enum */ hL0 DOUBLE_LIST;
    public static final /* enum */ hL0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final /* enum */ hL0 ENUM;
    public static final /* enum */ hL0 ENUM_LIST;
    public static final /* enum */ hL0 ENUM_LIST_PACKED;
    public static final /* enum */ hL0 FIXED32;
    public static final /* enum */ hL0 FIXED32_LIST;
    public static final /* enum */ hL0 FIXED32_LIST_PACKED;
    public static final /* enum */ hL0 FIXED64;
    public static final /* enum */ hL0 FIXED64_LIST;
    public static final /* enum */ hL0 FIXED64_LIST_PACKED;
    public static final /* enum */ hL0 FLOAT;
    public static final /* enum */ hL0 FLOAT_LIST;
    public static final /* enum */ hL0 FLOAT_LIST_PACKED;
    public static final /* enum */ hL0 GROUP;
    public static final /* enum */ hL0 GROUP_LIST;
    public static final /* enum */ hL0 INT32;
    public static final /* enum */ hL0 INT32_LIST;
    public static final /* enum */ hL0 INT32_LIST_PACKED;
    public static final /* enum */ hL0 INT64;
    public static final /* enum */ hL0 INT64_LIST;
    public static final /* enum */ hL0 INT64_LIST_PACKED;
    public static final /* enum */ hL0 MAP;
    public static final /* enum */ hL0 MESSAGE;
    public static final /* enum */ hL0 MESSAGE_LIST;
    public static final /* enum */ hL0 SFIXED32;
    public static final /* enum */ hL0 SFIXED32_LIST;
    public static final /* enum */ hL0 SFIXED32_LIST_PACKED;
    public static final /* enum */ hL0 SFIXED64;
    public static final /* enum */ hL0 SFIXED64_LIST;
    public static final /* enum */ hL0 SFIXED64_LIST_PACKED;
    public static final /* enum */ hL0 SINT32;
    public static final /* enum */ hL0 SINT32_LIST;
    public static final /* enum */ hL0 SINT32_LIST_PACKED;
    public static final /* enum */ hL0 SINT64;
    public static final /* enum */ hL0 SINT64_LIST;
    public static final /* enum */ hL0 SINT64_LIST_PACKED;
    public static final /* enum */ hL0 STRING;
    public static final /* enum */ hL0 STRING_LIST;
    public static final /* enum */ hL0 UINT32;
    public static final /* enum */ hL0 UINT32_LIST;
    public static final /* enum */ hL0 UINT32_LIST_PACKED;
    public static final /* enum */ hL0 UINT64;
    public static final /* enum */ hL0 UINT64_LIST;
    public static final /* enum */ hL0 UINT64_LIST_PACKED;
    private static final hL0[] VALUES;
    private final hL0$b collection;
    private final Class elementType;
    private final int id;
    private final Tk1 javaType;
    private final boolean primitiveScalar;

    static {
        hL0 hL02;
        hL0 hL03;
        hL0 hL04;
        hL0 hL05;
        hL0 hL06;
        hL0 hL07;
        hL0 hL08;
        hL0 hL09;
        hL0 hL010;
        hL0 hL011;
        hL0 hL012;
        hL0 hL013;
        hL0 hL014;
        hL0 hL015;
        hL0 hL016;
        hL0 hL017;
        hL0 hL018;
        hL0 hL019;
        hL0 hL020;
        hL0 hL021;
        hL0 hL022;
        hL0 hL023;
        hL0 hL024;
        hL0 hL025;
        hL0 hL026;
        hL0 hL027;
        hL0 hL028;
        hL0 hL029;
        hL0 hL030;
        hL0 hL031;
        hL0 hL032;
        hL0 hL033;
        hL0 hL034;
        hL0 hL035;
        hL0 hL036;
        hL0 hL037;
        hL0 hL038;
        hL0 hL039;
        hL0 hL040;
        hL0 hL041;
        hL0 hL042;
        Enum enum_ = hL0$b.SCALAR;
        Enum enum_2 = Tk1.DOUBLE;
        hL0[] hL0Array = hL042;
        Enum enum_3 = enum_;
        hL0[] hL0Array2 = enum_2;
        DOUBLE = hL042 = new hL0("DOUBLE", 0, 0, (hL0$b)enum_, (Tk1)enum_2);
        Enum enum_4 = Tk1.FLOAT;
        hL0Array = hL041;
        hL0Array2 = enum_4;
        FLOAT = hL041 = new hL0("FLOAT", 1, 1, (hL0$b)enum_, (Tk1)enum_4);
        Enum enum_5 = Tk1.LONG;
        hL0Array = hL040;
        hL0Array2 = enum_5;
        INT64 = hL040 = new hL0("INT64", 2, 2, (hL0$b)enum_, (Tk1)enum_5);
        hL0Array = hL039;
        UINT64 = hL039 = new hL0("UINT64", 3, 3, (hL0$b)enum_, (Tk1)enum_5);
        Enum enum_6 = Tk1.INT;
        hL0Array = hL038;
        hL0Array2 = enum_6;
        INT32 = hL038 = new hL0("INT32", 4, 4, (hL0$b)enum_, (Tk1)enum_6);
        hL0Array = hL037;
        hL0Array2 = enum_5;
        FIXED64 = hL037 = new hL0("FIXED64", 5, 5, (hL0$b)enum_, (Tk1)enum_5);
        hL0Array = hL036;
        hL0Array2 = enum_6;
        FIXED32 = hL036 = new hL0("FIXED32", 6, 6, (hL0$b)enum_, (Tk1)enum_6);
        Enum enum_7 = Tk1.BOOLEAN;
        hL0Array = hL035;
        hL0Array2 = enum_7;
        BOOL = hL035 = new hL0("BOOL", 7, 7, (hL0$b)enum_, (Tk1)enum_7);
        Enum enum_8 = Tk1.STRING;
        hL0Array = hL034;
        hL0Array2 = enum_8;
        STRING = hL034 = new hL0("STRING", 8, 8, (hL0$b)enum_, (Tk1)enum_8);
        Tk1 tk1 = Tk1.MESSAGE;
        hL0Array = hL033;
        hL0Array2 = tk1;
        MESSAGE = hL033 = new hL0("MESSAGE", 9, 9, (hL0$b)enum_, tk1);
        Enum enum_9 = Tk1.BYTE_STRING;
        hL0Array = hL032;
        hL0Array2 = enum_9;
        BYTES = hL032 = new hL0("BYTES", 10, 10, (hL0$b)enum_, (Tk1)enum_9);
        hL0Array = hL031;
        hL0Array2 = enum_6;
        UINT32 = hL031 = new hL0("UINT32", 11, 11, (hL0$b)enum_, (Tk1)enum_6);
        Enum enum_10 = Tk1.ENUM;
        hL0Array = hL030;
        hL0Array2 = enum_10;
        ENUM = hL030 = new hL0("ENUM", 12, 12, (hL0$b)enum_, (Tk1)enum_10);
        hL0Array = hL029;
        hL0Array2 = enum_6;
        SFIXED32 = hL029 = new hL0("SFIXED32", 13, 13, (hL0$b)enum_, (Tk1)enum_6);
        hL0Array = hL028;
        hL0Array2 = enum_5;
        SFIXED64 = hL028 = new hL0("SFIXED64", 14, 14, (hL0$b)enum_, (Tk1)enum_5);
        hL0Array = hL027;
        hL0Array2 = enum_6;
        SINT32 = hL027 = new hL0("SINT32", 15, 15, (hL0$b)enum_, (Tk1)enum_6);
        hL0Array = hL026;
        hL0Array2 = enum_5;
        SINT64 = hL026 = new hL0("SINT64", 16, 16, (hL0$b)enum_, (Tk1)enum_5);
        hL0Array = hL025;
        hL0Array2 = tk1;
        GROUP = hL025 = new hL0("GROUP", 17, 17, (hL0$b)enum_, tk1);
        hL0$b hL0$b = hL0$b.VECTOR;
        hL0Array = enum_;
        enum_3 = hL0$b;
        hL0Array2 = enum_2;
        DOUBLE_LIST = enum_ = new hL0("DOUBLE_LIST", 18, 18, hL0$b, (Tk1)enum_2);
        hL0Array = hL024;
        hL0Array2 = enum_4;
        FLOAT_LIST = hL024 = new hL0("FLOAT_LIST", 19, 19, hL0$b, (Tk1)enum_4);
        hL0Array = hL023;
        hL0Array2 = enum_5;
        INT64_LIST = hL023 = new hL0("INT64_LIST", 20, 20, hL0$b, (Tk1)enum_5);
        hL0Array = hL022;
        UINT64_LIST = hL022 = new hL0("UINT64_LIST", 21, 21, hL0$b, (Tk1)enum_5);
        hL0Array = hL021;
        hL0Array2 = enum_6;
        INT32_LIST = hL021 = new hL0("INT32_LIST", 22, 22, hL0$b, (Tk1)enum_6);
        hL0Array = hL020;
        hL0Array2 = enum_5;
        FIXED64_LIST = hL020 = new hL0("FIXED64_LIST", 23, 23, hL0$b, (Tk1)enum_5);
        hL0Array = hL019;
        hL0Array2 = enum_6;
        FIXED32_LIST = hL019 = new hL0("FIXED32_LIST", 24, 24, hL0$b, (Tk1)enum_6);
        hL0Array = hL018;
        hL0Array2 = enum_7;
        BOOL_LIST = hL018 = new hL0("BOOL_LIST", 25, 25, hL0$b, (Tk1)enum_7);
        hL0Array = hL017;
        hL0Array2 = enum_8;
        STRING_LIST = hL017 = new hL0("STRING_LIST", 26, 26, hL0$b, (Tk1)enum_8);
        hL0Array = enum_8;
        hL0Array2 = tk1;
        MESSAGE_LIST = enum_8 = new hL0("MESSAGE_LIST", 27, 27, hL0$b, tk1);
        hL0Array = hL016;
        hL0Array2 = enum_9;
        BYTES_LIST = hL016 = new hL0("BYTES_LIST", 28, 28, hL0$b, (Tk1)enum_9);
        hL0Array = enum_9;
        hL0Array2 = enum_6;
        UINT32_LIST = enum_9 = new hL0("UINT32_LIST", 29, 29, hL0$b, (Tk1)enum_6);
        hL0Array = hL015;
        hL0Array2 = enum_10;
        ENUM_LIST = hL015 = new hL0("ENUM_LIST", 30, 30, hL0$b, (Tk1)enum_10);
        hL0Array = hL014;
        hL0Array2 = enum_6;
        SFIXED32_LIST = hL014 = new hL0("SFIXED32_LIST", 31, 31, hL0$b, (Tk1)enum_6);
        hL0Array = hL013;
        hL0Array2 = enum_5;
        SFIXED64_LIST = hL013 = new hL0("SFIXED64_LIST", 32, 32, hL0$b, (Tk1)enum_5);
        hL0Array = hL012;
        hL0Array2 = enum_6;
        SINT32_LIST = hL012 = new hL0("SINT32_LIST", 33, 33, hL0$b, (Tk1)enum_6);
        hL0Array = hL011;
        hL0Array2 = enum_5;
        SINT64_LIST = hL011 = new hL0("SINT64_LIST", 34, 34, hL0$b, (Tk1)enum_5);
        hL0$b hL0$b2 = hL0$b.PACKED_VECTOR;
        hL0Array = hL010;
        enum_3 = hL0$b2;
        hL0Array2 = enum_2;
        DOUBLE_LIST_PACKED = hL010 = new hL0("DOUBLE_LIST_PACKED", 35, 35, hL0$b2, (Tk1)enum_2);
        hL0Array = enum_2;
        hL0Array2 = enum_4;
        FLOAT_LIST_PACKED = enum_2 = new hL0("FLOAT_LIST_PACKED", 36, 36, hL0$b2, (Tk1)enum_4);
        hL0Array = enum_4;
        hL0Array2 = enum_5;
        INT64_LIST_PACKED = enum_4 = new hL0("INT64_LIST_PACKED", 37, 37, hL0$b2, (Tk1)enum_5);
        hL0Array = hL09;
        UINT64_LIST_PACKED = hL09 = new hL0("UINT64_LIST_PACKED", 38, 38, hL0$b2, (Tk1)enum_5);
        hL0Array = hL08;
        hL0Array2 = enum_6;
        INT32_LIST_PACKED = hL08 = new hL0("INT32_LIST_PACKED", 39, 39, hL0$b2, (Tk1)enum_6);
        hL0Array = hL07;
        hL0Array2 = enum_5;
        FIXED64_LIST_PACKED = hL07 = new hL0("FIXED64_LIST_PACKED", 40, 40, hL0$b2, (Tk1)enum_5);
        hL0Array = hL06;
        hL0Array2 = enum_6;
        FIXED32_LIST_PACKED = hL06 = new hL0("FIXED32_LIST_PACKED", 41, 41, hL0$b2, (Tk1)enum_6);
        hL0Array = hL05;
        hL0Array2 = enum_7;
        BOOL_LIST_PACKED = hL05 = new hL0("BOOL_LIST_PACKED", 42, 42, hL0$b2, (Tk1)enum_7);
        hL0Array = enum_7;
        hL0Array2 = enum_6;
        UINT32_LIST_PACKED = enum_7 = new hL0("UINT32_LIST_PACKED", 43, 43, hL0$b2, (Tk1)enum_6);
        hL0Array = hL04;
        hL0Array2 = enum_10;
        ENUM_LIST_PACKED = hL04 = new hL0("ENUM_LIST_PACKED", 44, 44, hL0$b2, (Tk1)enum_10);
        hL0Array = enum_10;
        hL0Array2 = enum_6;
        SFIXED32_LIST_PACKED = enum_10 = new hL0("SFIXED32_LIST_PACKED", 45, 45, hL0$b2, (Tk1)enum_6);
        hL0Array = hL03;
        hL0Array2 = enum_5;
        SFIXED64_LIST_PACKED = hL03 = new hL0("SFIXED64_LIST_PACKED", 46, 46, hL0$b2, (Tk1)enum_5);
        hL0Array = hL02;
        hL0Array2 = enum_6;
        SINT32_LIST_PACKED = hL02 = new hL0("SINT32_LIST_PACKED", 47, 47, hL0$b2, (Tk1)enum_6);
        hL0Array = enum_6;
        hL0Array2 = enum_5;
        SINT64_LIST_PACKED = enum_6 = new hL0("SINT64_LIST_PACKED", 48, 48, hL0$b2, (Tk1)enum_5);
        hL0Array = enum_5;
        enum_3 = hL0$b;
        hL0Array2 = tk1;
        GROUP_LIST = enum_5 = new hL0("GROUP_LIST", 49, 49, hL0$b, tk1);
        hL0$b hL0$b3 = hL0$b.MAP;
        Tk1 tk12 = Tk1.VOID;
        String string2 = "MAP";
        int n3 = 50;
        int n4 = 50;
        hL0Array = new hL0(string2, n3, n4, hL0$b3, tk12);
        MAP = hL0Array;
        hL0[] hL0Array3 = new hL0[51];
        hL0Array3[0] = hL042;
        int n7 = 1;
        hL0Array3[n7] = hL041;
        hL0Array3[2] = hL040;
        hL0Array3[3] = hL039;
        hL0Array3[4] = hL038;
        hL0Array3[5] = hL037;
        hL0Array3[6] = hL036;
        hL0Array3[7] = hL035;
        hL0Array3[8] = hL034;
        hL0Array3[9] = hL033;
        hL0Array3[10] = hL032;
        hL0Array3[11] = hL031;
        hL0Array3[12] = hL030;
        hL0Array3[13] = hL029;
        hL0Array3[14] = hL028;
        hL0Array3[15] = hL027;
        hL0Array3[16] = hL026;
        hL0Array3[17] = hL025;
        hL0Array3[18] = enum_;
        hL0Array3[19] = hL024;
        hL0Array3[20] = hL023;
        hL0Array3[21] = hL022;
        hL0Array3[22] = hL021;
        hL0Array3[23] = hL020;
        hL0Array3[24] = hL019;
        hL0Array3[25] = hL018;
        hL0Array3[26] = hL017;
        hL0Array3[27] = enum_8;
        hL0Array3[28] = hL016;
        hL0Array3[29] = enum_9;
        hL0Array3[30] = hL015;
        hL0Array3[31] = hL014;
        hL0Array3[32] = hL013;
        hL0Array3[33] = hL012;
        hL0Array3[34] = hL011;
        hL0Array3[35] = hL010;
        hL0Array3[36] = enum_2;
        hL0Array3[37] = enum_4;
        hL0Array3[38] = hL09;
        hL0Array3[39] = hL08;
        hL0Array3[40] = hL07;
        hL0Array3[41] = hL06;
        hL0Array3[42] = hL05;
        hL0Array3[43] = enum_7;
        hL0Array3[44] = hL04;
        hL0Array3[45] = enum_10;
        hL0Array3[46] = hL03;
        hL0Array3[47] = hL02;
        hL0Array3[48] = enum_6;
        hL0Array3[49] = enum_5;
        int n8 = 50;
        hL0Array3[n8] = hL0Array;
        $VALUES = hL0Array3;
        EMPTY_TYPES = new Type[0];
        hL0Array = hL0.values();
        hL0Array3 = new hL0[hL0Array.length];
        VALUES = hL0Array3;
        int n10 = hL0Array.length;
        for (int i3 = 0; i3 < n10; i3 += n7) {
            enum_3 = hL0Array[i3];
            hL0Array2 = VALUES;
            int n14 = ((hL0)enum_3).id;
            hL0Array2[n14] = enum_3;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hL0(Tk1 tk1) {
        int n4;
        void var5_4;
        void var4_3;
        void var2_-1;
        void var1_-1;
        this.id = (int)tk1;
        this.collection = var4_3;
        this.javaType = var5_4;
        Object object = hL0$a.a;
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
        object = (Object)hL0$b.SCALAR;
        if (var4_3 != object || (n8 = (object = hL0$a.b)[n4 = var5_4.ordinal()]) == n10 || n8 == n7 || n8 == (n7 = 3)) {
            n10 = 0;
        }
        this.primitiveScalar = n10;
    }

    public static hL0 forId(int n3) {
        hL0[] hL0Array;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (hL0Array = VALUES).length)) {
            return hL0Array[n3];
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
            Class<?>[] classArray = hL0.getGenericSuperList((Class)serializable);
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
        if (!(bl2 = (object = hL0.getListParameter(clazz, typeArray)) instanceof Class)) {
            return true;
        }
        clazz = this.elementType;
        object = (Class)object;
        return clazz.isAssignableFrom((Class<?>)object);
    }

    public static hL0 valueOf(String string2) {
        return Enum.valueOf(hL0.class, string2);
    }

    public static hL0[] values() {
        return (hL0[])$VALUES.clone();
    }

    public Tk1 getJavaType() {
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
        hL0$b hL0$b = this.collection;
        hL0$b hL0$b2 = hL0$b.MAP;
        if (hL0$b == hL0$b2) {
            bl2 = true;
        } else {
            bl2 = false;
            hL0$b = null;
        }
        return bl2;
    }

    public boolean isPacked() {
        hL0$b hL0$b = hL0$b.PACKED_VECTOR;
        hL0$b hL0$b2 = this.collection;
        return ((Object)((Object)hL0$b)).equals((Object)hL0$b2);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        boolean bl2;
        hL0$b hL0$b = this.collection;
        hL0$b hL0$b2 = hL0$b.SCALAR;
        if (hL0$b == hL0$b2) {
            bl2 = true;
        } else {
            bl2 = false;
            hL0$b = null;
        }
        return bl2;
    }

    public boolean isValidForField(Field annotatedElement) {
        Object object = hL0$b.VECTOR;
        hL0$b hL0$b = this.collection;
        boolean bl2 = ((Object)object).equals((Object)hL0$b);
        if (bl2) {
            return this.isValidForList((Field)annotatedElement);
        }
        object = this.javaType.getType();
        annotatedElement = annotatedElement.getType();
        return ((Class)object).isAssignableFrom((Class<?>)annotatedElement);
    }
}

