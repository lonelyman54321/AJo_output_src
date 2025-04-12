/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public final class n$f
extends Enum {
    private static final /* synthetic */ n$f[] $VALUES;
    public static final /* enum */ n$f BUILD_MESSAGE_INFO;
    public static final /* enum */ n$f GET_DEFAULT_INSTANCE;
    public static final /* enum */ n$f GET_MEMOIZED_IS_INITIALIZED;
    public static final /* enum */ n$f GET_PARSER;
    public static final /* enum */ n$f NEW_BUILDER;
    public static final /* enum */ n$f NEW_MUTABLE_INSTANCE;
    public static final /* enum */ n$f SET_MEMOIZED_IS_INITIALIZED;

    static {
        n$f n$f;
        n$f n$f2;
        n$f n$f3;
        n$f n$f4;
        n$f n$f5;
        n$f n$f6;
        n$f n$f7;
        GET_MEMOIZED_IS_INITIALIZED = n$f7 = new n$f("GET_MEMOIZED_IS_INITIALIZED", 0);
        int n3 = 1;
        SET_MEMOIZED_IS_INITIALIZED = n$f6 = new n$f("SET_MEMOIZED_IS_INITIALIZED", n3);
        int n4 = 2;
        BUILD_MESSAGE_INFO = n$f5 = new n$f("BUILD_MESSAGE_INFO", n4);
        int n7 = 3;
        NEW_MUTABLE_INSTANCE = n$f4 = new n$f("NEW_MUTABLE_INSTANCE", n7);
        int n8 = 4;
        NEW_BUILDER = n$f3 = new n$f("NEW_BUILDER", n8);
        int n10 = 5;
        GET_DEFAULT_INSTANCE = n$f2 = new n$f("GET_DEFAULT_INSTANCE", n10);
        int n14 = 6;
        GET_PARSER = n$f = new n$f("GET_PARSER", n14);
        n$f[] n$fArray = new n$f[7];
        n$fArray[0] = n$f7;
        n$fArray[n3] = n$f6;
        n$fArray[n4] = n$f5;
        n$fArray[n7] = n$f4;
        n$fArray[n8] = n$f3;
        n$fArray[n10] = n$f2;
        n$fArray[n14] = n$f;
        $VALUES = n$fArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n$f() {
        void var2_-1;
        void var1_-1;
    }

    public static n$f valueOf(String string2) {
        return Enum.valueOf(n$f.class, string2);
    }

    public static n$f[] values() {
        return (n$f[])$VALUES.clone();
    }
}

