/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.internal.plus.zzr$zza;
import com.google.android.gms.internal.plus.zzr$zzb;
import com.google.android.gms.internal.plus.zzr$zzc;
import com.google.android.gms.internal.plus.zzr$zzd;
import com.google.android.gms.internal.plus.zzr$zze;
import com.google.android.gms.internal.plus.zzr$zzf;
import com.google.android.gms.internal.plus.zzr$zzg;
import java.util.HashSet;

public final class zzs
implements Parcelable.Creator {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final /* synthetic */ Object createFromParcel(Parcel var1_1) {
        var2_2 /* !! */  = var1_1;
        var3_3 = SafeParcelReader.validateObjectHeader(var1_1);
        var4_4 = new HashSet<SafeParcelReader$ParseException>();
        var5_5 = 0;
        var6_6 /* !! */  = null;
        var7_7 = null;
        var8_8 /* !! */  = null;
        var9_9 = null;
        var10_10 = null;
        var11_11 /* !! */  = null;
        var12_12 = null;
        var13_13 = null;
        var14_14 = null;
        var15_15 /* !! */  = null;
        var16_16 = null;
        var17_17 = null;
        var18_18 = null;
        var19_19 = null;
        var20_20 = null;
        var21_21 = null;
        var22_22 = null;
        var23_23 = null;
        var24_24 = 0;
        var25_25 = 0;
        var26_26 = 0;
        var27_27 = false;
        var28_28 = 0;
        var29_29 = 0;
        var30_30 = 0;
        var31_31 = false;
        block27: while ((var5_5 = var1_1.dataPosition()) < var3_3) {
            var5_5 = SafeParcelReader.readHeader(var1_1);
            var32_32 = SafeParcelReader.getFieldId(var5_5);
            switch (var32_32) {
                default: {
                    SafeParcelReader.skipUnknownField(var2_2 /* !! */ , var5_5);
                    continue block27;
                }
                case 29: {
                    var31_31 = SafeParcelReader.readBoolean(var2_2 /* !! */ , var5_5);
                    var5_5 = 29;
lbl41:
                    // 21 sources

                    while (true) {
                        var6_6 /* !! */  = Integer.valueOf(var5_5);
                        var4_4.add(var6_6 /* !! */ );
                        continue block27;
                        break;
                    }
                }
                case 28: {
                    var33_33 = var15_15 /* !! */ ;
                    var15_15 /* !! */  = zzr$zzg.CREATOR;
                    var23_23 = SafeParcelReader.createTypedList(var2_2 /* !! */ , var5_5, var15_15 /* !! */ );
                    var5_5 = 28;
lbl51:
                    // 4 sources

                    while (true) {
                        var6_6 /* !! */  = Integer.valueOf(var5_5);
                        var4_4.add(var6_6 /* !! */ );
                        var15_15 /* !! */  = var33_33;
                        continue block27;
                        break;
                    }
                }
                case 27: {
                    var33_33 = var15_15 /* !! */ ;
                    var22_22 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 27;
                    ** GOTO lbl41
                }
                case 26: {
                    var33_33 = var15_15 /* !! */ ;
                    var21_21 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 26;
                    ** GOTO lbl41
                }
                case 25: {
                    var33_33 = var15_15 /* !! */ ;
                    var30_30 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
                    var5_5 = 25;
                    ** GOTO lbl41
                }
                case 24: {
                    var33_33 = var15_15 /* !! */ ;
                    var29_29 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
                    var5_5 = 24;
                    ** GOTO lbl41
                }
                case 23: {
                    var33_33 = var15_15 /* !! */ ;
                    var15_15 /* !! */  = zzr$zzf.CREATOR;
                    var20_20 = SafeParcelReader.createTypedList(var2_2 /* !! */ , var5_5, var15_15 /* !! */ );
                    var5_5 = 23;
                    ** GOTO lbl51
                }
                case 22: {
                    var33_33 = var15_15 /* !! */ ;
                    var15_15 /* !! */  = zzr$zze.CREATOR;
                    var19_19 = SafeParcelReader.createTypedList(var2_2 /* !! */ , var5_5, var15_15 /* !! */ );
                    var5_5 = 22;
                    ** GOTO lbl51
                }
                case 21: {
                    var33_33 = var15_15 /* !! */ ;
                    var28_28 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
                    var5_5 = 21;
                    ** GOTO lbl41
                }
                case 20: {
                    var33_33 = var15_15 /* !! */ ;
                    var18_18 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 20;
                    ** GOTO lbl41
                }
                case 19: {
                    var33_33 = var15_15 /* !! */ ;
                    var15_15 /* !! */  = zzr$zzd.CREATOR;
                    var6_6 /* !! */  = SafeParcelReader.createParcelable(var2_2 /* !! */ , var5_5, var15_15 /* !! */ );
                    var17_17 = var6_6 /* !! */ ;
                    var17_17 = (zzr$zzd)var6_6 /* !! */ ;
                    var5_5 = 19;
                    ** continue;
                }
                case 18: {
                    var33_33 = var15_15 /* !! */ ;
                    var16_16 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 18;
                    ** GOTO lbl41
                }
                case 16: {
                    var33_33 = var15_15 /* !! */ ;
                    var27_27 = SafeParcelReader.readBoolean(var2_2 /* !! */ , var5_5);
                    var5_5 = 16;
                    ** GOTO lbl41
                }
                case 15: {
                    var15_15 /* !! */  = zzr$zzc.CREATOR;
                    var6_6 /* !! */  = SafeParcelReader.createParcelable(var2_2 /* !! */ , var5_5, var15_15 /* !! */ );
                    var15_15 /* !! */  = var6_6 /* !! */ ;
                    var15_15 /* !! */  = (zzr$zzc)var6_6 /* !! */ ;
                    var5_5 = 15;
                    ** GOTO lbl41
                }
                case 14: {
                    var33_33 = var15_15 /* !! */ ;
                    var14_14 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 14;
                    ** GOTO lbl41
                }
                case 12: {
                    var33_33 = var15_15 /* !! */ ;
                    var26_26 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
                    var5_5 = 12;
                    ** GOTO lbl41
                }
                case 9: {
                    var33_33 = var15_15 /* !! */ ;
                    var13_13 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 9;
                    ** GOTO lbl41
                }
                case 8: {
                    var33_33 = var15_15 /* !! */ ;
                    var12_12 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 8;
                    ** GOTO lbl41
                }
                case 7: {
                    var33_33 = var15_15 /* !! */ ;
                    var11_11 /* !! */  = zzr$zzb.CREATOR;
                    var6_6 /* !! */  = SafeParcelReader.createParcelable(var2_2 /* !! */ , var5_5, var11_11 /* !! */ );
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var11_11 /* !! */  = (zzr$zzb)var6_6 /* !! */ ;
                    var5_5 = 7;
                    ** GOTO lbl41
                }
                case 6: {
                    var33_33 = var15_15 /* !! */ ;
                    var25_25 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
                    var5_5 = 6;
                    ** GOTO lbl41
                }
                case 5: {
                    var33_33 = var15_15 /* !! */ ;
                    var10_10 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 5;
                    ** GOTO lbl41
                }
                case 4: {
                    var33_33 = var15_15 /* !! */ ;
                    var9_9 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 4;
                    ** GOTO lbl41
                }
                case 3: {
                    var33_33 = var15_15 /* !! */ ;
                    var8_8 /* !! */  = zzr$zza.CREATOR;
                    var6_6 /* !! */  = SafeParcelReader.createParcelable(var2_2 /* !! */ , var5_5, var8_8 /* !! */ );
                    var8_8 /* !! */  = var6_6 /* !! */ ;
                    var8_8 /* !! */  = (zzr$zza)var6_6 /* !! */ ;
                    var5_5 = 3;
                    ** GOTO lbl41
                }
                case 2: {
                    var33_33 = var15_15 /* !! */ ;
                    var7_7 = SafeParcelReader.createString(var2_2 /* !! */ , var5_5);
                    var5_5 = 2;
                    ** GOTO lbl41
                }
                case 1: 
            }
            var33_33 = var15_15 /* !! */ ;
            var24_24 = SafeParcelReader.readInt(var2_2 /* !! */ , var5_5);
            var5_5 = 1;
            ** continue;
        }
        var33_33 = var15_15 /* !! */ ;
        var5_5 = var1_1.dataPosition();
        if (var5_5 == var3_3) {
            var6_6 /* !! */  = var2_2 /* !! */ ;
            var2_2 /* !! */  = new zzr(var4_4, var24_24, var7_7, (zzr$zza)var8_8 /* !! */ , var9_9, var10_10, var25_25, (zzr$zzb)var11_11 /* !! */ , var12_12, var13_13, var26_26, var14_14, (zzr$zzc)var15_15 /* !! */ , var27_27, var16_16, (zzr$zzd)var17_17, var18_18, var28_28, var19_19, var20_20, var29_29, var30_30, var21_21, var22_22, var23_23, var31_31);
            return var2_2 /* !! */ ;
        }
        var34_34 = tk3_2.a(37, var3_3, "Overread allowed size end=");
        var6_6 /* !! */  = new SafeParcelReader$ParseException(var34_34, var2_2 /* !! */ );
        throw var6_6 /* !! */ ;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr[n3];
    }
}

