/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate;
import com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate;

public final class MaterialBackOrchestrator {
    private final MaterialBackOrchestrator$BackCallbackDelegate backCallbackDelegate;
    private final MaterialBackHandler backHandler;
    private final View view;

    public MaterialBackOrchestrator(View view) {
        Object object = view;
        object = (MaterialBackHandler)view;
        this((MaterialBackHandler)object, view);
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        MaterialBackOrchestrator$BackCallbackDelegate materialBackOrchestrator$BackCallbackDelegate;
        this.backCallbackDelegate = materialBackOrchestrator$BackCallbackDelegate = MaterialBackOrchestrator.createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    private static MaterialBackOrchestrator$BackCallbackDelegate createBackCallbackDelegate() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            MaterialBackOrchestrator$Api34BackCallbackDelegate materialBackOrchestrator$Api34BackCallbackDelegate = new MaterialBackOrchestrator$Api34BackCallbackDelegate(null);
            return materialBackOrchestrator$Api34BackCallbackDelegate;
        }
        n4 = 33;
        if (n3 >= n4) {
            MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate = new MaterialBackOrchestrator$Api33BackCallbackDelegate(null);
            return materialBackOrchestrator$Api33BackCallbackDelegate;
        }
        return null;
    }

    private void startListeningForBackCallbacks(boolean bl2) {
        MaterialBackOrchestrator$BackCallbackDelegate materialBackOrchestrator$BackCallbackDelegate = this.backCallbackDelegate;
        if (materialBackOrchestrator$BackCallbackDelegate != null) {
            MaterialBackHandler materialBackHandler = this.backHandler;
            View view = this.view;
            materialBackOrchestrator$BackCallbackDelegate.startListeningForBackCallbacks(materialBackHandler, view, bl2);
        }
    }

    public boolean shouldListenForBackCallbacks() {
        boolean bl2;
        MaterialBackOrchestrator$BackCallbackDelegate materialBackOrchestrator$BackCallbackDelegate = this.backCallbackDelegate;
        if (materialBackOrchestrator$BackCallbackDelegate != null) {
            bl2 = true;
        } else {
            bl2 = false;
            materialBackOrchestrator$BackCallbackDelegate = null;
        }
        return bl2;
    }

    public void startListeningForBackCallbacks() {
        this.startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        this.startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        MaterialBackOrchestrator$BackCallbackDelegate materialBackOrchestrator$BackCallbackDelegate = this.backCallbackDelegate;
        if (materialBackOrchestrator$BackCallbackDelegate != null) {
            View view = this.view;
            materialBackOrchestrator$BackCallbackDelegate.stopListeningForBackCallbacks(view);
        }
    }
}

