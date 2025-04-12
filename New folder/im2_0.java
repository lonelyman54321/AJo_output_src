/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$font;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IM2
 */
public final class im2_0
implements Function1 {
    public final /* synthetic */ String a;

    public /* synthetic */ im2_0(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object) {
        object = (TextView)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$htmlText");
        Intrinsics.checkNotNullParameter(object, "textView");
        object2 = D91.a(63, (String)object2);
        object.setText((CharSequence)object2);
        int n3 = zx_0.i(zx_0.d(0xFF202020L));
        object.setTextColor(n3);
        object.setTextSize(2, 12.0f);
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object2 = WK2.c(R$font.muli_regular, (Context)object2);
        object.setTypeface((Typeface)object2);
        return Unit.a;
    }
}

