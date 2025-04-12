/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Sn
 */
public final class sn_0
extends Enum {
    private static final /* synthetic */ sn_0[] $VALUES;
    public static final /* enum */ sn_0 ADVERTISER_ID;
    public static final /* enum */ sn_0 ADV_TE;
    public static final /* enum */ sn_0 ANON_ID;
    public static final /* enum */ sn_0 APP_TE;
    public static final /* enum */ sn_0 APP_USER_ID;
    public static final /* enum */ sn_0 CONSIDER_VIEWS;
    public static final Sn$a Companion;
    public static final /* enum */ sn_0 DEVICE_TOKEN;
    public static final /* enum */ sn_0 EXT_INFO;
    public static final /* enum */ sn_0 INCLUDE_DWELL_DATA;
    public static final /* enum */ sn_0 INCLUDE_VIDEO_DATA;
    public static final /* enum */ sn_0 INSTALLER_PACKAGE;
    public static final /* enum */ sn_0 INSTALL_REFERRER;
    public static final /* enum */ sn_0 PAGE_ID;
    public static final /* enum */ sn_0 PAGE_SCOPED_USER_ID;
    public static final /* enum */ sn_0 RECEIPT_DATA;
    public static final /* enum */ sn_0 URL_SCHEMES;
    public static final /* enum */ sn_0 USER_DATA;
    private final String rawValue;

    private static final /* synthetic */ sn_0[] $values() {
        sn_0 sn_02 = ANON_ID;
        sn_02 = APP_USER_ID;
        sn_02 = ADVERTISER_ID;
        sn_02 = PAGE_ID;
        sn_02 = PAGE_SCOPED_USER_ID;
        sn_02 = USER_DATA;
        sn_02 = ADV_TE;
        sn_02 = APP_TE;
        sn_02 = CONSIDER_VIEWS;
        sn_02 = DEVICE_TOKEN;
        sn_02 = EXT_INFO;
        sn_02 = INCLUDE_DWELL_DATA;
        sn_02 = INCLUDE_VIDEO_DATA;
        sn_02 = INSTALL_REFERRER;
        sn_02 = INSTALLER_PACKAGE;
        sn_02 = RECEIPT_DATA;
        sn_02 = URL_SCHEMES;
        sn_0[] sn_0Array = new sn_0[]{sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02, sn_02};
        return sn_0Array;
    }

    static {
        Object object;
        ANON_ID = object = new sn_0("ANON_ID", 0, "anon_id");
        APP_USER_ID = object = new sn_0("APP_USER_ID", 1, "app_user_id");
        ADVERTISER_ID = object = new sn_0("ADVERTISER_ID", 2, "advertiser_id");
        PAGE_ID = object = new sn_0("PAGE_ID", 3, "page_id");
        PAGE_SCOPED_USER_ID = object = new sn_0("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
        USER_DATA = object = new sn_0("USER_DATA", 5, "ud");
        ADV_TE = object = new sn_0("ADV_TE", 6, "advertiser_tracking_enabled");
        APP_TE = object = new sn_0("APP_TE", 7, "application_tracking_enabled");
        CONSIDER_VIEWS = object = new sn_0("CONSIDER_VIEWS", 8, "consider_views");
        DEVICE_TOKEN = object = new sn_0("DEVICE_TOKEN", 9, "device_token");
        EXT_INFO = object = new sn_0("EXT_INFO", 10, "extInfo");
        INCLUDE_DWELL_DATA = object = new sn_0("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
        INCLUDE_VIDEO_DATA = object = new sn_0("INCLUDE_VIDEO_DATA", 12, "include_video_data");
        INSTALL_REFERRER = object = new sn_0("INSTALL_REFERRER", 13, "install_referrer");
        INSTALLER_PACKAGE = object = new sn_0("INSTALLER_PACKAGE", 14, "installer_package");
        RECEIPT_DATA = object = new sn_0("RECEIPT_DATA", 15, "receipt_data");
        URL_SCHEMES = object = new sn_0("URL_SCHEMES", 16, "url_schemes");
        $VALUES = sn_0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sn_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static sn_0 valueOf(String string2) {
        return Enum.valueOf(sn_0.class, string2);
    }

    public static sn_0[] values() {
        return (sn_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

