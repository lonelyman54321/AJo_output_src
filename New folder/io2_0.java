/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IO2
 */
public final class io2_0
implements Function0 {
    public final /* synthetic */ NO2 a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ io2_0(NO2 nO2, HashMap hashMap, Boolean bl2) {
        this.a = nO2;
        this.b = hashMap;
        this.c = bl2;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        HashMap hashMap = this.b;
        Intrinsics.checkNotNullParameter(hashMap, "$query");
        object = ((NO2)object).a;
        Boolean bl2 = this.c;
        Eh0 eh0 = new Eh0((Ch0)object, hashMap, bl2);
        return eh0;
    }
}

