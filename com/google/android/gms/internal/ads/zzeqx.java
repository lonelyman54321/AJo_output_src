/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzeqw;
import com.google.android.gms.internal.ads.zzeqy;
import com.google.android.gms.internal.ads.zzesu;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyb;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeqx
implements zzexw {
    private final zzexw zza;
    private final zzfho zzb;
    private final Context zzc;
    private final zzcby zzd;

    public zzeqx(zzesu zzesu2, zzfho zzfho2, Context context, zzcby zzcby2) {
        this.zza = zzesu2;
        this.zzb = zzfho2;
        this.zzc = context;
        this.zzd = zzcby2;
    }

    public final int zza() {
        return 7;
    }

    public final ListenableFuture zzb() {
        ListenableFuture listenableFuture = this.zza.zzb();
        zzeqw zzeqw2 = new zzeqw(this);
        zzgge zzgge2 = zzcci.zzf;
        return zzgft.zzm(listenableFuture, zzeqw2, zzgge2);
    }

    public final /* synthetic */ zzeqy zzc(zzeyb zzeyb2) {
        int n3;
        Object object;
        int n4;
        int n7;
        Object object2;
        int n8;
        int n10;
        float f5;
        boolean bl2;
        String string2;
        int n14;
        Object object3;
        int n15;
        zzeqx zzeqx2 = this;
        zzq zzq2 = this.zzb.zze;
        Resources resources = zzq2.zzg;
        Object object4 = null;
        if (resources == null) {
            resources = zzq2.zza;
            n15 = zzq2.zzi;
            object3 = resources;
            n14 = n15;
        } else {
            object3 = null;
            string2 = null;
            bl2 = false;
            f5 = 0.0f;
            n10 = 0;
            n14 = 0;
            for (n15 = 0; n15 < (n8 = ((Resources)resources).length); ++n15) {
                object2 = resources[n15];
                boolean bl3 = object2.zzi;
                if (!bl3 && !bl2) {
                    object3 = object2.zza;
                    bl2 = true;
                    f5 = Float.MIN_VALUE;
                }
                if (bl3) {
                    if (n10 == 0) {
                        n10 = 1;
                        n14 = 1;
                    } else {
                        n10 = 1;
                    }
                }
                if (bl2 && n10 != 0) break;
            }
        }
        resources = zzeqx2.zzc.getResources();
        n15 = 0;
        string2 = null;
        if (resources != null && (resources = resources.getDisplayMetrics()) != null) {
            object4 = zzeqx2.zzd;
            f5 = resources.density;
            n10 = resources.widthPixels;
            n7 = resources.heightPixels;
            object4 = ((zzcby)object4).zzi().zzm();
            object2 = object4;
        } else {
            n8 = 0;
            object2 = null;
            n7 = 0;
            resources = null;
            bl2 = false;
            f5 = 0.0f;
            n10 = 0;
        }
        object4 = new StringBuilder();
        Object object5 = zzq2.zzg;
        if (object5 != null) {
            n4 = 0;
            boolean bl4 = false;
            while (true) {
                int n16 = ((zzq[])object5).length;
                object = "|";
                if (n4 >= n16) break;
                zzq zzq3 = object5[n4];
                n3 = (int)(zzq3.zzi ? 1 : 0);
                if (n3 != 0) {
                    bl4 = true;
                } else {
                    float f6;
                    int n17;
                    n3 = ((StringBuilder)object4).length();
                    if (n3 != 0) {
                        ((StringBuilder)object4).append((String)object);
                    }
                    if ((n17 = zzq3.zze) == (n3 = -1)) {
                        float f7 = f5 - 0.0f;
                        n17 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                        if (n17 != 0) {
                            f6 = (float)zzq3.zzf / f5;
                            n17 = (int)f6;
                        } else {
                            n17 = -1;
                            f6 = 0.0f / 0.0f;
                        }
                    }
                    ((StringBuilder)object4).append(n17);
                    object = "x";
                    ((StringBuilder)object4).append((String)object);
                    n17 = zzq3.zzb;
                    n3 = -2;
                    if (n17 == n3) {
                        float f8 = f5 - 0.0f;
                        n17 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                        if (n17 != 0) {
                            f6 = (float)zzq3.zzc / f5;
                            n17 = (int)f6;
                        } else {
                            n17 = -2;
                            f6 = 0.0f / 0.0f;
                        }
                    }
                    ((StringBuilder)object4).append(n17);
                }
                ++n4;
            }
            if (bl4) {
                n3 = ((StringBuilder)object4).length();
                if (n3 != 0) {
                    n3 = 0;
                    ((StringBuilder)object4).insert(0, (String)object);
                } else {
                    n3 = 0;
                }
                object = "320x50";
                ((StringBuilder)object4).insert(0, (String)object);
            }
        }
        string2 = ((StringBuilder)object4).toString();
        object4 = zzeqx2.zzb;
        n4 = ((zzfho)object4).zzq;
        object4 = object5;
        object = object3;
        n3 = n14;
        n8 = n4;
        object5 = new zzeqy(zzq2, (String)object3, n14 != 0, string2, f5, n10, n7, (String)object2, n4 != 0);
        return object5;
    }
}

