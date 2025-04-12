/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from aW2
 */
public final class aw2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dw2_0 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Map e;

    public aw2_2(dw2_0 dw2_02, Ref$ObjectRef ref$ObjectRef, HashMap hashMap, f80_0 f80_02) {
        this.c = dw2_02;
        this.d = ref$ObjectRef;
        this.e = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.d;
        HashMap hashMap = (HashMap)this.e;
        dw2_0 dw2_02 = this.c;
        aw2_2 aw2_22 = new aw2_2(dw2_02, ref$ObjectRef, hashMap, f80_02);
        aw2_22.b = object;
        return aw2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (aw2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((aw2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            HashMap hashMap;
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
                object = this.c.a;
                String string2 = (String)this.d.element;
                this.b = object2;
                this.a = n3;
                hashMap = (HashMap)this.e;
                object = ((IV2)object).c(string2, hashMap, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            hashMap = null;
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

