/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.vision.zzat;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzaq {
    public static final Uri zza;
    public static final Pattern zzb;
    private static final Uri zzc;
    private static final Pattern zzd;
    private static final AtomicBoolean zze;
    private static HashMap zzf;
    private static final HashMap zzg;
    private static final HashMap zzh;
    private static final HashMap zzi;
    private static final HashMap zzj;
    private static Object zzk;
    private static boolean zzl;
    private static String[] zzm;

    static {
        Serializable serializable;
        zza = Uri.parse((String)"content://com.google.android.gsf.gservices");
        zzc = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
        int n3 = 2;
        zzb = Pattern.compile("^(1|true|t|on|yes|y)$", n3);
        zzd = Pattern.compile("^(0|false|f|off|no|n)$", n3);
        zze = serializable = new AtomicBoolean();
        serializable = new HashMap();
        zzg = serializable;
        serializable = new HashMap();
        zzh = serializable;
        serializable = new HashMap();
        zzi = serializable;
        serializable = new HashMap();
        zzj = serializable;
        zzm = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza(ContentResolver object, String string2, String object2) {
        Throwable throwable3;
        block18: {
            Object object3;
            block17: {
                boolean bl2;
                int n3;
                Object object4;
                block16: {
                    boolean bl3;
                    String string3;
                    Object object5;
                    object2 = zzaq.class;
                    synchronized (object2) {
                        int n4;
                        boolean bl4;
                        HashMap hashMap;
                        int n7;
                        try {
                            object4 = zzf;
                            n3 = 1;
                            n7 = 0;
                            hashMap = null;
                            object3 = null;
                            if (object4 == null) {
                                object4 = zze;
                                object4.set(false);
                                object4 = new HashMap();
                                zzf = object4;
                                object4 = new Object();
                                zzk = object4;
                                zzl = false;
                                object4 = zza;
                                object5 = new zzat(null);
                                object.registerContentObserver((Uri)object4, n3 != 0, (ContentObserver)object5);
                            } else {
                                object4 = zze;
                                bl4 = object4.getAndSet(false);
                                if (bl4) {
                                    object4 = zzf;
                                    object4.clear();
                                    object4 = zzg;
                                    object4.clear();
                                    object4 = zzh;
                                    object4.clear();
                                    object4 = zzi;
                                    object4.clear();
                                    object4 = zzj;
                                    object4.clear();
                                    object4 = new Object();
                                    zzk = object4;
                                    zzl = false;
                                }
                            }
                            object4 = zzk;
                            object5 = zzf;
                            boolean bl5 = object5.containsKey(string2);
                            if (bl5) {
                                object = zzf;
                                object = object.get(string2);
                                if ((object = (String)object) == null) return object3;
                                return object;
                            }
                            object5 = zzm;
                            n4 = ((String[])object5).length;
                        }
                        catch (Throwable throwable2) {}
                        throw throwable2;
                        while (n7 < n4) {
                            string3 = object5[n7];
                            bl3 = string2.startsWith(string3);
                            if (bl3) {
                                bl4 = zzl;
                                if (bl4) {
                                    object4 = zzf;
                                    bl4 = object4.isEmpty();
                                    if (!bl4) return null;
                                }
                                object4 = zzm;
                                hashMap = zzf;
                                object = zzaq.zza(object, object4);
                                hashMap.putAll(object);
                                zzl = n3;
                                object = zzf;
                                boolean bl6 = object.containsKey(string2);
                                if (!bl6) return null;
                                object = zzf;
                                object = object.get(string2);
                                if ((object = (String)object) == null) return object3;
                                return object;
                            }
                            ++n7;
                        }
                    }
                    Uri uri = zza;
                    String[] stringArray = new String[]{string2};
                    bl3 = false;
                    string3 = null;
                    object5 = object;
                    object = object.query(uri, null, null, stringArray, null);
                    if (object == null) {
                        if (object == null) return null;
                        object.close();
                        return null;
                    }
                    try {
                        bl2 = object.moveToFirst();
                        if (bl2) break block16;
                        zzaq.zza(object4, string2, null);
                    }
                    catch (Throwable throwable3) {}
                    object.close();
                    return null;
                }
                object2 = object.getString(n3);
                if (object2 != null && (n3 = (int)(((String)object2).equals(null) ? 1 : 0)) != 0) {
                    bl2 = false;
                    object2 = null;
                }
                zzaq.zza(object4, string2, (String)object2);
                if (object2 == null) break block17;
                object3 = object2;
                break block18;
            }
            object.close();
            return object3;
        }
        object.close();
        throw throwable3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map zza(ContentResolver contentResolver, String ... object) {
        Throwable throwable2222;
        block4: {
            Object object2 = zzc;
            Object object3 = contentResolver;
            contentResolver = contentResolver.query(object2, null, null, (String[])object, null);
            object = new TreeMap();
            if (contentResolver == null) {
                return object;
            }
            try {
                boolean bl2;
                while (bl2 = contentResolver.moveToNext()) {
                    bl2 = false;
                    object3 = null;
                    object3 = contentResolver.getString(0);
                    int n3 = 1;
                    object2 = contentResolver.getString(n3);
                    ((TreeMap)object).put(object3, object2);
                }
            }
            catch (Throwable throwable2222) {
                break block4;
            }
            contentResolver.close();
            return object;
        }
        contentResolver.close();
        throw throwable2222;
    }

    public static /* synthetic */ AtomicBoolean zza() {
        return zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(Object object, String string2, String string3) {
        Class<zzaq> clazz = zzaq.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzk;
                        if (object != object2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = zzf;
                    ((HashMap)object).put(string2, string3);
                }
                return;
            }
            throw throwable2;
        }
    }
}

