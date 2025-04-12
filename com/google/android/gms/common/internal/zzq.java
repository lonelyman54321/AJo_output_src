/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.internal.zzs;
import java.util.HashMap;

final class zzq
implements Handler.Callback {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzs2, zzr zzr2) {
        this.zza = zzs2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        boolean bl2 = ((Message)object).what;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                return false;
            }
            HashMap hashMap = zzs.zzh(this.zza);
            synchronized (hashMap) {
                Throwable throwable2;
                block11: {
                    block9: {
                        Exception exception;
                        Object object2;
                        block10: {
                            try {
                                int n3;
                                int n4;
                                object = ((Message)object).obj;
                                object = (zzo)object;
                                object2 = this.zza;
                                object2 = zzs.zzh((zzs)object2);
                                object2 = ((HashMap)object2).get(object);
                                object2 = (zzp)object2;
                                if (object2 == null || (n4 = ((zzp)object2).zza()) != (n3 = 3)) break block9;
                                String.valueOf(object);
                                exception = new Exception();
                                exception = ((zzp)object2).zzb();
                                if (exception != null) break block10;
                                exception = ((zzo)object).zza();
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        if (exception == null) {
                            object = ((zzo)object).zzc();
                            Preconditions.checkNotNull(object);
                            String string2 = "unknown";
                            exception = new ComponentName((String)object, string2);
                        }
                        ((zzp)object2).onServiceDisconnected((ComponentName)exception);
                    }
                    return bl3;
                }
                throw throwable2;
            }
        }
        HashMap hashMap = zzs.zzh(this.zza);
        synchronized (hashMap) {
            Throwable throwable3;
            block14: {
                block12: {
                    Object object3;
                    block13: {
                        try {
                            boolean bl4;
                            object = ((Message)object).obj;
                            object = (zzo)object;
                            object3 = this.zza;
                            object3 = zzs.zzh((zzs)object3);
                            object3 = ((HashMap)object3).get(object);
                            object3 = (zzp)object3;
                            if (object3 == null || !(bl4 = ((zzp)object3).zzi())) break block12;
                            bl4 = ((zzp)object3).zzj();
                            if (!bl4) break block13;
                            String string3 = "GmsClientSupervisor";
                            ((zzp)object3).zzg(string3);
                        }
                        catch (Throwable throwable3) {
                            break block14;
                        }
                    }
                    object3 = this.zza;
                    object3 = zzs.zzh((zzs)object3);
                    ((HashMap)object3).remove(object);
                }
                return bl3;
            }
            throw throwable3;
        }
    }
}

