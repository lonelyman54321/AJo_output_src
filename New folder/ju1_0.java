/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Renamed from ju1
 */
public final class ju1_0
implements fu1_0,
lu1 {
    public final HashSet a;
    public final i b;

    public ju1_0(i i3) {
        HashSet hashSet;
        this.a = hashSet = new HashSet();
        this.b = i3;
        i3.a(this);
    }

    public final void b(ku1_0 ku1_02) {
        this.a.add(ku1_02);
        Object object = this.b;
        i$b i$b = ((i)object).b();
        i$b i$b2 = i$b.DESTROYED;
        if (i$b == i$b2) {
            ku1_02.onDestroy();
        } else {
            boolean bl2 = ((i$b)((Object)(object = ((i)object).b()))).isAtLeast(i$b = i$b.STARTED);
            if (bl2) {
                ku1_02.onStart();
            } else {
                ku1_02.onStop();
            }
        }
    }

    public final void c(ku1_0 ku1_02) {
        this.a.remove(ku1_02);
    }

    public void onDestroy(mu1_1 mu1_12) {
        boolean bl2;
        Iterator iterator = dz3.e(this.a).iterator();
        while (bl2 = iterator.hasNext()) {
            ku1_0 ku1_02 = (ku1_0)iterator.next();
            ku1_02.onDestroy();
        }
        mu1_12.getLifecycle().c(this);
    }

    public void onStart(mu1_1 object) {
        boolean bl2;
        object = dz3.e(this.a).iterator();
        while (bl2 = object.hasNext()) {
            ku1_0 ku1_02 = (ku1_0)object.next();
            ku1_02.onStart();
        }
    }

    public void onStop(mu1_1 object) {
        boolean bl2;
        object = dz3.e(this.a).iterator();
        while (bl2 = object.hasNext()) {
            ku1_0 ku1_02 = (ku1_0)object.next();
            ku1_02.onStop();
        }
    }
}

