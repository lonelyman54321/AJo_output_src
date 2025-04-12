/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Renamed from BI
 */
public final class bi_0
implements Callable {
    public final /* synthetic */ ai_0 a;

    public bi_0(ai_0 ai_02) {
        this.a = ai_02;
    }

    public final Object call() {
        ai_0 ai_02 = this.a;
        Object object = ai_02.e.b();
        String string2 = da2_0.a(ai_02.e);
        object.b(string2, "Product Config: fetch Success");
        object = AI$f.FETCHED;
        ai_02.h((AI$f)((Object)object));
        return null;
    }
}

