/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Build$VERSION
 */
package com.affise.attribution.parameters.providers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AppVersionRawProvider
extends StringPropertyProvider {
    private final Context context;
    private final ProviderType key;
    private final LogsManager logsManager;
    private final float order;

    public AppVersionRawProvider(Context object, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.context = object;
        this.logsManager = logsManager2;
        this.order = 4.0f;
        object = ProviderType.APP_VERSION_RAW;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String provide() {
        Exception exception2;
        String string2;
        block3: {
            Object object;
            block2: {
                string2 = null;
                try {
                    object = this.context;
                    object = object.getPackageManager();
                    Object object2 = this.context;
                    object2 = object2.getPackageName();
                    int n3 = 0;
                    object = object.getPackageInfo((String)object2, 0);
                    if (object == null) return string2;
                    int n4 = Build.VERSION.SDK_INT;
                    n3 = 28;
                    if (n4 < n3) break block2;
                    long l2 = ep.a((PackageInfo)object);
                    object = l2;
                    return object.toString();
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            int n7 = ((PackageInfo)object).versionCode;
            object = n7;
            return object.toString();
        }
        LogsManager logsManager2 = this.logsManager;
        logsManager2.addDeviceError(exception2);
        return string2;
    }
}

