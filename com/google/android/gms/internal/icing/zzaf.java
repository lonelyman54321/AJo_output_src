/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zzbs;
import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzf;
import com.google.android.gms.internal.icing.zzg;
import com.google.android.gms.internal.icing.zzgc;
import com.google.android.gms.internal.icing.zzgd;
import com.google.android.gms.internal.icing.zzge;
import com.google.android.gms.internal.icing.zzgf;
import com.google.android.gms.internal.icing.zzgg;
import com.google.android.gms.internal.icing.zzgh;
import com.google.android.gms.internal.icing.zzi;
import com.google.android.gms.internal.icing.zzk;
import com.google.android.gms.internal.icing.zzr;
import com.google.android.gms.internal.icing.zzs;
import com.google.android.gms.internal.icing.zzw;
import com.google.android.gms.internal.icing.zzx;

public final class zzaf {
    public static zzx zza(Action object, long l2, String string2, int n3) {
        boolean bl2;
        boolean bl3;
        Object object2;
        String string3;
        Object object3;
        int n4;
        String string4;
        Object object4 = new Bundle();
        object = ((Thing)object).zza();
        object4.putAll((Bundle)object);
        object = object4.getBundle("object");
        zzf zzf2 = null;
        if (object != null) {
            string4 = object.getString("id");
            if (string4 != null) {
                string4 = Uri.parse((String)string4);
            } else {
                n4 = 0;
                string4 = null;
            }
            object3 = object.getString("name");
            string3 = object.getString("type");
            object2 = "url";
            object = object.getString((String)object2);
        } else {
            object = null;
            n4 = 0;
            string4 = null;
            bl3 = false;
            object3 = null;
            bl2 = false;
            string3 = null;
        }
        object = object != null ? Uri.parse((String)object) : null;
        object = zzal.zzb(string2, (Uri)object);
        zzf2 = zzx.zzb((Intent)object, (String)object3, (Uri)string4, string3, null);
        string4 = ".private:ssbContext";
        object3 = object4.getByteArray(string4);
        if (object3 != null) {
            object3 = zzk.zza((byte[])object3);
            zzf2.zza((zzk)object3);
            object4.remove(string4);
        }
        if ((object3 = object4.getString(string4 = ".private:accountName")) != null) {
            object2 = "com.google";
            string3 = new Account((String)object3, (String)object2);
            zzf2.zzd((Account)string3);
            object4.remove(string4);
        }
        string4 = ".private:isContextOnly";
        bl3 = object4.containsKey(string4);
        bl2 = false;
        string3 = null;
        if (bl3 && (bl3 = object4.getBoolean(string4))) {
            object4.remove(string4);
            n4 = 4;
        } else {
            n4 = 0;
            string4 = null;
        }
        object3 = ".private:isDeviceOnly";
        boolean bl4 = object4.containsKey((String)object3);
        if (bl4) {
            bl2 = object4.getBoolean((String)object3, false);
            object4.remove((String)object3);
        }
        object4 = zzaf.zzb((Bundle)object4);
        object2 = ".private:action";
        object3 = new zzr((String)object2);
        ((zzr)object3).zzb(true);
        ((zzr)object3).zzd((String)object2);
        ((zzr)object3).zza("blob");
        object3 = ((zzr)object3).zze();
        object4 = ((zzbs)object4).zzh();
        object2 = new zzk((byte[])object4, (zzs)object3);
        zzf2.zza((zzk)object2);
        object4 = new zzw();
        object = zzx.zza(string2, (Intent)object);
        ((zzw)object4).zza((zzi)object);
        ((zzw)object4).zzb(l2);
        ((zzw)object4).zzc(n4);
        object = zzf2.zze();
        ((zzw)object4).zzd((zzg)object);
        ((zzw)object4).zze(bl2);
        ((zzw)object4).zzf(n3);
        return ((zzw)object4).zzg();
    }

