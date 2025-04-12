/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ho0
 */
public final class ho0_0 {
    public static final View a(fo0 object) {
        LP1$c lP1$c = object.e();
        boolean bl2 = lP1$c.m;
        if (bl2) {
            object = aq1_0.a(go0.f((fo0)object));
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.View");
            return (View)object;
        }
        bh1_1.c("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }
}

