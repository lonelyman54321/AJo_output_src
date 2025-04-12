/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Su
 */
public final class su_2
implements View.OnClickListener {
    public final /* synthetic */ xu_2 a;
    public final /* synthetic */ Balloon b;

    public /* synthetic */ su_2(xu_2 xu_22, Balloon balloon2) {
        this.a = xu_22;
        this.b = balloon2;
    }

    public final void onClick(View view) {
        Balloon balloon2 = this.b;
        Intrinsics.checkNotNullParameter(balloon2, "this$0");
        xu_2 xu_22 = this.a;
        if (xu_22 != null) {
            String string2 = "it";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            xu_22.a(view);
        }
        balloon2.b.getClass();
    }
}

