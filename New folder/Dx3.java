/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Map;

public final class Dx3
implements Runnable {
    public final /* synthetic */ UserMetadata a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ List d;

    public /* synthetic */ Dx3(UserMetadata userMetadata, String string2, Map map2, List list) {
        this.a = userMetadata;
        this.b = string2;
        this.c = map2;
        this.d = list;
    }

    public final void run() {
        Map map2 = this.c;
        List list = this.d;
        UserMetadata userMetadata = this.a;
        String string2 = this.b;
        UserMetadata.c(userMetadata, string2, map2, list);
    }
}

