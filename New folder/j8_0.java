/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 */
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.lifecycle.E$b;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j8
 */
public final class j8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentCallbacks2 b;

    public /* synthetic */ j8_0(ComponentCallbacks2 componentCallbacks2, int n3) {
        this.a = n3;
        this.b = componentCallbacks2;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                F12 f12;
                ComponentCallbacks2 componentCallbacks2 = object;
                componentCallbacks2 = (Application)object;
                Intrinsics.checkNotNull(componentCallbacks2);
                object = AjioApiConnector.INSTANCE.getPlpApi();
                NewPlpRepo newPlpRepo = new NewPlpRepo((Application)componentCallbacks2, (PlpApi)object);
                UserRepo userRepo = new UserRepo((Application)componentCallbacks2);
                WishListRepo wishListRepo = new WishListRepo((Context)componentCallbacks2);
                RtbRepo rtbRepo = new RtbRepo((Context)componentCallbacks2);
                F12 f122 = f12;
                f12 = new F12((Application)componentCallbacks2, newPlpRepo, userRepo, wishListRepo, rtbRepo);
                return f12;
            }
            case 0: 
        }
        Object object2 = q9_0.Companion;
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = ((z41_0)object).getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, e$b, (Wd0)object);
        object2 = yw2_0.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (yw2_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

