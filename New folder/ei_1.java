/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eI
 */
public final class ei_1
extends Enum {
    private static final /* synthetic */ ei_1[] $VALUES;
    public static final /* enum */ ei_1 CTInAppTypeAlert;
    public static final /* enum */ ei_1 CTInAppTypeCover;
    public static final /* enum */ ei_1 CTInAppTypeCoverHTML;
    public static final /* enum */ ei_1 CTInAppTypeCoverImageOnly;
    public static final /* enum */ ei_1 CTInAppTypeCustomCodeTemplate;
    public static final /* enum */ ei_1 CTInAppTypeFooter;
    public static final /* enum */ ei_1 CTInAppTypeFooterHTML;
    public static final /* enum */ ei_1 CTInAppTypeHTML;
    public static final /* enum */ ei_1 CTInAppTypeHalfInterstitial;
    public static final /* enum */ ei_1 CTInAppTypeHalfInterstitialHTML;
    public static final /* enum */ ei_1 CTInAppTypeHalfInterstitialImageOnly;
    public static final /* enum */ ei_1 CTInAppTypeHeader;
    public static final /* enum */ ei_1 CTInAppTypeHeaderHTML;
    public static final /* enum */ ei_1 CTInAppTypeInterstitial;
    public static final /* enum */ ei_1 CTInAppTypeInterstitialHTML;
    public static final /* enum */ ei_1 CTInAppTypeInterstitialImageOnly;
    public static final /* enum */ ei_1 UNKNOWN;
    private final String inAppType;

    private static /* synthetic */ ei_1[] $values() {
        ei_1 ei_12 = CTInAppTypeHTML;
        ei_12 = CTInAppTypeCoverHTML;
        ei_12 = CTInAppTypeInterstitialHTML;
        ei_12 = CTInAppTypeHeaderHTML;
        ei_12 = CTInAppTypeFooterHTML;
        ei_12 = CTInAppTypeHalfInterstitialHTML;
        ei_12 = CTInAppTypeCover;
        ei_12 = CTInAppTypeInterstitial;
        ei_12 = CTInAppTypeHalfInterstitial;
        ei_12 = CTInAppTypeHeader;
        ei_12 = CTInAppTypeFooter;
        ei_12 = CTInAppTypeAlert;
        ei_12 = CTInAppTypeCoverImageOnly;
        ei_12 = CTInAppTypeInterstitialImageOnly;
        ei_12 = CTInAppTypeHalfInterstitialImageOnly;
        ei_12 = CTInAppTypeCustomCodeTemplate;
        ei_12 = UNKNOWN;
        ei_1[] ei_1Array = new ei_1[]{ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12, ei_12};
        return ei_1Array;
    }

    static {
        ei_1 ei_12;
        CTInAppTypeHTML = ei_12 = new ei_1("CTInAppTypeHTML", 0, "html");
        CTInAppTypeCoverHTML = ei_12 = new ei_1("CTInAppTypeCoverHTML", 1, "coverHtml");
        CTInAppTypeInterstitialHTML = ei_12 = new ei_1("CTInAppTypeInterstitialHTML", 2, "interstitialHtml");
        CTInAppTypeHeaderHTML = ei_12 = new ei_1("CTInAppTypeHeaderHTML", 3, "headerHtml");
        CTInAppTypeFooterHTML = ei_12 = new ei_1("CTInAppTypeFooterHTML", 4, "footerHtml");
        CTInAppTypeHalfInterstitialHTML = ei_12 = new ei_1("CTInAppTypeHalfInterstitialHTML", 5, "halfInterstitialHtml");
        CTInAppTypeCover = ei_12 = new ei_1("CTInAppTypeCover", 6, "cover");
        CTInAppTypeInterstitial = ei_12 = new ei_1("CTInAppTypeInterstitial", 7, "interstitial");
        CTInAppTypeHalfInterstitial = ei_12 = new ei_1("CTInAppTypeHalfInterstitial", 8, "half-interstitial");
        CTInAppTypeHeader = ei_12 = new ei_1("CTInAppTypeHeader", 9, "header-template");
        CTInAppTypeFooter = ei_12 = new ei_1("CTInAppTypeFooter", 10, "footer-template");
        CTInAppTypeAlert = ei_12 = new ei_1("CTInAppTypeAlert", 11, "alert-template");
        CTInAppTypeCoverImageOnly = ei_12 = new ei_1("CTInAppTypeCoverImageOnly", 12, "cover-image");
        CTInAppTypeInterstitialImageOnly = ei_12 = new ei_1("CTInAppTypeInterstitialImageOnly", 13, "interstitial-image");
        CTInAppTypeHalfInterstitialImageOnly = ei_12 = new ei_1("CTInAppTypeHalfInterstitialImageOnly", 14, "half-interstitial-image");
        CTInAppTypeCustomCodeTemplate = ei_12 = new ei_1("CTInAppTypeCustomCodeTemplate", 15, "custom-code");
        UNKNOWN = ei_12 = new ei_1("UNKNOWN", 16, "");
        $VALUES = ei_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ei_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.inAppType = var3_2;
    }

    public static ei_1 fromString(String string2) {
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1979390978: {
                String string3 = "coverHtml";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 15;
                break;
            }
            case 1977176024: {
                String string4 = "headerHtml";
                boolean bl3 = string2.equals(string4);
                if (!bl3) break;
                n3 = 14;
                break;
            }
            case 1420225510: {
                String string5 = "footerHtml";
                boolean bl4 = string2.equals(string5);
                if (!bl4) break;
                n3 = 13;
                break;
            }
            case 1189018554: {
                String string6 = "header-template";
                boolean bl5 = string2.equals(string6);
                if (!bl5) break;
                n3 = 12;
                break;
            }
            case 894039686: {
                String string7 = "half-interstitial";
                boolean bl6 = string2.equals(string7);
                if (!bl6) break;
                n3 = 11;
                break;
            }
            case 604727084: {
                String string8 = "interstitial";
                boolean bl7 = string2.equals(string8);
                if (!bl7) break;
                n3 = 10;
                break;
            }
            case 94852023: {
                String string9 = "cover";
                boolean bl8 = string2.equals(string9);
                if (!bl8) break;
                n3 = 9;
                break;
            }
            case 3213227: {
                String string10 = "html";
                boolean bl9 = string2.equals(string10);
                if (!bl9) break;
                n3 = 8;
                break;
            }
            case -37253685: {
                String string11 = "alert-template";
                boolean bl10 = string2.equals(string11);
                if (!bl10) break;
                n3 = 7;
                break;
            }
            case -334055316: {
                String string12 = "footer-template";
                boolean bl11 = string2.equals(string12);
                if (!bl11) break;
                n3 = 6;
                break;
            }
            case -728863497: {
                String string13 = "interstitialHtml";
                boolean bl12 = string2.equals(string13);
                if (!bl12) break;
                n3 = 5;
                break;
            }
            case -1141304454: {
                String string14 = "interstitial-image";
                boolean bl13 = string2.equals(string14);
                if (!bl13) break;
                n3 = 4;
                break;
            }
            case -1160074422: {
                String string15 = "halfInterstitialHtml";
                boolean bl14 = string2.equals(string15);
                if (!bl14) break;
                n3 = 3;
                break;
            }
            case -1258935355: {
                String string16 = "cover-image";
                boolean bl15 = string2.equals(string16);
                if (!bl15) break;
                n3 = 2;
                break;
            }
            case -1698613420: {
                String string17 = "half-interstitial-image";
                boolean bl16 = string2.equals(string17);
                if (!bl16) break;
                n3 = 1;
                break;
            }
            case -1824210231: {
                String string18 = "custom-code";
                boolean bl17 = string2.equals(string18);
                if (!bl17) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return UNKNOWN;
            }
            case 15: {
                return CTInAppTypeCoverHTML;
            }
            case 14: {
                return CTInAppTypeHeaderHTML;
            }
            case 13: {
                return CTInAppTypeFooterHTML;
            }
            case 12: {
                return CTInAppTypeHeader;
            }
            case 11: {
                return CTInAppTypeHalfInterstitial;
            }
            case 10: {
                return CTInAppTypeInterstitial;
            }
            case 9: {
                return CTInAppTypeCover;
            }
            case 8: {
                return CTInAppTypeHTML;
            }
            case 7: {
                return CTInAppTypeAlert;
            }
            case 6: {
                return CTInAppTypeFooter;
            }
            case 5: {
                return CTInAppTypeInterstitialHTML;
            }
            case 4: {
                return CTInAppTypeInterstitialImageOnly;
            }
            case 3: {
                return CTInAppTypeHalfInterstitialHTML;
            }
            case 2: {
                return CTInAppTypeCoverImageOnly;
            }
            case 1: {
                return CTInAppTypeHalfInterstitialImageOnly;
            }
            case 0: 
        }
        return CTInAppTypeCustomCodeTemplate;
    }

    public static ei_1 valueOf(String string2) {
        return Enum.valueOf(ei_1.class, string2);
    }

    public static ei_1[] values() {
        return (ei_1[])$VALUES.clone();
    }

    public String toString() {
        return this.inAppType;
    }
}

