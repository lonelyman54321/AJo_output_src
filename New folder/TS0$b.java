/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class TS0$b
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ fs0_2 e;

    public TS0$b(f80_0 f80_02, fs0_2 fs0_22, Ref$ObjectRef ref$ObjectRef) {
        this.d = ref$ObjectRef;
        this.e = fs0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.d;
        fs0_2 fs0_22 = this.e;
        TS0$b tS0$b = new TS0$b(f80_02, fs0_22, ref$ObjectRef);
        tS0$b.c = object;
        return tS0$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = ((vr_2)object).a;
        object2 = (f80_0)object2;
        vr_2 vr_22 = new vr_2(object);
        object = (TS0$b)this.create(vr_22, (f80_0)object2);
        object2 = Unit.a;
        return ((TS0$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block13: {
            Object object2;
            block14: {
                block15: {
                    Object object3;
                    Object object4;
                    block12: {
                        int n3;
                        int n4;
                        block10: {
                            block11: {
                                object4 = j90_0.COROUTINE_SUSPENDED;
                                n4 = this.b;
                                n3 = 1;
                                if (n4 == 0) break block10;
                                if (n4 != n3) break block11;
                                object4 = this.a;
                                vl2_2.b(object);
                                break block12;
                            }
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        object = ((vr_2)this.c).a;
                        n4 = object instanceof VR$b;
                        object3 = this.d;
                        if (n4 == 0) {
                            ((Ref$ObjectRef)object3).element = object;
                        }
                        if (n4 == 0) break block13;
                        n4 = object instanceof VR$a;
                        Object object5 = null;
                        if (n4 != 0) {
                            object2 = object;
                            object2 = (VR$a)object;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        if (object2 != null) {
                            object2 = ((VR$a)object2).a;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        if (object2 != null) break block14;
                        object2 = ((Ref$ObjectRef)object3).element;
                        if (object2 == null) break block15;
                        gh3_2 gh3_22 = k52_0.a;
                        if (object2 != gh3_22) {
                            object5 = object2;
                        }
                        this.c = object;
                        this.a = object3;
                        this.b = n3;
                        object = this.e.emit(object5, this);
                        if (object == object4) {
                            return object4;
                        }
                        object4 = object3;
                    }
                    object3 = object4;
                }
                ((Ref$ObjectRef)object3).element = object = k52_0.c;
                break block13;
            }
            throw object2;
        }
        return Unit.a;
    }
}