    public static zzgf zzb(Bundle object) {
        int n3;
        zzge zzge2 = zzgf.zza();
        Object object2 = object.keySet().iterator();
        while ((n3 = object2.hasNext()) != 0) {
            zzcx zzcx2;
            zzcx zzcx3;
            Object object3 = (String)object2.next();
            Object object4 = object.get((String)object3);
            int n4 = object4 instanceof String;
            if (n4 != 0) {
                zzcx3 = zzgh.zza();
                String string2 = (String)object4;
                ((zzgg)zzcx3).zzb(string2);
                zzgh zzgh2 = (zzgh)zzcx3.zzj();
                zzcx3 = zzgd.zza();
                ((zzgc)zzcx3).zza((String)object3);
                ((zzgc)zzcx3).zzb(zzgh2);
                object3 = (zzgd)zzcx3.zzj();
                zzge2.zzb((zzgd)object3);
                continue;
            }
            n4 = object4 instanceof Bundle;
            if (n4 != 0) {
                zzcx3 = zzgh.zza();
                zzgf zzgf2 = zzaf.zzb((Bundle)object4);
                ((zzgg)zzcx3).zzc(zzgf2);
                zzgh zzgh3 = (zzgh)zzcx3.zzj();
                zzcx3 = zzgd.zza();
                ((zzgc)zzcx3).zza((String)object3);
                ((zzgc)zzcx3).zzb(zzgh3);
                object3 = (zzgd)zzcx3.zzj();
                zzge2.zzb((zzgd)object3);
                continue;
            }
            n4 = object4 instanceof String[];
            if (n4 != 0) {
                for (String string3 : (String[])object4) {
                    if (string3 == null) continue;
                    zzcx2 = zzgh.zza();
                    ((zzgg)zzcx2).zzb(string3);
                    zzgh zzgh4 = (zzgh)zzcx2.zzj();
                    zzcx2 = zzgd.zza();
                    ((zzgc)zzcx2).zza((String)object3);
                    ((zzgc)zzcx2).zzb(zzgh4);
                    zzgd zzgd2 = (zzgd)zzcx2.zzj();
                    zzge2.zzb(zzgd2);
                }
                continue;
            }
            n4 = object4 instanceof Bundle[];
            if (n4 != 0) {
                int n7;
                Bundle[] bundleArray = (Bundle[])object4;
                n4 = bundleArray.length;
                while (n7 < n4) {
                    Bundle bundle = bundleArray[n7];
                    if (bundle != null) {
                        zzcx2 = zzgh.zza();
                        zzgf zzgf3 = zzaf.zzb(bundle);
                        ((zzgg)zzcx2).zzc(zzgf3);
                        zzgh zzgh5 = (zzgh)zzcx2.zzj();
                        zzcx2 = zzgd.zza();
                        ((zzgc)zzcx2).zza((String)object3);
                        ((zzgc)zzcx2).zzb(zzgh5);
                        zzgd zzgd3 = (zzgd)zzcx2.zzj();
                        zzge2.zzb(zzgd3);
                    }
                    ++n7;
                }
                continue;
            }
            n4 = object4 instanceof Boolean;
            if (n4 != 0) {
                zzcx3 = zzgh.zza();
                boolean bl2 = (Boolean)object4;
                ((zzgg)zzcx3).zza(bl2);
                zzgh zzgh6 = (zzgh)zzcx3.zzj();
                zzcx3 = zzgd.zza();
                ((zzgc)zzcx3).zza((String)object3);
                ((zzgc)zzcx3).zzb(zzgh6);
                object3 = (zzgd)zzcx3.zzj();
                zzge2.zzb((zzgd)object3);
                continue;
            }
            object3 = String.valueOf(object4);
            n3 = ((String)object3).length();
            StringBuilder stringBuilder = new StringBuilder(n3 += 19);
        }
        object2 = "type";
        if ((object = object.getString((String)object2)) != null) {
            zzge2.zza((String)object);
        }
        return (zzgf)zzge2.zzj();
    }
}

