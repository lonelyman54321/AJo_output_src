/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters$Builder;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from d23
 */
public final class d23_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "storeId");
        CharSequence charSequence = ld3_2.STORE_LUXE.getStoreId();
        boolean bl2 = Intrinsics.areEqual(string3, charSequence);
        CharSequence charSequence2 = ".ajio";
        if (bl2) {
            string3 = UrlHelper.Companion.getInstance().getBaseUrl();
            charSequence = ".luxe.ajio";
            string3 = b.n(string3, (String)charSequence2, (String)charSequence, false);
        } else {
            charSequence = ld3_2.STORE_AJIOGRAM.getStoreId();
            bl2 = Intrinsics.areEqual(string3, charSequence);
            if (bl2) {
                string3 = UrlHelper.Companion.getInstance().getBaseUrl();
                charSequence = ".ajiogram.ajio";
                string3 = b.n(string3, (String)charSequence2, (String)charSequence, false);
            } else {
                charSequence = ld3_2.STORE_AJIO.getStoreId();
                boolean bl3 = Intrinsics.areEqual(string3, charSequence);
                string3 = bl3 ? UrlHelper.Companion.getInstance().getBaseUrl() : UrlHelper.Companion.getInstance().getBaseUrl();
            }
        }
        charSequence = "/";
        if (string2 != null) {
            block17: {
                boolean bl4 = b.s(string2, (String)charSequence, false);
                if (bl4) break block17;
                string2 = ((String)charSequence).concat(string2);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(string2);
            return ((StringBuilder)charSequence).toString();
        }
        try {
            charSequence2 = new StringBuilder();
        }
        catch (Exception exception) {
            return string2;
        }
        ((StringBuilder)charSequence2).append(string3);
        ((StringBuilder)charSequence2).append((String)charSequence);
        return ((StringBuilder)charSequence2).toString();
    }

    public static final void b(String string2, String string3, t13_0 t13_02, boolean bl2, boolean bl3) {
        String string4;
        Intrinsics.checkNotNullParameter(string3, "shareUrl");
        Intrinsics.checkNotNullParameter(t13_02, "shareInterface");
        Object object = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Object object2 = Uri.parse((String)string3);
        object = ((DynamicLink$Builder)object).setLink((Uri)object2).setDomainUriPrefix("https://ajio.page.link");
        object2 = "setDomainUriPrefix(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        if (bl3) {
            string4 = "com.ril.ajio";
            object2 = new DynamicLink$AndroidParameters$Builder(string4);
            object2 = ((DynamicLink$AndroidParameters$Builder)object2).build();
            ((DynamicLink$Builder)object).setAndroidParameters((DynamicLink$AndroidParameters)object2);
        }
        object2 = new DynamicLink$AndroidParameters$Builder();
        if (bl3) {
            string4 = Uri.parse((String)"https://play.google.com/store/apps/details?id=com.ril.ajio");
        } else {
            string4 = "/sharedcloset";
            boolean bl4 = true;
            int n3 = StringsKt.F(string3, string4, bl4);
            if (n3 != 0) {
                n3 = 1021;
                ((DynamicLink$AndroidParameters$Builder)object2).setMinimumVersion(n3);
                string4 = Uri.parse((String)"https://www.ajio.com/");
            } else {
                string4 = Uri.parse((String)string3);
            }
        }
        ((DynamicLink$AndroidParameters$Builder)object2).setFallbackUrl((Uri)string4);
        object2 = ((DynamicLink$AndroidParameters$Builder)object2).build();
        ((DynamicLink$Builder)object).setAndroidParameters((DynamicLink$AndroidParameters)object2);
        object = ((DynamicLink$Builder)object).buildShortDynamicLink();
        object2 = new b23_0(bl3, bl2, string2, t13_02);
        Object object3 = new zy_1(object2);
        object3 = ((Task)object).addOnSuccessListener((OnSuccessListener)object3);
        object = new c23_0(string2, string3, t13_02, bl2);
        ((Task)object3).addOnFailureListener((OnFailureListener)object);
    }

    public static /* synthetic */ void c(String string2, String string3, t13_0 t13_02) {
        d23_0.b(string2, string3, t13_02, true, false);
    }

    public static final void d(String string2, String string3, t13_0 t13_02) {
        Intrinsics.checkNotNullParameter(string3, "shareUrl");
        Intrinsics.checkNotNullParameter(t13_02, "shareInterface");
        Object object = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Object object2 = Uri.parse((String)string3);
        object = ((DynamicLink$Builder)object).setLink((Uri)object2).setDomainUriPrefix("https://ajio.page.link");
        object2 = new DynamicLink$IosParameters$Builder("com.ril.ajiofnl");
        object2 = ((DynamicLink$IosParameters$Builder)object2).setAppStoreId("1113425372").build();
        object = ((DynamicLink$Builder)object).setIosParameters((DynamicLink$IosParameters)object2);
        object2 = new DynamicLink$AndroidParameters$Builder("com.ril.ajio");
        object2 = ((DynamicLink$AndroidParameters$Builder)object2).build();
        object = ((DynamicLink$Builder)object).setAndroidParameters((DynamicLink$AndroidParameters)object2);
        Intrinsics.checkNotNullExpressionValue(object, "setAndroidParameters(...)");
        object = ((DynamicLink$Builder)object).buildShortDynamicLink();
        object2 = new y13_0(string2, t13_02);
        z13_0 z13_02 = new z13_0((y13_0)object2);
        object = ((Task)object).addOnSuccessListener(z13_02);
        object2 = new a23_0(string2, string3, t13_02);
        ((Task)object).addOnFailureListener((OnFailureListener)object2);
    }

    public static final void e(FragmentActivity fragmentActivity, String intent) {
        block6: {
            Intrinsics.checkNotNullParameter(intent, "to");
            String string2 = "";
            Intrinsics.checkNotNullParameter(string2, "subject");
            Object object = "content";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            boolean bl2 = TextUtils.isEmpty((CharSequence)intent);
            if (bl2) {
                return;
            }
            object = yn3_0.a;
            Object object2 = new Object[]{};
            ((yn3$a)object).f(string2, (Object[])object2);
            intent = new String[]{intent};
            object2 = Uri.parse((String)"mailto:");
            String string3 = "android.intent.action.SENDTO";
            object = new Intent(string3, object2);
            object2 = "android.intent.extra.EMAIL";
            object.putExtra((String)object2, (String[])intent);
            object.putExtra("android.intent.extra.SUBJECT", string2);
            intent = "android.intent.extra.TEXT";
            object.putExtra((String)intent, string2);
            if (fragmentActivity != null) {
                boolean bl3 = fragmentActivity.isFinishing();
                if (bl3) break block6;
                intent = "Send mail...";
                intent = Intent.createChooser((Intent)object, (CharSequence)intent);
                try {
                    fragmentActivity.startActivity(intent);
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    intent = yn3_0.a;
                    intent.e(activityNotFoundException);
                }
            }
        }
    }

    public static final void f(Context context, String string2, String string3, Uri uri, String string4) {
        Intrinsics.checkNotNullParameter(string2, "shareMsg");
        Intrinsics.checkNotNullParameter(string3, "shareSubject");
        String string5 = "header";
        Intrinsics.checkNotNullParameter(string4, string5);
        if (context != null) {
            string5 = new Intent();
            string5.setAction("android.intent.action.SEND");
            String string6 = "android.intent.extra.TEXT";
            string5.putExtra(string6, string2);
            string2 = "android.intent.extra.SUBJECT";
            string5.putExtra(string2, string3);
            if (uri != null) {
                string5.putExtra("android.intent.extra.STREAM", (Parcelable)uri);
                int n3 = 1;
                string5.addFlags(n3);
                string2 = "image/*";
                string5.setType(string2);
            } else {
                string2 = "text/plain";
                string5.setType(string2);
            }
            string2 = Intent.createChooser((Intent)string5, (CharSequence)string4);
            context.startActivity((Intent)string2);
        }
    }
}

