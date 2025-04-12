/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Z13
 */
public final class z13_0
implements OnSuccessListener {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ z13_0(y13_0 y13_02) {
        this.a = y13_02;
    }

    public final void onSuccess(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

