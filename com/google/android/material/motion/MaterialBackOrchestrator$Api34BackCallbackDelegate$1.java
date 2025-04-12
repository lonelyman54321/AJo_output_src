/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 *  android.window.OnBackAnimationCallback
 */
package com.google.android.material.motion;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate;

class MaterialBackOrchestrator$Api34BackCallbackDelegate$1
implements OnBackAnimationCallback {
    final /* synthetic */ MaterialBackOrchestrator$Api34BackCallbackDelegate this$0;
    final /* synthetic */ MaterialBackHandler val$backHandler;

    public MaterialBackOrchestrator$Api34BackCallbackDelegate$1(MaterialBackOrchestrator$Api34BackCallbackDelegate api34BackCallbackDelegate, MaterialBackHandler materialBackHandler) {
        this.this$0 = api34BackCallbackDelegate;
        this.val$backHandler = materialBackHandler;
    }

    public void onBackCancelled() {
        MaterialBackOrchestrator$Api34BackCallbackDelegate materialBackOrchestrator$Api34BackCallbackDelegate = this.this$0;
        boolean bl2 = materialBackOrchestrator$Api34BackCallbackDelegate.isListeningForBackCallbacks();
        if (!bl2) {
            return;
        }
        this.val$backHandler.cancelBackProgress();
    }

    public void onBackInvoked() {
        this.val$backHandler.handleBackInvoked();
    }

    public void onBackProgressed(BackEvent backEvent) {
        Object object = this.this$0;
        boolean bl2 = ((MaterialBackOrchestrator$Api33BackCallbackDelegate)object).isListeningForBackCallbacks();
        if (!bl2) {
            return;
        }
        object = this.val$backHandler;
        uu_0 uu_02 = new uu_0(backEvent);
        object.updateBackProgress(uu_02);
    }

    public void onBackStarted(BackEvent backEvent) {
        Object object = this.this$0;
        boolean bl2 = ((MaterialBackOrchestrator$Api33BackCallbackDelegate)object).isListeningForBackCallbacks();
        if (!bl2) {
            return;
        }
        object = this.val$backHandler;
        uu_0 uu_02 = new uu_0(backEvent);
        object.startBackProgress(uu_02);
    }
}

