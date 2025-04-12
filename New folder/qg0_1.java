/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qg0
 */
public final class qg0_1
implements gx0_2 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ hd2_0 c;
    public final /* synthetic */ Function0 d;

    public qg0_1(yh0_0 yh0_02, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0) {
        this.a = yh0_02;
        this.b = yi2_12;
        this.c = hd2_02;
        this.d = function0;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (mk2_0)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "it";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            hd2_0 hd2_02 = this.c;
            pg0_1 pg0_12 = new pg0_1(hd2_02);
            yh0_0 yh0_02 = this.a;
            int n7 = 8;
            yi2_1 yi2_12 = this.b;
            Function0 function0 = this.d;
            Rg0.b(yh0_02, yi2_12, hd2_02, function0, pg0_12, (b30_0)object4, n7);
        }
        return Unit.a;
    }
}

