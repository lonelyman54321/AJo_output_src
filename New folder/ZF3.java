/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.SearchEvent
 *  android.view.Window$Callback
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class ZF3
implements Window.Callback {
    public final Window.Callback a;

    public ZF3(Window.Callback object) {
        if (object != null) {
            this.a = object;
            return;
        }
        super("Window callback may not be null");
        throw object;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        return this.a.onMenuItemSelected(n3, menuItem);
    }

    public boolean onMenuOpened(int n3, Menu menu2) {
        return this.a.onMenuOpened(n3, menu2);
    }

    public void onPanelClosed(int n3, Menu menu2) {
        this.a.onPanelClosed(n3, menu2);
    }

    public final void onPointerCaptureChanged(boolean bl2) {
        ZF3$c.a(this.a, bl2);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu2, int n3) {
        ZF3$b.a(this.a, list, menu2, n3);
    }

    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return ZF3$a.a(this.a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        this.a.onWindowFocusChanged(bl2);
    }
}

