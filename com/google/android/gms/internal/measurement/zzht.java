/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

public final class zzht {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzhr zza(Context object, File serializable) {
        IOException iOException222;
        Throwable throwable222;
        BufferedReader bufferedReader;
        block13: {
            HashMap<String[], String> hashMap = new HashMap<String[], String>(serializable);
            Object object2 = new InputStreamReader((InputStream)((Object)hashMap));
            bufferedReader = new BufferedReader((Reader)object2);
            try {
                Object object3;
                object2 = new a53();
                hashMap = new HashMap<String[], String>();
                while ((object3 = bufferedReader.readLine()) != null) {
                    String string2 = " ";
                    int n3 = 3;
                    int n4 = ((String[])(object3 = object3.split(string2, n3))).length;
                    if (n4 != n3) continue;
                    n4 = 0;
                    string2 = null;
                    string2 = object3[0];
                    string2 = zzht.zza(string2);
                    n3 = 1;
                    String string3 = object3[n3];
                    string3 = zzht.zza(string3);
                    string3 = Uri.decode((String)string3);
                    int n7 = 2;
                    String string4 = object3[n7];
                    string4 = hashMap.get(string4);
                    if (string4 == null) {
                        int n8;
                        object3 = object3[n7];
                        string4 = Uri.decode((String)(object3 = zzht.zza((String)object3)));
                        n7 = string4.length();
                        if (n7 < (n8 = 1024) || string4 == object3) {
                            hashMap.put((String[])object3, string4);
                        }
                    }
                    object3 = ((a53)object2).get(string2);
                    if ((object3 = (a53)object3) == null) {
                        object3 = new a53();
                        ((a53)object2).put(string2, object3);
                    }
                    object3.put(string3, string4);
                }
                String.valueOf(serializable);
                object.getPackageName();
                object = new zzhm((a53)object2);
            }
            catch (Throwable throwable222) {
                break block13;
            }
            bufferedReader.close();
            return object;
            {
                catch (IOException iOException222) {}
            }
        }
        try {
            bufferedReader.close();
            throw throwable222;
        }
        catch (Throwable throwable3) {
            throwable222.addSuppressed(throwable3);
            throw throwable222;
        }
        serializable = new RuntimeException(iOException222);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Optional zza(Context object) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block4: {
            block3: {
                block2: {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        Object object2 = zzht.zzb(object);
                        boolean bl2 = ((Optional)object2).isPresent();
                        if (!bl2) break block2;
                        object2 = ((Optional)object2).get();
                        object2 = (File)object2;
                        object = zzht.zza(object, (File)object2);
                        object = Optional.of(object);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Optional.absent();
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    private static final String zza(String string2) {
        String string3 = new String(string2);
        return string3;
    }

    private static Optional zzb(Context object) {
        String string2 = "phenotype_hermetic";
        try {
            object = object.getDir(string2, 0);
            string2 = "overrides.txt";
        }
        catch (RuntimeException runtimeException) {
            return Optional.absent();
        }
        File file = new File((File)object, string2);
        boolean bl2 = file.exists();
        if (bl2) {
            return Optional.of(file);
        }
        return Optional.absent();
    }
}

