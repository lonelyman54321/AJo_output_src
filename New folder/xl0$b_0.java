/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xl0$b
 */
public final class xl0$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Choreographer.FrameCallback c;

    public xl0$b_0(xl0$c xl0$c) {
        this.c = xl0$c;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = xl0_1.b;
        Choreographer.FrameCallback frameCallback = this.c;
        object.removeFrameCallback(frameCallback);
        return Unit.a;
    }
}

