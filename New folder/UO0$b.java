/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class UO0$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public UO0$b(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new UO0$b(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (UO0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((UO0$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = Locale.ROOT;
        object = "ajio".toUpperCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object, "toUpperCase(...)");
        object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "storeId");
        Intrinsics.checkNotNullParameter("Fleek Home Screen", "screenName");
        aW aW2 = md3_0.c((jD3)object2);
        mr0_0 mr0_02 = new mr0_0((dr0_0)object2, (String)object, null);
        Ae3.d(aW2, null, null, mr0_02, 3);
        return Unit.a;
    }
}

