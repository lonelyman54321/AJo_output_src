/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x61
extends Lambda
implements Function2 {
    public final /* synthetic */ re3_0 c;

    public x61(re3_0 re3_02) {
        this.c = re3_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        object = (v61$a)object;
        object2 = (v61$a)object2;
        Intrinsics.checkNotNullParameter(object, "prependHint");
        Intrinsics.checkNotNullParameter(object2, "appendHint");
        Object object3 = ((v61$a)object).a;
        Rv1 rv1 = Rv1.PREPEND;
        re3_0 re3_02 = this.c;
        boolean bl3 = y61.a(re3_02, object3, rv1);
        if (bl3) {
            ((v61$a)object).a = re3_02;
            object = ((v61$a)object).b;
            ((i23_0)object).a(re3_02);
        }
        if (bl2 = y61.a(re3_02, (re3_0)(object = ((v61$a)object2).a), (Rv1)((Object)(object3 = Rv1.APPEND)))) {
            ((v61$a)object2).a = re3_02;
            object = ((v61$a)object2).b;
            ((i23_0)object).a(re3_02);
        }
        return Unit.a;
    }
}

