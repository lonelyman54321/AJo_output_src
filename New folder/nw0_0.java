/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;

/*
 * Renamed from nW0
 */
public final class nw0_0
implements p60_0 {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ nw0_0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void accept(Object object) {
        int n3;
        object = (Integer)object;
        FragmentManager fragmentManager = this.a;
        int n4 = fragmentManager.Q();
        if (n4 != 0 && (n3 = ((Integer)object).intValue()) == (n4 = 80)) {
            n3 = 0;
            object = null;
            fragmentManager.m(false);
        }
    }
}

