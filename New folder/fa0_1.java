/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fa0
 */
public final class fa0_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fa0_1(boolean bl2, String string2, Function0 function0, int n3) {
        this.a = bl2;
        this.b = string2;
        this.c = function0;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$buttonText");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        int n3 = Me3.b(this.d | 1);
        ga0_0.a(this.a, (String)object2, function0, (b30_0)object, n3);
        return Unit.a;
    }
}

