/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window$Callback
 */
import android.view.Menu;
import android.view.Window;
import java.util.List;

public final class ZF3$b {
    public static void a(Window.Callback callback2, List list, Menu menu2, int n3) {
        callback2.onProvideKeyboardShortcuts(list, menu2, n3);
    }
}

