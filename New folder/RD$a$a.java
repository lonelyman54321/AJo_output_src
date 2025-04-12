/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics$Kotlin;

public final class RD$a$a
extends FunctionReferenceImpl
implements Function0 {
    public final /* synthetic */ QD a;
    public final /* synthetic */ zp1 b;
    public final /* synthetic */ Function0 c;

    public RD$a$a(QD qD, w32_0 w32_02, Function0 function0) {
        this.a = qD;
        this.b = w32_02;
        this.c = function0;
        super(0, Intrinsics.Kotlin.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
    }

    public final Object invoke() {
        w32_0 w32_02 = (w32_0)this.b;
        QD qD = this.a;
        Function0 function0 = this.c;
        return QD.r1(qD, w32_02, function0);
    }
}

