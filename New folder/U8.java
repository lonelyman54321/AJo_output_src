/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;

public final class U8
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ U8(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.a;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        object = q9_02.G;
        if (object != null) {
            ((TabLayout)((Object)object)).setSelectedTabIndicator(null);
        }
        if ((object = q9_02.G) != null) {
            q9_02 = null;
            object.setScrollX(0);
        }
    }
}

