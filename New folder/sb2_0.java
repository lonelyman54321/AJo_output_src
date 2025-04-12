/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.e$a;
import com.facebook.e$b;
import com.facebook.h;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sB2
 */
public final class sb2_0
implements Runnable {
    public final /* synthetic */ e$a a;
    public final /* synthetic */ h b;

    public /* synthetic */ sb2_0(e$b e$b, h h3) {
        this.a = e$b;
        this.b = h3;
    }

    public final void run() {
        e$a e$a = this.a;
        Intrinsics.checkNotNullParameter(e$a, "$callback");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        e$a = (e$b)e$a;
        object = ((h)object).a;
        e$a.b();
    }
}

