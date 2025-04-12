/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

public final class F00$a$a
implements vj_2 {
    public final CompletableFuture a;

    public F00$a$a(F00$b f00$b) {
        this.a = f00$b;
    }

    public final void a(jj_2 object, dl2_2 object2) {
        object = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object).d();
        if (bl2) {
            object = this.a;
            object2 = ((dl2_2)object2).b;
            object = (F00$b)object;
            d00_0.a((F00$b)object, object2);
        } else {
            object = this.a;
            HttpException httpException = new HttpException((dl2_2)object2);
            object = (F00$b)object;
            e00_0.a((F00$b)object, httpException);
        }
    }

    public final void b(jj_2 jj_22, Throwable throwable) {
        c00_0.a(this.a, throwable);
    }
}

