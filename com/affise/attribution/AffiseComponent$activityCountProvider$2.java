/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.session.CurrentActiveActivityCountProviderImpl;
import com.affise.attribution.utils.ActivityActionsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$activityCountProvider$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$activityCountProvider$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final CurrentActiveActivityCountProviderImpl invoke() {
        ActivityActionsManager activityActionsManager2 = AffiseComponent.access$getActivityActionsManager(this.this$0);
        CurrentActiveActivityCountProviderImpl currentActiveActivityCountProviderImpl = new CurrentActiveActivityCountProviderImpl(activityActionsManager2);
        return currentActiveActivityCountProviderImpl;
    }
}

