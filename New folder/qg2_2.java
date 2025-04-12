/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QG2
 */
public final class qg2_2
implements Function1 {
    public final /* synthetic */ jH2 a;
    public final /* synthetic */ zr1_1 b;

    public /* synthetic */ qg2_2(zr1_1 zr1_12, jH2 jH22) {
        this.a = jH22;
        this.b = zr1_12;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (Boolean)object;
        jH2 jH22 = this.a;
        Intrinsics.checkNotNullParameter(jH22, "this$0");
        zr1_1 zr1_12 = this.b;
        Intrinsics.checkNotNullParameter(zr1_12, "$referralImageMLD");
        Object object3 = "referralCodeSuccess";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            jH22.getClass();
            object = UrlHelper.Companion.getInstance();
            object3 = new Object[n3];
            object3[0] = "referral";
            String string2 = "home_content";
            object = ((UrlHelper)object).getApiUrl("homepage", string2, (Object[])object3);
            object3 = jH22.a;
            String string3 = "referral_banner";
            object = object3.getReferralImage((String)object, string3);
            object3 = new aH2(0, zr1_12, jH22);
            object2 = new Y81(n3, (Function1)object3);
            object.getClass();
            object3 = new k63_0((q63_0)object, (bx0_2)object2);
            object = new tg1_2(n3, zr1_12, jH22);
            object2 = new a91_0((Function1)object);
            object = new n53_0((q63_0)object3, (bx0_2)object2);
            object2 = new ch2_0(zr1_12, jH22);
            dH2 dH22 = new dH2((ch2_0)object2);
            object2 = new k63_0((q63_0)object, dH22);
            object = "onErrorResumeNext(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        } else {
            object = Boolean.FALSE;
            object2 = g53_0.d(object);
            Intrinsics.checkNotNull(object2);
        }
        return object2;
    }
}

