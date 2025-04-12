/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings$Global
 *  android.view.View
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.ui.R$id;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uH3
 */
public final class uh3_0 {
    public static final LinkedHashMap a;

    static {
        LinkedHashMap linkedHashMap;
        a = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final jb3_2 a(Context context) {
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                st0_2 st0_22;
                Object object = linkedHashMap.get(context);
                if (object != null) return (jb3_2)object;
                Object object2 = context.getContentResolver();
                object = "animator_duration_scale";
                Object object3 = Settings.Global.getUriFor(object);
                int n3 = 6;
                Object object4 = null;
                int n4 = -1;
                Object object5 = sr_2.a(n4, n3, null);
                object = Looper.getMainLooper();
                object = y21_0.a(object);
                Object object6 = new th3_0((le_2)object5, (Handler)object);
                Float f5 = null;
                object4 = object;
                object = new Object((ContentResolver)object2, (Uri)object3, (th3_0)((Object)object6), (le_2)object5, context, null);
                object4 = new br2_2((Function2)object);
                object2 = be_1.a();
                object3 = ir0_2.a;
                object3 = bg1_1.a;
                object2 = CoroutineContext$Element$a.d((CoroutineContext)object3, (CoroutineContext$Element)object2);
                object = new Object((CoroutineContext)object2);
                long l2 = 0L;
                long l3 = Long.MAX_VALUE;
                object6 = new cb3_2(l2, l3);
                object2 = context.getContentResolver();
                object3 = "animator_duration_scale";
                float f6 = 1.0f;
                float f7 = Settings.Global.getFloat((ContentResolver)object2, (String)object3, (float)f6);
                f5 = Float.valueOf(f7);
                object4 = tt0_2.a((es0_2)object4);
                object2 = lb3_2.a(f5);
                object3 = d33$a.a;
                boolean bl2 = Intrinsics.areEqual(object6, object3);
                object3 = bl2 ? l90_0.DEFAULT : l90_0.UNDISPATCHED;
                Object object7 = object3;
                object5 = ((c33)object4).a;
                object3 = st0_22;
                st0_22 = new st0_2((d33)object6, (es0_2)object5, (qr1_2)object2, f5, null);
                object4 = ((c33)object4).d;
                object = Ae3.c(object, (CoroutineContext)object4, (l90_0)((Object)object7), st0_22);
                object4 = new ge2_2((kb3_2)object2, (mb3_2)object);
                linkedHashMap.put(context, object4);
                object = object4;
                return (jb3_2)object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final A30 b(View object) {
        int n3 = R$id.androidx_compose_ui_view_composition_context;
        object = (n3 = (object = object.getTag(n3)) instanceof A30) != 0 ? (A30)object : null;
        return object;
    }
}

