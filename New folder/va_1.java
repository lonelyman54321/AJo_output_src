/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from Va
 */
public final class va_1
implements Function1 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ va_1(j7_0 j7_02, Ref$ObjectRef ref$ObjectRef) {
        this.a = j7_02;
        this.b = ref$ObjectRef;
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$path");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        object3 = (String)((tr1_0)((Ref$ObjectRef)object3).element).getValue();
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, "path");
        object2 = StringsKt.h0((String)object3, "/", (String)object3);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" category screen");
        object2 = ((StringBuilder)object3).toString();
        RY2.e((UY2)object, (String)object2);
        return Unit.a;
    }
}

