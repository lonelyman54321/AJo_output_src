/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.data;

public final class SdkInfo {
    private final boolean sdkDebuggable;
    private final String sdkName;
    private final String sdkVersion;
    private final boolean usesLocalAssets;

    public SdkInfo(String string2, String string3, boolean bl2, boolean bl3) {
        this.sdkName = string2;
        this.sdkVersion = string3;
        this.sdkDebuggable = bl2;
        this.usesLocalAssets = bl3;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isSdkDebuggable() {
        return this.sdkDebuggable;
    }

    public boolean usesLocalAssets() {
        return this.usesLocalAssets;
    }
}

