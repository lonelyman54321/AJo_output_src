/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution.modules;

import android.app.Application;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.AffiseKeyValue;
import com.affise.attribution.modules.OnKeyValueCallback;
import com.affise.attribution.parameters.base.Provider;
import com.affise.attribution.parameters.base.ProviderExKt;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public abstract class AffiseModule {
    private Application application;
    private List baseProviders;
    private List dependencies;
    private final boolean isManual;
    private LogsManager logsManager;

    public final void dependencies(Application application, LogsManager logsManager2, List list, List list2) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(list, "dependencies");
        Intrinsics.checkNotNullParameter(list2, "providers");
        this.dependencies = list;
        this.logsManager = logsManager2;
        this.application = application;
        this.baseProviders = list2;
    }

    public final /* synthetic */ Object get() {
        Object object = this.getDependencies();
        Object var2_2 = null;
        String string2 = "T";
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                Object e2 = object.next();
                Intrinsics.reifiedOperationMarker(3, string2);
                boolean bl3 = e2 instanceof Object;
                if (!bl3) continue;
                var2_2 = e2;
                break;
            }
        }
        Intrinsics.reifiedOperationMarker(2, string2);
        return var2_2;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final List getBaseProviders() {
        return this.baseProviders;
    }

    public final List getDependencies() {
        return this.dependencies;
    }

    public final LogsManager getLogsManager() {
        return this.logsManager;
    }

    public final /* synthetic */ Provider getProvider() {
        Object object = this.getBaseProviders();
        Provider provider = null;
        String string2 = "T";
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                Object e2;
                Object object2 = e2 = object.next();
                object2 = (Provider)e2;
                int n3 = 3;
                Intrinsics.reifiedOperationMarker(n3, string2);
                boolean bl3 = object2 instanceof Provider;
                if (!bl3) continue;
                provider = e2;
                break;
            }
            provider = provider;
        }
        Intrinsics.reifiedOperationMarker(2, string2);
        return provider;
    }

    public final List getProviders(List list) {
        Intrinsics.checkNotNullParameter(list, "types");
        List list2 = this.baseProviders;
        if (list2 == null || (list = ProviderExKt.getProviders(list2, list)) == null) {
            list = mz0_2.a;
        }
        return list;
    }

    public final List getRequestProviders() {
        List list = this.baseProviders;
        if (list == null || (list = ProviderExKt.getRequestProviders(list)) == null) {
            list = mz0_2.a;
        }
        return list;
    }

    public abstract String getVersion();

    public boolean isManual() {
        return this.isManual;
    }

    public List providers() {
        return mz0_2.a;
    }

    public abstract void start();

    public void status(OnKeyValueCallback onKeyValueCallback) {
        Intrinsics.checkNotNullParameter(onKeyValueCallback, "onComplete");
        Object object = new AffiseKeyValue("state", "enabled");
        object = a.b(object);
        onKeyValueCallback.handle((List)object);
    }
}

