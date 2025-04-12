/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$ComponentInfoFlags
 *  android.content.pm.ProviderInfo
 *  android.os.Build$VERSION
 *  com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit$PkgVerifyBuilder
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1wSDK;
import com.appsflyer.internal.F;
import com.appsflyer.internal.G;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1ySDK
implements AFj1wSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ProviderInfo C_(Context object) {
        Throwable throwable;
        Throwable throwable22;
        block4: {
            String string2;
            int n3;
            try {
                n3 = Build.VERSION.SDK_INT;
                string2 = "com.huawei.appmarket.commondata";
                int n4 = 33;
                if (n3 >= n4) {
                    object = object.getPackageManager();
                    PackageManager.ComponentInfoFlags componentInfoFlags = F.a();
                    return G.a((PackageManager)object, componentInfoFlags);
                }
            }
            catch (Throwable throwable22) {
                throwable = throwable22;
                break block4;
            }
            object = object.getPackageManager();
            n3 = 0;
            Object var4_7 = null;
            return object.resolveContentProvider(string2, 0);
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
        object = throwable22.getMessage();
        if (object == null) {
            object = "";
        }
        int n7 = 96;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, (String)object, throwable, false, false, false, false, n7, null);
        return null;
    }

    public final boolean getCurrencyIso4217Code(Context context) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(context, string2);
        context = AFj1ySDK.C_(context);
        return context != null;
    }

    public final boolean getRevenue(Context object) {
        Object object2;
        String string2 = "com.huawei.appmarket";
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Object object3 = AFj1ySDK.C_(object);
        if (object3 == null) {
            return false;
        }
        try {
            object2 = new ServiceVerifyKit.PkgVerifyBuilder(object);
            object = object3.packageName;
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
            String string4 = throwable.getMessage();
            String string5 = string4 == null ? string3 : string4;
            AFh1uSDK.e$default((AFh1uSDK)object2, aFh1vSDK, string5, throwable2, false, false, false, false, 96, null);
            return false;
        }
        object = object2.setPackageName((String)object);
        object3 = "com.huawei.appgallery.sign_certchain";
        object = object.setCertChainKey((String)object3);
        object3 = "com.huawei.appgallery.fingerprint_signature";
        object = object.setCertSignerKey((String)object3);
        object3 = "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212";
        object = object.addLegacyInfo(string2, (String)object3);
        object3 = "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F";
        object = object.addLegacyInfo(string2, (String)object3);
        return object.isValidPkg();
    }
}

