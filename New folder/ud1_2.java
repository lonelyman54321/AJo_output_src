/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ud1
 */
public final class ud1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ he1_2 a;
    public final /* synthetic */ PA b;
    public final /* synthetic */ s50_0 c;

    public ud1_2(he1_2 he1_22, PA pA, s50_0 s50_02, f80_0 f80_02) {
        this.a = he1_22;
        this.b = pA;
        this.c = s50_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PA pA = this.b;
        s50_0 s50_02 = this.c;
        he1_2 he1_22 = this.a;
        object = new ud1_2(he1_22, pA, s50_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ud1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ud1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        int n3;
        vl2_2.b(object);
        object = this.a;
        long l3 = ((he1_2)object).f;
        long l4 = l3 >> 32;
        int n4 = (int)l4;
        PA pA = this.b;
        if (n4 > 0 && (n3 = (int)(l3 &= (l2 = 0xFFFFFFFFL))) > 0) {
            pA.getClass();
            l3 = c60.a(n4, n4, n3, n3);
        } else {
            l3 = pA.b();
        }
        object = this.c;
        if (object != null) {
            object.a(l3);
        }
        return Unit.a;
    }
}

