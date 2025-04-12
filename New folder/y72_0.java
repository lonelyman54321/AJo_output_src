/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsEventReporterImpl;
import com.ril.ajio.kmm.shared.util.KMMInitializer;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.AjioOkHttpClient;
import com.ril.ajio.services.network.AjioOkHttpClient$Builder;
import com.ril.ajio.services.network.AjioOkHttpClient$Builder$Companion;
import java.io.File;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from y72
 */
public final class y72_0
implements ao_0 {
    public final Context a;
    public final File b;

    public y72_0() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        this.a = object;
        object = object.getCacheDir();
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a() {
        void var3_28;
        void var2_6;
        String string2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new Ko((Context)aJIOApplication);
        Object var3_15 = null;
        boolean bl2 = ((sw_0)object).getPreference("ssl_pinning", false);
        z40$a z40$a = z40_0.Companion;
        Object object2 = AJIOApplication$a.a();
        z40$a.getClass();
        String string3 = z40$a.a((Context)object2).a.b("ssl_pinning_public_keys");
        cp_1.Companion.getClass();
        object2 = ((Object)StringsKt.m0(string3)).toString();
        int n3 = ((String)object2).length();
        if (n3 == 0) {
            Object var2_5 = null;
        } else {
            void var2_8;
            object2 = ",";
            int n4 = 1;
            int n7 = kotlin.text.b.h(string3, (String)object2, n4 != 0);
            if (n7 != 0) {
                n7 = string3.length() - n4;
                String string4 = string3.substring(0, n7);
                string2 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(string4, string2);
            }
            if ((n7 = (int)(StringsKt.F((CharSequence)var2_8, (CharSequence)object2, n4 != 0) ? 1 : 0)) != 0) {
                object2 = new String[]{object2};
                n7 = 4;
                Collection collection = StringsKt.a0((CharSequence)var2_8, (String[])object2, n4 != 0, 0, n7);
                String[] stringArray = new String[]{};
                String[] stringArray2 = collection.toArray(stringArray);
            } else {
                object2 = new String[n4];
                object2[0] = var2_8;
                String[] stringArray = object2;
            }
        }
        void var7_34 = var2_6;
        String string5 = "base_url";
        String string6 = "";
        object2 = ((sw_0)object).getPreference(string5, string6);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            void var3_26;
            String string7;
            object2 = "prod";
            String string8 = "qa";
            if (object2 != string8 && object2 != (string7 = "qaregression")) {
                String string9 = "replica";
                if (object2 == string9) {
                    String string10 = "https://gcprep-ajio.jio.com";
                } else {
                    String string11 = "https://www.ajio.com";
                }
            } else {
                String string12 = "https://qa.services.ajio.com";
            }
            ((sw_0)object).putPreference(string5, (String)var3_26);
        } else if ((object = ((sw_0)object).getPreference(string5, string6)) != null) {
            Object object3 = object;
        }
        object = UrlHelper.Companion;
        ((UrlHelper$Companion)object).getInstance().setCurrentServer((String)var3_28);
        object = ((UrlHelper$Companion)object).getInstance();
        Context context = this.a;
        ((UrlHelper)object).initApiHashMap(context);
        object2 = AjioOkHttpClient$Builder.Companion;
        xe xe2 = AnalyticsEventReporterImpl.Companion.getInstance();
        Object object4 = this.b;
        string2 = this.a;
        ((AjioOkHttpClient$Builder$Companion)object2).build((File)object4, (Context)string2, bl2, xe2, (String[])var7_34);
        object = KMMInitializer.INSTANCE;
        AJIOApplication aJIOApplication2 = AJIOApplication$a.a();
        x72_0 x72_02 = AjioOkHttpClient.INSTANCE.getOkHttpClient();
        object4 = AJIOApplication$a.a();
        object2 = new jo_2((Context)object4);
        object2 = ((jo_2)object2).a();
        ((KMMInitializer)object).init((Context)aJIOApplication2, x72_02, (String)object2);
    }
}

