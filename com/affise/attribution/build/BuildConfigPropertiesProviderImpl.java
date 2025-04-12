/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.affise.attribution.build;

import android.os.Build;
import com.affise.attribution.build.BuildConfigPropertiesProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class BuildConfigPropertiesProviderImpl
implements BuildConfigPropertiesProvider {
    public String getCodeName() {
        return Build.VERSION.CODENAME.toString();
    }

    public String getHardware() {
        return Build.HARDWARE.toString();
    }

    public String getManufacturer() {
        return Build.MANUFACTURER.toString();
    }

    public String getReleaseName() {
        return Build.VERSION.RELEASE.toString();
    }

    public int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public List getSupportedABIs() {
        Object[] objectArray = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(objectArray, "SUPPORTED_ABIS");
        return CollectionsKt.k0(tp_2.y(objectArray));
    }
}

