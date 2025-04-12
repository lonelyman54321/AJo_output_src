/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Bundle
 *  android.text.Layout$Alignment
 *  android.text.Spanned
 *  android.text.SpannedString
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzee;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzn;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzei {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    public static final zzei zza;
    public static final zzn zzb;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public final CharSequence zzc;
    public final Layout.Alignment zzd;
    public final Layout.Alignment zze;
    public final Bitmap zzf;
    public final float zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final int zzk;
    public final float zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;
    public final float zzq;

    static {
        Object object = new zzeg();
        ((zzeg)object).zzl("");
        zza = ((zzeg)object).zzp();
        int n3 = 36;
        zzr = Integer.toString(0, n3);
        zzs = Integer.toString(17, n3);
        zzt = Integer.toString(1, n3);
        zzu = Integer.toString(2, n3);
        zzv = Integer.toString(3, n3);
        zzw = Integer.toString(18, n3);
        zzx = Integer.toString(4, n3);
        zzy = Integer.toString(5, n3);
        zzz = Integer.toString(6, n3);
        zzA = Integer.toString(7, n3);
        zzB = Integer.toString(8, n3);
        zzC = Integer.toString(9, n3);
        zzD = Integer.toString(10, n3);
        zzE = Integer.toString(11, n3);
        zzF = Integer.toString(12, n3);
        zzG = Integer.toString(13, n3);
        zzH = Integer.toString(14, n3);
        zzI = Integer.toString(15, n3);
        zzJ = Integer.toString(16, n3);
        zzb = object = new zzee();
    }

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ zzei(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f5, int n3, int n4, float f6, int n7, int n8, float f7, float f8, float f11, boolean bl2, int n10, int n14, float f12, zzeh zzeh2) {
        boolean bl3;
        zzei zzei2 = this;
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            bl3 = bitmap == null;
            zzeq.zzd(bl3);
        }
        bl3 = charSequence2 instanceof Spanned;
        if (bl3) {
            zzei2.zzc = charSequence2 = SpannedString.valueOf((CharSequence)charSequence);
        } else {
            charSequence2 = charSequence2 != null ? ((Object)charSequence).toString() : null;
            zzei2.zzc = charSequence2;
        }
        charSequence2 = alignment;
        zzei2.zzd = alignment;
        charSequence2 = alignment2;
        zzei2.zze = alignment2;
        zzei2.zzf = bitmap2;
        zzei2.zzg = f5;
        zzei2.zzh = n3;
        zzei2.zzi = n4;
        zzei2.zzj = f6;
        zzei2.zzk = n7;
        zzei2.zzl = f8;
        zzei2.zzm = f11;
        zzei2.zzn = n8;
        zzei2.zzo = f7;
        zzei2.zzp = n14;
        zzei2.zzq = f12;
    }

    public final boolean equals(Object object) {
        block5: {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            float f12;
            float f14;
            int n3;
            int n4;
            boolean bl2;
            block7: {
                Object object2;
                Object object3;
                block6: {
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = zzei.class) != (object2 = object.getClass())) break block5;
                    object = (zzei)object;
                    object2 = this.zzc;
                    object3 = ((zzei)object).zzc;
                    n4 = TextUtils.equals((CharSequence)object2, (CharSequence)object3);
                    if (n4 == 0 || (object2 = this.zzd) != (object3 = ((zzei)object).zzd) || (object2 = this.zze) != (object3 = ((zzei)object).zze)) break block5;
                    object2 = this.zzf;
                    if (object2 != null) break block6;
                    object2 = ((zzei)object).zzf;
                    if (object2 != null) break block5;
                    break block7;
                }
                object3 = ((zzei)object).zzf;
                if (object3 == null || (n4 = object2.sameAs((Bitmap)object3)) == 0) break block5;
            }
            float f15 = this.zzg;
            float f16 = ((zzei)object).zzg;
            n4 = f15 == f16 ? 0 : (f15 > f16 ? 1 : -1);
            if (n4 == 0 && (n4 = this.zzh) == (n3 = ((zzei)object).zzh) && (n4 = this.zzi) == (n3 = ((zzei)object).zzi) && (n4 = (int)((f14 = (f15 = this.zzj) - (f16 = ((zzei)object).zzj)) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) == 0 && (n4 = this.zzk) == (n3 = ((zzei)object).zzk) && (n4 = (int)((f12 = (f15 = this.zzl) - (f16 = ((zzei)object).zzl)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) == 0 && (n4 = (int)((f11 = (f15 = this.zzm) - (f16 = ((zzei)object).zzm)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) == 0 && (n4 = this.zzn) == (n3 = ((zzei)object).zzn) && (n4 = (int)((f8 = (f15 = this.zzo) - (f16 = ((zzei)object).zzo)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) == 0 && (n4 = this.zzp) == (n3 = ((zzei)object).zzp) && (f7 = (f6 = (f15 = this.zzq) - (f5 = ((zzei)object).zzq)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objectArray = this;
        Object object = this.zzc;
        Layout.Alignment alignment = this.zzd;
        Layout.Alignment alignment2 = this.zze;
        Bitmap bitmap = this.zzf;
        Float f5 = Float.valueOf(this.zzg);
        Integer n3 = this.zzh;
        Integer n4 = this.zzi;
        Float f6 = Float.valueOf(this.zzj);
        Integer n7 = this.zzk;
        Float f7 = Float.valueOf(this.zzl);
        Float f8 = Float.valueOf(this.zzm);
        Integer n8 = -16777216;
        Integer n10 = this.zzn;
        Float f11 = Float.valueOf(this.zzo);
        Integer n14 = this.zzp;
        Float f12 = Float.valueOf(this.zzq);
        objectArray = new Object[]{object, alignment, alignment2, bitmap, f5, n3, n4, f6, n7, f7, f8, object = Boolean.FALSE, n8, n10, f11, n14, f12};
        return Arrays.hashCode(objectArray);
    }

    public final Bundle zza() {
        boolean bl2;
        String string2;
        Bundle bundle = new Bundle();
        Object object = this.zzc;
        if (object != null) {
            string2 = zzr;
            bundle.putCharSequence(string2, (CharSequence)object);
            object = this.zzc;
            bl2 = object instanceof Spanned;
            if (bl2 && !(bl2 = ((ArrayList)(object = zzel.zza((Spanned)object))).isEmpty())) {
                string2 = zzs;
                bundle.putParcelableArrayList(string2, (ArrayList)object);
            }
        }
        object = this.zzd;
        string2 = zzt;
        bundle.putSerializable(string2, (Serializable)object);
        object = this.zze;
        string2 = zzu;
        bundle.putSerializable(string2, (Serializable)object);
        float f5 = this.zzg;
        string2 = zzx;
        bundle.putFloat(string2, f5);
        int n3 = this.zzh;
        string2 = zzy;
        bundle.putInt(string2, n3);
        n3 = this.zzi;
        string2 = zzz;
        bundle.putInt(string2, n3);
        f5 = this.zzj;
        string2 = zzA;
        bundle.putFloat(string2, f5);
        n3 = this.zzk;
        string2 = zzB;
        bundle.putInt(string2, n3);
        n3 = this.zzn;
        string2 = zzC;
        bundle.putInt(string2, n3);
        f5 = this.zzo;
        string2 = zzD;
        bundle.putFloat(string2, f5);
        f5 = this.zzl;
        string2 = zzE;
        bundle.putFloat(string2, f5);
        f5 = this.zzm;
        string2 = zzF;
        bundle.putFloat(string2, f5);
        object = zzH;
        bl2 = false;
        string2 = null;
        bundle.putBoolean((String)object, false);
        object = zzG;
        int n4 = -16777216;
        bundle.putInt((String)object, n4);
        n3 = this.zzp;
        String string3 = zzI;
        bundle.putInt(string3, n3);
        f5 = this.zzq;
        string3 = zzJ;
        bundle.putFloat(string3, f5);
        object = this.zzf;
        if (object != null) {
            object = new ByteArrayOutputStream();
            string3 = this.zzf;
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            bl2 = string3.compress(compressFormat, 0, (OutputStream)object);
            zzeq.zzf(bl2);
            string2 = zzw;
            object = ((ByteArrayOutputStream)object).toByteArray();
            bundle.putByteArray(string2, (byte[])object);
        }
        return bundle;
    }

    public final zzeg zzb() {
        zzeg zzeg2 = new zzeg(this, null);
        return zzeg2;
    }
}

