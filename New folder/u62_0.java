/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u62
 */
public final class u62_0
extends bg2$d_0 {
    public final bg2_2 a;
    public final CoroutineContext b;
    public final qb2_2 c;
    public final uf_1 d;

    public u62_0(bg2_2 object, CoroutineContext coroutineContext, qb2_2 qb2_22) {
        Intrinsics.checkNotNullParameter(object, "delegate");
        Intrinsics.checkNotNullParameter(coroutineContext, "callContext");
        Intrinsics.checkNotNullParameter(qb2_22, "listener");
        this.a = object;
        this.b = coroutineContext;
        this.c = qb2_22;
        this.d = object = this.f((bg2_2)object);
    }

    public final Long a() {
        return this.a.a();
    }

    public final k70_0 b() {
        return this.a.b();
    }

    public final l41_0 c() {
        return this.a.c();
    }

    public final ub1_2 d() {
        return this.a.d();
    }

    public final uf_1 e() {
        Long l2 = this.a.a();
        qb2_2 qb2_22 = this.c;
        uf_1 uf_12 = this.d;
        CoroutineContext coroutineContext = this.b;
        return nf_2.a(uf_12, coroutineContext, l2, qb2_22);
    }

    public final uf_1 f(bg2_2 object) {
        block7: {
            block3: {
                boolean bl2;
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                bl2 = object instanceof bg2$b_0;
                                if (!bl2) break block2;
                                ((bg2$b_0)object).getClass();
                                object = this.f(null);
                                break block3;
                            }
                            bl2 = object instanceof bg2$a_0;
                            if (!bl2) break block4;
                            object = cg2_0.c(((bg2$a_0)object).e());
                            break block3;
                        }
                        bl2 = object instanceof bg2$c_0;
                        if (!bl2) break block5;
                        uf_1.a.getClass();
                        object = uF$a.b;
                        break block3;
                    }
                    bl2 = object instanceof bg2$d_0;
                    if (!bl2) break block6;
                    object = ((bg2$d_0)object).e();
                    break block3;
                }
                bl2 = object instanceof bg2$e_0;
                if (!bl2) break block7;
                e01_0 e01_02 = e01_0.a;
                u62$a u62$a = new u62$a((bg2_2)object, null);
                object = this.b;
                object = kf_1.d((i90_0)e01_02, (CoroutineContext)object, (Function2)u62$a).a;
            }
            return object;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

