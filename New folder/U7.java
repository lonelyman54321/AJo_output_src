/*
 * Decompiled with CFR 0.152.
 */
import androidx.drawerlayout.widget.DrawerLayout;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class U7
implements Runnable {
    public final /* synthetic */ AjioHomeActivity a;

    public /* synthetic */ U7(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final void run() {
        boolean bl2;
        int n3;
        boolean bl3;
        Object object = AjioHomeActivity.Companion;
        AjioHomeActivity ajioHomeActivity = this.a;
        Intrinsics.checkNotNullParameter(ajioHomeActivity, "this$0");
        object = ajioHomeActivity.Y;
        if (object != null && (bl3 = ((DrawerLayout)((Object)object)).isDrawerOpen(n3 = 0x800003)) == (bl2 = true) && (object = ajioHomeActivity.Y) != null) {
            ((DrawerLayout)((Object)object)).closeDrawer(n3);
        }
    }
}

