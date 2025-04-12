/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F2
 */
public final class f2_0
implements Function2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ f2_0(FragmentManager fragmentManager, Function2 function2, tp0_2 tp0_22, int n3) {
        this.a = fragmentManager;
        this.b = function2;
        this.c = tp0_22;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$getCommitFunction");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$switchTabs");
        int n3 = Me3.b(this.d | 1);
        FragmentManager fragmentManager = this.a;
        function0 = (tp0_2)function0;
        i2_0.a(fragmentManager, (Function2)object2, (tp0_2)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

