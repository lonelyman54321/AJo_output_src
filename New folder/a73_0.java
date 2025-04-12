/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import in.juspay.hypersmshandler.SmsConsentHandler;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from A73
 */
public final class a73_0
implements OnSuccessListener {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ a73_0(Function1 function1) {
        this.a = function1;
    }

    public final void onSuccess(Object object) {
        SmsConsentHandler.a(this.a, object);
    }
}

