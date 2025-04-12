/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.View
 *  android.view.Window$Callback
 */
package androidx.appcompat.app;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$b;
import androidx.appcompat.app.AppCompatDelegateImpl$m;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.app.ToolbarActionBar$d;
import androidx.appcompat.widget.d;
import java.util.List;

public final class AppCompatDelegateImpl$h
extends ZF3 {
    public AppCompatDelegateImpl$b b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ AppCompatDelegateImpl f;

    public AppCompatDelegateImpl$h(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback2) {
        this.f = appCompatDelegateImpl;
        super(callback2);
    }

    public final void a(Window.Callback callback2) {
        boolean bl2 = true;
        try {
            this.c = bl2;
            callback2.onContentChanged();
            return;
        }
        finally {
            this.c = false;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        boolean bl3 = this.d;
        Window.Callback callback2 = this.a;
        if (bl3) {
            return callback2.dispatchKeyEvent(keyEvent);
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.f;
        bl3 = appCompatDelegateImpl.I(keyEvent);
        if (!bl3 && !(bl2 = callback2.dispatchKeyEvent(keyEvent))) {
            bl2 = false;
            keyEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent object) {
        boolean bl2;
        block5: {
            block7: {
                int n3;
                ActionBar actionBar;
                AppCompatDelegateImpl appCompatDelegateImpl;
                Object object2;
                block6: {
                    object2 = this.a;
                    int n4 = object2.dispatchKeyShortcutEvent(object);
                    bl2 = true;
                    if (n4 != 0) break block5;
                    n4 = object.getKeyCode();
                    appCompatDelegateImpl = this.f;
                    appCompatDelegateImpl.Q();
                    actionBar = appCompatDelegateImpl.o;
                    if (actionBar != null && (n4 = (int)(actionBar.j(n4, (KeyEvent)object) ? 1 : 0)) != 0) break block5;
                    object2 = appCompatDelegateImpl.N;
                    if (object2 == null || (n4 = (int)(appCompatDelegateImpl.V((AppCompatDelegateImpl$m)object2, n3 = object.getKeyCode(), (KeyEvent)object) ? 1 : 0)) == 0) break block6;
                    object = appCompatDelegateImpl.N;
                    if (object != null) {
                        object.l = bl2;
                    }
                    break block5;
                }
                object2 = appCompatDelegateImpl.N;
                n3 = 0;
                actionBar = null;
                if (object2 != null) break block7;
                object2 = appCompatDelegateImpl.P(0);
                appCompatDelegateImpl.W((AppCompatDelegateImpl$m)object2, (KeyEvent)object);
                int n7 = object.getKeyCode();
                boolean bl3 = appCompatDelegateImpl.V((AppCompatDelegateImpl$m)object2, n7, (KeyEvent)object);
                object2.k = false;
                if (bl3) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final void onContentChanged() {
        boolean bl2 = this.c;
        if (bl2) {
            Window.Callback callback2 = this.a;
            callback2.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int n3, Menu menu2) {
        boolean bl2;
        if (n3 == 0 && !(bl2 = menu2 instanceof androidx.appcompat.view.menu.d)) {
            return false;
        }
        return this.a.onCreatePanelMenu(n3, menu2);
    }

    public final View onCreatePanelView(int n3) {
        AppCompatDelegateImpl$b appCompatDelegateImpl$b = this.b;
        if (appCompatDelegateImpl$b != null) {
            View view;
            appCompatDelegateImpl$b = (ToolbarActionBar$d)appCompatDelegateImpl$b;
            if (n3 == 0) {
                appCompatDelegateImpl$b = ((ToolbarActionBar$d)appCompatDelegateImpl$b).a.a.a.getContext();
                view = new View((Context)appCompatDelegateImpl$b);
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(n3);
    }

    public final boolean onMenuOpened(int n3, Menu menu2) {
        super.onMenuOpened(n3, menu2);
        int n4 = 108;
        boolean bl2 = true;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f;
        if (n3 == n4) {
            appCompatDelegateImpl.Q();
            ActionBar actionBar = appCompatDelegateImpl.o;
            if (actionBar != null) {
                actionBar.c(bl2);
            }
        } else {
            appCompatDelegateImpl.getClass();
        }
        return bl2;
    }

    public final void onPanelClosed(int n3, Menu object) {
        int n4 = this.e;
        if (n4 != 0) {
            this.a.onPanelClosed(n3, (Menu)object);
            return;
        }
        super.onPanelClosed(n3, (Menu)object);
        object = this.f;
        n4 = 108;
        if (n3 == n4) {
            ((AppCompatDelegateImpl)object).Q();
            ActionBar actionBar = ((AppCompatDelegateImpl)object).o;
            if (actionBar != null) {
                actionBar.c(false);
            }
        } else if (n3 == 0) {
            AppCompatDelegateImpl$m appCompatDelegateImpl$m = ((AppCompatDelegateImpl)object).P(n3);
            n4 = (int)(appCompatDelegateImpl$m.m ? 1 : 0);
            if (n4 != 0) {
                ((AppCompatDelegateImpl)object).G(appCompatDelegateImpl$m, false);
            }
        } else {
            object.getClass();
        }
    }

    public final boolean onPreparePanel(int n3, View view, Menu menu2) {
        Object object;
        Menu menu3;
        boolean bl2 = menu2 instanceof androidx.appcompat.view.menu.d;
        if (bl2) {
            menu3 = menu2;
            menu3 = (androidx.appcompat.view.menu.d)menu2;
        } else {
            bl2 = false;
            menu3 = null;
        }
        if (n3 == 0 && menu3 == null) {
            return false;
        }
        boolean bl3 = true;
        if (menu3 != null) {
            menu3.setOverrideVisibleItems(bl3);
        }
        if ((object = this.b) != null) {
            object = (ToolbarActionBar$d)object;
            if (n3 == 0) {
                object = ((ToolbarActionBar$d)object).a;
                boolean bl4 = ((ToolbarActionBar)object).d;
                if (!bl4) {
                    d d2 = ((ToolbarActionBar)object).a;
                    d2.m = bl3;
                    ((ToolbarActionBar)object).d = bl3;
                }
            }
        }
        Window.Callback callback2 = this.a;
        n3 = (int)(callback2.onPreparePanel(n3, view, menu2) ? 1 : 0);
        if (menu3 != null) {
            menu3.setOverrideVisibleItems(false);
        }
        return n3 != 0;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu2, int n3) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f;
        androidx.appcompat.view.menu.d d2 = appCompatDelegateImpl.P((int)0).h;
        if (d2 != null) {
            super.onProvideKeyboardShortcuts(list, d2, n3);
        } else {
            super.onProvideKeyboardShortcuts(list, menu2, n3);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        tg3_2 tg3_22 = null;
        if (n3 >= n4) {
            return null;
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.f;
        n4 = (int)(appCompatDelegateImpl.z ? 1 : 0);
        if (n4 != 0) {
            Context context = appCompatDelegateImpl.k;
            tg3$a tg3$a = new tg3$a(context, (ActionMode.Callback)object);
            if ((object = appCompatDelegateImpl.A(tg3$a)) != null) {
                tg3_22 = tg3$a.e((P2)object);
            }
            return tg3_22;
        }
        return this.a.onWindowStartingActionMode(object);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback object, int n3) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f;
        boolean bl2 = appCompatDelegateImpl.z;
        if (bl2 && n3 == 0) {
            Context context = appCompatDelegateImpl.k;
            tg3$a tg3$a = new tg3$a(context, (ActionMode.Callback)object);
            object = (object = appCompatDelegateImpl.A(tg3$a)) != null ? tg3$a.e((P2)object) : null;
            return object;
        }
        return ZF3$a.b(this.a, object, n3);
    }
}

