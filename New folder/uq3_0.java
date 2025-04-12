/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Uq3
 */
public final class uq3_0
extends qg3_2
implements gx0_2 {
    public at3_0 a;
    public int b;
    public /* synthetic */ is2_2 c;
    public final /* synthetic */ ix0_2 d;

    public uq3_0(ix0_2 ix0_22, f80_0 f80_02) {
        this.d = ix0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        ix0_2 ix0_22 = this.d;
        object2 = new uq3_0(ix0_22, (f80_0)object3);
        ((uq3_0)object2).c = object;
        object = Unit.a;
        return ((uq3_0)object2).invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            Object object2;
            Object object3;
            Object object4;
            int n3;
            Object object5;
            block9: {
                int n4;
                int n7;
                block5: {
                    block6: {
                        block7: {
                            object5 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.b;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block5;
                            if (n7 == n4) break block6;
                            if (n7 != n3) break block7;
                            vl2_2.b(object);
                            break block8;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object4 = this.a;
                    object3 = this.c;
                    vl2_2.b(object);
                    break block9;
                }
                vl2_2.b(object);
                object = this.c;
                object4 = (kb1_2)((is2_2)object).b();
                at3_0 at3_02 = ((kb1_2)object4).a;
                Object object6 = ((kb1_2)object4).b;
                n7 = object6 instanceof uf_1;
                if (n7 == 0) {
                    return Unit.a;
                }
                tq3_0 tq3_02 = new tq3_0();
                jb1_2 jb1_22 = ((ea1_2)((is2_2)object).a).d();
                this.c = object;
                this.a = at3_02;
                this.b = n4;
                object2 = this.d;
                object4 = object2.invoke(tq3_02, jb1_22, object6, at3_02, this);
                if (object4 == object5) {
                    return object5;
                }
                object3 = object;
                object = object4;
                object4 = at3_02;
            }
            if (object == null) {
                return Unit.a;
            }
            boolean bl2 = object instanceof g52_0;
            if (!bl2 && !(bl2 = (object2 = ((at3_0)object4).a).isInstance(object))) {
                StringBuilder stringBuilder = new StringBuilder("transformResponseBody returned ");
                stringBuilder.append(object);
                stringBuilder.append(" but expected value of type ");
                stringBuilder.append(object4);
                object = stringBuilder.toString();
                object5 = new IllegalStateException((String)object);
                throw object5;
            }
            object2 = new kb1_2((at3_0)object4, object);
            this.c = null;
            this.a = null;
            this.b = n3;
            object = ((is2_2)object3).d(this, object2);
            if (object == object5) {
                return object5;
            }
        }
        return Unit.a;
    }
}

