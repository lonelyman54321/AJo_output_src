/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.Iterator;
import java.util.List;

public final class HT1
implements Cr0 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ A20 b;

    public HT1(ib3_0 ib3_02, A20 a20) {
        this.a = ib3_02;
        this.b = a20;
    }

    public final void dispose() {
        boolean bl2;
        Iterator iterator = ((Iterable)((List)this.a.getValue())).iterator();
        while (bl2 = iterator.hasNext()) {
            d d2 = (d)iterator.next();
            kU1 kU12 = this.b.b();
            kU12.b(d2);
        }
    }
}

