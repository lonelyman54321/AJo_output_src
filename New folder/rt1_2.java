/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from rT1
 */
public final class rt1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ Bundle c;

    public rt1_2(Bundle bundle) {
        this.c = bundle;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        return this.c.containsKey((String)object) ^ true;
    }
}

