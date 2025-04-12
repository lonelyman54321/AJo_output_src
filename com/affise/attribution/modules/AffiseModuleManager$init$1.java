/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution.modules;

import android.app.Application;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.AffiseModule;
import com.affise.attribution.modules.AffiseModuleManager;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AffiseModuleManager$init$1
extends Lambda
implements Function1 {
    final /* synthetic */ List $dependencies;
    final /* synthetic */ AffiseModuleManager this$0;

    public AffiseModuleManager$init$1(AffiseModuleManager affiseModuleManager, List list) {
        this.this$0 = affiseModuleManager;
        this.$dependencies = list;
        super(1);
    }

    public final void invoke(AffiseModule affiseModule) {
        Intrinsics.checkNotNullParameter(affiseModule, "module");
        Object object = AffiseModuleManager.access$getApplication$p(this.this$0);
        LogsManager logsManager2 = AffiseModuleManager.access$getLogsManager$p(this.this$0);
        List list = this.$dependencies;
        List list2 = AffiseModuleManager.access$getPostBackModelFactory$p(this.this$0).getProviders();
        affiseModule.dependencies((Application)object, logsManager2, list, list2);
        boolean bl2 = affiseModule.isManual();
        if (!bl2) {
            object = this.this$0;
            AffiseModuleManager.access$moduleStart((AffiseModuleManager)object, affiseModule);
        }
    }
}

