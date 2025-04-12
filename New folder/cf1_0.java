/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.clevertap.android.sdk.inapp.InAppController;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from Cf1
 */
public final class cf1_0
implements Function0 {
    public final /* synthetic */ InAppController a;
    public final /* synthetic */ mp0_0 b;
    public final /* synthetic */ yB0 c;
    public final /* synthetic */ E80 d;

    public /* synthetic */ cf1_0(InAppController inAppController, mp0_0 mp0_02, yB0 yB02, E80 e80) {
        this.a = inAppController;
        this.b = mp0_02;
        this.c = yB02;
        this.d = e80;
    }

    public final Object invoke() {
        bb0_0 bb0_02;
        InAppController inAppController = this.a;
        inAppController.getClass();
        HashMap hashMap = wm1_1.c(this.b.d());
        this.d.getClass();
        yB0 yB02 = this.c;
        yB02.getClass();
        Intrinsics.checkNotNullParameter(hashMap, "eventProperties");
        int n3 = 20;
        String string2 = "App Launched";
        Object object = bb0_02;
        bb0_02 = new bb0_0(string2, hashMap, null, null, n3);
        object = kotlin.collections.a.b(bb0_02);
        yB02 = yB02.d((List)object);
        int n4 = yB02.length();
        if (n4 > 0) {
            inAppController.e((JSONArray)yB02);
        }
        return null;
    }
}

