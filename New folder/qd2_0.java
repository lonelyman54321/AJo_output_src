/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QD2
 */
public final class qd2_0
extends wj3_0 {
    public iA3 b;

    public final List a() {
        Object[] objectArray = new xs_0[2];
        Map map2 = this.a;
        Object v4 = map2.get("PT_DEEPLINK_LIST");
        Intrinsics.checkNotNull(v4);
        objectArray[0] = v4;
        v4 = map2.get("PT_RATING_DEFAULT_DL");
        Intrinsics.checkNotNull(v4);
        objectArray[1] = v4;
        return xx_2.i(objectArray);
    }

    public final boolean b() {
        iA3 iA32 = this.b;
        boolean bl2 = iA32.b();
        if (bl2 && (bl2 = this.c())) {
            bl2 = true;
        } else {
            bl2 = false;
            iA32 = null;
        }
        return bl2;
    }
}

