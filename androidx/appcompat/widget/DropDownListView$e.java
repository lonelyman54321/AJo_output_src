/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 */
package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class DropDownListView$e {
    public static final Field a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Field field = null;
        Class<AbsListView> clazz = AbsListView.class;
        String string2 = "mIsChildViewEnabled";
        try {
            field = clazz.getDeclaredField(string2);
            boolean bl2 = true;
            ((AccessibleObject)field).setAccessible(bl2);
        }
        catch (NoSuchFieldException noSuchFieldException) {}
        a = field;
    }
}

