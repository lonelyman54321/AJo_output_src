/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from oo3
 */
public final class oo3_0
implements Function2 {
    public final /* synthetic */ Function0 a;

    public oo3_0(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            n3 = 0;
            ro3_0.e((Function0)object2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

