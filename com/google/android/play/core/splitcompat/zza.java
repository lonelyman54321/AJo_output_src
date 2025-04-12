/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public final class zza {
    private final zze zza;

    public zza(zze zze2) {
        this.zza = zze2;
    }

    public static final int zzc(AssetManager assetManager, File object) {
        object = ((File)object).getPath();
        return (Integer)zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Context context, Set object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    context = context.getAssets();
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (File)object2;
                        com.google.android.play.core.splitcompat.zza.zzc((AssetManager)context, object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb(Context context, Set iterator) {
        synchronized (this) {
            StrictMode.ThreadPolicy threadPolicy;
            block16: {
                Throwable throwable3;
                block17: {
                    Throwable throwable2222;
                    block15: {
                        block14: {
                            threadPolicy = StrictMode.getThreadPolicy();
                            try {
                                StrictMode.allowThreadDiskReads();
                                StrictMode.allowThreadDiskWrites();
                                break block14;
                            }
                            catch (Exception exception) {}
                            catch (Exception exception) {
                                threadPolicy = null;
                            }
                        }
                        try {
                            boolean bl2;
                            HashSet hashSet = new HashSet();
                            iterator = iterator.iterator();
                            while (bl2 = iterator.hasNext()) {
                                Object object = iterator.next();
                                object = (String)object;
                                zze zze2 = this.zza;
                                object = zze2.zzg((String)object);
                                hashSet.add(object);
                            }
                            this.zza(context, hashSet);
                            if (threadPolicy == null) return true;
                        }
                        catch (Throwable throwable2222) {
                            break block15;
                        }
                        catch (Exception exception) {
                            break block16;
                        }
                        try {
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                            return true;
                        }
                        catch (Throwable throwable3) {}
                        break block17;
                    }
                    if (threadPolicy == null) {
                        throw throwable2222;
                    }
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                    throw throwable2222;
                }
                throw throwable3;
            }
            if (threadPolicy == null) return false;
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return false;
        }
    }
}

