/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class g91
extends qg3_2
implements Function2 {
    public final /* synthetic */ h91 a;

    public g91(h91 h912, f80_0 f80_02) {
        this.a = h912;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        h91 h912 = this.a;
        object = new g91(h912, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (g91)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((g91)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        Object object3;
        block8: {
            int n3;
            int n4;
            Object object4;
            object3 = j90_0.COROUTINE_SUSPENDED;
            vl2_2.b(object);
            object = "+91";
            object3 = this.a;
            object3.getClass();
            try {
                object3 = AJIOApplication.Companion;
                object3.getClass();
                object2 = AJIOApplication$a.a();
                object4 = ((AJIOApplication)object2).f;
                if (object4 == null) {
                    object3.getClass();
                    object3 = AJIOApplication$a.a();
                    ((AJIOApplication)object2).f = object3 = com.clevertap.android.sdk.a.g((Context)object3);
                }
                object3 = ((AJIOApplication)object2).f;
                object2 = "null cannot be cast to non-null type com.clevertap.android.sdk.CleverTapAPI";
                Intrinsics.checkNotNull(object3, (String)object2);
                object2 = ((a)object3).b;
                object4 = ((H80)object2).a;
                ((CleverTapInstanceConfig)object4).s = n4 = 1;
                object4 = "Phone";
                object2 = ((H80)object2).d;
                object2 = ((LocalDataStore)object2).d((String)object4);
            }
            catch (Exception exception2) {
                break block8;
            }
            n4 = object2 instanceof String;
            if (n4 != 0) {
                object2 = (String)object2;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                n3 = ((String)object2).length();
                if (n3 != 0) return Unit.a;
            }
            object2 = AJIOApplication$a.a();
            object2 = UserInformation.getInstance((Context)object2);
            if ((object2 = ((UserInformation)object2).getUserPhoneNumber()) == null) return Unit.a;
            n4 = ((String)object2).length();
            if (n4 == 0) {
                return Unit.a;
            }
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            Object object5 = cp_1.Companion;
            object5.getClass();
            object5 = cp$a.e();
            object5.getClass();
            object = ((String)object).concat((String)object2);
            hashMap.put(object4, object);
            ((a)object3).q(hashMap);
            return Unit.a;
        }
        object3 = yn3_0.a;
        String string2 = exception2.getMessage();
        string2 = kp1_0.c("Exception while logging clevertap events:", string2);
        boolean bl2 = false;
        object2 = new Object[]{};
        ((yn3$a)object3).d(string2, (Object[])object2);
        return Unit.a;
    }
}

