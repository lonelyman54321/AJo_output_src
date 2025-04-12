/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzap;
import com.google.android.play.core.splitinstall.internal.zzaq;
import com.google.android.play.core.splitinstall.internal.zzar;
import com.google.android.play.core.splitinstall.internal.zzas;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbi;
import com.google.android.play.core.splitinstall.internal.zzbj;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class zzat
implements zzan {
    public static Object zzc(ClassLoader classLoader) {
        return zzbk.zzb(classLoader, "pathList", Object.class).zzc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzd(ClassLoader object, Set object2) {
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            return;
        }
        HashSet<Object> hashSet = new HashSet<Object>();
        object2 = object2.iterator();
        while (true) {
            Object object3;
            boolean bl3;
            if (!(bl3 = object2.hasNext())) {
                object = zzat.zzc((ClassLoader)object);
                object3 = File.class;
                object = zzbk.zza(object, "nativeLibraryDirectories", (Class)object3);
                object2 = Arrays.asList((File[])((zzbj)object).zzc());
                hashSet.removeAll((Collection<?>)object2);
                object2 = zzn.class;
                synchronized (object2) {
                    hashSet.size();
                    ((zzbi)object).zzb(hashSet);
                    return;
                }
            }
            object3 = (File)object2.next();
            String string2 = String.valueOf(((File)object3).getParentFile().getAbsolutePath());
            String string3 = "Adding native library parent directory: ";
            string3.concat(string2);
            object3 = ((File)object3).getParentFile();
            hashSet.add(object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zze(ClassLoader object, File object2, File object3, boolean n3, zzas object4, String object5, zzar objectArray) {
        boolean bl2;
        int n4 = 1;
        Class<Throwable> clazz = Throwable.class;
        ArrayList arrayList = new ArrayList();
        object = zzat.zzc((ClassLoader)object);
        zzbi zzbi2 = zzbk.zza(object, "dexElements", Object.class);
        Object object6 = Arrays.asList((Object[])zzbi2.zzc());
        ArrayList<File> arrayList2 = new ArrayList<File>();
        object6 = object6.iterator();
        while (bl2 = object6.hasNext()) {
            Object e2 = object6.next();
            Class<File> clazz2 = File.class;
            File file = (File)zzbk.zzb(e2, (String)object5, clazz2).zzc();
            arrayList2.add(file);
        }
        boolean bl3 = arrayList2.contains(object3);
        if (bl3) {
            return n4 != 0;
        }
        if (n3 == 0 && (n3 = (int)(objectArray.zza(object, (File)object3, (File)object2) ? 1 : 0)) == 0) {
            object = String.valueOf(((File)object3).getPath());
            "Should be optimized ".concat((String)object);
            return false;
        }
        object3 = Collections.singleton(object3);
        ArrayList<Object> arrayList3 = new ArrayList<Object>((Collection<Object>)object3);
        object2 = Arrays.asList(object4.zza(object, arrayList3, (File)object2, arrayList));
        zzbi2.zza((Collection)object2);
        boolean bl4 = arrayList.isEmpty();
        if (bl4) {
            return n4 != 0;
        }
        object3 = "DexPathList.makeDexElement failed";
        object2 = new zzbh((String)object3);
        int n7 = arrayList.size();
        n3 = 0;
        arrayList3 = null;
        while (true) {
            if (n3 >= n7) {
                zzbk.zza(object, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
                throw object2;
            }
            object4 = (IOException)arrayList.get(n3);
            object5 = "addSuppressed";
            try {
                objectArray = new Class[n4];
                objectArray[0] = clazz;
                object5 = clazz.getDeclaredMethod((String)object5, (Class<?>[])objectArray);
                objectArray = new Object[n4];
                objectArray[0] = object4;
                ((Method)object5).invoke(object2, objectArray);
            }
            catch (Exception exception) {}
            n3 += n4;
        }
    }

    public final void zza(ClassLoader classLoader, Set set) {
        zzat.zzd(classLoader, set);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        zzap zzap2 = new zzap();
        zzaq zzaq2 = new zzaq();
        return zzat.zze(classLoader, file, file2, bl2, zzap2, "zip", zzaq2);
    }
}

