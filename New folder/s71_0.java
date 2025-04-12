/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from S71
 */
public final class s71_0
implements Function2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ s71_0(FragmentManager fragmentManager, Function2 function2, int n3) {
        this.a = fragmentManager;
        this.b = function2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$getCommitFunction");
        int n3 = Me3.b(this.c | 1);
        T71.a(this.a, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

