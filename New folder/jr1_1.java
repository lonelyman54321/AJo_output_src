/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from jR1
 */
public final class jr1_1
implements w3 {
    public final /* synthetic */ lr1_0 a;

    public /* synthetic */ jr1_1(lr1_0 lr1_02) {
        this.a = lr1_02;
    }

    public final void a(Object object) {
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
                    objectArray = this.a;
                    Intrinsics.checkNotNullParameter(objectArray, string2);
                    if (n3 != n4) break block2;
                    objectArray.d();
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
}

