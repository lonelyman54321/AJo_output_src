/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.f;
import com.facebook.j;
import com.facebook.j$a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class jy3
implements Runnable {
    public final /* synthetic */ long a;

    public /* synthetic */ jy3(long l2) {
        this.a = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Class<j> clazz;
        block8: {
            Object object;
            block5: {
                String string2;
                Object object2;
                Object object3;
                Object object4;
                long l2;
                block7: {
                    boolean bl2;
                    block6: {
                        l2 = this.a;
                        object4 = "auto_event_setup_enabled";
                        clazz = j.class;
                        bl2 = td0.b(clazz);
                        if (bl2) {
                            return;
                        }
                        try {
                            object3 = j.f;
                            bl2 = ((j$a)object3).a();
                            if (!bl2) break block5;
                            object3 = FacebookSdk.b();
                            if ((object3 = dl0_2.k((String)object3, false)) == null || !(bl2 = ((al0_2)object3).j)) break block5;
                            object3 = FacebookSdk.a();
                            object3 = Zq$a.a((Context)object3);
                            object2 = null;
                            if (object3 == null || (string2 = ((zq_0)object3).a()) == null) break block6;
                            object3 = ((zq_0)object3).a();
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    string2 = new Bundle();
                    String string3 = "advertiser_id";
                    string2.putString(string3, (String)object3);
                    object3 = "fields";
                    string2.putString((String)object3, (String)object4);
                    object3 = GraphRequest.j;
                    object3 = "app";
                    object3 = GraphRequest$c.g(null, (String)object3, null);
                    object2 = "<set-?>";
                    Intrinsics.checkNotNullParameter(string2, (String)object2);
                    ((GraphRequest)object3).d = string2;
                    object3 = ((GraphRequest)object3).c();
                    object3 = ((f)object3).b;
                    if (object3 != null) {
                        object2 = j.g;
                        boolean bl3 = object3.optBoolean((String)object4, false);
                        ((j$a)object2).c = object4 = Boolean.valueOf(bl3);
                        ((j$a)object2).d = l2;
                        object = j.a;
                        ((j)object).l((j$a)object2);
                    }
                }
            }
            object = j.c;
            ((AtomicBoolean)object).set(false);
            return;
        }
        td0.a(clazz, throwable2);
    }
}

