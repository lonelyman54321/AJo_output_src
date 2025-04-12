/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.clearcut.zzz;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzy {
    private static final Uri CONTENT_URI;
    private static final Uri zzcq;
    public static final Pattern zzcr;
    public static final Pattern zzcs;
    private static final AtomicBoolean zzct;
    private static HashMap zzcu;
    private static final HashMap zzcv;
    private static final HashMap zzcw;
    private static final HashMap zzcx;
    private static final HashMap zzcy;
    private static Object zzcz;
    private static boolean zzda;
    private static String[] zzdb;

    static {
        Serializable serializable;
        CONTENT_URI = Uri.parse((String)"content://com.google.android.gsf.gservices");
        zzcq = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
        int n3 = 2;
        zzcr = Pattern.compile("^(1|true|t|on|yes|y)$", n3);
        zzcs = Pattern.compile("^(0|false|f|off|no|n)$", n3);
        zzct = serializable = new AtomicBoolean();
        serializable = new HashMap();
        zzcv = serializable;
        serializable = new HashMap();
        zzcw = serializable;
        serializable = new HashMap();
        zzcx = serializable;
        serializable = new HashMap();
        zzcy = serializable;
        zzdb = new String[0];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long getLong(ContentResolver object, String string2, long l2) {
        void var1_3;
        Object object2 = zzy.zzb(object);
        Serializable serializable = zzcx;
        long l3 = 0L;
        Long l4 = l3;
        if ((serializable = (Long)zzy.zza((HashMap)serializable, (String)var1_3, l4)) != null) {
            return (Long)serializable;
        }
        l4 = null;
        String string3 = zzy.zza(object, (String)var1_3, null);
        if (string3 != null) {
            try {
                long l7 = Long.parseLong(string3);
                serializable = Long.valueOf(l7);
                l3 = l7;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        HashMap hashMap = zzcx;
        zzy.zza(object2, hashMap, (String)var1_3, serializable);
        return l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zza(HashMap hashMap, String string2, Object object) {
        Class<zzy> clazz = zzy.class;
        synchronized (clazz) {
            try {
                boolean bl2 = hashMap.containsKey(string2);
                if (!bl2) {
                    return null;
                }
                if ((hashMap = hashMap.get(string2)) == null) return object;
                return hashMap;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza(ContentResolver object, String string2, String object2) {
        Throwable throwable3;
        block15: {
            Object object3;
            block13: {
                String string3;
                int n3;
                Object object4;
                boolean bl2;
                object2 = zzy.class;
                synchronized (object2) {
                    int n4;
                    int n7;
                    Object object5;
                    try {
                        zzy.zza(object);
                        object3 = zzcz;
                        object5 = zzcu;
                        bl2 = ((HashMap)object5).containsKey(string2);
                        object4 = null;
                        if (bl2) {
                            object = zzcu;
                            object = object.get(string2);
                            if ((object = (String)object) == null) return object4;
                            return object;
                        }
                        object5 = zzdb;
                        n7 = ((String[])object5).length;
                        n4 = 0;
                    }
                    catch (Throwable throwable2) {}
                    throw throwable2;
                    while (true) {
                        n3 = 1;
                        if (n4 >= n7) break;
                        string3 = object5[n4];
                        boolean bl3 = string2.startsWith(string3);
                        if (bl3) {
                            boolean bl4 = zzda;
                            if (bl4) {
                                object3 = zzcu;
                                bl4 = object3.isEmpty();
                                if (!bl4) return null;
                            }
                            object3 = zzdb;
                            object5 = zzcu;
                            object = zzy.zza(object, object3);
                            ((HashMap)object5).putAll(object);
                            zzda = n3;
                            object = zzcu;
                            boolean bl5 = object.containsKey(string2);
                            if (!bl5) return null;
                            object = zzcu;
                            object = object.get(string2);
                            if ((object = (String)object) == null) return object4;
                            return object;
                        }
                        ++n4;
                    }
                }
                Uri uri = CONTENT_URI;
                String[] stringArray = new String[]{string2};
                string3 = object;
                object = object.query(uri, null, null, stringArray, null);
                if (object != null) {
                    block14: {
                        boolean bl6 = object.moveToFirst();
                        if (!bl6) break block13;
                        object2 = object.getString(n3);
                        if (object2 != null && (bl2 = ((String)object2).equals(null))) {
                            bl6 = false;
                            object2 = null;
                        }
                        zzy.zza(object3, string2, (String)object2);
                        if (object2 == null) break block14;
                        object4 = object2;
                    }
                    object.close();
                    return object4;
                }
            }
            try {
                zzy.zza(object3, string2, null);
                if (object == null) return null;
            }
            catch (Throwable throwable3) {}
            break block15;
            object.close();
            return null;
        }
        if (object == null) throw throwable3;
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
            Object object2 = zzcq;
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

    private static void zza(ContentResolver object) {
        Object object2 = zzcu;
        zzz zzz2 = null;
        if (object2 == null) {
            zzct.set(false);
            object2 = new HashMap();
            zzcu = object2;
            zzcz = object2 = new Object();
            zzda = false;
            object2 = CONTENT_URI;
            zzz2 = new zzz(null);
            object.registerContentObserver((Uri)object2, true, (ContentObserver)zzz2);
            return;
        }
        object = zzct;
        boolean bl2 = ((AtomicBoolean)object).getAndSet(false);
        if (bl2) {
            zzcu.clear();
            zzcv.clear();
            zzcw.clear();
            zzcx.clear();
            zzcy.clear();
            zzcz = object = new Object();
            zzda = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(Object object, String string2, String string3) {
        Class<zzy> clazz = zzy.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzcz;
                        if (object != object2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = zzcu;
                    ((HashMap)object).put(string2, string3);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(Object object, HashMap hashMap, String string2, Object object2) {
        Class<zzy> clazz = zzy.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object3 = zzcz;
                        if (object != object3) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    hashMap.put(string2, object2);
                    object = zzcu;
                    ((HashMap)object).remove(string2);
                }
                return;
            }
            throw throwable2;
        }
    }

    public static boolean zza(ContentResolver object, String string2, boolean bl2) {
        Object object2 = zzy.zzb((ContentResolver)object);
        HashMap hashMap = zzcv;
        Boolean bl3 = bl2;
        if ((bl3 = (Boolean)zzy.zza(hashMap, string2, bl3)) != null) {
            return bl3;
        }
        boolean bl4 = false;
        Object object3 = null;
        if ((object = zzy.zza((ContentResolver)object, string2, null)) != null && !(bl4 = ((String)object).equals(object3 = ""))) {
            object3 = zzcr.matcher((CharSequence)object);
            bl4 = ((Matcher)object3).matches();
            if (bl4) {
                bl3 = Boolean.TRUE;
                bl2 = true;
            } else {
                object3 = zzcs;
                boolean bl5 = ((Matcher)(object = ((Pattern)object3).matcher((CharSequence)object))).matches();
                if (bl5) {
                    bl3 = Boolean.FALSE;
                    bl2 = false;
                }
            }
        }
        zzy.zza(object2, hashMap, string2, bl3);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zzb(ContentResolver object) {
        Class<zzy> clazz = zzy.class;
        synchronized (clazz) {
            zzy.zza(object);
            return zzcz;
        }
    }

    public static /* synthetic */ AtomicBoolean zze() {
        return zzct;
    }
}

