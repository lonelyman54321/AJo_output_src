/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class LA0$a {
    public static la0_0 a(String string2) {
        la0_0 la0_022;
        block3: {
            Intrinsics.checkNotNullParameter(string2, "value");
            for (la0_0 la0_022 : la0_0.values()) {
                String string3 = la0_022.getValue();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) {
                    continue;
                }
                break block3;
            }
            la0_022 = null;
        }
        if (la0_022 == null) {
            la0_022 = la0_0.BRAND_VOICE;
        }
        return la0_022;
    }
}

