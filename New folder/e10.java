/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity;

public final class e10
implements Runnable {
    public final /* synthetic */ ComponentActivity a;
    public final /* synthetic */ d82_0 b;

    public /* synthetic */ e10(ComponentActivity componentActivity, d82_0 d82_02) {
        this.a = componentActivity;
        this.b = d82_02;
    }

    public final void run() {
        ComponentActivity componentActivity = this.a;
        d82_0 d82_02 = this.b;
        ComponentActivity.access$addObserverForBackInvoker(componentActivity, d82_02);
    }
}

