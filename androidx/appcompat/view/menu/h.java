/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;

public interface h {
    public boolean collapseItemActionView(d var1, f var2);

    public boolean expandItemActionView(d var1, f var2);

    public boolean flagActionItems();

    public int getId();

    public void initForMenu(Context var1, d var2);

    public void onCloseMenu(d var1, boolean var2);

    public void onRestoreInstanceState(Parcelable var1);

    public Parcelable onSaveInstanceState();

    public boolean onSubMenuSelected(j var1);

    public void setCallback(h$a var1);

    public void updateMenuView(boolean var1);
}

