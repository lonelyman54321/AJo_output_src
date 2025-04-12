/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

public final class ApplicationManager$StateKey
extends Enum {
    private static final /* synthetic */ ApplicationManager$StateKey[] $VALUES;
    public static final /* enum */ ApplicationManager$StateKey SAVED_PACKAGE_UPDATE;
    public static final /* enum */ ApplicationManager$StateKey SAVED_RESOURCE_UPDATE;

    private static final /* synthetic */ ApplicationManager$StateKey[] $values() {
        ApplicationManager$StateKey applicationManager$StateKey = SAVED_PACKAGE_UPDATE;
        applicationManager$StateKey = SAVED_RESOURCE_UPDATE;
        ApplicationManager$StateKey[] applicationManager$StateKeyArray = new ApplicationManager$StateKey[]{applicationManager$StateKey, applicationManager$StateKey};
        return applicationManager$StateKeyArray;
    }

    static {
        ApplicationManager$StateKey applicationManager$StateKey;
        SAVED_PACKAGE_UPDATE = applicationManager$StateKey = new ApplicationManager$StateKey("SAVED_PACKAGE_UPDATE", 0);
        SAVED_RESOURCE_UPDATE = applicationManager$StateKey = new ApplicationManager$StateKey("SAVED_RESOURCE_UPDATE", 1);
        $VALUES = ApplicationManager$StateKey.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ApplicationManager$StateKey() {
        void var2_-1;
        void var1_-1;
    }

    public static ApplicationManager$StateKey valueOf(String string2) {
        return Enum.valueOf(ApplicationManager$StateKey.class, string2);
    }

    public static ApplicationManager$StateKey[] values() {
        return (ApplicationManager$StateKey[])$VALUES.clone();
    }
}

