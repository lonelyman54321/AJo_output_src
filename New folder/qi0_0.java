/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from qI0
 */
public abstract class qi0_0 {
    public static final Object f;
    public final Activity a;
    public final mw0_0 b;
    public List c;
    public final int d;
    public bk_1 e;

    static {
        Object object;
        f = object = new Object();
    }

    public qi0_0(mw0_0 object, int n3) {
        Intrinsics.checkNotNullParameter(object, "fragmentWrapper");
        this.b = object;
        this.a = null;
        this.d = n3;
        object = ((mw0_0)object).a();
        if (object != null) {
            return;
        }
        String string2 = "Cannot use a fragment that is not attached to an activity".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public qi0_0(Activity activity, int n3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
        this.b = null;
        this.d = n3;
        this.e = null;
    }

    public abstract pm_0 a();

    public final Activity b() {
        Object object = this.a;
        if (object == null) {
            object = this.b;
            object = object != null ? ((mw0_0)object).a() : null;
        }
        return object;
    }

    public abstract List c();

    public final void d(ShareContent object) {
        Object object2;
        Intent intent;
        boolean bl2;
        Object object3;
        Object object4;
        block24: {
            block23: {
                boolean bl3;
                object4 = f;
                object3 = "mode";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object4 = this.c;
                if (object4 == null) {
                    this.c = object4 = this.c();
                }
                object4 = this.c;
                object3 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>";
                Intrinsics.checkNotNull(object4, (String)object3);
                object4 = object4.iterator();
                do {
                    bl2 = object4.hasNext();
                    intent = null;
                    if (!bl2) break block23;
                } while (!(bl3 = ((qI0$a)(object3 = (qI0$a)object4.next())).a((ShareContent)object, true)));
                try {
                    object = ((qI0$a)object3).b((ShareContent)object);
                }
                catch (FacebookException facebookException) {
                    object4 = this.a();
                    hq0_0.d((pm_0)object4, facebookException);
                    object = object4;
                }
                break block24;
            }
            object = null;
        }
        object4 = "appCall";
        if (object == null) {
            object = this.a();
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object2 = "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14.";
            object3 = new FacebookException((String)object2);
            hq0_0.d((pm_0)object, (FacebookException)object3);
        }
        if (bl2 = (object3 = this.b()) instanceof O3) {
            object3 = this.b();
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            object3 = ((O3)object3).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(object3, "registryOwner.activityResultRegistry");
            object2 = this.e;
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object4 = "registry";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            int n3 = td0.b(object);
            if (n3 == 0) {
                try {
                    intent = ((pm_0)object).c;
                }
                catch (Throwable throwable) {
                    td0.a(object, throwable);
                }
            }
            if (intent != null) {
                n3 = ((pm_0)object).b();
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNullParameter(intent, "intent");
                object4 = new Ref$ObjectRef();
                String string2 = hj0_0.a(n3, "facebook-dialog-request-");
                iq0_0 iq0_02 = new x3();
                gq0_0 gq0_02 = new gq0_0((bk_1)object2, n3, (Ref$ObjectRef)object4);
                ((Ref$ObjectRef)object4).element = object3 = ((K3)object3).d(string2, iq0_02, gq0_02);
                ((N3)object3).a(intent);
                ((pm_0)object).c();
            }
            ((pm_0)object).c();
        } else {
            object3 = this.b;
            if (object3 != null) {
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object4 = "fragmentWrapper";
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                int n4 = td0.b(object);
                if (n4 == 0) {
                    try {
                        intent = ((pm_0)object).c;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                n4 = ((pm_0)object).b();
                object2 = ((mw0_0)object3).a;
                if (object2 != null) {
                    ((Fragment)object2).startActivityForResult(intent, n4);
                } else {
                    object3 = ((mw0_0)object3).b;
                    if (object3 != null) {
                        object3.startActivityForResult(intent, n4);
                    }
                }
                ((pm_0)object).c();
            } else {
                object3 = this.a;
                if (object3 != null) {
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object4 = "activity";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    int n7 = td0.b(object);
                    if (n7 == 0) {
                        try {
                            intent = ((pm_0)object).c;
                        }
                        catch (Throwable throwable) {
                            td0.a(object, throwable);
                        }
                    }
                    n7 = ((pm_0)object).b();
                    object3.startActivityForResult(intent, n7);
                    ((pm_0)object).c();
                }
            }
        }
    }
}

