/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from rx2
 */
public final class rx2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ux2_1 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Map f;

    public rx2_2(ux2_1 ux2_12, Ref$ObjectRef ref$ObjectRef, String string2, HashMap hashMap, f80_0 f80_02) {
        this.c = ux2_12;
        this.d = ref$ObjectRef;
        this.e = string2;
        this.f = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rx2_2 rx2_22;
        Ref$ObjectRef ref$ObjectRef = this.d;
        Object object2 = this.f;
        Map map2 = object2;
        map2 = (HashMap)object2;
        ux2_1 ux2_12 = this.c;
        String string2 = this.e;
        object2 = rx2_22;
        rx2_22 = new rx2_2(ux2_12, ref$ObjectRef, string2, (HashMap)map2, f80_02);
        rx2_22.b = object;
        return rx2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (rx2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rx2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Map map2;
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
                String string2 = (String)this.d.element;
                Object object3 = new StringBuilder("Bearer ");
                String string3 = this.e;
                ((StringBuilder)object3).append(string3);
                string3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullExpressionValue("Android", "access$getClientType$p(...)");
                this.b = object2;
                this.a = n3;
                map2 = this.f;
                object3 = map2;
                object3 = (HashMap)map2;
                String string4 = ((ux2_1)object).b;
                object = wx2_12.d(string2, (HashMap)object3, string3, string4, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            map2 = null;
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

