/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class a21$c
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ a21$a b;
    public final /* synthetic */ String c;

    public a21$c(ArrayList arrayList, a21$a a21$a, String string2) {
        this.a = arrayList;
        this.b = a21$a;
        this.c = string2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            a21$a a21$a;
            a21.a.getClass();
            object2 = this.a;
            n3 = (int)(a21.c((ArrayList)object2) ? 1 : 0);
            if (n3 != 0 && ((a21$a = this.b) == (object3 = a21$a.RETURN_CREATED) || a21$a == (object3 = a21$a.RETURN_REQUESTED))) {
                object3 = this.c;
                int n7 = 8;
                rz0_2.a((List)object2, (String)object3, (b30_0)object, n7);
            }
        }
        return Unit.a;
    }
}

