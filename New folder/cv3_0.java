/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$dimen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cv3
 */
public final class cv3_0
implements Function1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ TextView f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    public /* synthetic */ cv3_0(ConstraintLayout constraintLayout, int n3, float f5, float f6, TextView textView, TextView textView2, TextView textView3, String string2, String string3) {
        this.a = constraintLayout;
        this.b = n3;
        this.c = f5;
        this.d = f6;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = string2;
        this.i = string3;
    }

    public final Object invoke(Object object) {
        float f5;
        int n3;
        object = (Integer)object;
        int n4 = (Integer)object;
        String string2 = this.h;
        Intrinsics.checkNotNullParameter(string2, "$labelText");
        String string3 = this.i;
        Intrinsics.checkNotNullParameter(string3, "$priceText");
        Context context = this.a.getContext();
        if (context != null && (context = context.getResources()) != null) {
            n3 = R$dimen.dimen_16;
            f5 = context.getDimension(n3);
        } else {
            f5 = -1.0f;
        }
        n3 = this.b - n4;
        float f6 = n3;
        float f7 = this.c;
        f6 -= f7;
        f7 = this.d;
        f6 = f6 - f7 - f5;
        f5 = hv3_0.C().getDisplayMetrics().density;
        f6 /= f5;
        context = this.e;
        TextView textView = this.f;
        TextView textView2 = this.g;
        float f8 = 5.0f;
        int n7 = 8;
        n4 = (int)(f6 == f8 ? 0 : (f6 > f8 ? 1 : -1));
        if (n4 > 0) {
            context.setText((CharSequence)string2);
            n4 = 1;
            f6 = Float.MIN_VALUE;
            context.setSingleLine(n4 != 0);
            context.setVisibility(0);
            textView.setText((CharSequence)string3);
            textView2.setVisibility(n7);
        } else {
            context.setText((CharSequence)string2);
            context.setSingleLine(false);
            context.setVisibility(0);
            textView2.setText((CharSequence)string3);
            textView2.setVisibility(0);
            textView.setVisibility(n7);
        }
        return Unit.a;
    }
}

