/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.referrer.OnReferrerCallback;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;

/*
 * Renamed from CM2
 */
public final class cm2_0
implements OnReferrerCallback {
    public final /* synthetic */ OnReferrerCallback a;

    public /* synthetic */ cm2_0(OnReferrerCallback onReferrerCallback) {
        this.a = onReferrerCallback;
    }

    public final void handleReferrer(String string2) {
        RetrieveReferrerOnServerUseCase.a(this.a, string2);
    }
}

