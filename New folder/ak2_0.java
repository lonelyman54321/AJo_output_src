/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ak2
 */
public final class ak2_0
extends qg3_2
implements gx0_2 {
    public /* synthetic */ ez0_0 a;
    public /* synthetic */ ez0_0 b;
    public final /* synthetic */ Rv1 c;

    public ak2_0(Rv1 rv1, f80_0 f80_02) {
        this.c = rv1;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (ez0_0)object;
        object2 = (ez0_0)object2;
        object3 = (f80_0)object3;
        Rv1 rv1 = this.c;
        ak2_0 ak2_02 = new ak2_0(rv1, (f80_0)object3);
        ak2_02.a = object;
        ak2_02.b = object2;
        object = Unit.a;
        return ak2_02.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object, "previous");
        Rv1 rv1 = this.c;
        Object object3 = "loadType";
        Intrinsics.checkNotNullParameter((Object)rv1, (String)object3);
        int n3 = ((ez0_0)object2).a;
        int n4 = ((ez0_0)object).a;
        if (n3 > n4) {
            bl2 = true;
        } else if (n3 < n4) {
            bl2 = false;
            rv1 = null;
        } else {
            object3 = ((ez0_0)object2).b;
            re3_0 re3_02 = ((ez0_0)object).b;
            bl2 = y61.a((re3_0)object3, re3_02, rv1);
        }
        if (bl2) {
            object = object2;
        }
        return object;
    }
}

