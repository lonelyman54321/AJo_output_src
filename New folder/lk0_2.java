/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lK0
 */
public final class lk0_2
implements Function2 {
    public final /* synthetic */ Bundle a;

    public /* synthetic */ lk0_2(Bundle bundle) {
        this.a = bundle;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Bundle bundle = this.a;
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(object, "id");
        Intrinsics.checkNotNullParameter(object2, "name");
        object = new StringBuilder("insert_");
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        bundle.putString("FLEEK_SOURCE", (String)object);
        bundle.putString("FLEEK_SOURCE_DETAILS", "insert");
        return Unit.a;
    }
}

