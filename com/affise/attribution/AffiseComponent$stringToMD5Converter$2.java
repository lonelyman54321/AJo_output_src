/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.StringToMD5Converter;
import com.affise.attribution.logs.LogsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$stringToMD5Converter$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$stringToMD5Converter$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final StringToMD5Converter invoke() {
        LogsManager logsManager2 = this.this$0.getLogsManager();
        StringToMD5Converter stringToMD5Converter2 = new StringToMD5Converter(logsManager2);
        return stringToMD5Converter2;
    }
}

