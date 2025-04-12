/*
 * Decompiled with CFR 0.152.
 */
public final class uy1
extends Enum {
    private static final /* synthetic */ uy1[] $VALUES;
    public static final /* enum */ uy1 DEVICE_AUTH;
    public static final /* enum */ uy1 DIALOG_ONLY;
    public static final /* enum */ uy1 KATANA_ONLY;
    public static final /* enum */ uy1 NATIVE_ONLY;
    public static final /* enum */ uy1 NATIVE_WITH_FALLBACK;
    public static final /* enum */ uy1 WEB_ONLY;
    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    private static final /* synthetic */ uy1[] $values() {
        uy1 uy12 = NATIVE_WITH_FALLBACK;
        uy12 = NATIVE_ONLY;
        uy12 = KATANA_ONLY;
        uy12 = WEB_ONLY;
        uy12 = DIALOG_ONLY;
        uy12 = DEVICE_AUTH;
        uy1[] uy1Array = new uy1[]{uy12, uy12, uy12, uy12, uy12, uy12};
        return uy1Array;
    }

    static {
        uy1 uy12;
        boolean bl2 = true;
        uy1 uy13 = uy12;
        NATIVE_WITH_FALLBACK = uy12 = new uy1("NATIVE_WITH_FALLBACK", 0, true, true, bl2, false, true, true, true);
        NATIVE_ONLY = uy13 = new uy1("NATIVE_ONLY", 1, true, true, false, false, false, true, true);
        KATANA_ONLY = uy13 = new uy1("KATANA_ONLY", 2, false, bl2, false, false, false, false, false);
        WEB_ONLY = uy13 = new uy1("WEB_ONLY", 3, false, false, true, false, true, false, false);
        DIALOG_ONLY = uy13 = new uy1("DIALOG_ONLY", 4, false, bl2, true, false, true, true, true);
        DEVICE_AUTH = uy13 = new uy1("DEVICE_AUTH", 5, false, false, false, true, false, false, false);
        $VALUES = uy1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uy1(boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        void var9_7;
        void var8_6;
        void var2_-1;
        void var1_-1;
        this.allowsGetTokenAuth = bl3;
        this.allowsKatanaAuth = bl4;
        this.allowsWebViewAuth = bl5;
        this.allowsDeviceAuth = bl6;
        this.allowsCustomTabAuth = bl7;
        this.allowsFacebookLiteAuth = var8_6;
        this.allowsInstagramAppAuth = var9_7;
    }

    public static uy1 valueOf(String string2) {
        return Enum.valueOf(uy1.class, string2);
    }

    public static uy1[] values() {
        return (uy1[])$VALUES.clone();
    }

    public final boolean allowsCustomTabAuth() {
        return this.allowsCustomTabAuth;
    }

    public final boolean allowsDeviceAuth() {
        return this.allowsDeviceAuth;
    }

    public final boolean allowsFacebookLiteAuth() {
        return this.allowsFacebookLiteAuth;
    }

    public final boolean allowsGetTokenAuth() {
        return this.allowsGetTokenAuth;
    }

    public final boolean allowsInstagramAppAuth() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean allowsKatanaAuth() {
        return this.allowsKatanaAuth;
    }

    public final boolean allowsWebViewAuth() {
        return this.allowsWebViewAuth;
    }
}

