/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzfe;
import com.google.android.gms.internal.auth.zzff;
import com.google.android.gms.internal.auth.zzfk;
import com.google.android.gms.internal.auth.zzgd;
import com.google.android.gms.internal.auth.zzhd;
import com.google.android.gms.internal.auth.zzhi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzfg
extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfg() {
        super(null);
    }

    public /* synthetic */ zzfg(zzff zzff2) {
        super(null);
    }

    public final void zza(Object object, long l2) {
        zzey zzey2 = (zzey)zzhi.zzf(object, l2);
        boolean bl2 = zzey2 instanceof zzfe;
        if (bl2) {
            zzey2 = ((zzfe)((Object)zzey2)).zze();
        } else {
            Class clazz = zza;
            Class<?> clazz2 = zzey2.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            bl2 = zzey2 instanceof zzgd;
            if (bl2 && (bl2 = zzey2 instanceof zzey)) {
                boolean bl3 = (zzey2 = (zzey)zzey2).zzc();
                if (bl3) {
                    zzey2.zzb();
                }
                return;
            }
            zzey2 = Collections.unmodifiableList(zzey2);
        }
        zzhi.zzp(object, l2, zzey2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzb(Object var1_1, Object var2_2, long var3_3) {
        var2_2 = (List)zzhi.zzf(var2_2, var3_3);
        var5_4 = var2_2.size();
        var6_5 /* !! */  = (ArrayList<E>)zzhi.zzf(var1_1, var3_3);
        var7_6 = var6_5 /* !! */ .isEmpty();
        if (var7_6 != 0) {
            var7_6 = var6_5 /* !! */  instanceof zzfe;
            if (var7_6 != 0) {
                var6_5 /* !! */  = new ArrayList<E>(var5_4);
            } else {
                var7_6 = var6_5 /* !! */  instanceof zzgd;
                if (var7_6 != 0 && (var7_6 = var6_5 /* !! */  instanceof zzey) != 0) {
                    var8_7 = ((zzey)var6_5 /* !! */ ).zzd(var5_4);
                    var6_5 /* !! */  = var8_7;
                } else {
                    var6_5 /* !! */  = new ArrayList<E>(var5_4);
                }
            }
            zzhi.zzp(var1_1, var3_3, var6_5 /* !! */ );
        } else {
            var9_8 = zzfg.zza;
            var10_9 = var6_5 /* !! */ .getClass();
            var7_6 = var9_8.isAssignableFrom(var10_9);
            if (var7_6 != 0) {
                var11_10 = var6_5 /* !! */ .size() + var5_4;
                var9_8 = new Object(var11_10);
                var9_8.addAll(var6_5 /* !! */ );
                zzhi.zzp(var1_1, var3_3, var9_8);
lbl27:
                // 2 sources

                while (true) {
                    var6_5 /* !! */  = var9_8;
                    break;
                }
            } else {
                var7_6 = var6_5 /* !! */  instanceof zzhd;
                if (var7_6 != 0) {
                    var11_11 = ((List)var6_5 /* !! */ ).size() + var5_4;
                    var9_8 = new Object(var11_11);
                    var6_5 /* !! */  = (zzhd)var6_5 /* !! */ ;
                    var5_4 = var9_8.size();
                    var9_8.addAll(var5_4, var6_5 /* !! */ );
                    zzhi.zzp(var1_1, var3_3, var9_8);
                    ** continue;
                }
                var7_6 = var6_5 /* !! */  instanceof zzgd;
                if (var7_6 != 0 && (var7_6 = var6_5 /* !! */  instanceof zzey) != 0) {
                    var9_8 = var6_5 /* !! */ ;
                    var9_8 = (zzey)var6_5 /* !! */ ;
                    var11_12 = var9_8.zzc();
                    if (!var11_12) {
                        var12_13 = ((List)var6_5 /* !! */ ).size() + var5_4;
                        var6_5 /* !! */  = var9_8.zzd(var12_13);
                        zzhi.zzp(var1_1, var3_3, var6_5 /* !! */ );
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
        zzhi.zzp(var1_1, var3_3, var2_2);
    }
}

