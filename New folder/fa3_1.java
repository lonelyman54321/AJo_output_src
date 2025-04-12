/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fa3
 */
public final class fa3_1
implements OnSuccessListener {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ fa3_1(ea3_2 ea3_22) {
        this.a = ea3_22;
    }

    public final void onSuccess(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

