/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.webBridge.WebBridgeManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$webBridgeManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$webBridgeManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final WebBridgeManager invoke() {
        StoreEventUseCase storeEventUseCase2 = this.this$0.getStoreEventUseCase();
        AffiseModuleManager affiseModuleManager = this.this$0.getModuleManager();
        WebBridgeManager webBridgeManager2 = new WebBridgeManager(storeEventUseCase2, affiseModuleManager);
        return webBridgeManager2;
    }
}

