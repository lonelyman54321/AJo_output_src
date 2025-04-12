/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EM0
 */
public final class em0_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ fx0_2 e;

    public /* synthetic */ em0_1(Object object, Object object2, fx0_2 fx0_22, int n3, int n4) {
        this.a = n4;
        this.c = object;
        this.d = object2;
        this.e = fx0_22;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        object2.getClass();
        switch (n3) {
            default: {
                object2 = (ou0_0)this.d;
                Intrinsics.checkNotNullParameter(object2, "$focusRequester");
                Function1 function1 = (Function1)this.e;
                Intrinsics.checkNotNullParameter(function1, "$onShowFocus");
                int n4 = Me3.b(this.b | 1);
                jd2_1.e((Function2)this.c, (ou0_0)object2, function1, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (yh0_0)this.c;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Function0 function0 = (Function0)this.d;
        Intrinsics.checkNotNullParameter(function0, "$onApplyFilter");
        Function0 function02 = (Function0)this.e;
        Intrinsics.checkNotNullParameter(function02, "$onResetFilter");
        int n7 = Me3.b(this.b | 1);
        function0 = (u02_0)function0;
        function02 = (w93_0)function02;
        tm0_1.b((yh0_0)object2, (u02_0)function0, (w93_0)function02, (b30_0)object, n7);
        return Unit.a;
    }
}

