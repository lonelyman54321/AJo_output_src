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

public final class sz2
implements ActionMode.Callback {
    public final Bj3 a;

    public sz2(Bj3 bj3) {
        this.a = bj3;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.c(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu2) {
        this.a.d(actionMode, menu2);
        return true;
    }

    public final void onDestroyActionMode(ActionMode object) {
        object = this.a.a;
        if (object != null) {
            object.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        return this.a.e(actionMode, menu2);
    }
}

