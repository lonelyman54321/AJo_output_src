/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.SearchEvent
 *  android.view.Window$Callback
 */
import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

public final class ZF3$a {
    public static boolean a(Window.Callback callback2, SearchEvent searchEvent) {
        return callback2.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback2, ActionMode.Callback callback3, int n3) {
        return callback2.onWindowStartingActionMode(callback3, n3);
    }
}

