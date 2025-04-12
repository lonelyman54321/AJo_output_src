/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 *  android.window.OnBackAnimationCallback
 */
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class e82
implements OnBackAnimationCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public e82(X72 x72, Y72 y72, Z72 z72, a82 a822) {
        this.a = x72;
        this.b = y72;
        this.c = z72;
        this.d = a822;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Function1 function1 = this.b;
        uu_0 uu_02 = new uu_0(backEvent);
        function1.invoke(uu_02);
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Function1 function1 = this.a;
        uu_0 uu_02 = new uu_0(backEvent);
        function1.invoke(uu_02);
    }
}

