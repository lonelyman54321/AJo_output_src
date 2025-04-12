/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 */
import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mD2
 */
public final class md2_0
implements hx0_2 {
    public final /* synthetic */ wd2_0 a;

    public /* synthetic */ md2_0(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (CharSequence)object;
        object2 = (Integer)object2;
        object3 = (Integer)object3;
        object4 = (Integer)object4;
        object2 = "this$0";
        object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        if (object != null) {
            n3 = object.length();
        } else {
            n3 = 0;
            object = null;
        }
        object4 = "/500";
        object = UX.a(n3, (String)object4);
        object2 = new SpannableStringBuilder((CharSequence)object);
        object = ((wd2_0)object3).E;
        if (object != null) {
            object.setText((CharSequence)object2);
        }
        return Unit.a;
    }
}

