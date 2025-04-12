/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class tg3$a
implements P2$a {
    public final ActionMode.Callback a;
    public final Context b;
    public final ArrayList c;
    public final a53 d;

    public tg3$a(Context object, ActionMode.Callback callback2) {
        this.b = object;
        this.a = callback2;
        this.c = object;
        super();
        this.d = object;
    }

    public final boolean a(P2 object, MenuItem menuItem) {
        object = this.e((P2)object);
        Context context = this.b;
        menuItem = (wg3_1)menuItem;
        do1_1 do1_12 = new do1_1(context, (wg3_1)menuItem);
        return this.a.onActionItemClicked((ActionMode)object, (MenuItem)do1_12);
    }

    public final void b(P2 object) {
        object = this.e((P2)object);
        this.a.onDestroyActionMode((ActionMode)object);
    }

    public final boolean c(P2 object, Menu menu2) {
        object = this.e((P2)object);
        a53 a532 = this.d;
        Menu menu3 = (Menu)a532.get(menu2);
        if (menu3 == null) {
            Context context = this.b;
            Menu menu4 = menu2;
            menu4 = (ug3_2)menu2;
            menu3 = new go1_0(context, (ug3_2)menu4);
            a532.put(menu2, menu3);
        }
        return this.a.onCreateActionMode((ActionMode)object, menu3);
    }

    public final boolean d(P2 object, Menu menu2) {
        object = this.e((P2)object);
        a53 a532 = this.d;
        Menu menu3 = (Menu)a532.get(menu2);
        if (menu3 == null) {
            Context context = this.b;
            Menu menu4 = menu2;
            menu4 = (ug3_2)menu2;
            menu3 = new go1_0(context, (ug3_2)menu4);
            a532.put(menu2, menu3);
        }
        return this.a.onPrepareActionMode((ActionMode)object, menu3);
    }

    public final tg3_2 e(P2 p2) {
        ArrayList arrayList = this.c;
        int n3 = arrayList.size();
        Context context = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            P2 p22;
            tg3_2 tg3_22 = (tg3_2)((Object)arrayList.get(i3));
            if (tg3_22 == null || (p22 = tg3_22.b) != p2) continue;
            return tg3_22;
        }
        context = this.b;
        tg3_2 tg3_23 = new tg3_2(context, p2);
        arrayList.add(tg3_23);
        return tg3_23;
    }
}

