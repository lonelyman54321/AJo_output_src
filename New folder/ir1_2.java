/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ir1
 */
public final class ir1_2
extends qg3_2
implements Function2 {
    public un0_0 a;
    public int b;
    public final /* synthetic */ Gr1 c;
    public final /* synthetic */ un0_0 d;
    public final /* synthetic */ long e;

    public ir1_2(Gr1 gr1, long l2, f80_0 f80_02) {
        this.c = gr1;
        this.d = null;
        this.e = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.e;
        Gr1 gr1 = this.c;
        object = new ir1_2(gr1, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ir1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ir1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        Gr1 gr1;
        block43: {
            Object object2;
            Object object3;
            int n4;
            long l2;
            j90_0 j90_02;
            block47: {
                block46: {
                    Object object4;
                    block44: {
                        int n7;
                        block45: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n8 = this.b;
                            l2 = this.e;
                            n4 = 2;
                            n7 = 1;
                            gr1 = this.c;
                            if (n8 != 0) {
                                if (n8 != n7) {
                                    if (n8 == n4) {
                                        vl2_2.b(object);
                                        break block43;
                                    }
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                object4 = this.a;
                                vl2_2.b(object);
                                break block44;
                            }
                            vl2_2.b(object);
                            try {
                                object = gr1.o;
                            }
                            catch (CancellationException cancellationException) {
                                return Unit.a;
                            }
                            object4 = gr1.o;
                            object = ((Lj)object).d;
                            object = ((h83_0)object).getValue();
                            object = (Boolean)object;
                            n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                            object3 = this.d;
                            if (n3 == 0) break block45;
                            n3 = object3 instanceof xa3_2;
                            if (n3 != 0) {
                                object3 = (xa3_2)object3;
                            } else {
                                object3 = Kr1.a;
                            }
                        }
                        object = ((Lj)object4).d;
                        object = ((h83_0)object).getValue();
                        object = (Boolean)object;
                        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                        if (n3 != 0) break block46;
                        object = new Si1(l2);
                        this.a = object3;
                        this.b = n7;
                        object = ((Lj)object4).e(this, object);
                        if (object == j90_02) {
                            return j90_02;
                        }
                        object4 = object3;
                    }
                    object = gr1.c;
                    object.invoke();
                    object2 = object4;
                    break block47;
                }
                object2 = object3;
            }
            object = gr1.o;
            object = ((Lj)object).d();
            object = (Si1)object;
            long l3 = ((Si1)object).a;
            long l4 = Si1.c(l3, l2);
            object3 = gr1.o;
            Si1 si1 = new Si1(l4);
            Ir1$a ir1$a = new Ir1$a(gr1, l4);
            n3 = 0;
            object = null;
            this.a = null;
            this.b = n4;
            int n10 = 4;
            object = Lj.c((Lj)object3, si1, (Gl)object2, ir1$a, this, n10);
            if (object != j90_02) break block43;
            return j90_02;
        }
        n3 = Gr1.t;
        n3 = 0;
        object = null;
        gr1.f(false);
        gr1.g = false;
        return Unit.a;
    }
}

