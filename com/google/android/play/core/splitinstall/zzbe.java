/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class zzbe {
    private final Context zza;

    public zzbe(Context context) {
        this.zza = context;
    }

    private final SharedPreferences zze() {
        return this.zza.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set zza() {
        Class<zzbe> clazz = zzbe.class;
        synchronized (clazz) {
            Throwable throwable22222;
            Object object = this.zze();
            String string2 = "modules_to_uninstall_if_emulated";
            HashSet hashSet = new HashSet();
            object = object.getStringSet(string2, hashSet);
            if (object != null) return object;
            return new HashSet();
            {
                catch (Throwable throwable22222) {
                }
                catch (Exception exception) {}
                return new HashSet();
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        Class<zzbe> clazz = zzbe.class;
        synchronized (clazz) {
            SharedPreferences sharedPreferences2 = this.zze();
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = "modules_to_uninstall_if_emulated";
            HashSet hashSet = new HashSet();
            sharedPreferences2 = sharedPreferences2.putStringSet(string2, hashSet);
            sharedPreferences2.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(Collection sharedPreferences2) {
        Class<zzbe> clazz = zzbe.class;
        synchronized (clazz) {
            block6: {
                Throwable throwable2;
                block7: {
                    boolean bl2;
                    HashSet hashSet;
                    Object object;
                    try {
                        boolean bl3;
                        object = this.zza();
                        hashSet = new HashSet(object);
                        sharedPreferences2 = sharedPreferences2.iterator();
                        bl2 = false;
                        object = null;
                        while (bl3 = sharedPreferences2.hasNext()) {
                            Object object2 = sharedPreferences2.next();
                            object2 = (String)object2;
                            bl3 = hashSet.add(object2);
                            bl2 |= bl3;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    if (!bl2) break block6;
                    try {
                        sharedPreferences2 = this.zze();
                        sharedPreferences2 = sharedPreferences2.edit();
                        object = "modules_to_uninstall_if_emulated";
                        sharedPreferences2 = sharedPreferences2.putStringSet((String)object, hashSet);
                        sharedPreferences2.apply();
                        break block6;
                    }
                    catch (Exception exception) {}
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(Collection var1_1) {
        var2_3 = zzbe.class;
        synchronized (var2_3) {
            block7: {
                try {
                    var3_4 = this.zza();
                    var4_5 = new HashSet<E>();
                    var3_4 = var3_4.iterator();
                    var5_6 = false;
                }
                catch (Throwable var1_2) {}
                {
                    throw var1_2;
                    while (var6_7 = var3_4.hasNext()) {
                        var7_8 /* !! */  = var3_4.next();
                        var8_9 = var1_1.contains(var7_8 /* !! */  = (String)var7_8 /* !! */ );
                        if (var8_9) {
                            var5_6 = true;
                            continue;
                        }
                        var4_5.add(var7_8 /* !! */ );
                    }
                    if (!var5_6) break block7;
                    ** try [egrp 1[TRYBLOCK] [9 : 99->135)] { 
lbl22:
                    // 1 sources

                    var1_1 = this.zze();
                    var1_1 = var1_1.edit();
                    var3_4 = "modules_to_uninstall_if_emulated";
                    var1_1 = var1_1.putStringSet((String)var3_4, var4_5);
                    var1_1.apply();
                }
lbl28:
                // 1 sources

                catch (Exception v0) {}
            }
            return;
        }
    }
}

