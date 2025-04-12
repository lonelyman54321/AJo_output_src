/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tx2
 */
public final class tx2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ux2_1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cr1$c_0 f;

    public tx2_2(ux2_1 ux2_12, String string2, String string3, cr1$c_0 cr1$c_0, f80_0 f80_02) {
        this.c = ux2_12;
        this.d = string2;
        this.e = string3;
        this.f = cr1$c_0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        cr1$c_0 cr1$c_0 = this.f;
        ux2_1 ux2_12 = this.c;
        String string3 = this.d;
        tx2_2 tx2_22 = new tx2_2(ux2_12, string3, string2, cr1$c_0, f80_02);
        tx2_22.b = object;
        return tx2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (tx2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tx2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (fs0_2)object;
                object = this.c;
                wx2_1 wx2_12 = ((ux2_1)object).a;
                CharSequence charSequence = new StringBuilder("Bearer ");
                String string2 = this.e;
                charSequence.append(string2);
                string2 = charSequence.toString();
                Intrinsics.checkNotNullExpressionValue("Android", "access$getClientType$p(...)");
                this.b = object2;
                this.a = n3;
                charSequence = this.d;
                cr1$c_0 cr1$c_0 = this.f;
                String string3 = ((ux2_1)object).b;
                object = wx2_12.m((String)charSequence, string2, string3, cr1$c_0, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            this.b = null;
            this.a = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

