/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class He0 {
    public final Context a;
    public final CleverTapInstanceConfig b;
    public final mp0_0 c;
    public final hh3_2 d;

    public He0(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        Intrinsics.checkNotNullParameter(mp0_02, "deviceInfo");
        this.a = object;
        this.b = cleverTapInstanceConfig;
        this.c = mp0_02;
        super(this);
        object = yr1_2.b((Function0)object);
        this.d = object;
    }

    public final ge0_0 a() {
        return (ge0_0)this.d.getValue();
    }
}

