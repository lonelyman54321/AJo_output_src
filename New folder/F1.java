/*
 * Decompiled with CFR 0.152.
 */
public final class F1
extends Enum {
    private static final /* synthetic */ F1[] $VALUES;
    public static final /* enum */ F1 CHROME_CUSTOM_TAB;
    public static final /* enum */ F1 CLIENT_TOKEN;
    public static final /* enum */ F1 DEVICE_AUTH;
    public static final /* enum */ F1 FACEBOOK_APPLICATION_NATIVE;
    public static final /* enum */ F1 FACEBOOK_APPLICATION_SERVICE;
    public static final /* enum */ F1 FACEBOOK_APPLICATION_WEB;
    public static final /* enum */ F1 INSTAGRAM_APPLICATION_WEB;
    public static final /* enum */ F1 INSTAGRAM_CUSTOM_CHROME_TAB;
    public static final /* enum */ F1 INSTAGRAM_WEB_VIEW;
    public static final /* enum */ F1 NONE;
    public static final /* enum */ F1 TEST_USER;
    public static final /* enum */ F1 WEB_VIEW;
    private final boolean canExtendToken;

    private static final /* synthetic */ F1[] $values() {
        F1 f1 = NONE;
        f1 = FACEBOOK_APPLICATION_WEB;
        f1 = FACEBOOK_APPLICATION_NATIVE;
        f1 = FACEBOOK_APPLICATION_SERVICE;
        f1 = WEB_VIEW;
        f1 = CHROME_CUSTOM_TAB;
        f1 = TEST_USER;
        f1 = CLIENT_TOKEN;
        f1 = DEVICE_AUTH;
        f1 = INSTAGRAM_APPLICATION_WEB;
        f1 = INSTAGRAM_CUSTOM_CHROME_TAB;
        f1 = INSTAGRAM_WEB_VIEW;
        F1[] f1Array = new F1[]{f1, f1, f1, f1, f1, f1, f1, f1, f1, f1, f1, f1};
        return f1Array;
    }

    static {
        F1 f1;
        NONE = f1 = new F1("NONE", 0, false);
        boolean bl2 = true;
        FACEBOOK_APPLICATION_WEB = f1 = new F1("FACEBOOK_APPLICATION_WEB", (int)(bl2 ? 1 : 0), bl2);
        FACEBOOK_APPLICATION_NATIVE = f1 = new F1("FACEBOOK_APPLICATION_NATIVE", 2, bl2);
        FACEBOOK_APPLICATION_SERVICE = f1 = new F1("FACEBOOK_APPLICATION_SERVICE", 3, bl2);
        WEB_VIEW = f1 = new F1("WEB_VIEW", 4, bl2);
        CHROME_CUSTOM_TAB = f1 = new F1("CHROME_CUSTOM_TAB", 5, bl2);
        TEST_USER = f1 = new F1("TEST_USER", 6, bl2);
        CLIENT_TOKEN = f1 = new F1("CLIENT_TOKEN", 7, bl2);
        DEVICE_AUTH = f1 = new F1("DEVICE_AUTH", 8, bl2);
        INSTAGRAM_APPLICATION_WEB = f1 = new F1("INSTAGRAM_APPLICATION_WEB", 9, bl2);
        INSTAGRAM_CUSTOM_CHROME_TAB = f1 = new F1("INSTAGRAM_CUSTOM_CHROME_TAB", 10, bl2);
        INSTAGRAM_WEB_VIEW = f1 = new F1("INSTAGRAM_WEB_VIEW", 11, bl2);
        $VALUES = F1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private F1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.canExtendToken = var3_2;
    }

    public static F1 valueOf(String string2) {
        return Enum.valueOf(F1.class, string2);
    }

    public static F1[] values() {
        return (F1[])$VALUES.clone();
    }

    public final boolean canExtendToken() {
        return this.canExtendToken;
    }

    public final boolean fromInstagram() {
        int n3;
        int[] nArray = F1$a.$EnumSwitchMapping$0;
        int n4 = this.ordinal();
        int n7 = nArray[n4];
        if (n7 != (n4 = 1) && n7 != (n3 = 2) && n7 != (n3 = 3)) {
            n4 = 0;
        }
        return n4;
    }
}

