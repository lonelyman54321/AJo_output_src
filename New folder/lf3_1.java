/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.modules.OnKeyValueCallback;
import com.affise.attribution.webBridge.WebBridgeManager;
import java.util.List;

/*
 * Renamed from lF3
 */
public final class lf3_1
implements OnKeyValueCallback {
    public final /* synthetic */ WebBridgeManager a;
    public final /* synthetic */ String b;

    public /* synthetic */ lf3_1(WebBridgeManager webBridgeManager2, String string2) {
        this.a = webBridgeManager2;
        this.b = string2;
    }

    public final void handle(List list) {
        WebBridgeManager webBridgeManager2 = this.a;
        String string2 = this.b;
        WebBridgeManager.a(webBridgeManager2, string2, list);
    }
}

