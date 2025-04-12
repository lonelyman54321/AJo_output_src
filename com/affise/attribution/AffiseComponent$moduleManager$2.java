/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution;

import android.app.Application;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$moduleManager$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$moduleManager$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final AffiseModuleManager invoke() {
        Application application = AffiseComponent.access$getApp$p(this.this$0);
        LogsManager logsManager2 = this.this$0.getLogsManager();
        PostBackModelFactory postBackModelFactory2 = this.this$0.getPostBackModelFactory();
        AffiseModuleManager affiseModuleManager = new AffiseModuleManager(application, logsManager2, postBackModelFactory2);
        return affiseModuleManager;
    }
}

