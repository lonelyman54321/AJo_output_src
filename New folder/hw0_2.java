/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;

/*
 * Renamed from hW0
 */
public final class hw0_2
implements Cr0 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ tr1_0 b;

    public hw0_2(FragmentManager fragmentManager, tr1_0 tr1_02) {
        this.a = fragmentManager;
        this.b = tr1_02;
    }

    public final void dispose() {
        boolean bl2;
        Object object;
        FragmentManager fragmentManager = this.a;
        if (fragmentManager != null) {
            int n3;
            object = (FragmentContainerView)((Object)this.b.getValue());
            if (object != null) {
                n3 = object.getId();
            } else {
                n3 = 0;
                object = null;
            }
            object = fragmentManager.D(n3);
        } else {
            boolean bl3 = false;
            object = null;
        }
        if (object != null && !(bl2 = fragmentManager.S())) {
            a a2 = new a(fragmentManager);
            a2.i((Fragment)object);
            a2.d();
        }
    }
}

