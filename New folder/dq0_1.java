/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from dQ0
 */
public final class dq0_1
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dq0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                jo_2 jo_22 = new jo_2((Context)aJIOApplication);
                return jo_22;
            }
            case 0: 
        }
        fq0$a_1 fq0$a_1 = fq0_2.Companion;
        return VX0.a(AJIOApplication.Companion);
    }
}

