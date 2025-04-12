/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.pm.InstallSourceInfo
 *  android.content.pm.PackageManager
 *  android.os.Build$VERSION
 */
package com.affise.attribution.usecase;

import android.app.Application;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.usecase.StoreUseCase;
import com.affise.attribution.usecase.StoreUseCaseImpl$Companion;
import com.affise.attribution.utils.SystemAppChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class StoreUseCaseImpl
implements StoreUseCase {
    public static final StoreUseCaseImpl$Companion Companion;
    private static final String PACKAGE_AMAZON = "com.amazon.venezia";
    private static final String PACKAGE_GOOGLE = "com.android.vending";
    private static final String PACKAGE_HUAWEI = "com.huawei.appmarket";
    private static final String PACKAGE_RUSTORE = "ru.vk.store";
    private static final String PREINSTALL_NAME = "affise_part_param_name";
    private final Application app;
    private final rq1_2 installerName$delegate;
    private final LogsManager logsManager;
    private final SystemAppChecker systemAppChecker;

    static {
        StoreUseCaseImpl$Companion storeUseCaseImpl$Companion;
        Companion = storeUseCaseImpl$Companion = new StoreUseCaseImpl$Companion(null);
    }

    public StoreUseCaseImpl(Application object, LogsManager logsManager2, SystemAppChecker systemAppChecker) {
        Intrinsics.checkNotNullParameter(object, "app");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(systemAppChecker, "systemAppChecker");
        this.app = object;
        this.logsManager = logsManager2;
        this.systemAppChecker = systemAppChecker;
        super(this);
        object = yr1_2.b((Function0)object);
        this.installerName$delegate = object;
    }

    public static final /* synthetic */ String access$getInitiatingPackageName(StoreUseCaseImpl storeUseCaseImpl) {
        return storeUseCaseImpl.getInitiatingPackageName();
    }

    public static final /* synthetic */ SystemAppChecker access$getSystemAppChecker$p(StoreUseCaseImpl storeUseCaseImpl) {
        return storeUseCaseImpl.systemAppChecker;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String getInitiatingPackageName() {
        Throwable throwable2;
        block3: {
            Object object;
            try {
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 30;
                if (n3 >= n4) {
                    object = this.app;
                    object = object.getPackageManager();
                    Object object2 = this.app;
                    object2 = object2.getPackageName();
                    object = md3.a((PackageManager)object, (String)object2);
                    return nd3.a((InstallSourceInfo)object);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object = this.app;
            object = object.getPackageManager();
            Object object3 = this.app;
            object3 = object3.getPackageName();
            return object.getInstallerPackageName((String)object3);
        }
        LogsManager logsManager2 = this.logsManager;
        logsManager2.addDeviceError(throwable2);
        return null;
    }

    private final String getInstallerName() {
        return (String)this.installerName$delegate.getValue();
    }

    public String getStore() {
        return this.getInstallerName();
    }
}

