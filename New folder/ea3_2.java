/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ea3
 */
public final class ea3_2
implements Function1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ SplashScreenActivity b;
    public final /* synthetic */ long c;

    public /* synthetic */ ea3_2(Intent intent, SplashScreenActivity splashScreenActivity, long l2) {
        this.a = intent;
        this.b = splashScreenActivity;
        this.c = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        SplashScreenActivity splashScreenActivity;
        block5: {
            boolean bl2;
            block4: {
                Object object2;
                object = (PendingDynamicLinkData)object;
                Intent intent = this.a;
                Intrinsics.checkNotNullParameter(intent, "$intent");
                splashScreenActivity = this.b;
                Intrinsics.checkNotNullParameter(splashScreenActivity, "this$0");
                long l2 = System.currentTimeMillis();
                if (object != null && (object2 = ((PendingDynamicLinkData)object).getLink()) != null) {
                    Uri uri = intent.getData();
                    String string2 = "shortLinkUrl";
                    intent.putExtra(string2, (Parcelable)uri);
                    object = ((PendingDynamicLinkData)object).getLink();
                    intent.setData((Uri)object);
                } else {
                    try {
                        boolean bl3;
                        String string3;
                        object = ba3_1.a(splashScreenActivity);
                        if (object == null || (object = object.getHost()) == null || (bl2 = ((String)object).equalsIgnoreCase(string3 = splashScreenActivity.getPackageName())) != (bl3 = true) || (object = ba3_1.a(splashScreenActivity)) == null) break block4;
                        object = object.getHost();
                        break block5;
                    }
                    catch (NoSuchMethodError noSuchMethodError) {
                        qu3 qu32;
                        object = splashScreenActivity.z2();
                        long l3 = this.c;
                        float f5 = l2 -= l3;
                        String string4 = "NoSuchMethodError";
                        object2 = qu32;
                        qu32 = new qu3(null, null, false, string4, f5);
                        String string5 = "<set-?>";
                        String string6 = "remarketing";
                        Intrinsics.checkNotNullParameter(string6, string5);
                        qu32.f = string6;
                        ((pa3_1)object).c(qu32);
                    }
                }
            }
            bl2 = false;
            object = null;
        }
        splashScreenActivity.E2((String)object, null);
        splashScreenActivity.A2();
        return Unit.a;
    }
}

