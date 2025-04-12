/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import com.ril.ajio.AJIOApplication;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class T
implements Function0 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ Handler b;
    public final /* synthetic */ AJIOApplication c;

    public /* synthetic */ T(Ref$BooleanRef ref$BooleanRef, Handler handler, AJIOApplication aJIOApplication) {
        this.a = ref$BooleanRef;
        this.b = handler;
        this.c = aJIOApplication;
    }

    public final Object invoke() {
        Ref$BooleanRef ref$BooleanRef = this.a;
        Intrinsics.checkNotNullParameter(ref$BooleanRef, "$firstDraw");
        Handler handler = this.b;
        Intrinsics.checkNotNullParameter(handler, "$handler");
        Object object = "this$0";
        AJIOApplication aJIOApplication = this.c;
        Intrinsics.checkNotNullParameter(aJIOApplication, (String)object);
        boolean bl2 = ref$BooleanRef.element;
        if (bl2) {
            object = Unit.a;
        } else {
            ref$BooleanRef.element = bl2 = true;
            ref$BooleanRef = null;
            object = new U(aJIOApplication, 0);
            handler.postAtFrontOfQueue((Runnable)object);
            object = Unit.a;
        }
        return object;
    }
}

