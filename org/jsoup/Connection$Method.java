/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

public final class Connection$Method
extends Enum {
    private static final /* synthetic */ Connection$Method[] $VALUES;
    public static final /* enum */ Connection$Method DELETE;
    public static final /* enum */ Connection$Method GET;
    public static final /* enum */ Connection$Method HEAD;
    public static final /* enum */ Connection$Method OPTIONS;
    public static final /* enum */ Connection$Method PATCH;
    public static final /* enum */ Connection$Method POST;
    public static final /* enum */ Connection$Method PUT;
    public static final /* enum */ Connection$Method TRACE;
    private final boolean hasBody;

    private static /* synthetic */ Connection$Method[] $values() {
        Connection$Method connection$Method = GET;
        connection$Method = POST;
        connection$Method = PUT;
        connection$Method = DELETE;
        connection$Method = PATCH;
        connection$Method = HEAD;
        connection$Method = OPTIONS;
        connection$Method = TRACE;
        Connection$Method[] connection$MethodArray = new Connection$Method[]{connection$Method, connection$Method, connection$Method, connection$Method, connection$Method, connection$Method, connection$Method, connection$Method};
        return connection$MethodArray;
    }

    static {
        Connection$Method connection$Method;
        GET = connection$Method = new Connection$Method("GET", 0, false);
        boolean bl2 = true;
        POST = connection$Method = new Connection$Method("POST", (int)(bl2 ? 1 : 0), bl2);
        PUT = connection$Method = new Connection$Method("PUT", 2, bl2);
        DELETE = connection$Method = new Connection$Method("DELETE", 3, bl2);
        PATCH = connection$Method = new Connection$Method("PATCH", 4, bl2);
        HEAD = connection$Method = new Connection$Method("HEAD", 5, false);
        OPTIONS = connection$Method = new Connection$Method("OPTIONS", 6, false);
        TRACE = connection$Method = new Connection$Method("TRACE", 7, false);
        $VALUES = Connection$Method.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Connection$Method() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.hasBody = var3_2;
    }

    public static Connection$Method valueOf(String string2) {
        return Enum.valueOf(Connection$Method.class, string2);
    }

    public static Connection$Method[] values() {
        return (Connection$Method[])$VALUES.clone();
    }

    public final boolean hasBody() {
        return this.hasBody;
    }
}

