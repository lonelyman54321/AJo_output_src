/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class tA1 {
    public final AccessToken a;
    public final AuthenticationToken b;
    public final Set c;
    public final Set d;

    public tA1(AccessToken accessToken, AuthenticationToken authenticationToken, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(linkedHashSet, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(linkedHashSet2, "recentlyDeniedPermissions");
        this.a = accessToken;
        this.b = authenticationToken;
        this.c = linkedHashSet;
        this.d = linkedHashSet2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof tA1;
        if (!bl3) {
            return false;
        }
        object = (tA1)object;
        Object object2 = this.a;
        Object object3 = ((tA1)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((tA1)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((tA1)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object = ((tA1)object).d;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        AccessToken accessToken = this.a;
        int n4 = accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.b;
        if (authenticationToken == null) {
            n3 = 0;
            authenticationToken = null;
        } else {
            n3 = authenticationToken.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (((Object)this.c).hashCode() + n4) * 31;
        return ((Object)this.d).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoginResult(accessToken=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", authenticationToken=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", recentlyGrantedPermissions=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", recentlyDeniedPermissions=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

