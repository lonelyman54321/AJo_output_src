/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbd;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzba
extends zzay {
    public zzba() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zzv;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzai;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzaj;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzak;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzal;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzan;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzao;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzat;
        list.add(zzbv2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean zza(zzaq object, zzaq object2) {
        while (true) {
            Object object3;
            block16: {
                Object object4;
                block19: {
                    block14: {
                        boolean bl2;
                        block18: {
                            boolean bl3;
                            block17: {
                                block15: {
                                    block13: {
                                        object3 = object.getClass();
                                        Class<?> clazz = object2.getClass();
                                        object4 = object3.equals(clazz);
                                        clazz = null;
                                        bl2 = true;
                                        if (object4) {
                                            object4 = object instanceof zzax;
                                            if (object4) return bl2;
                                            object4 = object instanceof zzao;
                                            if (object4) {
                                                return bl2;
                                            }
                                            object4 = object instanceof zzai;
                                            if (object4) {
                                                double d2;
                                                object3 = ((zzaq)object).zze();
                                                double d5 = (Double)object3;
                                                object4 = Double.isNaN(d5);
                                                if (object4) return false;
                                                object3 = ((zzaq)object2).zze();
                                                d5 = (Double)object3;
                                                object4 = Double.isNaN(d5);
                                                if (object4) {
                                                    return false;
                                                }
                                                d5 = ((zzaq)object).zze();
                                                double d7 = d5 - (d2 = ((Double)(object = ((zzaq)object2).zze())).doubleValue());
                                                object4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                                if (object4) return false;
                                                return bl2;
                                            }
                                            object4 = object instanceof zzas;
                                            if (object4) {
                                                object = ((zzaq)object).zzf();
                                                object2 = ((zzaq)object2).zzf();
                                                return ((String)object).equals(object2);
                                            }
                                            object4 = object instanceof zzag;
                                            if (object4) {
                                                object = ((zzaq)object).zzd();
                                                object2 = ((zzaq)object2).zzd();
                                                return ((Boolean)object).equals(object2);
                                            }
                                            if (object != object2) return false;
                                            return bl2;
                                        }
                                        object4 = object instanceof zzax;
                                        if (object4 || (object4 = object instanceof zzao)) {
                                            object4 = object2 instanceof zzax;
                                            if (object4) return bl2;
                                            object4 = object2 instanceof zzao;
                                            if (object4) {
                                                return bl2;
                                            }
                                        }
                                        if (!(object4 = object instanceof zzai) || !(bl2 = object2 instanceof zzas)) break block13;
                                        object2 = ((zzaq)object2).zze();
                                        object3 = new zzai((Double)object2);
                                        break block14;
                                    }
                                    bl2 = object instanceof zzas;
                                    if (!bl2 || !(bl3 = object2 instanceof zzai)) break block15;
                                    object = ((zzaq)object).zze();
                                    object3 = new zzai((Double)object);
                                    break block16;
                                }
                                bl3 = object instanceof zzag;
                                if (!bl3) break block17;
                                object = ((zzaq)object).zze();
                                object3 = new zzai((Double)object);
                                break block16;
                            }
                            bl3 = object2 instanceof zzag;
                            if (!bl3) break block18;
                            object2 = ((zzaq)object2).zze();
                            object3 = new zzai((Double)object2);
                            break block14;
                        }
                        if (!bl2 && !object4 || !(object4 = object2 instanceof zzak)) break block19;
                        object2 = ((zzaq)object2).zzf();
                        object3 = new zzas((String)object2);
                    }
                    object2 = object3;
                    continue;
                }
                object4 = object instanceof zzak;
                if (!object4) return false;
                object4 = object2 instanceof zzas;
                if (!object4) {
                    object4 = object2 instanceof zzai;
                    if (!object4) return false;
                }
                object = ((zzaq)object).zzf();
                object3 = new zzas((String)object);
            }
            object = object3;
        }
    }

    private static boolean zzb(zzaq object, zzaq object2) {
        zzas zzas2;
        Object object3 = object instanceof zzak;
        if (object3) {
            object = object.zzf();
            zzas2 = new zzas((String)object);
            object = zzas2;
        }
        if (object3 = object2 instanceof zzak) {
            object2 = object2.zzf();
            zzas2 = new zzas((String)object2);
            object2 = zzas2;
        }
        object3 = object instanceof zzas;
        boolean bl2 = true;
        if (object3 && (object3 = object2 instanceof zzas)) {
            int n3 = ((String)(object = object.zzf())).compareTo((String)(object2 = ((zzaq)object2).zzf()));
            if (n3 < 0) {
                return bl2;
            }
            return false;
        }
        double d2 = object.zze();
        object = object2.zze();
        double d5 = (Double)object;
        object3 = Double.isNaN(d2);
        if (!object3 && !(object3 = Double.isNaN(d5))) {
            double d7 = -0.0;
            double d9 = 0.0;
            double d12 = d2 - d9;
            object3 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            if (!object3 && !(object3 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1)) || !(object3 = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1)) && !(object3 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1))) {
                return false;
            }
            int n4 = Double.compare(d2, d5);
            if (n4 < 0) {
                return bl2;
            }
        }
        return false;
    }

    private static boolean zzc(zzaq object, zzaq object2) {
        boolean bl2;
        double d2;
        Object object3;
        boolean bl3 = object instanceof zzak;
        if (bl3) {
            object = object.zzf();
            object = object3 = new zzas((String)object);
        }
        if (bl3 = object2 instanceof zzak) {
            object2 = object2.zzf();
            object2 = object3 = new zzas((String)object2);
        }
        return ((bl3 = object instanceof zzas) && (bl3 = object2 instanceof zzas) || !(bl3 = Double.isNaN(d2 = ((Double)(object3 = object.zze())).doubleValue())) && !(bl3 = Double.isNaN(d2 = ((Double)(object3 = object2.zze())).doubleValue()))) && !(bl2 = zzba.zzb((zzaq)object2, (zzaq)object));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzaq zza(String var1_1, zzh var2_2, List var3_3) {
        zzg.zza(zzg.zza(var1_1), 2, (List)var3_3);
        var4_4 = (zzaq)var3_3.get(0);
        var4_4 = var2_2.zza(var4_4);
        var5_5 = 1;
        var3_3 = (zzaq)var3_3.get(var5_5);
        var2_2 = var2_2.zza((zzaq)var3_3);
        var3_3 = zzbd.zza;
        var6_6 = zzg.zza(var1_1);
        var7_7 = var6_6.ordinal();
        var8_8 = var3_3[var7_7];
        block0 : switch (var8_8) {
            default: {
                return this.zza(var1_1);
            }
            case 8: {
                var9_9 = zzba.zza(var4_4, (zzaq)var2_2);
lbl16:
                // 2 sources

                while (true) {
                    var9_9 ^= var5_5;
                    break block0;
                    break;
                }
            }
            case 7: {
                var9_9 = zzba.zzc(var4_4, (zzaq)var2_2);
                break;
            }
            case 6: {
                var9_9 = zzba.zzb(var4_4, (zzaq)var2_2);
                break;
            }
            case 5: {
                var9_9 = zzg.zza(var4_4, (zzaq)var2_2);
                ** continue;
            }
            case 4: {
                var9_9 = zzg.zza(var4_4, (zzaq)var2_2);
                break;
            }
            case 3: {
                var9_9 = zzba.zzc((zzaq)var2_2, var4_4);
                break;
            }
            case 2: {
                var9_9 = zzba.zzb((zzaq)var2_2, var4_4);
                break;
            }
            case 1: {
                var9_9 = zzba.zza(var4_4, (zzaq)var2_2);
            }
        }
        if (var9_9 != 0) {
            return zzaq.zzh;
        }
        return zzaq.zzi;
    }
}

