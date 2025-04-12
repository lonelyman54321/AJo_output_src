/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$f;
import kotlin.jvm.internal.Intrinsics;

public final class q9$c
extends DrawerLayout$f {
    public final /* synthetic */ q9_0 a;

    public q9$c(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onDrawerClosed(View object) {
        String string2 = "drawerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onDrawerClosed((View)object);
        object = this.a.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            object = null;
        }
        object.hideToolbarLayout();
    }
}

