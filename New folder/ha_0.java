/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior$DragCallback;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ha
 */
public final class ha_0
extends AppBarLayout$Behavior$DragCallback {
    public final boolean canDrag(AppBarLayout appBarLayout) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        return false;
    }
}

