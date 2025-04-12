/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.motion;

import android.view.View;
import com.google.android.material.motion.MaterialBackHandler;

interface MaterialBackOrchestrator$BackCallbackDelegate {
    public void startListeningForBackCallbacks(MaterialBackHandler var1, View var2, boolean var3);

    public void stopListeningForBackCallbacks(View var1);
}

