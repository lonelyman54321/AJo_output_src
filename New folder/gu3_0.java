/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gu3
 */
public final class gu3_0
implements Function2 {
    public final /* synthetic */ eu3_0 a;

    public /* synthetic */ gu3_0(eu3_0 eu3_02) {
        this.a = eu3_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (List)object2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "values");
        jm2_2 jm2_22 = this.a.i;
        object2 = (Iterable)object2;
        jm2_22.a((String)object, (Iterable)object2);
        return Unit.a;
    }
}

