/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ba0
 */
public final class ba0_1
implements gx0_2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;

    public ba0_1(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = c802;
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
            n4 = R$string.start_bonanza_bt;
            object = nk_0.f((b30_0)object2, n4);
            object4 = this.a;
            c80 c802 = (c80)this.c;
            yT1 yT12 = this.b;
            object3 = new ya0_2(c802, (ob0_1)object4, yT12);
            boolean bl2 = true;
            int n7 = 6;
            ga0_0.a(bl2, (String)object, (Function0)object3, (b30_0)object2, n7);
        }
        return Unit.a;
    }
}

