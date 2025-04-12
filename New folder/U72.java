/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class U72
extends qg3_2
implements Function2 {
    public Ref$BooleanRef a;
    public int b;
    public final /* synthetic */ W72 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ V72 e;

    public U72(W72 w72, Function2 function2, V72 v72, f80_0 f80_02) {
        this.c = w72;
        this.d = function2;
        this.e = v72;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.d;
        V72 v72 = this.e;
        W72 w72 = this.c;
        object = new U72(w72, function2, v72, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (U72)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((U72)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            boolean bl2;
            Object object2;
            block7: {
                int n3;
                block5: {
                    block6: {
                        object2 = j90_0.COROUTINE_SUSPENDED;
                        int n4 = this.b;
                        n3 = 1;
                        if (n4 == 0) break block5;
                        if (n4 != n3) break block6;
                        object2 = this.a;
                        vl2_2.b(object);
                        break block7;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                object = this.c;
                bl2 = ((W72)object).isEnabled();
                if (!bl2) break block8;
                object = new Ref$BooleanRef();
                Object object3 = ms0_1.g(this.e.b);
                U72$a u72$a = new U72$a((Ref$BooleanRef)object, null);
                xs0_2 xs0_22 = new xs0_2((es0_2)object3, u72$a);
                this.a = object;
                this.b = n3;
                object3 = this.d.invoke(xs0_22, this);
                if (object3 == object2) {
                    return object2;
                }
                object2 = object;
            }
            bl2 = ((Ref$BooleanRef)object2).element;
            if (!bl2) {
                object2 = "You must collect the progress flow".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        return Unit.a;
    }
}

