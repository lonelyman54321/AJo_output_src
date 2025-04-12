/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MO0
 */
public final class mo0_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ f23_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ yT1 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ pq_0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ mo0_2(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, String string2, hq0_2 hq0_22, pq_0 pq_02, int n3) {
        this.a = dr0_02;
        this.b = f23_02;
        this.c = fragmentManager;
        this.d = yT12;
        this.e = yT13;
        this.f = string2;
        this.g = hq0_22;
        this.h = pq_02;
        this.i = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        f23_0 f23_02 = this.b;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        yT1 yT12 = this.d;
        Intrinsics.checkNotNullParameter(yT12, "$fleekBottomNavigationController");
        yT1 yT13 = this.e;
        Intrinsics.checkNotNullParameter(yT13, "$fleekAppNavigationController");
        object = this.g;
        Intrinsics.checkNotNullParameter(object, "$getCommitFunction");
        int n3 = Me3.b(this.i | 1);
        pq_0 pq_02 = this.h;
        Object object4 = object;
        object4 = (hq0_2)object;
        FragmentManager fragmentManager = this.c;
        String string2 = this.f;
        uo0_0.c(dr0_02, f23_02, fragmentManager, yT12, yT13, string2, (hq0_2)object4, pq_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

