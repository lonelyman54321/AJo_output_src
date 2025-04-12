/*
 * Decompiled with CFR 0.152.
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class HaptikSDK$a
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public HaptikSDK$a(String string2, String string3, String string4, String string5) {
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        object = (Response)object;
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Response)object).getStatus();
        String string3 = this.e;
        String string4 = this.d;
        String string5 = this.c;
        if (n3 != 0 && (n3 = (string2 = ((Response)object).getMessage()).length()) > 0) {
            string2 = HaptikSDK.access$getInitData$p();
            object = ((Response)object).getMessage();
            String string6 = "custom-css";
            string2.put(string6, object);
            HaptikSDK.access$downloadBundleAndSetInitializedStatus(HaptikSDK.INSTANCE, string5, string4, string3);
            string2 = this.f;
            Intrinsics.checkNotNullParameter(string2, "value");
            object = yl0.a;
            if (object != null) {
                object = object.edit();
                string3 = "custom_css_file_url";
                object.putString(string3, string2);
                object.apply();
                return Unit.a;
            }
            Intrinsics.throwUninitializedPropertyAccessException("helper");
            throw null;
        }
        object = HaptikSDK.INSTANCE;
        HaptikSDK.access$downloadBundleAndSetInitializedStatus((HaptikSDK)object, string5, string4, string3);
        return Unit.a;
    }
}

