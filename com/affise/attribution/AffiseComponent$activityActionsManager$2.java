/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution;

import android.app.Application;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.utils.ActivityActionsManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$activityActionsManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseInitProperties $initProperties;
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$activityActionsManager$2(AffiseComponent affiseComponent, AffiseInitProperties affiseInitProperties) {
        this.this$0 = affiseComponent;
        this.$initProperties = affiseInitProperties;
        super(0);
    }

    public final ActivityActionsManagerImpl invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        AffiseInitProperties affiseInitProperties = this.$initProperties;
        ActivityActionsManagerImpl activityActionsManagerImpl = new ActivityActionsManagerImpl(application, logsManager2, affiseInitProperties);
        return activityActionsManagerImpl;
    }
}

