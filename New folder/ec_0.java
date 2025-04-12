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
 * Renamed from eC
 */
public final class ec_0
implements Function1 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ec_0(int n3, String string2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = string2;
        this.c = n3;
    }

    public final Object invoke(Object object) {
        String string2;
        int n3;
        object = (Integer)object;
        int n4 = (Integer)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$fleekBannerData");
        object2 = ((BannerData)((ArrayList)object2).get(n4)).getBannerUrl();
        CharSequence charSequence = "/";
        int n7 = 6;
        Object object3 = null;
        String string3 = "substring(...)";
        int n8 = 1;
        if (object2 != null && (n3 = StringsKt.F((CharSequence)object2, string2 = "?", false)) == n8) {
            int n10 = StringsKt.R((CharSequence)object2, (String)charSequence, 0, n7) + n8;
            n7 = StringsKt.O((CharSequence)object2, string2, 0, false, n7);
            object2 = ((String)object2).substring(n10, n7);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else if (object2 != null) {
            int n14 = StringsKt.R((CharSequence)object2, (String)charSequence, 0, n7) + n8;
            object2 = ((String)object2).substring(n14);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else {
            object2 = null;
        }
        charSequence = new StringBuilder("fleek_insert_contentonly_");
        Object object4 = this.b;
        ((StringBuilder)charSequence).append((String)object4);
        charSequence = ((StringBuilder)charSequence).toString();
        object3 = sq0_1.a;
        object3 = "";
        if (object4 == null) {
            object4 = object3;
        }
        if (object2 == null) {
            object2 = object3;
        }
        object3 = new StringBuilder();
        int n15 = this.c;
        object = Xd0.a("|", n15, n4, (StringBuilder)object3);
        sq0_1.h((String)object4, (String)charSequence, (String)object2, (String)object);
        return Unit.a;
    }
}

