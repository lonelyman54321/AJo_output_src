/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.usecase.StoreUseCaseImpl;
import com.affise.attribution.utils.SystemAppChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class StoreUseCaseImpl$installerName$2
extends Lambda
implements Function0 {
    final /* synthetic */ StoreUseCaseImpl this$0;

    public StoreUseCaseImpl$installerName$2(StoreUseCaseImpl storeUseCaseImpl) {
        this.this$0 = storeUseCaseImpl;
        super(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String invoke() {
        int n3;
        Object object = StoreUseCaseImpl.access$getSystemAppChecker$p(this.this$0).getSystemProperty("affise_part_param_name");
        Object object2 = "Preinstall";
        if (object != null) {
            n3 = object.length();
            if (n3 != 0) return object2;
        }
        if ((n3 = (int)(((SystemAppChecker)(object = StoreUseCaseImpl.access$getSystemAppChecker$p(this.this$0))).isPreinstallApp() ? 1 : 0)) != 0) return object2;
        object = StoreUseCaseImpl.access$getInitiatingPackageName(this.this$0);
        if (object == null) return "Apk";
        int n4 = ((String)object).hashCode();
        switch (n4) {
            default: {
                return "Apk";
            }
            case -356280397: {
                object2 = "ru.vk.store";
                n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                if (n3 != 0) return "RuStore";
                return "Apk";
            }
            case -1046965711: {
                object2 = "com.android.vending";
                n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                if (n3 != 0) return "GooglePlay";
                return "Apk";
            }
            case -1637701853: {
                object2 = "com.huawei.appmarket";
                n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                if (n3 != 0) return "AppGallery";
                return "Apk";
            }
            case -1859733809: {
                object2 = "com.amazon.venezia";
                n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                if (n3 != 0) return "Amazon";
                return "Apk";
            }
        }
    }
}

