/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;

/*
 * Renamed from pW0
 */
public final class pw0_0
implements p60_0 {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ pw0_0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void accept(Object object) {
        object = (bs2_0)object;
        FragmentManager fragmentManager = this.a;
        boolean bl2 = fragmentManager.Q();
        if (bl2) {
            boolean bl3 = ((bs2_0)object).a;
            bl2 = false;
            fragmentManager.s(bl3, false);
        }
    }
}

