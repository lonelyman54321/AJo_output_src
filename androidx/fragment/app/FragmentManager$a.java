/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import java.util.ArrayList;
import java.util.Map;

public final class FragmentManager$a
implements w3 {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$a(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Object object) {
        int n3;
        object = (Map)object;
        String[] stringArray = object.keySet();
        Object object2 = null;
        Object object3 = new String[]{};
        stringArray = stringArray.toArray((T[])object3);
        object = object.values();
        object3 = new ArrayList(object);
        int n4 = ((ArrayList)object3).size();
        object = new int[n4];
        String string2 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)object3).size()); ++i3) {
            Boolean bl2 = (Boolean)((ArrayList)object3).get(i3);
            n3 = (int)(bl2.booleanValue() ? 1 : 0);
            if (n3 != 0) {
                n3 = 0;
                bl2 = null;
            } else {
                n3 = -1;
            }
            object[i3] = n3;
        }
        object2 = this.a;
        object3 = (FragmentManager$LaunchedFragmentInfo)((FragmentManager)object2).G.pollFirst();
        if (object3 != null && (object2 = ((FragmentManager)object2).c.c(string2 = ((FragmentManager$LaunchedFragmentInfo)object3).a)) != null) {
            int n7 = ((FragmentManager$LaunchedFragmentInfo)object3).b;
            ((Fragment)object2).onRequestPermissionsResult(n7, stringArray, (int[])object);
        }
    }
}

