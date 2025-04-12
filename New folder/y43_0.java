/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.window.sidecar.SidecarDisplayFeature
 */
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from y43
 */
public final class y43_0
extends Lambda
implements Function1 {
    public static final y43_0 c;

    static {
        y43_0 y43_02;
        c = y43_02 = new Lambda(1);
    }

    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature) {
        int n3;
        String string2 = "$this$require";
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature, string2);
        int n4 = sidecarDisplayFeature.getType();
        int n7 = 1;
        if (n4 == n7 && (n4 = (string2 = sidecarDisplayFeature.getRect()).width()) != 0 && (n3 = (sidecarDisplayFeature = sidecarDisplayFeature.getRect()).height()) != 0) {
            n7 = 0;
        }
        return n7 != 0;
    }
}

