/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.play.core.splitcompat;

import android.os.Build;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitcompat.zzf;
import com.google.android.play.core.splitcompat.zzh;
import com.google.android.play.core.splitcompat.zzj;
import com.google.android.play.core.splitcompat.zzk;
import com.google.android.play.core.splitcompat.zzl;
import com.google.android.play.core.splitcompat.zzm;
import com.google.android.play.core.splitcompat.zzt;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class zzn {
    private static final Pattern zza = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final zze zzb;

    public zzn(zze zze2) {
        this.zzb = zze2;
    }

    public static /* bridge */ /* synthetic */ Set zza(zzn zzn2, Set set, zzt zzt2, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        zzj zzj2 = new zzj(zzn2, hashSet, zzt2, zipFile);
        zzn2.zzf(zzt2, set, zzj2);
        return hashSet;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzn zzn2, zzt zzt2, Set set, zzl zzl2) {
        zzn2.zzf(zzt2, set, zzl2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zze(zzt object, zzk zzk2) {
        void var0_3;
        ZipFile zipFile;
        block14: {
            Object object2;
            HashSet<Object> hashSet;
            int n3;
            Object object3;
            Object object4;
            int n4;
            String[] stringArray;
            Serializable serializable;
            try {
                serializable = ((zzt)object).zza();
                zipFile = new ZipFile((File)serializable);
            }
            catch (IOException iOException) {
                zipFile = null;
                break block14;
            }
            try {
                object = ((zzt)object).zzb();
                serializable = new HashMap();
                stringArray = zipFile.entries();
                while ((n4 = stringArray.hasMoreElements()) != 0) {
                    ZipEntry zipEntry = stringArray.nextElement();
                    object4 = zipEntry.getName();
                    object3 = zza;
                    int n7 = (int)(((Matcher)(object4 = ((Pattern)object3).matcher((CharSequence)object4))).matches() ? 1 : 0);
                    if (n7 == 0) continue;
                    n7 = 1;
                    object3 = ((Matcher)object4).group(n7);
                    n3 = 2;
                    object4 = ((Matcher)object4).group(n3);
                    hashSet = new HashSet<Object>();
                    object2 = "NativeLibraryExtractor: split '";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    ((StringBuilder)((Object)hashSet)).append((String)object);
                    object2 = "' has native library '";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    ((StringBuilder)((Object)hashSet)).append((String)object4);
                    object2 = "' for ABI '";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    ((StringBuilder)((Object)hashSet)).append((String)object3);
                    object2 = "'";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    hashSet = ((HashMap)serializable).get(object3);
                    hashSet = hashSet;
                    if (hashSet == null) {
                        hashSet = new HashSet<Object>();
                        ((HashMap)serializable).put(object3, hashSet);
                    }
                    object3 = new zzm(zipEntry, (String)object4);
                    hashSet.add(object3);
                }
            }
            catch (IOException iOException) {
                break block14;
            }
            object = new HashMap();
            stringArray = Build.SUPPORTED_ABIS;
            n4 = stringArray.length;
            int n8 = 0;
            object4 = null;
            while (true) {
                if (n8 >= n4) {
                    object = ((HashMap)object).values();
                    serializable = new HashSet(object);
                    zzk2.zza(zipFile, (Set)((Object)serializable));
                    zipFile.close();
                    return;
                }
                object3 = stringArray[n8];
                n3 = ((HashMap)serializable).containsKey(object3);
                if (n3 != 0) {
                    boolean bl2;
                    hashSet = new HashSet<Object>();
                    object2 = "NativeLibraryExtractor: there are native libraries for supported ABI ";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    ((StringBuilder)((Object)hashSet)).append((String)object3);
                    object2 = "; will use this ABI";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    hashSet = ((HashMap)serializable).get(object3);
                    hashSet = hashSet;
                    hashSet = hashSet.iterator();
                    while (bl2 = hashSet.hasNext()) {
                        String string2;
                        object2 = hashSet.next();
                        object2 = (zzm)object2;
                        CharSequence charSequence = ((zzm)object2).zza;
                        boolean bl3 = ((HashMap)object).containsKey(charSequence);
                        String string3 = " for ABI ";
                        if (bl3) {
                            object2 = ((zzm)object2).zza;
                            charSequence = new StringBuilder();
                            string2 = "NativeLibraryExtractor: skipping library ";
                            ((StringBuilder)charSequence).append(string2);
                            ((StringBuilder)charSequence).append((String)object2);
                            ((StringBuilder)charSequence).append(string3);
                            ((StringBuilder)charSequence).append((String)object3);
                            object2 = "; already present for a better ABI";
                            ((StringBuilder)charSequence).append((String)object2);
                            continue;
                        }
                        charSequence = ((zzm)object2).zza;
                        ((HashMap)object).put(charSequence, object2);
                        object2 = ((zzm)object2).zza;
                        charSequence = new StringBuilder();
                        string2 = "NativeLibraryExtractor: using library ";
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append((String)object2);
                        ((StringBuilder)charSequence).append(string3);
                        ((StringBuilder)charSequence).append((String)object3);
                    }
                } else {
                    hashSet = new HashSet<Object>();
                    object2 = "NativeLibraryExtractor: there are no native libraries for supported ABI ";
                    ((StringBuilder)((Object)hashSet)).append((String)object2);
                    ((StringBuilder)((Object)hashSet)).append((String)object3);
                }
                ++n8;
            }
        }
        if (zipFile == null) throw var0_3;
        try {
            zipFile.close();
            throw var0_3;
        }
        catch (IOException iOException) {
            zzf.zza((Throwable)var0_3, iOException);
        }
        throw var0_3;
    }

    private final void zzf(zzt zzt2, Set object, zzl zzl2) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            long l2;
            long l3;
            long l4;
            zzm zzm2 = (zzm)object.next();
            Object object2 = this.zzb;
            Object object3 = zzt2.zzb();
            String string2 = zzm2.zza;
            object2 = ((zze)object2).zzc((String)object3, string2);
            boolean bl3 = ((File)object2).exists();
            boolean bl4 = false;
            string2 = null;
            if (bl3 && !(bl3 = (l4 = (l3 = ((File)object2).length()) - (l2 = ((ZipEntry)(object3 = zzm2.zzb)).getSize())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) && (bl3 = zze.zzp((File)object2))) {
                bl4 = true;
            }
            zzl2.zza(zzm2, (File)object2, bl4);
        }
    }

    public final Set zzb(zzt zzt2) {
        boolean bl2 = true;
        AtomicBoolean atomicBoolean = new AtomicBoolean(bl2);
        HashSet hashSet = new HashSet();
        zzh zzh2 = new zzh(this, zzt2, hashSet, atomicBoolean);
        zzn.zze(zzt2, zzh2);
        boolean bl3 = atomicBoolean.get();
        if (bl3) {
            return hashSet;
        }
        return null;
    }

    public final Set zzc() {
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4 = this.zzb.zzj();
        HashSet hashSet = this.zzb.zzh().iterator();
        block0: while (bl2 = hashSet.hasNext()) {
            boolean bl3;
            object3 = (String)hashSet.next();
            object2 = object4.iterator();
            while (bl3 = object2.hasNext()) {
                object = ((zzt)object2.next()).zzb();
                bl3 = ((String)object).equals(object3);
                if (!bl3) continue;
                continue block0;
            }
            object2 = new StringBuilder("NativeLibraryExtractor: extracted split '");
            ((StringBuilder)object2).append((String)object3);
            object = "' has no corresponding split; deleting";
            ((StringBuilder)object2).append((String)object);
            object2 = this.zzb;
            ((zze)object2).zzn((String)object3);
        }
        hashSet = new HashSet();
        object4 = object4.iterator();
        while (bl2 = object4.hasNext()) {
            boolean bl4;
            object3 = (zzt)object4.next();
            object2 = new HashSet();
            object = new Object(this, (Set)object2, (zzt)object3);
            zzn.zze((zzt)object3, (zzk)object);
            object = this.zzb;
            Object object5 = ((zzt)object3).zzb();
            object = ((zze)object).zzi((String)object5).iterator();
            while (bl4 = object.hasNext()) {
                object5 = (File)object.next();
                boolean bl5 = ((HashSet)object2).contains(object5);
                if (bl5) continue;
                Object object6 = ((File)object5).getAbsolutePath();
                String string2 = ((zzt)object3).zzb();
                String string3 = ((zzt)object3).zza().getAbsolutePath();
                String string4 = "NativeLibraryExtractor: file '";
                String string5 = "' found in split '";
                String string6 = "' that is not in the split file '";
                object6 = og_1.a(string4, (String)object6, string5, string2, string6);
                ((StringBuilder)object6).append(string3);
                string2 = "'; removing";
                ((StringBuilder)object6).append(string2);
                object6 = this.zzb;
                ((zze)object6).zzo((File)object5);
            }
            hashSet.addAll(object2);
        }
        return hashSet;
    }
}

