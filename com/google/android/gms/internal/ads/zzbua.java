/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.provider.CalendarContract$Events
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzchd;
import java.util.Map;

public final class zzbua
extends zzbuj {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbua(zzchd object, Map map2) {
        super((zzchd)object, "createCalendarEvent");
        long l2;
        this.zza = map2;
        object = object.zzi();
        this.zzb = object;
        this.zzc = object = this.zze("description");
        this.zzf = object = this.zze("summary");
        this.zzd = l2 = this.zzd("start_ticks");
        this.zze = l2 = this.zzd("end_ticks");
        this.zzg = object = this.zze("location");
    }

    public static /* bridge */ /* synthetic */ Context zza(zzbua zzbua2) {
        return zzbua2.zzb;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final long zzd(String string2) {
        Map map2 = this.zza;
        string2 = (String)map2.get(string2);
        long l2 = -1;
        if (string2 == null) {
            return l2;
        }
        try {
            return Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    private final String zze(String string2) {
        Object object = (CharSequence)this.zza.get(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            string2 = "";
        } else {
            object = this.zza;
            string2 = (String)object.get(string2);
        }
        return string2;
    }

    public final Intent zzb() {
        long l2;
        Intent intent = new Intent("android.intent.action.EDIT");
        Object object = CalendarContract.Events.CONTENT_URI;
        intent = intent.setData(object);
        String string2 = this.zzc;
        intent.putExtra("title", string2);
        string2 = this.zzg;
        intent.putExtra("eventLocation", string2);
        object = "description";
        string2 = this.zzf;
        intent.putExtra((String)object, string2);
        long l3 = this.zzd;
        long l4 = -1;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            String string3 = "beginTime";
            intent.putExtra(string3, l3);
        }
        if ((l7 = (l2 = (l3 = this.zze) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            String string4 = "endTime";
            intent.putExtra(string4, l3);
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    public final void zzc() {
        Object object;
        int n3;
        Context context = this.zzb;
        if (context == null) {
            this.zzh("Activity context is not available.");
            return;
        }
        zzu.zzp();
        context = this.zzb;
        Object object2 = new zzbdx(context);
        boolean bl2 = ((zzbdx)object2).zzb();
        if (!bl2) {
            this.zzh("This feature is not available on the device.");
            return;
        }
        zzu.zzp();
        context = zzt.zzK(this.zzb);
        object2 = zzu.zzo().zze();
        if (object2 != null) {
            n3 = R$string.s5;
            object = object2.getString(n3);
        } else {
            object = "Create calendar event";
        }
        context.setTitle((CharSequence)object);
        if (object2 != null) {
            n3 = R$string.s6;
            object = object2.getString(n3);
        } else {
            object = "Allow Ad to create a calendar event?";
        }
        context.setMessage((CharSequence)object);
        if (object2 != null) {
            n3 = R$string.s3;
            object = object2.getString(n3);
        } else {
            object = "Accept";
        }
        zzbty zzbty2 = new zzbty(this);
        context.setPositiveButton((CharSequence)object, (DialogInterface.OnClickListener)zzbty2);
        if (object2 != null) {
            n3 = R$string.s4;
            object2 = object2.getString(n3);
        } else {
            object2 = "Decline";
        }
        object = new zzbtz(this);
        context.setNegativeButton((CharSequence)object2, (DialogInterface.OnClickListener)object);
        context.create().show();
    }
}

