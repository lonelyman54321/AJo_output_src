/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.logs.AffiseLogType;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AffiseLog {
    private final AffiseLogType name;
    private final String value;

    private AffiseLog(AffiseLogType affiseLogType, String string2) {
        this.name = affiseLogType;
        this.value = string2;
    }

    public /* synthetic */ AffiseLog(AffiseLogType affiseLogType, String string2, DefaultConstructorMarker defaultConstructorMarker) {
        this(affiseLogType, string2);
    }

    public final AffiseLogType getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }
}

