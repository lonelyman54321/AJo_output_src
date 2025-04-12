/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.GraphRequest$b;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.f;
import kotlin.jvm.internal.Intrinsics;

public final class ZC3
implements GraphRequest$b {
    public final void b(f object) {
        Intrinsics.checkNotNullParameter(object, "it");
        object = sx1.d;
        object = Ax1.APP_EVENTS;
        String string2 = ViewIndexer.a();
        sx1$a.a((Ax1)((Object)object), string2, "App index sent to FB!");
    }
}

