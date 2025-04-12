/*
 * Decompiled with CFR 0.152.
 */
import com.jpl.crasdk.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class AH$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ Integer b;

    public AH$c(Boolean bl2, Integer n3, f80_0 f80_02) {
        this.a = bl2;
        this.b = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Boolean bl2 = this.a;
        Integer n3 = this.b;
        object = new AH$c(bl2, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (AH$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((AH$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = JI3.a;
        if (object != null) {
            object2 = this.a;
            boolean bl2 = (Boolean)object2;
            Object object3 = com.jpl.crasdk.a.c;
            if (object3 == null) {
                String string2;
                object3 = new Object();
                ((a)object3).b = string2 = "";
                com.jpl.crasdk.a.c = object3;
            }
            object3 = com.jpl.crasdk.a.c;
            Intrinsics.checkNotNull(object3);
            object3 = ((a)object3).a;
            object3 = this.b;
            object3.getClass();
            object.A1(bl2);
        }
        return Unit.a;
    }
}

