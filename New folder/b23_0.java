/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from b23
 */
public final class b23_0
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t13_0 d;

    public /* synthetic */ b23_0(boolean bl2, boolean bl3, String string2, t13_0 t13_02) {
        this.a = bl2;
        this.b = bl3;
        this.c = string2;
        this.d = t13_02;
    }

    public final Object invoke(Object object) {
        object = (ShortDynamicLink)object;
        t13_0 t13_02 = this.d;
        Intrinsics.checkNotNullParameter(t13_02, "$shareInterface");
        object = String.valueOf(object.getShortLink());
        String string2 = "https://ajiofnl.page.link";
        String string3 = null;
        boolean bl2 = StringsKt.F((CharSequence)object, string2, false);
        if (bl2 && !(bl2 = this.a)) {
            String string4 = "https://ajio.page.link";
            object = kotlin.text.b.n((String)object, string2, string4, false);
        }
        boolean bl3 = this.b;
        string3 = this.c;
        if (bl3) {
            string2 = "\n\n";
            object = n1.a(string3, string2, (String)object);
        }
        t13_02.V1((String)object, string3);
        return Unit.a;
    }
}

