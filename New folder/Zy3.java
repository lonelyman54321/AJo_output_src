/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

public final class Zy3
implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ Zy3(String string2, boolean bl2) {
        this.a = string2;
        this.b = bl2;
    }

    public final Thread newThread(Runnable runnable2) {
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$name");
        Thread thread2 = new Thread(runnable2, string2);
        boolean bl2 = this.b;
        thread2.setDaemon(bl2);
        return thread2;
    }
}

