/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.app.FragmentTransaction
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zza
extends Fragment
implements LifecycleFragment {
    private static final WeakHashMap zza;
    private final zzc zzb;

    static {
        WeakHashMap weakHashMap;
        zza = weakHashMap = new WeakHashMap();
    }

    public zza() {
        zzc zzc2;
        this.zzb = zzc2 = new zzc();
    }

    public static zza zza(Activity activity) {
        boolean bl2;
        FragmentTransaction fragmentTransaction = "LifecycleFragmentImpl";
        WeakHashMap weakHashMap = zza;
        Object object = (WeakReference)weakHashMap.get(activity);
        if (object != null && (object = (zza)((Reference)object).get()) != null) {
            return object;
        }
        try {
            object = activity.getFragmentManager();
        }
        catch (ClassCastException classCastException) {
            fragmentTransaction = new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException);
            throw fragmentTransaction;
        }
        object = object.findFragmentByTag((String)fragmentTransaction);
        object = (zza)object;
        if (object == null || (bl2 = object.isRemoving())) {
            object = new zza();
            FragmentTransaction fragmentTransaction2 = activity.getFragmentManager().beginTransaction();
            fragmentTransaction = fragmentTransaction2.add((Fragment)object, fragmentTransaction);
            fragmentTransaction.commitAllowingStateLoss();
        }
        fragmentTransaction = new WeakReference(object);
        weakHashMap.put(activity, fragmentTransaction);
        return object;
    }

    public final void addCallback(String string2, LifecycleCallback lifecycleCallback) {
        this.zzb.zzd(string2, lifecycleCallback);
    }

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.dump(string2, fileDescriptor, printWriter, stringArray);
        this.zzb.zze(string2, fileDescriptor, printWriter, stringArray);
    }

    public final LifecycleCallback getCallbackOrNull(String string2, Class clazz) {
        return this.zzb.zzc(string2, clazz);
    }

    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    public final boolean isCreated() {
        return this.zzb.zzm();
    }

    public final boolean isStarted() {
        return this.zzb.zzn();
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        this.zzb.zzf(n3, n4, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.zzg(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzb.zzh();
    }

    public final void onResume() {
        super.onResume();
        this.zzb.zzi();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.zzj(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.zzb.zzk();
    }

    public final void onStop() {
        super.onStop();
        this.zzb.zzl();
    }
}

