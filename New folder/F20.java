/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.security.NetworkSecurityPolicy
 *  android.view.Surface
 */
import android.graphics.Canvas;
import android.security.NetworkSecurityPolicy;
import android.view.Surface;

public final class F20 {
    public static /* bridge */ /* synthetic */ Canvas a(Surface surface) {
        return surface.lockHardwareCanvas();
    }

    public static /* bridge */ /* synthetic */ boolean b(NetworkSecurityPolicy networkSecurityPolicy) {
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }
}

