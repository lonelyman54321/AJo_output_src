/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from w80
 */
public final class w80_0
extends Enum {
    private static final /* synthetic */ w80_0[] $VALUES;
    public static final /* enum */ w80_0 ADV_TE;
    public static final /* enum */ w80_0 ANON_ID;
    public static final /* enum */ w80_0 APP_TE;
    public static final /* enum */ w80_0 CONSIDER_VIEWS;
    public static final /* enum */ w80_0 DEVICE_TOKEN;
    public static final /* enum */ w80_0 EXT_INFO;
    public static final /* enum */ w80_0 FB_LOGIN_ID;
    public static final /* enum */ w80_0 INCLUDE_DWELL_DATA;
    public static final /* enum */ w80_0 INCLUDE_VIDEO_DATA;
    public static final /* enum */ w80_0 INSTALLER_PACKAGE;
    public static final /* enum */ w80_0 INSTALL_REFERRER;
    public static final /* enum */ w80_0 MAD_ID;
    public static final /* enum */ w80_0 PAGE_ID;
    public static final /* enum */ w80_0 PAGE_SCOPED_USER_ID;
    public static final /* enum */ w80_0 RECEIPT_DATA;
    public static final /* enum */ w80_0 URL_SCHEMES;
    public static final /* enum */ w80_0 USER_DATA;
    private final String rawValue;

    private static final /* synthetic */ w80_0[] $values() {
        w80_0 w80_02 = ANON_ID;
        w80_02 = FB_LOGIN_ID;
        w80_02 = MAD_ID;
        w80_02 = PAGE_ID;
        w80_02 = PAGE_SCOPED_USER_ID;
        w80_02 = USER_DATA;
        w80_02 = ADV_TE;
        w80_02 = APP_TE;
        w80_02 = CONSIDER_VIEWS;
        w80_02 = DEVICE_TOKEN;
        w80_02 = EXT_INFO;
        w80_02 = INCLUDE_DWELL_DATA;
        w80_02 = INCLUDE_VIDEO_DATA;
        w80_02 = INSTALL_REFERRER;
        w80_02 = INSTALLER_PACKAGE;
        w80_02 = RECEIPT_DATA;
        w80_02 = URL_SCHEMES;
        w80_0[] w80_0Array = new w80_0[]{w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02, w80_02};
        return w80_0Array;
    }

    static {
        w80_0 w80_02;
        ANON_ID = w80_02 = new w80_0("ANON_ID", 0, "anon_id");
        FB_LOGIN_ID = w80_02 = new w80_0("FB_LOGIN_ID", 1, "fb_login_id");
        MAD_ID = w80_02 = new w80_0("MAD_ID", 2, "madid");
        PAGE_ID = w80_02 = new w80_0("PAGE_ID", 3, "page_id");
        PAGE_SCOPED_USER_ID = w80_02 = new w80_0("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
        USER_DATA = w80_02 = new w80_0("USER_DATA", 5, "ud");
        ADV_TE = w80_02 = new w80_0("ADV_TE", 6, "advertiser_tracking_enabled");
        APP_TE = w80_02 = new w80_0("APP_TE", 7, "application_tracking_enabled");
        CONSIDER_VIEWS = w80_02 = new w80_0("CONSIDER_VIEWS", 8, "consider_views");
        DEVICE_TOKEN = w80_02 = new w80_0("DEVICE_TOKEN", 9, "device_token");
        EXT_INFO = w80_02 = new w80_0("EXT_INFO", 10, "extInfo");
        INCLUDE_DWELL_DATA = w80_02 = new w80_0("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
        INCLUDE_VIDEO_DATA = w80_02 = new w80_0("INCLUDE_VIDEO_DATA", 12, "include_video_data");
        INSTALL_REFERRER = w80_02 = new w80_0("INSTALL_REFERRER", 13, "install_referrer");
        INSTALLER_PACKAGE = w80_02 = new w80_0("INSTALLER_PACKAGE", 14, "installer_package");
        RECEIPT_DATA = w80_02 = new w80_0("RECEIPT_DATA", 15, "receipt_data");
        URL_SCHEMES = w80_02 = new w80_0("URL_SCHEMES", 16, "url_schemes");
        $VALUES = w80_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w80_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static w80_0 valueOf(String string2) {
        return Enum.valueOf(w80_0.class, string2);
    }

    public static w80_0[] values() {
        return (w80_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

