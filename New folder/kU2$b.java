/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

public final class kU2$b
extends qg3_2
implements Function2 {
    public ku2_0 a;
    public Ref$LongRef b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ku2_0 f;
    public final /* synthetic */ Ref$LongRef g;
    public final /* synthetic */ long h;

    public kU2$b(ku2_0 ku2_02, Ref$LongRef ref$LongRef, long l2, f80_0 f80_02) {
        this.f = ku2_02;
        this.g = ref$LongRef;
        this.h = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$LongRef ref$LongRef = this.g;
        long l2 = this.h;
        ku2_0 ku2_02 = this.f;
        kU2$b kU2$b = new kU2$b(ku2_02, ref$LongRef, l2, f80_02);
        kU2$b.e = object;
        return kU2$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (kU2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kU2$b)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var9_10;
        Object object2;
        Ref$LongRef ref$LongRef;
        long l2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.d;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            l2 = this.c;
            ref$LongRef = this.b;
            object2 = this.a;
            ku2_0 ku2_02 = (ku2_0)this.e;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (tU1)this.e;
            object2 = this.f;
            kU2$b$a kU2$b$a = new kU2$b$a((tU1)object, (ku2_0)object2);
            object = ((ku2_0)object2).c;
            ref$LongRef = this.g;
            long l3 = ref$LongRef.element;
            pg2_0 pg2_02 = ((ku2_0)object2).d;
            pg2_0 pg2_03 = pg2_0.Horizontal;
            long l4 = this.h;
            float f5 = pg2_02 == pg2_03 ? WA3.b(l4) : WA3.c(l4);
            f5 = ((ku2_0)object2).c(f5);
            this.e = object2;
            this.a = object2;
            this.b = ref$LongRef;
            this.c = l3;
            this.d = n4;
            object = object.a(kU2$b$a, f5, this);
            if (object == j90_02) {
                return j90_02;
            }
            l2 = l3;
            Object object3 = object2;
        }
        object = (Number)object;
        float f6 = ((Number)object).floatValue();
        f6 = var9_10.c(f6);
        object2 = ((ku2_0)object2).d;
        pg2_0 pg2_04 = pg2_0.Horizontal;
        if (object2 == pg2_04) {
            n4 = 2;
            l2 = WA3.a(f6, 0.0f, n4, l2);
        } else {
            l2 = WA3.a(0.0f, f6, n4, l2);
        }
        ref$LongRef.element = l2;
        return Unit.a;
    }
}

