/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  dalvik.system.DexClassLoader
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzfqx;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrh;
import com.google.android.gms.internal.ads.zzfsv;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftf;
import com.google.android.gms.internal.ads.zzfth;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzftg {
    private static final HashMap zza;
    private final Context zzb;
    private final zzfth zzc;
    private final zzfre zzd;
    private final zzfqx zze;
    private zzfsv zzf;
    private final Object zzg;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public zzftg(Context context, zzfth zzfth2, zzfre zzfre2, zzfqx zzfqx2) {
        Object object;
        this.zzg = object = new Object();
        this.zzb = context;
        this.zzc = zzfth2;
        this.zzd = zzfre2;
        this.zze = zzfqx2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Class zzd(zzfsw clazz) {
        synchronized (this) {
            Throwable throwable22;
            block15: {
                int n3;
                Object object;
                block12: {
                    void var1_6;
                    block14: {
                        Object object2;
                        zzfqx zzfqx2;
                        Object object3;
                        HashMap hashMap;
                        block13: {
                            block11: {
                                object = ((zzfsw)((Object)clazz)).zza();
                                object = ((zzbac)object).zzk();
                                hashMap = zza;
                                object3 = hashMap.get(object);
                                object3 = (Class)object3;
                                if (object3 == null) break block11;
                                {
                                    catch (Throwable throwable22) {}
                                }
                                return object3;
                            }
                            n3 = 2026;
                            zzfqx2 = this.zze;
                            object2 = ((zzfsw)((Object)clazz)).zzc();
                            boolean bl2 = zzfqx2.zza((File)object2);
                            if (!bl2) break block12;
                            object3 = ((zzfsw)((Object)clazz)).zzb();
                            bl2 = ((File)object3).exists();
                            if (bl2) break block13;
                            ((File)object3).mkdirs();
                            break block13;
                            break block15;
                            catch (IllegalArgumentException illegalArgumentException) {
                                break block14;
                            }
                            catch (SecurityException securityException) {
                                break block14;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                break block14;
                            }
                        }
                        clazz = ((zzfsw)((Object)clazz)).zzc();
                        clazz = ((File)((Object)clazz)).getAbsolutePath();
                        object3 = ((File)object3).getAbsolutePath();
                        object2 = this.zzb;
                        object2 = object2.getClassLoader();
                        zzfqx2 = new DexClassLoader((String)((Object)clazz), (String)object3, null, (ClassLoader)object2);
                        clazz = "com.google.ccc.abuse.droidguard.DroidGuard";
                        clazz = ((ClassLoader)((Object)zzfqx2)).loadClass((String)((Object)clazz));
                        hashMap.put(object, clazz);
                        return clazz;
                    }
                    int n4 = 2008;
                    object = new zzftf(n4, (Throwable)var1_6);
                    throw object;
                }
                try {
                    object = "VM did not pass signature verification";
                    clazz = new Class(n3, (String)object);
                    throw clazz;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    object = new zzftf(n3, (Throwable)generalSecurityException);
                    throw object;
                }
            }
            throw throwable22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfrh zza() {
        Object object = this.zzg;
        synchronized (object) {
            return this.zzf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfsw zzb() {
        Object object = this.zzg;
        synchronized (object) {
            try {
                zzfsv zzfsv2 = this.zzf;
                if (zzfsv2 == null) return null;
                return zzfsv2.zzf();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zzc(zzfsw zzfsw2) {
        zzftf zzftf222;
        Object object;
        long l2;
        int n3;
        zzftg zzftg2;
        block20: {
            Exception exception32;
            int n4;
            block19: {
                Object object2;
                block15: {
                    Object object3;
                    String string2;
                    int n7;
                    block16: {
                        Throwable throwable22;
                        block18: {
                            boolean bl2;
                            int n8;
                            block17: {
                                Object object4;
                                zzftg2 = this;
                                n7 = 5;
                                int n10 = 4;
                                n3 = 3;
                                n8 = 6;
                                n4 = 2;
                                bl2 = true;
                                string2 = "ci: ";
                                l2 = System.currentTimeMillis();
                                GenericDeclaration genericDeclaration = this.zzd(zzfsw2);
                                try {
                                    Object object5 = new Class[n8];
                                    Object object6 = Context.class;
                                    object5[0] = object6;
                                    object6 = String.class;
                                    object5[bl2] = object6;
                                    object6 = byte[].class;
                                    object5[n4] = object6;
                                    object6 = Object.class;
                                    object5[n3] = object6;
                                    object6 = Bundle.class;
                                    object5[n10] = object6;
                                    object6 = Integer.TYPE;
                                    object5[n7] = object6;
                                    genericDeclaration = ((Class)genericDeclaration).getDeclaredConstructor((Class<?>)object5);
                                    object5 = this.zzb;
                                    object6 = zzfsw2.zze();
                                    Bundle bundle = new Bundle();
                                    Integer n14 = n4;
                                    object4 = new Object[n8];
                                    object4[0] = object5;
                                    object5 = "msa-r";
                                    object4[bl2] = object5;
                                    object4[n4] = object6;
                                    n4 = 0;
                                    object4[n3] = null;
                                    object4[n10] = bundle;
                                    object4[n7] = n14;
                                    object2 = ((Constructor)genericDeclaration).newInstance((Object[])object4);
                                }
                                catch (Exception exception2) {
                                    n3 = 2004;
                                    zzftf zzftf3 = new zzftf(n3, (Throwable)exception2);
                                    throw zzftf3;
                                }
                                object3 = this.zzc;
                                object4 = this.zzd;
                                object = new zzfsv(object2, zzfsw2, (zzfth)object3, (zzfre)object4);
                                n7 = (int)(((zzfsv)object).zzh() ? 1 : 0);
                                if (n7 == 0) break block15;
                                n7 = ((zzfsv)object).zze();
                                if (n7 != 0) break block16;
                                object3 = this.zzg;
                                // MONITORENTER : object3
                                try {
                                    object2 = this.zzf;
                                    if (object2 == null) break block17;
                                    ((zzfsv)object2).zzg();
                                    break block17;
                                }
                                catch (Throwable throwable22) {
                                    break block18;
                                }
                                catch (zzftf zzftf4) {
                                    object4 = zzftf4;
                                    object2 = zzftg2.zzd;
                                    n4 = ((zzftf)object4).zza();
                                    long l3 = -1;
                                    ((zzfre)object2).zzc(n4, l3, (Exception)object4);
                                }
                            }
                            zzftg2.zzf = object;
                            // MONITOREXIT : object3
                            object2 = zzftg2.zzd;
                            long l4 = System.currentTimeMillis() - l2;
                            n8 = 3000;
                            ((zzfre)object2).zzd(n8, l4);
                            return bl2;
                        }
                        try {
                            throw throwable22;
                        }
                        catch (Exception exception32) {
                            break block19;
                        }
                        catch (zzftf zzftf222) {
                            break block20;
                        }
                    }
                    object3 = new StringBuilder(string2);
                    ((StringBuilder)object3).append(n7);
                    object2 = ((StringBuilder)object3).toString();
                    n3 = 4001;
                    object = new zzftf(n3, (String)object2);
                    throw object;
                }
                object = "init failed";
                n3 = 4000;
                object2 = new zzftf(n3, (String)object);
                throw object2;
            }
            object = zzftg2.zzd;
            long l7 = System.currentTimeMillis() - l2;
            n4 = 4010;
            ((zzfre)object).zzc(n4, l7, exception32);
            return false;
        }
        object = zzftg2.zzd;
        n3 = zzftf222.zza();
        long l8 = System.currentTimeMillis() - l2;
        ((zzfre)object).zzc(n3, l8, zzftf222);
        return false;
    }
}

