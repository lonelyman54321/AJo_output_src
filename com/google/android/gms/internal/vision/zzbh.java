/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.internal.vision.zzas;
import com.google.android.gms.internal.vision.zzbe;
import com.google.android.gms.internal.vision.zzcy;
import com.google.android.gms.internal.vision.zzfe;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public final class zzbh {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzbe zza(File object) {
        IOException iOException222;
        Throwable throwable222;
        Object object2;
        block11: {
            Object object3 = new FileInputStream((File)object);
            HashMap hashMap = new HashMap((InputStream)object3);
            object2 = new BufferedReader((Reader)((Object)hashMap));
            try {
                hashMap = new HashMap();
                while ((object3 = ((BufferedReader)object2).readLine()) != null) {
                    Object object4 = " ";
                    int n3 = 3;
                    int n4 = ((String[])(object4 = ((String)object3).split((String)object4, n3))).length;
                    if (n4 != n3) {
                        object4 = "Invalid: ";
                        n3 = ((String)object3).length();
                        if (n3 == 0) continue;
                        ((String)object4).concat((String)object3);
                        continue;
                    }
                    object3 = null;
                    object3 = object4[0];
                    n3 = 1;
                    Object object5 = object4[n3];
                    object5 = Uri.decode((String)object5);
                    n4 = 2;
                    object4 = object4[n4];
                    object4 = Uri.decode((String)object4);
                    n4 = (int)(hashMap.containsKey(object3) ? 1 : 0);
                    if (n4 == 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap.put(object3, hashMap2);
                    }
                    object3 = hashMap.get(object3);
                    object3 = (Map)object3;
                    object3.put(object5, object4);
                }
                object = String.valueOf(object);
                int n7 = ((String)object).length() + 7;
                object3 = new StringBuilder(n7);
                object = new zzbe(hashMap);
            }
            catch (Throwable throwable222) {
                break block11;
            }
            ((BufferedReader)object2).close();
            return object;
            {
                catch (IOException iOException222) {}
            }
        }
        try {
            ((BufferedReader)object2).close();
            throw throwable222;
        }
        catch (Throwable throwable3) {
            zzfe.zza(throwable222, throwable3);
            throw throwable222;
        }
        object2 = new RuntimeException(iOException222);
        throw object2;
    }

    public static zzcy zza(Context object) {
        boolean bl2;
        String string2 = Build.TYPE;
        String string3 = Build.TAGS;
        String string4 = "eng";
        boolean bl3 = string2.equals(string4);
        if (!bl3 && !(bl2 = string2.equals(string4 = "userdebug")) || !(bl2 = string3.contains(string2 = "dev-keys")) && !(bl2 = string3.contains(string2 = "test-keys"))) {
            return zzcy.zzc();
        }
        bl2 = zzas.zza();
        if (bl2 && !(bl2 = mI3.a((Context)object))) {
            object = yx_0.a((Context)object);
        }
        if (bl2 = ((zzcy)(object = zzbh.zzb((Context)object))).zza()) {
            return zzcy.zza(zzbh.zza((File)((zzcy)object).zzb()));
        }
        return zzcy.zzc();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzcy zzb(Context object) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block6: {
            File file;
            block5: {
                threadPolicy = StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
                String string2 = "phenotype_hermetic";
                object = object.getDir(string2, 0);
                string2 = "overrides.txt";
                file = new File((File)object, string2);
                break block5;
                {
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {}
                    {
                        object = zzcy.zzc();
                    }
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                    return object;
                }
            }
            boolean bl2 = file.exists();
            object = bl2 ? zzcy.zza(file) : zzcy.zzc();
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }
}

