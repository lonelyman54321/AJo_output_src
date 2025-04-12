/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nj$a
 */
public final class nj$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidUiDispatcher c;
    public final /* synthetic */ Choreographer.FrameCallback d;

    public nj$a_0(AndroidUiDispatcher androidUiDispatcher, nj$c nj$c) {
        this.c = androidUiDispatcher;
        this.d = nj$c;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c;
        Choreographer.FrameCallback frameCallback = this.d;
        Object object2 = ((AndroidUiDispatcher)object).d;
        synchronized (object2) {
            object = ((AndroidUiDispatcher)object).f;
            object.remove(frameCallback);
            return Unit.a;
        }
    }
}

