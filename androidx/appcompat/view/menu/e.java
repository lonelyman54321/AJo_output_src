/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.Window
 */
package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.f;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.b$a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;

public final class e
implements DialogInterface.OnKeyListener,
DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
h$a {
    public d a;
    public f b;
    public b c;

    public final boolean a(d d2) {
        return false;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.c;
        b$a b$a = object.g;
        if (b$a == null) {
            object.g = b$a = new b$a((b)object);
        }
        object = object.g.c(n3);
        this.a.performItemAction((MenuItem)object, 0);
    }

    public final void onCloseMenu(d object, boolean bl2) {
        d d2;
        if ((bl2 || object == (d2 = this.a)) && (object = this.b) != null) {
            ((on)object).dismiss();
        }
    }

    public final void onDismiss(DialogInterface object) {
        object = this.c;
        d d2 = this.a;
        ((b)object).onCloseMenu(d2, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int n3, KeyEvent keyEvent) {
        int n4 = 82;
        d d2 = this.a;
        if (n3 == n4 || n3 == (n4 = 4)) {
            n4 = keyEvent.getAction();
            int n7 = 1;
            if (n4 == 0 && (n4 = keyEvent.getRepeatCount()) == 0) {
                dialogInterface = this.b.getWindow();
                if (dialogInterface != null && (dialogInterface = dialogInterface.getDecorView()) != null && (dialogInterface = dialogInterface.getKeyDispatcherState()) != null) {
                    dialogInterface.startTracking(keyEvent, (Object)this);
                    return n7 != 0;
                }
            } else {
                Window window;
                n4 = keyEvent.getAction();
                if (n4 == n7 && (n4 = (int)(keyEvent.isCanceled() ? 1 : 0)) == 0 && (window = this.b.getWindow()) != null && (window = window.getDecorView()) != null && (window = window.getKeyDispatcherState()) != null && (n4 = window.isTracking(keyEvent)) != 0) {
                    d2.close(n7 != 0);
                    dialogInterface.dismiss();
                    return n7 != 0;
                }
            }
        }
        return d2.performShortcut(n3, keyEvent, 0);
    }
}

