/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class O61
implements Function2 {
    public final /* synthetic */ e a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ int d;

    public /* synthetic */ O61(e e2, dr0_0 dr0_02, FragmentManager fragmentManager, int n3) {
        this.a = e2;
        this.b = dr0_02;
        this.c = fragmentManager;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$bottomNavigationController");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.d | 1);
        FragmentManager fragmentManager = this.c;
        T61.a(e2, dr0_02, fragmentManager, (b30_0)object, n3);
        return Unit.a;
    }
}

