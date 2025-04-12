/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w61
extends Lambda
implements Function2 {
    public final /* synthetic */ Rv1 c;
    public final /* synthetic */ re3_0 d;

    public w61(Rv1 rv1, re3_0 re3_02) {
        this.c = rv1;
        this.d = re3_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (v61$a)object;
        object2 = (v61$a)object2;
        Intrinsics.checkNotNullParameter(object, "prependHint");
        Intrinsics.checkNotNullParameter(object2, "appendHint");
        Rv1 rv1 = Rv1.PREPEND;
        Rv1 rv12 = this.c;
        re3_0 re3_02 = this.d;
        if (rv12 == rv1) {
            ((v61$a)object).a = re3_02;
            if (re3_02 != null) {
                object = ((v61$a)object).b;
                ((i23_0)object).a(re3_02);
            }
        } else {
            ((v61$a)object2).a = re3_02;
            if (re3_02 != null) {
                object = ((v61$a)object2).b;
                ((i23_0)object).a(re3_02);
            }
        }
        return Unit.a;
    }
}

