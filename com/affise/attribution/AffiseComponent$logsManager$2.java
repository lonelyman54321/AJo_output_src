/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.logs.LogsManagerImpl;
import com.affise.attribution.logs.StoreLogsUseCase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$logsManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$logsManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final LogsManagerImpl invoke() {
        StoreLogsUseCase storeLogsUseCase2 = AffiseComponent.access$getStoreLogsUseCase(this.this$0);
        LogsManagerImpl logsManagerImpl = new LogsManagerImpl(storeLogsUseCase2);
        return logsManagerImpl;
    }
}

