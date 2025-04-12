/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.PostDetailsModel;
import kotlin.jvm.internal.Intrinsics;

public final class Qw2$d
extends qw2_0 {
    public final PostDetailsModel a;

    public Qw2$d(PostDetailsModel postDetailsModel) {
        this.a = postDetailsModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Qw2$d;
        if (!bl3) {
            return false;
        }
        object = (Qw2$d)object;
        PostDetailsModel postDetailsModel = this.a;
        object = ((Qw2$d)object).a;
        boolean bl4 = Intrinsics.areEqual(postDetailsModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        PostDetailsModel postDetailsModel = this.a;
        if (postDetailsModel == null) {
            n3 = 0;
            postDetailsModel = null;
        } else {
            n3 = postDetailsModel.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(recentPostData=");
        PostDetailsModel postDetailsModel = this.a;
        stringBuilder.append(postDetailsModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

