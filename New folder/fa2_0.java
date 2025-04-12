/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.payment.fragment.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fa2
 */
public final class fa2_0
implements OnCompleteListener,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ fa2_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onComplete(Task object) {
        String string2;
        Exception exception2;
        Object object2;
        Object[] objectArray;
        block4: {
            block3: {
                objectArray = (f)this.a;
                Intrinsics.checkNotNullParameter(objectArray, "this$0");
                object2 = "task";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                try {
                    ReviewManager reviewManager;
                    boolean bl2 = ((Task)object).isSuccessful();
                    if (!bl2) {
                        object = yn3_0.a;
                        object2 = "InApp rating popup failed";
                        objectArray = null;
                        objectArray = new Object[]{};
                        ((yn3$a)object).a((String)object2, objectArray);
                        ServiceErrorEventTracker serviceErrorEventTracker = ServiceErrorEventTracker.INSTANCE;
                        String string3 = "in app rating";
                        String string4 = "InApp rating popup failed";
                        Boolean bl3 = Boolean.FALSE;
                        String string5 = "";
                        String string6 = "";
                        serviceErrorEventTracker.trackServiceErrorEvent(string3, string4, 0, null, bl3, string5, string6);
                        return;
                    }
                    object = ((Task)object).getResult();
                    object = (ReviewInfo)object;
                    bl2 = false;
                    object2 = null;
                    if (object == null || (reviewManager = objectArray.H) == null) break block3;
                    object2 = objectArray.requireActivity();
                    object2 = reviewManager.launchReviewFlow((Activity)object2, (ReviewInfo)object);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if (object2 == null) return;
            object = new bm_2(objectArray);
            ((Task)object2).addOnCompleteListener((OnCompleteListener)object);
            return;
        }
        yn3_0.a.e(exception2);
        object2 = exception2.getMessage();
        objectArray = "";
        Object object3 = object2 == null || (string2 = exception2.getMessage()) == null ? objectArray : string2;
        ServiceErrorEventTracker serviceErrorEventTracker = ServiceErrorEventTracker.INSTANCE;
        Boolean bl4 = Boolean.FALSE;
        String string7 = "";
        String string8 = "";
        String string9 = "in app rating";
        serviceErrorEventTracker.trackServiceErrorEvent(string9, (String)object3, 0, null, bl4, string7, string8);
    }
}

