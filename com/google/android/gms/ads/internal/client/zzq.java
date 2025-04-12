/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzq
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzq[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    static {
        zzr zzr2 = new zzr();
        CREATOR = zzr2;
    }

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context, AdSize adSize) {
        AdSize[] adSizeArray = new AdSize[]{adSize};
        this(context, adSizeArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public zzq(Context var1_1, AdSize[] var2_2) {
        block24: {
            block23: {
                super();
                var3_3 /* !! */  = var2_2[0];
                this.zzd = false;
                this.zzi = var4_4 = var3_3 /* !! */ .isFluid();
                this.zzm = var5_5 = com.google.android.gms.ads.zzb.zzf((AdSize)var3_3 /* !! */ );
                this.zzn = var5_5 = com.google.android.gms.ads.zzb.zzg((AdSize)var3_3 /* !! */ );
                this.zzo = var5_5 = com.google.android.gms.ads.zzb.zzh((AdSize)var3_3 /* !! */ );
                if (var4_4 != 0) {
                    var6_6 = AdSize.BANNER;
                    this.zze = var7_7 = var6_6.getWidth();
                    this.zzb = var5_5 = var6_6.getHeight();
                } else {
                    var7_7 = this.zzn;
                    if (var7_7 != 0) {
                        this.zze = var5_5 = var3_3 /* !! */ .getWidth();
                        this.zzb = var5_5 = com.google.android.gms.ads.zzb.zza((AdSize)var3_3 /* !! */ );
                    } else if (var5_5 != 0) {
                        this.zze = var5_5 = var3_3 /* !! */ .getWidth();
                        this.zzb = var5_5 = com.google.android.gms.ads.zzb.zzb((AdSize)var3_3 /* !! */ );
                    } else {
                        this.zze = var5_5 = var3_3 /* !! */ .getWidth();
                        this.zzb = var5_5 = var3_3 /* !! */ .getHeight();
                    }
                }
                var7_7 = this.zze;
                var8_8 = -1;
                var9_9 = 1;
                if (var7_7 == var8_8) {
                    var7_7 = 1;
                } else {
                    var7_7 = 0;
                    var10_10 = null;
                }
                var8_8 = -2;
                if (var5_5 == var8_8) {
                    var5_5 = 1;
                } else {
                    var5_5 = 0;
                    var6_6 = null;
                }
                var11_11 /* !! */  = var1_1.getResources().getDisplayMetrics();
                if (var7_7 == 0) break block23;
                zzay.zzb();
                var12_12 = var1_1.getResources().getConfiguration();
                var13_13 = var12_12.orientation;
                var14_14 = 2;
                var15_15 = 2.8E-45f;
                if (var13_13 != var14_14) ** GOTO lbl-1000
                var12_12 = var1_1.getResources().getDisplayMetrics();
                var15_15 = var12_12.heightPixels;
                var16_16 = var12_12.density;
                var13_13 = (int)(var15_15 / var16_16);
                var14_14 = 600;
                var15_15 = 8.41E-43f;
                if (var13_13 >= var14_14) ** GOTO lbl-1000
                zzay.zzb();
                var12_12 = var1_1.getResources().getDisplayMetrics();
                var17_17 = (WindowManager)var1_1.getSystemService("window");
                if (var17_17 == null) ** GOTO lbl-1000
                var17_17 = var17_17.getDefaultDisplay();
                var17_17.getRealMetrics((DisplayMetrics)var12_12);
                var18_18 = var12_12.heightPixels;
                var19_19 = var12_12.widthPixels;
                var17_17.getMetrics((DisplayMetrics)var12_12);
                var14_14 = var12_12.heightPixels;
                var13_13 = var12_12.widthPixels;
                if (var14_14 == var18_18 && var13_13 == var19_19) {
                    var13_13 = var11_11 /* !! */ .widthPixels;
                    zzay.zzb();
                    var17_17 = var1_1.getResources();
                    var20_20 = "dimen";
                    var21_21 = "android";
                    var22_22 = "navigation_bar_width";
                    var14_14 = var17_17.getIdentifier(var22_22, var20_20, var21_21);
                    if (var14_14 > 0) {
                        var20_20 = var1_1.getResources();
                        var14_14 = var20_20.getDimensionPixelSize(var14_14);
                    } else {
                        var14_14 = 0;
                        var15_15 = 0.0f;
                        var17_17 = null;
                    }
                    this.zzf = var13_13 -= var14_14;
                } else lbl-1000:
                // 4 sources

                {
                    this.zzf = var13_13 = var11_11 /* !! */ .widthPixels;
                }
                var15_15 = var11_11 /* !! */ .density;
                var16_16 = (float)var13_13 / var15_15;
                var23_23 = var16_16;
                var18_18 = (int)var23_23;
                var25_24 = var18_18;
                var23_23 -= var25_24;
                var25_24 = 0.01;
                var27_25 = var23_23 == var25_24 ? 0 : (var23_23 > var25_24 ? 1 : -1);
                if (var27_25 >= 0) {
                    ++var18_18;
                }
                break block24;
            }
            var18_18 = this.zze;
            zzay.zzb();
            var13_13 = this.zze;
            this.zzf = var13_13 = com.google.android.gms.ads.internal.util.client.zzf.zzq(var11_11 /* !! */ , var13_13);
        }
        var13_13 = var5_5 != 0 ? zzq.zzf(var11_11 /* !! */ ) : this.zzb;
        zzay.zzb();
        this.zzc = var8_8 = com.google.android.gms.ads.internal.util.client.zzf.zzq(var11_11 /* !! */ , var13_13);
        var11_11 /* !! */  = "_as";
        var17_17 = "x";
        if (var7_7 != 0 || var5_5 != 0) ** GOTO lbl133
        var5_5 = (int)this.zzn;
        if (var5_5 == 0 && (var5_5 = (int)this.zzo) == 0) {
            if (var4_4 != 0) {
                var3_3 /* !! */  = "320x50_mb";
lbl114:
                // 2 sources

                while (true) {
                    this.zza = var3_3 /* !! */ ;
                    break;
                }
            } else {
                var3_3 /* !! */  = var3_3 /* !! */ .toString();
                this.zza = var3_3 /* !! */ ;
            }
        } else {
            var28_26 = this.zze;
            var4_4 = this.zzb;
            var6_6 = new StringBuilder();
            var6_6.append(var28_26);
            var6_6.append(var17_17);
            var6_6.append(var4_4);
            var6_6.append((String)var11_11 /* !! */ );
            var3_3 /* !! */  = var6_6.toString();
            ** continue;
lbl133:
            // 1 sources

            var3_3 /* !! */  = new StringBuilder();
            var3_3 /* !! */ .append(var18_18);
            var3_3 /* !! */ .append(var17_17);
            var3_3 /* !! */ .append(var13_13);
            var3_3 /* !! */ .append((String)var11_11 /* !! */ );
            var3_3 /* !! */  = var3_3 /* !! */ .toString();
            this.zza = var3_3 /* !! */ ;
        }
        var28_26 = var2_2.length;
        if (var28_26 > var9_9) {
            var3_3 /* !! */  = new zzq[var28_26];
            this.zzg = var3_3 /* !! */ ;
            var3_3 /* !! */  = null;
            for (var28_26 = 0; var28_26 < (var4_4 = var2_2.length); ++var28_26) {
                var29_27 = this.zzg;
                var10_10 = var2_2[var28_26];
                var29_27[var28_26] = var6_6 = new zzq(var1_1, var10_10);
            }
        } else {
            var1_1 = null;
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzq(String string2, int n3, int n4, boolean bl2, int n7, int n8, zzq[] zzqArray, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10) {
        this.zza = string2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = bl2;
        this.zze = n7;
        this.zzf = n8;
        this.zzg = zzqArray;
        this.zzh = bl3;
        this.zzi = bl4;
        this.zzj = bl5;
        this.zzk = bl6;
        this.zzl = bl7;
        this.zzm = bl8;
        this.zzn = bl9;
        this.zzo = bl10;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        float f5 = zzq.zzf(displayMetrics);
        float f6 = displayMetrics.density;
        return (int)(f5 * f6);
    }

    public static zzq zzb() {
        zzq zzq2 = new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
        return zzq2;
    }

    public static zzq zzc() {
        zzq zzq2 = new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
        return zzq2;
    }

    public static zzq zzd() {
        zzq zzq2 = new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        return zzq2;
    }

    public static zzq zze() {
        zzq zzq2 = new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
        return zzq2;
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        float f5 = displayMetrics.heightPixels;
        float f6 = displayMetrics.density;
        int n3 = (int)(f5 / f6);
        int n4 = 400;
        f5 = 5.6E-43f;
        if (n3 <= n4) {
            return 32;
        }
        n4 = 720;
        f5 = 1.009E-42f;
        if (n3 <= n4) {
            return 50;
        }
        return 90;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        n7 = (int)(this.zzd ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 5, n7 != 0);
        n7 = this.zze;
        SafeParcelWriter.writeInt(parcel, 6, n7);
        n7 = this.zzf;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        Parcelable[] parcelableArray = this.zzg;
        SafeParcelWriter.writeTypedArray(parcel, 8, parcelableArray, n3, false);
        boolean bl2 = this.zzh;
        SafeParcelWriter.writeBoolean(parcel, 9, bl2);
        bl2 = this.zzi;
        SafeParcelWriter.writeBoolean(parcel, 10, bl2);
        bl2 = this.zzj;
        SafeParcelWriter.writeBoolean(parcel, 11, bl2);
        bl2 = this.zzk;
        SafeParcelWriter.writeBoolean(parcel, 12, bl2);
        bl2 = this.zzl;
        SafeParcelWriter.writeBoolean(parcel, 13, bl2);
        bl2 = this.zzm;
        SafeParcelWriter.writeBoolean(parcel, 14, bl2);
        bl2 = this.zzn;
        SafeParcelWriter.writeBoolean(parcel, 15, bl2);
        bl2 = this.zzo;
        SafeParcelWriter.writeBoolean(parcel, 16, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

