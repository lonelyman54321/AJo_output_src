/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fv
 */
public final class fv_1
implements Function0 {
    public final /* synthetic */ ArrayList a;

    public /* synthetic */ fv_1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Object invoke() {
        ArrayList arrayList = this.a;
        Intrinsics.checkNotNullParameter(arrayList, "$bannerDataList");
        return arrayList.size();
    }
}

