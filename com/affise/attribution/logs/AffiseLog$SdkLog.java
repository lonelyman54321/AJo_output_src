/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLogType;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseLog$SdkLog
extends AffiseLog {
    public AffiseLog$SdkLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        AffiseLogType affiseLogType = AffiseLogType.SDKLOG;
        super(affiseLogType, string2, null);
    }
}

