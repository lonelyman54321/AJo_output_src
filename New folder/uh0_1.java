/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from uh0
 */
public final class uh0_1
implements Function2 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ vh0 d;

    public uh0_1(yi2_1 yi2_12, ArrayList arrayList, Function0 function0, vh0 vh02) {
        this.a = yi2_12;
        this.b = arrayList;
        this.c = function0;
        this.d = vh02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.d;
            th0_1 th0_12 = new th0_1((vh0)object);
            int n7 = 64;
            Object object4 = object = this.b;
            object4 = (ArrayList)object;
            yi2_1 yi2_12 = this.a;
            Function0 function0 = this.c;
            mh0_1.a(yi2_12, (ArrayList)object4, function0, th0_12, (b30_0)object3, n7);
        }
        return Unit.a;
    }
}

