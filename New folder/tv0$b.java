/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class tv0$b
implements Function2 {
    public final /* synthetic */ tv0_2 a;

    public tv0$b(tv0_2 tv0_22) {
        this.a = tv0_22;
    }

    public final Object invoke(Object object, Object object2) {
        block7: {
            block3: {
                boolean bl2;
                Object object3;
                Object object4;
                Object object5;
                int n3;
                block6: {
                    int n4;
                    block5: {
                        block4: {
                            block2: {
                                object = (b30_0)object;
                                n3 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
                                if (n3 != (n4 = 2) || (n3 = (int)(object.h() ? 1 : 0)) == 0) break block2;
                                object.D();
                                break block3;
                            }
                            object2 = Unit.a;
                            object5 = this.a;
                            object4 = new vv0_2((tv0_2)object5, null);
                            ly0_0.d((b30_0)object, object2, (Function2)object4);
                            object4 = (bv0_1)((tv0_2)object5).Pa().b.getValue();
                            object3 = Bv0$b.a;
                            bl2 = Intrinsics.areEqual(object4, object3);
                            if (!bl2) break block4;
                            n3 = -438910281;
                            object.K(n3);
                            object.E();
                            break block3;
                        }
                        object3 = Bv0$c.a;
                        bl2 = Intrinsics.areEqual(object4, object3);
                        if (!bl2) break block5;
                        n3 = -438809097;
                        object.K(n3);
                        object.E();
                        break block3;
                    }
                    bl2 = object4 instanceof Bv0$a;
                    if (!bl2) break block6;
                    n4 = -438696040;
                    object.K(n4);
                    object4 = new wv0_2((tv0_2)object5, null);
                    ly0_0.d((b30_0)object, object2, (Function2)object4);
                    object.E();
                    break block3;
                }
                n3 = object4 instanceof Bv0$d;
                if (n3 == 0) break block7;
                n3 = -438365611;
                object.K(n3);
                object2 = ((tv0_2)object5).Pa();
                Object object6 = object4;
                object6 = (Bv0$d)object4;
                uv0_2 uv0_22 = new uv0_2((tv0_2)object5);
                String string2 = "onResult()V";
                bl2 = false;
                String string3 = "onResult";
                xv0_2 xv0_22 = new FunctionReferenceImpl(0, object5, tv0_2.class, string3, string2, 0);
                int n7 = 72;
                object4 = object2;
                object3 = uv0_22;
                object5 = xv0_22;
                rv0_1.a((ov0_0)object2, (Bv0$d)object6, uv0_22, xv0_22, (b30_0)object, n7);
                object.E();
            }
            return Unit.a;
        }
        object.K(-845444548);
        object.E();
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

