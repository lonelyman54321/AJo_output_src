/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.StaticLayout$Builder
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Window$Callback
 */
import android.text.StaticLayout;
import android.view.ActionMode;
import android.view.Window;

public final class cc3 {
    public static /* bridge */ /* synthetic */ ActionMode a(Window.Callback callback2, ActionMode.Callback callback3, int n3) {
        return callback2.onWindowStartingActionMode(callback3, n3);
    }

    public static /* bridge */ /* synthetic */ void b(StaticLayout.Builder builder, float f5, float f6) {
        builder.setLineSpacing(f5, f6);
    }
}

