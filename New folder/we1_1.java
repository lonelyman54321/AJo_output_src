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
 * Renamed from WE1
 */
public final class we1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ we1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$callback");
                function0.invoke();
                return Boolean.FALSE;
            }
            case 1: {
                Object object = this.b;
                Intrinsics.checkNotNullParameter(object, "$imageModel");
                return object;
            }
            case 0: 
        }
        bf1_2 bf1_22 = (bf1_2)this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "this$0");
        return UserInformation.getInstance((Context)bf1_22.a);
    }
}

