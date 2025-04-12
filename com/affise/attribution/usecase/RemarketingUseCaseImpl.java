/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.affise.attribution.usecase;

import android.os.Build;
import com.affise.attribution.usecase.RemarketingUseCase;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class RemarketingUseCaseImpl
implements RemarketingUseCase {
    private final String build;
    private final String device;
    private final String osAndVersion;

    public RemarketingUseCaseImpl() {
        String string2;
        this.osAndVersion = string2 = this.osAndVersion();
        this.device = string2 = this.device();
        this.build = string2 = this.build();
    }

    private final String build() {
        StringBuilder stringBuilder = new StringBuilder("Build/");
        String string2 = Build.ID;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private final String device() {
        String string2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(string2, "MODEL");
        return string2;
    }

    private final String osAndVersion() {
        StringBuilder stringBuilder = new StringBuilder("Android ");
        String string2 = Build.VERSION.RELEASE;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String getBuild() {
        return this.build;
    }

    public String getDevice() {
        return this.device;
    }

    public String getOsAndVersion() {
        return this.osAndVersion;
    }

    public String locale() {
        String string2 = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "getDefault().toString()");
        return string2;
    }
}

