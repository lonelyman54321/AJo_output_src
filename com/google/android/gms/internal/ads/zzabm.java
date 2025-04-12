/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzez;

public final class zzabm
extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabk zzd;
    private boolean zze;

    public /* synthetic */ zzabm(zzabk zzabk2, SurfaceTexture surfaceTexture, boolean bl2, zzabl zzabl2) {
        super(surfaceTexture);
        this.zzd = zzabk2;
        this.zza = bl2;
    }

    public static zzabm zza(Context object, boolean bl2) {
        boolean bl3;
        int n3 = 0;
        boolean bl4 = true;
        if (bl2 && !(bl3 = zzabm.zzb((Context)object))) {
            bl4 = false;
        }
        zzeq.zzf(bl4);
        object = new zzabk();
        if (bl2) {
            n3 = zzb;
        }
        return ((zzabk)((Object)object)).zza(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean zzb(Context context) {
        int n3;
        boolean bl2;
        block4: {
            block6: {
                block5: {
                    Class<zzabm> clazz = zzabm.class;
                    // MONITORENTER : clazz
                    boolean bl3 = zzc;
                    bl2 = true;
                    if (bl3) break block4;
                    n3 = (int)(zzez.zzb(context) ? 1 : 0);
                    if (n3 == 0) break block5;
                    n3 = (int)(zzez.zzc() ? 1 : 0);
                    n3 = n3 != 0 ? 1 : 2;
                    break block6;
                }
                n3 = 0;
                context = null;
            }
            zzb = n3;
            zzc = bl2;
        }
        n3 = zzb;
        // MONITOREXIT : clazz
        if (n3 == 0) return false;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        super.release();
        zzabk zzabk2 = this.zzd;
        synchronized (zzabk2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.zze;
                        if (bl2) break block3;
                        zzabk zzabk3 = this.zzd;
                        zzabk3.zzb();
                        this.zze = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

