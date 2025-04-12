/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from we3
 */
public final class we3_2
implements Function2 {
    public final /* synthetic */ xe3_2 a;

    public /* synthetic */ we3_2(xe3_2 xe3_22) {
        this.a = xe3_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (List)object2;
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(object2, "values");
        object2 = (Iterable)object2;
        this.a.a((String)object, (Iterable)object2);
        return Unit.a;
    }
}

