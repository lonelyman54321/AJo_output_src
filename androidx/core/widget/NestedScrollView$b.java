/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.widget;

import android.view.View;

public final class NestedScrollView$b {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(View view, float f5) {
        try {
            view.setFrameContentVelocity(f5);
            return;
        }
        catch (LinkageError linkageError) {
            return;
        }
    }
}

