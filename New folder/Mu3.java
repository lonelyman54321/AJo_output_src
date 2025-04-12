/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Mu3
implements Function1 {
    public final /* synthetic */ Vo0 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ tr1_0 c;

    public /* synthetic */ Mu3(Vo0 vo0, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = vo0;
        this.b = tr1_02;
        this.c = tr1_03;
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$localDensity");
        tr1_0 tr1_02 = this.b;
        Intrinsics.checkNotNullParameter(tr1_02, "$buttonWidthDp$delegate");
        tr1_0 tr1_03 = this.c;
        Intrinsics.checkNotNullParameter(tr1_03, "$buttonHeightDp$delegate");
        String string2 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = object.a();
        int n3 = 32;
        int n4 = (int)(l2 >>= n3);
        float f5 = object2.D0(n4);
        xs0_0 xs0_02 = (xs0_0)tr1_02.getValue();
        float f6 = xs0_02.a;
        n4 = (int)(xs0_0.a(f6, f5) ? 1 : 0);
        if (n4 == 0) {
            xs0_02 = new xs0_0(f5);
            tr1_02.setValue(xs0_02);
        }
        l2 = object.a();
        long l3 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l3);
        float f7 = object2.D0(n7);
        object2 = (xs0_0)tr1_03.getValue();
        float f8 = ((xs0_0)object2).a;
        boolean bl2 = xs0_0.a(f8, f7);
        if (!bl2) {
            object2 = new xs0_0(f7);
            tr1_03.setValue(object2);
        }
        return Unit.a;
    }
}

