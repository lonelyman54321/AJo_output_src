/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.user.UserInformation;
import in.juspay.hyper.core.JuspayCoreLib;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from GV1
 */
public final class gv1_2
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ gv1_2(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return UserInformation.getInstance(JuspayCoreLib.getApplicationContext());
            }
            case 0: 
        }
        return VX0.a(AJIOApplication.Companion);
    }
}

