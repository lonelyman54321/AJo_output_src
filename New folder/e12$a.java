/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.query.QueryCodWithProductCode;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class e12$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ e12_0 e;
    public final /* synthetic */ QueryCodWithProductCode f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ String h;

    public e12$a(boolean bl2, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, e12_0 e12_02, QueryCodWithProductCode queryCodWithProductCode, Ref$ObjectRef ref$ObjectRef3, String string2, f80_0 f80_02) {
        this.b = bl2;
        this.c = ref$ObjectRef;
        this.d = ref$ObjectRef2;
        this.e = e12_02;
        this.f = queryCodWithProductCode;
        this.g = ref$ObjectRef3;
        this.h = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.g;
        String string2 = this.h;
        boolean bl2 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.c;
        Ref$ObjectRef ref$ObjectRef3 = this.d;
        e12_0 e12_02 = this.e;
        QueryCodWithProductCode queryCodWithProductCode = this.f;
        object = new e12$a(bl2, ref$ObjectRef2, ref$ObjectRef3, e12_02, queryCodWithProductCode, ref$ObjectRef, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e12$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e12$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            QueryCodWithProductCode queryCodWithProductCode;
            Object object3;
            Object object4;
            Ref$ObjectRef ref$ObjectRef;
            boolean bl2;
            int n3;
            j90_0 j90_02;
            block6: {
                int n4;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n4) break block3;
                            if (n7 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                Ref$ObjectRef ref$ObjectRef2 = this.g;
                bl2 = this.b;
                ref$ObjectRef = this.c;
                object4 = this.d;
                object3 = this.e;
                queryCodWithProductCode = this.f;
                object2 = object;
                object = new e12$a$a(bl2, ref$ObjectRef, (Ref$ObjectRef)object4, (e12_0)object3, queryCodWithProductCode, ref$ObjectRef2, null);
                this.a = n4;
                object = be_1.c((Function2)object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = ir0_2.a;
            object = bg1_1.a;
            object3 = this.h;
            queryCodWithProductCode = null;
            object2 = this.c;
            bl2 = this.b;
            ref$ObjectRef = this.d;
            object4 = this.e;
            e12$a$b e12$a$b = new e12$a$b((Ref$ObjectRef)object2, bl2, ref$ObjectRef, (e12_0)object4, (String)object3, null);
            this.a = n3;
            object = Ae3.g(this, (CoroutineContext)object, e12$a$b);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

