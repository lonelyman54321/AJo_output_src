/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ac2
 */
public final class ac2_0
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ac2_0(ArrayList arrayList, kd2_1 kd2_12, ld2_1 ld2_12, md2_1 md2_12, int n3) {
        this.a = arrayList;
        this.b = kd2_12;
        this.c = ld2_12;
        this.d = md2_12;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onCloseSheetButtonClicked");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onCloseButtonClicked");
        Function0 function0 = this.d;
        Intrinsics.checkNotNullParameter(function0, "$onCancelButtonClicked");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (kd2_1)object;
        Object object5 = object2;
        object5 = (ld2_1)object2;
        Function0 function02 = function0;
        function02 = (md2_1)function0;
        jd2_1.a(this.a, (kd2_1)object4, (ld2_1)object5, (md2_1)function02, (b30_0)object3, n3);
        return Unit.a;
    }
}

