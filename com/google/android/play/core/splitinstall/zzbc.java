/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbu;
import com.google.android.play.core.splitinstall.internal.zzn;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import com.google.android.play.core.splitinstall.zzak;
import com.google.android.play.core.splitinstall.zzal;
import com.google.android.play.core.splitinstall.zzam;
import com.google.android.play.core.splitinstall.zzan;
import com.google.android.play.core.splitinstall.zzao;
import com.google.android.play.core.splitinstall.zzap;
import com.google.android.play.core.splitinstall.zzaq;
import com.google.android.play.core.splitinstall.zzar;
import com.google.android.play.core.splitinstall.zzas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class zzbc {
    private static final zzu zzb;
    private static final Intent zzc;
    zzaf zza;
    private final String zzd;

    static {
        zzu zzu2;
        zzb = zzu2 = new zzu("SplitInstallService");
        zzu2 = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE");
        zzc = zzu2.setPackage("com.android.vending");
    }

    public zzbc(Context context, String object) {
        this.zzd = object;
        boolean bl2 = zzbu.zza(context);
        if (bl2) {
            Context context2 = zzbr.zza(context);
            zzu zzu2 = zzb;
            Intent intent = zzc;
            zzak zzak2 = zzak.zza;
            String string2 = "SplitInstallService";
            this.zza = object = new zzaf(context2, zzu2, string2, intent, zzak2, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle zza() {
        return zzbc.zzo();
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzn object) {
        Bundle bundle = zzbc.zzo();
        object = ((zzn)object).zza();
        ArrayList arrayList = new ArrayList(object);
        bundle.putParcelableArrayList("event_timestamps", arrayList);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ zzu zzk() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzl(zzbc zzbc2) {
        return zzbc2.zzd;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzm(Collection object) {
        int n3 = object.size();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)object.next();
            Bundle bundle = new Bundle();
            String string3 = "language";
            bundle.putString(string3, string2);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzn(Collection object) {
        int n3 = object.size();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)object.next();
            Bundle bundle = new Bundle();
            String string3 = "module_name";
            bundle.putString(string3, string2);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static Bundle zzo() {
        return dk0.a(11004, "playcore_version_code");
    }

    private static Task zzp() {
        Object object = zzb;
        int n3 = -14;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        ((zzu)object).zzb("onError(%d)", objectArray);
        object = new SplitInstallException(n3);
        return Tasks.forException((Exception)object);
    }

    public final Task zzc(int n3) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = n3;
        Object object3 = new Object[]{object2};
        ((zzu)object).zzd("cancelInstall(%d)", object3);
        object = new TaskCompletionSource();
        object2 = this.zza;
        object3 = new zzas(this, (TaskCompletionSource)object, n3, (TaskCompletionSource)object);
        ((zzaf)object2).zzs((zzv)object3, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzd(List list) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{list};
        ((zzu)object).zzd("deferredInstall(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzan zzan2 = new zzan(this, (TaskCompletionSource)object, list, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzan2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zze(List list) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{list};
        ((zzu)object).zzd("deferredLanguageInstall(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzao zzao2 = new zzao(this, (TaskCompletionSource)object, list, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzao2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzf(List list) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{list};
        ((zzu)object).zzd("deferredLanguageUninstall(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzap zzap2 = new zzap(this, (TaskCompletionSource)object, list, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzap2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzg(List list) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{list};
        ((zzu)object).zzd("deferredUninstall(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzam zzam2 = new zzam(this, (TaskCompletionSource)object, list, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzam2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzh(int n3) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = n3;
        Object object3 = new Object[]{object2};
        ((zzu)object).zzd("getSessionState(%d)", object3);
        object = new TaskCompletionSource();
        object2 = this.zza;
        object3 = new zzaq(this, (TaskCompletionSource)object, n3, (TaskCompletionSource)object);
        ((zzaf)object2).zzs((zzv)object3, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzi() {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{};
        ((zzu)object).zzd("getSessionStates", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzar zzar2 = new zzar(this, (TaskCompletionSource)object, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzar2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zzj(Collection collection, Collection collection2, zzn zzn2) {
        Object object = this.zza;
        if (object == null) {
            return zzbc.zzp();
        }
        object = zzb;
        Object object2 = new Object[]{collection, collection2};
        ((zzu)object).zzd("startInstall(%s,%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzal zzal2 = new zzal(this, (TaskCompletionSource)object, collection, collection2, zzn2, (TaskCompletionSource)object);
        ((zzaf)object2).zzs(zzal2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }
}

