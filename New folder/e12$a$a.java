/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.query.QueryCodWithProductCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobSupport;

public final class e12$a$a
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ e12_0 g;
    public final /* synthetic */ QueryCodWithProductCode h;
    public final /* synthetic */ Ref$ObjectRef i;

    public e12$a$a(boolean bl2, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, e12_0 e12_02, QueryCodWithProductCode queryCodWithProductCode, Ref$ObjectRef ref$ObjectRef3, f80_0 f80_02) {
        this.d = bl2;
        this.e = ref$ObjectRef;
        this.f = ref$ObjectRef2;
        this.g = e12_02;
        this.h = queryCodWithProductCode;
        this.i = ref$ObjectRef3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QueryCodWithProductCode queryCodWithProductCode = this.h;
        Ref$ObjectRef ref$ObjectRef = this.i;
        boolean bl2 = this.d;
        Ref$ObjectRef ref$ObjectRef2 = this.e;
        Ref$ObjectRef ref$ObjectRef3 = this.f;
        e12_0 e12_02 = this.g;
        e12$a$a e12$a$a = new e12$a$a(bl2, ref$ObjectRef2, ref$ObjectRef3, e12_02, queryCodWithProductCode, ref$ObjectRef, f80_02);
        e12$a$a.c = object;
        return e12$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e12$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e12$a$a)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        block14: {
            Object object2;
            Object object3;
            int n3;
            e12_0 e12_02;
            int n4;
            j90_0 j90_02;
            block17: {
                block16: {
                    block15: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n7 = this.b;
                        n4 = 3;
                        e12_02 = this.g;
                        n3 = 2;
                        int n8 = 1;
                        if (n7 != 0) {
                            if (n7 != n8) {
                                if (n7 != n3) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)this.c;
                                vl2_2.b(object);
                                break block14;
                            }
                            object3 = this.a;
                            object2 = (i90_0)this.c;
                            vl2_2.b(object);
                            break block15;
                        }
                        vl2_2.b(object);
                        object = (i90_0)this.c;
                        n7 = (int)(this.d ? 1 : 0);
                        if (n7 != 0) break block17;
                        Object object4 = this.h;
                        object3 = new e12$a$a$b(e12_02, (QueryCodWithProductCode)object4, null);
                        object3 = Ae3.a((i90_0)object, null, (Function2)object3, n4);
                        object4 = this.e;
                        this.c = object;
                        this.a = object4;
                        this.b = n8;
                        object3 = ((JobSupport)object3).D(this);
                        if (object3 == j90_02) {
                            return j90_02;
                        }
                        object2 = object;
                        object = object3;
                        object3 = object4;
                    }
                    try {
                        ((Ref$ObjectRef)object3).element = object;
                        break block16;
                    }
                    catch (Exception exception) {}
                    catch (Exception exception) {
                        object2 = object;
                    }
                }
                object = object2;
            }
            object2 = this.i;
            object3 = new e12$a$a$a(e12_02, (Ref$ObjectRef)object2, null);
            object = Ae3.a((i90_0)object, null, (Function2)object3, n4);
            try {
                this.c = object3 = this.f;
                this.a = null;
                this.b = n3;
                object = ((JobSupport)object).D(this);
            }
            catch (Exception exception) {
                return Unit.a;
            }
            if (object == j90_02) {
                return j90_02;
            }
            Object object5 = object3;
        }
        var2_5.element = object;
        return Unit.a;
    }
}

