/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

public abstract class pw {
    public final Context a;
    public a53 b;
    public a53 c;

    public pw(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        boolean bl2 = menuItem instanceof wg3_1;
        if (bl2) {
            menuItem = (wg3_1)menuItem;
            Object object = this.b;
            if (object == null) {
                object = new a53();
                this.b = object;
            }
            if ((object = (MenuItem)this.b.get(menuItem)) == null) {
                Object object2 = this.a;
                object = new do1_1((Context)object2, (wg3_1)menuItem);
                object2 = this.b;
                ((a53)object2).put(menuItem, object);
            }
            return object;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        boolean bl2 = subMenu instanceof cg3_1;
        if (bl2) {
            subMenu = (cg3_1)subMenu;
            Object object = this.c;
            if (object == null) {
                object = new a53();
                this.c = object;
            }
            if ((object = (SubMenu)this.c.get(subMenu)) == null) {
                Object object2 = this.a;
                object = new pf3_1((Context)object2, (cg3_1)subMenu);
                object2 = this.c;
                ((a53)object2).put(subMenu, object);
            }
            return object;
        }
        return subMenu;
    }
}

