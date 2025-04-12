/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer
implements wh1_0 {
    public final Object a(Context object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 < n4) {
            object = new Object();
        } else {
            object = object.getApplicationContext();
            Choreographer choreographer = Choreographer.getInstance();
            hB2 hB22 = new hB2(this, (Context)object);
            choreographer.postFrameCallback((Choreographer.FrameCallback)hB22);
            object = new Object();
        }
        return object;
    }

    public final List dependencies() {
        return Collections.emptyList();
    }
}

