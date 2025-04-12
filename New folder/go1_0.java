/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/*
 * Renamed from gO1
 */
public class go1_0
extends pw
implements Menu {
    public final ug3_2 d;

    public go1_0(Context object, ug3_2 ug3_22) {
        super((Context)object);
        if (ug3_22 != null) {
            this.d = ug3_22;
            return;
        }
        super("Wrapped Object can not be null.");
        throw object;
    }

    public final MenuItem add(int n3) {
        MenuItem menuItem = this.d.add(n3);
        return this.c(menuItem);
    }

    public final MenuItem add(int n3, int n4, int n7, int n8) {
        MenuItem menuItem = this.d.add(n3, n4, n7, n8);
        return this.c(menuItem);
    }

    public final MenuItem add(int n3, int n4, int n7, CharSequence charSequence) {
        MenuItem menuItem = this.d.add(n3, n4, n7, charSequence);
        return this.c(menuItem);
    }

    public final MenuItem add(CharSequence charSequence) {
        charSequence = this.d.add(charSequence);
        return this.c((MenuItem)charSequence);
    }

    public final int addIntentOptions(int n3, int n4, int n7, ComponentName componentName, Intent[] intentArray, Intent intent, int n8, MenuItem[] menuItemArray) {
        MenuItem[] menuItemArray2;
        int n10;
        go1_0 go1_02 = this;
        MenuItem[] menuItemArray3 = menuItemArray;
        if (menuItemArray != null) {
            n10 = menuItemArray.length;
            menuItemArray2 = new MenuItem[n10];
        } else {
            n10 = 0;
            menuItemArray2 = null;
        }
        ug3_2 ug3_22 = go1_02.d;
        int n14 = n3;
        int n15 = n4;
        int n16 = ug3_22.addIntentOptions(n3, n4, n7, componentName, intentArray, intent, n8, menuItemArray2);
        if (menuItemArray2 != null) {
            for (MenuItem menuItem : menuItemArray2) {
                menuItemArray3[n15] = menuItem = this.c(menuItem);
            }
        }
        return n16;
    }

    public final SubMenu addSubMenu(int n3) {
        SubMenu subMenu = this.d.addSubMenu(n3);
        return this.d(subMenu);
    }

    public final SubMenu addSubMenu(int n3, int n4, int n7, int n8) {
        SubMenu subMenu = this.d.addSubMenu(n3, n4, n7, n8);
        return this.d(subMenu);
    }

    public final SubMenu addSubMenu(int n3, int n4, int n7, CharSequence charSequence) {
        SubMenu subMenu = this.d.addSubMenu(n3, n4, n7, charSequence);
        return this.d(subMenu);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        charSequence = this.d.addSubMenu(charSequence);
        return this.d((SubMenu)charSequence);
    }

    public final void clear() {
        a53 a532 = this.b;
        if (a532 != null) {
            a532.clear();
        }
        if ((a532 = this.c) != null) {
            a532.clear();
        }
        this.d.clear();
    }

    public final void close() {
        this.d.close();
    }

    public final MenuItem findItem(int n3) {
        MenuItem menuItem = this.d.findItem(n3);
        return this.c(menuItem);
    }

    public final MenuItem getItem(int n3) {
        MenuItem menuItem = this.d.getItem(n3);
        return this.c(menuItem);
    }

    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int n3, KeyEvent keyEvent) {
        return this.d.isShortcutKey(n3, keyEvent);
    }

    public final boolean performIdentifierAction(int n3, int n4) {
        return this.d.performIdentifierAction(n3, n4);
    }

    public final boolean performShortcut(int n3, KeyEvent keyEvent, int n4) {
        return this.d.performShortcut(n3, keyEvent, n4);
    }

    public final void removeGroup(int n3) {
        a53 a532 = this.b;
        if (a532 != null) {
            int n4 = 0;
            a532 = null;
            while (true) {
                Object object = this.b;
                int n7 = ((a53)object).c;
                if (n4 >= n7) break;
                int n8 = (object = (wg3_1)((a53)object).h(n4)).getGroupId();
                if (n8 == n3) {
                    object = this.b;
                    ((a53)object).j(n4);
                    n4 += -1;
                }
                ++n4;
            }
        }
        this.d.removeGroup(n3);
    }

    public final void removeItem(int n3) {
        a53 a532 = this.b;
        if (a532 != null) {
            int n4 = 0;
            a532 = null;
            while (true) {
                Object object = this.b;
                int n7 = ((a53)object).c;
                if (n4 >= n7) break;
                int n8 = (object = (wg3_1)((a53)object).h(n4)).getItemId();
                if (n8 == n3) {
                    object = this.b;
                    ((a53)object).j(n4);
                    break;
                }
                ++n4;
            }
        }
        this.d.removeItem(n3);
    }

    public final void setGroupCheckable(int n3, boolean bl2, boolean bl3) {
        this.d.setGroupCheckable(n3, bl2, bl3);
    }

    public final void setGroupEnabled(int n3, boolean bl2) {
        this.d.setGroupEnabled(n3, bl2);
    }

    public final void setGroupVisible(int n3, boolean bl2) {
        this.d.setGroupVisible(n3, bl2);
    }

    public final void setQwertyMode(boolean bl2) {
        this.d.setQwertyMode(bl2);
    }

    public final int size() {
        return this.d.size();
    }
}

