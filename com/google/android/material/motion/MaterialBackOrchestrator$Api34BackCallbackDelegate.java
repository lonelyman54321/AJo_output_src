/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
package com.google.android.material.motion;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$1;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1;

class MaterialBackOrchestrator$Api34BackCallbackDelegate
extends MaterialBackOrchestrator$Api33BackCallbackDelegate {
    private MaterialBackOrchestrator$Api34BackCallbackDelegate() {
        super(null);
    }

    public /* synthetic */ MaterialBackOrchestrator$Api34BackCallbackDelegate(MaterialBackOrchestrator$1 materialBackOrchestrator$1) {
        this();
    }

    public OnBackInvokedCallback createOnBackInvokedCallback(MaterialBackHandler materialBackHandler) {
        MaterialBackOrchestrator$Api34BackCallbackDelegate$1 materialBackOrchestrator$Api34BackCallbackDelegate$1 = new MaterialBackOrchestrator$Api34BackCallbackDelegate$1(this, materialBackHandler);
        return materialBackOrchestrator$Api34BackCallbackDelegate$1;
    }
}

