/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class kA2
extends wj3_0 {
    public iA3 b;

    public final List a() {
        Object[] objectArray = new xs_0[6];
        Map map2 = this.a;
        Object v4 = map2.get("PT_THREE_DEEPLINK_LIST");
        Intrinsics.checkNotNull(v4);
        objectArray[0] = v4;
        v4 = map2.get("PT_BIG_TEXT_LIST");
        Intrinsics.checkNotNull(v4);
        objectArray[1] = v4;
        v4 = map2.get("PT_SMALL_TEXT_LIST");
        Intrinsics.checkNotNull(v4);
        objectArray[2] = v4;
        v4 = map2.get("PT_PRODUCT_DISPLAY_ACTION");
        Intrinsics.checkNotNull(v4);
        objectArray[3] = v4;
        v4 = map2.get("PT_PRODUCT_DISPLAY_ACTION_CLR");
        Intrinsics.checkNotNull(v4);
        objectArray[4] = v4;
        v4 = map2.get("PT_PRODUCT_THREE_IMAGE_LIST");
        Intrinsics.checkNotNull(v4);
        objectArray[5] = v4;
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

