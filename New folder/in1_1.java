/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.lifecycle.EventListener;
import in.juspay.hypersdk.lifecycle.FragmentEvent;
import in.juspay.hypersdk.lifecycle.HyperFragment;

/*
 * Renamed from in1
 */
public final class in1_1
implements EventListener {
    public final /* synthetic */ JuspayServices a;
    public final /* synthetic */ FragmentEvent b;

    public /* synthetic */ in1_1(JuspayServices juspayServices, FragmentEvent fragmentEvent) {
        this.a = juspayServices;
        this.b = fragmentEvent;
    }

    public final void onEvent(String string2, HyperFragment hyperFragment) {
        JuspayServices juspayServices = this.a;
        FragmentEvent fragmentEvent = this.b;
        JuspayServices.k(juspayServices, fragmentEvent, string2, hyperFragment);
    }
}

