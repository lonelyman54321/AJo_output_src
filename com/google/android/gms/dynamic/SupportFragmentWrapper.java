/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.IFragmentWrapper$Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class SupportFragmentWrapper
extends IFragmentWrapper$Stub {
    private final Fragment zza;

    private SupportFragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    public static SupportFragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            SupportFragmentWrapper supportFragmentWrapper = new SupportFragmentWrapper(fragment);
            return supportFragmentWrapper;
        }
        return null;
    }

    public final boolean zzA() {
        return this.zza.isVisible();
    }

    public final int zzb() {
        return this.zza.getId();
    }

    public final int zzc() {
        return this.zza.getTargetRequestCode();
    }

    public final Bundle zzd() {
        return this.zza.getArguments();
    }

    public final IFragmentWrapper zze() {
        return SupportFragmentWrapper.wrap(this.zza.getParentFragment());
    }

    public final IFragmentWrapper zzf() {
        return SupportFragmentWrapper.wrap(this.zza.getTargetFragment());
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza.getActivity());
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    public final IObjectWrapper zzi() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    public final String zzj() {
        return this.zza.getTag();
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(iObjectWrapper);
        this.zza.registerForContextMenu((View)iObjectWrapper);
    }

    public final void zzl(boolean bl2) {
        this.zza.setHasOptionsMenu(bl2);
    }

    public final void zzm(boolean bl2) {
        this.zza.setMenuVisibility(bl2);
    }

    public final void zzn(boolean bl2) {
        this.zza.setRetainInstance(bl2);
    }

    public final void zzo(boolean bl2) {
        this.zza.setUserVisibleHint(bl2);
    }

    public final void zzp(Intent intent) {
        this.zza.startActivity(intent);
    }

    public final void zzq(Intent intent, int n3) {
        this.zza.startActivityForResult(intent, n3);
    }

    public final void zzr(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(iObjectWrapper);
        this.zza.unregisterForContextMenu((View)iObjectWrapper);
    }

    public final boolean zzs() {
        return this.zza.getRetainInstance();
    }

    public final boolean zzt() {
        return this.zza.getUserVisibleHint();
    }

    public final boolean zzu() {
        return this.zza.isAdded();
    }

    public final boolean zzv() {
        return this.zza.isDetached();
    }

    public final boolean zzw() {
        return this.zza.isHidden();
    }

    public final boolean zzx() {
        return this.zza.isInLayout();
    }

    public final boolean zzy() {
        return this.zza.isRemoving();
    }

    public final boolean zzz() {
        return this.zza.isResumed();
    }
}

