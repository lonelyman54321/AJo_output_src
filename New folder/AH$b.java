/*
 * Decompiled with CFR 0.152.
 */
import com.jpl.crasdk.CraActivity;
import com.jpl.crasdk.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class AH$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ ah_1 a;

    public AH$b(ah_1 ah_12, f80_0 f80_02) {
        this.a = ah_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ah_1 ah_12 = this.a;
        object = new AH$b(ah_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (AH$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((AH$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.a;
        object2 = "null cannot be cast to non-null type com.jpl.crasdk.CraActivity";
        Intrinsics.checkNotNull(object, (String)object2);
        ((CraActivity)object).getClass();
        object = com.jpl.crasdk.a.c;
        if (object == null) {
            object = new Object();
            object2 = "";
            ((a)object).b = object2;
            com.jpl.crasdk.a.c = object;
        }
        object = com.jpl.crasdk.a.c;
        Intrinsics.checkNotNull(object);
        object = ((a)object).a;
        return Unit.a;
    }
}

