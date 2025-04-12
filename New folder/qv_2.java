/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.app.a;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qv
 */
public final class qv_2
extends a {
    public final /* synthetic */ BaseActivity j;

    public qv_2(BaseActivity baseActivity, AjioCustomToolbar ajioCustomToolbar, DrawerLayout drawerLayout, int n3, int n4) {
        this.j = baseActivity;
        super(baseActivity, drawerLayout, ajioCustomToolbar, n3, n4);
    }

    public final void onDrawerClosed(View view) {
        Intrinsics.checkNotNullParameter(view, "drawerView");
        super.onDrawerClosed(view);
        this.j.z0 = false;
    }

    public final void onDrawerOpened(View view) {
        Intrinsics.checkNotNullParameter(view, "drawerView");
        super.onDrawerOpened(view);
        this.j.z0 = true;
    }
}

