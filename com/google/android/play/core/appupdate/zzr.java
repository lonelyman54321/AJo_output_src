/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.appupdate.zzl;
import com.google.android.play.core.appupdate.zzm;
import com.google.android.play.core.appupdate.zzn;
import com.google.android.play.core.appupdate.zzt;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

final class zzr {
    private static final com.google.android.play.core.appupdate.internal.zzm zzb;
    private static final Intent zzc;
    zzx zza;
    private final String zzd;
    private final Context zze;
    private final zzt zzf;

    static {
        com.google.android.play.core.appupdate.internal.zzm zzm2;
        zzb = zzm2 = new com.google.android.play.core.appupdate.internal.zzm("AppUpdateService");
        zzm2 = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE");
        zzc = zzm2.setPackage("com.android.vending");
    }

    public zzr(Context context, zzt object) {
        Object object2 = context.getPackageName();
        this.zzd = object2;
        this.zze = context;
        this.zzf = object;
        boolean bl2 = zzab.zza(context);
        if (bl2) {
            Context context2 = zzz.zza(context);
            com.google.android.play.core.appupdate.internal.zzm zzm2 = zzb;
            Intent intent = zzc;
            zzl zzl2 = zzl.zza;
            String string2 = "AppUpdateService";
            object2 = object;
            this.zza = object = new zzx(context2, zzm2, string2, intent, zzl2, null);
        }
    }

    public static /* bridge */ /* synthetic */ int zza(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzr object, String object2) {
        Bundle bundle = new Bundle();
        Object object3 = zzr.zzi();
        bundle.putAll(object3);
        object3 = "package.name";
        bundle.putString((String)object3, (String)object2);
        object2 = null;
        object3 = ((zzr)object).zze;
        object3 = object3.getPackageName();
        object = ((zzr)object).zze;
        object = object.getPackageManager();
        object = object.getPackageInfo((String)object3, 0);
        int n3 = ((PackageInfo)object).versionCode;
        try {
            object = n3;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = zzb;
            object2 = new Object[]{};
            object3 = "The current version of the app could not be retrieved";
            ((com.google.android.play.core.appupdate.internal.zzm)object).zzb((String)object3, object2);
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object2 = "app.version.code";
            n3 = (Integer)object;
            bundle.putInt((String)object2, n3);
        }
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle zzc() {
        return zzr.zzi();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ /* synthetic */ AppUpdateInfo zzf(zzr zzr2, Bundle bundle, String string2) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Bundle bundle2 = bundle;
        int n3 = -1;
        int n4 = bundle.getInt("version.code", n3);
        int n7 = bundle.getInt("update.availability");
        Object var7_8 = null;
        int n8 = bundle.getInt("install.status", 0);
        Object object = "client.version.staleness";
        int n10 = bundle.getInt((String)object, n3);
        if (n10 == n3) {
            boolean bl2 = false;
            object = null;
        } else {
            int n14 = bundle.getInt((String)object);
            object = n14;
        }
        String string3 = object;
        int n15 = bundle2.getInt("in.app.update.priority", 0);
        long l2 = bundle2.getLong("bytes.downloaded");
        long l3 = bundle2.getLong("total.bytes.to.download");
        long l4 = bundle2.getLong("additional.size.required");
        object = zzr2;
        long l7 = zzr2.zzf.zza();
        object = "blocking.intent";
        Parcelable parcelable3 = parcelable2 = bundle2.getParcelable((String)object);
        parcelable3 = (PendingIntent)parcelable2;
        String string4 = "nonblocking.intent";
        Parcelable parcelable4 = parcelable = bundle2.getParcelable(string4);
        parcelable4 = (PendingIntent)parcelable;
        String string5 = "blocking.destructive.intent";
        PendingIntent pendingIntent = (PendingIntent)bundle2.getParcelable(string5);
        String string6 = "nonblocking.destructive.intent";
        PendingIntent pendingIntent2 = (PendingIntent)bundle2.getParcelable(string6);
        HashMap<Object, HashSet> hashMap = new HashMap<Object, HashSet>();
        HashSet hashSet = zzr.zzk(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent"));
        hashMap.put(string5, hashSet);
        HashSet hashSet2 = zzr.zzk(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent"));
        hashMap.put(string6, hashSet2);
        HashSet hashSet3 = zzr.zzk(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent"));
        hashMap.put(object, hashSet3);
        HashSet hashSet4 = zzr.zzk(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent"));
        hashMap.put(string4, hashSet4);
        String string7 = string2;
        return AppUpdateInfo.zzb(string2, n4, n7, n8, (Integer)((Object)string3), n15, l2, l3, l4, l7, (PendingIntent)parcelable3, (PendingIntent)parcelable4, pendingIntent, pendingIntent2, hashMap);
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.appupdate.internal.zzm zzg() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzh(zzr zzr2) {
        return zzr2.zzd;
    }

    private static Bundle zzi() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Object object = zzi.zza("app_update");
        int n3 = (Integer)object.get("java");
        String string2 = "playcore_version_code";
        bundle2.putInt(string2, n3);
        Object object2 = "native";
        boolean bl2 = object.containsKey(object2);
        if (bl2) {
            object2 = (Integer)object.get(object2);
            n3 = (Integer)object2;
            string2 = "playcore_native_version";
            bundle2.putInt(string2, n3);
        }
        if (bl2 = object.containsKey(object2 = "unity")) {
            object = (Integer)object.get(object2);
            int n4 = (Integer)object;
            object2 = "playcore_unity_version";
            bundle2.putInt((String)object2, n4);
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static Task zzj() {
        Object object = zzb;
        int n3 = -9;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        ((com.google.android.play.core.appupdate.internal.zzm)object).zzb("onError(%d)", objectArray);
        object = new InstallException(n3);
        return Tasks.forException((Exception)object);
    }

    private static HashSet zzk(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final Task zzd(String string2) {
        Object object = this.zza;
        if (object == null) {
            return zzr.zzj();
        }
        object = zzb;
        Object object2 = new Object[]{string2};
        ((com.google.android.play.core.appupdate.internal.zzm)object).zzd("completeUpdate(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzn zzn2 = new zzn(this, (TaskCompletionSource)object, (TaskCompletionSource)object, string2);
        ((zzx)object2).zzs(zzn2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task zze(String string2) {
        Object object = this.zza;
        if (object == null) {
            return zzr.zzj();
        }
        object = zzb;
        Object object2 = new Object[]{string2};
        ((com.google.android.play.core.appupdate.internal.zzm)object).zzd("requestUpdateInfo(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.zza;
        zzm zzm2 = new zzm(this, (TaskCompletionSource)object, string2, (TaskCompletionSource)object);
        ((zzx)object2).zzs(zzm2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }
}

