/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$o;
import java.util.ArrayList;

public final class FragmentManager$p
implements FragmentManager$o {
    public final String a;
    public final int b;
    public final int c;
    public final /* synthetic */ FragmentManager d;

    public FragmentManager$p(FragmentManager fragmentManager, String string2, int n3, int n4) {
        this.d = fragmentManager;
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean bl2;
        Object object;
        int n3;
        Object object2 = this.d.A;
        if (object2 != null && (n3 = this.b) < 0 && (object = this.a) == null && (bl2 = ((FragmentManager)(object2 = ((Fragment)object2).getChildFragmentManager())).W())) {
            return false;
        }
        int n4 = this.b;
        int n7 = this.c;
        object2 = this.d;
        String string2 = this.a;
        object = arrayList;
        return ((FragmentManager)object2).Y(arrayList, arrayList2, string2, n4, n7);
    }
}

