/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Base64
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzavl;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrh;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftf;
import com.google.android.gms.internal.ads.zzfth;
import com.google.android.gms.internal.ads.zzhac;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

final class zzfsv
implements zzfrh {
    private final Object zza;
    private final zzfsw zzb;
    private final zzfth zzc;
    private final zzfre zzd;

    public zzfsv(Object object, zzfsw zzfsw2, zzfth zzfth2, zzfre zzfre2) {
        this.zza = object;
        this.zzb = zzfsw2;
        this.zzc = zzfth2;
        this.zzd = zzfre2;
    }

    private static String zzi(byte[] object) {
        if (object == null) {
            return null;
        }
        zzavk zzavk2 = zzavl.zza();
        zzauz zzauz2 = zzauz.zze;
        zzavk2.zzb(zzauz2);
        int n3 = ((byte[])object).length;
        object = zzhac.zzv(object, 0, n3);
        zzavk2.zza((zzhac)object);
        return Base64.encodeToString((byte[])((zzavl)zzavk2.zzbn()).zzaV(), (int)11);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final byte[] zzj(Map object, Map object2) {
        int n3 = 1;
        int n4 = 2;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Class<Map> clazz;
                long l2 = System.currentTimeMillis();
                GenericDeclaration genericDeclaration = this.zza;
                genericDeclaration = genericDeclaration.getClass();
                Object object3 = "xss";
                Class[] classArray = new Class[n4];
                classArray[0] = clazz = Map.class;
                classArray[n3] = clazz;
                genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod((String)object3, classArray);
                object3 = this.zza;
                Object[] objectArray = new Object[n4];
                objectArray[0] = null;
                objectArray[n3] = object2;
                object = ((Method)genericDeclaration).invoke(object3, objectArray);
                return (byte[])object;
                {
                    int n7;
                    long l3;
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    catch (Exception exception) {}
                    {
                        object2 = this.zzd;
                        l3 = System.currentTimeMillis() - l2;
                        n7 = 2007;
                    }
                    {
                        ((zzfre)object2).zzc(n7, l3, exception);
                        return null;
                    }
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza(Context object, String object2, String string2, View view, Activity activity) {
        synchronized (this) {
            object2 = this.zzc;
            object2 = object2.zza();
            String string3 = "f";
            String string4 = "c";
            object2.put(string3, string4);
            string3 = "ctx";
            object2.put(string3, object);
            object = "cs";
            object2.put(object, string2);
            object = "aid";
            string2 = null;
            object2.put(object, null);
            object = "view";
            object2.put(object, view);
            object = "act";
            object2.put(object, activity);
            object = this.zzj(null, (Map)object2);
            return zzfsv.zzi((byte[])object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb(Context object, String object2, View view, Activity activity) {
        synchronized (this) {
            object2 = this.zzc;
            object2 = object2.zzc();
            String string2 = "f";
            String string3 = "v";
            object2.put(string2, string3);
            string2 = "ctx";
            object2.put(string2, object);
            object = "aid";
            string2 = null;
            object2.put(object, null);
            object = "view";
            object2.put(object, view);
            object = "act";
            object2.put(object, activity);
            object = this.zzj(null, (Map)object2);
            return zzfsv.zzi((byte[])object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzc(Context object, String object2) {
        synchronized (this) {
            object2 = this.zzc;
            object2 = object2.zzb();
            String string2 = "f";
            String string3 = "q";
            object2.put(string2, string3);
            string2 = "ctx";
            object2.put(string2, object);
            object = "aid";
            string2 = null;
            object2.put(object, null);
            object = this.zzj(null, (Map)object2);
            return zzfsv.zzi((byte[])object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String object, MotionEvent object2) {
        object = null;
        int n3 = 1;
        synchronized (this) {
            try {
                Class<Map> clazz;
                long l3 = System.currentTimeMillis();
                HashMap<String, Object> hashMap = new HashMap<String, Object>();
                Object object3 = "t";
                Class[] classArray = new Throwable();
                hashMap.put((String)object3, classArray);
                object3 = "aid";
                classArray = null;
                hashMap.put((String)object3, null);
                object3 = "evt";
                hashMap.put((String)object3, object2);
                object2 = this.zza;
                object2 = object2.getClass();
                object3 = "he";
                classArray = new Class[n3];
                classArray[0] = clazz = Map.class;
                object2 = ((Class)object2).getDeclaredMethod((String)object3, classArray);
                object3 = this.zza;
                Object[] objectArray = new Object[n3];
                objectArray[0] = hashMap;
                ((Method)object2).invoke(object3, objectArray);
                object = this.zzd;
                long l2 = System.currentTimeMillis() - l3;
                int n4 = 3003;
                ((zzfre)object).zzd(n4, l2);
                return;
            }
            catch (Throwable throwable) {
            }
            catch (Exception exception) {
                n3 = 2005;
                object2 = new zzftf(n3, (Throwable)exception);
                throw object2;
            }
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zze() {
        synchronized (this) {
            Throwable throwable22222;
            Object object = this.zza;
            object = object.getClass();
            Object object2 = "lcs";
            boolean bl2 = false;
            object = ((Class)object).getDeclaredMethod((String)object2, null);
            object2 = this.zza;
            object = ((Method)object).invoke(object2, null);
            object = (Integer)object;
            return (Integer)object;
            {
                catch (Throwable throwable22222) {
                }
                catch (Exception exception) {}
                {
                    int n32 = 2006;
                    zzftf zzftf2 = new zzftf(n32, (Throwable)exception);
                    throw zzftf2;
                }
            }
            throw throwable22222;
        }
    }

    public final zzfsw zzf() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        synchronized (this) {
            try {
                long l3 = System.currentTimeMillis();
                Object object = this.zza;
                object = object.getClass();
                Object object2 = "close";
                object = ((Class)object).getDeclaredMethod((String)object2, null);
                object2 = this.zza;
                ((Method)object).invoke(object2, null);
                object = this.zzd;
                long l2 = System.currentTimeMillis() - l3;
                int n3 = 3001;
                ((zzfre)object).zzd(n3, l2);
                return;
            }
            catch (Throwable throwable) {
            }
            catch (Exception exception) {
                int n4 = 2003;
                zzftf zzftf2 = new zzftf(n4, (Throwable)exception);
                throw zzftf2;
            }
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzh() {
        synchronized (this) {
            Throwable throwable22222;
            Object object = this.zza;
            object = object.getClass();
            Object object2 = "init";
            boolean bl2 = false;
            object = ((Class)object).getDeclaredMethod((String)object2, null);
            object2 = this.zza;
            object = ((Method)object).invoke(object2, null);
            object = (Boolean)object;
            return (Boolean)object;
            {
                catch (Throwable throwable22222) {
                }
                catch (Exception exception) {}
                {
                    int n3 = 2001;
                    zzftf zzftf2 = new zzftf(n3, (Throwable)exception);
                    throw zzftf2;
                }
            }
            throw throwable22222;
        }
    }
}

