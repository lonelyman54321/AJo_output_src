/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.navigation.d;
import java.util.List;

/*
 * Renamed from aq0
 */
public final class aq0_0
implements n {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ d c;

    public /* synthetic */ aq0_0(p83_0 p83_02, d d2, boolean bl2) {
        this.a = bl2;
        this.b = p83_02;
        this.c = d2;
    }

    public final void k(mu1_1 object, i$a i$a) {
        boolean bl2 = this.a;
        List list = this.b;
        d d2 = this.c;
        if (bl2 && !(bl2 = list.contains(d2))) {
            list.add(d2);
        }
        if (i$a == (object = i$a.ON_START) && !(bl2 = list.contains(d2))) {
            list.add(d2);
        }
        if (i$a == (object = i$a.ON_STOP)) {
            list.remove(d2);
        }
    }
}

