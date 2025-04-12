/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.closet.WishlistSyncWorker;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IH3
 */
public final class ih3_1 {
    public static boolean a;
    public static final HashSet b;

    static {
        HashSet hashSet;
        b = hashSet = new HashSet();
    }

    public static void a(boolean bl2) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "wishlist_state_enable";
        boolean bl3 = ((ao0_0)object).a(string2);
        if (bl3 && (bl3 = ((ao0_0)(object = z40$a.a((Context)AJIOApplication$a.a()).a)).a(string2 = "wishlist_state_api_enable")) && bl2 && !(bl2 = a)) {
            Object object2 = yn3_0.a;
            bl3 = false;
            object = new Object[]{};
            ((yn3$a)object2).a("wishlistSync: worker scheduled", (Object[])object);
            object = WishlistSyncWorker.class;
            Intrinsics.checkNotNullParameter(object, "workerClass");
            object2 = new CI3$a((Class)object);
            object2 = (y92)((CI3$a)object2).a();
            object = AJIOApplication$a.a();
            Intrinsics.checkNotNullParameter(object, "context");
            object = ni3_1.i((Context)object);
            Intrinsics.checkNotNullExpressionValue(object, "getInstance(context)");
            string2 = "WishlistSyncWorker";
            DE0 dE0 = DE0.KEEP;
            ((li3_1)object).d(string2, dE0, (y92)object2);
        }
    }
}

