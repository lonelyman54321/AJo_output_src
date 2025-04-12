/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.suggestedevents.b;
import com.facebook.appevents.suggestedevents.b$a;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class Um0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ Um0(int n3, Object object, Object object2, Object object3, Object object4) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = object4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        String string2 = null;
        Object object = this.e;
        String[] stringArray = this.d;
        Object object2 = this.c;
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (JSONObject)object3;
                object2 = (String)object2;
                stringArray = (b)stringArray;
                object = (String)object;
                Class<b> clazz = b.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                String string3 = "$viewData";
                try {
                    Intrinsics.checkNotNullParameter(object3, string3);
                    String string4 = "$buttonText";
                    Intrinsics.checkNotNullParameter(object2, string4);
                    String string5 = "this$0";
                    Intrinsics.checkNotNullParameter(stringArray, string5);
                    String string6 = "$pathID";
                    Intrinsics.checkNotNullParameter(object, string6);
                    try {
                        Context context = FacebookSdk.a();
                        String string8 = lz3_0.n(context);
                        string8 = string8.toLowerCase();
                        Object object4 = "this as java.lang.String).toLowerCase()";
                        Intrinsics.checkNotNullExpressionValue(string8, (String)object4);
                        object3 = ij0_1.a(string8, (JSONObject)object3);
                        stringArray = stringArray.d;
                        stringArray = ij0_1.c((String)object2, (String)stringArray, string8);
                        if (object3 == null) {
                            return;
                        }
                        HP1$a hP1$a = HP1$a.MTML_APP_EVENT_PREDICTION;
                        int n4 = 1;
                        object4 = new float[n4][];
                        object4[0] = object3;
                        stringArray = new String[]{stringArray};
                        if ((stringArray = hp1_1.f(hP1$a, (float[][])object4, stringArray)) == null) {
                            return;
                        }
                        string2 = stringArray[0];
                        ox2_1.a((String)object, string2);
                        object = "other";
                        boolean bl3 = Intrinsics.areEqual(string2, object);
                        if (bl3) return;
                        object = com.facebook.appevents.suggestedevents.b.e;
                        b$a.c(string2, (String)object2, (float[])object3);
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
                return;
            }
            case 0: 
        }
        stringArray = (TransportScheduleCallback)stringArray;
        object = (EventInternal)object;
        object3 = (DefaultScheduler)object3;
        object2 = (TransportContext)object2;
        DefaultScheduler.b((DefaultScheduler)object3, (TransportContext)object2, (TransportScheduleCallback)stringArray, (EventInternal)object);
    }
}

