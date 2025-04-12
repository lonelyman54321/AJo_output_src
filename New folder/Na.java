/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;

public final class Na
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ Na(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return AjioApiConnector.INSTANCE.getUserApi();
            }
            case 0: 
        }
        return h40_0.a.U1();
    }
}

