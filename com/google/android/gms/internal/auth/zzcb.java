/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.auth.zzca;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class zzcb {
    public static final Uri zza;
    public static final Uri zzb;
    public static final Pattern zzc;
    public static final Pattern zzd;
    static HashMap zze;
    static final HashMap zzf;
    static final HashMap zzg;
    static final HashMap zzh;
    static final HashMap zzi;
    static final String[] zzj;
    private static final AtomicBoolean zzk;
    private static Object zzl;
    private static boolean zzm;

    static {
        Serializable serializable;
        zza = Uri.parse((String)"content://com.google.android.gsf.gservices");
        zzb = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
        int n3 = 2;
        zzc = Pattern.compile("^(1|true|t|on|yes|y)$", n3);
        zzd = Pattern.compile("^(0|false|f|off|no|n)$", n3);
        zzk = serializable = new AtomicBoolean();
        serializable = new HashMap();
        zzf = serializable;
        serializable = new HashMap();
        zzg = serializable;
        serializable = new HashMap();
        zzh = serializable;
        serializable = new HashMap();
        zzi = serializable;
        zzj = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String zza(ContentResolver object, String string2, String object2) {
        Throwable throwable222;
        block17: {
            Object object3;
            block16: {
                block15: {
                    boolean bl2;
                    int n3;
                    Object object4;
                    block14: {
                        Object object5;
                        int n4;
                        block13: {
                            block12: {
                                object2 = zzcb.class;
                                // MONITORENTER : object2
                                object4 = zze;
                                n3 = 1;
                                n4 = 0;
                                object5 = null;
                                object3 = null;
                                if (object4 != null) break block12;
                                object4 = zzk;
                                ((AtomicBoolean)object4).set(false);
                                object4 = new HashMap();
                                zze = object4;
                                zzl = object4 = new Object();
                                zzm = false;
                                object4 = zza;
                                object5 = new zzca(null);
                                object.registerContentObserver((Uri)object4, n3 != 0, (ContentObserver)object5);
                                break block13;
                            }
                            object4 = zzk;
                            boolean bl3 = ((AtomicBoolean)object4).getAndSet(false);
                            if (bl3) {
                                object4 = zze;
                                ((HashMap)object4).clear();
                                object4 = zzf;
                                ((HashMap)object4).clear();
                                object4 = zzg;
                                ((HashMap)object4).clear();
                                object4 = zzh;
                                ((HashMap)object4).clear();
                                object4 = zzi;
                                ((HashMap)object4).clear();
                                zzl = object4 = new Object();
                                zzm = false;
                            }
                        }
                        object4 = zzl;
                        object5 = zze;
                        n4 = object5.containsKey(string2);
                        if (n4 != 0) {
                            object = zze;
                            object = object.get(string2);
                            if ((object = (String)object) == null) {
                                return object3;
                            }
                            object3 = object;
                            // MONITOREXIT : object2
                            return object3;
                        }
                        object5 = zzj;
                        n4 = ((String[])object5).length;
                        // MONITOREXIT : object2
                        Uri uri = zza;
                        String[] stringArray = new String[]{string2};
                        object = object.query(uri, null, null, stringArray, null);
                        if (object == null) {
                            return null;
                        }
                        try {
                            bl2 = object.moveToFirst();
                            if (bl2) break block14;
                            zzcb.zzc(object4, string2, null);
                        }
                        catch (Throwable throwable222) {}
                        object.close();
                        return null;
                    }
                    object2 = object.getString(n3);
                    if (object2 != null && (n3 = (int)(((String)object2).equals(null) ? 1 : 0)) != 0) {
                        bl2 = false;
                        object2 = null;
                    }
                    zzcb.zzc(object4, string2, (String)object2);
                    if (object2 != null) break block15;
                    break block16;
                    break block17;
                }
                object3 = object2;
            }
            object.close();
            return object3;
        }
        object.close();
        throw throwable222;
    }

    public static /* synthetic */ AtomicBoolean zzb() {
        return zzk;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzc(Object object, String string2, String string3) {
        Class<zzcb> clazz = zzcb.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzl;
                        if (object != object2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = zze;
                    ((HashMap)object).put(string2, string3);
                }
                return;
            }
            throw throwable2;
        }
    }
}

