/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class xf1$a {
    public static xf1_1 a(String string2) {
        xf1_1 xf1_122;
        block2: {
            Intrinsics.checkNotNullParameter(string2, "string");
            for (xf1_1 xf1_122 : xf1_1.values()) {
                String string3 = xf1_1.access$getStringValue$p(xf1_122);
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) {
                    continue;
                }
                break block2;
            }
            xf1_122 = null;
        }
        return xf1_122;
    }
}

