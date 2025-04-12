/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lx1
 */
public final class lx1_2
extends qg3_2
implements Function2 {
    public Charset a;
    public int b;
    public final /* synthetic */ if_1 c;
    public final /* synthetic */ Charset d;
    public final /* synthetic */ StringBuilder e;
    public final /* synthetic */ fa1_1 f;

    public lx1_2(if_1 if_12, Charset charset, StringBuilder stringBuilder, fa1_1 fa1_12, f80_0 f80_02) {
        this.c = if_12;
        this.d = charset;
        this.e = stringBuilder;
        this.f = fa1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        StringBuilder stringBuilder = this.e;
        fa1_1 fa1_12 = this.f;
        if_1 if_12 = this.c;
        Charset charset = this.d;
        object = new lx1_2(if_12, charset, stringBuilder, fa1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lx1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lx1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable3;
        StringBuilder stringBuilder;
        fa1_1 fa1_12;
        String string2;
        Object object2;
        block12: {
            object2 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.b;
            string2 = "toString(...)";
            int n4 = 1;
            fa1_12 = this.f;
            stringBuilder = this.e;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                object2 = this.a;
                vl2_2.b(object);
            } else {
                vl2_2.b(object);
                object = this.c;
                Charset charset = this.d;
                this.a = charset;
                this.b = n4;
                object = wf_1.k((uf_1)object, this);
                if (object == object2) {
                    return object2;
                }
                object2 = charset;
            }
            try {
                object = (b93_0)object;
                n3 = 2;
                object = be3_1.a((b93_0)object, (Charset)object2, n3);
            }
            catch (Throwable throwable2) {
                object = null;
            }
            if (object == null) {
                object = "[request body omitted]";
            }
            object2 = "BODY START";
            try {
                stringBuilder.append((String)object2);
                char c2 = '\n';
                stringBuilder.append(c2);
                stringBuilder.append((String)object);
                stringBuilder.append(c2);
                object = "BODY END";
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
            }
            catch (Throwable throwable3) {}
            break block12;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            fa1_12.c((String)object);
            fa1_12.a();
            return Unit.a;
        }
        object2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        fa1_12.c((String)object2);
        fa1_12.a();
        throw throwable3;
    }
}

