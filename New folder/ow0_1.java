/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;

/*
 * Renamed from oW0
 */
public final class ow0_1
implements p60_0 {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ ow0_1(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void accept(Object object) {
        object = (WQ1)object;
        FragmentManager fragmentManager = this.a;
        boolean bl2 = fragmentManager.Q();
        if (bl2) {
            boolean bl3 = ((WQ1)object).a;
            bl2 = false;
            fragmentManager.n(bl3, false);
        }
    }
}

