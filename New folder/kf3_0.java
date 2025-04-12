/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.webBridge.WebBridgeManager;

/*
 * Renamed from kF3
 */
public final class kf3_0
implements Runnable {
    public final /* synthetic */ WebBridgeManager a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ kf3_0(WebBridgeManager webBridgeManager2, String string2, String string3, String string4) {
        this.a = webBridgeManager2;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public final void run() {
        String string2 = this.c;
        String string3 = this.d;
        WebBridgeManager webBridgeManager2 = this.a;
        String string4 = this.b;
        WebBridgeManager.b(webBridgeManager2, string4, string2, string3);
    }
}

