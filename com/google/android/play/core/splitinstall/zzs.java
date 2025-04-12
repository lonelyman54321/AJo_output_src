/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources$NotFoundException
 *  android.os.Bundle
 *  org.xmlpull.v1.XmlPullParser
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzbg;
import com.google.android.play.core.splitinstall.zzi;
import com.google.android.play.core.splitinstall.zzk;
import com.google.android.play.core.splitinstall.zzr;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

public final class zzs {
    public static final /* synthetic */ int zza;
    private static final zzu zzb;
    private final Context zzc;
    private final String zzd;

    static {
        zzu zzu2;
        zzb = zzu2 = new zzu("SplitInstallInfoProvider");
    }

    public zzs(Context object) {
        this.zzc = object;
        object = object.getPackageName();
        this.zzd = object;
    }

    public zzs(Context context, String string2) {
        this.zzc = context;
        this.zzd = string2;
    }

    public static String zzb(String string2) {
        String string3 = "config.";
        boolean bl2 = string2.startsWith(string3);
        if (bl2) {
            return "";
        }
        return string2.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String string2) {
        boolean bl2;
        String string3 = "config.";
        boolean bl3 = string2.startsWith(string3);
        return bl3 || (bl2 = string2.contains(string3 = ".config."));
        {
        }
    }

    public static final Set zzf(PackageInfo object) {
        boolean bl2;
        HashSet<String> hashSet = new HashSet<String>();
        object = zzs.zzh((PackageInfo)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            boolean bl3 = zzs.zze(string2);
            if (bl3) continue;
            hashSet.add(string2);
        }
        return hashSet;
    }

    private final PackageInfo zzg() {
        Object object;
        Object object2;
        try {
            object2 = this.zzc;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object2 = zzb;
            object = new Object[]{};
            ((zzu)object2).zzb("App is not found in PackageManager", object);
            return null;
        }
        object2 = object2.getPackageManager();
        object = this.zzd;
        int n3 = 128;
        return object2.getPackageInfo((String)object, n3);
    }

    private static final Set zzh(PackageInfo object) {
        Object[] objectArray;
        int n3;
        String string2;
        Object object2 = ((PackageInfo)object).applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        String string3 = null;
        if (object2 != null) {
            boolean bl2;
            string2 = "com.android.dynamic.apk.fused.modules";
            if ((object2 = object2.getString(string2)) != null && !(bl2 = ((String)object2).isEmpty())) {
                string2 = ",";
                n3 = -1;
                object2 = ((String)object2).split(string2, n3);
                Collections.addAll(hashSet, object2);
                hashSet.remove("");
                object2 = "base";
                hashSet.remove(object2);
            } else {
                object2 = zzb;
                string2 = "App has no fused modules.";
                objectArray = new Object[]{};
                ((zzu)object2).zza(string2, objectArray);
            }
        }
        if ((object = ((PackageInfo)object).splitNames) != null) {
            object2 = zzb;
            string2 = Arrays.toString((Object[])object);
            n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = string2;
            string3 = "Adding splits from package manager: %s";
            ((zzu)object2).zza(string3, objectArray);
            Collections.addAll(hashSet, object);
        } else {
            object = zzb;
            object2 = new Object[]{};
            string3 = "No splits are found or app cannot be found in package manager.";
            ((zzu)object).zza(string3, (Object[])object2);
        }
        object = zzr.zza();
        if (object != null) {
            object = object.zza();
            hashSet.addAll(object);
        }
        return hashSet;
    }

    public final zzk zza(Bundle object) {
        Object object2 = null;
        Object[] objectArray = null;
        if (object == null) {
            object = zzb;
            objectArray = new Object[]{};
            ((zzu)object).zze("No metadata found in Context.", objectArray);
            return null;
        }
        String string2 = "com.android.vending.splits";
        int n3 = object.getInt(string2);
        if (n3 == 0) {
            object = zzb;
            objectArray = new Object[]{};
            ((zzu)object).zze("No metadata found in AndroidManifest.", objectArray);
            return null;
        }
        try {
            string2 = this.zzc;
        }
        catch (Resources.NotFoundException notFoundException) {
            object = zzb;
            objectArray = new Object[]{};
            ((zzu)object).zze("Resource with languages metadata doesn't exist.", objectArray);
            return null;
        }
        string2 = string2.getResources();
        object = string2.getXml(n3);
        object2 = new zzi();
        object = zzbg.zza((XmlPullParser)object, (zzi)object2);
        if (object == null) {
            object2 = zzb;
            objectArray = new Object[]{};
            string2 = "Can't parse languages metadata.";
            ((zzu)object2).zze(string2, objectArray);
        }
        return object;
    }

    public final Set zzc() {
        ApplicationInfo applicationInfo;
        Object object = this.zzg();
        if (object != null && (applicationInfo = object.applicationInfo) != null) {
            return zzs.zzf(object);
        }
        object = new HashSet();
        return object;
    }

    public final Set zzd() {
        Object object;
        Object object2 = this.zzg();
        HashSet<Object> hashSet = null;
        if (object2 != null && (object = ((PackageInfo)object2).applicationInfo) != null) {
            boolean bl2;
            object = ((ApplicationInfo)object).metaData;
            if ((object = this.zza((Bundle)object)) == null) {
                return null;
            }
            hashSet = new HashSet<Object>();
            Set set = zzs.zzh((PackageInfo)object2);
            Object object3 = "";
            set.add(object3);
            object2 = zzs.zzf((PackageInfo)object2);
            object2.add(object3);
            object2 = ((zzk)object).zza((Collection)object2).entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                object = (Map.Entry)object2.next();
                object3 = (Collection)object.getValue();
                boolean bl3 = set.containsAll((Collection<?>)object3);
                if (!bl3) continue;
                object = (String)object.getKey();
                hashSet.add(object);
            }
        }
        return hashSet;
    }
}

