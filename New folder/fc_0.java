/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FC
 */
public final class fc_0
implements Function0 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ SubcomponentsOwner c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ i90_0 f;
    public final /* synthetic */ yp0_0 g;
    public final /* synthetic */ String h;

    public /* synthetic */ fc_0(Subcomponent subcomponent, dr0_0 dr0_02, SubcomponentsOwner subcomponentsOwner, String string2, String string3, c80 c802, yp0_0 yp0_02, String string4) {
        this.a = subcomponent;
        this.b = dr0_02;
        this.c = subcomponentsOwner;
        this.d = string2;
        this.e = string3;
        this.f = c802;
        this.g = yp0_02;
        this.h = string4;
    }

    public final Object invoke() {
        int n3;
        Subcomponent subcomponent = this.a;
        Intrinsics.checkNotNullParameter(subcomponent, "$subcomponent");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$subComponentsOwner");
        i90_0 i90_02 = this.f;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.g;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Object object3 = subcomponent.getCta();
        object3 = object3 != null ? ((Cta)object3).getRedirectionUrl() : null;
        Object object4 = "BRAND_PAGE";
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            String string2 = ((SubcomponentsOwner)object2).getName();
            object.getClass();
            string2 = dr0_0.m(string2);
            String string3 = subcomponent.getId();
            object4 = dr0_0.n(string3, (String)object4);
            object2 = ((SubcomponentsOwner)object2).getLogo();
            ((dr0_0)object).c0(string2, (String)object3, (ShareActionRequestBody)object4, (String)object2);
        } else {
            object3 = ((SubcomponentsOwner)object2).getName();
            object.getClass();
            object3 = dr0_0.m((String)object3);
            CharSequence charSequence = new StringBuilder("https://www.ajiogram.ajio.com/s/");
            String string4 = this.d;
            charSequence.append(string4);
            charSequence.append("?brandPageCode=");
            string4 = this.e;
            charSequence.append(string4);
            charSequence = charSequence.toString();
            string4 = subcomponent.getId();
            object4 = dr0_0.n(string4, (String)object4);
            object2 = ((SubcomponentsOwner)object2).getLogo();
            ((dr0_0)object).c0((String)object3, (String)charSequence, (ShareActionRequestBody)object4, (String)object2);
        }
        object2 = this.h;
        object = new gd_2(yp0_02, (String)object2, subcomponent, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

