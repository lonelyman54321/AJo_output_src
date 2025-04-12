/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.flags;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.flags.Flag;
import com.google.android.gms.flags.zzc;
import com.google.android.gms.flags.zzd;

public final class zzb {
    private boolean zzj = false;
    private zzc zzk = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void initialize(Context object) {
        synchronized (this) {
            block6: {
                Throwable throwable2;
                block7: {
                    try {
                        boolean bl2 = this.zzj;
                        if (bl2) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        boolean bl3;
                        Object object2 = DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
                        String string2 = "com.google.android.gms.flags";
                        object2 = DynamiteModule.load(object, (DynamiteModule$VersionPolicy)object2, string2);
                        string2 = "com.google.android.gms.flags.impl.FlagProviderImpl";
                        object2 = ((DynamiteModule)object2).instantiate(string2);
                        this.zzk = object2 = zzd.asInterface((IBinder)object2);
                        object = ObjectWrapper.wrap(object);
                        object2.init((IObjectWrapper)object);
                        this.zzj = bl3 = true;
                        break block6;
                    }
                    catch (RemoteException | DynamiteModule$LoadingException throwable3) {}
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzb(Flag object) {
        synchronized (this) {
            try {
                boolean bl2 = this.zzj;
                if (!bl2) {
                    return ((Flag)object).zzb();
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl6 : MonitorExitStatement: MONITOREXIT : this
                zzc zzc2 = this.zzk;
                return ((Flag)object).zza(zzc2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

