/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class cx$b
extends Lambda
implements Function0 {
    public final /* synthetic */ ql3_0 c;
    public final /* synthetic */ tr1_0 d;

    public cx$b(ql3_0 ql3_02, tr1_0 tr1_02) {
        this.c = ql3_02;
        this.d = tr1_02;
        super(0);
    }

    public final Object invoke() {
        mm3 mm32;
        mm3 mm33;
        ql3_0 ql3_02 = this.c;
        long l2 = ql3_02.b;
        tr1_0 tr1_02 = this.d;
        ql3_0 ql3_03 = (ql3_0)tr1_02.getValue();
        long l3 = ql3_03.b;
        boolean bl2 = mm3.a(l2, l3);
        if (!bl2 || !(bl2 = Intrinsics.areEqual(mm33 = ql3_02.c, mm32 = ((ql3_0)tr1_02.getValue()).c))) {
            tr1_02.setValue(ql3_02);
        }
        return Unit.a;
    }
}

