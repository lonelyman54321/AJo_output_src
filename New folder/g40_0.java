/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import coil.memory.MemoryCache$a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from G40
 */
public final class g40_0
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ g40_0(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object;
                AJIOApplication.Companion.getClass();
                Object object2 = AJIOApplication$a.a();
                ce1$a ce1$a = new ce1$a((Context)object2);
                object2 = new n10$a();
                int n4 = Build.VERSION.SDK_INT;
                int n7 = 28;
                ArrayList arrayList = ((n10$a)object2).e;
                if (n4 >= n7) {
                    object = new Gd1$a();
                    arrayList.add(object);
                } else {
                    object = new vZ0$a();
                    arrayList.add(object);
                }
                ce1$a.d = object2 = ((n10$a)object2).c();
                object2 = fj_1.ENABLED;
                object2 = Om0.a(ce1$a.b, null, (fj_1)((Object)object2), 28671);
                ce1$a.b = object2;
                object2 = ce1$a.e;
                boolean bl2 = ((ee1)object2).a;
                int n8 = ((ee1)object2).d;
                yE0 yE02 = ((ee1)object2).e;
                boolean bl3 = ((ee1)object2).b;
                ce1$a.e = object = new ee1(bl2, bl3, false, n8, yE02);
                object = AJIOApplication$a.a();
                object2 = new MemoryCache$a((Context)object);
                ((MemoryCache$a)object2).b = 0.25;
                object2 = ((MemoryCache$a)object2).a();
                ce1$a.c = object = new vh1_2(object2);
                object2 = new ye0$a(100, 2);
                ce1$a.b = object2 = Om0.a(ce1$a.b, (pr3$a)object2, null, 32751);
                return ce1$a.a();
            }
            case 0: 
        }
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("urgency_driver_phase2_flags");
    }
}

