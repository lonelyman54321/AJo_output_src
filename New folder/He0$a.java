/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class He0$a
extends Lambda
implements Function0 {
    public final /* synthetic */ He0 c;

    public He0$a(He0 he0) {
        this.c = he0;
        super(0);
    }

    public final Object invoke() {
        ge0_0 ge0_02;
        Object object = this.c;
        Object object2 = ((He0)object).a;
        Intrinsics.checkNotNullParameter(object2, "context");
        Object object3 = ((He0)object).b;
        Intrinsics.checkNotNullParameter(object3, "config");
        object = ((He0)object).c;
        Intrinsics.checkNotNullParameter(object, "deviceInfo");
        boolean bl2 = ((CleverTapInstanceConfig)object3).u;
        Object object4 = ((CleverTapInstanceConfig)object3).b();
        String string2 = "config.logger";
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        String string3 = ((CleverTapInstanceConfig)object3).a;
        String string4 = "config.accountId";
        Intrinsics.checkNotNullExpressionValue(string3, string4);
        ix3 ix32 = new ix3(bl2, (b)object4, string3);
        String string5 = gc3_0.h(object2, (CleverTapInstanceConfig)object3, "comms_dmn", null);
        string3 = gc3_0.h(object2, (CleverTapInstanceConfig)object3, "comms_dmn_spiky", null);
        object2 = ((CleverTapInstanceConfig)object3).d;
        String string6 = ((CleverTapInstanceConfig)object3).e;
        String string7 = ((CleverTapInstanceConfig)object3).f;
        String string8 = ((CleverTapInstanceConfig)object3).a;
        Intrinsics.checkNotNullExpressionValue(string8, string4);
        String string9 = ((CleverTapInstanceConfig)object3).c;
        Intrinsics.checkNotNullExpressionValue(string9, "config.accountToken");
        String string10 = String.valueOf(((mp0_0)object).e().l);
        object = ((CleverTapInstanceConfig)object3).b();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        string2 = ((CleverTapInstanceConfig)object3).a;
        Intrinsics.checkNotNullExpressionValue(string2, string4);
        string4 = ((CleverTapInstanceConfig)object3).b;
        object4 = ge0_02;
        object3 = string2;
        string2 = string5;
        string5 = object2;
        ge0_02 = new ge0_0(ix32, string2, string3, string4, (String)object2, string6, string7, string8, string9, string10, (b)object, (String)object3);
        return ge0_02;
    }
}

