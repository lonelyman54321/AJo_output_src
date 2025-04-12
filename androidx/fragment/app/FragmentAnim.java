/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.fragment.app;

import android.content.Context;

public final class FragmentAnim {
    public static int a(int n3, Context context) {
        Object object = new int[]{n3};
        object = context.obtainStyledAttributes(0x1030001, object);
        int n4 = object.getResourceId(0, -1);
        object.recycle();
        return n4;
    }
}

