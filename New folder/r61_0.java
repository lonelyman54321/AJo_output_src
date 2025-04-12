/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from R61
 */
public final class r61_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yz_0 b;
    public final /* synthetic */ dr0_0 c;

    public r61_0(yz_0 yz_02, dr0_0 dr0_02, String string2) {
        this.a = string2;
        this.b = yz_02;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0))) {
            object.D();
        } else {
            object2 = this.b;
            String string2 = ((yz_0)object2).d;
            n3 = (int)(Intrinsics.areEqual(this.a, string2) ? 1 : 0);
            dr0_0 dr0_02 = this.c;
            int n7 = 576;
            T61.b(n3 != 0, (yz_0)object2, dr0_02, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

