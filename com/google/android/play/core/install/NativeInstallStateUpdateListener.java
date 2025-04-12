/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.install;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;

final class NativeInstallStateUpdateListener
implements InstallStateUpdatedListener {
    public native void onStateUpdate(InstallState var1);
}

