/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.zzai;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SplitInstallRequest$Builder {
    private final List zza;
    private final List zzb;

    private SplitInstallRequest$Builder() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
    }

    public /* synthetic */ SplitInstallRequest$Builder(zzai arrayList) {
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
    }

    public static /* bridge */ /* synthetic */ List zza(SplitInstallRequest$Builder splitInstallRequest$Builder) {
        return splitInstallRequest$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ List zzb(SplitInstallRequest$Builder splitInstallRequest$Builder) {
        return splitInstallRequest$Builder.zza;
    }

    public SplitInstallRequest$Builder addLanguage(Locale locale) {
        this.zzb.add(locale);
        return this;
    }

    public SplitInstallRequest$Builder addModule(String string2) {
        this.zza.add(string2);
        return this;
    }

    public SplitInstallRequest build() {
        SplitInstallRequest splitInstallRequest = new SplitInstallRequest(this, null);
        return splitInstallRequest;
    }
}

