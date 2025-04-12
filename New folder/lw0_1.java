/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Lw0
 */
public final class lw0_1
implements SplitInstallStateUpdatedListener {
    public static final Lw0$a Companion;
    public static lw0_1 g;
    public final Context a;
    public SplitInstallManager b;
    public iw0_1 c;
    public final HashMap d;
    public final ArrayList e;
    public String f;

    static {
        Lw0$a lw0$a;
        Companion = lw0$a = new Object();
    }

    public lw0_1(ContextWrapper object) {
        this.a = object;
        this.d = object;
        super();
        this.e = object;
        this.f = "";
    }

    public final void a(String object, iw0_1 object2, Bundle object3) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(object2, "callback");
        Object object4 = this.b;
        if (object4 == null) {
            object4 = SplitInstallManagerFactory.create(this.a);
            this.b = object4;
            if (object4 != null) {
                object4.registerListener(this);
            }
        }
        this.c = object2;
        object2.initProgress();
        if (object3 != null) {
            object2 = this.d;
            ((HashMap)object2).put(object, object3);
        }
        if ((object2 = this.b) != null) {
            object3 = object2.getInstalledModules();
            int n3 = (int)(object3.contains(object) ? 1 : 0);
            if (n3 != 0) {
                this.b((String)object, true);
                return;
            }
            object3 = SplitInstallRequest.newBuilder().addModule((String)object).build();
            Intrinsics.checkNotNullExpressionValue(object3, "build(...)");
            int n4 = R$string.dynamic_feature_subtext;
            object4 = hv3_0.K(n4);
            iw0_1 iw0_12 = this.c;
            if (iw0_12 != null) {
                iw0_12.showProgress((String)object4);
            }
            this.f = object;
            object = object2.startInstall((SplitInstallRequest)object3);
            n3 = 1;
            object2 = new zl_2(this, n3);
            n4 = 0;
            object4 = null;
            object3 = new jw0_1(0, (Function1)object2);
            object = ((Task)object).addOnSuccessListener((OnSuccessListener)object3);
            object2 = new kw0_0(this);
            ((Task)object).addOnFailureListener((OnFailureListener)object2);
        }
    }

    public final void b(String string2, boolean bl2) {
        if (bl2) {
            Object object;
            Object object2 = this.c;
            if (object2 != null) {
                object2.dismissProgress();
            }
            if ((object = ((HashMap)(object2 = this.d)).get(string2)) != null) {
                ((HashMap)object2).remove(string2);
                object2 = this.c;
                if (object2 != null) {
                    object = (Bundle)object;
                    object2.launchFeature(string2, (Bundle)object);
                }
            } else {
                object2 = this.c;
                if (object2 != null) {
                    object = null;
                    object2.launchFeature(string2, null);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void onStateUpdate(Object object) {
        int n3;
        object = (SplitInstallSessionState)object;
        Intrinsics.checkNotNullParameter(object, "state");
        Object object2 = ((SplitInstallSessionState)object).moduleNames();
        if (object2 != null) {
            int bl2 = object2.size();
            object2 = bl2;
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        boolean bl3 = ((Integer)object2).intValue();
        boolean bl4 = true;
        if (bl3 > bl4) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            object2 = null;
        }
        Object object3 = ((SplitInstallSessionState)object).moduleNames();
        Object object4 = "moduleNames(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = ((Iterable)object3).iterator();
        while ((n3 = object3.hasNext()) != 0) {
            void var3_9;
            Object object5;
            int n4;
            object4 = (String)object3.next();
            int n7 = ((SplitInstallSessionState)object).status();
            if (n7 != (n4 = 2)) {
                n4 = 8;
                if (n7 != n4) {
                    n4 = 4;
                    if (n7 != n4) {
                        n4 = 5;
                        if (n7 != n4) {
                            n4 = 6;
                            if (n7 != n4) continue;
                            object5 = AnalyticsManager.Companion;
                            GTMEvents gTMEvents = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
                            String string2 = "Dynamic Module Missing ";
                            String string3 = kp1_0.c(string2, (String)object4);
                            String string4 = av_0.a((AnalyticsManager$Companion)object5);
                            int n8 = 8;
                            String string5 = "Download Failed";
                            GTMEvents.pushServiceErrorEvent$default(gTMEvents, string5, string3, string4, null, n8, null);
                            if (var3_9 != false || (object4 = this.c) == null) continue;
                            object4.dismissProgress();
                            continue;
                        }
                        object5 = this.f;
                        n7 = (int)(kotlin.text.b.i((String)object5, (String)object4, bl4) ? 1 : 0);
                        if (n7) {
                            this.f = object5 = "";
                            Intrinsics.checkNotNull(object4);
                            this.b((String)object4, bl4);
                            continue;
                        }
                        Intrinsics.checkNotNull(object4);
                        n7 = var3_9 ^ true;
                        this.b((String)object4, n7 != 0);
                        continue;
                    }
                    if (var3_9 != false) continue;
                    n3 = R$string.dynamic_feature_subtext;
                    object4 = hv3_0.K(n3);
                    object5 = this.c;
                    if (object5 == null) continue;
                    object5.showProgress((String)object4);
                    continue;
                }
                object4 = this.c;
                if (object4 == null) continue;
                object5 = this.b;
                object4.onDownloadConfirmation((SplitInstallManager)object5, (SplitInstallSessionState)object);
                continue;
            }
            if (var3_9 != false) continue;
            n3 = R$string.dynamic_feature_subtext;
            object4 = hv3_0.K(n3);
            object5 = this.c;
            if (object5 == null) continue;
            object5.showProgress((String)object4);
        }
    }
}

