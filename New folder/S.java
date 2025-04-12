/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnDrawListener
 *  android.view.Window
 */
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.ril.ajio.AJIOApplication;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class S
implements Function0 {
    public final /* synthetic */ Window a;
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ AJIOApplication d;

    public /* synthetic */ S(Window window, Ref$BooleanRef ref$BooleanRef, Handler handler, AJIOApplication aJIOApplication) {
        this.a = window;
        this.b = ref$BooleanRef;
        this.c = handler;
        this.d = aJIOApplication;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$firstDraw");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$handler");
        AJIOApplication aJIOApplication = this.d;
        Intrinsics.checkNotNullParameter(aJIOApplication, "this$0");
        G32$a g32$a = g32_0.Companion;
        View view = this.a.getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, "getDecorView(...)");
        T t3 = new T((Ref$BooleanRef)object, (Handler)object2, aJIOApplication);
        g32$a.getClass();
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(t3, "onDrawCallback");
        object = view.getViewTreeObserver();
        boolean bl2 = object.isAlive();
        if (bl2 && (bl2 = view.isAttachedToWindow())) {
            object = view.getViewTreeObserver();
            object2 = new g32_0(view, t3);
            object.addOnDrawListener((ViewTreeObserver.OnDrawListener)object2);
        } else {
            object = new f32_0(view, t3);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
        return Unit.a;
    }
}

