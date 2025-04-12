/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzff;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class zzbh
extends zzbr {
    public static boolean zza;
    private AdvertisingIdClient$Info zzb;
    private final zzfb zzc;
    private String zzd;
    private boolean zze = false;
    private final Object zzf;

    public zzbh(zzbu object) {
        super((zzbu)object);
        Object object2;
        this.zzf = object2 = new Object();
        object = ((zzbu)object).zzr();
        this.zzc = object2 = new zzfb((Clock)object);
    }

    /*
     * Exception decompiling
     */
    private final AdvertisingIdClient$Info zzc() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [10 : 63->66)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    private static String zze(String objectArray) {
        int n3 = 1;
        MessageDigest messageDigest = zzff.zze("MD5");
        if (messageDigest == null) {
            return null;
        }
        Locale locale = Locale.US;
        objectArray = objectArray.getBytes();
        objectArray = messageDigest.digest((byte[])objectArray);
        BigInteger bigInteger = new BigInteger(n3, (byte[])objectArray);
        objectArray = new Object[n3];
        objectArray[0] = bigInteger;
        return String.format(locale, "%032X", objectArray);
    }

    private final boolean zzf(String string2) {
        Object object;
        try {
            string2 = zzbh.zze(string2);
            object = "Storing hashed adid.";
        }
        catch (IOException iOException) {
            this.zzJ("Error creating hash file", iOException);
            return false;
        }
        this.zzN((String)object);
        object = this.zzo();
        Object object2 = "gaClientIdData";
        object = object.openFileOutput((String)object2, 0);
        object2 = string2.getBytes();
        ((FileOutputStream)object).write((byte[])object2);
        ((FileOutputStream)object).close();
        this.zzd = string2;
        return true;
    }

    public final String zza() {
        this.zzV();
        Object object = this.zzc();
        object = object != null ? ((AdvertisingIdClient$Info)object).getId() : null;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return null;
        }
        return object;
    }

    public final boolean zzb() {
        boolean bl2;
        this.zzV();
        AdvertisingIdClient$Info advertisingIdClient$Info = this.zzc();
        return advertisingIdClient$Info != null && !(bl2 = advertisingIdClient$Info.isLimitAdTrackingEnabled());
    }

    public final void zzd() {
    }
}

