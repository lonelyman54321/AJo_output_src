/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.SearchEvent
 *  android.view.View
 *  android.view.Window$Callback
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bG3
 */
public final class bg3_2
implements Window.Callback {
    public static final bG3$a Companion;
    public final Window.Callback a;
    public final ArrayList b;

    static {
        bG3$a bG3$a;
        Companion = bG3$a = new Object();
    }

    public bg3_2(Window.Callback object) {
        Intrinsics.checkNotNullParameter(object, "delegate");
        this.a = object;
        this.b = object;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
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

    public final void onContentChanged() {
        ArrayList arrayList = this.b;
        g81_0 g81_02 = new g81_0(1);
        cx_2.w(arrayList, g81_02);
        this.a.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int n3, Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "p1");
        return this.a.onCreatePanelMenu(n3, menu2);
    }

    public final View onCreatePanelView(int n3) {
        return this.a.onCreatePanelView(n3);
    }

    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "p1");
        return this.a.onMenuItemSelected(n3, menuItem);
    }

    public final boolean onMenuOpened(int n3, Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "p1");
        return this.a.onMenuOpened(n3, menu2);
    }

    public final void onPanelClosed(int n3, Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "p1");
        this.a.onPanelClosed(n3, menu2);
    }

    public final boolean onPreparePanel(int n3, View view, Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "p2");
        return this.a.onPreparePanel(n3, view, menu2);
    }

    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return bc3_0.c(this.a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        this.a.onWindowFocusChanged(bl2);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2) {
        return this.a.onWindowStartingActionMode(callback2);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int n3) {
        return cc3.a(this.a, callback2, n3);
    }
}

