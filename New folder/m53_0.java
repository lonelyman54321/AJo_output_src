/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions$d;
import java.util.concurrent.Callable;

/*
 * Renamed from M53
 */
public final class m53_0
extends g53_0 {
    public final Callable a;

    public m53_0(Functions$d functions$d) {
        this.a = functions$d;
    }

    public final void g(t53_0 t53_02) {
        Object object = this.a;
        object = object.call();
        String string2 = "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.";
        try {
            x03_0.b(object, string2);
            object = (Throwable)object;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
        }
        iz0_2.error((Throwable)object, t53_02);
    }
}

