/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class f81
implements o60_0,
w3 {
    public final /* synthetic */ Object a;

    public /* synthetic */ f81(Object object) {
        this.a = object;
    }

    public void a(Object object) {
        block4: {
            block3: {
                Object[] objectArray;
                String string2;
                int n3;
                int n4;
                block2: {
                    n4 = 1;
                    object = (Boolean)object;
                    n3 = ((Boolean)object).booleanValue();
                    string2 = "this$0";
                    objectArray = (Object[])this.a;
                    Intrinsics.checkNotNullParameter(objectArray, string2);
                    if (n3 != n4) break block2;
                    objectArray.c();
                    break block3;
                }
                if (n3 != 0) break block4;
                object = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_error_message;
                object = hv3_0.K(n7);
                int n8 = R$string.error_permission_denied;
                string2 = hv3_0.K(n8);
                objectArray = new Object[n4];
                objectArray[0] = string2;
                string2 = "format(...)";
                object = xh2_0.a(objectArray, n4, (String)object, string2);
                n4 = R$string.error_permission_denied;
                String string3 = hv3_0.K(n4);
                mq0_2.c(string3, (String)object);
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public void accept(Object object) {
        HomeRepo.G((at_1)((Function1)this.a), object);
    }
}

