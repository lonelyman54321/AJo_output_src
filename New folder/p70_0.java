/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p70
 */
public final class p70_0
extends iA3 {
    public p70_0(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "keys");
        super(map2);
    }

    public final List a() {
        Object[] objectArray = new xs_0[2];
        Map map2 = this.a;
        Object v4 = map2.get("PT_TITLE");
        Intrinsics.checkNotNull(v4);
        objectArray[0] = v4;
        v4 = map2.get("PT_MSG");
        Intrinsics.checkNotNull(v4);
        objectArray[1] = v4;
        return xx_2.i(objectArray);
    }
}

