/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzmo;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzxx;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyb;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzye;
import com.google.android.gms.internal.ads.zzyf;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.ads.zzyh;
import com.google.android.gms.internal.ads.zzyi;
import com.google.android.gms.internal.ads.zzyj;
import com.google.android.gms.internal.ads.zzyk;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzyx;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzza;
import com.google.android.gms.internal.ads.zzzf;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzh;
import com.google.android.gms.internal.ads.zzzi;
import com.google.android.gms.internal.ads.zzzj;
import com.google.android.gms.internal.ads.zzzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzze
extends zzzj
implements zzmo {
    private static final zzgcn zzb;
    public final Context zza;
    private final Object zzc;
    private final boolean zzd;
    private zzys zze;
    private zzyx zzf;
    private zzk zzg;
    private final zzxx zzh;

    static {
        zzyb zzyb2 = new zzyb();
        zzb = zzgcn.zzb(zzyb2);
    }

    public zzze(Context object) {
        int n3;
        Object object2;
        Object object3 = new zzxx();
        zzys zzys2 = zzys.zzd(object);
        this.zzc = object2 = new Object();
        object2 = object != null ? object.getApplicationContext() : null;
        this.zza = object2;
        this.zzh = object3;
        this.zze = zzys2;
        this.zzg = object3 = zzk.zza;
        int n4 = 0;
        object3 = null;
        if (object != null && (n3 = zzgd.zzN(object)) != 0) {
            n4 = 1;
        }
        this.zzd = n4;
        if (n4 == 0 && object != null && (n4 = zzgd.zza) >= (n3 = 32)) {
            this.zzf = object3 = zzyx.zza(object);
        }
        object3 = this.zze;
        n4 = (int)(((zzys)object3).zzS ? 1 : 0);
        if (n4 != 0 && object == null) {
            object = "DefaultTrackSelector";
            object3 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
            zzfk.zzf((String)object, (String)object3);
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int n3, int n4) {
        if (n3 != 0 && n3 == n4) {
            return -1 >>> 1;
        }
        return Integer.bitCount(n3 & n4);
    }

    public static int zzc(zzan object, String string2, boolean bl2) {
        String string3;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3 && (bl3 = string2.equals(string3 = ((zzan)object).zze))) {
            return 4;
        }
        string2 = zzze.zzh(string2);
        object = zzze.zzh(((zzan)object).zze);
        bl3 = false;
        string3 = null;
        if (object != null && string2 != null) {
            boolean bl4;
            boolean bl5 = ((String)object).startsWith(string2);
            if (!bl5 && !(bl4 = string2.startsWith((String)object))) {
                int n3 = zzgd.zza;
                String string4 = "-";
                int n4 = 2;
                boolean bl6 = ((String)(object = ((String)object).split(string4, n4)[0])).equals(string2 = string2.split(string4, n4)[0]);
                if (bl6) {
                    return n4;
                }
                return 0;
            }
            return 3;
        }
        if (bl2 && object == null) {
            return 1;
        }
        return 0;
    }

    public static /* bridge */ /* synthetic */ zzgcn zzg() {
        return zzb;
    }

    public static String zzh(String string2) {
        String string3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = TextUtils.equals((CharSequence)string2, (CharSequence)(string3 = "und")))) {
            return string2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzze zzze2) {
        zzze2.zzv();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ boolean zzm(zzze object, zzan zzan2) {
        Object object2 = ((zzze)object).zzc;
        synchronized (object2) {
            Throwable throwable2;
            block13: {
                int n3;
                block15: {
                    int n4;
                    int n7;
                    int n8;
                    Object object3;
                    block12: {
                        int n10;
                        block14: {
                            int n14;
                            try {
                                object3 = ((zzze)object).zze;
                                n8 = ((zzys)object3).zzS;
                                n3 = 1;
                                if (n8 == 0) return n3 != 0;
                                n8 = ((zzze)object).zzd;
                                if (n8 != 0) return n3 != 0;
                                n8 = zzan2.zzA;
                                n7 = 2;
                                if (n8 <= n7) return n3 != 0;
                                object3 = zzan2.zzn;
                                n4 = 32;
                                if (object3 == null) break block12;
                                n14 = ((String)object3).hashCode();
                                n10 = 3;
                            }
                            catch (Throwable throwable2) {
                                break block13;
                            }
                            switch (n14) {
                                default: {
                                    break;
                                }
                                case 1504578661: {
                                    String string2 = "audio/eac3";
                                    n8 = (int)(((String)object3).equals(string2) ? 1 : 0);
                                    if (n8 == 0) break;
                                    n8 = 1;
                                    break block14;
                                }
                                case 187078297: {
                                    String string3 = "audio/ac4";
                                    n8 = (int)(((String)object3).equals(string3) ? 1 : 0);
                                    if (n8 == 0) break;
                                    n8 = 3;
                                    break block14;
                                }
                                case 187078296: {
                                    String string4 = "audio/ac3";
                                    n8 = (int)(((String)object3).equals(string4) ? 1 : 0);
                                    if (n8 == 0) break;
                                    n8 = 0;
                                    object3 = null;
                                    break block14;
                                }
                                case -2123537834: {
                                    String string5 = "audio/eac3-joc";
                                    n8 = (int)(((String)object3).equals(string5) ? 1 : 0);
                                    if (n8 == 0) break;
                                    n8 = 2;
                                    break block14;
                                }
                            }
                            n8 = -1;
                        }
                        if (n8 != 0 && n8 != n3 && n8 != n7 && n8 != n10) break block12;
                        n8 = zzgd.zza;
                        if (n8 < n4) return n3 != 0;
                        object3 = ((zzze)object).zzf;
                        if (object3 == null) return n3 != 0;
                        n8 = (int)(((zzyx)object3).zzg() ? 1 : 0);
                        if (n8 == 0) break block15;
                    }
                    n8 = zzgd.zza;
                    if (n8 < n4) return 0 != 0;
                    object3 = ((zzze)object).zzf;
                    if (object3 == null) return 0 != 0;
                    n7 = (int)(((zzyx)object3).zzg() ? 1 : 0);
                    if (n7 == 0) return 0 != 0;
                    n8 = (int)(((zzyx)object3).zze() ? 1 : 0);
                    if (n8 == 0) return 0 != 0;
                    object3 = ((zzze)object).zzf;
                    n8 = (int)(((zzyx)object3).zzf() ? 1 : 0);
                    if (n8 == 0) return 0 != 0;
                    object3 = ((zzze)object).zzf;
                    object = ((zzze)object).zzg;
                    boolean bl2 = ((zzyx)object3).zzd((zzk)object, zzan2);
                    if (!bl2) return 0 != 0;
                }
                return n3 != 0;
            }
            throw throwable2;
        }
    }

    public static boolean zzo(int n3, boolean n4) {
        int n7 = 4;
        boolean bl2 = true;
        if ((n3 &= 7) != n7) {
            n7 = 0;
            if (n4 != 0) {
                n4 = 3;
                if (n3 != n4) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }

    private static void zzu(zzxr zzxr2, zzdl zzdl2, Map map2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = zzxr2.zzc); ++i3) {
            Object object = zzxr2.zzb(i3);
            zzgbf zzgbf2 = zzdl2.zzD;
            if ((object = (zzdg)zzgbf2.get(object)) == null) {
                continue;
            }
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzv() {
        Object object = this.zzc;
        synchronized (object) {
            try {
                int n3;
                Object object2 = this.zze;
                int n4 = ((zzys)object2).zzS;
                boolean bl2 = false;
                if (n4 != 0 && (n4 = this.zzd) == 0 && (n4 = zzgd.zza) >= (n3 = 32) && (object2 = this.zzf) != null && (n4 = (int)(((zzyx)object2).zzg() ? 1 : 0)) != 0) {
                    bl2 = true;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var1_1
                if (bl2) {
                    this.zzt();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final Pair zzw(int n3, zzzi zzzi2, int[][][] nArray, zzyz zzyz2, Comparator comparator) {
        int n7;
        int n8;
        int n10;
        Object object = zzzi2;
        Object object2 = new ArrayList();
        Object object3 = null;
        for (n10 = 0; n10 < (n8 = 2); ++n10) {
            int n14 = ((zzzi)object).zzc(n10);
            if (n3 == n14) {
                int n15;
                zzxr zzxr2 = ((zzzi)object).zzd(n10);
                for (int i3 = 0; i3 < (n15 = zzxr2.zzc); ++i3) {
                    int n16;
                    zzde zzde2 = zzxr2.zzb(i3);
                    Object object4 = nArray[n10][i3];
                    object4 = zzyz2.zza(n10, zzde2, (int[])object4);
                    int n17 = zzde2.zzb;
                    boolean[] blArray = new boolean[n17];
                    int n18 = 0;
                    Object object5 = null;
                    while (n18 < (n16 = zzde2.zzb)) {
                        n16 = n18 + 1;
                        zzza zzza2 = (zzza)object4.get(n18);
                        int n19 = zzza2.zzb();
                        if ((n18 = blArray[n18]) == 0 && n19 != 0) {
                            n18 = 1;
                            if (n19 == n18) {
                                object5 = zzgbc.zzn(zzza2);
                            } else {
                                ArrayList<Object> arrayList = new ArrayList<Object>();
                                arrayList.add(zzza2);
                                for (n7 = n16; n7 < (n18 = zzde2.zzb); ++n7) {
                                    object5 = (zzza)object4.get(n7);
                                    int n4 = ((zzza)object5).zzb();
                                    if (n4 == n8 && (n4 = (int)(zzza2.zzc((zzza)object5) ? 1 : 0)) != 0) {
                                        arrayList.add(object5);
                                        blArray[n7] = n4 = 1;
                                    } else {
                                        n4 = 1;
                                    }
                                    object = zzzi2;
                                }
                                object5 = arrayList;
                            }
                            ((ArrayList)object2).add(object5);
                        }
                        object = zzzi2;
                        n18 = n16;
                    }
                    object = zzzi2;
                }
            }
            object = zzzi2;
        }
        boolean bl2 = ((ArrayList)object2).isEmpty();
        if (bl2) {
            return null;
        }
        object = comparator;
        object = (List)Collections.max(object2, comparator);
        int n4 = object.size();
        object2 = new int[n4];
        for (n7 = 0; n7 < (n10 = object.size()); ++n7) {
            object3 = (zzza)object.get(n7);
            n10 = ((zzza)object3).zzc;
            object2[n7] = n10;
        }
        object = (zzza)object.get(0);
        zzde zzde2 = ((zzza)object).zzb;
        object3 = new zzzf(zzde2, (int[])object2, 0);
        object = ((zzza)object).zza;
        return Pair.create((Object)object3, (Object)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzmn object) {
        object = this.zzc;
        synchronized (object) {
            zzys zzys2 = this.zze;
            boolean cfr_ignored_0 = zzys2.zzW;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Pair zzd(zzzi zzzi2, int[][][] nArray, int[] nArray2, zzvo zzvo2, zzdc zzdc2) {
        Object object;
        int n3;
        int n4;
        int n7;
        Object object2;
        Object object3;
        int n8;
        Object object4;
        int n10;
        int n14;
        int n15;
        Object object5;
        Object object6;
        int n16;
        Object object7;
        int n17;
        Object object8;
        Object object9;
        int n18;
        int n19;
        zzys zzys2;
        Object object10;
        Object object11;
        Object object12;
        zzzi zzzi3;
        zzze zzze2;
        block39: {
            zzze2 = this;
            zzzi3 = zzzi2;
            object12 = nArray;
            object11 = nArray2;
            object10 = this.zzc;
            // MONITORENTER : object10
            zzys2 = this.zze;
            n19 = zzys2.zzS;
            if (n19 != 0 && (n19 = zzgd.zza) >= (n18 = 32) && (object9 = this.zzf) != null) {
                object8 = Looper.myLooper();
                zzeq.zzb(object8);
                ((zzyx)object9).zzb(this, (Looper)object8);
            }
            n17 = 2;
            object9 = new zzzf[n17];
            object8 = new zzyh(zzys2, (int[])object11);
            object7 = new zzyi();
            object8 = zzze.zzw(n17, zzzi3, (int[][][])object12, (zzyz)object8, (Comparator)object7);
            n16 = 4;
            if (object8 == null) {
                object6 = new zzyd(zzys2);
                object5 = new zzye();
                object6 = zzze.zzw(n16, zzzi3, (int[][][])object12, (zzyz)object6, (Comparator)object5);
            } else {
                n15 = 0;
                object6 = null;
            }
            n14 = 0;
            object5 = null;
            if (object6 != null) {
                object8 = (Integer)((Pair)object6).second;
                n18 = (Integer)object8;
                object9[n18] = object6 = (zzzf)((Pair)object6).first;
            } else if (object8 != null) {
                object6 = (Integer)((Pair)object8).second;
                n15 = (Integer)object6;
                object9[n15] = object8 = (zzzf)((Pair)object8).first;
            }
            n18 = 0;
            object8 = null;
            while (true) {
                n15 = 1;
                if (n18 >= n17) break;
                n10 = zzzi3.zzc(n18);
                if (n10 == n17) {
                    object4 = zzzi3.zzd(n18);
                    n10 = ((zzxr)object4).zzc;
                    if (n10 > 0) {
                        n18 = 1;
                        break block39;
                    }
                }
                ++n18;
            }
            n18 = 0;
            object8 = null;
        }
        object4 = new zzyf(zzze2, zzys2, n18 != 0, (int[])object11);
        object11 = new zzyg;
        ((zzyg)object11)();
        object11 = zzze.zzw(n15, zzzi3, (int[][][])object12, (zzyz)object4, (Comparator)object11);
        if (object11 != null) {
            object8 = (Integer)((Pair)object11).second;
            n18 = (Integer)object8;
            object9[n18] = object4 = (zzzf)((Pair)object11).first;
        }
        if (object11 == null) {
            n8 = 0;
            object11 = null;
        } else {
            object11 = ((Pair)object11).first;
            object8 = object11;
            object8 = ((zzzf)object11).zza;
            n8 = ((zzzf)object11).zzb[0];
            object11 = ((zzde)object8).zzb((int)n8).zze;
        }
        object8 = new zzyj(zzys2, (String)object11);
        object11 = new zzyk;
        ((zzyk)object11)();
        n10 = 3;
        object11 = zzze.zzw(n10, zzzi3, (int[][][])object12, (zzyz)object8, (Comparator)object11);
        if (object11 != null) {
            object8 = (Integer)((Pair)object11).second;
            n18 = (Integer)object8;
            object11 = (zzzf)((Pair)object11).first;
            object9[n18] = object11;
        }
        n8 = 0;
        object11 = null;
        while (true) {
            block41: {
                Object object13;
                block42: {
                    block40: {
                        if (n8 >= n17) break block40;
                        n18 = zzzi3.zzc(n8);
                        if (n18 == n17 || n18 == n15 || n18 == n10 || n18 == n16) break block41;
                        object8 = zzzi3.zzd(n8);
                        object3 = object12[n8];
                        object2 = null;
                        n7 = 0;
                        object13 = null;
                        break block42;
                    }
                    object12 = new HashMap;
                    ((HashMap)object12)();
                    n8 = 2;
                    object7 = null;
                    for (n16 = 0; n16 < n8; ++n16) {
                        object10 = zzzi3.zzd(n16);
                        zzze.zzu((zzxr)object10, zzys2, (Map)object12);
                    }
                    object10 = zzzi2.zze();
                    zzze.zzu((zzxr)object10, zzys2, (Map)object12);
                    object7 = null;
                    for (n16 = 0; n16 < n8; ++n16) {
                        n17 = zzzi3.zzc(n16);
                        object10 = n17;
                        if ((object10 = (zzdg)((HashMap)object12).get(object10)) != null) throw null;
                    }
                    n17 = 0;
                    object10 = null;
                    object7 = null;
                    break;
                }
                for (n4 = 0; n4 < (n16 = ((zzxr)object8).zzc); ++n4) {
                    object7 = ((zzxr)object8).zzb(n4);
                    int[] nArray3 = object3[n4];
                    object4 = object13;
                    object6 = null;
                    for (n15 = 0; n15 < (n3 = ((zzde)object7).zzb); ++n15) {
                        n3 = nArray3[n15];
                        n17 = (int)(zzys2.zzT ? 1 : 0);
                        if ((n17 = zzze.zzo(n3, n17 != 0)) != 0) {
                            object10 = ((zzde)object7).zzb(n15);
                            n14 = nArray3[n15];
                            object = new zzyn((zzan)object10, n14);
                            if (object4 == null || (n17 = ((zzyn)object).zza((zzyn)object4)) > 0) {
                                object2 = object7;
                                object4 = object;
                                n7 = n15;
                            }
                        }
                        n17 = 2;
                        n14 = 0;
                        object5 = null;
                    }
                    object13 = object4;
                    n17 = 2;
                    n15 = 1;
                    n14 = 0;
                    object5 = null;
                    n10 = 3;
                }
                if (object2 == null) {
                    n17 = 0;
                    object10 = null;
                } else {
                    object8 = new int[]{n7};
                    n16 = 0;
                    object7 = null;
                    object10 = new zzzf((zzde)object2, (int[])object8, 0);
                }
                object9[n8] = object10;
            }
            ++n8;
            n17 = 2;
            n16 = 4;
            n15 = 1;
            n14 = 0;
            object5 = null;
            n10 = 3;
        }
        for (n16 = 0; n16 < n8; ++n16) {
            object12 = zzzi3.zzd(n16);
            n8 = (int)(zzys2.zzg(n16, (zzxr)object12) ? 1 : 0);
            if (n8 != 0) {
                if ((object12 = zzys2.zze(n16, (zzxr)object12)) != null) throw null;
                object9[n16] = null;
            }
            n8 = 2;
        }
        int n20 = 2;
        object7 = null;
        for (n16 = 0; n16 < n20; ++n16) {
            n20 = zzzi3.zzc(n16);
            n8 = (int)(zzys2.zzf(n16) ? 1 : 0);
            if (n8 != 0 || (n20 = (int)(((zzgax)(object11 = (Object)zzys2.zzE)).contains(object12 = Integer.valueOf(n20)) ? 1 : 0)) != 0) {
                n17 = 0;
                object10 = null;
                object9[n16] = null;
            } else {
                n17 = 0;
                object10 = null;
            }
            n20 = 2;
        }
        n17 = 0;
        object10 = null;
        object12 = zzze2.zzh;
        object11 = this.zzr();
        object8 = zzxy.zzf((zzzf[])object9);
        n16 = 2;
        object2 = new zzzg[n16];
        n4 = 0;
        while (n4 < n16) {
            int n21;
            object7 = object9[n4];
            if (object7 == null || (n3 = ((Object)(object5 = (Object)((zzzf)object7).zzb)).length) == 0) {
                n21 = n4;
                n7 = 0;
            } else {
                int n22 = 1;
                if (n3 == n22) {
                    object7 = ((zzzf)object7).zza;
                    n7 = 0;
                    Object object14 = object5[0];
                    object = new zzzh((zzde)object7, (int)object14, 0, 0, null);
                    n21 = n4;
                } else {
                    n7 = 0;
                    object6 = ((zzzf)object7).zza;
                    object7 = (zzgbc)object8.get(n4);
                    n10 = 0;
                    object4 = null;
                    object = object12;
                    object3 = object11;
                    n21 = n4;
                    object = ((zzxx)object12).zza((zzde)object6, (int[])object5, 0, (zzzu)object11, (zzgbc)object7);
                }
                object2[n21] = object;
            }
            n4 = n21 + 1;
            n16 = 2;
        }
        n7 = 0;
        object12 = new zzmq[n16];
        n14 = 0;
        object5 = null;
        while (n14 < n16) {
            n8 = zzzi3.zzc(n14);
            n19 = (int)(zzys2.zzf(n14) ? 1 : 0);
            if (n19 == 0 && (n8 = (int)(((zzgax)(object9 = zzys2.zzE)).contains(object11 = Integer.valueOf(n8)) ? 1 : 0)) == 0 && ((n8 = zzzi3.zzc(n14)) == (n19 = -2) || (object11 = object2[n14]) != null)) {
                object11 = zzmq.zza;
            } else {
                n8 = 0;
                object11 = null;
            }
            object12[n14] = object11;
            ++n14;
        }
        return Pair.create((Object)object12, (Object)object2);
    }

    public final zzmo zze() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzys zzf() {
        Object object = this.zzc;
        synchronized (object) {
            return this.zze;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj() {
        Object object = this.zzc;
        synchronized (object) {
            try {
                zzyx zzyx2;
                int n3 = zzgd.zza;
                int n4 = 32;
                if (n3 >= n4 && (zzyx2 = this.zzf) != null) {
                    zzyx2.zzc();
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var1_1
                super.zzj();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzk(zzk zzk2) {
        Object object = this.zzc;
        // MONITORENTER : object
        zzk zzk3 = this.zzg;
        boolean bl2 = zzk3.equals(zzk2) ^ true;
        this.zzg = zzk2;
        // MONITOREXIT : object
        if (!bl2) return;
        this.zzv();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzl(zzyq object) {
        boolean bl2 = false;
        zzys zzys2 = null;
        Object object2 = new zzys((zzyq)object, null);
        object = this.zzc;
        // MONITORENTER : object
        zzys2 = this.zze;
        bl2 = zzys2.equals(object2) ^ true;
        this.zze = object2;
        // MONITOREXIT : object
        if (!bl2) return;
        boolean bl3 = ((zzys)object2).zzS;
        if (bl3 && (object = this.zza) == null) {
            object = "DefaultTrackSelector";
            object2 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
            zzfk.zzf((String)object, (String)object2);
        }
        this.zzt();
    }

    public final boolean zzn() {
        return true;
    }
}

