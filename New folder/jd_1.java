/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jD
 */
public final class jd_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ i90_0 e;
    public final /* synthetic */ yp0_0 f;

    public /* synthetic */ jd_1(dr0_0 dr0_02, String string2, String string3, String string4, c80 c802, yp0_0 yp0_02) {
        this.a = dr0_02;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = c802;
        this.f = yp0_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        i90_0 i90_02 = this.e;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.f;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        object.getClass();
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("fleek_share_brand_message");
        CharSequence charSequence = new StringBuilder("https://www.ajiogram.ajio.com/brand/");
        String string2 = this.c;
        charSequence.append(string2);
        charSequence = charSequence.toString();
        ShareActionRequestBody shareActionRequestBody = dr0_0.n(string2, "BRAND_PAGE");
        String string3 = this.d;
        ((dr0_0)object).c0((String)object2, (String)charSequence, shareActionRequestBody, string3);
        object2 = this.b;
        object = new nd_2(yp0_02, (String)object2, string2, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

