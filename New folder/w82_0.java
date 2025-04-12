/*
 * Decompiled with CFR 0.152.
 */
import com.appsflyer.internal.AFj1uSDK;
import com.facebook.appevents.c;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w82
 */
public final class w82_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w82_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        block15: {
            Object object = this.c;
            Object object2 = this.b;
            int n3 = this.a;
            switch (n3) {
                default: {
                    object2 = (AFj1uSDK)object2;
                    object = (Runnable)object;
                    AFj1uSDK.b((AFj1uSDK)object2, (Runnable)object);
                    return;
                }
                case 0: 
            }
            object2 = (String)object2;
            object = (c)object;
            Class<y82_0> clazz = y82_0.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                Class<li2_0> clazz2 = "$applicationId";
                Intrinsics.checkNotNullParameter(object2, (String)((Object)clazz2));
                clazz2 = "$event";
                Intrinsics.checkNotNullParameter(object, (String)((Object)clazz2));
                object = kotlin.collections.a.b(object);
                clazz2 = li2_0.a;
                clazz2 = li2_0.class;
                boolean bl3 = td0.b(clazz2);
                if (bl3) break block15;
                Object object3 = "applicationId";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = "appEvents";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = li2_0.a;
                LI2$a lI2$a = LI2$a.CUSTOM_APP_EVENTS;
                try {
                    ((li2_0)object3).b(lI2$a, (String)object2, (List)object);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(clazz2, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(clazz, throwable2);
                    }
                }
            }
        }
    }
}

