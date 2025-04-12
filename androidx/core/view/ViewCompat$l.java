/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.core.view;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.R$id;
import androidx.core.view.ViewCompat$k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ViewCompat$l {
    public static final ArrayList d;
    public WeakHashMap a = null;
    public SparseArray b = null;
    public WeakReference c = null;

    static {
        ArrayList arrayList;
        d = arrayList = new ArrayList();
    }

    public static boolean b(View object, KeyEvent keyEvent) {
        int n3 = R$id.tag_unhandled_key_listeners;
        if ((object = (ArrayList)object.getTag(n3)) != null) {
            n3 = ((ArrayList)object).size();
            int n4 = 1;
            n3 -= n4;
            while (n3 >= 0) {
                ViewCompat$k viewCompat$k = (ViewCompat$k)((ArrayList)object).get(n3);
                boolean bl2 = viewCompat$k.a();
                if (bl2) {
                    return n4 != 0;
                }
                n3 += -1;
            }
        }
        return false;
    }

    public final View a(View view, KeyEvent keyEvent) {
        boolean bl2;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && (bl2 = weakHashMap.containsKey(view))) {
            boolean bl3;
            bl2 = view instanceof ViewGroup;
            if (bl2) {
                weakHashMap = view;
                weakHashMap = (ViewGroup)view;
                for (int i3 = weakHashMap.getChildCount() + -1; i3 >= 0; i3 += -1) {
                    View view2 = weakHashMap.getChildAt(i3);
                    if ((view2 = this.a(view2, keyEvent)) == null) continue;
                    return view2;
                }
            }
            if (bl3 = ViewCompat$l.b(view, keyEvent)) {
                return view;
            }
        }
        return null;
    }
}

