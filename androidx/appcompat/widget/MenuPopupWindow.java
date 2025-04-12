/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView;
import java.lang.reflect.Method;

public final class MenuPopupWindow
extends ListPopupWindow
implements bo1_0 {
    public static final Method E;
    public bo1_0 D;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n3;
        String string2;
        Object object;
        try {
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 28;
            if (n4 > n7) return;
            object = PopupWindow.class;
            string2 = "setTouchModal";
            n3 = 1;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
        Class[] classArray = new Class[n3];
        Class<Boolean> clazz = Boolean.TYPE;
        classArray[0] = clazz;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        E = object;
    }

    public final void c(d d2, f f5) {
        bo1_0 bo1_02 = this.D;
        if (bo1_02 != null) {
            bo1_02.c(d2, f5);
        }
    }

    public final void l(d d2, f f5) {
        bo1_0 bo1_02 = this.D;
        if (bo1_02 != null) {
            bo1_02.l(d2, f5);
        }
    }

    public final DropDownListView o(Context context, boolean bl2) {
        MenuPopupWindow$MenuDropDownListView menuPopupWindow$MenuDropDownListView = new MenuPopupWindow$MenuDropDownListView(context, bl2);
        menuPopupWindow$MenuDropDownListView.setHoverListener(this);
        return menuPopupWindow$MenuDropDownListView;
    }
}

