/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.internal.Intrinsics;

public final class Hq3$b
implements NX0 {
    public final Object apply(Object object) {
        boolean bl2;
        String string2;
        boolean bl3;
        object = (HttpTransaction)object;
        boolean bl4 = false;
        if (object != null && !(bl3 = Intrinsics.areEqual(string2 = ((HttpTransaction)object).getFormattedPath(bl2 = true), object = ((HttpTransaction)object).getFormattedPath(false)))) {
            bl4 = true;
        }
        return bl4;
    }
}

