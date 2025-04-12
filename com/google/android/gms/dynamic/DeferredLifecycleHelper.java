/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.dynamic.zaa;
import com.google.android.gms.dynamic.zab;
import com.google.android.gms.dynamic.zac;
import com.google.android.gms.dynamic.zad;
import com.google.android.gms.dynamic.zae;
import com.google.android.gms.dynamic.zaf;
import com.google.android.gms.dynamic.zag;
import com.google.android.gms.dynamic.zah;
import java.util.AbstractCollection;
import java.util.LinkedList;

public abstract class DeferredLifecycleHelper {
    private LifecycleDelegate zaa;
    private Bundle zab;
    private LinkedList zac;
    private final OnDelegateCreatedListener zad;

    public DeferredLifecycleHelper() {
        zaa zaa2 = new zaa(this);
        this.zad = zaa2;
    }

    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int n3 = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String string2 = com.google.android.gms.common.internal.zac.zac(context, n3);
        String string3 = com.google.android.gms.common.internal.zac.zab(context, n3);
        Context context2 = frameLayout.getContext();
        LinearLayout linearLayout = new LinearLayout(context2);
        int n4 = 1;
        linearLayout.setOrientation(n4);
        int n7 = -2;
        context2 = new FrameLayout.LayoutParams(n7, n7);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)context2);
        frameLayout.addView((View)linearLayout);
        frameLayout = frameLayout.getContext();
        context2 = new TextView((Context)frameLayout);
        frameLayout = new FrameLayout.LayoutParams(n7, n7);
        context2.setLayoutParams((ViewGroup.LayoutParams)frameLayout);
        context2.setText((CharSequence)string2);
        linearLayout.addView((View)context2);
        frameLayout = googleApiAvailability.getErrorResolutionIntent(context, n3, null);
        if (frameLayout != null) {
            googleApiAvailability = new Button(context);
            n3 = 16908313;
            googleApiAvailability.setId(n3);
            Object object = new FrameLayout.LayoutParams(n7, n7);
            googleApiAvailability.setLayoutParams((ViewGroup.LayoutParams)object);
            googleApiAvailability.setText(string3);
            linearLayout.addView((View)googleApiAvailability);
            object = new zae(context, (Intent)frameLayout);
            googleApiAvailability.setOnClickListener((View.OnClickListener)object);
        }
    }

    public static /* bridge */ /* synthetic */ LifecycleDelegate zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        return deferredLifecycleHelper.zaa;
    }

    public static /* bridge */ /* synthetic */ LinkedList zab(DeferredLifecycleHelper deferredLifecycleHelper) {
        return deferredLifecycleHelper.zac;
    }

    public static /* bridge */ /* synthetic */ void zac(DeferredLifecycleHelper deferredLifecycleHelper, LifecycleDelegate lifecycleDelegate) {
        deferredLifecycleHelper.zaa = lifecycleDelegate;
    }

    public static /* bridge */ /* synthetic */ void zad(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        deferredLifecycleHelper.zab = null;
    }

    private final void zae(int n3) {
        Object object;
        int n4;
        while ((n4 = ((AbstractCollection)(object = this.zac)).isEmpty()) == 0 && (n4 = (object = (zah)this.zac.getLast()).zaa()) >= n3) {
            object = this.zac;
            ((LinkedList)object).removeLast();
        }
    }

    private final void zaf(Bundle object, zah zah2) {
        Object object2 = this.zaa;
        if (object2 != null) {
            zah2.zab((LifecycleDelegate)object2);
            return;
        }
        object2 = this.zac;
        if (object2 == null) {
            this.zac = object2 = new Object();
        }
        object2 = this.zac;
        ((LinkedList)object2).add(zah2);
        if (object != null) {
            zah2 = this.zab;
            if (zah2 == null) {
                this.zab = object = (Bundle)object.clone();
            } else {
                zah2.putAll((Bundle)object);
            }
        }
        object = this.zad;
        this.createDelegate((OnDelegateCreatedListener)object);
    }

    public abstract void createDelegate(OnDelegateCreatedListener var1);

    public LifecycleDelegate getDelegate() {
        return this.zaa;
    }

    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        DeferredLifecycleHelper.showGooglePlayUnavailableMessage(frameLayout);
    }

    public void onCreate(Bundle bundle) {
        zac zac2 = new zac(this, bundle);
        this.zaf(bundle, zac2);
    }

    public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        zad zad2;
        Object object2 = object.getContext();
        FrameLayout frameLayout = new FrameLayout(object2);
        object2 = zad2;
        zad2 = new zad(this, frameLayout, (LayoutInflater)object, viewGroup, bundle);
        this.zaf(bundle, zad2);
        object = this.zaa;
        if (object == null) {
            this.handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroy();
            return;
        }
        this.zae(1);
    }

    public void onDestroyView() {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroyView();
            return;
        }
        this.zae(2);
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zab zab2 = new zab(this, activity, bundle, bundle2);
        this.zaf(bundle2, zab2);
    }

    public void onLowMemory() {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onLowMemory();
        }
    }

    public void onPause() {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onPause();
            return;
        }
        this.zae(5);
    }

    public void onResume() {
        zag zag2 = new zag(this);
        this.zaf(null, zag2);
    }

    public void onSaveInstanceState(Bundle bundle) {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onSaveInstanceState(bundle);
            return;
        }
        lifecycleDelegate = this.zab;
        if (lifecycleDelegate != null) {
            bundle.putAll((Bundle)lifecycleDelegate);
        }
    }

    public void onStart() {
        zaf zaf2 = new zaf(this);
        this.zaf(null, zaf2);
    }

    public void onStop() {
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onStop();
            return;
        }
        this.zae(4);
    }
}

