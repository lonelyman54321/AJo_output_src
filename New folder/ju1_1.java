/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.motion.MaterialBackOrchestrator;

/*
 * Renamed from jU1
 */
public final class ju1_1
implements Runnable {
    public final /* synthetic */ MaterialBackOrchestrator a;

    public /* synthetic */ ju1_1(MaterialBackOrchestrator materialBackOrchestrator) {
        this.a = materialBackOrchestrator;
    }

    public final void run() {
        this.a.startListeningForBackCallbacksWithPriorityOverlay();
    }
}

