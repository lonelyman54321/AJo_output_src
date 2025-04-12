/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import in.juspay.hypersmshandler.SmsRetriever;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vA
 */
public final class va_2
implements o60_0,
OnSuccessListener {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ va_2(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onSuccess(Object object) {
        SmsRetriever.a(this.a, object);
    }
}

