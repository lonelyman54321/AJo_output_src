/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import kotlin.jvm.internal.Intrinsics;

public final class Ez2
implements Runnable {
    public final /* synthetic */ r a;

    public /* synthetic */ Ez2(r r5) {
        this.a = r5;
    }

    public final void run() {
        r r5 = this.a;
        Object object = "this$0";
        Intrinsics.checkNotNullParameter(r5, object);
        int n3 = r5.b;
        boolean bl2 = true;
        o o3 = r5.f;
        if (n3 == 0) {
            r5.c = bl2;
            object = i$a.ON_PAUSE;
            o3.f((i$a)((Object)object));
        }
        if ((n3 = r5.a) == 0 && (n3 = (int)(r5.c ? 1 : 0)) != 0) {
            object = i$a.ON_STOP;
            o3.f((i$a)((Object)object));
            r5.d = bl2;
        }
    }
}

