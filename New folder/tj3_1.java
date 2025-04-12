/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.os.Bundle
 *  android.service.notification.StatusBarNotification
 *  org.json.JSONObject
 */
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from tj3
 */
public final class tj3_1
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uj3_1 c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ tj3_1(int n3, uj3_1 uj3_12, Context context, Bundle bundle) {
        this.a = context;
        this.b = n3;
        this.c = uj3_12;
        this.d = bundle;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$context");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "$extras");
        Object object4 = u42_0.a((NotificationManager)object.getSystemService("notification"));
        int n4 = ((StatusBarNotification[])object4).length;
        Object object5 = null;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object6;
            Object object7;
            Object object8;
            block29: {
                block30: {
                    block27: {
                        block28: {
                            block25: {
                                block26: {
                                    block24: {
                                        int n7;
                                        int n8;
                                        object8 = object4[i3];
                                        int n10 = object8.getId();
                                        if (n10 != (n8 = this.b)) continue;
                                        object4 = jA3$a.a(vj3_2.BASIC, (uj3_1)object2);
                                        if (object4 == null || (n7 = ((iA3)object4).b()) != n3) break;
                                        object7 = object.getApplicationContext();
                                        object = object3.clone();
                                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.os.Bundle");
                                        object = (Bundle)object;
                                        object.remove("wzrk_rnv");
                                        n7 = 0;
                                        object4 = null;
                                        object.putString("wzrk_pid", null);
                                        object.putString("pt_id", "pt_basic");
                                        object3 = "pt_json";
                                        object6 = object.getString((String)object3);
                                        if (object6 != null) {
                                            try {
                                                object5 = new JSONObject((String)object6);
                                                break block24;
                                            }
                                            catch (Exception exception) {
                                                com.clevertap.android.sdk.b.j();
                                            }
                                        }
                                        i3 = 0;
                                        object5 = null;
                                    }
                                    object6 = ((uj3_1)object2).B;
                                    if (object6 == null) break block25;
                                    Intrinsics.checkNotNull(object6);
                                    n4 = ((String)object6).length();
                                    if (n4 <= 0) break block25;
                                    object6 = "pt_title";
                                    if (object5 == null) break block26;
                                    object8 = ((uj3_1)object2).B;
                                    if ((object8 = object5.put((String)object6, object8)) != null) break block25;
                                }
                                object8 = ((uj3_1)object2).B;
                                object.putString((String)object6, (String)object8);
                                object6 = Unit.a;
                            }
                            if ((object6 = ((uj3_1)object2).D) == null) break block27;
                            Intrinsics.checkNotNull(object6);
                            n4 = ((String)object6).length();
                            if (n4 <= 0) break block27;
                            object6 = "pt_big_img";
                            if (object5 == null) break block28;
                            object8 = ((uj3_1)object2).D;
                            if ((object8 = object5.put((String)object6, object8)) != null) break block27;
                        }
                        object8 = ((uj3_1)object2).D;
                        object.putString((String)object6, (String)object8);
                        object6 = Unit.a;
                    }
                    if ((object6 = ((uj3_1)object2).C) == null) break block29;
                    Intrinsics.checkNotNull(object6);
                    n4 = ((String)object6).length();
                    if (n4 <= 0) break block29;
                    object6 = "pt_msg";
                    if (object5 == null) break block30;
                    object8 = ((uj3_1)object2).C;
                    if ((object8 = object5.put((String)object6, object8)) != null) break block29;
                }
                object2 = ((uj3_1)object2).C;
                object.putString((String)object6, (String)object2);
                object2 = Unit.a;
            }
            if (object5 != null) {
                object2 = object5.toString();
                object.putString((String)object3, (String)object2);
            }
            object.putString("pt_ck", null);
            object.putString("wzrk_ck", null);
            object.remove("notificationId");
            Intrinsics.checkNotNull(object7);
            object2 = new uj3_1((Context)object7, (Bundle)object);
            object3 = zb2_0.a((Bundle)object);
            object3 = com.clevertap.android.sdk.a.h((Context)object7, (String)object3);
            if (object3 == null) break;
            object4 = object3.b.a;
            object6 = jh_1.a((CleverTapInstanceConfig)object4);
            object6 = ((kh_1)object6).b();
            object5 = "CleverTapAPI#renderPushNotification";
            object8 = new nV((com.clevertap.android.sdk.a)object3, (uj3_1)object2, (Bundle)object, (Context)object7);
            try {
                ((a)object6).d((String)object5, (Callable)object8);
            }
            catch (Throwable throwable) {
                object7 = ((CleverTapInstanceConfig)object4).b();
                object7.getClass();
                com.clevertap.android.sdk.b.g();
            }
            break;
        }
    }
}

