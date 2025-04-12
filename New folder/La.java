/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import kotlin.jvm.functions.Function0;

public final class La
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ La(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return StatusInfo.a();
            }
            case 1: {
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                so_1 so_12 = new so_1(aJIOApplication);
                return so_12;
            }
            case 0: 
        }
        h40_0 h40_02 = h40_0.a;
        return h40_0.V1();
    }
}

