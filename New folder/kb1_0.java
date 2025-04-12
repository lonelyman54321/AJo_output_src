/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Kb1
 */
public final class kb1_0
extends Lambda
implements Function2 {
    public static final kb1_0 c;

    static {
        kb1_0 kb1_02;
        c = kb1_02 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        object = (HttpTransaction)object;
        object2 = (HttpTransaction)object2;
        boolean bl3 = false;
        if (object != null && !(bl2 = ((HttpTransaction)object).hasTheSameContent((HttpTransaction)object2))) {
            bl3 = true;
        }
        return bl3 ^ true;
    }
}

