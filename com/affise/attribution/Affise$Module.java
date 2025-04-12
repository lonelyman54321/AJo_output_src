/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.Affise;
import com.affise.attribution.modules.AffiseModuleApi;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.OnKeyValueCallback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Affise$Module {
    public static final Affise$Module INSTANCE;

    static {
        Affise$Module affise$Module;
        INSTANCE = affise$Module = new Affise$Module();
    }

    private Affise$Module() {
    }

    public static final List getModulesInstalled() {
        Object object = Affise.access$getApi$p();
        if (object == null || (object = object.getModuleManager()) == null || (object = ((AffiseModuleManager)object).getModules()) == null) {
            object = mz0_2.a;
        }
        return object;
    }

    public static final void getStatus(AffiseModules affiseModules, OnKeyValueCallback onKeyValueCallback) {
        Intrinsics.checkNotNullParameter((Object)affiseModules, "module");
        Intrinsics.checkNotNullParameter(onKeyValueCallback, "onComplete");
        Object object = Affise.access$getApi$p();
        if (object != null && (object = object.getModuleManager()) != null) {
            ((AffiseModuleManager)object).status(affiseModules, onKeyValueCallback);
        }
    }

    public static final boolean moduleStart(AffiseModules affiseModules) {
        boolean bl2;
        Intrinsics.checkNotNullParameter((Object)affiseModules, "module");
        Object object = Affise.access$getApi$p();
        if (object != null && (object = object.getModuleManager()) != null) {
            bl2 = ((AffiseModuleManager)object).manualStart(affiseModules);
        } else {
            bl2 = false;
            affiseModules = null;
        }
        return bl2;
    }

    public final AffiseModuleApi api$attribution_release(AffiseModules object) {
        Intrinsics.checkNotNullParameter(object, "module");
        Object object2 = Affise.access$getApi$p();
        object = object2 != null && (object2 = object2.getModuleManager()) != null ? ((AffiseModuleManager)object2).api((AffiseModules)((Object)object)) : null;
        return object;
    }
}

