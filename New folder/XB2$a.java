/*
 * Decompiled with CFR 0.152.
 */
public final class XB2$a
extends Enum {
    private static final /* synthetic */ XB2$a[] $VALUES;
    public static final /* enum */ XB2$a FCM;
    private final String ctProviderClassName;
    private final String messagingSDKClassName;
    private final String tokenPrefKey;
    private final String type;

    private static /* synthetic */ XB2$a[] $values() {
        XB2$a xB2$a = FCM;
        XB2$a[] xB2$aArray = new XB2$a[]{xB2$a};
        return xB2$aArray;
    }

    static {
        XB2$a xB2$a;
        FCM = xB2$a = new XB2$a("FCM", 0, "fcm", "fcm_token", "com.clevertap.android.sdk.pushnotification.fcm.FcmPushProvider", "com.google.firebase.messaging.FirebaseMessagingService");
        $VALUES = XB2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private XB2$a(String string3, String string4) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.type = string3;
        this.tokenPrefKey = string4;
        this.ctProviderClassName = var5_3;
        this.messagingSDKClassName = var6_4;
    }

    public static XB2$a valueOf(String string2) {
        return Enum.valueOf(XB2$a.class, string2);
    }

    public static XB2$a[] values() {
        return (XB2$a[])$VALUES.clone();
    }

    public String getCtProviderClassName() {
        return this.ctProviderClassName;
    }

    public String getMessagingSDKClassName() {
        return this.messagingSDKClassName;
    }

    public String getTokenPrefKey() {
        return this.tokenPrefKey;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(" [PushType:");
        String string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append("] ");
        return stringBuilder.toString();
    }
}

