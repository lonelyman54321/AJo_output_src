/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

final class zzc {
    private final Map zza;
    private int zzb;
    private Bundle zzc;

    public zzc() {
        Map map2 = new Jp();
        map2 = Collections.synchronizedMap(map2);
        this.zza = map2;
        this.zzb = 0;
    }

    public static /* bridge */ /* synthetic */ int zza(zzc zzc2) {
        return zzc2.zzb;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzc zzc2) {
        return zzc2.zzc;
    }

    public final LifecycleCallback zzc(String string2, Class clazz) {
        string2 = this.zza.get(string2);
        return (LifecycleCallback)clazz.cast(string2);
    }

    public final void zzd(String string2, LifecycleCallback object) {
        Object object2 = this.zza;
        int n3 = object2.containsKey(string2);
        if (n3 == 0) {
            object2 = this.zza;
            object2.put(string2, object);
            n3 = this.zzb;
            if (n3 > 0) {
                Object object3 = Looper.getMainLooper();
                object2 = new zzh((Looper)object3);
                object3 = new zzb(this, (LifecycleCallback)object, string2);
                object2.post((Runnable)object3);
            }
            return;
        }
        string2 = cP.a("LifecycleCallback with tag ", string2, " already added to this fragment.");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void zze(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.dump(string2, fileDescriptor, printWriter, stringArray);
        }
    }

    public final void zzf(int n3, int n4, Intent intent) {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.onActivityResult(n3, n4, intent);
        }
    }

    public final void zzg(Bundle bundle) {
        boolean bl2;
        int n3;
        this.zzb = n3 = 1;
        this.zzc = bundle;
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            LifecycleCallback lifecycleCallback = (LifecycleCallback)object.getValue();
            if (bundle != null) {
                object = (String)object.getKey();
                object = bundle.getBundle((String)object);
            } else {
                bl2 = false;
                object = null;
            }
            lifecycleCallback.onCreate((Bundle)object);
        }
    }

    public final void zzh() {
        boolean bl2;
        int n3;
        this.zzb = n3 = 5;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.onDestroy();
        }
    }

    public final void zzi() {
        boolean bl2;
        int n3;
        this.zzb = n3 = 3;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.onResume();
        }
    }

    public final void zzj(Bundle bundle) {
        if (bundle != null) {
            boolean bl2;
            Iterator iterator = this.zza.entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = iterator.next();
                Bundle bundle2 = new Bundle();
                LifecycleCallback lifecycleCallback = (LifecycleCallback)object.getValue();
                lifecycleCallback.onSaveInstanceState(bundle2);
                object = (String)object.getKey();
                bundle.putBundle((String)object, bundle2);
            }
        }
    }

    public final void zzk() {
        boolean bl2;
        int n3;
        this.zzb = n3 = 2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.onStart();
        }
    }

    public final void zzl() {
        boolean bl2;
        int n3;
        this.zzb = n3 = 4;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback)iterator.next();
            lifecycleCallback.onStop();
        }
    }

    public final boolean zzm() {
        int n3 = this.zzb;
        return n3 > 0;
    }

    public final boolean zzn() {
        int n3 = this.zzb;
        int n4 = 2;
        return n3 >= n4;
    }
}

