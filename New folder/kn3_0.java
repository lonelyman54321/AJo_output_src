/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kn3
 */
public final class kn3_0
extends wj3_0 {
    public iA3 b;

    public final List a() {
        Object[] objectArray = new xs_0[2];
        Map map2 = this.a;
        Object v4 = map2.get("PT_TIMER_THRESHOLD");
        Intrinsics.checkNotNull(v4);
        objectArray[0] = v4;
        v4 = map2.get("PT_TIMER_END");
        Intrinsics.checkNotNull(v4);
        objectArray[1] = v4;
        return xx_2.i(objectArray);
    }

    public final boolean b() {
        Iterator iterator = this.b;
        boolean bl2 = ((iA3)((Object)iterator)).b();
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            iterator = this.a();
            Intrinsics.checkNotNullParameter(iterator, "<this>");
            iterator = iterator.iterator();
            boolean bl5 = false;
            while (bl4 = iterator.hasNext()) {
                xs_0 xs_02 = (xs_0)iterator.next();
                bl4 = xs_02.a();
                bl5 = bl4 || bl5;
                if (!bl5) continue;
            }
            if (bl5) {
                bl3 = true;
            }
        }
        return bl3;
    }
}

