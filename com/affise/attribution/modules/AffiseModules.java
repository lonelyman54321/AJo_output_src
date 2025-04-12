/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules;

import com.affise.attribution.modules.AffiseModules$Companion;

public final class AffiseModules
extends Enum {
    private static final /* synthetic */ AffiseModules[] $VALUES;
    public static final /* enum */ AffiseModules Advertising;
    public static final /* enum */ AffiseModules AndroidId;
    public static final AffiseModules$Companion Companion;
    public static final /* enum */ AffiseModules Huawei;
    public static final /* enum */ AffiseModules Link;
    public static final /* enum */ AffiseModules Network;
    public static final /* enum */ AffiseModules Phone;
    public static final /* enum */ AffiseModules RuStore;
    public static final /* enum */ AffiseModules Status;
    public static final /* enum */ AffiseModules Subscription;
    private final String module;

    private static final /* synthetic */ AffiseModules[] $values() {
        AffiseModules affiseModules = Advertising;
        affiseModules = AndroidId;
        affiseModules = Link;
        affiseModules = Network;
        affiseModules = Phone;
        affiseModules = Status;
        affiseModules = Subscription;
        affiseModules = RuStore;
        affiseModules = Huawei;
        AffiseModules[] affiseModulesArray = new AffiseModules[]{affiseModules, affiseModules, affiseModules, affiseModules, affiseModules, affiseModules, affiseModules, affiseModules, affiseModules};
        return affiseModulesArray;
    }

    static {
        Object object;
        Advertising = object = new AffiseModules("Advertising", 0, "com.affise.attribution.module.advertising.AdvertisingModule");
        AndroidId = object = new AffiseModules("AndroidId", 1, "com.affise.attribution.module.androidid.AndroidIdModule");
        Link = object = new AffiseModules("Link", 2, "com.affise.attribution.module.link.LinkModule");
        Network = object = new AffiseModules("Network", 3, "com.affise.attribution.module.network.NetworkModule");
        Phone = object = new AffiseModules("Phone", 4, "com.affise.attribution.module.phone.PhoneModule");
        Status = object = new AffiseModules("Status", 5, "com.affise.attribution.module.status.StatusModule");
        Subscription = object = new AffiseModules("Subscription", 6, "com.affise.attribution.module.subscription.SubscriptionModule");
        RuStore = object = new AffiseModules("RuStore", 7, "com.affise.attribution.module.rustore.RuStoreModule");
        Huawei = object = new AffiseModules("Huawei", 8, "com.affise.attribution.module.huawei.HuaweiModule");
        $VALUES = AffiseModules.$values();
        object = new AffiseModules$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AffiseModules() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.module = var3_2;
    }

    public static final AffiseModules from(String string2) {
        return Companion.from(string2);
    }

    public static AffiseModules valueOf(String string2) {
        return Enum.valueOf(AffiseModules.class, string2);
    }

    public static AffiseModules[] values() {
        return (AffiseModules[])$VALUES.clone();
    }

    public final String getModule() {
        return this.module;
    }
}

