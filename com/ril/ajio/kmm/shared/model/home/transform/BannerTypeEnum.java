/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

public final class BannerTypeEnum
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ BannerTypeEnum[] $VALUES;
    public static final /* enum */ BannerTypeEnum BANNER_Ad;
    public static final /* enum */ BannerTypeEnum BANNER_GIF;
    public static final /* enum */ BannerTypeEnum BANNER_IMAGE;
    public static final /* enum */ BannerTypeEnum BANNER_VIDEO;
    private final int type;

    private static final /* synthetic */ BannerTypeEnum[] $values() {
        BannerTypeEnum bannerTypeEnum = BANNER_IMAGE;
        bannerTypeEnum = BANNER_GIF;
        bannerTypeEnum = BANNER_VIDEO;
        bannerTypeEnum = BANNER_Ad;
        BannerTypeEnum[] bannerTypeEnumArray = new BannerTypeEnum[]{bannerTypeEnum, bannerTypeEnum, bannerTypeEnum, bannerTypeEnum};
        return bannerTypeEnumArray;
    }

    static {
        int n3 = 1;
        Enum[] enumArray = new BannerTypeEnum("BANNER_IMAGE", 0, n3);
        BANNER_IMAGE = enumArray;
        int n4 = 2;
        enumArray = new BannerTypeEnum("BANNER_GIF", n3, n4);
        BANNER_GIF = enumArray;
        n3 = 3;
        enumArray = new BannerTypeEnum("BANNER_VIDEO", n4, n3);
        BANNER_VIDEO = enumArray;
        enumArray = new BannerTypeEnum("BANNER_Ad", n3, 4);
        BANNER_Ad = enumArray;
        enumArray = BannerTypeEnum.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BannerTypeEnum() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static BannerTypeEnum valueOf(String string2) {
        return Enum.valueOf(BannerTypeEnum.class, string2);
    }

    public static BannerTypeEnum[] values() {
        return (BannerTypeEnum[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

