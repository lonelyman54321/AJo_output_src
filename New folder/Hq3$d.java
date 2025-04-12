/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Hq3$d
extends Lambda
implements Function2 {
    public static final Hq3$d c;

    static {
        Hq3$d hq3$d;
        c = hq3$d = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (HttpTransaction)object;
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = ((HttpTransaction)object).getMethod();
            stringBuilder.append((Object)string2);
            char c2 = ' ';
            stringBuilder.append(c2);
            object = ((HttpTransaction)object).getFormattedPath(bl2);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        } else {
            object = "";
        }
        return object;
    }
}

