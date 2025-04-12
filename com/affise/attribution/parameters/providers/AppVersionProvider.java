/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.parameters.providers;

import android.content.Context;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AppVersionProvider
extends StringPropertyProvider {
    private final Context context;
    private final ProviderType key;
    private final LogsManager logsManager;
    private final float order;

    public AppVersionProvider(Context object, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.context = object;
        this.logsManager = logsManager2;
        this.order = 3.0f;
        object = ProviderType.APP_VERSION;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        String string2;
        block7: {
            string2 = null;
            Context context = this.context;
            context = context.getPackageManager();
            Object object = this.context;
            object = object.getPackageName();
            context = context.getPackageInfo((String)object, 0);
            if (context == null) break block7;
            try {
                string2 = context.versionName;
            }
            catch (Exception exception) {
                object = this.logsManager;
                object.addDeviceError(exception);
            }
        }
        return string2;
    }
}

