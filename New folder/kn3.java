/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import java.text.DateFormat;
import java.text.Format;
import kotlin.jvm.internal.Intrinsics;

public final class kn3
implements F62 {
    public final /* synthetic */ ThrowableActivity a;

    public /* synthetic */ kn3(ThrowableActivity throwableActivity) {
        this.a = throwableActivity;
    }

    public final void onChanged(Object object) {
        object = (NF2)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = "it";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object2 = ((ThrowableActivity)object2).Z;
        if (object2 != null) {
            object3 = DateFormat.getDateTimeInstance(3, 2);
            Object object4 = ((NF2)object).c;
            object3 = ((Format)object3).format(object4);
            Intrinsics.checkNotNullExpressionValue(object3, "getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM)\n                .format(this.date)");
            ((rU)object2).e.setText((CharSequence)object3);
            object3 = ((rU)object2).b;
            object4 = ((BU)object3).e;
            String string2 = ((NF2)object).b;
            object4.setText((CharSequence)string2);
            object4 = ((NF2)object).d;
            ((BU)object3).b.setText((CharSequence)object4);
            object4 = ((NF2)object).e;
            ((BU)object3).d.setText((CharSequence)object4);
            object2 = ((rU)object2).c;
            object = ((NF2)object).f;
            object2.setText((CharSequence)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorBinding");
        throw null;
    }
}

