/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zza;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    protected final LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    public static LifecycleFragment getFragment(Activity activity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity(activity);
        return LifecycleCallback.getFragment(lifecycleActivity);
    }

    public static LifecycleFragment getFragment(ContextWrapper object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public static LifecycleFragment getFragment(LifecycleActivity object) {
        boolean bl2 = ((LifecycleActivity)object).zzd();
        if (bl2) {
            return zzd.zza(((LifecycleActivity)object).zzb());
        }
        bl2 = ((LifecycleActivity)object).zzc();
        if (bl2) {
            return zza.zza(((LifecycleActivity)object).zza());
        }
        object = new IllegalArgumentException("Can't get fragment for unexpected activity.");
        throw object;
    }

    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    public Activity getActivity() {
        Activity activity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(activity);
        return activity;
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}

