/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class zzcm {
    private final BroadcastReceiver zza;
    private final Map zzb;
    private boolean zzc = false;
    private boolean zzd;
    private Context zze;

    public zzcm() {
        Object object;
        this.zzb = object = new Object();
        super(this);
        this.zza = object;
    }

    public static /* bridge */ /* synthetic */ void zza(zzcm zzcm2, Context context, Intent intent) {
        zzcm2.zze(context, intent);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(Context context, Intent intent) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                Object object2;
                int n3;
                ArrayList arrayList;
                try {
                    arrayList = new ArrayList();
                    Iterator iterator = this.zzb;
                    iterator = iterator.entrySet();
                    iterator = iterator.iterator();
                    while ((n3 = iterator.hasNext()) != 0) {
                        object2 = iterator.next();
                        object2 = (Map.Entry)object2;
                        object = object2.getValue();
                        String string2 = intent.getAction();
                        boolean bl2 = (object = (IntentFilter)object).hasAction(string2);
                        if (!bl2) continue;
                        object2 = object2.getKey();
                        object2 = (BroadcastReceiver)object2;
                        arrayList.add(object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                int n4 = arrayList.size();
                object2 = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    object = arrayList.get(n3);
                    object = (BroadcastReceiver)object;
                    object.onReceive(context, intent);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                int n3;
                boolean bl2;
                int n4;
                block7: {
                    try {
                        n4 = this.zzc;
                        if (n4 == 0) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                Object object2 = object.getApplicationContext();
                this.zze = object2;
                if (object2 == null) {
                    this.zze = object;
                }
                object = this.zze;
                zzbep.zza((Context)object);
                object = zzbep.zzdP;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (Boolean)object;
                this.zzd = bl2 = ((Boolean)object).booleanValue();
                object = new IntentFilter();
                object2 = "android.intent.action.SCREEN_ON";
                object.addAction((String)object2);
                object2 = "android.intent.action.SCREEN_OFF";
                object.addAction((String)object2);
                object2 = "android.intent.action.USER_PRESENT";
                object.addAction((String)object2);
                object2 = zzbep.zzkW;
                zzben zzben2 = zzba.zzc();
                object2 = zzben2.zza((zzbeg)object2);
                object2 = (Boolean)object2;
                n4 = ((Boolean)object2).booleanValue();
                if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
                    object2 = this.zze;
                    zzben2 = this.zza;
                    hk3_1.a((Context)object2, (BroadcastReceiver)zzben2, (IntentFilter)object);
                } else {
                    object2 = this.zze;
                    zzben2 = this.zza;
                    object2.registerReceiver((BroadcastReceiver)zzben2, (IntentFilter)object);
                }
                this.zzc = bl2 = true;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(Context object, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n3;
                int n4;
                try {
                    n4 = this.zzd;
                    if (n4 != 0) {
                        object = this.zzb;
                        object.put(broadcastReceiver2, intentFilter);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                zzbep.zza((Context)object);
                Object object2 = zzbep.zzkW;
                zzben zzben2 = zzba.zzc();
                object2 = zzben2.zza((zzbeg)object2);
                object2 = (Boolean)object2;
                n4 = ((Boolean)object2).booleanValue();
                if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
                    hk3_1.a((Context)object, broadcastReceiver2, intentFilter);
                    return;
                }
                object.registerReceiver(broadcastReceiver2, intentFilter);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(Context object, BroadcastReceiver broadcastReceiver2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzd;
                    if (bl2) {
                        object = this.zzb;
                        object.remove(broadcastReceiver2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object.unregisterReceiver(broadcastReceiver2);
                return;
            }
            throw throwable2;
        }
    }
}

