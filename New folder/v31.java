/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.model.InitData;
import ai.haptik.android.wrapper.sdk.model.SignupData;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class v31 {
    public static final Ko a;
    public static String b;

    static {
        Ko ko;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        a = ko = new Ko((Context)aJIOApplication);
        b = "";
    }

    public static final void a() {
        HaptikSDK haptikSDK = HaptikSDK.INSTANCE;
        Object object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        try {
            haptikSDK.logout((Context)object);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
        }
    }

    public static void b() {
        int n3;
        String string2;
        InitData initData;
        AJIOApplication aJIOApplication;
        HaptikSDK haptikSDK;
        Object object;
        block7: {
            String string3;
            block8: {
                block6: {
                    boolean bl2;
                    cp_1.Companion.getClass();
                    object = z40_0.Companion;
                    b = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("haptik_custom_css_link");
                    haptikSDK = HaptikSDK.INSTANCE;
                    aJIOApplication = AJIOApplication$a.a();
                    initData = new InitData();
                    initData.setInitializeLanguage("en");
                    object = a;
                    if (object != null) {
                        string2 = "haptik_env";
                        string3 = "";
                        object = ((sw_0)object).getPreference(string2, string3);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    string2 = "https://jio-api.hellohaptik.com";
                    string3 = "https://jio-api.haptikapi.com/";
                    if (object == null || (bl2 = kotlin.text.b.k((CharSequence)object))) break block6;
                    String string4 = "HAPTIK_PRODUCTION";
                    n3 = Intrinsics.areEqual(object, string4);
                    if (n3 == 0) break block7;
                    break block8;
                }
                object = "prod";
                String string5 = "qaregression";
                if (object == string5) break block7;
            }
            string2 = string3;
        }
        initData.setBase_url(string2);
        object = b;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = b;
            initData.setCustomCss((String)object);
        }
        HaptikSDK.init$default(haptikSDK, (Context)aJIOApplication, initData, null, 4, null);
    }

    public static final void c(FragmentActivity fragmentActivity, InitiateChat object, String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        Intrinsics.checkNotNullParameter(object, "initiateChat");
        Intrinsics.checkNotNullParameter(string2, "message");
        Object object2 = UserInformation.getInstance(fragmentActivity.getApplicationContext());
        Object object3 = yn3_0.a;
        Object object4 = new Object[]{};
        ((yn3$a)object3).a("startChat", (Object[])object4);
        object3 = ((UserInformation)object2).getUserName();
        object2 = ((UserInformation)object2).getUserEmailId();
        Object object5 = fragmentActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object5, "getApplicationContext(...)");
        object4 = new jo_2((Context)object5);
        object5 = "INPUT_MOBILE_NUMBER";
        Object object6 = "";
        object4 = ((sw_0)object4).getPreference((String)object5, (String)object6);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
        if (bl3) {
            object4 = object6;
        }
        if (bl3 = TextUtils.isEmpty((CharSequence)object2)) {
            object2 = object6;
        }
        if (bl3 = TextUtils.isEmpty((CharSequence)object3)) {
            object3 = object6;
        }
        object5 = new SignupData();
        Object object7 = ((InitiateChat)object).getAuthCode();
        if (object7 == null) {
            object7 = object6;
        }
        ((SignupData)object5).setAuthCode((String)object7);
        object = ((InitiateChat)object).getAuthId();
        if (object != null) {
            object6 = object;
        }
        ((SignupData)object5).setAuthId((String)object6);
        if (object3 != null) {
            ((SignupData)object5).setUserName((String)object3);
        }
        if (object2 != null) {
            ((SignupData)object5).setEmail((String)object2);
        }
        if (object4 != null) {
            ((SignupData)object5).setMobileNo((String)object4);
        }
        object = HaptikSDK.INSTANCE;
        boolean bl4 = true;
        int n3 = 12;
        object7 = object;
        HaptikSDK.setLaunchMessage$default((HaptikSDK)object, string2, bl4, false, false, n3, null);
        int n4 = 2;
        object2 = null;
        HaptikSDK.loadConversation$default((HaptikSDK)object, (SignupData)object5, null, n4, null);
        if (bl2) {
            fragmentActivity.finish();
        }
    }
}

