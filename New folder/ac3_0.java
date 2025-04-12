/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ac3
 */
public final class ac3_0
extends Lambda
implements Function1 {
    public final Object invoke(Object object) {
        object = (WorkDatabase)object;
        Intrinsics.checkNotNullParameter(object, "db");
        di3_2 di3_22 = EI3.y;
        object = ((WorkDatabase)object).f().y();
        object = di3_22.apply(object);
        Intrinsics.checkNotNullExpressionValue(object, "WORK_INFO_MAPPER.apply(d\u2026kStatusPojoForName(name))");
        return (List)object;
    }
}

