/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Yg1
 */
public final class yg1_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ Vg1$a d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Ug1 f;

    public yg1_0(Number number, Vg1$a vg1$a, Number number2, Ug1 ug1) {
        this.c = number;
        this.d = vg1$a;
        this.e = number2;
        this.f = ug1;
        super(0);
    }

    public final Object invoke() {
        Vg1$a vg1$a = this.d;
        Object object = this.c;
        Object object2 = vg1$a.a;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2 || !(bl2 = Intrinsics.areEqual(object = this.e, object2 = vg1$a.b))) {
            Object object3;
            Object object4;
            vg1$a.a = object4 = this.c;
            vg1$a.b = object3 = this.e;
            Ug1 ug1 = this.f;
            vg1$a.e = ug1;
            Vs3 vs3 = vg1$a.c;
            object = object2;
            vg1$a.f = object2 = new ni3_0(ug1, vs3, object4, object3, null);
            object2 = Boolean.TRUE;
            object = vg1$a.j.b;
            ((h83_0)object).setValue(object2);
            object2 = null;
            vg1$a.g = false;
            vg1$a.h = bl2 = true;
        }
        return Unit.a;
    }
}

