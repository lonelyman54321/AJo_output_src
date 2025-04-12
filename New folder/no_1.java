/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from No
 */
public final class no_1
implements InstallStateUpdatedListener {
    public final /* synthetic */ oo_0 a;

    public /* synthetic */ no_1(oo_0 oo_02) {
        this.a = oo_02;
    }

    public final void onStateUpdate(Object object) {
        block11: {
            int n3;
            Object object2;
            Object object3;
            block10: {
                object = (InstallState)object;
                object3 = this.a;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object2 = "it";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = ((InstallState)object).installStatus();
                int n4 = 11;
                if (n3 == n4) break block10;
                switch (n3) {
                    default: {
                        object3 = yn3_0.a;
                        int n7 = ((InstallState)object).installStatus();
                        object = hj0_0.a(n7, "installed status ");
                        object2 = new Object[]{};
                        ((yn3$a)object3).a((String)object, (Object[])object2);
                        break;
                    }
                    case 6: {
                        object = yn3_0.a;
                        object3 = "installed status cancelled";
                        object2 = new Object[]{};
                        ((yn3$a)object).a((String)object3, (Object[])object2);
                        break;
                    }
                    case 5: {
                        object = yn3_0.a;
                        object3 = "installed status failed";
                        object2 = new Object[]{};
                        ((yn3$a)object).a((String)object3, (Object[])object2);
                        break;
                    }
                    case 4: {
                        object = yn3_0.a;
                        Object object4 = new Object[]{};
                        ((yn3$a)object).a("installed status installed", object4);
                        object = ((oo_0)object3).a;
                        object2 = DataCallback.Companion;
                        n4 = 5;
                        object4 = n4;
                        object2 = ((DataCallback$Companion)object2).onSuccess(object4);
                        ((LiveData)object).k(object2);
                        object = ((oo_0)object3).d;
                        if (object != null && (object3 = ((oo_0)object3).e) != null) {
                            object3.unregisterListener((InstallStateUpdatedListener)object);
                            break;
                        }
                        break block11;
                    }
                    case 3: {
                        object = yn3_0.a;
                        object3 = "installed status installing";
                        object2 = new Object[]{};
                        ((yn3$a)object).a((String)object3, (Object[])object2);
                        break;
                    }
                    case 2: {
                        object = yn3_0.a;
                        Object[] objectArray = new Object[]{};
                        ((yn3$a)object).a("installed status downloading", objectArray);
                        object = ((oo_0)object3).a;
                        object3 = DataCallback.Companion;
                        n3 = 3;
                        object2 = n3;
                        object3 = ((DataCallback$Companion)object3).onSuccess(object2);
                        ((LiveData)object).k(object3);
                        break;
                    }
                    case 1: {
                        object = yn3_0.a;
                        Object[] objectArray = new Object[]{};
                        ((yn3$a)object).a("installed status pending", objectArray);
                        object = ((oo_0)object3).a;
                        object3 = DataCallback.Companion;
                        n3 = 2;
                        object2 = n3;
                        object3 = ((DataCallback$Companion)object3).onSuccess(object2);
                        ((LiveData)object).k(object3);
                        break;
                    }
                    case 0: {
                        object = yn3_0.a;
                        object3 = "installed status unknown";
                        object2 = new Object[]{};
                        ((yn3$a)object).a((String)object3, (Object[])object2);
                        break;
                    }
                }
                break block11;
            }
            object = yn3_0.a;
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a("installed status downloaded", objectArray);
            object = ((oo_0)object3).a;
            object3 = DataCallback.Companion;
            n3 = 4;
            object2 = n3;
            object3 = ((DataCallback$Companion)object3).onSuccess(object2);
            ((LiveData)object).k(object3);
        }
    }
}

