/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gW0
 */
public final class gw0_2
implements Function2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gw0_2(FragmentManager fragmentManager, LP1 lP1, Function2 function2, int n3) {
        this.a = fragmentManager;
        this.b = lP1;
        this.c = function2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$fragentContainerFunc");
        int n3 = Me3.b(this.d | 1);
        FragmentManager fragmentManager = this.a;
        LP1 lP1 = this.b;
        iw0_2.a(fragmentManager, lP1, (Function2)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

