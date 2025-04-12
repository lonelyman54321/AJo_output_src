/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eP0
 */
public final class ep0_0
implements gx0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ f23_0 d;

    public ep0_0(dr0_0 dr0_02, String string2, yT1 yT12, f23_0 f23_02) {
        this.a = dr0_02;
        this.b = string2;
        this.c = yT12;
        this.d = f23_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (kl_0)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        object3 = (Number)object3;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$AnimatedVisibility");
        object = this.a;
        object2 = ((dr0_0)object).t0;
        if (object2 != null) {
            ((ArrayList)object2).clear();
        }
        ((dr0_0)object).Q0.clear();
        f23_0 f23_02 = this.d;
        String string2 = this.b;
        dr0_0 dr0_02 = this.a;
        yT1 yT12 = this.c;
        WB.a(string2, dr0_02, yT12, f23_02, (b30_0)object4, 4672);
        return Unit.a;
    }
}

