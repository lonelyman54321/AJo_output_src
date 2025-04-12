/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzbv;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

public final class zzk
extends RemoteCreator {
    private zzbwl zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            boolean bl2 = iInterface instanceof zzbv;
            if (bl2) {
                object = iInterface;
                object = (zzbv)iInterface;
            } else {
                iInterface = new zzbv((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbu zza(Context object, zzq object2, String object3, zzbrf zzbrf2, int n3) {
        void var1_4;
        block13: {
            zzbep.zza((Context)object);
            Object object4 = zzbep.zzkI;
            object4 = (Boolean)zzba.zzc().zza((zzbeg)object4);
            boolean bl2 = (Boolean)object4;
            String string2 = "com.google.android.gms.ads.internal.client.IAdManager";
            Object object5 = null;
            if (bl2) {
                void var2_9;
                block12: {
                    try {
                        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                        object4 = "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl";
                        Object object6 = new zzj();
                        object6 = object4 = com.google.android.gms.ads.internal.util.client.zzq.zzb((Context)object, (String)object4, (zzo)object6);
                        object6 = (zzbv)object4;
                        int n4 = 241806000;
                        object2 = ((zzbv)object6).zze(iObjectWrapper, (zzq)object2, (String)object3, zzbrf2, n4, n3);
                        if (object2 == null) {
                            return object5;
                        }
                    }
                    catch (NullPointerException nullPointerException) {
                        break block12;
                    }
                    catch (RemoteException remoteException) {
                        break block12;
                    }
                    catch (zzp zzp2) {
                        break block12;
                    }
                    object3 = object2.queryLocalInterface(string2);
                    boolean bl3 = object3 instanceof zzbu;
                    if (!bl3) return new zzbs((IBinder)object2);
                    object3 = (zzbu)object3;
                    return object3;
                }
                object = zzbwj.zza((Context)object);
                this.zza = object;
                object3 = "AdManagerCreator.newAdManagerByDynamiteLoader";
                object.zzh((Throwable)var2_9, (String)object3);
                object = "#007 Could not call remote method.";
                zzm.zzl((String)object, (Throwable)var2_9);
                return object5;
            }
            try {
                IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                Object object7 = object = this.getRemoteCreatorInstance((Context)object);
                object7 = (zzbv)object;
                int n7 = 241806000;
                object = ((zzbv)object7).zze(iObjectWrapper, (zzq)object2, (String)object3, zzbrf2, n7, n3);
                if (object == null) {
                    return object5;
                }
            }
            catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
                break block13;
            }
            catch (RemoteException remoteException) {
                break block13;
            }
            object2 = object.queryLocalInterface(string2);
            boolean bl4 = object2 instanceof zzbu;
            if (!bl4) return new zzbs((IBinder)object);
            object2 = (zzbu)object2;
            return object2;
        }
        zzm.zzf("Could not create remote AdManager.", (Throwable)var1_4);
        return null;
    }
}

