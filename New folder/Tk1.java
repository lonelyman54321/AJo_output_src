/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.constant.Constable;

public final class Tk1
extends Enum {
    private static final /* synthetic */ Tk1[] $VALUES;
    public static final /* enum */ Tk1 BOOLEAN;
    public static final /* enum */ Tk1 BYTE_STRING;
    public static final /* enum */ Tk1 DOUBLE;
    public static final /* enum */ Tk1 ENUM;
    public static final /* enum */ Tk1 FLOAT;
    public static final /* enum */ Tk1 INT;
    public static final /* enum */ Tk1 LONG;
    public static final /* enum */ Tk1 MESSAGE;
    public static final /* enum */ Tk1 STRING;
    public static final /* enum */ Tk1 VOID;
    private final Class boxedType;
    private final Object defaultDefault;
    private final Class type;

    static {
        Tk1 tk1;
        Tk1 tk12;
        Tk1 tk13;
        Tk1 tk14;
        Tk1 tk15;
        Tk1[] tk1Array;
        Tk1[] tk1Array2 = tk1Array;
        tk1Array = new Tk1("VOID", 0, Void.class, Void.class, null);
        VOID = tk1Array;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        Tk1[] tk1Array3 = tk1Array2;
        Class<Constable> clazz = object;
        tk1Array2 = new Tk1("INT", 1, object, Integer.class, (Object)serializable);
        INT = tk1Array2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        Tk1 tk16 = tk15;
        LONG = tk15 = new Tk1("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        tk1Array3 = tk14;
        FLOAT = tk14 = new Tk1("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        tk16 = tk13;
        DOUBLE = tk13 = new Tk1("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        tk1Array3 = tk16;
        BOOLEAN = tk16 = new Tk1("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        Tk1 tk17 = tk12;
        STRING = tk12 = new Tk1("STRING", 6, String.class, String.class, (Object)"");
        serializable = DF.b;
        tk1Array3 = tk17;
        BYTE_STRING = tk17 = new Tk1("BYTE_STRING", 7, DF.class, DF.class, (Object)serializable);
        tk1Array3 = tk1;
        clazz = object;
        ENUM = tk1 = new Tk1("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = object;
        tk1Array3 = new Tk1[]{tk1Array, tk1Array2, tk15, tk14, tk13, tk16, tk12, tk17, tk1, object};
        $VALUES = tk1Array3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Tk1(Object object) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.type = object;
        this.boxedType = var4_2;
        this.defaultDefault = var5_3;
    }

    public static Tk1 valueOf(String string2) {
        return Enum.valueOf(Tk1.class, string2);
    }

    public static Tk1[] values() {
        return (Tk1[])$VALUES.clone();
    }

    public Class getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class getType() {
        return this.type;
    }

    public boolean isValidType(Class clazz) {
        return this.type.isAssignableFrom(clazz);
    }
}

