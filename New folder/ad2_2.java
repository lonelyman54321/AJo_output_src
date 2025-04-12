/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from ad2
 */
public final class ad2_2
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ ad2_2(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, je1_0 je1_02) {
        this.a = ref$ObjectRef;
        this.b = ref$ObjectRef2;
        this.c = ref$ObjectRef3;
        this.d = ref$ObjectRef4;
        this.e = je1_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$value1");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$value2");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$value3");
        Serializable serializable = this.d;
        Intrinsics.checkNotNullParameter(serializable, "$value4");
        Function1 function1 = this.e;
        Intrinsics.checkNotNullParameter(function1, "$onUpdateClicked");
        Object object4 = ((Ref$ObjectRef)object).element;
        object = ((Ref$ObjectRef)object2).element;
        object2 = ((Ref$ObjectRef)object3).element;
        object3 = ((Ref$ObjectRef)serializable).element;
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(object4);
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(object3);
        object4 = ((StringBuilder)serializable).toString();
        function1.invoke(object4);
        return Unit.a;
    }
}

