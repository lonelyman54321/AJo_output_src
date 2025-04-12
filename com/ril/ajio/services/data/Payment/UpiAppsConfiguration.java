/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.PlatformData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class UpiAppsConfiguration
implements Serializable {
    private final PlatformData android;
    private final PlatformData ios;
    private final PlatformData msite;

    public UpiAppsConfiguration(PlatformData platformData, PlatformData platformData2, PlatformData platformData3) {
        Intrinsics.checkNotNullParameter(platformData, "android");
        Intrinsics.checkNotNullParameter(platformData2, "ios");
        Intrinsics.checkNotNullParameter(platformData3, "msite");
        this.android = platformData;
        this.ios = platformData2;
        this.msite = platformData3;
    }

    public static /* synthetic */ UpiAppsConfiguration copy$default(UpiAppsConfiguration upiAppsConfiguration, PlatformData platformData, PlatformData platformData2, PlatformData platformData3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            platformData = upiAppsConfiguration.android;
        }
        if ((n4 = n3 & 2) != 0) {
            platformData2 = upiAppsConfiguration.ios;
        }
        if ((n3 &= 4) != 0) {
            platformData3 = upiAppsConfiguration.msite;
        }
        return upiAppsConfiguration.copy(platformData, platformData2, platformData3);
    }

    public final PlatformData component1() {
        return this.android;
    }

    public final PlatformData component2() {
        return this.ios;
    }

    public final PlatformData component3() {
        return this.msite;
    }

    public final UpiAppsConfiguration copy(PlatformData platformData, PlatformData platformData2, PlatformData platformData3) {
        Intrinsics.checkNotNullParameter(platformData, "android");
        Intrinsics.checkNotNullParameter(platformData2, "ios");
        Intrinsics.checkNotNullParameter(platformData3, "msite");
        UpiAppsConfiguration upiAppsConfiguration = new UpiAppsConfiguration(platformData, platformData2, platformData3);
        return upiAppsConfiguration;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpiAppsConfiguration;
        if (!bl3) {
            return false;
        }
        object = (UpiAppsConfiguration)object;
        PlatformData platformData = this.android;
        PlatformData platformData2 = ((UpiAppsConfiguration)object).android;
        bl3 = Intrinsics.areEqual(platformData, platformData2);
        if (!bl3) {
            return false;
        }
        platformData = this.ios;
        platformData2 = ((UpiAppsConfiguration)object).ios;
        bl3 = Intrinsics.areEqual(platformData, platformData2);
        if (!bl3) {
            return false;
        }
        platformData = this.msite;
        object = ((UpiAppsConfiguration)object).msite;
        boolean bl4 = Intrinsics.areEqual(platformData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final PlatformData getAndroid() {
        return this.android;
    }

    public final PlatformData getIos() {
        return this.ios;
    }

    public final PlatformData getMsite() {
        return this.msite;
    }

    public int hashCode() {
        int n3 = this.android.hashCode() * 31;
        int n4 = (this.ios.hashCode() + n3) * 31;
        return this.msite.hashCode() + n4;
    }

    public String toString() {
        PlatformData platformData = this.android;
        PlatformData platformData2 = this.ios;
        PlatformData platformData3 = this.msite;
        StringBuilder stringBuilder = new StringBuilder("UpiAppsConfiguration(android=");
        stringBuilder.append(platformData);
        stringBuilder.append(", ios=");
        stringBuilder.append(platformData2);
        stringBuilder.append(", msite=");
        stringBuilder.append(platformData3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

