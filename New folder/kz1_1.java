/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 */
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kz1
 */
public final class kz1_1
extends zj0_0 {
    public final hh3_2 c;

    public kz1_1(Activity object) {
        super((Activity)object);
        super();
        object = yr1_2.b((Function0)object);
        this.c = object;
    }

    public final void b(String string2) {
        Object object = this.c.getValue();
        String string3 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object, string3);
        object = (UserInformation)object;
        boolean n3 = ((UserInformation)object).isUserOnline();
        if (!n3) {
            int n4;
            if (string2 != null && (n4 = string2.length()) != 0) {
                boolean bl2;
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                string3 = "referral_feature_enable";
                boolean bl3 = ((ao0_0)object).a(string3);
                if (bl3 && (bl2 = ((ao0_0)(object = z40$a.a((Context)AJIOApplication$a.a()).a)).a(string3 = "referee_enable"))) {
                    string2 = Uri.parse((String)string2);
                    object = "referral_name";
                    object = string2.getQueryParameter((String)object);
                    bv1_0.b = object;
                    object = "referral_code";
                    string2 = string2.getQueryParameter((String)object);
                    try {
                        bv1_0.a = string2;
                    }
                    catch (Exception exception) {
                        object = yn3_0.a;
                        ((yn3$a)object).e(exception);
                    }
                }
            }
            string2 = this.a;
            object = "activity";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            int n7 = 6;
            string3 = "source - deeplink";
            at2_1.h((Activity)string2, string3, n7);
        }
    }
}

