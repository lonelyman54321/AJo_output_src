/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.SplitInstallRequest$Builder;
import com.google.android.play.core.splitinstall.zzaj;
import java.util.ArrayList;
import java.util.List;

public class SplitInstallRequest {
    private final List zza;
    private final List zzb;

    public /* synthetic */ SplitInstallRequest(SplitInstallRequest$Builder object, zzaj arrayList) {
        List list = SplitInstallRequest$Builder.zzb((SplitInstallRequest$Builder)object);
        this.zza = arrayList = new ArrayList(list);
        object = SplitInstallRequest$Builder.zza((SplitInstallRequest$Builder)object);
        this.zzb = arrayList = new ArrayList(object);
    }

    public static SplitInstallRequest$Builder newBuilder() {
        SplitInstallRequest$Builder splitInstallRequest$Builder = new SplitInstallRequest$Builder(null);
        return splitInstallRequest$Builder;
    }

    public List getLanguages() {
        return this.zzb;
    }

    public List getModuleNames() {
        return this.zza;
    }

    public String toString() {
        List list = this.zza;
        List list2 = this.zzb;
        Object[] objectArray = new Object[]{list, list2};
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", objectArray);
    }
}

