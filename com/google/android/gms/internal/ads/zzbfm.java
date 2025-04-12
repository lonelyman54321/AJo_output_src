/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzhlh;
import com.google.android.gms.internal.ads.zzhli;

public final class zzbfm {
    private bg0 zza;
    private Wf0 zzb;
    private ag0 zzc;
    private zzbfl zzd;

    public static boolean zzg(Context object) {
        Object object2 = object.getPackageManager();
        if (object2 != null) {
            Object object3 = Uri.parse((String)"http://www.example.com");
            Intent intent = new Intent("android.intent.action.VIEW", object3);
            ResolveInfo resolveInfo = object2.resolveActivity(intent, 0);
            int n3 = 65536;
            if ((object2 = object2.queryIntentActivities(intent, n3)) != null && resolveInfo != null) {
                intent = null;
                for (int i3 = 0; i3 < (n3 = object2.size()); ++i3) {
                    object3 = (ResolveInfo)object2.get(i3);
                    String string2 = resolveInfo.activityInfo.name;
                    object3 = object3.activityInfo.name;
                    n3 = (int)(string2.equals(object3) ? 1 : 0);
                    if (n3 == 0) continue;
                    object2 = resolveInfo.activityInfo.packageName;
                    object = zzhlh.zza(object);
                    return ((String)object2).equals(object);
                }
            }
        }
        return false;
    }

    public final bg0 zza() {
        Object object = this.zzb;
        if (object == null) {
            this.zza = null;
        } else {
            bg0 bg02 = this.zza;
            if (bg02 == null) {
                this.zza = object = ((Wf0)object).b(null);
            }
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        Object object = this.zzb;
        if (object == null && (object = zzhlh.zza((Context)activity)) != null) {
            zzhli zzhli2 = new zzhli(this);
            this.zzc = zzhli2;
            Wf0.a((Context)activity, (String)object, zzhli2);
        }
    }

    public final void zzc(Wf0 object) {
        long l2;
        this.zzb = object;
        object.getClass();
        try {
            object = ((Wf0)object).a;
            l2 = 0L;
        }
        catch (RemoteException remoteException) {}
        object.warmup(l2);
        object = this.zzd;
        if (object != null) {
            object.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbfl zzbfl2) {
        this.zzd = zzbfl2;
    }

    public final void zzf(Activity activity) {
        ag0 ag02 = this.zzc;
        if (ag02 == null) {
            return;
        }
        activity.unbindService((ServiceConnection)ag02);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}

