/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.referrer.OnReferrerCallback;
import com.affise.attribution.referrer.ReferrerKey;
import com.affise.attribution.referrer.RetrieveReferrerOnServerUseCase;

/*
 * Renamed from BM2
 */
public final class bm2_0
implements OnReferrerCallback {
    public final /* synthetic */ OnReferrerCallback a;
    public final /* synthetic */ ReferrerKey b;

    public /* synthetic */ bm2_0(OnReferrerCallback onReferrerCallback, ReferrerKey referrerKey) {
        this.a = onReferrerCallback;
        this.b = referrerKey;
    }

    public final void handleReferrer(String string2) {
        OnReferrerCallback onReferrerCallback = this.a;
        ReferrerKey referrerKey = this.b;
        RetrieveReferrerOnServerUseCase.b(onReferrerCallback, referrerKey, string2);
    }
}

