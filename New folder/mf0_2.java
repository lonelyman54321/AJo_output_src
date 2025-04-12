/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Mf0
 */
public final class mf0_2
implements Function2 {
    public final /* synthetic */ gx0_2 a;
    public final /* synthetic */ List b;

    public mf0_2(gx0_2 gx0_22, ArrayList arrayList) {
        this.a = gx0_22;
        this.b = arrayList;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 8;
            object2 = n4;
            gx0_2 gx0_22 = this.a;
            List list = this.b;
            gx0_22.invoke(list, object, object2);
        }
        return Unit.a;
    }
}

