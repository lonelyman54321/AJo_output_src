/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.Renderer;

/*
 * Renamed from sJ2
 */
public final class sj2_2
implements Runnable {
    public final /* synthetic */ Renderer a;
    public final /* synthetic */ String b;

    public /* synthetic */ sj2_2(Renderer renderer, String string2) {
        this.a = renderer;
        this.b = string2;
    }

    public final void run() {
        Renderer renderer = this.a;
        String string2 = this.b;
        Renderer.b(renderer, string2);
    }
}

