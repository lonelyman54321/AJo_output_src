/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.splitcompat.zzb;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zze {
    private final long zza;
    private final Context zzb;
    private File zzc;

    public zze(Context object) {
        long l2;
        this.zzb = object;
        PackageManager packageManager = object.getPackageManager();
        object = object.getPackageName();
        this.zza = l2 = (long)packageManager.getPackageInfo((String)object, (int)0).versionCode;
    }

    public static void zzl(File object) {
        Object object2;
        boolean bl2 = ((File)object).isDirectory();
        if (bl2 && (object2 = ((File)object).listFiles()) != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = ((File[])object2).length); ++i3) {
                File file = object2[i3];
                zze.zzl(file);
            }
        }
        if ((bl2 = ((File)object).exists()) && !(bl2 = ((File)object).delete())) {
            object = ((File)object).getAbsolutePath();
            object = cP.a("Failed to delete '", (String)object, "'");
            object2 = new IOException((String)object);
            throw object2;
        }
    }

    public static void zzm(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(File file) {
        boolean bl2 = file.canWrite();
        return !bl2;
    }

    private static File zzq(File object, String string2) {
        File file = new File((File)object, string2);
        boolean bl2 = (string2 = file.getCanonicalPath()).startsWith((String)(object = ((File)object).getCanonicalPath()));
        if (bl2) {
            return file;
        }
        object = new IllegalArgumentException("split ID cannot be placed in target directory");
        throw object;
    }

    private final File zzr() {
        File file = this.zzw();
        File file2 = new File(file, "native-libraries");
        zze.zzu(file2);
        return file2;
    }

    private final File zzs(String object) {
        object = zze.zzq(this.zzr(), (String)object);
        zze.zzu((File)object);
        return object;
    }

    private final File zzt() {
        File file = this.zzw();
        File file2 = new File(file, "verified-splits");
        zze.zzu(file2);
        return file2;
    }

    private static File zzu(File object) {
        boolean bl2 = ((File)object).exists();
        if (bl2) {
            bl2 = ((File)object).isDirectory();
            if (bl2) {
                return object;
            }
            object = new IllegalArgumentException("File input must be directory when it exists.");
            throw object;
        }
        ((File)object).mkdirs();
        bl2 = ((File)object).isDirectory();
        if (bl2) {
            return object;
        }
        object = String.valueOf(((File)object).getAbsolutePath());
        object = "Unable to create directory: ".concat((String)object);
        IOException iOException = new IOException((String)object);
        throw iOException;
    }

    private final File zzv() {
        Serializable serializable = this.zzc;
        if (serializable == null) {
            serializable = this.zzb;
            if (serializable != null) {
                this.zzc = serializable = serializable.getFilesDir();
            } else {
                serializable = new IllegalStateException("context must be non-null to populate null filesDir");
                throw serializable;
            }
        }
        File file = this.zzc;
        serializable = new File(file, "splitcompat");
        zze.zzu(serializable);
        return serializable;
    }

    private final File zzw() {
        File file = this.zzv();
        String string2 = Long.toString(this.zza);
        File file2 = new File(file, string2);
        zze.zzu(file2);
        return file2;
    }

    private static String zzx(String string2) {
        return String.valueOf(string2).concat(".apk");
    }

    public final File zza(String object) {
        File file = this.zzw();
        File file2 = new File(file, "dex");
        zze.zzu(file2);
        object = zze.zzq(file2, (String)object);
        zze.zzu((File)object);
        return object;
    }

    public final File zzb() {
        File file = this.zzw();
        File file2 = new File(file, "unverified-splits");
        zze.zzu(file2);
        return file2;
    }

    public final File zzc(String string2, String string3) {
        return zze.zzq(this.zzs(string2), string3);
    }

    public final File zzd() {
        File file = this.zzw();
        File file2 = new File(file, "lock.tmp");
        return file2;
    }

    public final File zze(String string2) {
        File file = this.zzb();
        string2 = zze.zzx(string2);
        return zze.zzq(file, string2);
    }

    public final File zzf(File object) {
        File file = this.zzt();
        object = ((File)object).getName();
        return zze.zzq(file, (String)object);
    }

    public final File zzg(String string2) {
        File file = this.zzt();
        string2 = zze.zzx(string2);
        return zze.zzq(file, string2);
    }

    public final List zzh() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        File[] fileArray = this.zzr().listFiles();
        if (fileArray != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = fileArray.length); ++i3) {
                Object object = fileArray[i3];
                boolean bl2 = ((File)object).isDirectory();
                if (!bl2) continue;
                object = ((File)object).getName();
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    public final Set zzi(String fileArray) {
        HashSet<File> hashSet = new HashSet<File>();
        if ((fileArray = this.zzs((String)fileArray).listFiles()) != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = fileArray.length); ++i3) {
                File file = fileArray[i3];
                boolean bl2 = file.isFile();
                if (!bl2) continue;
                hashSet.add(file);
            }
        }
        return hashSet;
    }

    public final Set zzj() {
        File[] fileArray = this.zzt();
        HashSet<Object> hashSet = new HashSet<Object>();
        if ((fileArray = fileArray.listFiles()) != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = fileArray.length); ++i3) {
                Object object;
                String string2;
                File file = fileArray[i3];
                boolean bl2 = file.isFile();
                if (!bl2 || !(bl2 = (string2 = file.getName()).endsWith((String)(object = ".apk"))) || !(bl2 = zze.zzp(file))) continue;
                string2 = file.getName();
                int n4 = string2.length() + -4;
                string2 = string2.substring(0, n4);
                object = new zzb(file, string2);
                hashSet.add(object);
            }
        }
        return hashSet;
    }

    public final void zzk() {
        File file = this.zzv();
        String[] stringArray = file.list();
        if (stringArray != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
                String string2 = stringArray[i3];
                long l2 = this.zza;
                Object object = Long.toString(l2);
                boolean bl2 = string2.equals(object);
                if (bl2) continue;
                object = new File(file, string2);
                object.toString();
                zze.zzl((File)object);
            }
        }
    }

    public final void zzn(String string2) {
        zze.zzl(this.zzs(string2));
    }

    public final void zzo(File serializable) {
        File file;
        File file2 = serializable.getParentFile().getParentFile();
        boolean bl2 = file2.equals(file = this.zzr());
        if (bl2) {
            zze.zzl(serializable);
            return;
        }
        serializable = new IllegalStateException("File to remove is not a native library");
        throw serializable;
    }
}

