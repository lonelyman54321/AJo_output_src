/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.utils.ActivityActionsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$deeplinkManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$deeplinkManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final DeeplinkManagerImpl invoke() {
        InitPropertiesStorage initPropertiesStorage = this.this$0.getInitPropertiesStorage();
        DeeplinkClickRepository deeplinkClickRepository = AffiseComponent.access$isDeeplinkClickRepository$p(this.this$0);
        ActivityActionsManager activityActionsManager2 = AffiseComponent.access$getActivityActionsManager(this.this$0);
        DeeplinkManagerImpl deeplinkManagerImpl = new DeeplinkManagerImpl(initPropertiesStorage, deeplinkClickRepository, activityActionsManager2);
        return deeplinkManagerImpl;
    }
}

