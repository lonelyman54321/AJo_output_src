/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HP
 */
public final class hp_0
implements gx0_2 {
    public final /* synthetic */ Cl2 a;
    public final /* synthetic */ p83_0 b;

    public hp_0(hm0_0 hm0_02, p83_0 p83_02) {
        this.a = hm0_02;
        this.b = p83_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (List)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "it");
        zh3_1 zh3_12 = zh3_1.a;
        object2 = LP1$a.b;
        object3 = this.a;
        int n3 = ((Cl2)object3).j();
        object = (wh3_2)object.get(n3);
        Object object5 = this.b;
        int n4 = ((Cl2)object3).j();
        float f5 = ((xs0_0)((p83_0)object5).get((int)n4)).a;
        Intrinsics.checkNotNullParameter(object2, "$this$customTabIndicatorOffset");
        Intrinsics.checkNotNullParameter(object, "currentTabPosition");
        object5 = ji1.a;
        w20_0 w20_02 = new w20_0(f5, (wh3_2)object);
        object = a30_0.a((LP1)object2, (Function1)object5, w20_02);
        float f6 = -uq0_0.c;
        object5 = g.a((LP1)object, f6);
        long l2 = OX.i;
        float f7 = zh3_1.c * 1.5f;
        zh3_12.b((LP1)object5, f7, l2, (b30_0)object4, 3504, 0);
        return Unit.a;
    }
}

