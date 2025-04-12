/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XO0
 */
public final class xo0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public xo0_1(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new xo0_1(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xo0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xo0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object2 = h40_0.a;
        object2 = h40_0.W();
        int n3 = ((ArrayList)object2).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Boolean bl2;
            p83_0 p83_02 = ((dr0_0)object).F0;
            Object object3 = CollectionsKt.N(i3, p83_02);
            boolean bl3 = Intrinsics.areEqual(object3, bl2 = Boolean.TRUE);
            if (bl3) continue;
            object3 = Boolean.FALSE;
            p83_02.add(object3);
        }
        return Unit.a;
    }
}

