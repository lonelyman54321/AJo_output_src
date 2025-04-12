/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

public final class Ex3
implements Runnable {
    public final /* synthetic */ UserMetadata a;

    public /* synthetic */ Ex3(UserMetadata userMetadata) {
        this.a = userMetadata;
    }

    public final void run() {
        UserMetadata.a(this.a);
    }
}

