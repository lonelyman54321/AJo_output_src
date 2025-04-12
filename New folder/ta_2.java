/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.Tracker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tA
 */
public final class ta_2
implements o60_0,
OnFailureListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ ta_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onFailure(Exception exception) {
        SmsConsentHandler.a((Tracker)this.a, exception);
    }
}

