/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from KS0
 */
public final class ks0_0
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ es0_2 e;
    public final /* synthetic */ gx0_2 f;

    public ks0_0(ys0_2 ys0_22, tk2$b_0 tk2$b_0, f80_0 f80_02) {
        this.d = null;
        this.e = ys0_22;
        this.f = tk2$b_0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ys0_2 ys0_22 = (ys0_2)this.e;
        tk2$b_0 tk2$b_0 = (tk2$b_0)this.f;
        ks0_0 ks0_02 = new ks0_0(ys0_22, tk2$b_0, f80_02);
        ks0_02.c = object;
        return ks0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (ks0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ks0_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Object object3;
            Object object4;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                int n7;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.b;
                            n3 = 2;
                            n7 = 1;
                            if (n4 == 0) break block2;
                            if (n4 == n7) break block3;
                            if (n4 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object4 = this.a;
                    object3 = (fs0_2)this.c;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = (fs0_2)this.c;
                object4 = new Ref$ObjectRef();
                ((Ref$ObjectRef)object4).element = object2 = this.d;
                this.c = object;
                this.a = object4;
                this.b = n7;
                object3 = object.emit(object2, this);
                if (object3 == j90_02) {
                    return j90_02;
                }
                object3 = object;
            }
            object2 = (tk2$b_0)this.f;
            object = new KS0$a((Ref$ObjectRef)object4, (tk2$b_0)object2, (fs0_2)object3);
            n4 = 0;
            this.c = null;
            this.a = null;
            this.b = n3;
            object4 = this.e;
            object = object4.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

