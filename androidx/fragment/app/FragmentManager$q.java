/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

public final class FragmentManager$q
implements FragmentManager$o {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$q(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final boolean a(ArrayList iterator, ArrayList abstractCollection) {
        Object object;
        boolean bl2;
        Object object2;
        FragmentManager fragmentManager = this.a;
        fragmentManager.getClass();
        Object object3 = "FragmentManager";
        int n3 = 2;
        boolean bl3 = Log.isLoggable((String)object3, (int)n3);
        if (bl3) {
            object3 = fragmentManager.a;
            Objects.toString(object3);
        }
        object3 = fragmentManager.d;
        bl3 = ((ArrayList)object3).isEmpty();
        int n4 = 1;
        if (bl3) {
            bl3 = false;
            object3 = null;
        } else {
            object3 = fragmentManager.d;
            fragmentManager.h = object3 = (a)pp_0.a(n4, (ArrayList)object3);
            object3 = ((k)object3).a.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = ((k$a)object3.next()).b;
                if (object2 == null) continue;
                ((Fragment)object2).mTransitioning = n4;
            }
            bl2 = false;
            int n7 = -1;
            object3 = fragmentManager;
            object2 = iterator;
            object = abstractCollection;
            bl3 = fragmentManager.Y((ArrayList)((Object)iterator), (ArrayList)abstractCollection, null, n7, 0);
        }
        object2 = fragmentManager.o;
        n3 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0);
        if (n3 == 0 && (n3 = ((ArrayList)((Object)iterator)).size()) > 0) {
            n3 = ((ArrayList)((Object)iterator)).size() - n4;
            ((Boolean)((ArrayList)abstractCollection).get(n3)).getClass();
            abstractCollection = new LinkedHashSet();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = FragmentManager.H((a)iterator.next());
                abstractCollection.addAll(object2);
            }
            iterator = fragmentManager.o.iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (FragmentManager$n)iterator.next();
                object = abstractCollection.iterator();
                while (bl2 = object.hasNext()) {
                    Fragment cfr_ignored_0 = (Fragment)object.next();
                    object2.getClass();
                }
            }
        }
        return bl3;
    }
}

