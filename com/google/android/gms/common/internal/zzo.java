/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaj;

public final class zzo {
    private static final Uri zza;
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
        Uri.Builder builder = new Uri.Builder();
        zza = builder.scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public zzo(ComponentName componentName, int n3) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = 4225;
        this.zzf = false;
    }

    public zzo(String string2, int n3, boolean bl2) {
        this(string2, "com.google.android.gms", 4225, false);
    }

    public zzo(String string2, String string3, int n3, boolean bl2) {
        Preconditions.checkNotEmpty(string2);
        this.zzb = string2;
        Preconditions.checkNotEmpty(string3);
        this.zzc = string3;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zzo;
        if (!bl4) {
            return false;
        }
        object = (zzo)object;
        String string2 = this.zzb;
        String string3 = ((zzo)object).zzb;
        bl4 = Objects.equal(string2, string3);
        if (bl4 && (bl4 = Objects.equal(string2 = this.zzc, string3 = ((zzo)object).zzc)) && (bl4 = Objects.equal(string2 = this.zzd, string3 = ((zzo)object).zzd)) && (bl4 = this.zzf) == (bl2 = ((zzo)object).zzf)) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zzb;
        String string3 = this.zzc;
        ComponentName componentName = this.zzd;
        Integer n3 = 4225;
        Boolean bl2 = this.zzf;
        Object[] objectArray = new Object[]{string2, string3, componentName, n3, bl2};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        String string2 = this.zzb;
        if (string2 == null) {
            Preconditions.checkNotNull(this.zzd);
            string2 = this.zzd.flattenToString();
        }
        return string2;
    }

    public final ComponentName zza() {
        return this.zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent zzb(Context object) {
        Object object2 = this.zzb;
        if (object2 != null) {
            boolean bl2 = this.zzf;
            Object object3 = null;
            if (bl2) {
                block15: {
                    String string2;
                    block16: {
                        block17: {
                            block14: {
                                object2 = new Bundle();
                                string2 = this.zzb;
                                String string3 = "serviceActionBundleKey";
                                object2.putString(string3, string2);
                                object = object.getContentResolver();
                                string2 = zza;
                                object = object.acquireUnstableContentProviderClient((Uri)string2);
                                if (object == null) break block14;
                                string2 = "serviceIntentCall";
                                try {
                                    object2 = object.call(string2, null, (Bundle)object2);
                                }
                                catch (Throwable throwable) {
                                    try {
                                        object.release();
                                        throw throwable;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        break block17;
                                    }
                                    catch (RemoteException remoteException) {
                                        break block17;
                                    }
                                }
                                try {
                                    object.release();
                                    break block15;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    break block16;
                                }
                                catch (RemoteException remoteException) {
                                    break block16;
                                }
                            }
                            object2 = "Failed to acquire ContentProviderClient";
                            object = new RemoteException((String)object2);
                            throw object;
                        }
                        bl2 = false;
                        object2 = null;
                    }
                    string2 = "Dynamic intent resolution failed: ";
                    object = object.toString();
                    string2.concat((String)object);
                }
                if (object2 != null) {
                    object = object2.getParcelable("serviceResponseIntentKey");
                    object3 = object;
                    object3 = (Intent)object;
                    if (object3 == null && (object = (PendingIntent)object2.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                        object3 = new ConnectionResult(25, (PendingIntent)object);
                        object2 = new zzaj((ConnectionResult)object3);
                        throw object2;
                    }
                }
                if (object3 == null) {
                    object = String.valueOf(this.zzb);
                    object2 = "Dynamic lookup for intent failed for action: ";
                    ((String)object2).concat((String)object);
                }
            }
            if (object3 != null) return object3;
            object = this.zzb;
            object2 = new Intent((String)object);
            object = this.zzc;
            return object2.setPackage((String)object);
        }
        object = new Intent();
        object2 = this.zzd;
        return object.setComponent((ComponentName)object2);
    }

    public final String zzc() {
        return this.zzc;
    }
}

