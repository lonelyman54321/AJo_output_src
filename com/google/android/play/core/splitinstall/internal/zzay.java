/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzaq;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzav;
import com.google.android.play.core.splitinstall.internal.zzaw;
import com.google.android.play.core.splitinstall.internal.zzax;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbi;
import com.google.android.play.core.splitinstall.internal.zzbj;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class zzay
implements zzan {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzc(ClassLoader object, Set object2, zzax object3) {
        Object object4;
        Object[] objectArray;
        Serializable serializable;
        boolean bl2;
        int n3 = 1;
        Class<Object> clazz = null;
        int n4 = object2.isEmpty();
        if (n4 != 0) {
            return;
        }
        HashSet<File> hashSet = new HashSet<File>();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            serializable = ((File)object2.next()).getParentFile();
            hashSet.add((File)serializable);
        }
        object = zzat.zzc((ClassLoader)object);
        object2 = zzbk.zzb(object, "nativeLibraryDirectories", List.class);
        serializable = zzn.class;
        synchronized (serializable) {
            objectArray = ((zzbj)object2).zzc();
            objectArray = (Collection)objectArray;
            object4 = new ArrayList(objectArray);
            hashSet.removeAll((Collection<?>)object4);
            ((ArrayList)object4).addAll(hashSet);
            ((zzbj)object2).zze(object4);
        }
        object2 = new ArrayList();
        serializable = new Serializable(hashSet);
        hashSet = null;
        object3 = object3.zza(object, (List)((Object)serializable), null, (List)object2);
        n4 = ((ArrayList)object2).isEmpty();
        if (n4 != 0) {
            object2 = zzn.class;
            synchronized (object2) {
                String string2 = "nativeLibraryPathElements";
                clazz = Object.class;
                object = zzbk.zza(object, string2, clazz);
                object3 = Arrays.asList(object3);
                ((zzbi)object).zzb((Collection)object3);
                return;
            }
        }
        object3 = "Error in makePathElements";
        object = new zzbh((String)object3);
        int n7 = ((ArrayList)object2).size();
        n4 = 0;
        hashSet = null;
        while (true) {
            if (n4 >= n7) {
                throw object;
            }
            serializable = (IOException)((ArrayList)object2).get(n4);
            object4 = Throwable.class;
            objectArray = "addSuppressed";
            try {
                Class<Throwable> clazz2;
                Class[] classArray = new Class[n3];
                classArray[0] = clazz2 = Throwable.class;
                object4 = ((Class)object4).getDeclaredMethod((String)objectArray, classArray);
                objectArray = new Object[n3];
                objectArray[0] = serializable;
                ((Method)object4).invoke(object, objectArray);
            }
            catch (Exception exception) {}
            n4 += n3;
        }
    }

    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean bl2, String string2) {
        zzav zzav2 = new zzav();
        zzaq zzaq2 = new zzaq();
        return zzat.zze(classLoader, file, file2, bl2, zzav2, "zip", zzaq2);
    }

    public final void zza(ClassLoader classLoader, Set set) {
        zzaw zzaw2 = new zzaw();
        zzay.zzc(classLoader, set, zzaw2);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean bl2) {
        return zzay.zzd(classLoader, file, file2, bl2, "zip");
    }
}

