/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.internal.d;
import com.facebook.internal.d$c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AI3
 */
public final class ai3_2
implements Runnable {
    public final /* synthetic */ d$c a;
    public final /* synthetic */ d b;

    public /* synthetic */ ai3_2(d$c c2, d d2) {
        this.a = c2;
        this.b = d2;
    }

    public final void run() {
        d$c d$c = this.a;
        Intrinsics.checkNotNullParameter(d$c, "$node");
        Object object = "this$0";
        d d2 = this.b;
        Intrinsics.checkNotNullParameter(d2, (String)object);
        try {
            object = d$c.a;
            object.run();
            return;
        }
        finally {
            d2.b(d$c);
        }
    }
}

