/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nd
 */
public final class nd_1
implements Function1 {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ View b;

    public /* synthetic */ nd_1(ViewTreeObserver viewTreeObserver, View view) {
        this.a = viewTreeObserver;
        this.b = view;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        View view = this.b;
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new pd_0(view);
        view = this.a;
        view.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
        qd$d qd$d = new qd$d((ViewTreeObserver)view, (pd_0)object);
        return qd$d;
    }
}

