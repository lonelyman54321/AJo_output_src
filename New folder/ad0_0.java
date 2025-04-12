/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 */
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AD0
 */
public final class ad0_0
implements ActionMode.Callback {
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu2) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu2, "menu");
        return false;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu2, "menu");
        return false;
    }
}

