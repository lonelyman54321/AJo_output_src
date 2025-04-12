/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vv3
 */
public final class vv3_0
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wr1_1 c;
    public final /* synthetic */ ln0 d;
    public final /* synthetic */ i13 e;

    public vv3_0(boolean bl2, boolean bl3, wr1_1 wr1_12, ln0 ln02, i13 i132) {
        this.a = bl2;
        this.b = bl3;
        this.c = wr1_12;
        this.d = ln02;
        this.e = i132;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            ck3 ck32 = ck3.a;
            i13 i132 = this.e;
            int n7 = 0xC00000;
            boolean bl2 = this.a;
            boolean bl3 = this.b;
            wr1_1 wr1_12 = this.c;
            ln0 ln02 = this.d;
            ck32.a(bl2, bl3, wr1_12, ln02, i132, 0.0f, 0.0f, (b30_0)object3, n7);
        }
        return Unit.a;
    }
}

