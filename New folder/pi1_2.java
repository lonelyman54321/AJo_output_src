/*
 * Decompiled with CFR 0.152.
 */
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pi1
 */
public final class pi1_2
implements Runnable {
    public final /* synthetic */ wi1_2 a;
    public final /* synthetic */ InstallReferrerClient b;
    public final /* synthetic */ long c;

    public /* synthetic */ pi1_2(long l2, wi1_2 wi1_22, InstallReferrerClient installReferrerClient) {
        this.a = wi1_22;
        this.b = installReferrerClient;
        this.c = l2;
    }

    public final void run() {
        InstallReferrerClient installReferrerClient = this.b;
        long l2 = this.c;
        wi1_2 wi1_22 = this.a;
        Object object = "this$0";
        Intrinsics.checkNotNullParameter(wi1_22, (String)object);
        Intrinsics.checkNotNull(installReferrerClient);
        wi1_22.getClass();
        object = new xi1_2(l2, wi1_22, installReferrerClient);
        try {
            installReferrerClient.startConnection((InstallReferrerStateListener)object);
        }
        catch (Exception exception) {
            long l3 = System.currentTimeMillis();
            yn3$a yn3$a = yn3_0.a;
            String string2 = "InstallReferrerDeligate";
            yn3$a.l(string2);
            yn3$a.e(exception);
            float f5 = l3 -= l2;
            String string3 = "exception";
            qu3 qu32 = new qu3(null, null, false, string3, f5);
            wi1_22.a(qu32);
        }
    }
}

