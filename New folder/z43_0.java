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

/*
 * Renamed from z43
 */
public final class z43_0
extends Lambda
implements Function1 {
    public static final z43_0 c;

    static {
        z43_0 z43_02;
        c = z43_02 = new Lambda(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature) {
        int n3;
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "$this$require");
        Rect rect = sidecarDisplayFeature.getRect();
        int n4 = rect.left;
        if (n4 != 0) {
            sidecarDisplayFeature = sidecarDisplayFeature.getRect();
            n3 = sidecarDisplayFeature.top;
            if (n3 != 0) {
                n3 = 0;
                return n3 != 0;
            }
        }
        n3 = 1;
        return n3 != 0;
    }
}

