/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m4
 */
public final class m4_0
implements OnSuccessListener,
o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ m4_0(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onSuccess(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

