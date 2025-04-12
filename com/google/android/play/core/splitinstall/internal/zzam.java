/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.content.res.AssetManager
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.play.core.splitcompat.zza;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzal;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.core.splitinstall.internal.zzi;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzam {
    private final zze zza;
    private final zzah zzb;
    private final Context zzc;
    private final zzal zzd;
    private PackageInfo zze;

    public zzam(Context context, zze zze2, zzah zzah2) {
        zza zza2 = new zza(zze2);
        zzal zzal2 = new zzal(zza2);
        this.zza = zze2;
        this.zzb = zzah2;
        this.zzc = context;
        this.zzd = zzal2;
    }

    private final PackageInfo zzd() {
        PackageInfo packageInfo = this.zze;
        if (packageInfo == null) {
            try {
                packageInfo = this.zzc;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            packageInfo = packageInfo.getPackageManager();
            Object object = this.zzc;
            object = object.getPackageName();
            int n3 = 64;
            packageInfo = packageInfo.getPackageInfo((String)object, n3);
            this.zze = packageInfo;
        }
        return this.zze;
    }

    private static X509Certificate zze(Signature object) {
        Object object2 = "X509";
        try {
            object2 = CertificateFactory.getInstance((String)object2);
        }
        catch (CertificateException certificateException) {
            return null;
        }
        object = object.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        object = ((CertificateFactory)object2).generateCertificate(byteArrayInputStream);
        return (X509Certificate)object;
    }

    public final boolean zza(File[] fileArray) {
        long l2;
        PackageInfo packageInfo = this.zzd();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            l2 = ep.a(packageInfo);
        } else {
            int n7 = packageInfo.versionCode;
            l2 = n7;
        }
        AssetManager assetManager = (AssetManager)zzbk.zzc(AssetManager.class);
        int n8 = fileArray.length;
        while ((n8 += -1) >= 0) {
            zzal zzal2 = this.zzd;
            File file = fileArray[n8];
            zzal2.zzb(assetManager, file);
            zzal2 = this.zzd;
            long l3 = zzal2.zza();
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) continue;
            return false;
        }
        return true;
    }

    public final boolean zzb(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = ((Intent)object.next()).getStringExtra("split_id");
            zze zze2 = this.zza;
            bl2 = ((File)(object2 = zze2.zzg((String)object2))).exists();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc(File[] fileArray) {
        int n3;
        X509Certificate x509Certificate;
        int n4;
        Iterator iterator;
        Object object;
        Signature[] signatureArray = this.zzd();
        ArrayList<X509Certificate> arrayList = null;
        if (signatureArray != null && (object = signatureArray.signatures) != null) {
            arrayList = new ArrayList<X509Certificate>();
            signatureArray = signatureArray.signatures;
            int n7 = signatureArray.length;
            iterator = null;
            for (n4 = 0; n4 < n7; ++n4) {
                x509Certificate = zzam.zze(signatureArray[n4]);
                if (x509Certificate == null) continue;
                arrayList.add(x509Certificate);
            }
        }
        if (arrayList != null && (n3 = arrayList.isEmpty()) == 0) {
            n3 = fileArray.length;
            while ((n3 += -1) >= 0) {
                block8: {
                    object = fileArray[n3];
                    try {
                        boolean bl2;
                        object = ((File)object).getAbsolutePath();
                        object = zzi.zza((String)object);
                        if (object == null || (n4 = ((Object)object).length) == 0 || (n4 = ((Object)(iterator = object[0])).length) == 0 || (n4 = (int)(arrayList.isEmpty() ? 1 : 0)) != 0) break block8;
                        iterator = arrayList.iterator();
                        block4: while (bl2 = iterator.hasNext()) {
                            x509Certificate = iterator.next();
                            for (Object object2 : object) {
                                boolean bl3 = (object2 = object2[0]).equals(x509Certificate);
                                if (bl3) continue block4;
                            }
                            break block8;
                        }
                        continue;
                    }
                    catch (Exception exception) {}
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

