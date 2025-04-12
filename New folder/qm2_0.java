/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QM2
 */
public final class qm2_0
implements Function1 {
    public final /* synthetic */ Sl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ qm2_0(Sl sl, String string2, Function0 function0) {
        this.a = sl;
        this.b = string2;
        this.c = function0;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        Sl sl = this.a;
        Intrinsics.checkNotNullParameter(sl, "$text");
        String string2 = "$tag";
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, string2);
        object = (Sl$b)CollectionsKt.firstOrNull(sl.c(n3, n3, string3));
        if (object != null && (object = this.c) != null) {
            object.invoke();
        }
        return Unit.a;
    }
}

