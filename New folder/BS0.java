/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback2
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public final class BS0
extends ActionMode.Callback2 {
    public final Bj3 a;

    public BS0(Bj3 bj3) {
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

    public final void onGetContentRect(ActionMode object, View view, Rect rect) {
        object = this.a.b;
        if (rect != null) {
            float f5 = object.a;
            int n3 = (int)f5;
            float f6 = object.b;
            int n4 = (int)f6;
            float f7 = object.c;
            int n7 = (int)f7;
            float f8 = object.d;
            int n8 = (int)f8;
            rect.set(n3, n4, n7, n8);
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        return this.a.e(actionMode, menu2);
    }
}

