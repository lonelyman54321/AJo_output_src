/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.phenotype.zzg;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzf {
    private static final Uri CONTENT_URI;
    private static final Uri zzbe;
    private static final Pattern zzbf;
    private static final Pattern zzbg;
    private static final AtomicBoolean zzbh;
    private static HashMap zzbi;
    private static final HashMap zzbj;
    private static final HashMap zzbk;
    private static final HashMap zzbl;
    private static final HashMap zzbm;
    private static Object zzbn;
    private static boolean zzbo;
    private static String[] zzbp;

    static {
        Serializable serializable;
        CONTENT_URI = Uri.parse((String)"content://com.google.android.gsf.gservices");
        zzbe = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
        int n3 = 2;
        zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", n3);
        zzbg = Pattern.compile("^(0|false|f|off|no|n)$", n3);
        zzbh = serializable = new AtomicBoolean();
        serializable = new HashMap();
        zzbj = serializable;
        serializable = new HashMap();
        zzbk = serializable;
        serializable = new HashMap();
        zzbl = serializable;
        serializable = new HashMap();
        zzbm = serializable;
        zzbp = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zza(HashMap hashMap, String string2, Object object) {
        Class<zzf> clazz = zzf.class;
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
                object2 = zzf.class;
                synchronized (object2) {
                    int n4;
                    int n7;
                    Object object5;
                    try {
                        zzf.zza(object);
                        object3 = zzbn;
                        object5 = zzbi;
                        bl2 = ((HashMap)object5).containsKey(string2);
                        object4 = null;
                        if (bl2) {
                            object = zzbi;
                            object = object.get(string2);
                            if ((object = (String)object) == null) return object4;
                            return object;
                        }
                        object5 = zzbp;
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
                            boolean bl4 = zzbo;
                            if (bl4) {
                                object3 = zzbi;
                                bl4 = object3.isEmpty();
                                if (!bl4) return null;
                            }
                            object3 = zzbp;
                            object5 = zzbi;
                            object = zzf.zza(object, object3);
                            ((HashMap)object5).putAll(object);
                            zzbo = n3;
                            object = zzbi;
                            boolean bl5 = object.containsKey(string2);
                            if (!bl5) return null;
                            object = zzbi;
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
                        zzf.zza(object3, string2, (String)object2);
                        if (object2 == null) break block14;
                        object4 = object2;
                    }
                    object.close();
                    return object4;
                }
            }
            try {
                zzf.zza(object3, string2, null);
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
            Object object2 = zzbe;
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
        Object object2 = zzbi;
        zzg zzg2 = null;
        if (object2 == null) {
            zzbh.set(false);
            object2 = new HashMap();
            zzbi = object2;
            zzbn = object2 = new Object();
            zzbo = false;
            object2 = CONTENT_URI;
            zzg2 = new zzg(null);
            object.registerContentObserver((Uri)object2, true, (ContentObserver)zzg2);
            return;
        }
        object = zzbh;
        boolean bl2 = ((AtomicBoolean)object).getAndSet(false);
        if (bl2) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = object = new Object();
            zzbo = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(Object object, String string2, String string3) {
        Class<zzf> clazz = zzf.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzbn;
                        if (object != object2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = zzbi;
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
    public static boolean zza(ContentResolver object, String string2, boolean bl2) {
        Object object2 = zzf.zzb((ContentResolver)object);
        HashMap hashMap = zzbj;
        Boolean bl3 = bl2;
        if ((bl3 = (Boolean)zzf.zza(hashMap, string2, bl3)) != null) {
            return bl3;
        }
        boolean bl4 = false;
        Object object3 = null;
        if ((object = zzf.zza((ContentResolver)object, string2, null)) != null && !(bl4 = ((String)object).equals(object3 = ""))) {
            object3 = zzbf.matcher((CharSequence)object);
            bl4 = ((Matcher)object3).matches();
            if (bl4) {
                bl3 = Boolean.TRUE;
                bl2 = true;
            } else {
                object3 = zzbg;
                boolean bl5 = ((Matcher)(object = ((Pattern)object3).matcher((CharSequence)object))).matches();
                if (bl5) {
                    bl3 = Boolean.FALSE;
                    bl2 = false;
                }
            }
        }
        object = zzf.class;
        synchronized (object) {
            Throwable throwable2;
            block10: {
                block9: {
                    try {
                        object3 = zzbn;
                        if (object2 != object3) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    hashMap.put(string2, bl3);
                    object2 = zzbi;
                    ((HashMap)object2).remove(string2);
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zzb(ContentResolver object) {
        Class<zzf> clazz = zzf.class;
        synchronized (clazz) {
            zzf.zza(object);
            return zzbn;
        }
    }

    public static /* synthetic */ AtomicBoolean zzi() {
        return zzbh;
    }
}

