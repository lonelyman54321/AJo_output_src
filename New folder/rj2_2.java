/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.Renderer;

/*
 * Renamed from rJ2
 */
public final class rj2_2
implements Runnable {
    public final /* synthetic */ Renderer a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ rj2_2(Renderer renderer, String[] stringArray) {
        this.a = renderer;
        this.b = stringArray;
    }

    public final void run() {
        Renderer renderer = this.a;
        String[] stringArray = this.b;
        Renderer.a(renderer, stringArray);
    }
}

