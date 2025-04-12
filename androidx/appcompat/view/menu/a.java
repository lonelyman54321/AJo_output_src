/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.i;

public abstract class a
implements h {
    public Context a;
    public Context b;
    public d c;
    public LayoutInflater d;
    public h$a e;
    public int f;
    public int g;
    public i h;
    public int i;

    public final boolean collapseItemActionView(d d2, f f5) {
        return false;
    }

    public final boolean expandItemActionView(d d2, f f5) {
        return false;
    }

    public final int getId() {
        return this.i;
    }

    public final void setCallback(h$a h$a) {
        this.e = h$a;
    }
}

