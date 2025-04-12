/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import java.util.Iterator;

/*
 * Renamed from rW0
 */
public final class rw0_0
implements Runnable {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ rw0_0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void run() {
        boolean bl2;
        Iterator iterator = this.a.o.iterator();
        while (bl2 = iterator.hasNext()) {
            FragmentManager$n fragmentManager$n = (FragmentManager$n)iterator.next();
            fragmentManager$n.getClass();
        }
    }
}

