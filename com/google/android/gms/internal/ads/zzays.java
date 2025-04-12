/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzggm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzays
extends zzazs {
    private static final zzazt zzi;
    private final Context zzj;

    static {
        zzazt zzazt2;
        zzi = zzazt2 = new zzazt();
    }

    public zzays(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, Context context, zzatg zzatg2) {
        super(zzaye2, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzatp2, n3, 27);
        this.zzj = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzc() {
        try {
            Object object = this.zzb;
            object = ((zzaye)object).zzl();
            if (object != null) {
                object = this.zzb;
                object = ((zzaye)object).zzl();
                object.get();
            }
            object = this.zzb;
            if ((object = ((zzaye)object).zzc()) == null) return null;
            boolean bl2 = ((zzaus)object).zzar();
            if (!bl2) return null;
            return ((zzaus)object).zzi();
        }
        catch (InterruptedException | ExecutionException exception) {}
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza() {
        Object object;
        Object object2;
        Object object4;
        Object object3;
        block18: {
            zzben zzben2;
            Object object9;
            Object object8;
            Object object6;
            Object object7;
            int n4;
            int n3;
            block20: {
                boolean bl5;
                block19: {
                    boolean bl4;
                    boolean bl2;
                    boolean bl3;
                    n3 = 3;
                    n4 = 0;
                    object3 = null;
                    int n7 = 1;
                    object4 = zzi;
                    Object object5 = this.zzj.getPackageName();
                    object4 = ((zzazt)object4).zza((String)object5);
                    // MONITORENTER : object4
                    object5 = ((AtomicReference)object4).get();
                    object5 = (zzavp)object5;
                    if (object5 != null && !(bl3 = zzayh.zzd((String)(object7 = ((zzavp)object5).zza))) && !(bl3 = ((String)(object7 = ((zzavp)object5).zza)).equals(object6 = "E")) && !(bl2 = ((String)(object5 = ((zzavp)object5).zza)).equals(object7 = "0000000000000000000000000000000000000000000000000000000000000000"))) break block18;
                    bl2 = false;
                    object5 = null;
                    bl3 = zzayh.zzd(null);
                    if (!bl3) {
                        object7 = zzatl.zze;
                    } else {
                        zzayh.zzd(null);
                        object7 = zzatl.zzc;
                    }
                    object6 = zzatl.zzc;
                    if (object7 == object6) {
                        bl4 = true;
                    } else {
                        bl4 = false;
                        object6 = null;
                    }
                    object6 = bl4;
                    object8 = zzbep.zzcu;
                    object9 = zzba.zzc();
                    object8 = ((zzben)object9).zza((zzbeg)object8);
                    object8 = (Boolean)object8;
                    object9 = zzbep.zzct;
                    zzben2 = zzba.zzc();
                    object9 = zzben2.zza((zzbeg)object9);
                    object9 = (Boolean)object9;
                    bl5 = (Boolean)object9;
                    if (!bl5) break block19;
                    object9 = this.zzb();
                    break block20;
                }
                bl5 = false;
                object9 = null;
            }
            boolean bl6 = (Boolean)object8;
            if (bl6 && (bl6 = ((zzaye)(object8 = this.zzb)).zzp()) && (bl6 = zzayh.zzd((String)object9))) {
                object9 = this.zzc();
            }
            object8 = this.zzf;
            zzben2 = this.zzj;
            Object[] objectArray = new Object[n3];
            objectArray[0] = zzben2;
            objectArray[n7] = object6;
            n4 = 2;
            objectArray[n4] = object9;
            object3 = ((Method)object8).invoke(null, objectArray);
            object3 = (String)object3;
            object2 = new zzavp((String)object3);
            object3 = ((zzavp)object2).zza;
            n4 = (int)(zzayh.zzd((String)object3) ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(((String)(object3 = ((zzavp)object2).zza)).equals(object6 = "E") ? 1 : 0)) != 0) {
                n4 = ((Enum)object7).ordinal();
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 == n3) throw null;
                } else {
                    object = this.zzc();
                    n4 = (int)(zzayh.zzd(object) ? 1 : 0);
                    if (n4 == 0) {
                        ((zzavp)object2).zza = object;
                    }
                }
            }
            ((AtomicReference)object4).set(object2);
        }
        object = ((AtomicReference)object4).get();
        object = (zzavp)object;
        // MONITOREXIT : object4
        object3 = this.zze;
        // MONITORENTER : object3
        if (object != null) {
            object2 = this.zze;
            object4 = ((zzavp)object).zza;
            ((zzatp)object2).zzz((String)object4);
            object2 = this.zze;
            long l2 = ((zzavp)object).zzb;
            ((zzatp)object2).zzae(l2);
            object2 = this.zze;
            object4 = ((zzavp)object).zzc;
            ((zzatp)object2).zzag((String)object4);
            object2 = this.zze;
            object4 = ((zzavp)object).zzd;
            ((zzatp)object2).zzj((String)object4);
            object2 = this.zze;
            object = ((zzavp)object).zze;
            ((zzatp)object2).zzy((String)object);
            return;
        }
        // MONITOREXIT : object3
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        Object object = null;
        Object object2 = "X.509";
        try {
            Object object3;
            object2 = CertificateFactory.getInstance((String)object2);
            Object object4 = zzbep.zzcv;
            ArrayList<Object> arrayList = zzba.zzc();
            object4 = ((zzben)((Object)arrayList)).zza((zzbeg)object4);
            object4 = (String)object4;
            object4 = zzayh.zzf((String)object4);
            arrayList = new ArrayList<Object>();
            Object object5 = new ByteArrayInputStream((byte[])object4);
            object4 = ((CertificateFactory)object2).generateCertificate((InputStream)object5);
            arrayList.add(object4);
            object4 = Build.TYPE;
            object5 = "user";
            boolean bl2 = ((String)object4).equals(object5);
            if (!bl2) {
                object4 = zzbep.zzcw;
                object5 = zzba.zzc();
                object4 = ((zzben)object5).zza((zzbeg)object4);
                object4 = (String)object4;
                object4 = zzayh.zzf((String)object4);
                object5 = new ByteArrayInputStream((byte[])object4);
                object2 = ((CertificateFactory)object2).generateCertificate((InputStream)object5);
                arrayList.add(object2);
            }
            object2 = this.zzj;
            object4 = object2.getPackageName();
            object5 = this.zzb;
            ((zzaye)object5).zzk();
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 30;
            if (n3 <= n4 && (n3 = (int)(((String)(object5 = Build.VERSION.CODENAME)).equals(object3 = "S") ? 1 : 0)) == 0) {
                return object;
            }
            object5 = zzggm.zze();
            object2 = object2.getPackageManager();
            object3 = new zzazu((zzggm)object5);
            ok3_2.a((PackageManager)object2, (String)object4, arrayList, (zzazu)object3);
            object2 = ((zzgeh)object5).get();
            return object2 = (String)object2;
        }
        catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException throwable) {
            return object;
        }
    }
}

