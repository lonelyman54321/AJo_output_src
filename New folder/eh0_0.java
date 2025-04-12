/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eH0
 */
public final class eh0_0
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ eh0_0(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (List)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object2, "brandName");
        dr0_02.X((String)object2, (List)object);
        return Unit.a;
    }
}

