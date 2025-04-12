/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H2
 */
public final class h2_0
implements gx0_2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function0 c;

    public h2_0(FragmentManager fragmentManager, Function2 function2, tp0_2 tp0_22) {
        this.a = fragmentManager;
        this.b = function2;
        this.c = tp0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            bz1_2.Companion.getClass();
            n4 = 1;
            object = BZ1$a.a(n4 != 0);
            object4 = (tp0_2)this.c;
            object3 = new g2_0((tp0_2)object4);
            Intrinsics.checkNotNullParameter(object3, "fragmentTabListener");
            ((bz1_2)object).c1 = object3;
            object3 = j.c;
            String string2 = "BZ1";
            Intrinsics.checkNotNullExpressionValue(string2, "TAG");
            object = (Function2)this.b.invoke(object, string2);
            object4 = this.a;
            int n7 = 56;
            iw0_2.a((FragmentManager)object4, (LP1)object3, (Function2)object, (b30_0)object2, n7);
        }
        return Unit.a;
    }
}

