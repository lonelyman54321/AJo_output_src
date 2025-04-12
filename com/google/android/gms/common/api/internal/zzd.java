/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zzd
extends Fragment
implements LifecycleFragment {
    private static final WeakHashMap zza;
    private final zzc zzb;

    static {
        WeakHashMap weakHashMap;
        zza = weakHashMap = new WeakHashMap();
    }

    public zzd() {
        zzc zzc2;
        this.zzb = zzc2 = new zzc();
    }

    public static zzd zza(FragmentActivity fragmentActivity) {
        boolean bl2;
        WeakReference<Object> weakReference = "SLifecycleFragmentImpl";
        WeakHashMap weakHashMap = zza;
        Object object = (WeakReference)weakHashMap.get(fragmentActivity);
        if (object != null && (object = (zzd)((Reference)object).get()) != null) {
            return object;
        }
        try {
            object = fragmentActivity.getSupportFragmentManager();
        }
        catch (ClassCastException classCastException) {
            weakReference = new WeakReference<Object>("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", (Throwable)classCastException);
            throw weakReference;
        }
        object = ((FragmentManager)object).E((String)((Object)weakReference));
        object = (zzd)object;
        if (object == null || (bl2 = ((Fragment)object).isRemoving())) {
            object = new zzd();
            Object object2 = fragmentActivity.getSupportFragmentManager();
            object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
            boolean bl3 = true;
            ((a)object2).h(0, (Fragment)object, (String)((Object)weakReference), (int)(bl3 ? 1 : 0));
            ((a)object2).o(bl3, bl3);
        }
        weakReference = new WeakReference<Object>(object);
        weakHashMap.put(fragmentActivity, weakReference);
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

