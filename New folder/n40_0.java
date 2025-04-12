/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a$a;
import com.ril.ajio.customviews.widgets.AjioTextView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N40
 */
public final class n40_0
implements bx0_2,
vv1$a {
    public static void a(Object[] object, int n3, String string2, String string3, AjioTextView ajioTextView) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        ajioTextView.setText((CharSequence)object);
    }

    public Object apply(Object object) {
        object = (Throwable)object;
        Intrinsics.checkNotNullParameter(object, "it");
        yn3_0.a.e((Throwable)object);
        object = new c$a$a();
        return object;
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

