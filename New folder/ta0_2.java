/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from TA0
 */
public final class ta0_2
extends Enum {
    private static final /* synthetic */ ta0_2[] $VALUES;
    public static final /* enum */ ta0_2 CANCEL;
    public static final /* enum */ ta0_2 COMPRESSION_ERROR;
    public static final /* enum */ ta0_2 CONNECT_ERROR;
    public static final ta0$a_0 Companion;
    public static final /* enum */ ta0_2 ENHANCE_YOUR_CALM;
    public static final /* enum */ ta0_2 FLOW_CONTROL_ERROR;
    public static final /* enum */ ta0_2 FRAME_SIZE_ERROR;
    public static final /* enum */ ta0_2 HTTP_1_1_REQUIRED;
    public static final /* enum */ ta0_2 INADEQUATE_SECURITY;
    public static final /* enum */ ta0_2 INTERNAL_ERROR;
    public static final /* enum */ ta0_2 NO_ERROR;
    public static final /* enum */ ta0_2 PROTOCOL_ERROR;
    public static final /* enum */ ta0_2 REFUSED_STREAM;
    public static final /* enum */ ta0_2 SETTINGS_TIMEOUT;
    public static final /* enum */ ta0_2 STREAM_CLOSED;
    private final int httpCode;

    private static final /* synthetic */ ta0_2[] $values() {
        ta0_2 ta0_22 = NO_ERROR;
        ta0_22 = PROTOCOL_ERROR;
        ta0_22 = INTERNAL_ERROR;
        ta0_22 = FLOW_CONTROL_ERROR;
        ta0_22 = SETTINGS_TIMEOUT;
        ta0_22 = STREAM_CLOSED;
        ta0_22 = FRAME_SIZE_ERROR;
        ta0_22 = REFUSED_STREAM;
        ta0_22 = CANCEL;
        ta0_22 = COMPRESSION_ERROR;
        ta0_22 = CONNECT_ERROR;
        ta0_22 = ENHANCE_YOUR_CALM;
        ta0_22 = INADEQUATE_SECURITY;
        ta0_22 = HTTP_1_1_REQUIRED;
        ta0_2[] ta0_2Array = new ta0_2[]{ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22, ta0_22};
        return ta0_2Array;
    }

    static {
        Object object;
        NO_ERROR = object = new ta0_2("NO_ERROR", 0, 0);
        int n3 = 1;
        PROTOCOL_ERROR = object = new ta0_2("PROTOCOL_ERROR", n3, n3);
        n3 = 2;
        INTERNAL_ERROR = object = new ta0_2("INTERNAL_ERROR", n3, n3);
        n3 = 3;
        FLOW_CONTROL_ERROR = object = new ta0_2("FLOW_CONTROL_ERROR", n3, n3);
        n3 = 4;
        SETTINGS_TIMEOUT = object = new ta0_2("SETTINGS_TIMEOUT", n3, n3);
        n3 = 5;
        STREAM_CLOSED = object = new ta0_2("STREAM_CLOSED", n3, n3);
        n3 = 6;
        FRAME_SIZE_ERROR = object = new ta0_2("FRAME_SIZE_ERROR", n3, n3);
        n3 = 7;
        REFUSED_STREAM = object = new ta0_2("REFUSED_STREAM", n3, n3);
        n3 = 8;
        CANCEL = object = new ta0_2("CANCEL", n3, n3);
        n3 = 9;
        COMPRESSION_ERROR = object = new ta0_2("COMPRESSION_ERROR", n3, n3);
        n3 = 10;
        CONNECT_ERROR = object = new ta0_2("CONNECT_ERROR", n3, n3);
        n3 = 11;
        ENHANCE_YOUR_CALM = object = new ta0_2("ENHANCE_YOUR_CALM", n3, n3);
        n3 = 12;
        INADEQUATE_SECURITY = object = new ta0_2("INADEQUATE_SECURITY", n3, n3);
        n3 = 13;
        HTTP_1_1_REQUIRED = object = new ta0_2("HTTP_1_1_REQUIRED", n3, n3);
        $VALUES = ta0_2.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ta0_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.httpCode = var3_2;
    }

    public static ta0_2 valueOf(String string2) {
        return Enum.valueOf(ta0_2.class, string2);
    }

    public static ta0_2[] values() {
        return (ta0_2[])$VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}

