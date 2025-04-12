/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  androidx.window.sidecar.SidecarDisplayFeature
 */
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x43
extends Lambda
implements Function1 {
    public static final x43 c;

    static {
        x43 x432;
        c = x432 = new Lambda(1);
    }

    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature) {
        int n3;
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "$this$require");
        Rect rect = sidecarDisplayFeature.getRect();
        int n4 = rect.width();
        if (n4 == 0 && (n3 = (sidecarDisplayFeature = sidecarDisplayFeature.getRect()).height()) == 0) {
            n3 = 0;
            sidecarDisplayFeature = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }
}

