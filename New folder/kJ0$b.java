/*
 * Decompiled with CFR 0.152.
 */
public final class kJ0$b
extends Enum {
    private static final /* synthetic */ kJ0$b[] $VALUES;
    public static final /* enum */ kJ0$b AAM;
    public static final /* enum */ kJ0$b AndroidIAPSubscriptionAutoLogging;
    public static final /* enum */ kJ0$b AndroidManualImplicitPurchaseDedupe;
    public static final /* enum */ kJ0$b AndroidManualImplicitSubsDedupe;
    public static final /* enum */ kJ0$b AnrReport;
    public static final /* enum */ kJ0$b AppEvents;
    public static final /* enum */ kJ0$b BannedParamFiltering;
    public static final /* enum */ kJ0$b BlocklistEvents;
    public static final /* enum */ kJ0$b BypassAppSwitch;
    public static final /* enum */ kJ0$b ChromeCustomTabsPrefetching;
    public static final /* enum */ kJ0$b CloudBridge;
    public static final /* enum */ kJ0$b CodelessEvents;
    public static final kJ0$b$a Companion;
    public static final /* enum */ kJ0$b Core;
    public static final /* enum */ kJ0$b CrashReport;
    public static final /* enum */ kJ0$b CrashShield;
    public static final /* enum */ kJ0$b Elora;
    public static final /* enum */ kJ0$b ErrorReport;
    public static final /* enum */ kJ0$b EventDeactivation;
    public static final /* enum */ kJ0$b FilterRedactedEvents;
    public static final /* enum */ kJ0$b FilterSensitiveParams;
    public static final /* enum */ kJ0$b GPSARATriggers;
    public static final /* enum */ kJ0$b GPSPACAProcessing;
    public static final /* enum */ kJ0$b IapLogging;
    public static final /* enum */ kJ0$b IapLoggingLib2;
    public static final /* enum */ kJ0$b IapLoggingLib5To7;
    public static final /* enum */ kJ0$b IgnoreAppSwitchToLoggedOut;
    public static final /* enum */ kJ0$b Instrument;
    public static final /* enum */ kJ0$b IntelligentIntegrity;
    public static final /* enum */ kJ0$b Login;
    public static final /* enum */ kJ0$b MACARuleMatching;
    public static final /* enum */ kJ0$b Megatron;
    public static final /* enum */ kJ0$b ModelRequest;
    public static final /* enum */ kJ0$b Monitoring;
    public static final /* enum */ kJ0$b OnDeviceEventProcessing;
    public static final /* enum */ kJ0$b OnDevicePostInstallEventProcessing;
    public static final /* enum */ kJ0$b PrivacyProtection;
    public static final /* enum */ kJ0$b ProtectedMode;
    public static final /* enum */ kJ0$b RestrictiveDataFiltering;
    public static final /* enum */ kJ0$b ServiceUpdateCompliance;
    public static final /* enum */ kJ0$b Share;
    public static final /* enum */ kJ0$b StdParamEnforcement;
    public static final /* enum */ kJ0$b SuggestedEvents;
    public static final /* enum */ kJ0$b ThreadCheck;
    public static final /* enum */ kJ0$b Unknown;
    private final int code;

    private static final /* synthetic */ kJ0$b[] $values() {
        kJ0$b kJ0$b = Unknown;
        kJ0$b = Core;
        kJ0$b = AppEvents;
        kJ0$b = CodelessEvents;
        kJ0$b = CloudBridge;
        kJ0$b = RestrictiveDataFiltering;
        kJ0$b = AAM;
        kJ0$b = PrivacyProtection;
        kJ0$b = SuggestedEvents;
        kJ0$b = IntelligentIntegrity;
        kJ0$b = ModelRequest;
        kJ0$b = ProtectedMode;
        kJ0$b = MACARuleMatching;
        kJ0$b = BlocklistEvents;
        kJ0$b = FilterRedactedEvents;
        kJ0$b = FilterSensitiveParams;
        kJ0$b = StdParamEnforcement;
        kJ0$b = BannedParamFiltering;
        kJ0$b = EventDeactivation;
        kJ0$b = OnDeviceEventProcessing;
        kJ0$b = OnDevicePostInstallEventProcessing;
        kJ0$b = IapLogging;
        kJ0$b = IapLoggingLib2;
        kJ0$b = IapLoggingLib5To7;
        kJ0$b = AndroidManualImplicitPurchaseDedupe;
        kJ0$b = AndroidManualImplicitSubsDedupe;
        kJ0$b = AndroidIAPSubscriptionAutoLogging;
        kJ0$b = Instrument;
        kJ0$b = CrashReport;
        kJ0$b = CrashShield;
        kJ0$b = ThreadCheck;
        kJ0$b = ErrorReport;
        kJ0$b = AnrReport;
        kJ0$b = Monitoring;
        kJ0$b = ServiceUpdateCompliance;
        kJ0$b = Megatron;
        kJ0$b = Elora;
        kJ0$b = GPSARATriggers;
        kJ0$b = GPSPACAProcessing;
        kJ0$b = Login;
        kJ0$b = ChromeCustomTabsPrefetching;
        kJ0$b = IgnoreAppSwitchToLoggedOut;
        kJ0$b = BypassAppSwitch;
        kJ0$b = Share;
        kJ0$b[] kJ0$bArray = new kJ0$b[]{kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b, kJ0$b};
        return kJ0$bArray;
    }

    static {
        Object object;
        Unknown = object = new kJ0$b("Unknown", 0, -1);
        Core = object = new kJ0$b("Core", 1, 0);
        AppEvents = object = new kJ0$b("AppEvents", 2, 65536);
        CodelessEvents = object = new kJ0$b("CodelessEvents", 3, 65792);
        CloudBridge = object = new kJ0$b("CloudBridge", 4, 67584);
        RestrictiveDataFiltering = object = new kJ0$b("RestrictiveDataFiltering", 5, 66048);
        AAM = object = new kJ0$b("AAM", 6, 66304);
        PrivacyProtection = object = new kJ0$b("PrivacyProtection", 7, 66560);
        SuggestedEvents = object = new kJ0$b("SuggestedEvents", 8, 66561);
        IntelligentIntegrity = object = new kJ0$b("IntelligentIntegrity", 9, 66562);
        ModelRequest = object = new kJ0$b("ModelRequest", 10, 66563);
        ProtectedMode = object = new kJ0$b("ProtectedMode", 11, 66564);
        MACARuleMatching = object = new kJ0$b("MACARuleMatching", 12, 66565);
        BlocklistEvents = object = new kJ0$b("BlocklistEvents", 13, 66566);
        FilterRedactedEvents = object = new kJ0$b("FilterRedactedEvents", 14, 66567);
        FilterSensitiveParams = object = new kJ0$b("FilterSensitiveParams", 15, 66568);
        StdParamEnforcement = object = new kJ0$b("StdParamEnforcement", 16, 16843785);
        BannedParamFiltering = object = new kJ0$b("BannedParamFiltering", 17, 16843786);
        EventDeactivation = object = new kJ0$b("EventDeactivation", 18, 66816);
        OnDeviceEventProcessing = object = new kJ0$b("OnDeviceEventProcessing", 19, 67072);
        OnDevicePostInstallEventProcessing = object = new kJ0$b("OnDevicePostInstallEventProcessing", 20, 67073);
        IapLogging = object = new kJ0$b("IapLogging", 21, 67328);
        IapLoggingLib2 = object = new kJ0$b("IapLoggingLib2", 22, 67329);
        IapLoggingLib5To7 = object = new kJ0$b("IapLoggingLib5To7", 23, 67330);
        AndroidManualImplicitPurchaseDedupe = object = new kJ0$b("AndroidManualImplicitPurchaseDedupe", 24, 67331);
        AndroidManualImplicitSubsDedupe = object = new kJ0$b("AndroidManualImplicitSubsDedupe", 25, 67332);
        AndroidIAPSubscriptionAutoLogging = object = new kJ0$b("AndroidIAPSubscriptionAutoLogging", 26, 67333);
        Instrument = object = new kJ0$b("Instrument", 27, 131072);
        CrashReport = object = new kJ0$b("CrashReport", 28, 131328);
        CrashShield = object = new kJ0$b("CrashShield", 29, 131329);
        ThreadCheck = object = new kJ0$b("ThreadCheck", 30, 131330);
        ErrorReport = object = new kJ0$b("ErrorReport", 31, 131584);
        AnrReport = object = new kJ0$b("AnrReport", 32, 131840);
        Monitoring = object = new kJ0$b("Monitoring", 33, 196608);
        ServiceUpdateCompliance = object = new kJ0$b("ServiceUpdateCompliance", 34, 196864);
        Megatron = object = new kJ0$b("Megatron", 35, 262144);
        Elora = object = new kJ0$b("Elora", 36, 327680);
        GPSARATriggers = object = new kJ0$b("GPSARATriggers", 37, 393216);
        GPSPACAProcessing = object = new kJ0$b("GPSPACAProcessing", 38, 458752);
        Login = object = new kJ0$b("Login", 39, 0x1000000);
        ChromeCustomTabsPrefetching = object = new kJ0$b("ChromeCustomTabsPrefetching", 40, 0x1010000);
        IgnoreAppSwitchToLoggedOut = object = new kJ0$b("IgnoreAppSwitchToLoggedOut", 41, 0x1020000);
        BypassAppSwitch = object = new kJ0$b("BypassAppSwitch", 42, 0x1030000);
        Share = object = new kJ0$b("Share", 43, 0x2000000);
        $VALUES = kJ0$b.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kJ0$b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.code = var3_2;
    }

    public static final /* synthetic */ int access$getCode$p(kJ0$b kJ0$b) {
        return kJ0$b.code;
    }

    public static kJ0$b valueOf(String string2) {
        return Enum.valueOf(kJ0$b.class, string2);
    }

    public static kJ0$b[] values() {
        return (kJ0$b[])$VALUES.clone();
    }

    public final kJ0$b getParent() {
        kJ0$b kJ0$b;
        int n3 = this.code;
        int n4 = n3 & 0xFF;
        if (n4 > 0) {
            kJ0$b$a kJ0$b$a = Companion;
            kJ0$b$a.getClass();
            kJ0$b = kJ0$b$a.a(n3 &= 0xFFFFFF00);
        } else {
            n4 = 0xFF00 & n3;
            if (n4 > 0) {
                kJ0$b$a kJ0$b$a = Companion;
                int n7 = -65536;
                kJ0$b$a.getClass();
                kJ0$b = kJ0$b$a.a(n3 &= n7);
            } else {
                n4 = 0xFF0000 & n3;
                if (n4 > 0) {
                    kJ0$b$a kJ0$b$a = Companion;
                    int n8 = -16777216;
                    kJ0$b$a.getClass();
                    kJ0$b = kJ0$b$a.a(n3 &= n8);
                } else {
                    Companion.getClass();
                    n3 = 0;
                    kJ0$b = kJ0$b$a.a(0);
                }
            }
        }
        return kJ0$b;
    }

    public final String toKey() {
        StringBuilder stringBuilder = new StringBuilder("FBSDKFeature");
        stringBuilder.append((Object)this);
        return stringBuilder.toString();
    }

    public String toString() {
        Object object = kJ0$b$b.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        switch (n4) {
            default: {
                object = "unknown";
                break;
            }
            case 43: {
                object = "ShareKit";
                break;
            }
            case 42: {
                object = "BypassAppSwitch";
                break;
            }
            case 41: {
                object = "IgnoreAppSwitchToLoggedOut";
                break;
            }
            case 40: {
                object = "ChromeCustomTabsPrefetching";
                break;
            }
            case 39: {
                object = "LoginKit";
                break;
            }
            case 38: {
                object = "ServiceUpdateCompliance";
                break;
            }
            case 37: {
                object = "GPSPACAProcessing";
                break;
            }
            case 36: {
                object = "GPSARATriggers";
                break;
            }
            case 35: {
                object = "Elora";
                break;
            }
            case 34: {
                object = "Megatron";
                break;
            }
            case 33: {
                object = "Monitoring";
                break;
            }
            case 32: {
                object = "AndroidIAPSubscriptionAutoLogging";
                break;
            }
            case 31: {
                object = "AndroidManualImplicitSubsDedupe";
                break;
            }
            case 30: {
                object = "AndroidManualImplicitPurchaseDedupe";
                break;
            }
            case 29: {
                object = "IAPLoggingLib5To7";
                break;
            }
            case 28: {
                object = "IAPLoggingLib2";
                break;
            }
            case 27: {
                object = "IAPLogging";
                break;
            }
            case 26: {
                object = "OnDevicePostInstallEventProcessing";
                break;
            }
            case 25: {
                object = "OnDeviceEventProcessing";
                break;
            }
            case 24: {
                object = "EventDeactivation";
                break;
            }
            case 23: {
                object = "ModelRequest";
                break;
            }
            case 22: {
                object = "FilterSensitiveParams";
                break;
            }
            case 21: {
                object = "FilterRedactedEvents";
                break;
            }
            case 20: {
                object = "BlocklistEvents";
                break;
            }
            case 19: {
                object = "MACARuleMatching";
                break;
            }
            case 18: {
                object = "BannedParamFiltering";
                break;
            }
            case 17: {
                object = "ProtectedMode";
                break;
            }
            case 16: {
                object = "StdParamEnforcement";
                break;
            }
            case 15: {
                object = "IntelligentIntegrity";
                break;
            }
            case 14: {
                object = "SuggestedEvents";
                break;
            }
            case 13: {
                object = "PrivacyProtection";
                break;
            }
            case 12: {
                object = "AppEventsCloudbridge";
                break;
            }
            case 11: {
                object = "AAM";
                break;
            }
            case 10: {
                object = "AnrReport";
                break;
            }
            case 9: {
                object = "ErrorReport";
                break;
            }
            case 8: {
                object = "ThreadCheck";
                break;
            }
            case 7: {
                object = "CrashShield";
                break;
            }
            case 6: {
                object = "CrashReport";
                break;
            }
            case 5: {
                object = "Instrument";
                break;
            }
            case 4: {
                object = "RestrictiveDataFiltering";
                break;
            }
            case 3: {
                object = "CodelessEvents";
                break;
            }
            case 2: {
                object = "AppEvents";
                break;
            }
            case 1: {
                object = "CoreKit";
            }
        }
        return object;
    }
}

