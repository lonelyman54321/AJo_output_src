/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLogType;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseLog$DevicedataLog
extends AffiseLog {
    public AffiseLog$DevicedataLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        AffiseLogType affiseLogType = AffiseLogType.DEVICEDATA;
        super(affiseLogType, string2, null);
    }
}

