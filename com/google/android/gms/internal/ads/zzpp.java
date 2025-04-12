/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.provider.Settings$Global
 *  android.util.Pair
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbg;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpk;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzpm;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zzpo;
import com.google.android.gms.internal.ads.zzpx;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class zzpp {
    public static final zzpp zza;
    static final zzgbf zzb;
    private static final zzgbc zzc;
    private final SparseArray zzd;
    private final int zze;

    static {
        Serializable serializable = zzgbc.zzn(zzpn.zza);
        Object object = new zzpp((List)((Object)serializable));
        zza = object;
        object = 2;
        serializable = Integer.valueOf(5);
        Integer n3 = 6;
        zzc = zzgbc.zzp(object, serializable, n3);
        object = new zzgbe();
        ((zzgbe)object).zza(serializable, n3);
        serializable = Integer.valueOf(17);
        ((zzgbe)object).zza(serializable, n3);
        serializable = Integer.valueOf(7);
        ((zzgbe)object).zza(serializable, n3);
        serializable = Integer.valueOf(30);
        Integer n4 = 10;
        ((zzgbe)object).zza(serializable, n4);
        serializable = Integer.valueOf(18);
        ((zzgbe)object).zza(serializable, n3);
        serializable = Integer.valueOf(8);
        ((zzgbe)object).zza(n3, serializable);
        ((zzgbe)object).zza(serializable, serializable);
        n3 = 14;
        ((zzgbe)object).zza(n3, serializable);
        zzb = ((zzgbe)object).zzc();
    }

    private zzpp(List list) {
        int n3;
        int n4;
        SparseArray sparseArray;
        this.zzd = sparseArray = new SparseArray();
        int n7 = 0;
        sparseArray = null;
        Object object = null;
        for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
            zzpn zzpn2 = (zzpn)list.get(n4);
            SparseArray sparseArray2 = this.zzd;
            int n8 = zzpn2.zzb;
            sparseArray2.put(n8, (Object)zzpn2);
        }
        int n10 = 0;
        list = null;
        while (n7 < (n4 = (object = this.zzd).size())) {
            object = (zzpn)this.zzd.valueAt(n7);
            n4 = object.zzc;
            n10 = Math.max(n10, n4);
            ++n7;
        }
        this.zze = n10;
    }

    public /* synthetic */ zzpp(List list, zzpo zzpo2) {
        this(list);
    }

    public static Uri zza() {
        boolean bl2 = zzpp.zzf();
        if (bl2) {
            return Settings.Global.getUriFor((String)"external_surround_sound_enabled");
        }
        return null;
    }

    public static zzpp zzc(Context context, zzk zzk2, zzpx zzpx2) {
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        intentFilter = context.registerReceiver(null, intentFilter);
        return zzpp.zzd(context, (Intent)intentFilter, zzk2, zzpx2);
    }

    public static zzpp zzd(Context object, Intent object2, zzk object3, zzpx object4) {
        String string2;
        int n3;
        boolean bl2;
        int n4;
        int n7;
        Object object5 = object.getSystemService("audio");
        object5.getClass();
        object5 = (AudioManager)object5;
        int n8 = 33;
        if (object4 == null) {
            n7 = zzgd.zza;
            if (n7 >= n8) {
                object4 = zzpm.zzb((AudioManager)object5, (zzk)object3);
            } else {
                n7 = 0;
                object4 = null;
            }
        }
        if ((n4 = zzgd.zza) >= n8 && ((n8 = (int)(zzgd.zzN(object) ? 1 : 0)) != 0 || (n8 = (int)(zzgd.zzJ(object) ? 1 : 0)) != 0)) {
            return zzpm.zza((AudioManager)object5, (zzk)object3);
        }
        n8 = 23;
        if (n4 >= n8 && (n7 = (int)(zzpk.zza((AudioManager)object5, (zzpx)object4) ? 1 : 0)) != 0) {
            return zza;
        }
        object4 = new zzgbg();
        object5 = 2;
        ((zzgbg)object4).zzf(object5);
        int n10 = 29;
        n8 = 10;
        if (n4 >= n10 && ((n10 = (int)(zzgd.zzN(object) ? 1 : 0)) != 0 || (n10 = (int)(zzgd.zzJ(object) ? 1 : 0)) != 0)) {
            object = zzpl.zzb((zzk)object3);
            ((zzgbg)object4).zzh((Iterable)object);
            object2 = zzpp.zze(zzgea.zzg(((zzgbg)object4).zzi()), n8);
            object = new zzpp((List)object2);
            return object;
        }
        object = object.getContentResolver();
        object3 = "use_external_surround_sound_flag";
        n10 = 0;
        object5 = null;
        int n14 = Settings.Global.getInt((ContentResolver)object, (String)object3, (int)0);
        if (n14 == (n4 = 1)) {
            n14 = 1;
        } else {
            n14 = 0;
            object3 = null;
        }
        if ((n14 != 0 || (bl2 = zzpp.zzf())) && (n3 = Settings.Global.getInt((ContentResolver)object, (String)(string2 = "external_surround_sound_enabled"), (int)0)) == n4) {
            object = zzc;
            ((zzgbg)object4).zzh((Iterable)object);
        }
        if (object2 != null && n14 == 0 && (n3 = object2.getIntExtra((String)(object = "android.media.extra.AUDIO_PLUG_STATE"), 0)) == n4) {
            object = object2.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (object != null) {
                object = zzgea.zzf((int[])object);
                ((zzgbg)object4).zzh((Iterable)object);
            }
            object3 = zzgea.zzg(((zzgbg)object4).zzi());
            int n15 = object2.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", n8);
            object2 = zzpp.zze((int[])object3, n15);
            object = new zzpp((List)object2);
            return object;
        }
        object2 = zzpp.zze(zzgea.zzg(((zzgbg)object4).zzi()), n8);
        object = new zzpp((List)object2);
        return object;
    }

    private static zzgbc zze(int[] nArray, int n3) {
        int n4;
        zzgaz zzgaz2 = new zzgaz();
        for (int i3 = 0; i3 < (n4 = nArray.length); ++i3) {
            n4 = nArray[i3];
            zzpn zzpn2 = new zzpn(n4, n3);
            zzgaz2.zzf(zzpn2);
        }
        return zzgaz2.zzi();
    }

    private static boolean zzf() {
        boolean bl2;
        String string2 = "Amazon";
        String string3 = zzgd.zzc;
        boolean bl3 = string2.equals(string3);
        return bl3 || (bl2 = (string2 = "Xiaomi").equals(string3));
        {
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzpp;
        if (n3 == 0) {
            return false;
        }
        object = (zzpp)object;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = ((zzpp)object).zzd;
        int n4 = zzgd.zza;
        int n7 = 31;
        if (n4 >= n7) {
            n3 = Yy3.a(sparseArray, sparseArray2);
            if (n3 == 0) return false;
        } else {
            n4 = sparseArray.size();
            if (n4 != (n7 = sparseArray2.size())) return false;
            for (n7 = 0; n7 < n4; ++n7) {
                Object object2;
                int n8 = sparseArray.keyAt(n7);
                Object object3 = sparseArray.valueAt(n7);
                n8 = (int)(Objects.equals(object3, object2 = sparseArray2.get(n8)) ? 1 : 0);
                if (n8 == 0) return false;
            }
        }
        n3 = this.zze;
        int n10 = ((zzpp)object).zze;
        if (n3 != n10) return false;
        return bl2;
    }

    public final int hashCode() {
        int n3 = zzgd.zza;
        SparseArray sparseArray = this.zzd;
        int n4 = 31;
        if (n3 >= n4) {
            n3 = Xy3.a(sparseArray);
        } else {
            int n7;
            int n8 = 17;
            for (n3 = 0; n3 < (n7 = sparseArray.size()); ++n3) {
                n7 = (sparseArray.keyAt(n3) + (n8 *= 31)) * 31;
                Object object = sparseArray.valueAt(n3);
                n8 = Objects.hashCode(object) + n7;
            }
            n3 = n8;
        }
        int n10 = this.zze;
        return n3 * 31 + n10;
    }

    public final String toString() {
        String string2 = this.zzd.toString();
        StringBuilder stringBuilder = new StringBuilder("AudioCapabilities[maxChannelCount=");
        int n3 = this.zze;
        stringBuilder.append(n3);
        stringBuilder.append(", audioProfiles=");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    public final Pair zzb(zzan var1_1, zzk var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

