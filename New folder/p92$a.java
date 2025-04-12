/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class p92$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Cl2 b;

    public p92$a(dr0_0 dr0_02, hm0_0 hm0_02) {
        this.a = dr0_02;
        this.b = hm0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 object2) {
        Object object3;
        object = (Number)object;
        int n3 = ((Number)object).intValue();
        object2 = this.a;
        Object object4 = ((dr0_0)object2).F0;
        boolean bl2 = Intrinsics.areEqual(object4 = CollectionsKt.N(n3, (List)object4), object3 = Boolean.FALSE);
        if (bl2) {
            object4 = Boolean.TRUE;
            ((dr0_0)object2).F0.set(n3, object4);
            object4 = "0|";
            object2 = new StringBuilder((String)object4);
            ((StringBuilder)object2).append(n3);
            String string2 = ((StringBuilder)object2).toString();
            object = h40_0.a;
            object = h40_0.W();
            object2 = this.b;
            int n4 = ((Cl2)object2).j();
            object = (String)CollectionsKt.N(n4, (List)object);
            if (object == null) {
                object = "";
            }
            object2 = "?";
            bl2 = false;
            object4 = null;
            int n7 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
            Object object5 = "/";
            int n8 = 6;
            Object object6 = "substring(...)";
            if (n7 != 0) {
                n7 = StringsKt.R((CharSequence)object, (String)object5, 0, n8) + 1;
                n4 = StringsKt.O((CharSequence)object, (String)object2, 0, false, n8);
                object = ((String)object).substring(n7, n4);
                Intrinsics.checkNotNullExpressionValue(object, (String)object6);
            } else {
                n4 = StringsKt.R((CharSequence)object, (String)object5, 0, n8) + 1;
                object = ((String)object).substring(n4);
                Intrinsics.checkNotNullExpressionValue(object, (String)object6);
            }
            object6 = object;
            object = sq0_1.a;
            object3 = "onboarding screen";
            String string3 = "fleek_onboarding_banner";
            object5 = object6;
            sq0_1.i((String)object3, (String)object6, string3, (String)object6, string2, false);
        }
        return Unit.a;
    }
}

