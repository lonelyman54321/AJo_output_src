/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.debug.validate.DebugOnValidateCallback;
import com.affise.attribution.debug.validate.DebugValidateUseCaseImpl;

/*
 * Renamed from Ti0
 */
public final class ti0_0
implements Runnable {
    public final /* synthetic */ DebugValidateUseCaseImpl a;
    public final /* synthetic */ DebugOnValidateCallback b;

    public /* synthetic */ ti0_0(DebugValidateUseCaseImpl debugValidateUseCaseImpl, DebugOnValidateCallback debugOnValidateCallback) {
        this.a = debugValidateUseCaseImpl;
        this.b = debugOnValidateCallback;
    }

    public final void run() {
        DebugValidateUseCaseImpl debugValidateUseCaseImpl = this.a;
        DebugOnValidateCallback debugOnValidateCallback = this.b;
        DebugValidateUseCaseImpl.a(debugValidateUseCaseImpl, debugOnValidateCallback);
    }
}

