/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.TextView
 */
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.utility.UiUtils$calculateViewWidth$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bv3
 */
public final class bv3_0
implements Function1 {
    public final /* synthetic */ AppCompatImageView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ TextView f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    public /* synthetic */ bv3_0(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, float f5, float f6, TextView textView, TextView textView2, TextView textView3, String string2, String string3) {
        this.a = appCompatImageView;
        this.b = constraintLayout;
        this.c = f5;
        this.d = f6;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = string2;
        this.i = string3;
    }

    public final Object invoke(Object object) {
        Object object2;
        int n3 = (Integer)object;
        String string2 = this.h;
        Intrinsics.checkNotNullParameter(string2, "$labelText");
        String string3 = this.i;
        Intrinsics.checkNotNullParameter(string3, "$priceText");
        TextView textView = this.g;
        Object object3 = object2 = this.b;
        object3 = (ConstraintLayout)((Object)object2);
        float f5 = this.c;
        float f6 = this.d;
        TextView textView2 = this.e;
        TextView textView3 = this.f;
        object2 = object;
        object = new cv3_0((ConstraintLayout)((Object)object3), n3, f5, f6, textView2, textView3, textView, string2, string3);
        hv3_0.a.getClass();
        Intrinsics.checkNotNullParameter(object, "callback");
        object2 = this.a;
        object3 = object2.getViewTreeObserver();
        if (object3 != null) {
            UiUtils$calculateViewWidth$1 uiUtils$calculateViewWidth$1 = new UiUtils$calculateViewWidth$1((View)object2, (Function1)object);
            object3.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)uiUtils$calculateViewWidth$1);
        }
        return Unit.a;
    }
}

