/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.FacebookException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V13
 */
public final class v13_0 {
    public final /* synthetic */ pi0_1 a;

    public v13_0() {
        this.a = null;
    }

    public final void a(pm_0 object) {
        Intrinsics.checkNotNullParameter(object, "appCall");
        w13_0.c("cancelled", null);
        object = this.a;
        if (object != null) {
            object.onCancel();
        }
    }

    public final void b(pm_0 object, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(object, "appCall");
        object = "error";
        Intrinsics.checkNotNullParameter(facebookException, (String)object);
        Intrinsics.checkNotNullParameter(facebookException, "ex");
        String string2 = facebookException.getMessage();
        w13_0.c((String)object, string2);
        object = this.a;
        if (object != null) {
            object.a(facebookException);
        }
    }

    public final void c(pm_0 object, Bundle object2) {
        String string2 = "appCall";
        Intrinsics.checkNotNullParameter(object, string2);
        if (object2 != null) {
            String string3;
            boolean bl2;
            object = "result";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            string2 = "completionGesture";
            boolean bl3 = object2.containsKey(string2);
            string2 = bl3 ? object2.getString(string2) : object2.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
            bl3 = false;
            pi0_1 pi0_12 = this.a;
            if (string2 != null && !(bl2 = (string3 = "post").equalsIgnoreCase(string2))) {
                object = "cancel";
                boolean bl4 = ((String)object).equalsIgnoreCase(string2);
                if (bl4) {
                    object = "cancelled";
                    w13_0.c((String)object, null);
                    if (pi0_12 != null) {
                        pi0_12.onCancel();
                    }
                } else {
                    object = new FacebookException("UnknownError");
                    Intrinsics.checkNotNullParameter(object, "ex");
                    object2 = ((Throwable)object).getMessage();
                    string2 = "error";
                    w13_0.c(string2, (String)object2);
                    if (pi0_12 != null) {
                        pi0_12.a((FacebookException)object);
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = "postId";
                boolean bl5 = object2.containsKey((String)object);
                if (bl5) {
                    object2.getString((String)object);
                } else {
                    object = "com.facebook.platform.extra.POST_ID";
                    bl5 = object2.containsKey((String)object);
                    if (bl5) {
                        object2.getString((String)object);
                    } else {
                        object = "post_id";
                        object2.getString((String)object);
                    }
                }
                object = "succeeded";
                w13_0.c((String)object, null);
                if (pi0_12 != null) {
                    object = new Object();
                    pi0_12.onSuccess(object);
                }
            }
        }
    }
}

