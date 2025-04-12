/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Th$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Uh b;
    public final /* synthetic */ Qh1 c;

    public Th$a$a(Uh uh, Sh1 sh1, f80_0 f80_02) {
        this.b = uh;
        this.c = sh1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sh1 sh1 = (Sh1)this.c;
        Uh uh = this.b;
        object = new Th$a$a(uh, sh1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Th$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Th$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Object object3;
            int n3;
            j90_0 j90_02;
            block6: {
                int n4;
                block3: {
                    block4: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n7 = this.a;
                        n3 = 2;
                        n4 = 1;
                        if (n7 == 0) break block3;
                        if (n7 == n4) break block4;
                        if (n7 != n3) {
                            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw illegalStateException;
                        }
                        vl2_2.b(object);
                        break block5;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                this.a = n4;
                yp1_2 yp1_22 = aQ1.a(this.getContext());
                object3 = Th$a$a$a.c;
                object2 = new zp1_1((Function1)object3);
                Object object4 = yp1_22.R((Function1)object2, this);
                if (object4 == j90_02) {
                    return j90_02;
                }
            }
            qr1_2 qr1_22 = this.b.k();
            if (qr1_22 == null) return Unit.a;
            object3 = (Sh1)this.c;
            object2 = new Th$a$a$b((Sh1)object3);
            this.a = n3;
            j90_0 j90_03 = i23_0.l((i23_0)qr1_22, (fs0_2)object2, this);
            if (j90_03 == j90_02) {
                return j90_02;
            }
        }
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }
}

