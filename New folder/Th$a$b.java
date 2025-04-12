/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics$Kotlin;

public final class Th$a$b
extends FunctionReferenceImpl
implements Function1 {
    public final /* synthetic */ Qt1$a a;

    public Th$a$b(Qt1$a qt1$a) {
        this.a = qt1$a;
        super(1, Intrinsics$Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
    }

    public final Object invoke(Object object) {
        object = ((QK1)object).a;
        zp1 zp12 = this.a.B();
        if (zp12 != null) {
            boolean bl2 = zp12.e();
            if (!bl2) {
                zp12 = null;
            }
            if (zp12 != null) {
                zp12.L((float[])object);
            }
        }
        return Unit.a;
    }
}

