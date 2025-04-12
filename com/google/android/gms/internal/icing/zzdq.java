/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzdp;
import com.google.android.gms.internal.icing.zzds;
import com.google.android.gms.internal.icing.zzel;
import com.google.android.gms.internal.icing.zzfi;
import com.google.android.gms.internal.icing.zzfn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzdq
extends zzds {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdq() {
        super(null);
    }

    public /* synthetic */ zzdq(zzdp zzdp2) {
        super(null);
    }

    public final void zza(Object object, long l2) {
        zzdg zzdg2 = (zzdg)zzfn.zzn(object, l2);
        boolean bl2 = zzdg2 instanceof zzdo;
        if (bl2) {
            zzdg2 = ((zzdo)((Object)zzdg2)).zzi();
        } else {
            Class clazz = zza;
            Class<?> clazz2 = zzdg2.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            bl2 = zzdg2 instanceof zzel;
            if (bl2 && (bl2 = zzdg2 instanceof zzdg)) {
                boolean bl3 = (zzdg2 = (zzdg)zzdg2).zza();
                if (bl3) {
                    zzdg2.zzb();
                }
                return;
            }
            zzdg2 = Collections.unmodifiableList(zzdg2);
        }
        zzfn.zzo(object, l2, zzdg2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzb(Object var1_1, Object var2_2, long var3_3) {
        var2_2 = (List)zzfn.zzn(var2_2, var3_3);
        var5_4 = var2_2.size();
        var6_5 /* !! */  = (ArrayList<E>)zzfn.zzn(var1_1, var3_3);
        var7_6 = var6_5 /* !! */ .isEmpty();
        if (var7_6 != 0) {
            var7_6 = var6_5 /* !! */  instanceof zzdo;
            if (var7_6 != 0) {
                var6_5 /* !! */  = new ArrayList<E>(var5_4);
            } else {
                var7_6 = var6_5 /* !! */  instanceof zzel;
                if (var7_6 != 0 && (var7_6 = var6_5 /* !! */  instanceof zzdg) != 0) {
                    var8_7 = ((zzdg)var6_5 /* !! */ ).zze(var5_4);
                    var6_5 /* !! */  = var8_7;
                } else {
                    var6_5 /* !! */  = new ArrayList<E>(var5_4);
                }
            }
            zzfn.zzo(var1_1, var3_3, var6_5 /* !! */ );
        } else {
            var9_8 = zzdq.zza;
            var10_9 = var6_5 /* !! */ .getClass();
            var7_6 = var9_8.isAssignableFrom(var10_9);
            if (var7_6 != 0) {
                var11_10 = var6_5 /* !! */ .size() + var5_4;
                var9_8 = new Object(var11_10);
                var9_8.addAll(var6_5 /* !! */ );
                zzfn.zzo(var1_1, var3_3, var9_8);
lbl27:
                // 2 sources

                while (true) {
                    var6_5 /* !! */  = var9_8;
                    break;
                }
            } else {
                var7_6 = var6_5 /* !! */  instanceof zzfi;
                if (var7_6 != 0) {
                    var11_11 = ((List)var6_5 /* !! */ ).size() + var5_4;
                    var9_8 = new Object(var11_11);
                    var6_5 /* !! */  = (zzfi)var6_5 /* !! */ ;
                    var5_4 = var9_8.size();
                    var9_8.addAll(var5_4, var6_5 /* !! */ );
                    zzfn.zzo(var1_1, var3_3, var9_8);
                    ** continue;
                }
                var7_6 = var6_5 /* !! */  instanceof zzel;
                if (var7_6 != 0 && (var7_6 = var6_5 /* !! */  instanceof zzdg) != 0) {
                    var9_8 = var6_5 /* !! */ ;
                    var9_8 = (zzdg)var6_5 /* !! */ ;
                    var11_12 = var9_8.zza();
                    if (!var11_12) {
                        var12_13 = ((List)var6_5 /* !! */ ).size() + var5_4;
                        var6_5 /* !! */  = var9_8.zze(var12_13);
                        zzfn.zzo(var1_1, var3_3, var6_5 /* !! */ );
                    }
                }
            }
        }
        var5_4 = ((List)var6_5 /* !! */ ).size();
        var7_6 = var2_2.size();
        if (var5_4 > 0 && var7_6 > 0) {
            ((List)var6_5 /* !! */ ).addAll(var2_2);
        }
        if (var5_4 > 0) {
            var2_2 = var6_5 /* !! */ ;
        }
        zzfn.zzo(var1_1, var3_3, var2_2);
    }
}

