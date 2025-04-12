/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.core.view.a;
import kotlin.jvm.internal.Intrinsics;

public final class aI0$b
extends a {
    public final void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(c2, "info");
        super.onInitializeAccessibilityNodeInfo(view, c2);
        c2.p(true);
    }
}

