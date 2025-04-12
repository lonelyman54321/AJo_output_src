/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaan;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzzs;
import com.google.android.gms.internal.ads.zzzt;
import com.google.android.gms.internal.ads.zzzu;
import com.google.android.gms.internal.ads.zzzw;
import com.google.android.gms.internal.ads.zzzx;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class zzzy
implements zzzu,
zzie {
    public static final zzgbc zza;
    public static final zzgbc zzb;
    public static final zzgbc zzc;
    public static final zzgbc zzd;
    public static final zzgbc zze;
    public static final zzgbc zzf;
    private static zzzy zzg;
    private final zzgbf zzh;
    private final zzzs zzi;
    private final zzer zzj;
    private final zzaan zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;

    static {
        Long l2 = 4300000L;
        Long l3 = 3200000L;
        Long l4 = 2400000L;
        Long l7 = 1700000L;
        Long l8 = 860000L;
        zza = zzgbc.zzq(l2, l3, l4, l7, l8);
        l2 = 1500000L;
        l3 = 980000L;
        l4 = 750000L;
        Long l12 = 520000L;
        Long l14 = 290000L;
        zzb = zzgbc.zzq(l2, l3, l4, l12, l14);
        l2 = 2000000L;
        l4 = 1300000L;
        l12 = 1000000L;
        l14 = 610000L;
        zzc = zzgbc.zzq(l2, l4, l12, l8, l14);
        l8 = 2500000L;
        l14 = 1200000L;
        Long l15 = 970000L;
        Long l16 = 680000L;
        zzd = zzgbc.zzq(l8, l7, l14, l15, l16);
        l8 = 4700000L;
        l14 = 2800000L;
        l15 = 0x200B20L;
        zze = zzgbc.zzq(l8, l14, l15, l7, l3);
        l3 = 2700000L;
        l7 = 1600000L;
        zzf = zzgbc.zzq(l3, l2, l7, l4, l12);
    }

    public /* synthetic */ zzzy(Context object, Map object2, int n3, zzer zzer2, boolean bl2, zzzx zzzx2) {
        long l2;
        object2 = zzgbf.zzc((Map)object2);
        this.zzh = object2;
        this.zzi = object2 = new zzzs();
        n3 = 2000;
        this.zzk = object2 = new zzaan(n3);
        this.zzj = zzer2;
        if (object != null) {
            long l3;
            int n4;
            object = zzfs.zzb((Context)object);
            this.zzs = n4 = ((zzfs)object).zza();
            this.zzq = l3 = this.zzi(n4);
            object2 = new zzzw(this);
            ((zzfs)object).zzd((zzzw)object2);
            return;
        }
        this.zzs = 0;
        this.zzq = l2 = this.zzi(0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzzy zzg(Context object) {
        Class<zzzy> clazz = zzzy.class;
        synchronized (clazz) {
            Throwable throwable2;
            block8: {
                zzzy zzzy2;
                int n3;
                Object object2;
                block7: {
                    block6: {
                        try {
                            object2 = zzg;
                            if (object2 != null) return zzg;
                            if (object == null) {
                                n3 = 0;
                                object2 = null;
                            } else {
                                object2 = object.getApplicationContext();
                            }
                            zzzy2 = object2;
                            n3 = zzgd.zza;
                            if (object == null) break block6;
                            object2 = "phone";
                            object = object.getSystemService((String)object2);
                            if ((object = (TelephonyManager)object) == null || (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = object.getNetworkCountryIso())) ? 1 : 0)) != 0) break block6;
                            object = zzfxm.zzb((String)object);
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object = Locale.getDefault();
                    object = object.getCountry();
                    object = zzfxm.zzb((String)object);
                }
                object = zzzy.zzm((String)object);
                n3 = 8;
                HashMap<Serializable, Serializable> hashMap = new HashMap<Serializable, Serializable>(n3);
                n3 = 0;
                object2 = null;
                Number number = 0;
                long l2 = 1000000L;
                Number number2 = l2;
                hashMap.put(number, number2);
                Object object3 = 2;
                number2 = object3;
                Object object4 = zza;
                Object object5 = object[0];
                Object object6 = object4.get((int)object5);
                object6 = (Long)object6;
                hashMap.put(number2, (Serializable)object6);
                Object object7 = 3;
                object6 = object7;
                Serializable serializable = zzb;
                Object object8 = 1;
                object8 = object[object8];
                serializable = serializable.get((int)object8);
                serializable = (Long)serializable;
                hashMap.put((Serializable)object6, serializable);
                object5 = 4;
                serializable = Integer.valueOf((int)object5);
                zzgbc zzgbc2 = zzc;
                object3 = object[object3];
                number = zzgbc2.get((int)object3);
                number = (Long)number;
                hashMap.put(serializable, number);
                object3 = 5;
                serializable = Integer.valueOf(object3);
                zzgbc2 = zzd;
                object7 = object[object7];
                number2 = zzgbc2.get((int)object7);
                hashMap.put(serializable, number2);
                object7 = 10;
                number2 = object7;
                serializable = zze;
                object5 = object[object5];
                object6 = serializable.get((int)object5);
                object6 = (Long)object6;
                hashMap.put(number2, (Serializable)object6);
                object7 = 9;
                number2 = object7;
                object6 = zzf;
                object3 = object[object3];
                number = object6.get((int)object3);
                number = (Long)number;
                hashMap.put(number2, number);
                object3 = 7;
                number = object3;
                Context context = object[0];
                object = object4.get((int)context);
                object = (Long)object;
                hashMap.put(number, (Serializable)object);
                object4 = zzer.zza;
                object5 = true;
                serializable = null;
                object7 = 2000;
                number = object;
                object = new zzzy((Context)zzzy2, hashMap, (int)object7, (zzer)object4, (boolean)object5, null);
                zzg = object;
                return zzg;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void zzh(zzzy zzzy2, int n3) {
        zzzy2.zzk(n3);
    }

    private final long zzi(int n3) {
        Serializable serializable = this.zzh;
        Serializable serializable2 = Integer.valueOf(n3);
        if ((serializable2 = (Long)serializable.get(serializable2)) == null) {
            serializable2 = this.zzh;
            serializable = Integer.valueOf(0);
            serializable2 = (Long)((zzgbf)serializable2).get(serializable);
        }
        if (serializable2 == null) {
            long l2 = 1000000L;
            serializable2 = Long.valueOf(l2);
        }
        return (Long)serializable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzj(int n3, long l2, long l3) {
        int n4;
        long l4;
        if (n3 == 0) {
            n3 = 0;
            long l7 = 0L;
            long l8 = l2 - l7;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object == false) {
                l2 = this.zzr;
                long l12 = l3 - l2;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 == false) {
                    return;
                }
                l4 = l7;
            } else {
                l4 = l2;
            }
            n4 = 0;
        } else {
            n4 = n3;
            l4 = l2;
        }
        this.zzr = l3;
        this.zzi.zzb(n4, l4, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block4: {
                    zzaan zzaan2;
                    int n4;
                    long l2;
                    block6: {
                        block5: {
                            long l3;
                            try {
                                int n7 = this.zzs;
                                if (n7 == n3) break block4;
                                this.zzs = n3;
                                n7 = 1;
                                if (n3 == n7 || n3 == 0 || n3 == (n7 = 8)) break block4;
                                this.zzq = l2 = this.zzi(n3);
                                l2 = SystemClock.elapsedRealtime();
                                n3 = this.zzl;
                                if (n3 <= 0) break block5;
                                l3 = this.zzm;
                                l3 = l2 - l3;
                            }
                            catch (Throwable throwable2) {}
                            n4 = n3 = (int)l3;
                            break block6;
                        }
                        n3 = 0;
                        zzaan2 = null;
                        n4 = 0;
                    }
                    long l4 = this.zzn;
                    long l7 = this.zzq;
                    this.zzj(n4, l4, l7);
                    this.zzm = l2;
                    this.zzn = l2 = 0L;
                    this.zzp = l2;
                    this.zzo = l2;
                    zzaan2 = this.zzk;
                    zzaan2.zzc();
                    return;
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    private static boolean zzl(zzhh zzhh2, boolean bl2) {
        boolean bl3;
        return bl2 && !(bl3 = zzhh2.zzb((int)((bl2 = 8) ? 1 : 0)));
    }

    /*
     * Unable to fully structure code
     */
    private static int[] zzm(String var0) {
        block486: {
            block478: {
                block490: {
                    block479: {
                        block480: {
                            block488: {
                                block481: {
                                    block489: {
                                        block482: {
                                            block487: {
                                                block483: {
                                                    block484: {
                                                        block491: {
                                                            block485: {
                                                                var1_1 = 6;
                                                                var2_2 = var0.hashCode();
                                                                if (var2_2 == (var3_3 = 2091)) break block478;
                                                                var3_3 = 2092;
                                                                if (var2_2 == var3_3) break block479;
                                                                var3_3 = 2102;
                                                                if (var2_2 == var3_3) break block480;
                                                                var3_3 = 2103;
                                                                if (var2_2 == var3_3) break block481;
                                                                var3_3 = 2111;
                                                                if (var2_2 == var3_3) break block482;
                                                                var3_3 = 2112;
                                                                if (var2_2 == var3_3) break block483;
                                                                var3_3 = 2135;
                                                                if (var2_2 == var3_3) break block484;
                                                                var3_3 = 2136;
                                                                if (var2_2 == var3_3) break block485;
                                                                switch (var2_2) {
                                                                    default: {
                                                                        switch (var2_2) {
                                                                            default: {
                                                                                switch (var2_2) {
                                                                                    default: {
                                                                                        switch (var2_2) {
                                                                                            default: {
                                                                                                switch (var2_2) {
                                                                                                    default: {
                                                                                                        switch (var2_2) {
                                                                                                            default: {
                                                                                                                break block486;
                                                                                                            }
                                                                                                            case 2150: {
                                                                                                                var4_4 = "CI";
                                                                                                                var5_243 = var0.equals(var4_4);
                                                                                                                if (!var5_243) break block486;
                                                                                                                ** GOTO lbl2405
                                                                                                            }
                                                                                                            case 2149: {
                                                                                                                var4_5 = "CH";
                                                                                                                var5_244 = var0.equals(var4_5);
                                                                                                                if (var5_244) {
                                                                                                                    v0 = var0 = (Object)new int[var1_1];
                                                                                                                    v0[0] = false;
                                                                                                                    v0[1] = true;
                                                                                                                    v0[2] = false;
                                                                                                                    v0[3] = false;
                                                                                                                    v0[4] = false;
                                                                                                                    v0[5] = 2;
                                                                                                                    return var0;
                                                                                                                }
                                                                                                                break block486;
                                                                                                            }
                                                                                                            case 2148: {
                                                                                                                var4_6 = "CG";
                                                                                                                var5_245 = var0.equals(var4_6);
                                                                                                                if (!var5_245) break block486;
                                                                                                                ** GOTO lbl2011
                                                                                                            }
                                                                                                            case 2147: {
                                                                                                                var4_7 = "CF";
                                                                                                                var5_246 = var0.equals(var4_7);
                                                                                                                if (var5_246) {
                                                                                                                    v1 = var0 = (Object)new int[var1_1];
                                                                                                                    v1[0] = 4;
                                                                                                                    v1[1] = 2;
                                                                                                                    v1[2] = 4;
                                                                                                                    v1[3] = 2;
                                                                                                                    v1[4] = 2;
                                                                                                                    v1[5] = 2;
                                                                                                                    return var0;
                                                                                                                }
                                                                                                                break block486;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    case 2130: {
                                                                                                        var4_8 = "BT";
                                                                                                        var5_247 = var0.equals(var4_8);
                                                                                                        if (var5_247) {
                                                                                                            v2 = var0 = (Object)new int[var1_1];
                                                                                                            v2[0] = 3;
                                                                                                            v2[1] = true;
                                                                                                            v2[2] = 2;
                                                                                                            v2[3] = 2;
                                                                                                            v2[4] = 3;
                                                                                                            v2[5] = 2;
                                                                                                            return var0;
                                                                                                        }
                                                                                                        break block486;
                                                                                                    }
                                                                                                    case 2129: {
                                                                                                        var4_9 = "BS";
                                                                                                        var5_248 = var0.equals(var4_9);
                                                                                                        if (var5_248) {
                                                                                                            v3 = var0 = (Object)new int[var1_1];
                                                                                                            v3[0] = 3;
                                                                                                            v3[1] = 2;
                                                                                                            v3[2] = true;
                                                                                                            v3[3] = true;
                                                                                                            v3[4] = 2;
                                                                                                            v3[5] = 2;
                                                                                                            return var0;
                                                                                                        }
                                                                                                        break block486;
                                                                                                    }
                                                                                                    case 2128: {
                                                                                                        var4_10 = "BR";
                                                                                                        var5_249 = var0.equals(var4_10);
                                                                                                        if (var5_249) {
                                                                                                            v4 = var0 = (Object)new int[var1_1];
                                                                                                            v4[0] = true;
                                                                                                            v4[1] = true;
                                                                                                            v4[2] = true;
                                                                                                            v4[3] = true;
                                                                                                            v4[4] = 2;
                                                                                                            v4[5] = 4;
                                                                                                            return var0;
                                                                                                        }
                                                                                                        break block486;
                                                                                                    }
                                                                                                    case 2127: {
                                                                                                        var4_11 = "BQ";
                                                                                                        var5_250 = var0.equals(var4_11);
                                                                                                        if (!var5_250) break block486;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break block487;
                                                                                            }
                                                                                            case 2125: {
                                                                                                var4_12 = "BO";
                                                                                                var5_251 = var0.equals(var4_12);
                                                                                                if (var5_251) {
                                                                                                    v5 = var0 = (Object)new int[var1_1];
                                                                                                    v5[0] = true;
                                                                                                    v5[1] = 2;
                                                                                                    v5[2] = 4;
                                                                                                    v5[3] = 4;
                                                                                                    v5[4] = 2;
                                                                                                    v5[5] = 2;
                                                                                                    return var0;
                                                                                                }
                                                                                                break block486;
                                                                                            }
                                                                                            case 2124: {
                                                                                                var4_13 = "BN";
                                                                                                var5_252 = var0.equals(var4_13);
                                                                                                if (var5_252) {
                                                                                                    v6 = var0 = (Object)new int[var1_1];
                                                                                                    v6[0] = 3;
                                                                                                    v6[1] = 2;
                                                                                                    v6[2] = false;
                                                                                                    v6[3] = false;
                                                                                                    v6[4] = 2;
                                                                                                    v6[5] = 2;
                                                                                                    return var0;
                                                                                                }
                                                                                                break block486;
                                                                                            }
                                                                                            case 2123: {
                                                                                                var4_14 = "BM";
                                                                                                var5_253 = var0.equals(var4_14);
                                                                                                if (var5_253) {
                                                                                                    v7 = var0 = (Object)new int[var1_1];
                                                                                                    v7[0] = false;
                                                                                                    v7[1] = 2;
                                                                                                    v7[2] = false;
                                                                                                    v7[3] = false;
                                                                                                    v7[4] = 2;
                                                                                                    v7[5] = 2;
                                                                                                    return var0;
                                                                                                }
                                                                                                break block486;
                                                                                            }
                                                                                            case 2122: {
                                                                                                var4_15 = "BL";
                                                                                                var5_254 = var0.equals(var4_15);
                                                                                                if (!var5_254) break block486;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ** GOTO lbl1136
                                                                                    }
                                                                                    case 2100: {
                                                                                        var4_16 = "AU";
                                                                                        var5_255 = var0.equals(var4_16);
                                                                                        if (var5_255) {
                                                                                            v8 = var0 = (Object)new int[var1_1];
                                                                                            v8[0] = false;
                                                                                            v8[1] = 3;
                                                                                            v8[2] = true;
                                                                                            v8[3] = true;
                                                                                            v8[4] = 3;
                                                                                            v8[5] = false;
                                                                                            return var0;
                                                                                        }
                                                                                        break block486;
                                                                                    }
                                                                                    case 2099: {
                                                                                        var4_17 = "AT";
                                                                                        var5_256 = var0.equals(var4_17);
                                                                                        if (!var5_256) break block486;
                                                                                        ** GOTO lbl2024
                                                                                    }
                                                                                    case 2098: {
                                                                                        var4_18 = "AS";
                                                                                        var5_257 = var0.equals(var4_18);
                                                                                        if (var5_257) {
                                                                                            v9 = var0 = (Object)new int[var1_1];
                                                                                            v9[0] = 2;
                                                                                            v9[1] = 2;
                                                                                            v9[2] = 3;
                                                                                            v9[3] = 3;
                                                                                            v9[4] = 2;
                                                                                            v9[5] = 2;
                                                                                            return var0;
                                                                                        }
                                                                                        break block486;
                                                                                    }
                                                                                    case 2097: {
                                                                                        var4_19 = "AR";
                                                                                        var5_258 = var0.equals(var4_19);
                                                                                        if (var5_258) {
                                                                                            v10 = var0 = (Object)new int[var1_1];
                                                                                            v10[0] = 2;
                                                                                            v10[1] = 2;
                                                                                            v10[2] = 2;
                                                                                            v10[3] = 2;
                                                                                            v10[4] = true;
                                                                                            v10[5] = 2;
                                                                                            return var0;
                                                                                        }
                                                                                        break block486;
                                                                                    }
                                                                                    case 2096: {
                                                                                        var4_20 = "AQ";
                                                                                        var5_259 = var0.equals(var4_20);
                                                                                        if (!var5_259) break block486;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                ** GOTO lbl1998
                                                                            }
                                                                            case 2877: {
                                                                                var4_21 = "ZW";
                                                                                var5_260 = var0.equals(var4_21);
                                                                                if (!var5_260) break block486;
                                                                                ** GOTO lbl668
                                                                            }
                                                                            case 2867: {
                                                                                var4_22 = "ZM";
                                                                                var5_261 = var0.equals(var4_22);
                                                                                if (var5_261) {
                                                                                    v11 = var0 = (Object)new int[var1_1];
                                                                                    v11[0] = 4;
                                                                                    v11[1] = 4;
                                                                                    v11[2] = 4;
                                                                                    v11[3] = 3;
                                                                                    v11[4] = 2;
                                                                                    v11[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2855: {
                                                                                var4_23 = "ZA";
                                                                                var5_262 = var0.equals(var4_23);
                                                                                if (var5_262) {
                                                                                    v12 = var0 = (Object)new int[var1_1];
                                                                                    v12[0] = 2;
                                                                                    v12[1] = 4;
                                                                                    v12[2] = 2;
                                                                                    v12[3] = true;
                                                                                    v12[4] = true;
                                                                                    v12[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2843: {
                                                                                var4_24 = "YT";
                                                                                var5_263 = var0.equals(var4_24);
                                                                                if (!var5_263) break block486;
                                                                                ** GOTO lbl1004
                                                                            }
                                                                            case 2828: {
                                                                                var4_25 = "YE";
                                                                                var5_264 = var0.equals(var4_25);
                                                                                if (!var5_264) break block486;
                                                                                ** GOTO lbl2296
                                                                            }
                                                                            case 2803: {
                                                                                var4_26 = "XK";
                                                                                var5_265 = var0.equals(var4_26);
                                                                                if (var5_265) {
                                                                                    v13 = var0 = (Object)new int[var1_1];
                                                                                    v13[0] = true;
                                                                                    v13[1] = 2;
                                                                                    v13[2] = true;
                                                                                    v13[3] = true;
                                                                                    v13[4] = 2;
                                                                                    v13[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2780: {
                                                                                var4_27 = "WS";
                                                                                var5_266 = var0.equals(var4_27);
                                                                                if (!var5_266) break block486;
                                                                                ** GOTO lbl1030
                                                                            }
                                                                            case 2767: {
                                                                                var4_28 = "WF";
                                                                                var5_267 = var0.equals(var4_28);
                                                                                if (!var5_267) break block486;
                                                                                ** GOTO lbl1198
                                                                            }
                                                                            case 2751: {
                                                                                var4_29 = "VU";
                                                                                var5_268 = var0.equals(var4_29);
                                                                                if (!var5_268) break block486;
                                                                                ** GOTO lbl1425
                                                                            }
                                                                            case 2744: {
                                                                                var4_30 = "VN";
                                                                                var5_269 = var0.equals(var4_30);
                                                                                if (var5_269) {
                                                                                    v14 = var0 = (Object)new int[var1_1];
                                                                                    v14[0] = false;
                                                                                    v14[1] = false;
                                                                                    v14[2] = true;
                                                                                    v14[3] = 2;
                                                                                    v14[4] = 2;
                                                                                    v14[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2739: {
                                                                                var4_31 = "VI";
                                                                                var5_270 = var0.equals(var4_31);
                                                                                if (var5_270) {
                                                                                    v15 = var0 = (Object)new int[var1_1];
                                                                                    v15[0] = false;
                                                                                    v15[1] = 2;
                                                                                    v15[2] = true;
                                                                                    v15[3] = 2;
                                                                                    v15[4] = 2;
                                                                                    v15[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2737: {
                                                                                var4_32 = "VG";
                                                                                var5_271 = var0.equals(var4_32);
                                                                                if (var5_271) {
                                                                                    v16 = var0 = (Object)new int[var1_1];
                                                                                    v16[0] = 2;
                                                                                    v16[1] = 2;
                                                                                    v16[2] = true;
                                                                                    v16[3] = true;
                                                                                    v16[4] = 2;
                                                                                    v16[5] = 4;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2735: {
                                                                                var4_33 = "VE";
                                                                                var5_272 = var0.equals(var4_33);
                                                                                if (!var5_272) break block486;
                                                                                ** GOTO lbl2296
                                                                            }
                                                                            case 2733: {
                                                                                var4_34 = "VC";
                                                                                var5_273 = var0.equals(var4_34);
                                                                                if (!var5_273) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2731: {
                                                                                var4_35 = "VA";
                                                                                var5_274 = var0.equals(var4_35);
                                                                                if (!var5_274) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2725: {
                                                                                var4_36 = "UZ";
                                                                                var5_275 = var0.equals(var4_36);
                                                                                if (var5_275) {
                                                                                    v17 = var0 = (Object)new int[var1_1];
                                                                                    v17[0] = true;
                                                                                    v17[1] = 2;
                                                                                    v17[2] = 3;
                                                                                    v17[3] = 4;
                                                                                    v17[4] = 3;
                                                                                    v17[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2724: {
                                                                                var4_37 = "UY";
                                                                                var5_276 = var0.equals(var4_37);
                                                                                if (var5_276) {
                                                                                    v18 = var0 = (Object)new int[var1_1];
                                                                                    v18[0] = 2;
                                                                                    v18[1] = true;
                                                                                    v18[2] = true;
                                                                                    v18[3] = 2;
                                                                                    v18[4] = true;
                                                                                    v18[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2718: {
                                                                                var4_38 = "US";
                                                                                var5_277 = var0.equals(var4_38);
                                                                                if (var5_277) {
                                                                                    v19 = var0 = (Object)new int[var1_1];
                                                                                    v19[0] = 2;
                                                                                    v19[1] = 2;
                                                                                    v19[2] = 4;
                                                                                    v19[3] = true;
                                                                                    v19[4] = 3;
                                                                                    v19[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2706: {
                                                                                var4_39 = "UG";
                                                                                var5_278 = var0.equals(var4_39);
                                                                                if (var5_278) {
                                                                                    v20 = var0 = (Object)new int[var1_1];
                                                                                    v20[0] = 3;
                                                                                    v20[1] = 3;
                                                                                    v20[2] = 2;
                                                                                    v20[3] = 3;
                                                                                    v20[4] = 4;
                                                                                    v20[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2700: {
                                                                                var4_40 = "UA";
                                                                                var5_279 = var0.equals(var4_40);
                                                                                if (!var5_279) break block486;
                                                                                ** GOTO lbl2257
                                                                            }
                                                                            case 2694: {
                                                                                var4_41 = "TZ";
                                                                                var5_280 = var0.equals(var4_41);
                                                                                if (var5_280) {
                                                                                    v21 = var0 = (Object)new int[var1_1];
                                                                                    v21[0] = 3;
                                                                                    v21[1] = 4;
                                                                                    v21[2] = 2;
                                                                                    v21[3] = true;
                                                                                    v21[4] = 3;
                                                                                    v21[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2691: {
                                                                                var4_42 = "TW";
                                                                                var5_281 = var0.equals(var4_42);
                                                                                if (var5_281) {
                                                                                    v22 = var0 = (Object)new int[var1_1];
                                                                                    v22[0] = false;
                                                                                    v22[1] = false;
                                                                                    v22[2] = false;
                                                                                    v22[3] = false;
                                                                                    v22[4] = false;
                                                                                    v22[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2690: {
                                                                                var4_43 = "TV";
                                                                                var5_282 = var0.equals(var4_43);
                                                                                if (!var5_282) break block486;
                                                                                ** GOTO lbl1198
                                                                            }
                                                                            case 2688: {
                                                                                var4_44 = "TT";
                                                                                var5_283 = var0.equals(var4_44);
                                                                                if (var5_283) {
                                                                                    v23 = var0 = (Object)new int[var1_1];
                                                                                    v23[0] = 2;
                                                                                    v23[1] = 4;
                                                                                    v23[2] = true;
                                                                                    v23[3] = false;
                                                                                    v23[4] = 2;
                                                                                    v23[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2686: {
                                                                                var4_45 = "TR";
                                                                                var5_284 = var0.equals(var4_45);
                                                                                if (!var5_284) break block486;
                                                                                break block489;
                                                                            }
                                                                            case 2683: {
                                                                                var4_46 = "TO";
                                                                                var5_285 = var0.equals(var4_46);
                                                                                if (var5_285) {
                                                                                    v24 = var0 = (Object)new int[var1_1];
                                                                                    v24[0] = 3;
                                                                                    v24[1] = 2;
                                                                                    v24[2] = 4;
                                                                                    v24[3] = 3;
                                                                                    v24[4] = 2;
                                                                                    v24[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2682: {
                                                                                var4_47 = "TN";
                                                                                var5_286 = var0.equals(var4_47);
                                                                                if (var5_286) {
                                                                                    v25 = var0 = (Object)new int[var1_1];
                                                                                    v25[0] = 3;
                                                                                    v25[1] = true;
                                                                                    v25[2] = true;
                                                                                    v25[3] = true;
                                                                                    v25[4] = 2;
                                                                                    v25[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2681: {
                                                                                var4_48 = "TM";
                                                                                var5_287 = var0.equals(var4_48);
                                                                                if (!var5_287) break block486;
                                                                                ** GOTO lbl1198
                                                                            }
                                                                            case 2680: {
                                                                                var4_49 = "TL";
                                                                                var5_288 = var0.equals(var4_49);
                                                                                if (!var5_288) break block486;
                                                                                ** GOTO lbl2161
                                                                            }
                                                                            case 2678: {
                                                                                var4_50 = "TJ";
                                                                                var5_289 = var0.equals(var4_50);
                                                                                if (!var5_289) break block486;
                                                                                ** GOTO lbl2050
                                                                            }
                                                                            case 2676: {
                                                                                var4_51 = "TH";
                                                                                var5_290 = var0.equals(var4_51);
                                                                                if (!var5_290) break block486;
                                                                                ** GOTO lbl2226
                                                                            }
                                                                            case 2675: {
                                                                                var4_52 = "TG";
                                                                                var5_291 = var0.equals(var4_52);
                                                                                if (var5_291) {
                                                                                    v26 = var0 = (Object)new int[var1_1];
                                                                                    v26[0] = 3;
                                                                                    v26[1] = 4;
                                                                                    v26[2] = true;
                                                                                    v26[3] = false;
                                                                                    v26[4] = 2;
                                                                                    v26[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2672: {
                                                                                var4_53 = "TD";
                                                                                var5_292 = var0.equals(var4_53);
                                                                                if (!var5_292) break block486;
                                                                                ** GOTO lbl2335
                                                                            }
                                                                            case 2671: {
                                                                                var4_54 = "TC";
                                                                                var5_293 = var0.equals(var4_54);
                                                                                if (var5_293) {
                                                                                    v27 = var0 = (Object)new int[var1_1];
                                                                                    v27[0] = 3;
                                                                                    v27[1] = 2;
                                                                                    v27[2] = true;
                                                                                    v27[3] = 2;
                                                                                    v27[4] = 2;
                                                                                    v27[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2663: {
                                                                                var4_55 = "SZ";
                                                                                var5_294 = var0.equals(var4_55);
                                                                                if (!var5_294) break block486;
                                                                                ** GOTO lbl2418
                                                                            }
                                                                            case 2662: {
                                                                                var4_56 = "SY";
                                                                                var5_295 = var0.equals(var4_56);
                                                                                if (!var5_295) break block486;
                                                                                ** GOTO lbl2335
                                                                            }
                                                                            case 2661: {
                                                                                var4_57 = "SX";
                                                                                var5_296 = var0.equals(var4_57);
                                                                                if (!var5_296) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2659: {
                                                                                var4_58 = "SV";
                                                                                var5_297 = var0.equals(var4_58);
                                                                                if (var5_297) {
                                                                                    v28 = var0 = (Object)new int[var1_1];
                                                                                    v28[0] = 2;
                                                                                    v28[1] = 3;
                                                                                    v28[2] = 2;
                                                                                    v28[3] = true;
                                                                                    v28[4] = 2;
                                                                                    v28[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2657: {
                                                                                var4_59 = "ST";
                                                                                var5_298 = var0.equals(var4_59);
                                                                                if (var5_298) {
                                                                                    v29 = var0 = (Object)new int[var1_1];
                                                                                    v29[0] = 2;
                                                                                    v29[1] = 2;
                                                                                    v29[2] = true;
                                                                                    v29[3] = 2;
                                                                                    v29[4] = 2;
                                                                                    v29[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2656: {
                                                                                var4_60 = "SS";
                                                                                var5_299 = var0.equals(var4_60);
                                                                                if (!var5_299) break block486;
                                                                                ** GOTO lbl1764
                                                                            }
                                                                            case 2655: {
                                                                                var4_61 = "SR";
                                                                                var5_300 = var0.equals(var4_61);
                                                                                if (var5_300) {
                                                                                    v30 = var0 = (Object)new int[var1_1];
                                                                                    v30[0] = 2;
                                                                                    v30[1] = 4;
                                                                                    v30[2] = 4;
                                                                                    v30[3] = true;
                                                                                    v30[4] = 2;
                                                                                    v30[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2652: {
                                                                                var4_62 = "SO";
                                                                                var5_301 = var0.equals(var4_62);
                                                                                if (var5_301) {
                                                                                    v31 = var0 = (Object)new int[var1_1];
                                                                                    v31[0] = 2;
                                                                                    v31[1] = 2;
                                                                                    v31[2] = 3;
                                                                                    v31[3] = 4;
                                                                                    v31[4] = 4;
                                                                                    v31[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2651: {
                                                                                var4_63 = "SN";
                                                                                var5_302 = var0.equals(var4_63);
                                                                                if (var5_302) {
                                                                                    v32 = var0 = (Object)new int[var1_1];
                                                                                    v32[0] = 4;
                                                                                    v32[1] = 4;
                                                                                    v32[2] = 3;
                                                                                    v32[3] = 2;
                                                                                    v32[4] = 2;
                                                                                    v32[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2650: {
                                                                                var4_64 = "SM";
                                                                                var5_303 = var0.equals(var4_64);
                                                                                if (!var5_303) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2649: {
                                                                                var4_65 = "SL";
                                                                                var5_304 = var0.equals(var4_65);
                                                                                if (!var5_304) break block486;
                                                                                ** GOTO lbl2374
                                                                            }
                                                                            case 2648: {
                                                                                var4_66 = "SK";
                                                                                var5_305 = var0.equals(var4_66);
                                                                                if (var5_305) {
                                                                                    v33 = var0 = (Object)new int[var1_1];
                                                                                    v33[0] = false;
                                                                                    v33[1] = true;
                                                                                    v33[2] = true;
                                                                                    v33[3] = true;
                                                                                    v33[4] = 2;
                                                                                    v33[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2647: {
                                                                                var4_67 = "SJ";
                                                                                var5_306 = var0.equals(var4_67);
                                                                                if (!var5_306) break block486;
                                                                                ** GOTO lbl1933
                                                                            }
                                                                            case 2646: {
                                                                                var4_68 = "SI";
                                                                                var5_307 = var0.equals(var4_68);
                                                                                if (!var5_307) break block486;
                                                                                ** GOTO lbl2322
                                                                            }
                                                                            case 2645: {
                                                                                var4_69 = "SH";
                                                                                var5_308 = var0.equals(var4_69);
                                                                                if (!var5_308) break block486;
                                                                                ** GOTO lbl1998
                                                                            }
                                                                            case 2644: {
                                                                                var4_70 = "SG";
                                                                                var5_309 = var0.equals(var4_70);
                                                                                if (var5_309) {
                                                                                    v34 = var0 = (Object)new int[var1_1];
                                                                                    v34[0] = 2;
                                                                                    v34[1] = 3;
                                                                                    v34[2] = 3;
                                                                                    v34[3] = 3;
                                                                                    v34[4] = true;
                                                                                    v34[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2642: {
                                                                                var4_71 = "SE";
                                                                                var5_310 = var0.equals(var4_71);
                                                                                if (!var5_310) break block486;
                                                                                ** GOTO lbl2024
                                                                            }
                                                                            case 2641: {
                                                                                var4_72 = "SD";
                                                                                var5_311 = var0.equals(var4_72);
                                                                                if (!var5_311) break block486;
                                                                                ** GOTO lbl2335
                                                                            }
                                                                            case 2640: {
                                                                                var4_73 = "SC";
                                                                                var5_312 = var0.equals(var4_73);
                                                                                if (!var5_312) break block486;
                                                                                ** GOTO lbl1998
                                                                            }
                                                                            case 2639: {
                                                                                var4_74 = "SB";
                                                                                var5_313 = var0.equals(var4_74);
                                                                                if (!var5_313) break block486;
lbl668:
                                                                                // 2 sources

                                                                                v35 = var0 = (Object)new int[var1_1];
                                                                                v35[0] = 4;
                                                                                v35[1] = 2;
                                                                                v35[2] = 4;
                                                                                v35[3] = 3;
                                                                                v35[4] = 2;
                                                                                v35[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2638: {
                                                                                var4_75 = "SA";
                                                                                var5_314 = var0.equals(var4_75);
                                                                                if (var5_314) {
                                                                                    v36 = var0 = (Object)new int[var1_1];
                                                                                    v36[0] = 3;
                                                                                    v36[1] = true;
                                                                                    v36[2] = true;
                                                                                    v36[3] = 2;
                                                                                    v36[4] = 2;
                                                                                    v36[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2629: {
                                                                                var4_76 = "RW";
                                                                                var5_315 = var0.equals(var4_76);
                                                                                if (var5_315) {
                                                                                    v37 = var0 = (Object)new int[var1_1];
                                                                                    v37[0] = 3;
                                                                                    v37[1] = 3;
                                                                                    v37[2] = 2;
                                                                                    v37[3] = false;
                                                                                    v37[4] = 2;
                                                                                    v37[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2627: {
                                                                                var4_77 = "RU";
                                                                                var5_316 = var0.equals(var4_77);
                                                                                if (var5_316) {
                                                                                    v38 = var0 = (Object)new int[var1_1];
                                                                                    v38[0] = true;
                                                                                    v38[1] = false;
                                                                                    v38[2] = false;
                                                                                    v38[3] = true;
                                                                                    v38[4] = 3;
                                                                                    v38[5] = 3;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2625: {
                                                                                var4_78 = "RS";
                                                                                var5_317 = var0.equals(var4_78);
                                                                                if (var5_317) {
                                                                                    v39 = var0 = (Object)new int[var1_1];
                                                                                    v39[0] = true;
                                                                                    v39[1] = false;
                                                                                    v39[2] = false;
                                                                                    v39[3] = true;
                                                                                    v39[4] = 2;
                                                                                    v39[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2621: {
                                                                                var4_79 = "RO";
                                                                                var5_318 = var0.equals(var4_79);
                                                                                if (var5_318) {
                                                                                    v40 = var0 = (Object)new int[var1_1];
                                                                                    v40[0] = false;
                                                                                    v40[1] = false;
                                                                                    v40[2] = true;
                                                                                    v40[3] = true;
                                                                                    v40[4] = 3;
                                                                                    v40[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2611: {
                                                                                var4_80 = "RE";
                                                                                var5_319 = var0.equals(var4_80);
                                                                                if (var5_319) {
                                                                                    v41 = var0 = (Object)new int[var1_1];
                                                                                    v41[0] = false;
                                                                                    v41[1] = 3;
                                                                                    v41[2] = 2;
                                                                                    v41[3] = 3;
                                                                                    v41[4] = true;
                                                                                    v41[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2576: {
                                                                                var4_81 = "QA";
                                                                                var5_320 = var0.equals(var4_81);
                                                                                if (var5_320) {
                                                                                    v42 = var0 = (Object)new int[var1_1];
                                                                                    v42[0] = true;
                                                                                    v42[1] = 4;
                                                                                    v42[2] = 4;
                                                                                    v42[3] = 4;
                                                                                    v42[4] = 4;
                                                                                    v42[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2569: {
                                                                                var4_82 = "PY";
                                                                                var5_321 = var0.equals(var4_82);
                                                                                if (!var5_321) break block486;
                                                                                ** GOTO lbl1136
                                                                            }
                                                                            case 2567: {
                                                                                var4_83 = "PW";
                                                                                var5_322 = var0.equals(var4_83);
                                                                                if (var5_322) {
                                                                                    v43 = var0 = (Object)new int[var1_1];
                                                                                    v43[0] = 2;
                                                                                    v43[1] = 2;
                                                                                    v43[2] = 4;
                                                                                    v43[3] = true;
                                                                                    v43[4] = 2;
                                                                                    v43[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2564: {
                                                                                var4_84 = "PT";
                                                                                var5_323 = var0.equals(var4_84);
                                                                                if (!var5_323) break block486;
                                                                                ** GOTO lbl2322
                                                                            }
                                                                            case 2563: {
                                                                                var4_85 = "PS";
                                                                                var5_324 = var0.equals(var4_85);
                                                                                if (var5_324) {
                                                                                    v44 = var0 = (Object)new int[var1_1];
                                                                                    v44[0] = 3;
                                                                                    v44[1] = 4;
                                                                                    v44[2] = true;
                                                                                    v44[3] = 3;
                                                                                    v44[4] = 2;
                                                                                    v44[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2562: {
                                                                                var4_86 = "PR";
                                                                                var5_325 = var0.equals(var4_86);
                                                                                if (var5_325) {
                                                                                    v45 = var0 = (Object)new int[var1_1];
                                                                                    v45[0] = 2;
                                                                                    v45[1] = false;
                                                                                    v45[2] = 2;
                                                                                    v45[3] = true;
                                                                                    v45[4] = 2;
                                                                                    v45[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2557: {
                                                                                var4_87 = "PM";
                                                                                var5_326 = var0.equals(var4_87);
                                                                                if (!var5_326) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2556: {
                                                                                var4_88 = "PL";
                                                                                var5_327 = var0.equals(var4_88);
                                                                                if (var5_327) {
                                                                                    v46 = var0 = (Object)new int[var1_1];
                                                                                    v46[0] = true;
                                                                                    v46[1] = false;
                                                                                    v46[2] = 2;
                                                                                    v46[3] = 2;
                                                                                    v46[4] = 4;
                                                                                    v46[5] = 4;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2555: {
                                                                                var4_89 = "PK";
                                                                                var5_328 = var0.equals(var4_89);
                                                                                if (var5_328) {
                                                                                    v47 = var0 = (Object)new int[var1_1];
                                                                                    v47[0] = 3;
                                                                                    v47[1] = 3;
                                                                                    v47[2] = 3;
                                                                                    v47[3] = 3;
                                                                                    v47[4] = 2;
                                                                                    v47[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2552: {
                                                                                var4_90 = "PH";
                                                                                var5_329 = var0.equals(var4_90);
                                                                                if (var5_329) {
                                                                                    v48 = var0 = (Object)new int[var1_1];
                                                                                    v48[0] = 2;
                                                                                    v48[1] = true;
                                                                                    v48[2] = 2;
                                                                                    v48[3] = 3;
                                                                                    v48[4] = 2;
                                                                                    v48[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2551: {
                                                                                var4_91 = "PG";
                                                                                var5_330 = var0.equals(var4_91);
                                                                                if (!var5_330) break block486;
                                                                                ** GOTO lbl1309
                                                                            }
                                                                            case 2550: {
                                                                                var4_92 = "PF";
                                                                                var5_331 = var0.equals(var4_92);
                                                                                if (var5_331) {
                                                                                    v49 = var0 = (Object)new int[var1_1];
                                                                                    v49[0] = 2;
                                                                                    v49[1] = 2;
                                                                                    v49[2] = 3;
                                                                                    v49[3] = true;
                                                                                    v49[4] = 2;
                                                                                    v49[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2549: {
                                                                                var4_93 = "PE";
                                                                                var5_332 = var0.equals(var4_93);
                                                                                if (var5_332) {
                                                                                    v50 = var0 = (Object)new int[var1_1];
                                                                                    v50[0] = true;
                                                                                    v50[1] = 2;
                                                                                    v50[2] = 4;
                                                                                    v50[3] = 4;
                                                                                    v50[4] = 3;
                                                                                    v50[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2545: {
                                                                                var4_94 = "PA";
                                                                                var5_333 = var0.equals(var4_94);
                                                                                if (!var5_333) break block486;
                                                                                break block490;
                                                                            }
                                                                            case 2526: {
                                                                                var4_95 = "OM";
                                                                                var5_334 = var0.equals(var4_95);
                                                                                if (var5_334) {
                                                                                    v51 = var0 = (Object)new int[var1_1];
                                                                                    v51[0] = 2;
                                                                                    v51[1] = 3;
                                                                                    v51[2] = true;
                                                                                    v51[3] = 2;
                                                                                    v51[4] = 4;
                                                                                    v51[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2508: {
                                                                                var4_96 = "NZ";
                                                                                var5_335 = var0.equals(var4_96);
                                                                                if (var5_335) {
                                                                                    v52 = var0 = (Object)new int[var1_1];
                                                                                    v52[0] = false;
                                                                                    v52[1] = false;
                                                                                    v52[2] = true;
                                                                                    v52[3] = 2;
                                                                                    v52[4] = 4;
                                                                                    v52[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2503: {
                                                                                var4_97 = "NU";
                                                                                var5_336 = var0.equals(var4_97);
                                                                                if (!var5_336) break block486;
                                                                                ** GOTO lbl1998
                                                                            }
                                                                            case 2500: {
                                                                                var4_98 = "NR";
                                                                                var5_337 = var0.equals(var4_98);
                                                                                if (!var5_337) break block486;
                                                                                ** GOTO lbl2161
                                                                            }
                                                                            case 2498: {
                                                                                var4_99 = "NP";
                                                                                var5_338 = var0.equals(var4_99);
                                                                                if (var5_338) {
                                                                                    v53 = var0 = (Object)new int[var1_1];
                                                                                    v53[0] = 2;
                                                                                    v53[1] = 2;
                                                                                    v53[2] = 4;
                                                                                    v53[3] = 3;
                                                                                    v53[4] = 2;
                                                                                    v53[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2497: {
                                                                                var4_100 = "NO";
                                                                                var5_339 = var0.equals(var4_100);
                                                                                if (var5_339) {
                                                                                    v54 = var0 = (Object)new int[var1_1];
                                                                                    v54[0] = false;
                                                                                    v54[1] = false;
                                                                                    v54[2] = 3;
                                                                                    v54[3] = false;
                                                                                    v54[4] = false;
                                                                                    v54[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2494: {
                                                                                var4_101 = "NL";
                                                                                var5_340 = var0.equals(var4_101);
                                                                                if (var5_340) {
                                                                                    v55 = var0 = (Object)new int[var1_1];
                                                                                    v55[0] = 2;
                                                                                    v55[1] = true;
                                                                                    v55[2] = 4;
                                                                                    v55[3] = 3;
                                                                                    v55[4] = false;
                                                                                    v55[5] = 4;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2491: {
                                                                                var4_102 = "NI";
                                                                                var5_341 = var0.equals(var4_102);
                                                                                if (!var5_341) break block486;
                                                                                ** GOTO lbl2174
                                                                            }
                                                                            case 2489: {
                                                                                var4_103 = "NG";
                                                                                var5_342 = var0.equals(var4_103);
                                                                                if (var5_342) {
                                                                                    v56 = var0 = (Object)new int[var1_1];
                                                                                    v56[0] = 3;
                                                                                    v56[1] = 4;
                                                                                    v56[2] = 2;
                                                                                    v56[3] = true;
                                                                                    v56[4] = 2;
                                                                                    v56[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2488: {
                                                                                var4_104 = "NF";
                                                                                var5_343 = var0.equals(var4_104);
                                                                                if (!var5_343) break block486;
                                                                                ** GOTO lbl1933
                                                                            }
                                                                            case 2487: {
                                                                                var4_105 = "NE";
                                                                                var5_344 = var0.equals(var4_105);
                                                                                if (!var5_344) break block486;
                                                                                ** GOTO lbl2296
                                                                            }
                                                                            case 2485: {
                                                                                var4_106 = "NC";
                                                                                var5_345 = var0.equals(var4_106);
                                                                                if (!var5_345) break block486;
lbl1004:
                                                                                // 2 sources

                                                                                v57 = var0 = (Object)new int[var1_1];
                                                                                v57[0] = 2;
                                                                                v57[1] = 3;
                                                                                v57[2] = 3;
                                                                                v57[3] = 4;
                                                                                v57[4] = 2;
                                                                                v57[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2483: {
                                                                                var4_107 = "NA";
                                                                                var5_346 = var0.equals(var4_107);
                                                                                if (var5_346) {
                                                                                    v58 = var0 = (Object)new int[var1_1];
                                                                                    v58[0] = 3;
                                                                                    v58[1] = 4;
                                                                                    v58[2] = 3;
                                                                                    v58[3] = 2;
                                                                                    v58[4] = 2;
                                                                                    v58[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2477: {
                                                                                var4_108 = "MZ";
                                                                                var5_347 = var0.equals(var4_108);
                                                                                if (!var5_347) break block486;
lbl1030:
                                                                                // 2 sources

                                                                                v59 = var0 = (Object)new int[var1_1];
                                                                                v59[0] = 3;
                                                                                v59[1] = true;
                                                                                v59[2] = 2;
                                                                                v59[3] = 2;
                                                                                v59[4] = 2;
                                                                                v59[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2476: {
                                                                                var4_109 = "MY";
                                                                                var5_348 = var0.equals(var4_109);
                                                                                if (var5_348) {
                                                                                    v60 = var0 = (Object)new int[var1_1];
                                                                                    v60[0] = true;
                                                                                    v60[1] = false;
                                                                                    v60[2] = 4;
                                                                                    v60[3] = true;
                                                                                    v60[4] = true;
                                                                                    v60[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2475: {
                                                                                var4_110 = "MX";
                                                                                var5_349 = var0.equals(var4_110);
                                                                                if (var5_349) {
                                                                                    v61 = var0 = (Object)new int[var1_1];
                                                                                    v61[0] = 2;
                                                                                    v61[1] = 4;
                                                                                    v61[2] = 4;
                                                                                    v61[3] = 4;
                                                                                    v61[4] = 3;
                                                                                    v61[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2474: {
                                                                                var4_111 = "MW";
                                                                                var5_350 = var0.equals(var4_111);
                                                                                if (var5_350) {
                                                                                    v62 = var0 = (Object)new int[var1_1];
                                                                                    v62[0] = 3;
                                                                                    v62[1] = 2;
                                                                                    v62[2] = 2;
                                                                                    v62[3] = true;
                                                                                    v62[4] = 2;
                                                                                    v62[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2473: {
                                                                                var4_112 = "MV";
                                                                                var5_351 = var0.equals(var4_112);
                                                                                if (var5_351) {
                                                                                    v63 = var0 = (Object)new int[var1_1];
                                                                                    v63[0] = 3;
                                                                                    v63[1] = 2;
                                                                                    v63[2] = true;
                                                                                    v63[3] = 3;
                                                                                    v63[4] = 4;
                                                                                    v63[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2472: {
                                                                                var4_113 = "MU";
                                                                                var5_352 = var0.equals(var4_113);
                                                                                if (var5_352) {
                                                                                    v64 = var0 = (Object)new int[var1_1];
                                                                                    v64[0] = 3;
                                                                                    v64[1] = true;
                                                                                    v64[2] = false;
                                                                                    v64[3] = 2;
                                                                                    v64[4] = 2;
                                                                                    v64[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2471: {
                                                                                var4_114 = "MT";
                                                                                var5_353 = var0.equals(var4_114);
                                                                                if (!var5_353) break block486;
                                                                                ** GOTO lbl2024
                                                                            }
                                                                            case 2470: {
                                                                                var4_115 = "MS";
                                                                                var5_354 = var0.equals(var4_115);
                                                                                if (!var5_354) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2469: {
                                                                                var4_116 = "MR";
                                                                                var5_355 = var0.equals(var4_116);
                                                                                if (!var5_355) break block486;
                                                                                ** GOTO lbl2213
                                                                            }
                                                                            case 2468: {
                                                                                var4_117 = "MQ";
                                                                                var5_356 = var0.equals(var4_117);
                                                                                if (var5_356) {
                                                                                    v65 = var0 = (Object)new int[var1_1];
                                                                                    v65[0] = 2;
                                                                                    v65[1] = true;
                                                                                    v65[2] = 2;
                                                                                    v65[3] = 3;
                                                                                    v65[4] = 2;
                                                                                    v65[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2467: {
                                                                                var4_118 = "MP";
                                                                                var5_357 = var0.equals(var4_118);
                                                                                if (!var5_357) break block486;
lbl1136:
                                                                                // 3 sources

                                                                                v66 = var0 = (Object)new int[var1_1];
                                                                                v66[0] = true;
                                                                                v66[1] = 2;
                                                                                v66[2] = 2;
                                                                                v66[3] = 2;
                                                                                v66[4] = 2;
                                                                                v66[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2466: {
                                                                                var4_119 = "MO";
                                                                                var5_358 = var0.equals(var4_119);
                                                                                if (var5_358) {
                                                                                    v67 = var0 = (Object)new int[var1_1];
                                                                                    v67[0] = false;
                                                                                    v67[1] = 2;
                                                                                    v67[2] = 4;
                                                                                    v67[3] = 4;
                                                                                    v67[4] = 3;
                                                                                    v67[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2465: {
                                                                                var4_120 = "MN";
                                                                                var5_359 = var0.equals(var4_120);
                                                                                if (var5_359) {
                                                                                    v68 = var0 = (Object)new int[var1_1];
                                                                                    v68[0] = 2;
                                                                                    v68[1] = false;
                                                                                    v68[2] = 2;
                                                                                    v68[3] = 2;
                                                                                    v68[4] = 2;
                                                                                    v68[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2464: {
                                                                                var4_121 = "MM";
                                                                                var5_360 = var0.equals(var4_121);
                                                                                if (!var5_360) break block486;
                                                                                ** GOTO lbl1327
                                                                            }
                                                                            case 2463: {
                                                                                var4_122 = "ML";
                                                                                var5_361 = var0.equals(var4_122);
                                                                                if (!var5_361) break block486;
                                                                                ** GOTO lbl2244
                                                                            }
                                                                            case 2462: {
                                                                                var4_123 = "MK";
                                                                                var5_362 = var0.equals(var4_123);
                                                                                if (var5_362) {
                                                                                    v69 = var0 = (Object)new int[var1_1];
                                                                                    v69[0] = true;
                                                                                    v69[1] = false;
                                                                                    v69[2] = false;
                                                                                    v69[3] = true;
                                                                                    v69[4] = 3;
                                                                                    v69[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2459: {
                                                                                var4_124 = "MH";
                                                                                var5_363 = var0.equals(var4_124);
                                                                                if (!var5_363) break block486;
lbl1198:
                                                                                // 4 sources

                                                                                v70 = var0 = (Object)new int[var1_1];
                                                                                v70[0] = 4;
                                                                                v70[1] = 2;
                                                                                v70[2] = 2;
                                                                                v70[3] = 4;
                                                                                v70[4] = 2;
                                                                                v70[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2458: {
                                                                                var4_125 = "MG";
                                                                                var5_364 = var0.equals(var4_125);
                                                                                if (!var5_364) break block486;
                                                                                ** GOTO lbl2011
                                                                            }
                                                                            case 2457: {
                                                                                var4_126 = "MF";
                                                                                var5_365 = var0.equals(var4_126);
                                                                                if (var5_365) {
                                                                                    v71 = var0 = (Object)new int[var1_1];
                                                                                    v71[0] = true;
                                                                                    v71[1] = 2;
                                                                                    v71[2] = 2;
                                                                                    v71[3] = 3;
                                                                                    v71[4] = 2;
                                                                                    v71[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2456: {
                                                                                var4_127 = "ME";
                                                                                var5_366 = var0.equals(var4_127);
                                                                                if (var5_366) {
                                                                                    v72 = var0 = (Object)new int[var1_1];
                                                                                    v72[0] = 2;
                                                                                    v72[1] = false;
                                                                                    v72[2] = false;
                                                                                    v72[3] = true;
                                                                                    v72[4] = 3;
                                                                                    v72[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2455: {
                                                                                var4_128 = "MD";
                                                                                var5_367 = var0.equals(var4_128);
                                                                                if (var5_367) {
                                                                                    v73 = var0 = (Object)new int[var1_1];
                                                                                    v73[0] = true;
                                                                                    v73[1] = false;
                                                                                    v73[2] = false;
                                                                                    v73[3] = false;
                                                                                    v73[4] = 2;
                                                                                    v73[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2454: {
                                                                                var4_129 = "MC";
                                                                                var5_368 = var0.equals(var4_129);
                                                                                if (!var5_368) break block486;
                                                                                ** GOTO lbl1777
                                                                            }
                                                                            case 2452: {
                                                                                var4_130 = "MA";
                                                                                var5_369 = var0.equals(var4_130);
                                                                                if (var5_369) {
                                                                                    v74 = var0 = (Object)new int[var1_1];
                                                                                    v74[0] = 3;
                                                                                    v74[1] = 3;
                                                                                    v74[2] = true;
                                                                                    v74[3] = true;
                                                                                    v74[4] = 2;
                                                                                    v74[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2445: {
                                                                                var4_131 = "LY";
                                                                                var5_370 = var0.equals(var4_131);
                                                                                if (!var5_370) break block486;
                                                                                ** GOTO lbl2374
                                                                            }
                                                                            case 2442: {
                                                                                var4_132 = "LV";
                                                                                var5_371 = var0.equals(var4_132);
                                                                                if (!var5_371) break block486;
                                                                                ** GOTO lbl2024
                                                                            }
                                                                            case 2441: {
                                                                                var4_133 = "LU";
                                                                                var5_372 = var0.equals(var4_133);
                                                                                if (var5_372) {
                                                                                    v75 = var0 = (Object)new int[var1_1];
                                                                                    v75[0] = 4;
                                                                                    v75[1] = false;
                                                                                    v75[2] = 3;
                                                                                    v75[3] = 2;
                                                                                    v75[4] = true;
                                                                                    v75[5] = 3;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2440: {
                                                                                var4_134 = "LT";
                                                                                var5_373 = var0.equals(var4_134);
                                                                                if (var5_373) {
                                                                                    v76 = var0 = (Object)new int[var1_1];
                                                                                    v76[0] = false;
                                                                                    v76[1] = true;
                                                                                    v76[2] = false;
                                                                                    v76[3] = true;
                                                                                    v76[4] = false;
                                                                                    v76[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2439: {
                                                                                var4_135 = "LS";
                                                                                var5_374 = var0.equals(var4_135);
                                                                                if (!var5_374) break block486;
lbl1309:
                                                                                // 2 sources

                                                                                v77 = var0 = (Object)new int[var1_1];
                                                                                v77[0] = 4;
                                                                                v77[1] = 3;
                                                                                v77[2] = 3;
                                                                                v77[3] = 3;
                                                                                v77[4] = 2;
                                                                                v77[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2438: {
                                                                                var4_136 = "LR";
                                                                                var5_375 = var0.equals(var4_136);
                                                                                if (!var5_375) break block486;
                                                                                ** GOTO lbl2063
                                                                            }
                                                                            case 2431: {
                                                                                var4_137 = "LK";
                                                                                var5_376 = var0.equals(var4_137);
                                                                                if (!var5_376) break block486;
lbl1327:
                                                                                // 2 sources

                                                                                v78 = var0 = (Object)new int[var1_1];
                                                                                v78[0] = 3;
                                                                                v78[1] = 2;
                                                                                v78[2] = 3;
                                                                                v78[3] = 3;
                                                                                v78[4] = 4;
                                                                                v78[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2429: {
                                                                                var4_138 = "LI";
                                                                                var5_377 = var0.equals(var4_138);
                                                                                if (!var5_377) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2423: {
                                                                                var4_139 = "LC";
                                                                                var5_378 = var0.equals(var4_139);
                                                                                if (var5_378) {
                                                                                    v79 = var0 = (Object)new int[var1_1];
                                                                                    v79[0] = 2;
                                                                                    v79[1] = 2;
                                                                                    v79[2] = true;
                                                                                    v79[3] = true;
                                                                                    v79[4] = 2;
                                                                                    v79[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2422: {
                                                                                var4_140 = "LB";
                                                                                var5_379 = var0.equals(var4_140);
                                                                                if (var5_379) {
                                                                                    v80 = var0 = (Object)new int[var1_1];
                                                                                    v80[0] = 3;
                                                                                    v80[1] = true;
                                                                                    v80[2] = true;
                                                                                    v80[3] = 2;
                                                                                    v80[4] = 2;
                                                                                    v80[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2421: {
                                                                                var4_141 = "LA";
                                                                                var5_380 = var0.equals(var4_141);
                                                                                if (var5_380) {
                                                                                    v81 = var0 = (Object)new int[var1_1];
                                                                                    v81[0] = true;
                                                                                    v81[1] = 2;
                                                                                    v81[2] = true;
                                                                                    v81[3] = 3;
                                                                                    v81[4] = 2;
                                                                                    v81[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2415: {
                                                                                var4_142 = "KZ";
                                                                                var5_381 = var0.equals(var4_142);
                                                                                if (var5_381) {
                                                                                    v82 = var0 = (Object)new int[var1_1];
                                                                                    v82[0] = 2;
                                                                                    v82[1] = true;
                                                                                    v82[2] = 2;
                                                                                    v82[3] = 2;
                                                                                    v82[4] = 3;
                                                                                    v82[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2414: {
                                                                                var4_143 = "KY";
                                                                                var5_382 = var0.equals(var4_143);
                                                                                if (!var5_382) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2412: {
                                                                                var4_144 = "KW";
                                                                                var5_383 = var0.equals(var4_144);
                                                                                if (!var5_383) break block486;
                                                                                ** GOTO lbl1642
                                                                            }
                                                                            case 2407: {
                                                                                var4_145 = "KR";
                                                                                var5_384 = var0.equals(var4_145);
                                                                                if (var5_384) {
                                                                                    v83 = var0 = (Object)new int[var1_1];
                                                                                    v83[0] = false;
                                                                                    v83[1] = 2;
                                                                                    v83[2] = 2;
                                                                                    v83[3] = 4;
                                                                                    v83[4] = 4;
                                                                                    v83[5] = 4;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2403: {
                                                                                var4_146 = "KN";
                                                                                var5_385 = var0.equals(var4_146);
                                                                                if (!var5_385) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2402: {
                                                                                var4_147 = "KM";
                                                                                var5_386 = var0.equals(var4_147);
                                                                                if (!var5_386) break block486;
lbl1425:
                                                                                // 2 sources

                                                                                v84 = var0 = (Object)new int[var1_1];
                                                                                v84[0] = 4;
                                                                                v84[1] = 3;
                                                                                v84[2] = 3;
                                                                                v84[3] = 2;
                                                                                v84[4] = 2;
                                                                                v84[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2398: {
                                                                                var4_148 = "KI";
                                                                                var5_387 = var0.equals(var4_148);
                                                                                if (!var5_387) break block486;
                                                                                ** GOTO lbl2161
                                                                            }
                                                                            case 2397: {
                                                                                var4_149 = "KH";
                                                                                var5_388 = var0.equals(var4_149);
                                                                                if (var5_388) {
                                                                                    v85 = var0 = (Object)new int[var1_1];
                                                                                    v85[0] = true;
                                                                                    v85[1] = false;
                                                                                    v85[2] = 4;
                                                                                    v85[3] = 2;
                                                                                    v85[4] = 2;
                                                                                    v85[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2396: {
                                                                                var4_150 = "KG";
                                                                                var5_389 = var0.equals(var4_150);
                                                                                if (var5_389) {
                                                                                    v86 = var0 = (Object)new int[var1_1];
                                                                                    v86[0] = 2;
                                                                                    v86[1] = true;
                                                                                    v86[2] = true;
                                                                                    v86[3] = 2;
                                                                                    v86[4] = 2;
                                                                                    v86[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2394: {
                                                                                var4_151 = "KE";
                                                                                var5_390 = var0.equals(var4_151);
                                                                                if (var5_390) {
                                                                                    v87 = var0 = (Object)new int[var1_1];
                                                                                    v87[0] = 3;
                                                                                    v87[1] = 2;
                                                                                    v87[2] = true;
                                                                                    v87[3] = true;
                                                                                    v87[4] = true;
                                                                                    v87[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2374: {
                                                                                var4_152 = "JP";
                                                                                var5_391 = var0.equals(var4_152);
                                                                                if (var5_391) {
                                                                                    v88 = var0 = (Object)new int[var1_1];
                                                                                    v88[0] = false;
                                                                                    v88[1] = 3;
                                                                                    v88[2] = 2;
                                                                                    v88[3] = 3;
                                                                                    v88[4] = 4;
                                                                                    v88[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2373: {
                                                                                var4_153 = "JO";
                                                                                var5_392 = var0.equals(var4_153);
                                                                                if (!var5_392) break block486;
                                                                                break block489;
                                                                            }
                                                                            case 2371: {
                                                                                var4_154 = "JM";
                                                                                var5_393 = var0.equals(var4_154);
                                                                                if (var5_393) {
                                                                                    v89 = var0 = (Object)new int[var1_1];
                                                                                    v89[0] = 2;
                                                                                    v89[1] = 4;
                                                                                    v89[2] = 3;
                                                                                    v89[3] = true;
                                                                                    v89[4] = 2;
                                                                                    v89[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2363: {
                                                                                var4_155 = "JE";
                                                                                var5_394 = var0.equals(var4_155);
                                                                                if (!var5_394) break block486;
                                                                                ** GOTO lbl1790
                                                                            }
                                                                            case 2347: {
                                                                                var4_156 = "IT";
                                                                                var5_395 = var0.equals(var4_156);
                                                                                if (var5_395) {
                                                                                    v90 = var0 = (Object)new int[var1_1];
                                                                                    v90[0] = false;
                                                                                    v90[1] = true;
                                                                                    v90[2] = true;
                                                                                    v90[3] = 2;
                                                                                    v90[4] = true;
                                                                                    v90[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2346: {
                                                                                var4_157 = "IS";
                                                                                var5_396 = var0.equals(var4_157);
                                                                                if (!var5_396) break block486;
                                                                                ** GOTO lbl2024
                                                                            }
                                                                            case 2345: {
                                                                                var4_158 = "IR";
                                                                                var5_397 = var0.equals(var4_158);
                                                                                if (var5_397) {
                                                                                    v91 = var0 = (Object)new int[var1_1];
                                                                                    v91[0] = 4;
                                                                                    v91[1] = 2;
                                                                                    v91[2] = 3;
                                                                                    v91[3] = 3;
                                                                                    v91[4] = 4;
                                                                                    v91[5] = 3;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2344: {
                                                                                var4_159 = "IQ";
                                                                                var5_398 = var0.equals(var4_159);
                                                                                if (var5_398) {
                                                                                    v92 = var0 = (Object)new int[var1_1];
                                                                                    v92[0] = 3;
                                                                                    v92[1] = 2;
                                                                                    v92[2] = 3;
                                                                                    v92[3] = 2;
                                                                                    v92[4] = 2;
                                                                                    v92[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2342: {
                                                                                var4_160 = "IO";
                                                                                var5_399 = var0.equals(var4_160);
                                                                                if (var5_399) {
                                                                                    v93 = var0 = (Object)new int[var1_1];
                                                                                    v93[0] = 3;
                                                                                    v93[1] = 2;
                                                                                    v93[2] = 2;
                                                                                    v93[3] = false;
                                                                                    v93[4] = 2;
                                                                                    v93[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2341: {
                                                                                var4_161 = "IN";
                                                                                var5_400 = var0.equals(var4_161);
                                                                                if (var5_400) {
                                                                                    v94 = var0 = (Object)new int[var1_1];
                                                                                    v94[0] = true;
                                                                                    v94[1] = true;
                                                                                    v94[2] = 3;
                                                                                    v94[3] = 2;
                                                                                    v94[4] = 2;
                                                                                    v94[5] = 3;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2340: {
                                                                                var4_162 = "IM";
                                                                                var5_401 = var0.equals(var4_162);
                                                                                if (!var5_401) break block486;
                                                                                ** GOTO lbl1790
                                                                            }
                                                                            case 2339: {
                                                                                var4_163 = "IL";
                                                                                var5_402 = var0.equals(var4_163);
                                                                                if (var5_402) {
                                                                                    v95 = var0 = (Object)new int[var1_1];
                                                                                    v95[0] = true;
                                                                                    v95[1] = 2;
                                                                                    v95[2] = 2;
                                                                                    v95[3] = 3;
                                                                                    v95[4] = 4;
                                                                                    v95[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2332: {
                                                                                var4_164 = "IE";
                                                                                var5_403 = var0.equals(var4_164);
                                                                                if (var5_403) {
                                                                                    v96 = var0 = (Object)new int[var1_1];
                                                                                    v96[0] = true;
                                                                                    v96[1] = true;
                                                                                    v96[2] = true;
                                                                                    v96[3] = true;
                                                                                    v96[4] = true;
                                                                                    v96[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2331: {
                                                                                var4_165 = "ID";
                                                                                var5_404 = var0.equals(var4_165);
                                                                                if (var5_404) {
                                                                                    v97 = var0 = (Object)new int[var1_1];
                                                                                    v97[0] = 3;
                                                                                    v97[1] = true;
                                                                                    v97[2] = 3;
                                                                                    v97[3] = 3;
                                                                                    v97[4] = 2;
                                                                                    v97[5] = 4;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2317: {
                                                                                var4_166 = "HU";
                                                                                var5_405 = var0.equals(var4_166);
                                                                                if (!var5_405) break block486;
                                                                                ** GOTO lbl2024
                                                                            }
                                                                            case 2316: {
                                                                                var4_167 = "HT";
                                                                                var5_406 = var0.equals(var4_167);
                                                                                if (!var5_406) break block486;
                                                                                ** GOTO lbl2296
                                                                            }
                                                                            case 2314: {
                                                                                var4_168 = "HR";
                                                                                var5_407 = var0.equals(var4_168);
                                                                                if (!var5_407) break block486;
lbl1642:
                                                                                // 2 sources

                                                                                v98 = var0 = (Object)new int[var1_1];
                                                                                v98[0] = true;
                                                                                v98[1] = false;
                                                                                v98[2] = false;
                                                                                v98[3] = false;
                                                                                v98[4] = false;
                                                                                v98[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2307: {
                                                                                var4_169 = "HK";
                                                                                var5_408 = var0.equals(var4_169);
                                                                                if (var5_408) {
                                                                                    v99 = var0 = (Object)new int[var1_1];
                                                                                    v99[0] = false;
                                                                                    v99[1] = true;
                                                                                    v99[2] = false;
                                                                                    v99[3] = true;
                                                                                    v99[4] = true;
                                                                                    v99[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2290: {
                                                                                var4_170 = "GY";
                                                                                var5_409 = var0.equals(var4_170);
                                                                                if (var5_409) {
                                                                                    v100 = var0 = (Object)new int[var1_1];
                                                                                    v100[0] = 3;
                                                                                    v100[1] = true;
                                                                                    v100[2] = true;
                                                                                    v100[3] = 3;
                                                                                    v100[4] = 2;
                                                                                    v100[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2288: {
                                                                                var4_171 = "GW";
                                                                                var5_410 = var0.equals(var4_171);
                                                                                if (var5_410) {
                                                                                    v101 = var0 = (Object)new int[var1_1];
                                                                                    v101[0] = 4;
                                                                                    v101[1] = 4;
                                                                                    v101[2] = true;
                                                                                    v101[3] = 2;
                                                                                    v101[4] = 2;
                                                                                    v101[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2286: {
                                                                                var4_172 = "GU";
                                                                                var5_411 = var0.equals(var4_172);
                                                                                if (var5_411) {
                                                                                    v102 = var0 = (Object)new int[var1_1];
                                                                                    v102[0] = 2;
                                                                                    v102[1] = 2;
                                                                                    v102[2] = 4;
                                                                                    v102[3] = 3;
                                                                                    v102[4] = 3;
                                                                                    v102[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2285: {
                                                                                var4_173 = "GT";
                                                                                var5_412 = var0.equals(var4_173);
                                                                                if (var5_412) {
                                                                                    v103 = var0 = (Object)new int[var1_1];
                                                                                    v103[0] = 2;
                                                                                    v103[1] = true;
                                                                                    v103[2] = 2;
                                                                                    v103[3] = true;
                                                                                    v103[4] = 2;
                                                                                    v103[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2283: {
                                                                                var4_174 = "GR";
                                                                                var5_413 = var0.equals(var4_174);
                                                                                if (var5_413) {
                                                                                    v104 = var0 = (Object)new int[var1_1];
                                                                                    v104[0] = true;
                                                                                    v104[1] = false;
                                                                                    v104[2] = false;
                                                                                    v104[3] = false;
                                                                                    v104[4] = true;
                                                                                    v104[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2282: {
                                                                                var4_175 = "GQ";
                                                                                var5_414 = var0.equals(var4_175);
                                                                                if (!var5_414) break block486;
                                                                                ** GOTO lbl2296
                                                                            }
                                                                            case 2281: {
                                                                                var4_176 = "GP";
                                                                                var5_415 = var0.equals(var4_176);
                                                                                if (var5_415) {
                                                                                    v105 = var0 = (Object)new int[var1_1];
                                                                                    v105[0] = 2;
                                                                                    v105[1] = true;
                                                                                    v105[2] = true;
                                                                                    v105[3] = 3;
                                                                                    v105[4] = 2;
                                                                                    v105[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2279: {
                                                                                var4_177 = "GN";
                                                                                var5_416 = var0.equals(var4_177);
                                                                                if (var5_416) {
                                                                                    v106 = var0 = (Object)new int[var1_1];
                                                                                    v106[0] = 3;
                                                                                    v106[1] = 4;
                                                                                    v106[2] = 4;
                                                                                    v106[3] = 2;
                                                                                    v106[4] = 2;
                                                                                    v106[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2278: {
                                                                                var4_178 = "GM";
                                                                                var5_417 = var0.equals(var4_178);
                                                                                if (!var5_417) break block486;
lbl1764:
                                                                                // 2 sources

                                                                                v107 = var0 = (Object)new int[var1_1];
                                                                                v107[0] = 4;
                                                                                v107[1] = 3;
                                                                                v107[2] = 2;
                                                                                v107[3] = 4;
                                                                                v107[4] = 2;
                                                                                v107[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2277: {
                                                                                var4_179 = "GL";
                                                                                var5_418 = var0.equals(var4_179);
                                                                                if (!var5_418) break block486;
lbl1777:
                                                                                // 2 sources

                                                                                v108 = var0 = (Object)new int[var1_1];
                                                                                v108[0] = true;
                                                                                v108[1] = 2;
                                                                                v108[2] = 2;
                                                                                v108[3] = false;
                                                                                v108[4] = 2;
                                                                                v108[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2274: {
                                                                                var4_180 = "GI";
                                                                                var5_419 = var0.equals(var4_180);
                                                                                if (!var5_419) break block486;
lbl1790:
                                                                                // 3 sources

                                                                                v109 = var0 = (Object)new int[var1_1];
                                                                                v109[0] = false;
                                                                                v109[1] = 2;
                                                                                v109[2] = false;
                                                                                v109[3] = true;
                                                                                v109[4] = 2;
                                                                                v109[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2273: {
                                                                                var4_181 = "GH";
                                                                                var5_420 = var0.equals(var4_181);
                                                                                if (var5_420) {
                                                                                    v110 = var0 = (Object)new int[var1_1];
                                                                                    v110[0] = 3;
                                                                                    v110[1] = 3;
                                                                                    v110[2] = 3;
                                                                                    v110[3] = 2;
                                                                                    v110[4] = 2;
                                                                                    v110[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2272: {
                                                                                var4_182 = "GG";
                                                                                var5_421 = var0.equals(var4_182);
                                                                                if (var5_421) {
                                                                                    v111 = var0 = (Object)new int[var1_1];
                                                                                    v111[0] = false;
                                                                                    v111[1] = 2;
                                                                                    v111[2] = true;
                                                                                    v111[3] = true;
                                                                                    v111[4] = 2;
                                                                                    v111[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2271: {
                                                                                var4_183 = "GF";
                                                                                var5_422 = var0.equals(var4_183);
                                                                                if (var5_422) {
                                                                                    v112 = var0 = (Object)new int[var1_1];
                                                                                    v112[0] = 3;
                                                                                    v112[1] = 2;
                                                                                    v112[2] = 3;
                                                                                    v112[3] = 3;
                                                                                    v112[4] = 2;
                                                                                    v112[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2270: {
                                                                                var4_184 = "GE";
                                                                                var5_423 = var0.equals(var4_184);
                                                                                if (var5_423) {
                                                                                    v113 = var0 = (Object)new int[var1_1];
                                                                                    v113[0] = true;
                                                                                    v113[1] = true;
                                                                                    v113[2] = false;
                                                                                    v113[3] = 2;
                                                                                    v113[4] = 2;
                                                                                    v113[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2269: {
                                                                                var4_185 = "GD";
                                                                                var5_424 = var0.equals(var4_185);
                                                                                if (var5_424) {
                                                                                    v114 = var0 = (Object)new int[var1_1];
                                                                                    v114[0] = 2;
                                                                                    v114[1] = 2;
                                                                                    v114[2] = false;
                                                                                    v114[3] = false;
                                                                                    v114[4] = 2;
                                                                                    v114[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2267: {
                                                                                var4_186 = "GB";
                                                                                var5_425 = var0.equals(var4_186);
                                                                                if (var5_425) {
                                                                                    v115 = var0 = (Object)new int[var1_1];
                                                                                    v115[0] = true;
                                                                                    v115[1] = true;
                                                                                    v115[2] = 3;
                                                                                    v115[3] = 2;
                                                                                    v115[4] = 2;
                                                                                    v115[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2266: {
                                                                                var4_187 = "GA";
                                                                                var5_426 = var0.equals(var4_187);
                                                                                if (var5_426) {
                                                                                    v116 = var0 = (Object)new int[var1_1];
                                                                                    v116[0] = 3;
                                                                                    v116[1] = 4;
                                                                                    v116[2] = false;
                                                                                    v116[3] = false;
                                                                                    v116[4] = 2;
                                                                                    v116[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2252: {
                                                                                var4_188 = "FR";
                                                                                var5_427 = var0.equals(var4_188);
                                                                                if (var5_427) {
                                                                                    v117 = var0 = (Object)new int[var1_1];
                                                                                    v117[0] = true;
                                                                                    v117[1] = true;
                                                                                    v117[2] = true;
                                                                                    v117[3] = true;
                                                                                    v117[4] = false;
                                                                                    v117[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2249: {
                                                                                var4_189 = "FO";
                                                                                var5_428 = var0.equals(var4_189);
                                                                                if (var5_428) {
                                                                                    v118 = var0 = (Object)new int[var1_1];
                                                                                    v118[0] = false;
                                                                                    v118[1] = 2;
                                                                                    v118[2] = 2;
                                                                                    v118[3] = false;
                                                                                    v118[4] = 2;
                                                                                    v118[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2247: {
                                                                                var4_190 = "FM";
                                                                                var5_429 = var0.equals(var4_190);
                                                                                if (var5_429) {
                                                                                    v119 = var0 = (Object)new int[var1_1];
                                                                                    v119[0] = 4;
                                                                                    v119[1] = 2;
                                                                                    v119[2] = 4;
                                                                                    v119[3] = false;
                                                                                    v119[4] = 2;
                                                                                    v119[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2245: {
                                                                                var4_191 = "FK";
                                                                                var5_430 = var0.equals(var4_191);
                                                                                if (!var5_430) break block486;
lbl1933:
                                                                                // 3 sources

                                                                                v120 = var0 = (Object)new int[var1_1];
                                                                                v120[0] = 3;
                                                                                v120[1] = 2;
                                                                                v120[2] = 2;
                                                                                v120[3] = 2;
                                                                                v120[4] = 2;
                                                                                v120[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2244: {
                                                                                var4_192 = "FJ";
                                                                                var5_431 = var0.equals(var4_192);
                                                                                if (var5_431) {
                                                                                    v121 = var0 = (Object)new int[var1_1];
                                                                                    v121[0] = 3;
                                                                                    v121[1] = 2;
                                                                                    v121[2] = 2;
                                                                                    v121[3] = 3;
                                                                                    v121[4] = 2;
                                                                                    v121[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2243: {
                                                                                var4_193 = "FI";
                                                                                var5_432 = var0.equals(var4_193);
                                                                                if (var5_432) {
                                                                                    v122 = var0 = (Object)new int[var1_1];
                                                                                    v122[0] = false;
                                                                                    v122[1] = false;
                                                                                    v122[2] = false;
                                                                                    v122[3] = true;
                                                                                    v122[4] = false;
                                                                                    v122[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2223: {
                                                                                var4_194 = "ET";
                                                                                var5_433 = var0.equals(var4_194);
                                                                                if (var5_433) {
                                                                                    v123 = var0 = (Object)new int[var1_1];
                                                                                    v123[0] = 4;
                                                                                    v123[1] = 3;
                                                                                    v123[2] = 4;
                                                                                    v123[3] = 4;
                                                                                    v123[4] = 4;
                                                                                    v123[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2222: {
                                                                                var4_195 = "ES";
                                                                                var5_434 = var0.equals(var4_195);
                                                                                if (var5_434) {
                                                                                    v124 = var0 = (Object)new int[var1_1];
                                                                                    v124[0] = false;
                                                                                    v124[1] = false;
                                                                                    v124[2] = false;
                                                                                    v124[3] = false;
                                                                                    v124[4] = true;
                                                                                    v124[5] = false;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2221: {
                                                                                var4_196 = "ER";
                                                                                var5_435 = var0.equals(var4_196);
                                                                                if (!var5_435) break block486;
lbl1998:
                                                                                // 5 sources

                                                                                v125 = var0 = (Object)new int[var1_1];
                                                                                v125[0] = 4;
                                                                                v125[1] = 2;
                                                                                v125[2] = 2;
                                                                                v125[3] = 2;
                                                                                v125[4] = 2;
                                                                                v125[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2210: {
                                                                                var4_197 = "EG";
                                                                                var5_436 = var0.equals(var4_197);
                                                                                if (!var5_436) break block486;
lbl2011:
                                                                                // 3 sources

                                                                                v126 = var0 = (Object)new int[var1_1];
                                                                                v126[0] = 3;
                                                                                v126[1] = 4;
                                                                                v126[2] = 3;
                                                                                v126[3] = 3;
                                                                                v126[4] = 2;
                                                                                v126[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2208: {
                                                                                var4_198 = "EE";
                                                                                var5_437 = var0.equals(var4_198);
                                                                                if (!var5_437) break block486;
lbl2024:
                                                                                // 7 sources

                                                                                v127 = var0 = (Object)new int[var1_1];
                                                                                v127[0] = false;
                                                                                v127[1] = false;
                                                                                v127[2] = false;
                                                                                v127[3] = false;
                                                                                v127[4] = false;
                                                                                v127[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2206: {
                                                                                var4_199 = "EC";
                                                                                var5_438 = var0.equals(var4_199);
                                                                                if (var5_438) {
                                                                                    v128 = var0 = (Object)new int[var1_1];
                                                                                    v128[0] = true;
                                                                                    v128[1] = 3;
                                                                                    v128[2] = 2;
                                                                                    v128[3] = true;
                                                                                    v128[4] = 2;
                                                                                    v128[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2198: {
                                                                                var4_200 = "DZ";
                                                                                var5_439 = var0.equals(var4_200);
                                                                                if (!var5_439) break block486;
lbl2050:
                                                                                // 2 sources

                                                                                v129 = var0 = (Object)new int[var1_1];
                                                                                v129[0] = 3;
                                                                                v129[1] = 3;
                                                                                v129[2] = 4;
                                                                                v129[3] = 4;
                                                                                v129[4] = 2;
                                                                                v129[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2187: {
                                                                                var4_201 = "DO";
                                                                                var5_440 = var0.equals(var4_201);
                                                                                if (!var5_440) break block486;
lbl2063:
                                                                                // 2 sources

                                                                                v130 = var0 = (Object)new int[var1_1];
                                                                                v130[0] = 3;
                                                                                v130[1] = 4;
                                                                                v130[2] = 4;
                                                                                v130[3] = 4;
                                                                                v130[4] = 2;
                                                                                v130[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2185: {
                                                                                var4_202 = "DM";
                                                                                var5_441 = var0.equals(var4_202);
                                                                                if (!var5_441) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2183: {
                                                                                var4_203 = "DK";
                                                                                var5_442 = var0.equals(var4_203);
                                                                                if (var5_442) {
                                                                                    v131 = var0 = (Object)new int[var1_1];
                                                                                    v131[0] = false;
                                                                                    v131[1] = false;
                                                                                    v131[2] = 2;
                                                                                    v131[3] = false;
                                                                                    v131[4] = false;
                                                                                    v131[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2182: {
                                                                                var4_204 = "DJ";
                                                                                var5_443 = var0.equals(var4_204);
                                                                                if (!var5_443) break block486;
                                                                                ** GOTO lbl2374
                                                                            }
                                                                            case 2177: {
                                                                                var4_205 = "DE";
                                                                                var5_444 = var0.equals(var4_205);
                                                                                if (var5_444) {
                                                                                    v132 = var0 = (Object)new int[var1_1];
                                                                                    v132[0] = false;
                                                                                    v132[1] = true;
                                                                                    v132[2] = 4;
                                                                                    v132[3] = 2;
                                                                                    v132[4] = 2;
                                                                                    v132[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2167: {
                                                                                var4_206 = "CZ";
                                                                                var5_445 = var0.equals(var4_206);
                                                                                if (var5_445) {
                                                                                    v133 = var0 = (Object)new int[var1_1];
                                                                                    v133[0] = false;
                                                                                    v133[1] = false;
                                                                                    v133[2] = 2;
                                                                                    v133[3] = false;
                                                                                    v133[4] = true;
                                                                                    v133[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2166: {
                                                                                var4_207 = "CY";
                                                                                var5_446 = var0.equals(var4_207);
                                                                                if (var5_446) {
                                                                                    v134 = var0 = (Object)new int[var1_1];
                                                                                    v134[0] = true;
                                                                                    v134[1] = false;
                                                                                    v134[2] = true;
                                                                                    v134[3] = false;
                                                                                    v134[4] = false;
                                                                                    v134[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2165: {
                                                                                var4_208 = "CX";
                                                                                var5_447 = var0.equals(var4_208);
                                                                                if (!var5_447) break block486;
                                                                                break block488;
                                                                            }
                                                                            case 2164: {
                                                                                var4_209 = "CW";
                                                                                var5_448 = var0.equals(var4_209);
                                                                                if (!var5_448) break block486;
                                                                                break block487;
                                                                            }
                                                                            case 2163: {
                                                                                var4_210 = "CV";
                                                                                var5_449 = var0.equals(var4_210);
                                                                                if (var5_449) {
                                                                                    v135 = var0 = (Object)new int[var1_1];
                                                                                    v135[0] = 2;
                                                                                    v135[1] = 3;
                                                                                    v135[2] = false;
                                                                                    v135[3] = true;
                                                                                    v135[4] = 2;
                                                                                    v135[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2162: {
                                                                                var4_211 = "CU";
                                                                                var5_450 = var0.equals(var4_211);
                                                                                if (!var5_450) break block486;
lbl2161:
                                                                                // 4 sources

                                                                                v136 = var0 = (Object)new int[var1_1];
                                                                                v136[0] = 4;
                                                                                v136[1] = 2;
                                                                                v136[2] = 4;
                                                                                v136[3] = 4;
                                                                                v136[4] = 2;
                                                                                v136[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2159: {
                                                                                var4_212 = "CR";
                                                                                var5_451 = var0.equals(var4_212);
                                                                                if (!var5_451) break block486;
lbl2174:
                                                                                // 2 sources

                                                                                v137 = var0 = (Object)new int[var1_1];
                                                                                v137[0] = 2;
                                                                                v137[1] = 4;
                                                                                v137[2] = 4;
                                                                                v137[3] = 4;
                                                                                v137[4] = 2;
                                                                                v137[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2156: {
                                                                                var4_213 = "CO";
                                                                                var5_452 = var0.equals(var4_213);
                                                                                if (var5_452) {
                                                                                    v138 = var0 = (Object)new int[var1_1];
                                                                                    v138[0] = 2;
                                                                                    v138[1] = 3;
                                                                                    v138[2] = 3;
                                                                                    v138[3] = 2;
                                                                                    v138[4] = 2;
                                                                                    v138[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2155: {
                                                                                var4_214 = "CN";
                                                                                var5_453 = var0.equals(var4_214);
                                                                                if (var5_453) {
                                                                                    v139 = var0 = (Object)new int[var1_1];
                                                                                    v139[0] = 2;
                                                                                    v139[1] = false;
                                                                                    v139[2] = true;
                                                                                    v139[3] = true;
                                                                                    v139[4] = 3;
                                                                                    v139[5] = true;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2154: {
                                                                                var4_215 = "CM";
                                                                                var5_454 = var0.equals(var4_215);
                                                                                if (!var5_454) break block486;
lbl2213:
                                                                                // 2 sources

                                                                                v140 = var0 = (Object)new int[var1_1];
                                                                                v140[0] = 4;
                                                                                v140[1] = 3;
                                                                                v140[2] = 3;
                                                                                v140[3] = 4;
                                                                                v140[4] = 2;
                                                                                v140[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2153: {
                                                                                var4_216 = "CL";
                                                                                var5_455 = var0.equals(var4_216);
                                                                                if (!var5_455) break block486;
lbl2226:
                                                                                // 2 sources

                                                                                v141 = var0 = (Object)new int[var1_1];
                                                                                v141[0] = false;
                                                                                v141[1] = true;
                                                                                v141[2] = 2;
                                                                                v141[3] = 2;
                                                                                v141[4] = 2;
                                                                                v141[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2152: {
                                                                                var4_217 = "CK";
                                                                                var5_456 = var0.equals(var4_217);
                                                                                if (!var5_456) break block486;
                                                                                break block491;
                                                                            }
                                                                            case 2145: {
                                                                                var4_218 = "CD";
                                                                                var5_457 = var0.equals(var4_218);
                                                                                if (!var5_457) break block486;
lbl2244:
                                                                                // 2 sources

                                                                                v142 = var0 = (Object)new int[var1_1];
                                                                                v142[0] = 3;
                                                                                v142[1] = 3;
                                                                                v142[2] = 2;
                                                                                v142[3] = 2;
                                                                                v142[4] = 2;
                                                                                v142[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2142: {
                                                                                var4_219 = "CA";
                                                                                var5_458 = var0.equals(var4_219);
                                                                                if (!var5_458) break block486;
lbl2257:
                                                                                // 2 sources

                                                                                v143 = var0 = (Object)new int[var1_1];
                                                                                v143[0] = false;
                                                                                v143[1] = 2;
                                                                                v143[2] = true;
                                                                                v143[3] = 2;
                                                                                v143[4] = 3;
                                                                                v143[5] = 3;
                                                                                return var0;
                                                                            }
                                                                            case 2133: {
                                                                                var4_220 = "BW";
                                                                                var5_459 = var0.equals(var4_220);
                                                                                if (var5_459) {
                                                                                    v144 = var0 = (Object)new int[var1_1];
                                                                                    v144[0] = 3;
                                                                                    v144[1] = 2;
                                                                                    v144[2] = true;
                                                                                    v144[3] = false;
                                                                                    v144[4] = 2;
                                                                                    v144[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2120: {
                                                                                var4_221 = "BJ";
                                                                                var5_460 = var0.equals(var4_221);
                                                                                if (var5_460) {
                                                                                    v145 = var0 = (Object)new int[var1_1];
                                                                                    v145[0] = 4;
                                                                                    v145[1] = 4;
                                                                                    v145[2] = 2;
                                                                                    v145[3] = 3;
                                                                                    v145[4] = 2;
                                                                                    v145[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2119: {
                                                                                var4_222 = "BI";
                                                                                var5_461 = var0.equals(var4_222);
                                                                                if (!var5_461) break block486;
lbl2296:
                                                                                // 6 sources

                                                                                v146 = var0 = (Object)new int[var1_1];
                                                                                v146[0] = 4;
                                                                                v146[1] = 4;
                                                                                v146[2] = 4;
                                                                                v146[3] = 4;
                                                                                v146[4] = 2;
                                                                                v146[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2118: {
                                                                                var4_223 = "BH";
                                                                                var5_462 = var0.equals(var4_223);
                                                                                if (var5_462) {
                                                                                    v147 = var0 = (Object)new int[var1_1];
                                                                                    v147[0] = true;
                                                                                    v147[1] = 3;
                                                                                    v147[2] = true;
                                                                                    v147[3] = 3;
                                                                                    v147[4] = 4;
                                                                                    v147[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2117: {
                                                                                var4_224 = "BG";
                                                                                var5_463 = var0.equals(var4_224);
                                                                                if (!var5_463) break block486;
lbl2322:
                                                                                // 3 sources

                                                                                v148 = var0 = (Object)new int[var1_1];
                                                                                v148[0] = false;
                                                                                v148[1] = false;
                                                                                v148[2] = false;
                                                                                v148[3] = false;
                                                                                v148[4] = true;
                                                                                v148[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2116: {
                                                                                var4_225 = "BF";
                                                                                var5_464 = var0.equals(var4_225);
                                                                                if (!var5_464) break block486;
lbl2335:
                                                                                // 4 sources

                                                                                v149 = var0 = (Object)new int[var1_1];
                                                                                v149[0] = 4;
                                                                                v149[1] = 3;
                                                                                v149[2] = 4;
                                                                                v149[3] = 4;
                                                                                v149[4] = 2;
                                                                                v149[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2115: {
                                                                                var4_226 = "BE";
                                                                                var5_465 = var0.equals(var4_226);
                                                                                if (var5_465) {
                                                                                    v150 = var0 = (Object)new int[var1_1];
                                                                                    v150[0] = false;
                                                                                    v150[1] = false;
                                                                                    v150[2] = true;
                                                                                    v150[3] = false;
                                                                                    v150[4] = true;
                                                                                    v150[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2114: {
                                                                                var4_227 = "BD";
                                                                                var5_466 = var0.equals(var4_227);
                                                                                if (var5_466) {
                                                                                    v151 = var0 = (Object)new int[var1_1];
                                                                                    v151[0] = 2;
                                                                                    v151[1] = true;
                                                                                    v151[2] = 3;
                                                                                    v151[3] = 2;
                                                                                    v151[4] = 4;
                                                                                    v151[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2105: {
                                                                                var4_228 = "AZ";
                                                                                var5_467 = var0.equals(var4_228);
                                                                                if (!var5_467) break block486;
lbl2374:
                                                                                // 4 sources

                                                                                v152 = var0 = (Object)new int[var1_1];
                                                                                v152[0] = 4;
                                                                                v152[1] = 2;
                                                                                v152[2] = 3;
                                                                                v152[3] = 3;
                                                                                v152[4] = 2;
                                                                                v152[5] = 2;
                                                                                return var0;
                                                                            }
                                                                            case 2094: {
                                                                                var4_229 = "AO";
                                                                                var5_468 = var0.equals(var4_229);
                                                                                if (var5_468) {
                                                                                    v153 = var0 = (Object)new int[var1_1];
                                                                                    v153[0] = 3;
                                                                                    v153[1] = 4;
                                                                                    v153[2] = 4;
                                                                                    v153[3] = 3;
                                                                                    v153[4] = 2;
                                                                                    v153[5] = 2;
                                                                                    return var0;
                                                                                }
                                                                                break block486;
                                                                            }
                                                                            case 2088: 
                                                                        }
                                                                        var4_230 = "AI";
                                                                        var5_469 = var0.equals(var4_230);
                                                                        if (!var5_469) break block486;
                                                                        break block487;
                                                                    }
                                                                    case 2086: {
                                                                        var4_231 = "AG";
                                                                        var5_470 = var0.equals(var4_231);
                                                                        if (!var5_470) break block486;
lbl2405:
                                                                        // 2 sources

                                                                        v154 = var0 = (Object)new int[var1_1];
                                                                        v154[0] = 2;
                                                                        v154[1] = 4;
                                                                        v154[2] = 3;
                                                                        v154[3] = 4;
                                                                        v154[4] = 2;
                                                                        v154[5] = 2;
                                                                        return var0;
                                                                    }
                                                                    case 2085: {
                                                                        var4_232 = "AF";
                                                                        var5_471 = var0.equals(var4_232);
                                                                        if (!var5_471) break block486;
lbl2418:
                                                                        // 2 sources

                                                                        v155 = var0 = (Object)new int[var1_1];
                                                                        v155[0] = 4;
                                                                        v155[1] = 4;
                                                                        v155[2] = 3;
                                                                        v155[3] = 4;
                                                                        v155[4] = 2;
                                                                        v155[5] = 2;
                                                                        return var0;
                                                                    }
                                                                    case 2084: {
                                                                        var4_233 = "AE";
                                                                        var5_472 = var0.equals(var4_233);
                                                                        if (var5_472) {
                                                                            v156 = var0 = (Object)new int[var1_1];
                                                                            v156[0] = true;
                                                                            v156[1] = 4;
                                                                            v156[2] = 2;
                                                                            v156[3] = 3;
                                                                            v156[4] = 4;
                                                                            v156[5] = true;
                                                                            return var0;
                                                                        }
                                                                        break block486;
                                                                    }
                                                                    case 2083: 
                                                                }
                                                                var4_234 = "AD";
                                                                var5_473 = var0.equals(var4_234);
                                                                if (!var5_473) break block486;
                                                                break block487;
                                                            }
                                                            var4_235 = "BZ";
                                                            var5_474 = var0.equals(var4_235);
                                                            if (!var5_474) break block486;
                                                        }
                                                        v157 = var0 = (Object)new int[var1_1];
                                                        v157[0] = 2;
                                                        v157[1] = 2;
                                                        v157[2] = 2;
                                                        v157[3] = true;
                                                        v157[4] = 2;
                                                        v157[5] = 2;
                                                        return var0;
                                                    }
                                                    var4_236 = "BY";
                                                    var5_475 = var0.equals(var4_236);
                                                    if (var5_475) {
                                                        v158 = var0 = (Object)new int[var1_1];
                                                        v158[0] = true;
                                                        v158[1] = 2;
                                                        v158[2] = 3;
                                                        v158[3] = 3;
                                                        v158[4] = 2;
                                                        v158[5] = 2;
                                                        return var0;
                                                    }
                                                    break block486;
                                                }
                                                var4_237 = "BB";
                                                var5_476 = var0.equals(var4_237);
                                                if (!var5_476) break block486;
                                            }
                                            v159 = var0 = (Object)new int[var1_1];
                                            v159[0] = true;
                                            v159[1] = 2;
                                            v159[2] = false;
                                            v159[3] = false;
                                            v159[4] = 2;
                                            v159[5] = 2;
                                            return var0;
                                        }
                                        var4_238 = "BA";
                                        var5_477 = var0.equals(var4_238);
                                        if (!var5_477) break block486;
                                    }
                                    v160 = var0 = (Object)new int[var1_1];
                                    v160[0] = true;
                                    v160[1] = true;
                                    v160[2] = true;
                                    v160[3] = true;
                                    v160[4] = 2;
                                    v160[5] = 2;
                                    return var0;
                                }
                                var4_239 = "AX";
                                var5_478 = var0.equals(var4_239);
                                if (!var5_478) break block486;
                            }
                            v161 = var0 = (Object)new int[var1_1];
                            v161[0] = false;
                            v161[1] = 2;
                            v161[2] = 2;
                            v161[3] = 2;
                            v161[4] = 2;
                            v161[5] = 2;
                            return var0;
                        }
                        var4_240 = "AW";
                        var5_479 = var0.equals(var4_240);
                        if (var5_479) {
                            v162 = var0 = (Object)new int[var1_1];
                            v162[0] = 2;
                            v162[1] = 2;
                            v162[2] = 3;
                            v162[3] = 4;
                            v162[4] = 2;
                            v162[5] = 2;
                            return var0;
                        }
                        break block486;
                    }
                    var4_241 = "AM";
                    var5_480 = var0.equals(var4_241);
                    if (!var5_480) break block486;
                }
                v163 = var0 = (Object)new int[var1_1];
                v163[0] = 2;
                v163[1] = 3;
                v163[2] = 2;
                v163[3] = 3;
                v163[4] = 2;
                v163[5] = 2;
                return var0;
            }
            var4_242 = "AL";
            var5_481 = var0.equals(var4_242);
            if (var5_481) {
                v164 = var0 = (Object)new int[var1_1];
                v164[0] = true;
                v164[1] = true;
                v164[2] = true;
                v164[3] = 2;
                v164[4] = 2;
                v164[5] = 2;
                return var0;
            }
        }
        v165 = var0 = (Object)new int[var1_1];
        v165[0] = 2;
        v165[1] = 2;
        v165[2] = 2;
        v165[3] = 2;
        v165[4] = 2;
        v165[5] = 2;
        return var0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzhb zzhb2, zzhh zzhh2, boolean bl2, int n3) {
        synchronized (this) {
            boolean bl3 = zzzy.zzl(zzhh2, bl2);
            if (!bl3) {
                return;
            }
            long l2 = this.zzn;
            long l3 = n3;
            this.zzn = l2 += l3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzhb zzhb2, zzhh zzhh2, boolean n3) {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                int n4;
                block10: {
                    int n7;
                    long l2;
                    block11: {
                        long l3;
                        block9: {
                            try {
                                n4 = zzzy.zzl(zzhh2, n3 != 0);
                                if (n4 != 0) break block9;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        n4 = this.zzl;
                        if (n4 > 0) {
                            n4 = 1;
                        } else {
                            n4 = 0;
                            zzhb2 = null;
                        }
                        zzeq.zzf(n4 != 0);
                        l2 = SystemClock.elapsedRealtime();
                        long l4 = this.zzm;
                        l4 = l2 - l4;
                        long l7 = this.zzo;
                        n7 = (int)l4;
                        l4 = n7;
                        this.zzo = l7 += l4;
                        l4 = this.zzp;
                        l7 = this.zzn;
                        this.zzp = l4 += l7;
                        if (n7 <= 0) break block10;
                        float f5 = l7;
                        zzaan zzaan2 = this.zzk;
                        double d2 = l7;
                        d2 = Math.sqrt(d2);
                        int n8 = (int)d2;
                        f5 *= 8000.0f;
                        float f6 = n7;
                        f5 /= f6;
                        zzaan2.zzb(n8, f5);
                        l4 = this.zzo;
                        l7 = 2000L;
                        n3 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
                        if (n3 < 0 && (n3 = (int)((l3 = (l4 = this.zzp) - (l7 = 524288L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) < 0) break block11;
                        zzaan zzaan3 = this.zzk;
                        float f7 = 0.5f;
                        f5 = zzaan3.zza(f7);
                        l4 = (long)f5;
                        this.zzq = l4;
                        break block12;
                    }
                    long l8 = this.zzn;
                    long l12 = this.zzq;
                    this.zzj(n7, l8, l12);
                    this.zzm = l2;
                    this.zzn = l2 = 0L;
                }
                this.zzl = n4 = this.zzl + -1;
                return;
            }
            throw throwable2;
        }
    }

    public final void zzc(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n3;
                block5: {
                    try {
                        n3 = zzzy.zzl(zzhh2, bl2);
                        if (n3 != 0) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                n3 = this.zzl;
                if (n3 == 0) {
                    long l2;
                    this.zzm = l2 = SystemClock.elapsedRealtime();
                }
                this.zzl = n3 = this.zzl + 1;
                return;
            }
            throw throwable2;
        }
    }

    public final void zze(Handler handler, zzzt zzzt2) {
        zzzt2.getClass();
        this.zzi.zza(handler, zzzt2);
    }

    public final void zzf(zzzt zzzt2) {
        this.zzi.zzc(zzzt2);
    }
}

