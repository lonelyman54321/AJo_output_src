/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.text.StringsKt;

public final class Hq3$c
implements NX0 {
    public final Object apply(Object object) {
        object = (HttpTransaction)object;
        boolean bl2 = false;
        String string2 = null;
        if (object != null && (object = ((HttpTransaction)object).getRequestContentType()) != null) {
            string2 = "x-www-form-urlencoded";
            boolean bl3 = true;
            bl2 = StringsKt.F((CharSequence)object, string2, bl3);
        }
        return bl2;
    }
}

