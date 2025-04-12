/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Yo
 */
public final class yo_2
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ yo_2(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Ref$ObjectRef ref$ObjectRef = this.a;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$label");
        Intrinsics.checkNotNullParameter(object, "segId");
        Intrinsics.checkNotNullParameter(object2, "expId");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        ref$ObjectRef.element = object = h30_0.a(stringBuilder, "|", (String)object2);
        return Unit.a;
    }
}

