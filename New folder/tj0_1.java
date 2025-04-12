/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from TJ0
 */
public final class tj0_1
implements Function1 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ int b;

    public /* synthetic */ tj0_1(int n3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        String string2;
        int n3;
        object = (Integer)object;
        int n4 = (Integer)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$fleekBannerData");
        object2 = ((BannerData)((ArrayList)object2).get(n4)).getBannerUrl();
        Object object3 = "/";
        int n7 = 6;
        int n8 = 0;
        String string3 = "substring(...)";
        int n10 = 1;
        if (object2 != null && (n3 = StringsKt.F((CharSequence)object2, string2 = "?", false)) == n10) {
            int n14 = StringsKt.R((CharSequence)object2, (String)object3, 0, n7) + n10;
            n7 = StringsKt.O((CharSequence)object2, string2, 0, false, n7);
            object2 = ((String)object2).substring(n14, n7);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else if (object2 != null) {
            int n15 = StringsKt.R((CharSequence)object2, (String)object3, 0, n7) + n10;
            object2 = ((String)object2).substring(n15);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else {
            object2 = null;
        }
        object3 = sq0_1.a;
        object3 = "";
        Object object4 = object2 == null ? object3 : object2;
        if (object2 == null) {
            object2 = object3;
        }
        object3 = new StringBuilder();
        n8 = this.b;
        object = Xd0.a("|", n8, n4, (StringBuilder)object3);
        sq0_1.h((String)object4, "fleek_insert_banner", (String)object2, (String)object);
        return Unit.a;
    }
}

