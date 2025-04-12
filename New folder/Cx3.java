/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

public final class Cx3
implements Runnable {
    public final /* synthetic */ UserMetadata a;
    public final /* synthetic */ List b;

    public /* synthetic */ Cx3(UserMetadata userMetadata, List list) {
        this.a = userMetadata;
        this.b = list;
    }

    public final void run() {
        UserMetadata userMetadata = this.a;
        List list = this.b;
        UserMetadata.b(userMetadata, list);
    }
}

