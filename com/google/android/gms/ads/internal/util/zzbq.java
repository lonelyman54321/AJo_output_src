/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zzbi;
import com.google.android.gms.ads.internal.util.zzbj;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzasl;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

public final class zzbq {
    public static final zzbl zza;
    private static zzarh zzb;
    private static final Object zzc;

    static {
        Object object;
        zzc = object = new Object();
        zza = object = new zzbi();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbq(Context object) {
        Object object2 = object.getApplicationContext();
        if (object2 != null) {
            object = object.getApplicationContext();
        }
        object2 = zzc;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block4: {
                    block6: {
                        boolean bl2;
                        Object object3;
                        block5: {
                            try {
                                object3 = zzb;
                                if (object3 != null) break block4;
                                zzbep.zza(object);
                                bl2 = ClientLibraryUtils.isPackageSide();
                                if (bl2) break block5;
                                object3 = zzbep.zzew;
                                zzben zzben2 = zzba.zzc();
                                object3 = zzben2.zza((zzbeg)object3);
                                bl2 = (Boolean)(object3 = (Boolean)object3);
                                if (!bl2) break block5;
                                object = zzaz.zzb(object);
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        bl2 = false;
                        object3 = null;
                        object = zzasl.zza(object, null);
                    }
                    zzb = object;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final ListenableFuture zza(String string2) {
        zzccn zzccn2 = new zzccn();
        zzarh zzarh2 = zzb;
        zzbp zzbp2 = new zzbp(string2, null, zzccn2);
        zzarh2.zza(zzbp2);
        return zzccn2;
    }

    public final ListenableFuture zzb(int n3, String string2, Map map2, byte[] byArray) {
        zzbk zzbk2;
        String string3 = string2;
        zzbn zzbn2 = new zzbn(null);
        zzbj zzbj2 = new zzbj(this, string2, zzbn2);
        zzl zzl2 = new zzl(null);
        Object object = zzbk2;
        Object object2 = this;
        zzbk2 = new zzbk(this, n3, string2, zzbn2, zzbj2, byArray, map2, zzl2);
        boolean bl2 = zzl.zzk();
        if (bl2) {
            object = "GET";
            object2 = zzbk2.zzl();
            byte[] byArray2 = zzbk2.zzx();
            try {
                zzl2.zzd(string2, (String)object, (Map)object2, byArray2);
            }
            catch (zzaqm zzaqm2) {
                string3 = zzaqm2.getMessage();
                zzm.zzj(string3);
            }
        }
        zzb.zza(zzbk2);
        return zzbn2;
    }
}

