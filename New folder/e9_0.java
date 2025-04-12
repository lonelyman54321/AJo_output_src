/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.network.cache.CustomDiskCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E9
 */
public final class e9_0
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ e9_0(long l2, boolean bl2, String string2) {
        this.a = bl2;
        this.b = l2;
        this.c = string2;
    }

    public final Object invoke(Object objectArray) {
        Object[] objectArray2 = objectArray;
        objectArray2 = (dl2_2)objectArray;
        objectArray = this.c;
        Intrinsics.checkNotNullParameter(objectArray, "$cacheKey");
        Intrinsics.checkNotNullParameter(objectArray2, "response");
        Object object = (NavigationParent)objectArray2.b;
        Object object2 = objectArray2.a;
        boolean bl2 = ((cl2_2)object2).d();
        if (bl2 && object != null) {
            boolean bl3 = this.a;
            if (bl3) {
                objectArray2 = new Gson();
                objectArray2 = objectArray2.toJson(object);
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                long l2 = this.b;
                object2 = new CustomDiskCache((Context)aJIOApplication, l2);
                ((CustomDiskCache)object2).put((String)objectArray, (String)objectArray2);
                objectArray = yn3_0.a;
                bl3 = false;
                objectArray2 = new Object[]{};
                object2 = "";
                objectArray.a((String)object2, objectArray2);
            }
            objectArray = DataCallback.Companion.onSuccess(object);
        } else {
            n9_0.a.getClass();
            object = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object2 = "BackGround_AllCMSCategories";
            Object var7_8 = null;
            objectArray = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object, (dl2_2)objectArray2, (String)object2, false, null, null, n3, null);
        }
        return objectArray;
    }
}

