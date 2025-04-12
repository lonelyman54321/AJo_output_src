/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Cv1
 */
public final class cv1_0
implements F62 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ kn1_0 d;

    public /* synthetic */ cv1_0(Executor executor, Ref$ObjectRef ref$ObjectRef, Function2 function2, kn1_0 kn1_02) {
        this.a = executor;
        this.b = ref$ObjectRef;
        this.c = function2;
        this.d = kn1_02;
    }

    public final void onChanged(Object object) {
        Executor executor = this.a;
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Ref$ObjectRef ref$ObjectRef = this.b;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$old");
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$areEqual");
        kn1_0 kn1_02 = this.d;
        Intrinsics.checkNotNullParameter(kn1_02, "$distinctMediator");
        Dv1 dv1 = new Dv1(ref$ObjectRef, function2, object, kn1_02);
        executor.execute(dv1);
    }
}

