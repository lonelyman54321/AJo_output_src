/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.a;
import java.util.concurrent.Callable;

/*
 * Renamed from gV
 */
public final class gv_0
implements Callable {
    public final /* synthetic */ a a;

    public /* synthetic */ gv_0(a a2) {
        this.a = a2;
    }

    public final Object call() {
        Object object = this.a;
        String string2 = ((a)object).b.c.f();
        if (string2 != null) {
            object = ((a)object).b.n;
            ((By1)object).f();
        }
        return null;
    }
}

