/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mb0
 */
public final class mb0_0
implements Function0 {
    public final /* synthetic */ ob0_1 a;

    public /* synthetic */ mb0_0(ob0_1 ob0_12) {
        this.a = ob0_12;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "this$0");
        return UserInformation.getInstance((Context)ob0_12.a);
    }
}

