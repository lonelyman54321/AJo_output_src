/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

public final class z23
implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ B23 a;

    public /* synthetic */ z23(B23 b23) {
        this.a = b23;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        B23 b23 = this.a;
        Intrinsics.checkNotNullParameter(b23, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        b23.onOptionsItemSelected(menuItem);
        return true;
    }
}

