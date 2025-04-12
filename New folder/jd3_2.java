/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jd3
 */
public final class jd3_2
implements Function0 {
    public final /* synthetic */ ld3_1 a;

    public /* synthetic */ jd3_2(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final Object invoke() {
        int n3;
        ld3$a_0 ld3$a_0 = ld3_1.Companion;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ld3$a_0 = ((Fragment)object).getArguments();
        if (ld3$a_0 != null) {
            object = "EXTRA_POSITION";
            n3 = ld3$a_0.getInt((String)object);
        } else {
            n3 = 0;
            ld3$a_0 = null;
        }
        return n3;
    }
}

