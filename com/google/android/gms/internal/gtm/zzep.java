/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 */
package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzeo;

final class zzep
extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzep";
    private final zzbu zzb;
    private boolean zzc;
    private boolean zzd;

    public zzep(zzbu zzbu2) {
        Preconditions.checkNotNull(zzbu2);
        this.zzb = zzbu2;
    }

    public final void onReceive(Context object, Intent object2) {
        block8: {
            block7: {
                boolean bl2;
                Object object3;
                block6: {
                    this.zzb.zzm();
                    this.zzb.zzf();
                    object = object2.getAction();
                    object3 = this.zzb.zzm();
                    Object object4 = "NetworkBroadcastReceiver received action";
                    ((zzbq)object3).zzO((String)object4, object);
                    object3 = "android.net.conn.CONNECTIVITY_CHANGE";
                    bl2 = ((String)object3).equals(object);
                    if (!bl2) break block6;
                    boolean bl3 = this.zzd;
                    boolean bl4 = this.zze();
                    if (bl3 != bl4) {
                        this.zzd = bl4;
                        object2 = this.zzb.zzf();
                        object3 = bl4;
                        ((zzbq)object2).zzO("Network connectivity status changed", object3);
                        object3 = ((zzbq)object2).zzq();
                        object4 = new zzbi((zzbp)object2, bl4);
                        ((zzr)object3).zzi((Runnable)object4);
                        return;
                    }
                    break block7;
                }
                object3 = "com.google.analytics.RADIO_POWERED";
                bl2 = ((String)object3).equals(object);
                if (!bl2) break block8;
                object = zza;
                boolean bl5 = object2.hasExtra((String)object);
                if (!bl5) {
                    object = this.zzb.zzf();
                    object2 = "Radio powered up";
                    ((zzbq)object).zzN((String)object2);
                    ((zzbp)object).zzc();
                }
            }
            return;
        }
        this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", object);
    }

    public final void zza() {
        this.zzb.zzm();
        Object object = this.zzb;
        ((zzbu)object).zzf();
        boolean bl2 = this.zzc;
        if (bl2) {
            return;
        }
        object = this.zzb.zza();
        Object object2 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        int n3 = 4;
        t70.registerReceiver((Context)object, this, object2, n3);
        object2 = new IntentFilter("com.google.analytics.RADIO_POWERED");
        String string2 = object.getPackageName();
        object2.addCategory(string2);
        t70.registerReceiver((Context)object, this, object2, n3);
        this.zzd = bl2 = this.zze();
        object = this.zzb.zzm();
        object2 = this.zzd;
        ((zzbq)object).zzO("Registering connectivity change receiver. Network connected", object2);
        this.zzc = true;
    }

    public final void zzb() {
        Context context = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        String string2 = context.getPackageName();
        intent.addCategory(string2);
        string2 = zza;
        intent.putExtra(string2, true);
        context.sendOrderedBroadcast(intent, null);
    }

    public final void zzc() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            return;
        }
        zzeo zzeo2 = this.zzb.zzm();
        String string2 = "Unregistering connectivity change receiver";
        zzeo2.zzN(string2);
        bl2 = false;
        this.zzc = false;
        this.zzd = false;
        zzeo2 = this.zzb.zza();
        try {
            zzeo2.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", illegalArgumentException);
            return;
        }
    }

    public final boolean zzd() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            zzeo zzeo2 = this.zzb.zzm();
            String string2 = "Connectivity unknown. Receiver not registered";
            zzeo2.zzQ(string2);
        }
        return this.zzd;
    }

    public final boolean zze() {
        block4: {
            ConnectivityManager connectivityManager = (ConnectivityManager)this.zzb.zza().getSystemService("connectivity");
            try {
                connectivityManager = connectivityManager.getActiveNetworkInfo();
                if (connectivityManager == null) break block4;
            }
            catch (SecurityException securityException) {}
            boolean bl2 = connectivityManager.isConnected();
            if (bl2) {
                return true;
            }
        }
        return false;
    }
}

