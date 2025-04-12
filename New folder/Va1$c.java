/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class Va1$c
extends qg3_2
implements ix0_2 {
    public int a;
    public /* synthetic */ jb1_2 b;
    public /* synthetic */ uf_1 c;
    public /* synthetic */ at3_0 d;
    public final /* synthetic */ Charset e;

    public Va1$c(Charset charset, f80_0 f80_02) {
        this.e = charset;
        super(5, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        object = (tq3_0)object;
        object2 = (jb1_2)object2;
        object3 = (uf_1)object3;
        object4 = (at3_0)object4;
        object5 = (f80_0)object5;
        Charset charset = this.e;
        object = new Va1$c(charset, (f80_0)object5);
        ((Va1$c)object).b = object2;
        ((Va1$c)object).c = object3;
        ((Va1$c)object).d = object4;
        object2 = Unit.a;
        return ((Va1$c)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Charset charset = null;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object3 = this.b;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.b;
            object2 = this.c;
            yn1_2 yn1_22 = this.d.a;
            yn1_2 yn1_23 = Reflection.getOrCreateKotlinClass(String.class);
            boolean bl2 = Intrinsics.areEqual(yn1_22, yn1_23);
            if (!bl2) {
                return null;
            }
            this.b = object;
            this.c = null;
            this.a = n4;
            if ((object2 = wf_1.k((uf_1)object2, this)) == object3) {
                return object3;
            }
            object3 = object;
            object = object2;
        }
        object = (b93_0)object;
        object3 = ((jb1_2)object3).a();
        object2 = va1_0.a;
        object2 = ((ea1_2)object3).d();
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = oa1_0.b((ma1_0)object2);
        if (object2 != null) {
            charset = m70_0.a((b41_0)object2);
        }
        if (charset == null) {
            charset = this.e;
        }
        object2 = new StringBuilder("Reading response body for ");
        object3 = ((ea1_2)object3).c().getUrl();
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(" as String with charset ");
        ((StringBuilder)object2).append(charset);
        object3 = ((StringBuilder)object2).toString();
        va1_0.a.g((String)object3);
        return be3_1.a((b93_0)object, charset, 2);
    }
}

