/*
 * Decompiled with CFR 0.152.
 */
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.Intrinsics;

public final class Ly0 {
    public static final Ly0 a;
    public static final cm0_1 b;

    static {
        ib3_0 ib3_02;
        Object object = new Object();
        a = object;
        object = new Object();
        boolean bl2 = EmojiCompat.c();
        if (bl2) {
            ib3_02 = ((cm0_1)object).a();
        } else {
            bl2 = false;
            ib3_02 = null;
        }
        ((cm0_1)object).a = ib3_02;
        b = object;
    }

    public final ib3_0 a() {
        cm0_1 cm0_12 = b;
        ib3_0 ib3_02 = cm0_12.a;
        if (ib3_02 != null) {
            Intrinsics.checkNotNull(ib3_02);
        } else {
            boolean bl2 = EmojiCompat.c();
            if (bl2) {
                cm0_12.a = ib3_02 = cm0_12.a();
                Intrinsics.checkNotNull(ib3_02);
            } else {
                ib3_02 = LK1.a;
            }
        }
        return ib3_02;
    }
}

