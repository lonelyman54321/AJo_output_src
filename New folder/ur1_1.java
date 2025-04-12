/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ur1
 */
public final class ur1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ wr1_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public ur1_1(int n3, wr1_0 wr1_02, Object object) {
        this.c = wr1_02;
        this.d = n3;
        this.e = object;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.e;
            n3 = 0;
            wr1_0 wr1_02 = this.c;
            int n7 = this.d;
            wr1_02.d(n7, object2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

