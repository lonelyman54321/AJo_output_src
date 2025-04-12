/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxu;
import com.google.android.gms.internal.ads.zzaxw;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class zzaxa
implements zzawz {
    protected static volatile zzaye zza;
    protected MotionEvent zzb;
    protected final LinkedList zzc;
    protected long zzd;
    protected long zze;
    protected long zzf;
    protected long zzg;
    protected long zzh;
    protected long zzi;
    protected long zzj;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp;
    protected DisplayMetrics zzq;
    protected zzaxw zzr;
    private double zzs;
    private double zzt;
    private boolean zzu;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzaxa(Context object) {
        long l2;
        Object object2 = new LinkedList();
        this.zzc = object2;
        this.zzd = l2 = 0L;
        this.zze = l2;
        this.zzf = l2;
        this.zzg = l2;
        this.zzh = l2;
        this.zzi = l2;
        this.zzj = l2;
        object2 = null;
        this.zzu = false;
        this.zzp = false;
        try {
            zzavs.zze();
            object = object.getResources();
            object = object.getDisplayMetrics();
            this.zzq = object;
            object = zzbep.zzcH;
            object2 = zzba.zzc();
            object = ((zzben)object2).zza((zzbeg)object);
            object = (Boolean)object;
            boolean bl2 = (Boolean)object;
            if (!bl2) return;
            this.zzr = object = new zzaxw();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private final void zzj() {
        long l2;
        this.zzh = l2 = 0L;
        this.zzd = l2;
        this.zze = l2;
        this.zzf = l2;
        this.zzg = l2;
        this.zzi = l2;
        this.zzj = l2;
        Object object = this.zzc;
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (!bl2) {
            boolean bl3;
            object = ((AbstractCollection)this.zzc).iterator();
            while (bl3 = object.hasNext()) {
                MotionEvent motionEvent = (MotionEvent)object.next();
                motionEvent.recycle();
            }
            object = this.zzc;
            ((LinkedList)object).clear();
        } else {
            object = this.zzb;
            if (object != null) {
                object.recycle();
            }
        }
        this.zzb = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzm(Context var1_1, String var2_2, int var3_3, View var4_4, Activity var5_5, byte[] var6_6) {
        block29: {
            block28: {
                block27: {
                    block24: {
                        block26: {
                            block25: {
                                block23: {
                                    block30: {
                                        var7_7 = this;
                                        var8_8 /* !! */  = var1_1;
                                        var9_13 = var3_3;
                                        var10_14 = var4_4;
                                        var11_15 = var5_5;
                                        var12_16 = System.currentTimeMillis();
                                        var14_17 = zzbep.zzcz;
                                        var14_17 = (Boolean)zzba.zzc().zza((zzbeg)var14_17);
                                        var15_18 = var14_17.booleanValue();
                                        var16_19 = null;
                                        if (var15_18) {
                                            var17_20 = zzaxa.zza;
                                            var17_20 = var17_20 != null ? zzaxa.zza.zzd() : null;
                                            var18_21 = "be";
                                        } else {
                                            var17_20 = null;
                                            var18_21 = null;
                                        }
                                        var19_22 = true;
                                        var20_23 = 2;
                                        var21_24 = 3;
                                        if (var9_13 != var21_24) break block30;
                                        try {
                                            var16_19 = var7_7.zzb(var8_8 /* !! */ , var10_14, var11_15);
                                        }
                                        catch (Exception var8_11) {
                                            var25_28 = 3;
                                            break block23;
                                        }
                                        try {
                                            var7_7.zzu = var19_22;
                                            var22_25 = 1002;
                                            var23_26 = 1002;
                                            ** GOTO lbl48
                                        }
                                        catch (Exception var8_9) {
                                            var24_27 /* !! */  = var8_9;
                                            var25_28 = 3;
                                            break block24;
                                        }
                                    }
                                    if (var9_13 != var20_23) ** GOTO lbl44
                                    {
                                        block31: {
                                            var8_8 /* !! */  = var7_7.zzd(var8_8 /* !! */ , var10_14, var11_15);
                                            var26_29 = 1008;
                                            var16_19 = var8_8 /* !! */ ;
                                            var23_26 = 1008;
                                            break block31;
lbl44:
                                            // 1 sources

                                            var8_8 /* !! */  = var7_7.zzc(var8_8 /* !! */ , null);
                                            var26_29 = 1000;
                                            var16_19 = var8_8 /* !! */ ;
                                            var23_26 = 1000;
                                        }
                                        if (!var15_18 || var17_20 == null) break block25;
                                        var27_30 = System.currentTimeMillis() - var12_16;
                                        var22_25 = -1;
                                        var24_27 /* !! */  = null;
                                        var25_28 = 3;
                                        var21_24 = var22_25;
                                        var29_31 = var27_30;
                                    }
                                    try {
                                        var17_20.zzc(var23_26, var22_25, var27_30, var18_21, null);
                                        break block26;
                                    }
                                    catch (Exception var8_10) {}
                                }
                                var24_27 /* !! */  = var8_8 /* !! */ ;
                                break block24;
                            }
                            var25_28 = 3;
                        }
lbl66:
                        // 2 sources

                        while (true) {
                            var26_29 = 2;
                            break block27;
                            break;
                        }
                    }
                    ** while (!var15_18 || var17_20 == null)
lbl71:
                    // 1 sources

                    if (var9_13 == var25_28) {
                        var22_25 = 1003;
                        var26_29 = 2;
                        var23_26 = 1003;
                    } else {
                        var26_29 = 2;
                        if (var9_13 == var26_29) {
                            var22_25 = 1009;
                            var23_26 = 1009;
                        } else {
                            var22_25 = 1001;
                            var9_13 = 1;
                            var23_26 = 1001;
                        }
                    }
                    var31_32 = System.currentTimeMillis();
                    var29_31 = var31_32 - var12_16;
                    var21_24 = -1;
                    var17_20.zzc(var23_26, var21_24, var29_31, var18_21, (Exception)var24_27 /* !! */ );
                }
                var33_33 = System.currentTimeMillis();
                if (var16_19 != null) {
                    try {
                        var8_8 /* !! */  = var16_19.zzbn();
                        var8_8 /* !! */  = (zzaus)var8_8 /* !! */ ;
                        var22_25 = var8_8 /* !! */ .zzaY();
                        if (var22_25 == 0) break block28;
                        var8_8 /* !! */  = var16_19.zzbn();
                        var8_8 /* !! */  = (zzaus)var8_8 /* !! */ ;
                    }
                    catch (Exception var8_12) {
                        var24_27 /* !! */  = var8_12;
                        break block29;
                    }
                    {
                        var8_8 /* !! */  = (Context)var8_8 /* !! */ .zzaV();
                        var8_8 /* !! */  = zzavs.zzb((byte[])var8_8 /* !! */ , var2_2);
                        if (var15_18 == false) return var8_8 /* !! */ ;
                        if (var17_20 == null) return var8_8 /* !! */ ;
                        var23_26 = var9_13 == var25_28 ? 1006 : (var9_13 == var26_29 ? 1010 : 1004);
                        var31_32 = System.currentTimeMillis();
                        var29_31 = var31_32 - var33_33;
                        var21_24 = -1;
                        var24_27 /* !! */  = null;
                    }
                    var17_20.zzc(var23_26, var21_24, var29_31, var18_21, null);
                    return var8_8 /* !! */ ;
                }
            }
            var22_25 = 5;
            return Integer.toString(var22_25);
        }
        var22_25 = 7;
        var8_8 /* !! */  = Integer.toString(var22_25);
        if (var15_18 == false) return var8_8 /* !! */ ;
        if (var17_20 == null) return var8_8 /* !! */ ;
        if (var9_13 == var25_28) {
            var25_28 = 1007;
            var23_26 = 1007;
        } else if (var9_13 == var26_29) {
            var25_28 = 1011;
            var23_26 = 1011;
        } else {
            var25_28 = 1005;
            var23_26 = 1005;
        }
        var35_34 = System.currentTimeMillis();
        var29_31 = var35_34 - var33_33;
        var21_24 = -1;
        var17_20.zzc(var23_26, var21_24, var29_31, var18_21, (Exception)var24_27 /* !! */ );
        return var8_8 /* !! */ ;
    }

    public abstract long zza(StackTraceElement[] var1);

    public abstract zzatp zzb(Context var1, View var2, Activity var3);

    public abstract zzatp zzc(Context var1, zzatg var2);

    public abstract zzatp zzd(Context var1, View var2, Activity var3);

    public final String zze(Context context, String string2, View view) {
        return this.zzm(context, string2, 3, view, null, null);
    }

    public final String zzf(Context context, String string2, View view, Activity activity) {
        return this.zzm(context, string2, 3, view, activity, null);
    }

    public final String zzg(Context object) {
        boolean bl2 = zzayh.zzc();
        if (!bl2) {
            return this.zzm((Context)object, null, 1, null, null, null);
        }
        object = new IllegalStateException("The caller must not be called from the UI thread.");
        throw object;
    }

    public final String zzh(Context context, View view, Activity activity) {
        return this.zzm(context, null, 2, view, activity, null);
    }

    public abstract zzayg zzi(MotionEvent var1);

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(MotionEvent var1_1) {
        synchronized (this) {
            block21: {
                block20: {
                    try {
                        var2_3 = this.zzu;
                        if (var2_3 == 0) break block20;
                        this.zzj();
                        var2_3 = 0;
                        var3_4 = 0.0f;
                        var4_5 = null;
                        this.zzu = false;
                    }
                    catch (Throwable var1_2) {
                        break block21;
                    }
                }
                var2_3 = var1_1.getAction();
                var5_6 = 2;
                var6_7 = 1;
                if (var2_3 == 0) ** GOTO lbl35
                if (var2_3 != var6_7 && var2_3 != var5_6) ** GOTO lbl43
                var3_4 = var1_1.getRawX();
                var7_8 = var3_4;
                {
                    var3_4 = var1_1.getRawY();
                }
                var9_9 = var3_4;
                {
                    var11_10 = this.zzs;
                    var11_10 = var7_8 - var11_10;
                }
                {
                    var13_11 = this.zzt;
                    var13_11 = var9_9 - var13_11;
                }
                {
                    var15_12 = this.zzk;
                    var11_10 *= var11_10;
                    var13_11 = var13_11 * var13_11 + var11_10;
                }
                {
                    var11_10 = Math.sqrt(var13_11);
                }
                {
                    this.zzk = var15_12 += var11_10;
                    this.zzs = var7_8;
                    this.zzt = var9_9;
                    ** GOTO lbl43
lbl35:
                    // 1 sources

                    var17_13 = 0L;
                    this.zzk = var7_8 = 0.0;
                    var3_4 = var1_1.getRawX();
                }
                var7_8 = var3_4;
                {
                    this.zzs = var7_8;
                    var3_4 = var1_1.getRawY();
                }
                var7_8 = var3_4;
                {
                    block22: {
                        block23: {
                            this.zzt = var7_8;
lbl43:
                            // 3 sources

                            var2_3 = var1_1.getAction();
                            var17_13 = 1L;
                            var7_8 = 4.9E-324;
                            if (var2_3 == 0) break block22;
                            if (var2_3 == var6_7) break block23;
                            if (var2_3 != var5_6) {
                                var19_14 = 3;
                                var20_16 = 4.2E-45f;
                                if (var2_3 == var19_14) {
                                    this.zzg = var21_18 = this.zzg + var17_13;
                                }
                            } else {
                                var21_19 = this.zze;
                                var23_22 = var1_1.getHistorySize() + var6_7;
                                var17_13 = var23_22;
                                this.zze = var21_19 += var17_13;
                                var1_1 = this.zzi((MotionEvent)var1_1);
                                var4_5 = var1_1.zzd;
                                if (var4_5 != null && (var24_23 = var1_1.zzg) != null) {
                                    var17_13 = this.zzi;
                                    var21_19 = var4_5.longValue();
                                    var25_24 = var1_1.zzg;
                                    var26_25 = var25_24;
                                    this.zzi = var21_19 = var21_19 + var26_25 + var17_13;
                                }
                                if ((var4_5 = this.zzq) == null || (var4_5 = var1_1.zze) == null || (var24_23 = var1_1.zzh) == null) ** GOTO lbl73
                                var17_13 = this.zzj;
                                var21_19 = var4_5.longValue();
                                var1_1 = var1_1.zzh;
                                var26_25 = var1_1.longValue();
                                this.zzj = var21_19 = var21_19 + var26_25 + var17_13;
                            }
lbl73:
                            // 5 sources

                            while (true) {
                                this.zzp = var6_7;
                                return;
                            }
                            catch (zzaxu v0) {}
                            ** GOTO lbl73
                        }
                        var1_1 = MotionEvent.obtain((MotionEvent)var1_1);
                        this.zzb = var1_1;
                        var4_5 = this.zzc;
                        var4_5.add(var1_1);
                        var1_1 = this.zzc;
                        var19_15 = var1_1.size();
                        var2_3 = 6;
                        var3_4 = 8.4E-45f;
                        if (var19_15 > var2_3) {
                            var1_1 = this.zzc;
                            var1_1 = var1_1.remove();
                            var1_1.recycle();
                        }
                        this.zzf = var21_20 = this.zzf + var17_13;
                        {
                            var1_1 = new Throwable();
                            var1_1 = var1_1.getStackTrace();
                            this.zzh = var21_20 = this.zza((StackTraceElement[])var1_1);
                            ** GOTO lbl73
                        }
                    }
                    this.zzl = var3_4 = var1_1.getX();
                    this.zzm = var3_4 = var1_1.getY();
                    this.zzn = var3_4 = var1_1.getRawX();
                    this.zzo = var20_17 = var1_1.getRawY();
                    this.zzd = var21_21 = this.zzd + var17_13;
                    ** continue;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(int n3, int n4, int n7) {
        zzaxa zzaxa2 = this;
        synchronized (this) {
            Throwable throwable2;
            block10: {
                float f5;
                boolean bl2;
                Object object;
                block9: {
                    block8: {
                        try {
                            object = this.zzb;
                            if (object != null) {
                                object = zzbep.zzcx;
                                zzben zzben2 = zzba.zzc();
                                object = zzben2.zza((zzbeg)object);
                                bl2 = (Boolean)(object = (Boolean)object);
                                if (bl2) {
                                    this.zzj();
                                } else {
                                    object = this.zzb;
                                    object.recycle();
                                }
                            }
                            if ((object = zzaxa2.zzq) == null) break block8;
                        }
                        catch (Throwable throwable2) {}
                        long l2 = n7;
                        float f6 = n3;
                        f5 = ((DisplayMetrics)object).density;
                        float f7 = f6 * f5;
                        f6 = n4;
                        float f8 = f6 * f5;
                        long l3 = 0L;
                        int n8 = 1;
                        object = MotionEvent.obtain((long)l3, (long)l2, (int)n8, (float)f7, (float)f8, (float)0.0f, (float)0.0f, (int)0, (float)0.0f, (float)0.0f, (int)0, (int)0);
                        zzaxa2.zzb = object;
                        break block9;
                        break block10;
                    }
                    bl2 = false;
                    f5 = 0.0f;
                    object = null;
                    zzaxa2.zzb = null;
                }
                bl2 = false;
                f5 = 0.0f;
                object = null;
                zzaxa2.zzp = false;
                return;
            }
            throw throwable2;
        }
    }

    public final void zzn(StackTraceElement[] object) {
        Object object2 = zzbep.zzcH;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && (object2 = this.zzr) != null) {
            object = Arrays.asList(object);
            ((zzaxw)object2).zzb((List)object);
        }
    }

    public void zzo(View view) {
    }
}

