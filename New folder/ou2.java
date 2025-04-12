/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class ou2
implements InvocationHandler {
    public final /* synthetic */ PlayerView a;

    public /* synthetic */ ou2(PlayerView playerView) {
        this.a = playerView;
    }

    public final Object invoke(Object object, Method method, Object[] objectArray) {
        return PlayerView.b(this.a, object, method, objectArray);
    }
}

