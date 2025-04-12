/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.Window$Callback
 */
package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBar$a;
import androidx.appcompat.app.ToolbarActionBar$1;
import androidx.appcompat.app.ToolbarActionBar$a;
import androidx.appcompat.app.ToolbarActionBar$b;
import androidx.appcompat.app.ToolbarActionBar$c;
import androidx.appcompat.app.ToolbarActionBar$d;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar$f;
import androidx.appcompat.widget.d;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public final class ToolbarActionBar
extends ActionBar {
    public final d a;
    public final Window.Callback b;
    public final ToolbarActionBar$d c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final Runnable h;

    public ToolbarActionBar(Toolbar object, CharSequence charSequence, Window.Callback callback2) {
        d d2;
        Object object2 = new ArrayList();
        this.g = object2;
        this.h = object2 = new ToolbarActionBar$1(this);
        object2 = new ToolbarActionBar$a(this);
        object.getClass();
        this.a = d2 = new d((Toolbar)object, false);
        callback2.getClass();
        this.b = callback2;
        d2.l = callback2;
        ((Toolbar)object).setOnMenuItemClickListener((Toolbar$f)object2);
        d2.setWindowTitle(charSequence);
        this.c = object = new ToolbarActionBar$d(this);
    }

    public final Menu A() {
        boolean bl2 = this.e;
        d d2 = this.a;
        if (!bl2) {
            ToolbarActionBar$b toolbarActionBar$b = new ToolbarActionBar$b(this);
            ToolbarActionBar$c toolbarActionBar$c = new ToolbarActionBar$c(this);
            Toolbar toolbar = d2.a;
            toolbar.setMenuCallbacks(toolbarActionBar$b, toolbarActionBar$c);
            this.e = bl2 = true;
        }
        return d2.a.getMenu();
    }

    public final void B(int n3, int n4) {
        d d2 = this.a;
        int n7 = d2.b;
        n3 &= n4;
        n4 = ~n4 & n7;
        d2.g(n3 |= n4);
    }

    public final boolean a() {
        return this.a.a.hideOverflowMenu();
    }

    public final boolean b() {
        d d2 = this.a;
        Toolbar toolbar = d2.a;
        boolean bl2 = toolbar.hasExpandedActionView();
        if (bl2) {
            d2.collapseActionView();
            return true;
        }
        return false;
    }

    public final void c(boolean n3) {
        int n4 = this.f;
        if (n3 == n4) {
            return;
        }
        this.f = n3;
        ArrayList arrayList = this.g;
        n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            ActionBar$a actionBar$a = (ActionBar$a)arrayList.get(i3);
            actionBar$a.a();
        }
    }

    public final int d() {
        return this.a.b;
    }

    public final Context e() {
        return this.a.a.getContext();
    }

    public final void f() {
        this.a.setVisibility(8);
    }

    public final boolean g() {
        Object object = this.a;
        Object object2 = ((d)object).a;
        Runnable runnable2 = this.h;
        object2.removeCallbacks(runnable2);
        object = ((d)object).a;
        object2 = ViewCompat.a;
        object.postOnAnimation(runnable2);
        return true;
    }

    public final void h() {
    }

    public final void i() {
        Toolbar toolbar = this.a.a;
        Runnable runnable2 = this.h;
        toolbar.removeCallbacks(runnable2);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean j(int n3, KeyEvent keyEvent) {
        Menu menu2 = this.A();
        if (menu2 != null) {
            void var4_6;
            if (keyEvent != null) {
                int bl3 = keyEvent.getDeviceId();
            } else {
                int n4 = -1;
            }
            KeyCharacterMap keyCharacterMap = KeyCharacterMap.load((int)var4_6);
            boolean bl2 = keyCharacterMap.getKeyboardType();
            boolean bl3 = true;
            if (bl2 == bl3) {
                bl3 = false;
            }
            menu2.setQwertyMode(bl3);
            return menu2.performShortcut(n3, keyEvent, 0);
        }
        return false;
    }

    public final boolean k(KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getAction();
        if (n4 == (n3 = 1)) {
            this.l();
        }
        return n3 != 0;
    }

    public final boolean l() {
        return this.a.a.showOverflowMenu();
    }

    public final void m(boolean bl2) {
    }

    public final void n(boolean bl2) {
        int n3 = 4;
        this.B(n3, n3);
    }

    public final void o() {
        this.B(16, -1);
    }

    public final void p() {
        int n3 = 2;
        this.B(n3, n3);
    }

    public final void q() {
        this.B(0, 8);
    }

    public final void r() {
        this.B(0, 1);
    }

    public final void s(int n3) {
        this.a.i(n3);
    }

    public final void t(String string2) {
        this.a.p(string2);
    }

    public final void u(int n3) {
        this.a.n(n3);
    }

    public final void v(Drawable drawable2) {
        this.a.q(drawable2);
    }

    public final void w(boolean bl2) {
    }

    public final void x(String string2) {
        this.a.setTitle(string2);
    }

    public final void y(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }
}

