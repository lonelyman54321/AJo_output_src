/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
package com.google.android.material.motion;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$1;
import com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate;
import java.util.Objects;

class MaterialBackOrchestrator$Api33BackCallbackDelegate
implements MaterialBackOrchestrator$BackCallbackDelegate {
    private OnBackInvokedCallback onBackInvokedCallback;

    private MaterialBackOrchestrator$Api33BackCallbackDelegate() {
    }

    public /* synthetic */ MaterialBackOrchestrator$Api33BackCallbackDelegate(MaterialBackOrchestrator$1 materialBackOrchestrator$1) {
        this();
    }

    public OnBackInvokedCallback createOnBackInvokedCallback(MaterialBackHandler materialBackHandler) {
        Objects.requireNonNull(materialBackHandler);
        rh1_2 rh1_22 = new rh1_2(materialBackHandler);
        return rh1_22;
    }

    public boolean isListeningForBackCallbacks() {
        boolean bl2;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedCallback != null) {
            bl2 = true;
        } else {
            bl2 = false;
            onBackInvokedCallback = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public void startListeningForBackCallbacks(MaterialBackHandler materialBackHandler, View view, boolean bl2) {
        void var3_6;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedCallback != null) {
            return;
        }
        if ((view = ph1_2.a(view)) == null) {
            return;
        }
        materialBackHandler = this.createOnBackInvokedCallback(materialBackHandler);
        this.onBackInvokedCallback = materialBackHandler;
        if (bl2) {
            int n3 = 1000000;
        } else {
            boolean bl3 = false;
        }
        qh1_2.a((OnBackInvokedDispatcher)view, (int)var3_6, (OnBackInvokedCallback)materialBackHandler);
    }

    public void stopListeningForBackCallbacks(View view) {
        if ((view = ph1_2.a(view)) == null) {
            return;
        }
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        jn.b((OnBackInvokedDispatcher)view, onBackInvokedCallback);
        this.onBackInvokedCallback = null;
    }
}

