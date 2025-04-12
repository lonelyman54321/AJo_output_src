/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;

/*
 * Renamed from k3
 */
public final class k3_0 {
    public final we a;
    public final k0_0 b;
    public final tf_0 c;
    public final CleverTapInstanceConfig d;
    public final Context e;
    public final E80 f;
    public final InAppController g;
    public final hC2 h;
    public final x03 i;

    public k3_0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, we we2, E80 e80, x03 x032, hC2 hC22, ck_1 ck_12, InAppController inAppController, EventQueueManager eventQueueManager) {
        this.e = context;
        this.d = cleverTapInstanceConfig;
        this.a = we2;
        this.f = e80;
        this.i = x032;
        this.h = hC22;
        this.c = ck_12;
        this.g = inAppController;
        this.b = eventQueueManager;
    }

    public static void a(k3_0 k3_02) {
        Object object = k3_02.d;
        Object object2 = ((CleverTapInstanceConfig)object).b();
        Object object3 = "Starting to handle install referrer";
        String string2 = ((CleverTapInstanceConfig)object).a;
        ((b)object2).b(string2, (String)object3);
        object2 = k3_02.e;
        object2 = InstallReferrerClient.newBuilder((Context)object2);
        object2 = ((InstallReferrerClient$Builder)object2).build();
        object3 = new n3_0(k3_02, (InstallReferrerClient)object2);
        try {
            ((InstallReferrerClient)object2).startConnection((InstallReferrerStateListener)object3);
        }
        catch (Throwable throwable) {
            object = ((CleverTapInstanceConfig)object).b();
            object3 = "Google Play Install Referrer's InstallReferrerClient Class not found - ";
            object2 = new StringBuilder((String)object3);
            String string3 = throwable.getLocalizedMessage();
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(" \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle");
            string3 = ((StringBuilder)object2).toString();
            ((b)object).b(string2, string3);
        }
    }

    public final void b() {
        long l2;
        E80.u = false;
        this.i.a = l2 = System.currentTimeMillis();
        Object object = this.d;
        Object object2 = ((CleverTapInstanceConfig)object).b();
        String string2 = ((CleverTapInstanceConfig)object).a;
        ((b)object2).b(string2, "App in background");
        object = jh_1.a((CleverTapInstanceConfig)object).b();
        object2 = new k3$a_0(this);
        ((a)object).c("activityPaused", (Callable)object2);
    }

    public final void c(Activity object) {
        Object object2 = this.d;
        Object object3 = ((CleverTapInstanceConfig)object2).b();
        Object object4 = ((CleverTapInstanceConfig)object2).a;
        Object object5 = "App in foreground";
        ((b)object3).b((String)object4, (String)object5);
        object3 = this.i;
        long l2 = ((x03)object3).a;
        long l3 = 0L;
        Object object6 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object6 > 0) {
            l2 = System.currentTimeMillis();
            l3 = ((x03)object3).a;
            long l4 = (l2 -= l3) - (l3 = 1200000L);
            object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object6 > 0) {
                object4 = ((x03)object3).c;
                object5 = ((CleverTapInstanceConfig)object4).b();
                String string2 = "Session Timed Out";
                object4 = ((CleverTapInstanceConfig)object4).a;
                ((b)object5).b((String)object4, string2);
                ((x03)object3).Z();
            }
        }
        object3 = this.f;
        boolean bl2 = ((E80)object3).h();
        if (!bl2) {
            object3 = this.a;
            ((we)object3).W();
            ((we)object3).I();
            object3 = this.h;
            object4 = jh_1.a(((hC2)object3).f).a();
            object5 = new gC2((hC2)object3);
            ((a)object4).c("PushProviders#refreshAllTokens", (Callable)object5);
            object3 = jh_1.a((CleverTapInstanceConfig)object2).b();
            object4 = new k3$b_0(this);
            object5 = "HandlingInstallReferrer";
            ((a)object3).c((String)object5, (Callable)object4);
            object3 = this.c;
            try {
                object3.getClass();
            }
            catch (Exception exception) {
                object3 = ((CleverTapInstanceConfig)object2).b();
                object2 = ((CleverTapInstanceConfig)object2).a;
                object4 = "Failed to trigger location";
                ((b)object3).b((String)object2, (String)object4);
            }
            catch (IllegalStateException illegalStateException) {
                object4 = ((CleverTapInstanceConfig)object2).b();
                object2 = ((CleverTapInstanceConfig)object2).a;
                object3 = illegalStateException.getLocalizedMessage();
                ((b)object4).b((String)object2, (String)object3);
            }
        }
        this.b.X();
        object2 = this.g;
        bl2 = ((InAppController)object2).f();
        if (bl2) {
            object = ((InAppController)object2).n;
            object3 = ((cg1_0)((Object)object)).a;
            object4 = ((InAppController)object2).c;
            if (object3 != null) {
                object3 = ((CleverTapInstanceConfig)object4).a;
                object4 = "Found a pending inapp runnable. Scheduling it";
                ((InAppController)object2).l.b((String)object3, (String)object4);
                object2 = ((cg1_0)((Object)object)).a;
                long l7 = 200L;
                object.postDelayed((Runnable)object2, l7);
                object2 = null;
                ((cg1_0)((Object)object)).a = null;
            } else {
                boolean bl3 = ((CleverTapInstanceConfig)object4).h;
                if (!bl3) {
                    object = jh_1.a((CleverTapInstanceConfig)object4).c("TAG_FEATURE_IN_APPS");
                    object3 = new df1_0((InAppController)object2);
                    object2 = "InappController#showNotificationIfAvailable";
                    ((a)object).c((String)object2, (Callable)object3);
                }
            }
        } else {
            if (object != null) {
                object.getLocalClassName();
            }
            com.clevertap.android.sdk.b.c();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d(Uri uri, Bundle bundle, String object) {
        block12: {
            Throwable throwable2;
            block14: {
                block13: {
                    Object object2;
                    block11: {
                        object2 = this.d;
                        if (object == null) {
                            boolean bl2 = ((CleverTapInstanceConfig)object2).p;
                            if (bl2) break block11;
                        }
                        try {
                            object2 = ((CleverTapInstanceConfig)object2).a;
                        }
                        catch (Throwable throwable2) {}
                        boolean bl3 = ((String)object2).equals(object);
                        if (!bl3) break block12;
                    }
                    object = this.a;
                    if (bundle == null) break block13;
                    boolean bl4 = bundle.isEmpty();
                    if (bl4) break block13;
                    object2 = "wzrk_pn";
                    bl4 = bundle.containsKey((String)object2);
                    if (!bl4) break block13;
                    ((we)object).b0(bundle);
                    break block14;
                }
                if (uri == null) break block12;
                bundle = null;
                try {
                    ((we)object).X(false, uri);
                    return;
                }
                catch (Throwable throwable3) {
                    return;
                }
            }
            throwable2.getLocalizedMessage();
            com.clevertap.android.sdk.b.j();
        }
    }
}

