/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from jY2
 */
public final class jy2_2
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;

    public jy2_2(Ref$BooleanRef ref$BooleanRef) {
        this.c = ref$BooleanRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = ((KX2)object).f.a.a.a;
        int n3 = ((String)object).length();
        if (n3 > 0) {
            object = this.c;
            ((Ref$BooleanRef)object).element = false;
        }
        return Unit.a;
    }
}

